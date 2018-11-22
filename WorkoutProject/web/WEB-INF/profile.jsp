<%@include file="header.jsp" %>
<div class="container form-contianer">
    <h1>Create Profile</h1>
    <label class="error">${errorMessage}</label>
    <label class="alert-success">${successMessage}</label>
    <form method="post" class="form-horizontal" id="registration">
        <div class="form-group">
            <input type="text" name="email" id="email" class="form-field" placeholder="Email" />
        </div>
        <div class="form-group">
            <input type="text" name="weight" id="weight" class="form-field" placeholder="Weight" />
        </div>
        <div class="form-group">
            <input type="text" name="height" id="height" class="form-field" placeholder="Height" />
        </div>
        <div class="form-group">
            <input type="submit" name="submit" id="submit" value="Create" class="btn form-btn"/>
        </div>
    </form>
</div>

<%@include file="footer.jsp" %>
