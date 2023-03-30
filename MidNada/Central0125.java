interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0125 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0125 obj = new Central0125();
        System.out.println("main");
        obj.aaa();
    }
}
