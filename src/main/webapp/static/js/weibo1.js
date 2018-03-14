$(document).ready(function () {
    WeiboManager.getAll(function (weibos) {
        new Vue({
            el: "#weibos",
            data: {
                weibos: weibos
            }
        });
    });
});
