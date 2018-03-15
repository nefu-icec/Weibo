$(document).ready(function () {
    // noinspection JSAnnotator
    $("#btn").click({
        var name = $("#name").val();
         var key = $("#key").val();
        AdminManager.login(name, key, function (data) {
            if (data) {
                location.href = "main.html";
            }
            else {
                alert("密码错误！");
            }
        });
    });
});


