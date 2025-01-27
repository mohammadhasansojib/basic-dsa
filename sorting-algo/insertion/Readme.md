# Insertion Sort Algorithm

## Overview
Insertion sort algorithm sort an array by comparing with the previous item, if the previous item is greater than that, then it swap the the item with previous item, the swaping will be continue until the item get inserted into the correct position. This process of inserting item into the correct position will happen until the item before last item get the correct position. If the item before last item get the correct position then the last item also get the correct position.

## Pseudo Code
```
for each (i)item of array except last item:
    for each (j)item of array except first i no of item:
        didSwap = 0
        if arr[j] > arr[j-1]:
            temp = arr[j]
            arr[j] = arr[j-1]
            arr[j-1] = temp
            didSwap = 1
        if didSwap == 0:
            break the loop

```

## Time Complexity
* `outer loop`: Since the outer loop run n-1 time, so Time complexity of outer loop is `T1 = O(n)`.
* `inner loop`: Since ther inner loop run from i to 1, Time complexity of inner loop is `T2 = O(n)`.

* *Total Time Complexity*: `T = T1 * T2`, `T = O(n^2)`.
