﻿using System;
using System.Collections.Generic;
using Kuni.Core.Models;
using System.Windows.Input;
using MvvmCross.ViewModels;
using MvvmCross;
using Kuni.Core.Services.Abstract;
using System.Threading.Tasks;
using Kuni.Core.Models.DB;
using Newtonsoft.Json;
using Kuni.Core.Providers.LocalDBProvider;
using System.Linq;

namespace Kuni.Core.ViewModels.iOSSpecific
{
	public class iCatalogDetailViewModel : BaseViewModel
	{
		#region Private Variables

		IProductsService _productService;
		ILocalDbProvider _dbProvider;

		#endregion

		#region Constructor Implementation

		public iCatalogDetailViewModel (IProductsService productService, ILocalDbProvider dbProvider)
		{			
			_productService = productService;
			_dbProvider = dbProvider;
		}

		public void Init (int productId)
		{
			this.ProductId = productId;
			PopulateProductData ();
		}

		#endregion

		#region Properties

		private int _productId;

		public int ProductId {
			get{ return _productId; }
			set {
				_productId = value; 
				RaisePropertyChanged (() => ProductId);
			}
		}

		private int _imageCount;

		public int ImageCount {
			get{ return _imageCount; }
			set {
				_imageCount = _imageUrls.Count;
				RaisePropertyChanged (() => ImageCount);
				ImageCountName = string.Format ("{0} სურათი", _imageCount);
			}
		}

		private string _imageCountName;

		public string ImageCountName {
			get {
				return _imageCountName;
			}
			set {
				_imageCountName = value;
				RaisePropertyChanged (() => ImageCountName);
			}
		}

		private List<string> _imageUrls;

		public List<string> ImageUrls {
			get { return _imageUrls; }
			set {
				_imageUrls = value; 
				RaisePropertyChanged (() => ImageUrls);
			}
		}

		private string _currentImageUrl;

		public string CurrentImageUrl {
			get{ return _currentImageUrl; }
			set {
				_currentImageUrl = value;
				RaisePropertyChanged (() => CurrentImageUrl);
			}
		}

		private int _productTypeId;

		public int ProductTypeID { 
			get{ return _productTypeId; } 
			set {
				_productTypeId = value;
				RaisePropertyChanged (() => ProductTypeID);
			}
		}

		private string _productName;

		public string ProductName { 
			get{ return _productName; } 
			set {
				_productName = value;
				RaisePropertyChanged (() => ProductName);
			}
		}

		private string _productDesctiption;

		public string ProductDescription { 
			get{ return _productDesctiption; } 
			set {
				_productDesctiption = value;
				RaisePropertyChanged (() => ProductDescription);
			}
		}

		private int _productPrice;

		public int ProductPrice { 
			get{ return _productPrice; } 
			set {
				_productPrice = value;
				RaisePropertyChanged (() => ProductPrice);
			}
		}

		private string _catalogID;

		public string CatalogID { 
			get{ return _catalogID; } 
			set {
				_catalogID = value;
				RaisePropertyChanged (() => CatalogID);
			}
		}

		private int _productDiscountPercent;

		public int ProductDiscountPercent { 
			get{ return _productDiscountPercent; } 
			set {
				_productDiscountPercent = value;
				RaisePropertyChanged (() => ProductDiscountPercent);
			}
		}

		private bool _discountVisibility;

		public bool DiscountVisibility { 
			get{ return _discountVisibility; } 
			set {
				_discountVisibility = value;
				RaisePropertyChanged (() => DiscountVisibility);
			}
		}

		private List<DiscountModel> _userDiscounts;

		public List<DiscountModel> UserDiscounts { 
			get{ return _userDiscounts; }
			set {
				_userDiscounts = value;
				RaisePropertyChanged (() => UserDiscounts);
			}
		}

		private int _productOldPrice;

		public int ProductOldPrice { 
			get{ return _productOldPrice; } 
			set {
				_productOldPrice = value;
				RaisePropertyChanged (() => ProductOldPrice);
			}
		}

		private List<DeliveryMethod> _deliveryMethods;

		public  List<DeliveryMethod> DeliveryMethods { 
			get{ return _deliveryMethods; } 
			set {
				_deliveryMethods = value;
				RaisePropertyChanged (() => DeliveryMethods);
			}
		}

		#endregion

		#region Methods

		public void GoToBuyProduct (DeliveryMethod deliveryMethod)
		{
			NavigationCommand<iBuyProductViewModel> (new {
				currentImageUrl = _currentImageUrl,
				productName = _productName,
				productID = _productId,
				productPrice = _productPrice,
				deliveryMethodId = deliveryMethod.DeliveryMethodId,
				productTypeID = _productTypeId,
				note = deliveryMethod.Note,
				discounts = JsonConvert.SerializeObject (_userDiscounts)
			});
		}

		private void PopulateProductData ()
		{
			InvokeOnMainThread (() => {
				_dialog.ShowProgressDialog (ApplicationStrings.Loading);
			});
			Task.Run (async() => {			
				UserInfo currentUser = _dbProvider.Get<UserInfo> ().FirstOrDefault ();	
				var productInfo = await _productService.GetProductByID (ProductId, int.Parse (currentUser.UserId));
				InvokeOnMainThread (() => {
					_dialog.DismissProgressDialog ();
				});
				if (productInfo.Success) {
					if (productInfo.Result != null) {
						this.ProductName = productInfo.Result.ProductName;
						if (productInfo.Result.ProductImages.Count != 0)
							this.CurrentImageUrl = productInfo.Result.ProductImages [0];
						this.ProductTypeID = productInfo.Result.ProductTypeID;
						this.ProductPrice = productInfo.Result.DiscountedPrice;
						this.ProductDiscountPercent = productInfo.Result.DiscountedPercent;
						this.ImageUrls = productInfo.Result.ProductImages;
						this.ImageCount = ImageUrls.Count;
						this.ProductDescription = productInfo.Result.PoductDescription;
						this.ProductOldPrice = productInfo.Result.ProductPrice;
						this.CatalogID = productInfo.Result.CatalogID;
						this.DeliveryMethods = productInfo.Result.DeliveryMethods;
						this.UserDiscounts = productInfo.Result.UserDiscounts;	
					}
				} else {
					if (!string.IsNullOrWhiteSpace (productInfo.DisplayMessage)) {
						InvokeOnMainThread (() => {
							_dialog.ShowToast (productInfo.DisplayMessage);
						});
					}
				}

			});
		}

		#endregion
	}
}

