function validateUserLogin() {
    var user = {
        nombre: $("#exampleInputEmail").val(),
        apellido: $("#exampleInputPassword").val()
    }
    var usuario = JSON.stringify(user);
    $.ajax({
            type: "POST",
            url: "http://localhost:8080/api/login",
            data: usuario,
            contentType: "application/json",
            success: function(result) {
                alert('ok');
            },
            error: function(result) {
                alert('error');
            }
        });
}