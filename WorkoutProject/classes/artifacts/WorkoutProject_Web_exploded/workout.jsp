<%@include file="WEB-INF/header.jsp" %>

<div class="content-container">
    <form id="workout">
        <c:forEach var="liftSetting" items="${user.setting.liftSettings}" varStatus="loop">
            <div class="row">
            <div id="${loop.index}">
                <label class="col-md-2">
                    <span class="lift-name">${liftSetting.name}</span>
                    <span>${liftSetting.weight}</span>
                </label>
                <div class="col-md-10">
                <c:forEach var="set" begin="1" end="${liftSetting.sets}">
                    <div class="workout-button col-md-1">
                    <button type="button" class="btn btn-secondary" name="${liftSetting.name}">${liftSetting.reps}</button>
                    </div>
                </c:forEach>
                </div>
            </div>
            </div>
        </c:forEach>
        <label></label>
        <div class="m-t-20">
        <input type="submit" class="btn form-btn width-200" name="submit" id="submit" value="Complete Workout" />
        </div>
    </form>
</div>

<%@include file="WEB-INF/footer.jsp" %>