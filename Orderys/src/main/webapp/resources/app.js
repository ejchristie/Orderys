var orderysApp = angular.module('orderysApp', ['ngRoute']);

// View routing w/ ngRoute
orderysApp.config(function($routeProvider) {
  $routeProvider
    .when('/customer', {
      templateUrl: '/Orderys/resources/templates/customer-view.html',
      controller: 'cHomeController'//,
      // resolve: {}
    })
    .when('/menu/:businessId', {
      templateUrl: '/Orderys/resources/templates/restaurant-menu.html',
      controller: 'menuController'//,
      // resolve: {}
    })
    .when('/employee', {
      templateUrl: '/Orderys/resources/templates/employee-view.html',
      controller: 'ePageController'//,
      // resolve: {}
    })
    .when('/manager', {
      templateUrl: '/Orderys/resources/templates/manager-view.html',
      controller: 'mPageController'//,
      // resolve: {}
    })
    .when('/profile', {
      templateUrl: '/Orderys/resources/templates/profile.html',
      controller: 'profileController'//,
      // resolve: {}
    })
    .otherwise({
      redirectTo: '/customer'
    });
});

// var demoData = {
//   "exampleCustomer": {
//     "id": 1,
//     "email": "customer@email.com",
//     "firstname": "Custo",
//     "lastname": "One",
//     "role": "CUSTOMER",
//     "orders": [],
//     "ratings": []
//   },
//   "exampleEmployee": {
//     "id": 2,
//     "email": "employee@email.com",
//     "firstname": "Emplo",
//     "lastname": "Du",
//     "role": "EMPLOYEE",
//     "orders": [],
//     "ratings": [],
//     "stations": []
//   },
//   "exampleManager": {
//     "id": 3,
//     "email": "manager@email.com",
//     "firstname": "Tre",
//     "lastname": "Manag",
//     "role": "MANAGER",
//     "orders": [],
//     "ratings": [],
//     "stations": [],
//     "business": {}
//   },
//   "exampleBusiness": {
//     "id": 1,
//     "name": "",
//     "manager": {},
//     "streetAddress1": "",
//     "streetAddress2": "",
//     "city": "",
//     "state": "",
//     "country": "",
//     "zip": "",
//     "stations": []
//   },
//   "exampleStation": {
//     "id": 1,
//     "business": {},
//     "name": "",
//     "employees": []
//   },
//   "exampleProducts": [{
//     "id": 1,
//     "station": {},
//     "name": "",
//     "price": 12.00,
//     "description": "",
//     "intendedCompletionTime": "???",
//     "imageUrl": "",
//     "ratings": []
//   }],
//   "exampleOrder": {
//     "id": 1,
//     "customer": {},
//     "paymentMethod": "?? paypal ??",
//     "items": []
//   },
//   "exampleOrderItem": {
//     "order": {"???": "???"},
//     "product": {},
//     "note": "customization and stuff? this is set by the customer",
//     "quantity": 5,
//     "timePlaced": "???",
//     "timeCompleted": "???",
//     "completedBy": {
//       "id": 2,
//       "email": "employee@email.com",
//       "firstname": "Emplo",
//       "lastname": "Du",
//       "role": "EMPLOYEE",
//       "orders": [],
//       "ratings": [],
//       "stations": []
//     },
//     "status": "FULFILLED"
//   },
//   "exampleRating": {
//     "customer": {},
//     "product": {},
//     "rating": 4
//   }
// };