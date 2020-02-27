'use strict'
var demoApp = angular.module('demo', ['ui.bootstrap', 'demo.controllers',
    'demo.services'
]);
demoApp.constant("CONSTANTS", {
    registerUser: "/user/registerUser",
    getUserIdByName: "/user/getUserId"
});