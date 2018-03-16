
$(document).ready(function () {
    UserManager.getAll(function (users) {
        new Vue({
            el: "#users",
            data: {
                users: users
            }
        });
    });
    WeiboManager.getAll(function (weibos) {
        new Vue({
            el: "#weibos",
            data: {
                weibos: weibos
            }


        });

    });


});
