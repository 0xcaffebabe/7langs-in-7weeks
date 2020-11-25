-module(basic).
-export([mirror/1, number/1]).
-export([sum/1]).

mirror(Anything) -> Anything.
number(one) -> 1. % 模式匹配

sum(0) -> 0;
sum(1) -> 1;
sum(N) -> N + sum(N-1). % 递归