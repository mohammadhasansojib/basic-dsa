let arr: number[] = [5,4,3,2,1];
console.log(arr);

for(let i: number = 0; i < arr.length-1; i++){
        let minInd: number = i;
        for(let j: number = i; j < arr.length; j++){
                if(arr[minInd] > arr[j]){
                        minInd = j;
                }
        }
        let temp: number = arr[minInd];
        arr[minInd] = arr[i];
        arr[i] = temp;
}

console.log(arr);
