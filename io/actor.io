therad1 := Object clone
therad2 := Object clone
thread1 start := method(wait(1); "1" println)
thread2 start := method(wait(2); "2" println)

thread1 start;thread2 start