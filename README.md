# Sorting Algorithms Benchmark in Java

This project implements and compares the performance of several sorting algorithms in Java:

- Insertion Sort
- Merge Sort
- (Upcoming: Heap Sort, Quick Sort, Modified Quick Sort)

## Goal

To observe how different comparison-based sorting algorithms perform with increasing input sizes on:
- Randomly generated data
- Already sorted data
- Reverse sorted data (coming soon)

## Input Sizes Tested

- 1,000
- 5,000
- 10,000
- 50,000
- 60,000
  
Each sorting algorithm runs 5 times per input size, and the average execution time is recorded.

## Heap Sort Implementation Note

Unlike typical implementations that use Java’s built-in `PriorityQueue` (which is a min-heap), this project uses a **manually implemented max-heap** built with an `ArrayList`. Elements are inserted one by one using a custom `insert()` method (percolating up), and removed using a `remove()` method (percolating down) to form the sorted result.

This approach reflects a deeper understanding of heap operations and binary heap structure — including child/parent index management — without relying on library-provided abstractions.
