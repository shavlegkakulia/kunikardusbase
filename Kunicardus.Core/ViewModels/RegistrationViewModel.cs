﻿using System;
using System.Windows.Input;
using MvvmCross.Core.ViewModels;
using MvvmCross;
using Kunicardus.Core.Services.Abstract;
using System.Threading.Tasks;
using System.Text.RegularExpressions;
using MvvmCross.Platform;

namespace Kunicardus.Core
{
	public class RegistrationViewModel : BaseViewModel
	{
		#region Private Variables

		private IUserService _userService;

		#endregion

		#region Constructor Implementation

		public RegistrationViewModel (IUserService userService)
		{
			_userService = userService;

			#if DEBUG
			_password = "qweqwe123";
			_confirmPassword = "qweqwe123";
			_email = "damteste@oxero.aq";
			_name = "test";
			_idNumber = "12345678910";
			_dateOfBirth = DateTime.Now;
			_surName = "testSurname";
			_phoneNumber = "599252120";
			#endif
		}

		#endregion

		#region Properties

		private string _name;

		public string Name {
			get { return _name; }
			set {
				_name = value;
				RaisePropertyChanged (() => Name);
			}
		}

		private string _surName;

		public string Surname {
			get { return _surName; }
			set {
				_surName = value;
				RaisePropertyChanged (() => Surname);
			}
		}

		private string _idNumber;

		public string IdNumber {
			get { return _idNumber; }
			set {
				_idNumber = value;
				RaisePropertyChanged (() => IdNumber);
			}
		}

		private DateTime? _dateOfBirth;

		public DateTime? DateOfBirth {
			get { return _dateOfBirth; }
			set {
				_dateOfBirth = value;
				RaisePropertyChanged (() => DateOfBirth);
			}
		}

		private string _phoneNumber;

		public string PhoneNumber {
			get { return _phoneNumber; }
			set {
				_phoneNumber = value;
				RaisePropertyChanged (() => PhoneNumber);
			}
		}

		private string _email;

		public string Email {
			get { return _email; }
			set {
				_email = value;
				RaisePropertyChanged (() => Email);
			}
		}

		private string _password;

		public string Password {
			get { return _password; }
			set {
				_password = value;
				RaisePropertyChanged (() => Password);
			}
		}

		private string _confirmPassword;

		public string ConfirmPassword {
			get{ return _confirmPassword; }
			set {
				_confirmPassword = value;
				RaisePropertyChanged (() => ConfirmPassword);
			}
		}

		private ICommand _registerUserCommand;

		public ICommand RegisterUserCommand {
			get {
				_registerUserCommand = _registerUserCommand ?? new MvxCommand (RegisterUser); 
				return _registerUserCommand;
			}
		}

		private bool _validationStatus;

		public bool ValidationStatus {
			get{ return _validationStatus; }
			set { _validationStatus = value; }
		}

		private string _userUnicardNumber;

		public string UserUnicardNumber {
			get{ return _userUnicardNumber; }
			set { _userUnicardNumber = value; }
		}

		private bool _userExists;

		public bool UserExists {
			get{ return _userExists; }
			set { 
				_userExists = value; 
				RaisePropertyChanged (() => UserExists);
			}
		}

		private bool _registerInProgress;

		public bool RegisterInProgress {
			get{ return _registerInProgress; }
			set { 
				_registerInProgress = value;
			}
		}

		#endregion

		#region Methods

		private void RegisterUser ()
		{
			if (!RegisterInProgress) {
				RegisterInProgress = true;
				ShouldValidateModel = true;
				string validationResult = Validation ();

				if (string.IsNullOrWhiteSpace (validationResult)) {
					_validationStatus = true;
					Task.Run (async () => {
						InvokeOnMainThread (() => _dialog.ShowProgressDialog (ApplicationStrings.Loading));
						var userExistsService = await _userService.UserExists (_email);
						if (!userExistsService.Result.Exists) {
							UserExists = false;
							Mvx.IocConstruct<SMSVerificationViewModel> ();
						} else {
							InvokeOnMainThread (() => _dialog.ShowToast (ApplicationStrings.UserExists));
							UserExists = true;
						}
						InvokeOnMainThread (() => _dialog.DismissProgressDialog ());
					});
				} else {
					InvokeOnMainThread (() => {
						_dialog.ShowToast (validationResult);
					});
					_validationStatus = false;
				}
			}
		}

		#endregion

		#region Validation Methods

		private string PasswordValidation ()
		{
			string errorText = "";
			
			if (!string.IsNullOrWhiteSpace (_password)) {
				Match ifNumber = Regex.Match (_password, @"\d+");
				Match ifCharacter = Regex.Match (_password, @"[a-zA-Z]");
				if (_password.Length < 8)
					errorText = "პაროლის სიგრძე უნდა აღემატებოდეს 8 სიმბოლოს";
				else if (ifNumber.Value == "")
					errorText = "პაროლში აუცილებელია 1 რიცხვი მაინც";
				else if (ifCharacter.Value == "")
					errorText = "პაროლში აუცილებელია 1 ლათინური ასო მაინც";
			}
			return errorText;
		}

		private string Validation ()
		{
			string passValidation = PasswordValidation ();
			string errorText = "";
			if (string.IsNullOrWhiteSpace (_name))
				errorText = "შეიყვანეთ თქვენი სახელი";
			else if (string.IsNullOrWhiteSpace (_surName))
				errorText = "შეიყვანეთ თქვენი გვარი";
			else if (string.IsNullOrWhiteSpace (_idNumber) || _idNumber.Length != 11)
				errorText = "შეიყვანეთ პირადი ნომერი სწორი ფორმატით";
			else if (!_dateOfBirth.HasValue)
				errorText = "შეიყვანეთ დაბადების თარიღი";
			else if (string.IsNullOrWhiteSpace (_email))
				errorText = "შეიყვანეთ იმეილი";
			else if (string.IsNullOrWhiteSpace (_phoneNumber) || _phoneNumber.Length != 9)
				errorText = "შეიყვანეთ ტელეფონის ნომერი სწორი ფორმატით: 5xx xx xx xx";
			else if (!string.IsNullOrWhiteSpace (passValidation)) {
				errorText = passValidation;
			} else if (string.IsNullOrWhiteSpace (_password) || _password != _confirmPassword)
				errorText = "პაროლები ერთმანეთს არ ემთხვევა";
			else {
				Regex regex = new Regex (@"^([\w\.\-]+)@([\w\-]+)((\.(\w){2,3})+)$");
				Match match = regex.Match (_email);
				if (!match.Success)
					errorText = "შეიყვანეთ მეილი სწორი ფორმატით";
			}
			return errorText;
		}

		#endregion
	}
}
