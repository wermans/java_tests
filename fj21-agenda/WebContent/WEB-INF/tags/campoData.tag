<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="id" required="true"%>

<element>
	<input type="text" id="${id}" name="${id}" />
	<script>
		$("#${id}").datepicker({dataFormat: 'dd/mm/yy'});
	</script>
</element>
