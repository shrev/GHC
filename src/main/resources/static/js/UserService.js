'use strict'
angular.module('demo.services', []).factory('UserService', ["$http", "CONSTANTS", function($http, CONSTANTS) {
    var service = {};
    service.getUserIdByName = function(userName) {
        var url = CONSTANTS.getUseIdUrl;
        return $http.get(url);
    }
    service.registerUser = function(userDto) {
        return $http.post(CONSTANTS.registerUser, userDto);
    }
    return service;
}]);