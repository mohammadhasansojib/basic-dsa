# Merge Sort Algorithm

## Overview
Merge sort algorithm sort an array by divide & conqure. It divide the array recursively until the array has one element. Then those small arrays get merge & make a sorted array recursively.

## Pseudo Code
```
mergeSort(low, high, arr):
    if(low >= high):
        return

    mid = (low+high)/2

    mergeSort(low, mid, arr);
    mergeSort(mid+1, high, arr);

    merge(low, high, arr);

merge(low, high, arr):
    tempLength = (high-low)+1
    tempArr[tempLength]

    left = low
    mid = (low+high)/2
    right = mid+1

    q = 0
    while(left <= mid && right <= e):
        if arr[left] <= arr[right]:
            tempArr[q++] = arr[left++]
        else:
            tempArr[q++] = arr[right++]

    while(left <= mid):
        tempArr[q++] = arr[left++]
    while(right <= high):
        tempArr[q++] = arr[right++]

    q = 0
    for(i = low; i <= high; i+):
        arr[i] = tempArr[q++]
```

## Time Complexity
* `mergeSort`: Since in `mergeSort` function, the lenght of the array is dividing in half every recursion. So the time complexity of the `mergeSort` function if `T1 = O(log n)`.
* `merge`: Since in `merge` function, there are 4 loop running n times, so the time complexity of `merge` function is `T2 = O(4*n)`, `T2 = O(n)`.

* *Total Time Complexity*: `T = T1 * T2`, `T = O(log n) * O(n)`, `T = O(n log n)`.
