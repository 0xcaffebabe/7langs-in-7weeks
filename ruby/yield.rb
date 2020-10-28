def f
  i = 0
  while i < 10
    i = i + 1
    yield
  end
end
f {puts 'ddd'}

def condition_yeild
  i = 0
  while i < 10
    i = i + 1
    yield if i > 5
  end
end

condition_yeild {puts 'ddd'}