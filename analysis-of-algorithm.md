# Running time

- The running time depends on the input: an already sorted sequence is easier to sort.
- Parameterize the running time by the size of the input, since short sequences are easier to sort than long ones.
- Generally, we seek upper bounds on the running time, because everybody likes a guarantee.

# Kinds of analyses
## Worst-case: (usually)
- T(n) = maximum time of algorithm on any input of size n.
## Average-case: (sometimes)
- T(n) = expected time of algorithm over all inputs of size n.
- Need assumption of statistical distribution of inputs.
## Best-case: (bogus)
- Cheat with a slow algorithm that works fast on some input.

# Machine-independent time
What is insertion sort’s worst-case time?
- It depends on the speed of our computer:
- relative speed (on the same machine),
- absolute speed (on different machines).

## BIG IDEA:
- Ignore machine-dependent constants.
- Look at growth of T(n) as n → ∞ .
**Asymptotic Analysis**

# Asymptotic Analysis
## Θ-notation
**Math:**
Θ(g(n)) = { f (n) : there exist positive constants c1, c2, and n0 such that 0 ≤ c1 g(n) ≤ f (n) ≤ c2 g(n) for all n ≥ n0 }

**Engineering:**
- Drop low-order terms; ignore leading constants.
Example: 3n3 + 90n2 – 5n + 6046 = Θ(n3)

# Asymptotic performance
When n gets large enough, a Θ(n2) algorithm
always beats a Θ(n3) algorithm.
- We shouldn’t ignore asymptotically slower algorithms, however.
- Real-world design situations often call for a careful balancing of engineering objectives.
- Asymptotic analysis is a useful tool to help to structure our thinking.

Asymptotic Notation: ignore constant factors and low order terms
– Upper bounds (O), lower bounds (Ω), tight bounds (Θ) ∈, =, is, order
– Time estimate below based on one operation per cycle on a 1 GHz single-core machine
– Particles in universe estimated < 10100
|input|constant|logarithmic|linear|log-linear|quadratic|polynomial|exponential|
|--------------|-------------|----------|-------------|---------|-----------|---------|---------|
|n|Θ(1)|Θ(log n)|Θ(n)|Θ(n log n)|Θ(n2)|Θ(nc)|2Θ(nc)|
|1000|1|≈10|1000|≈10,000|1,000,000|1000c|21000≈10301|
|Time|1 ns|10 ns|1 µs|10 µs|1 ms|103c−9 s|10281 millenia|

# Insertion sort analysis

Worst case: Input reverse sorted
Average case: All permutations equally likely

Is insertion sort a fast sorting algorithm?
- Moderately so, for small n.
- Not at all, for large n.

# Merge sort
MERGE-SORT A[1 . . n]
1. If n = 1, done.
2. Recursively sort A[ 1 . . ⎡n/2⎤ ] and A[ ⎡n/2⎤+1 . . n ] .
3. **“Merge”** the 2 sorted lists.
Key subroutine: MERGE

# Conclusions
- Θ(n lg n) grows more slowly than Θ(n2).
- Therefore, merge sort asymptotically beats insertion sort in the worst case.
- In practice, merge sort beats insertion sort for n > 30 or so.

  
