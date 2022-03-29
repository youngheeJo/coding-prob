/**
 * 거스름돈 문제
 *
 * 당신은 음식점의 계산을 도와주는 점원입니다.
 * 카운터에는 거스름돈으로 사용할 500원, 100원, 50원, 10원 동전이 무한개 존재합니다.
 * 손님에게 거슬러 줘야 할 돈이 N원일 때 거슬러주어야 할 동전의 최소 개수를 구하라.
 * 단, 거슬러 줘야 할 돈 N은 항상 10의 배수이다
 */
public class ChangeSolution {

    public int computeChange(int money) {
        int changeCount = 0;
        int[] changes = {500, 100, 50, 10};
        int remain = money;

        for (int change : changes) {
            changeCount += remain / change;
            remain = remain % change;
        }

        return changeCount;
    }

}