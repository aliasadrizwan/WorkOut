<%@include file="header.jsp" %>
<div class="container content-container">
    <div class="row">
        <div class="row text-center">
            <h2>Workout Settings</h2>
        </div>
        <div class="row">
            <label class="control-label col-md-2">Lift Name</label>
            <label class="control-label col-md-2">Sets</label>
            <label class="control-label col-md-2">Reps</label>
            <label class="control-label col-md-2">Weight</label>
            <label class="control-label col-md-2">Progress</label>

        </div>
        <div class="row">
            <input type="text" class="form-field  col-md-2 m-r" name="liftName" id="liftName" placeholder="Lift Name" />
            <input type="text" class="form-field  col-md-2 m-r" name="sets" id="sets" placeholder="No of Sets" />
            <input type="text" class="form-field  col-md-2 m-r" name="reps" id="reps" placeholder="Repetitions" />
            <input type="text" class="form-field  col-md-2 m-r" name="weight" id="weight" placeholder="Weight" />
            <input type="text" class="form-field  col-md-2 m-r" name="progress" id="progress" placeholder="Progress" />
            <button class="btn form-btn col-md-1 m-r width-100" name="add" id="add"><span class="glyphicon glyphicon-plus"></span>Add</button>
        </div>
        <div class="col-sm-8">

            <h4>Lorem ipsum..</h4>
            <p>Lorem ipsum..</p>
            <button class="btn btn-default btn-lg">Get in Touch</button>
        </div>
        <div class="col-sm-4">
            <span class="glyphicon glyphicon-signal logo"></span>
        </div>
    </div>
</div>
<%@include file="footer.jsp" %>