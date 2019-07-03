function birthdayCakeCandles(arr) {

    let maxHeight = 0, frequency = 0;
    const size = arr.length;

    for (let i = 0; i < size; i++) {
        const valor = arr[i];

        if (valor > maxHeight) {
            maxHeight = valor;
            frequency = 1;

        } else if (valor == maxHeight) {
            frequency++;
        }

    }

    return {
        maxHeight, 
        frequency
    }

}

function runBirthdayCakeCandles() {

    const ar =  [ 3, 2, 1, 3 ];

    const result = birthdayCakeCandles(ar);

    console.log(result);
    alert(JSON.stringify(result));

}