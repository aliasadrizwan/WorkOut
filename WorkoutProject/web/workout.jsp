<%@include file="WEB-INF/header.jsp" %>

<div class="content-contianer workout">
    <form id="workout">
        <c:forEach var="liftSetting" items="${user.setting.liftSettings}" varStatus="loop">
            <div id="${loop.index}">
                <label>
                    <span class="lift-name">${liftSetting.name}</span>
                    <span>${liftSetting.weight}</span>
                </label>
                <c:forEach var="set" begin="1" end="${liftSetting.sets}">
                    <button type="button" class="btn btn-secondary">${liftSetting.reps}</button>
                </c:forEach>
            </div>

        </c:forEach>
        <label></label>
        <input type="submit" class="btn form-btn width-200" name="submit" id="submit" value="Complete Workout" />
    </form>
</div>

<%@include file="WEB-INF/footer.jsp" %>