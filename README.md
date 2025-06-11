# Sorting Algorithms in Java

This project implements and compares the performance of five sorting algorithms in Java:

- Insertion Sort
- Merge Sort
- Heap Sort
- Quick Sort
- Modified Quick Sort (Median-of-Three + Insertion Sort)

## Goal

To observe how sorting algorithms behave under different conditions and input sizes, specifically:
- Randomly generated data
- Already sorted data
- Reverse sorted data

## Input Sizes Tested

- 1,000
- 5,000
- 10,000
- 50,000
- 60,000
  
Each sorting algorithm runs 5 times per input size, and the average execution time is recorded.

## Special Features

- **Manual Max-Heap:** Heap Sort is implemented manually using `ArrayList`, without Java’s built-in `PriorityQueue`.
- **Random Pivot Selection:** Quick Sort selects pivots randomly to avoid worst-case performance on sorted data.
- **Modified Quick Sort:**
    - Uses Median-of-Three strategy for pivot selection.
    - Switches to Insertion Sort for small subarrays (≤ 15 elements).

## How to Run

```bash
javac SortTest.java
java SortTest