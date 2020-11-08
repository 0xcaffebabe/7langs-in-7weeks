thread1 := Object clone
thread2 := Object clone

thread1 run := method(
  for(i,1,10, i println;yield)
)

thread2 run := method(
  for(i,11,20, i println;yield)
)

thread1 @@run; thread2 @@run
Coroutine currentCoroutine pause