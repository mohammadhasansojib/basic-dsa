let arr: number[] = [4,3,7,21,25,13,2];
console.log(arr);

let swapped: boolean;

for(let i = 0; i < arr.length - 1; i++){
	swapped = false;
	for(let j = 0; j < arr.length - i - 1; j++){
		if(arr[j] > arr[j+1]){
			let temp: number = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;

			swapped = true;
		}
	}
	if(!swapped){
		break;
	}
}

console.log("After Sorting: ");
console.log(arr);
