<%@include file="header.jsp" %>
<div class="container form-contianer">
    <h1>Register</h1>
    <form method="post" class="form-horizontal" id="registration">
        <div class="form-group">
                <input type="text" name="userName" id="userName" class="form-field" placeholder="User Name" />
        </div>
            <div class=" form-group">
                <input type="password" name="password" id="password" class="form-field" placeholder="Password" />
        </div>
        <div class="form-group">
                <input type="password" name="confirmPassword" id="confirmPassword" class="form-field" placeholder="Confirm Password" />
        </div>
        <div class="form-group">
                <input type="submit" name="submit" id="submit" value="Register" class="btn form-btn"/>
        </div>
    </form>
</div>

<%@include file="footer.jsp" %>