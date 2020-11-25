-module(translate).
-export([loop/0,translate/2]).

loop() ->
  receive
    { Form, "chinese"} ->
      Form ! "ccc",
      loop();
    { Form, "dog"} ->
      Form ! "ddd",
      loop();
    { Form, _ } ->
      Form ! "uuu", % 发送
      loop
end.

translate(Pid, Word) ->
  Pid ! {self(), Word}, % 同步发送
  receive
    Trans -> Trans
  end.