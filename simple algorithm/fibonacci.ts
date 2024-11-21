let count: number = 2;
console.log(0);
console.log(1);

function fibo(x: number, y: number): void{
	let num1: number = x;
	let num2: number = y;
	
	let fibonacci: number = num1 + num2;
	console.log(fibonacci);
	count++;

	if(count > 10){
		return;
	}

	fibo(y, fibonacci);
}

fibo(0,1);
