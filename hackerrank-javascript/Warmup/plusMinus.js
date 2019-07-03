function plusMinus(arr) {

    const size = arr.length || 0;

    let countZero = 0, countPositive = 0, countNegative = 0;

    for(let i = 0; i < size; i++){

        let number = arr[i];

        countZero += number == 0 ? 1 : 0;
        countPositive += number > 0 ? 1 : 0;
        countNegative += number < 0 ? 1 : 0;

    }

    const resultPositive = (countPositive / size).toFixed(6);
    const resultNegative = (countNegative / size).toFixed(6);
    const resultZero = (countZero / size).toFixed(6);

    return {
        resultPositive,
        resultNegative,
        resultZero
    }


}

function runPlusMinus() {
    const arr = [-4, 3, -9, 0, 4, 1 ]
    const result  = plusMinus(arr);

    console.log(result);
    alert(JSON.stringify(result));
}