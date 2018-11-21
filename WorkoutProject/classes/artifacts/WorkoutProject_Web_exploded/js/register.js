$().ready(function() {
    $('#registration,#settings').validate({
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
        }
    });

    //make ajax call and add into table.


    $("#settings").on('submit', function(e) {
        var isvalid = $("#settings").valid();
        if (isvalid) {
            e.preventDefault();
            addToTable();
        }
    });

    var count = 1;
    var settingList = [];
    function addToTable(){
        var obj;
        var liftName = $("#liftName").val();
        var sets = $("#sets").val();
        var reps = $("#reps").val();
        var weight = $("#weight").val();
        var progress = $("#progress").val();
        var markup = '<tr><th scope="row">'+(count++)+'</th><td>'+liftName+'</td><td>'+sets+'</td><td>'+reps+'</td><td>'+weight+'</td><td>'+progress+'</td></tr>';
        $("table tbody").append(markup);
        resetFields();
        obj = {"liftName": liftName,"sets": sets,"reps": reps,"weight": weight,"progress": progress};
        settingList.push(obj);
    }
    function resetFields() {
       $("#liftName").val('');
       $("#sets").val('');
       $("#reps").val('');
       $("#weight").val('');
       $("#progress").val('');
        $("#liftName").focus();
    }

    $("#toSubmit").on('submit', function(e) {
        var jsonObj = JSON.stringify(settingList);
        $.post( "/settings",{settings: jsonObj})
            .done(function() {
                alert( "second success" );
            })
            .fail(function() {
                alert( "error" );
            })
            .always(function() {
                alert( "finished" );
            });
        /*for (var i = 0; i < settingList.length; i++) {
            alert(settingList[i].liftName);
            //Do something
        }*/
        //alert(a);
        //e.preventDefault();
    });

})
