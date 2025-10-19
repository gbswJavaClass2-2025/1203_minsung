package sec01.exam01;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

        System.out.println("모델: " + dmbCellPhone.model);
        System.out.println("색상: " + dmbCellPhone.color);

        System.out.println("채널: " + dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.powerOff();
        dmbCellPhone.sendVoice("여어~");
        dmbCellPhone.receiveVoice("어딜 한가롭게 '여어~'라고 하는거냐! 몇번이고 말하지 마라... 네놈은..");
        dmbCellPhone.sendVoice("네녀석의 다음 대사는 '네놈은 날 화나게 했다'다!");
        dmbCellPhone.receiveVoice("네놈은 날화나게 했다!...무슨?!");
        dmbCellPhone.hangUp();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();
    }
}
