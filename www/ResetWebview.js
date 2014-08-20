
    var exec = require('cordova/exec');

        module.exports = {

        reset: function(success, fail){
            exec(success, fail, 'ResetWebview', 'reset', []);
        }
    };
