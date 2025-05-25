# Втора лабораториска вежба по Софтверско инженерство

## Александра Манева, бр. на индекс 232008

###  Control Flow Graph




### Цикломатска комплексност

Според бројот на реиони се добива дека истиот број е и цикломатската комплексност а тоа е 9.

### Тест случаи според критериумот  Every statement 

Минимално 5 тест случаи мора да има бидејќи има 5 различни излези од функцијата.
checkCart(allIitem=null,cardNumber="")
Во овој тест случај функцијата ќе го врати првиот  exception("allItems list can't be null!").
checkCart(List.of(new Item(null, 1, 100, 0)), "1234567890123456")
Фунцкијата ќе го врати вториот exception("Invalid item!").
checkCart(List.of(new Item("Acka", 11, 350, 0.1)), "1234567890123456")
Во овој тест случај ќе ја врати сумата(нема exception).
checkCart(List.of(new Item("Acka", 1, 100, 0)), "1a34ab3d56d8")
Во овој тест случај функцијата ќе го врати третиот exception("Invalid character in card number!").
checkCart(List.of(new Item("Acka", 1, 100, 0)), null)
Во овој тест случај функцијата ќе го врати четвртиот exception("Invalid card number!").
### Тест случаи според критериумот Multiple Condition 
if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10)

1. TXX
   checkCart(List.of(new Item("Acka", 0, 310, 0)), null)
2. FTX
   checkCart(List.of(new Item("Acka", 1, 100, 0.1)), null)
3. FFF
   checkCart(List.of(new Item("Acka", 1, 100, 0)), null)
4. FFT
   checkCart(List.of(new Item("Acka", 11, 100, 0)), null)

   
