public class Generic <T,S>{
    private T name;
    private S age;

    public <T extends Number>void method(int[] a){
        int max = 0;
        for (int i = 0; i < a.length; i++) {
                max = Math.max((Integer) a[i],max);

        }
        System.out.println(max);
    }

    public Generic(T name, S age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public S getAge() {
        return age;
    }

    public void setAge(S age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
