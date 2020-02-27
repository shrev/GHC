'use strict'
var module = angular.module('demo.controllers', []);
module.controller("UserController", ["$scope", "UserService",
    function($scope, UserService) {
        $scope.userDto = {
            userName: null,
        };
        UserService.getUserIdByName($scope.userDto.userName).then(function(value) {
            console.log(value.data);
            return value.data;
        }, function(reason) {
            console.log("error occured");
        }, function(value) {
            console.log("no callback");
        });
        $scope.registerUser = function() {
            UserService.registerUser($scope.userDto).then(function() {
                console.log("works");
            }, function(reason) {
                console.log("error occured");
            }, function(value) {
                console.log("no callback");
            });
        }
    }
]);