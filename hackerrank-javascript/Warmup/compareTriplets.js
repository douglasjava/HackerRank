function compareTriplets(a, b) {

    let aScore = 0;
    let bScore = 0;
    const size = a.length;
    const retorno = [];

    for (let i = 0; i < size; i++) {
        if (a[i] > b[i]) {
            aScore++;
        } else if (a[i] < b[i]) {
            bScore++;
        }
    }
    
    retorno[0]= aScore;
    retorno[1]= bScore;

    return retorno;

}

function runCompareTriplets() {

    let a = [17, 28, 30];
    let b = [99, 16, 8];

    let result = compareTriplets(a, b);

    console.log(result);
    alert(result);

}