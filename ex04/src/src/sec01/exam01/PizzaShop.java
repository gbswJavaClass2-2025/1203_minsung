package sec01.exam01;

public class PizzaShop {
    public static void main(String[] args) {
        System.out.println("----- 피자 가게 시스템 실습 시작 -----");

        Pizza p1 = new Pizza("씬 크러스트", 10);
        Pizza p2 = new ToppingPizza("핸드 토스", 12, "모짜렐라");
        Pizza p3 = new ToppingPizza("팬 도우", 14, "페퍼로니");

        System.out.println("------------------------------------");
        System.out.println("[4. 오버라이딩 (설명)]");
        p1.describe();
        p2.describe();
        p3.describe();

        System.out.println("------------------------------------");
        System.out.println("[3. 오버로딩 (굽기)]");
        p1.bake();
        p1.bake(15);

        ToppingPizza tp = new ToppingPizza("팬 도우", 14, "페퍼로니");
        System.out.println();
        System.out.println("Pepperoni Pizza (표준): 오븐에서 표준 시간 동안 피자를 굽습니다.");
        System.out.println("Pepperoni Pizza (시간 지정): 20 분 동안 특별히 피자를 굽습니다.");
        tp.bake(350, 18);

        System.out.println("----- 실습 종료 -----");
    }
}

