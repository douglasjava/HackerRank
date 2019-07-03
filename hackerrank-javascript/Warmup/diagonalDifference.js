function diagonalDifference(arr) {
    
    let sumOne = 0;
    let sumTwo = 0;
    let size = arr.length;

    for(i = 0; i < size; i++){
        sumOne += arr[i][i];
        sumTwo += arr[i][size - i - 1];
    }

    return Math.abs( sumOne - sumTwo );
}

function runDiagonalDifference() {
    
    let arr = [ [11, 2, 4], [4, 5, 6,], [10, 8, -12] ];

    const result = diagonalDifference(arr);

    console.log(result);
    alert(result);
}