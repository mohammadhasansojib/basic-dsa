var count = 2;
console.log(0);
console.log(1);
function fibo(x, y) {
    var num1 = x;
    var num2 = y;
    var fibonacci = num1 + num2;
    console.log(fibonacci);
    count++;
    if (count > 10) {
        return;
    }
    fibo(y, fibonacci);
}
fibo(0, 1);
