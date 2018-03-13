$(document).ready(function () {
    UserManager.getAll(function (users) {
        new Vue({
            el: "#users",
            data: {
                users: users
            }
        });
    });
});