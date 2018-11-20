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
            },
            email:{
                required: true,
                email: true
            },
            height:{
                required: true,
                number: true
            },
            weight:{
                required: true,
                number: true
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
            },
            email:{
                required: "Please enter email.",
                email: "Please enter valid email."
            },
            height:{
                required: "Please enter height.",
                number: "Please enter a number."
            },
            weight:{
                required: "Please enter weight.",
                number: "Please enter a number."
            }
        }
    })
})