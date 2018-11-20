$().ready(function () {
    $('#registration').validate({
        rules: {
            userName:{
                required: true,
                minlength: 2
            },
            password:{
                required: true,
                minlength: 5
            },
            confirmPassword:{
                required: true,
                minlength: 5,
                equalTo: "#password"
            }

        },
        messages:{
            userName: {
                required: "Please enter user name.",
                minlength: "User name must be at least 2 character long."
            },
            password: {
                required: "Please provide passowrd.",
                minlength: "Password must be at least 5 character long."
            },
            confirmPassword: {
                required: "Please provide Confirm passowrd.",
                minlength: "Confirm password must be at least 5 character long.",
                equalTo: "Please enter same password as above."
            }
        }
    })
})