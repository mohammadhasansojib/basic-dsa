let arr: number[] = [5,7,2,4,9,3];
console.log(arr);
let minInd: number;
for(let i: number = 0; i < arr.length-1; i++){
        minInd = i;
        for(let j: number = i; j < arr.length; j++){
                if(arr[minInd] > arr[j]){
                        minInd = j;
                }
        }
        arr.splice(i, 0, arr[minInd]);
        arr.splice(minInd+1, 1);
}
console.log(arr);
