public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
         
        System.out.println("tv ligada? " + smartTv.ligada);
        System.out.println("canal: " + smartTv.canal);
        System.out.println("volume: " + smartTv.volume);
        System.out.println("------------------------------------");
        smartTv.ligar();
        System.out.println(" novo status --> tv ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("tv ligada? " + smartTv.ligada);
        System.out.println("------------------------------------");
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("volume: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("volume: " + smartTv.volume);
        System.out.println("------------------------------------");
        smartTv.mudarcanal(13);
        System.out.println("canal: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("canal: " + smartTv.canal);
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("canal: " + smartTv.canal);

    }
}
