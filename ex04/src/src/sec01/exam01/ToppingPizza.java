package sec01.exam01;

public class ToppingPizza extends Pizza {
    String topping;

    public ToppingPizza(String dough, int sizeInInch, String topping) {
        super(dough, sizeInInch);
        this.topping = topping;
    }

    @Override
    public void describe() {
        System.out.println(
                this.topping + " Pizza: " + sizeInInch + " 인치, " + dough +
                        " 도우를 사용한 기본 피자입니다. 주요 토핑은 **" + topping + "** 입니다."
        );
    }

    public void bake(int temperature, int minutes) {
        System.out.println(
                topping + " Pizza (온도+시간 지정): " + temperature + " 도에서 " +
                        minutes + " 분 동안 **" + topping + "** 피자를 완벽하게 굽습니다."
        );
    }
}

