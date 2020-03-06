#Kevin M. Acosta
##CS2 MW-9am
This is my analysis of my sortOfSort method implementation.
The big O notation of my method is **O(N^2+N.)**
My method was split into two separate parts, a public one
that is called and a private one that is called by the 
public method. In my analysis the public method had a runtime
of N*(N-1), but since we're dealing with big O notation the 
subtraction could be omitted and reduced to **O(N^2)**. This
public method ends with a single call to my private method 
so the continuation would lead to an addition that is **not** omitted.


