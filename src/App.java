import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Desarrollar un juego de preguntas y respuestas en Java que permita a los usuarios responder preguntas y
        obtener puntajes según sus respuestas.
        Crear 10 preguntas. (2 compañeros) 15 preguntas (3 compañeros)
        Almacenar las preguntas en un formato estructurado (puede ser en un array),  y que se muestren en pantalla de forma random.
        Presentar preguntas al usuario y permitirle escribir una respuesta.
        Llevar un seguimiento del puntaje del usuario.
        Utilizar condicionales para verificar si la respuesta del usuario es correcta. */
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();
        String preguntas[]=new String[9];
        String respuestas[]=new String[9];
        int contador=0;
        preguntas[0]="¿Cuál es la capital de España?";
        preguntas[1]="¿En qué año empezó la guerra civil española?";
        preguntas[2]="¿Cuántas vidas tiene un gato?";
        preguntas[3]="¿Cómo se llama la protagonista de Los Juegos del Hambre?";
        preguntas[4]="¿Cuál es el tercer planeta más cercano al Sol?";
        preguntas[5]="¿Cuál es el nombre del pokémon más famoso?";
        preguntas[6]="¿Cuál es la ciudad con más rotondas de España?";
        preguntas[7]="¿Cuál es el pico más alto de España?";
        preguntas[8]="¿Cómo se llama el libro más famoso de Juan Ramón Jiménez?";
        preguntas[9]="¿Qué nota musical le sigue a un La?";
        respuestas[0]="Madrid";
        respuestas[1]="1936";
        respuestas[2]="7";
        respuestas[3]="Katniss Everdeen";
        respuestas[4]="La Tierra";
        respuestas[5]="Pikachu";
        respuestas[6]="Dos Hermanas";
        respuestas[7]="El Teide";
        respuestas[8]="Platero y yo";
        respuestas[9]="Si";
        int preguntaRandom = rng.nextInt(respuestas.length); //he hecho la variable esta para poder hacer el random de las preguntas, como con piedra papel tijera
        for(int i = 0; i < preguntas.length; i++){
            System.out.println(preguntas[preguntaRandom]);

        }





    }
}
