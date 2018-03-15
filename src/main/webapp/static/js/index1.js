$(document).ready(function () {
    WeiboManager.getAll(function (users) {
        console.log(users);
        new Vue({
            el: "#sum",
            data: {
                sum: users.length
            }
        });
        new Vue({
            el: "#shows",
            data: {
                shows: users
            }
        });
    });

});