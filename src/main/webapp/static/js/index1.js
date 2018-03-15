$(document).ready(function () {
    WeiboManager.search("2010-10-10", "2010-10-11", 0, 0,function (data) {
        console.log(data.length);
        new Vue({
            el: "#sum",
            data: {
                sum: data.length
            }
        });
        new Vue({
            el: "#shows",
            data: {
                shows: data
            }
        });
    });
});