public class Main {
    public static void main(String[] args) {

        Universidad universidad = new Universidad("Tecnologica","Bogota");

        Facultad facultad = new Facultad("Ingenieria", 1234);
        Facultad facultad2 = new Facultad("Negocios", 5678);

        Carrera carrera = new Carrera("Administración",134,9,"Pregrado");

        Curso curso = new Curso(1221212,"dddddd",2,"123 C","aaaaaaaa");

        Profesor profesor = new Profesor(32341414,"Paco Perez","Bogota","25 de marzo de 1900","Ingeniero","Colombia",200000);
        Estudiante estudiante = new Estudiante("Pacho Valencia",9191919,"2 de abril de 1930","Cali","Colegio Libertad","8 de agosto de 2021");

        Rector rectoe = new Rector(2919192,"Jesus Gomez", "Bogota","20 de diciembre de 1960","licenciado", 99999999);

        Persona persona = new Persona(1111123,"Marcela Mejia", "Neiva","20 de enero de 1986");






    }
}
