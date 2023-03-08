public class Televisor {
    Integer canal = 130;
    Integer volume = 20;
    void mudarCanal(Integer novoCanal) {
        if (canal.intValue() == novoCanal) {
            System.out.println("Novo canal é também o canal atual.");
        } else {
            canal = novoCanal;
            System.out.println("Canal alterado para " + canal);
        }
    }
    void mudarVolume(Integer novoVolume) {
        if (novoVolume.intValue() == volume) {
            System.out.println("Novo volume é também o volume atual.");
        } else {
            volume = (int) novoVolume.byteValue();
            System.out.println("Volume alterado para " + volume);
        }
    }
}
