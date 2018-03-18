var pageSize = 10;

$(document).ready(function () {

    checkAdminSession(function () {

    });
    searchWeibo("2010-10-11", "2010-10-12", 1);
    $("#search").click(function () {
        $("#weibos").mengularClear();
        var start = $("#start").val();
        var end = $("#end").val();
        searchWeibo(start, end, 1);
    });
});

function searchWeibo(start, end, page) {
    WeiboManager.getSearchCount(start, end, function (result) {
        if (!result.session) {
            sessionError();
            return;
        }
        var count = result.data
        $("#page-size").text(pageSize);

        $("#page-count").text(count);
        $("#page-nav ul").empty();
        for (var i = 1; i < Math.ceil(count / pageSize + 1); i++) {
            var li = $("<li>").append($("<a>").attr("href", "javascript:void(0)").text(i));
            if (page == i) {
                li.addClass("active");
            }
            $("#page-nav ul").append(li);
        }

        $("#page-nav ul li").each(function (index) {
            $(this).click(function () {
                $("#weibos").mengularClear();
                searchWeibo(start, end, index + 1);
                $("html, body").animate({
                    scrollTop: 0
                }, 300);
            });
        });
    });

    WeiboManager.search(start, end, page, pageSize, function (result) {
        if (!result.session) {
            sessionError();
            return;
        }
        for (var i in result.data) {
            var weibo = result.data[i];
            $("#weibos").mengular(".weibo-template", {
                weiboid: weibo.weiboid,
                time: weibo.time.format(DATE_HOUR_MINUTE_SECOND_FORMAT),
                device: weibo.device,
                content: weibo.content,
                comment: weibo.comment,
                attu: weibo.attu,
                userName: weibo.userName
            });
        }
    });

}