food_type(sugar,sweet).
food_type(coffe, hot).
food_type(ice,cold).

food_smell(sugar, normal).
food_smell(coffe, unnormal).

type_smell(X,X Y) :- food_type(X, Z), food_smell(Y, Z).