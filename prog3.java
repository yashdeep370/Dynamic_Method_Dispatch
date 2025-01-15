public class prog3 {
public static void main(String[] args) {
Apple appleRef;
appleRef = new Apple();
appleRef.show(); 
appleRef = new Banana();
appleRef.show(); 
appleRef = new Cherry();
appleRef.show(); 
}
}

class Apple {
void show() {
System.out.println("This is the show() method of the Apple class.");
}
}

class Banana extends Apple {
@Override
void show() {
System.out.println("This is the show() method of the Banana class.");
}
}

class Cherry extends Apple {
@Override
void show() {
System.out.println("This is the show() method of the Cherry class.");
}
}

