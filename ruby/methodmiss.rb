class Man
  def self.method_missing name, *args
    puts "oh, no such method:${name}"
  end
end

puts Man.go
