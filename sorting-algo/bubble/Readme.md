# Bubble Sort Algorithm

## Overview
Bubble sort algorithm is a sorting algorithm where in an array, we take the highest value to the highest index position by comparing with the next value in every step.In every comparision if the previous value is greater than the next value then we swap both compared item. After every step, the item in the previous step got into the sorted position get rid from the comparision loop, because it is already in the sorted position, no need to compare again.

## Pseudo code
```
for each i(item) in array till before last item:
    for each j(item) in array till before i+1 item:
        if array[j] > array[j+1]:
            temp = array[j]
            array[j] = array[j+1]
            array[j+1] = temp
```

## Time Complexity

- `outer loop`: since the outer loop run no of (array length - 1) time, so the time complexity of outer loop is `T1 = O(n)`.
- `inner loop`: since the inner loop run no of (array length - 1 - i) times, so the time complexity of inner loop is `T2 = O(n)`.

- *Total Time complexity*: `T = T1 * T2 = O(n) * O(n) = O(n^2)`
