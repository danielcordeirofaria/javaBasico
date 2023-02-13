import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int inicioHora = input.nextInt();
    int inicioMinuto = input.nextInt();
    int fimHora = input.nextInt();
    int fimMinuto = input.nextInt();

    int duracaoMinutos = 0;
    int duracaoHoras = 0;

    if (inicioHora == fimHora && inicioMinuto == fimMinuto) {
      duracaoHoras = 24;
    } else {
      if (fimMinuto >= inicioMinuto) {
        duracaoMinutos = fimMinuto - inicioMinuto;
        duracaoHoras = fimHora - inicioHora;
      } else {
        duracaoMinutos = 60 + fimMinuto - inicioMinuto;
        duracaoHoras = fimHora - inicioHora - 1;
      }
      if (duracaoHoras < 0) {
        duracaoHoras += 24;
      }
    }

    System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
  }
}
