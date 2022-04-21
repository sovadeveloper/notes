console.log("notes.js успешно подключен!")

function addNote(){
    let title = document.getElementById("title").value;
    let text = tinymce.activeEditor.getContent();
    let data = {
        title: title,
        text: text
    }
    $.ajax({
        url: '/api/notes',
        type: 'POST',
        data: JSON.stringify(data),
        contentType: "application/json; charset=UTF-8",
        dataType: "json",
        success: function(result) {
            console.log("Заметка успешно добавлена")
            console.log(result)
            window.location.href = "/";
        },
        error: function (result){
            console.log("Ошибка")
            console.log(result);
        }
    });
}

function editNote(id){
    let title = document.getElementById("newTitle").value;
    let text = tinymce.activeEditor.getContent();
    let data = {
        id: id,
        title: title,
        text: text
    }
    $.ajax({
        url: '/api/notes/',
        type: 'PUT',
        data: JSON.stringify(data),
        contentType: "application/json; charset=UTF-8",
        dataType: "json",
        success: function(result) {
            console.log("Заметка успешно отредактирована")
            console.log(result)
            window.location.href = "/";
        },
        error: function (result){
            console.log("Ошибка")
            console.log(result);
        }
    });
}

function deleteNote(id){
    let data = {
        id: id
    }
    $.ajax({
        url: '/api/notes/' + id,
        type: 'DELETE',
        data: JSON.stringify(data),
        contentType: "application/json; charset=UTF-8",
        dataType: "json",
        success: function(result) {
            console.log("Заметка успешно удалена")
            console.log(result)
            window.location.href = "/";
        },
        error: function (result){
            console.log("Ошибка")
            console.log(result);
        }
    });
}

function getElementByXpath(path) {
    return document.evaluate(path, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;
}