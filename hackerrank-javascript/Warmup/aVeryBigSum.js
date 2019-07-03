function aVeryBigSum(ar) {

    let sum = 0;

    ar.map((map, index) => {
        sum += ar[index];
    })

    return sum;
}

function runAVeryBigSum() {

    let ar = [1000000001, 1000000002, 1000000003, 1000000004, 1000000005];

    const result = aVeryBigSum(ar);

    console.log(result);
    alert(result);

}