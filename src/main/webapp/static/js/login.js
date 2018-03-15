$(document).ready(function () {
    $("#submit").click(function () {
        var username = $("#username").val();
        var password = $("#password").val();
        AdminManager.login(username, password, function (success) {
            if (!success) {
                alert("failed");
                return;
            }
            location.href = "main.html";
        });
    });
});