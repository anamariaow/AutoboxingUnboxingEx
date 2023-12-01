public class Main {
    public static void main(String[] args) {
        //Primitives numeri
        int numInt = 1;
        double doubleNum = 2;

        //Autoboxing: Oggetti numeri
        Integer numInteger = numInt;
        Double numDouble = doubleNum;

        //somma numeri per primitives e oggetti
        somma(numInt, 3);
        sommaInteger(numInt, 4);
        somma(numInteger, 6);
        sommaInteger(numInteger, 7);

        //carattere primitivo e Autoboxing
        char charCh = 'a';
        Character charCharacter = charCh;

        //stampa carattere Autoboxing e Unboxing
        stampaCharacter(charCh);
        charStampa(charCharacter);

        //Unboxing
        int unboxingInteger = numInteger;
        double unboxingDouble = numDouble;
        char unboxingCharacter = charCharacter;

        //somma Unboxing
        somma(unboxingInteger, 8);
        stampaCharacter(unboxingCharacter);

    }
    public static void somma(int num, int num2) {
        System.out.println("Somma dei due numeri: " + (num + num2));
    }
    public static void charStampa(char ch) {
        System.out.println("Carattere: " + ch);
    }
    public static void sommaInteger(Integer num, Integer num2) {
        System.out.println("Somma dei due Integer: " + (num + num2));
    }
    public static void stampaCharacter(Character ch) {
        System.out.println("Character: " + ch);
    }
}