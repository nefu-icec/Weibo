$(document).ready(function () {
    UserManager.getAll(function (users) {
        var user = users[0];
        new Vue({
            el: "#users",
            data: {
                name: user.name,
                sex: user.sex,
                birthday: user.birthday,
                uid: user.uid
            }
        });
    });
});