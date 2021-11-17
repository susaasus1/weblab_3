function clock() {
    let date = new Date(),
        year = (date.getFullYear()),
        month = (date.getMonth() < 10) ? '0' + (date.getMonth()+1) : date.getMonth()+1,
        day = date.getDate(),
        hours = (date.getHours() < 10) ? '0' + date.getHours() : date.getHours(),
        minutes = (date.getMinutes() < 10) ? '0' + date.getMinutes() : date.getMinutes(),
        seconds = (date.getSeconds() < 10) ? '0' + date.getSeconds() : date.getSeconds()

    document.getElementById('clock').innerText = hours + ':' + minutes + ':' + seconds +"\n"
        + day + '.' + month + '.' +year
}

setTimeout(clock, 0)
setInterval(clock, 11 * 1000)
