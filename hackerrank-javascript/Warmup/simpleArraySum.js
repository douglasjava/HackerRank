function simpleArraySum(ar) {

    let valor = 0;
    for (let i = 0; i < ar.length; i++) {
        valor += ar[i];
    }
    return valor;

}

function runSimpleArraySum() {

    let arr = [1, 2, 3, 4, 10, 11];

    let res = simpleArraySum(arr);
    console.log(res);
    alert(res);
}
