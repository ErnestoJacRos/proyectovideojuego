package proyectovideojuego.logica;

import java.util.ArrayList;
import java.util.List;

public class proyectovideojuego {
    public static void main(String[] args) {
        List<VideoJuego> listaVideoJuegos = new ArrayList<VideoJuego>();
        VideoJuego videoJuego1 = new VideoJuego(123,
                "Banjo Kazooie","Nintendo 64",4,"Plataforma");
        VideoJuego videoJuego2 = new VideoJuego(456,
                "Mario party 3","Nintendo 64",4,"Plataforma");
        VideoJuego videoJuego3 = new VideoJuego(789,
                "Age Empire II","PC",1,"Estrategia");
        VideoJuego videoJuego4 = new VideoJuego(100,
                "Counter Strike 1.6","PC",1,"Shooter");
        VideoJuego videoJuego5 = new VideoJuego(110,
                "Mario Kart 64","Nintendo 64",2,"Plataforma");

        listaVideoJuegos.add(videoJuego1);
        listaVideoJuegos.add(videoJuego2);
        listaVideoJuegos.add(videoJuego3);
        listaVideoJuegos.add(videoJuego4);
        listaVideoJuegos.add(videoJuego5);

        listaVideoJuegos.forEach(video ->{
            System.out.println("Titulo: " + video.getTitulo() + " " + "Consola: " + video.getConsola()+
                    " " + "Cantidad jugadores: " + video.getCantidadJugadores());
        });

        videoJuego1.setTitulo("Banjo kazooie II");
        videoJuego1.setCantidadJugadores(1);

        videoJuego5.setTitulo("Super Mario Kart 64");
        videoJuego5.setCantidadJugadores(4);

        //paso 5
        System.out.println("=== Encontrando las consolas de nintendo 64 ===");
        listaVideoJuegos.forEach(videoJuego -> {
            if (videoJuego.getConsola().equals("Nintendo 64")){
                System.out.println("videoJuego = " + videoJuego);
            }
        });

    }
}
