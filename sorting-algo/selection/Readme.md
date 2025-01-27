# Selection Sort Algorithm

## Overview
Selection sort algorithm sorts an array by traversing the array in every step, find the smallest element & swap it with first index of unsorted part. In selection sort we consider an array in two parts sorted & unsorted part. We find the smallest element from the unsorted part and we swap the smallest element position with the first position element of unsorted part.

## Pseudo code
```
swap(arr, l,s):
    temp = arr[l]
    arr[l] = arr[s]
    arr[s] = temp

for each i(item) of array expect last item:
    minIndex = i;
    for each j(item) of array except first i no of item:
        if arr[j] < arr[minIndex]:
            minIndex = j
    swap(arr, i, minIndex);
```

## Time Complexity
- `outer loop`: Since the outer loop run (array length - 1) times, so the time complexity of outer loop is `T1 = O(n)`.
- `inner loop`: Since the inner loop run (array length - i) [here i is the counter of outer loop] times in every iteration of outer loop and i grow 1 in every iteration of outer loop, so the time complexity of inner loop is `T2 = O(n-i)`, here i is dependent, so `T2 = O(n)`.

- *Total Time Complexity: * `T = T1 * T2`,  `T = O(n^2)`
