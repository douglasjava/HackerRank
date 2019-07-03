function miniMaxSum(arr) {

    let max = 0, min = Number.MAX_VALUE, sum = 0;
    const size = arr.length;

    for (let i = 0; i < size; i++) {
        for (let y = 0; y < size; y++) {
            if (y != i) {
                sum += arr[y];
            }
        }
        if (sum > max) {
            max = sum;
        }
        if (sum < min) {
            min = sum;
        }
        sum = 0;
    }

    return {
        min,
        max
    }

}

function runMiniMaxSum() {

    let arr = [ 1, 2, 3, 4, 5 ];

    const result = miniMaxSum(arr);

    console.log(result);
    alert(JSON.stringify(result));
}