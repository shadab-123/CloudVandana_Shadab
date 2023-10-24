function closePopup() {
    document.getElementById('popup').style.display = 'none';
    document.getElementById('surveyForm').reset();
}

function resetForm() {
    document.getElementById('surveyForm').reset();
}

function submitForm(event) {
    event.preventDefault();
        document.getElementById('popup').style.display = 'block';
        var summary = '';
        var form = document.getElementById('surveyForm');
        for (var i = 0; i < form.elements.length-2; i++) {
            var element = form.elements[i];
            if (element.type !== 'button') {
                summary=summary+element.id+" : "+element.value+"<br />"
            }
        }
        document.getElementById('summary').innerHTML = summary;
}