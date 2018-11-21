<%@include file="header.jsp" %>
<div class="content-container">
    <form id="settings" method="post">
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
            <div class="col-md-2  m-r">
                <input type="text" class="form-field width-100p" name="liftName" id="liftName" placeholder="Lift Name" />
                <label class="error" for="liftName"></label>
            </div>
            <div class="col-md-2  m-r">
            <input type="text" class="form-field width-100p" name="sets" id="sets" placeholder="No of Sets" />
                <label class="error" for="sets"></label>

            </div>
            <div class="col-md-2  m-r">
            <input type="text" class="form-field width-100p" name="reps" id="reps" placeholder="Repetitions" />
                <label class="error" for="reps"></label>

            </div>
            <div class="col-md-2  m-r">
            <input type="text" class="form-field width-100p" name="weight" id="weight" placeholder="Weight" />
                <label class="error" for="weight"></label>
            </div>
            <div class="col-md-2  m-r">
            <input type="text" class="form-field width-100p" name="progress" id="progress" placeholder="Progress" />
                <label class="error" for="progress"></label>

            </div>
            <button type="submit" class="btn form-btn col-md-1 m-r width-100" name="add" id="add"><span class="glyphicon glyphicon-plus"></span>Add</button>
        </div>

    </div>
    </form>

    <table class="table table-hover" id="settingTable">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Lift Name</th>
            <th scope="col">Sets</th>
            <th scope="col">Repetitions</th>
            <th scope="col">Weight</th>
            <th scope="col">Progress</th>
        </tr>
        </thead>
        <tbody>

        </tbody>
    </table>
    <form id="toSubmit" method="post">
        <input type="submit" name="submit" id="submit" />
    </form>
</div>
<%@include file="footer.jsp" %>