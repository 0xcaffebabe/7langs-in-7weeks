module Human
  def go
    puts 'gogogo'
  end
end

class Person
  include Human
end
p = Person.new
p.go