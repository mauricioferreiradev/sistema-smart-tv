public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada ? " + smartTv.ligada);
        System.out.println("Qual o canal atual: " + smartTv.canal);
        System.out.println("Qual o volume atual: " + smartTv.volume);


        smartTv.mudarCanal(13);
        System.out.println("Você mudou para o canal: " + smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("O Volume da TV agora é: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("O Volume da TV agora é: " + smartTv.volume);



        smartTv.ligar();
        System.out.println("Status atual: A TV está ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Status atual: A TV está ligada ? " + smartTv.ligada);
    }
}
