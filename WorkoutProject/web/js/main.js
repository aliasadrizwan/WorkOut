$().ready(function() {

    // workout and registration validation
    $('#settings').validate({
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
            },
            liftName:{
                required: true,
            },
            sets:{
                required: true,
                number: true
            },
            reps:{
                required: true,
                number: true
            },
            progress:{
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
            },
            liftName:{
                required: "Please enter Lift name.",
                number: "Please enter a number."
            },
            sets:{
                required: "Please enter sets.",
                number: "Please enter a number."
            },
            reps:{
                required: "Please enter reps.",
                number: "Please enter a number."
            },
            progress:{
                required: "Please enter progress.",
                number: "Please enter a number."
            }
        },
        submitHandler: function(form) {
            $.post("/settings",
                {
                    "name": $("#liftName").val(),
                    "weight": $("#weight").val(),
                    "sets": $("#sets").val(),
                    "reps": $("#reps").val(),
                    "progress": $("#progress").val()
                })
                .done(addToTable)
                .fail(function () {
                    alert("ERROR: Error encountered while adding lift");
                });
        }
    });

    // Setting submission validation
    $("#toSubmit").validate({
        rules: {

        },
        messages: {

        },
        submitHandler: function(e) {
            $.post("/settings", {"rest" : $("#rest").val()})
                .done(function(){alert("done")})
                .fail(function(){alert("fail")});
        }
    });

    $("#registration").validate({
        rules: {

        },
        messages: {

        },
        submitHandler: function (e) {

        }
    });

    var count = 1;
    function addToTable(){
        var liftName = $("#liftName").val();
        var sets = $("#sets").val();
        var reps = $("#reps").val();
        var weight = $("#weight").val();
        var progress = $("#progress").val();
        var markup = '<tr><th scope="row">'+(count++)+'</th><td>'+liftName+'</td><td>'+weight+'</td><td>'+sets+'</td><td>'+reps+'</td><td>'+progress+'</td></tr>';
        $("table tbody").append(markup);
        resetFields();
    }
    function resetFields() {
       $("#liftName").val('');
       $("#sets").val('');
       $("#reps").val('');
       $("#weight").val('');
       $("#progress").val('');
        $("#liftName").focus();
    }
});
