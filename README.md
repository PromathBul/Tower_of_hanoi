# Задача
Написать программу, показывающую последовательность действий для игры “Ханойская башня”.

# Решение
Задача решается рекурсивно.
По сути решение имеет фрактальную природу и повторяет себя.

_**Рассуждения**_

Пусть мы умеем перекладывать `n` дисков, тогда и `n + 1` мы также можем переложить.
Пускай нам надо переложить `n + 1` дисков на стержень-приемник. Так как мы умеем перекладывать `n` дисков, то мы эту стопку переложим на вспомогательный стержень. 

Затем, положив самый большой диск на стержень-приемник, мы воспользуемся тем, что умеем перекладывать стопку из `n` элементов и переложим эту стопку со вспомогательного стержня на стержень-приемник. 

Таким образом, мы можем двигаться рекурсивно от любого `n` дисков к последнему самому большому.