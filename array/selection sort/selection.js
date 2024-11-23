var arr = [5, 7, 2, 4, 9, 3];
console.log(arr);
var minInd;
for (var i = 0; i < arr.length - 1; i++) {
    minInd = i;
    for (var j = i; j < arr.length; j++) {
        if (arr[minInd] > arr[j]) {
            minInd = j;
        }
    }
    arr.splice(i, 0, arr[minInd]);
    arr.splice(minInd + 1, 1);
}
console.log(arr);
