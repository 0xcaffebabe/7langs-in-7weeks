class Animal
  attr_accessor :name
  def initialize(name)
    @name = name
  end
end

dog = Animal.new('dog')
puts dog.name