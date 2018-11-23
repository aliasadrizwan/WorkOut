$().ready(function() {

    // Setting validation
    $('#settings').validate({
        rules: {
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
                .done(success)
                .fail(function () {
                    alert("fail addLift");
                });
        }
    });

    // Setting submission validation
    $("#toSubmit").validate({
        rules: {
            rest:{
                required: true,
                number: true
            },
        },
        messages: {
            rest:{
                required: "Please enter rest time",
                number: "Please enter a number"
            },
        }
    });

    // register validation
    $("#registration").validate({
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
        messages: {
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
    });

    // login validation
    $("#login").validate({
        rules: {
            userName:{
                required: true,
            },
            password:{
                required: true,
            },
        },
        messages: {
            userName: {
                required: "Please enter user name.",
            },
            password: {
                required: "Please enter passowrd.",
            },
        }
    });

    var workoutStats = {};

    // workout button click
    $("#workout button").click(function() {
        var button = $(this);
        //var liftName = button.parent().children("label").children(".lift-name").text();
        var liftName = button.attr("name");
        if(button.hasClass("btn-danger")) {
            button.removeClass("btn-danger").addClass("btn-secondary");
            workoutStats[liftName] = false;
        }
        else if(button.hasClass("btn-success")) {
            button.removeClass("btn-success").addClass("btn-danger");
            workoutStats[liftName] = false;
        } else {
            // set color
            button.removeClass("btn-secondary").addClass("btn-success");
            workoutStats[liftName] = true;
        }

    });

    // workout submit form
    $("#workout").submit(function(e) {
        e.preventDefault();
/*        for(var i = 0; i < $(".lift-name").length; ++i) {
            var name = $("#" + i + " .lift-name").text();
            if($("#" + i + " .btn-secondary,.btn-danger").length) {
                workoutStats[name] = false;
            } else {
                workoutStats[name] = true;
            }
        }*/
        var obj = {};
        for(var i = 0; i < $(".lift-name").length; ++i) {
            //var current = $('#'+i+' button');
            $('#'+i+' button').each(function( index, element ) {
                // element == this
                var elementName = element.name;
                if(element.classList.contains('btn-danger') || element.classList.contains('btn-secondary')){
                    //workoutStats[elementName] = false;
                   obj = {name: elementName, value: false};
                    return false;
                }
                else{
                    obj = {name: elementName, value: true};
                }
            });
        }
        var str = JSON.stringify(obj);
        $.post("/workout",{"workout":str}).done(success).fail(failure);

        function success(data) {
            alert(data);
        }
        function failure() {
            alert("failure");
        }
    })
});


