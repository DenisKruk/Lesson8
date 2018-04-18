public abstract class A {
    public void m1() {
        System.out.println("A");
    }


    public class B extends A {
        public void m2() {
            System.out.println("B");
        }


        public class C extends B {
            public void m3() {
                System.out.println("C");
            }

            @Override
            public void m2() {
                System.out.println("m2 from C");
            }
        }


        public class D extends B {
            public void m4() {
                System.out.println("D");
            }

            @Override
            public void m1() {
                System.out.println("m1 from D");
            }
        }
    }
}



