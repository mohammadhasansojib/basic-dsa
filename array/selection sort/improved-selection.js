var arr = [5, 4, 3, 2, 1];
console.log(arr);
for (var i = 0; i < arr.length - 1; i++) {
    var minInd = i;
    for (var j = i; j < arr.length; j++) {
        if (arr[minInd] > arr[j]) {
            minInd = j;
        }
    }
    var temp = arr[minInd];
    arr[minInd] = arr[i];
    arr[i] = temp;
}
console.log(arr);
