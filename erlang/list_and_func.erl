Numbers = [1,2,3].
lists:foreach(fun(I) -> io:format("~p~n",[I]) end, Numbers). % 迭代
lists:map(fun(I) -> I * I end, Numbers). % 映射\

lists:filter(fun(I) -> I > 1 end, Numbers).
lists:all(fun(I) -> I > 1 end, Numbers).
lists:any(fun(I) -> I > 1 end, Numbers).

lists:foldl(fun(I,SUM) -> I + SUM end, 0, [1,2,3,4,5]). % reduce