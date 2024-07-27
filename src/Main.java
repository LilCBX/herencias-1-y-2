//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Boston boston = new Boston("Jason Tatum", "26", "8", "1");
        Bucks bucks = new Bucks("Giannis Antetokounmpo", "29", "5", "1");
        Bulls bulls = new Bulls("Zach Lavine", "29", "2", "0");
        Clippers clippers = new Clippers("Kawhi Leonard", "33", "6", "2");
        Kings kings = new Kings("Dearon Fox", "26", "0", "0");
        Lakers lakers = new Lakers("Lebron James", "39", "20", "4");
        Spurs spurs = new Spurs("Tim Duncan", "48", "15", "5");
        Thunder thunder = new Thunder("Russell Westbrook", "35", "9", "0");
        Timberwolves timberwolves = new Timberwolves("Kevin Garnett", "48", "6", "2");
        Warriors warriors = new Warriors("Stephen curry", "36", "9", "4");

        System.out.println(boston);
        System.out.println(bucks);
        System.out.println(bulls);
        System.out.println(clippers);
        System.out.println(kings);
        System.out.println(lakers);
        System.out.println(spurs);
        System.out.println(thunder);
        System.out.println(timberwolves);
        System.out.println(warriors);


    }

    private static class Boston {
        private String nombre;
        private String edad;
        private String allstars;
        private String titulos;

        public Boston(String nombre, String edad, String allstars, String titulos) {
            this.nombre = nombre;
            this.edad = edad;
            this.allstars = allstars;
            this.titulos = titulos;
        }

        @Override
        public String toString() {
            return "Boston{" +
                    "nombre='" + nombre + '\'' +
                    ", edad='" + edad + '\'' +
                    ", allstars='" + allstars + '\'' +
                    ", titulos='" + titulos + '\'' +
                    '}';
        }
    }

    private static class Bucks {
        private String nombre;
        private String edad;
        private String allstars;
        private String titulos;

        public Bucks(String nombre, String edad, String allstars, String titulos) {
            this.nombre = nombre;
            this.edad = edad;
            this.allstars = allstars;
            this.titulos = titulos;
        }

        @Override
        public String toString() {
            return "Bucks{" +
                    "nombre='" + nombre + '\'' +
                    ", edad='" + edad + '\'' +
                    ", allstars='" + allstars + '\'' +
                    ", titulos='" + titulos + '\'' +
                    '}';
        }
    }

    private static class Bulls {
        private String nombre;
        private String edad;
        private String allstars;
        private String titulos;

        public Bulls(String nombre, String edad, String allstars, String titulos) {
            this.nombre = nombre;
            this.edad = edad;
            this.allstars = allstars;
            this.titulos = titulos;
        }

        @Override
        public String toString() {
            return "Bulls{" +
                    "nombre='" + nombre + '\'' +
                    ", edad='" + edad + '\'' +
                    ", allstars='" + allstars + '\'' +
                    ", titulos='" + titulos + '\'' +
                    '}';
        }
    }

    private static class Clippers {
        private String nombre;
        private String edad;
        private String allstars;
        private String titulos;

        public Clippers(String nombre, String edad, String allstars, String titulos) {
            this.nombre = nombre;
            this.edad = edad;
            this.allstars = allstars;
            this.titulos = titulos;
        }

        @Override
        public String toString() {
            return "Clippers{" +
                    "nombre='" + nombre + '\'' +
                    ", edad='" + edad + '\'' +
                    ", allstars='" + allstars + '\'' +
                    ", titulos='" + titulos + '\'' +
                    '}';
        }
    }

    private static class Kings {
        private String nombre;
        private String edad;
        private String allstars;
        private String titulos;

        public Kings(
                String nombre, String edad, String allstars, String titulos) {
            this.nombre = nombre;
            this.edad = edad;
            this.allstars = allstars;
            this.titulos = titulos;
        }

        @Override
        public String toString() {
            return "Kings{" +
                    "nombre='" + nombre + '\'' +
                    ", edad='" + edad + '\'' +
                    ", allstars='" + allstars + '\'' +
                    ", titulos='" + titulos + '\'' +
                    '}';
        }
    }

    private static class Lakers {
        private String nombre;
        private String edad;
        private String allstars;
        private String titulos;

        public Lakers(String nombre, String edad, String allstars, String titulos) {
            this.nombre = nombre;
            this.edad = edad;
            this.allstars = allstars;
            this.titulos = titulos;
        }

        @Override
        public String toString() {
            return "Lakers{" +
                    "nombre='" + nombre + '\'' +
                    ", edad='" + edad + '\'' +
                    ", allstars='" + allstars + '\'' +
                    ", titulos='" + titulos + '\'' +
                    '}';
        }
    }

    private static class Spurs {
        private String nombre;
        private String edad;
        private String allstars;
        private String titulos;

        public Spurs(String nombre, String edad, String allstars, String titulos) {
            this.nombre = nombre;
            this.edad = edad;
            this.allstars = allstars;
            this.titulos = titulos;
        }

        @Override
        public String toString() {
            return "Spurs{" +
                    "nombre='" + nombre + '\'' +
                    ", edad='" + edad + '\'' +
                    ", allstars='" + allstars + '\'' +
                    ", titulos='" + titulos + '\'' +
                    '}';
        }
    }

    private static class Thunder {
        private String nombre;
        private String edad;
        private String allstars;
        private String titulos;

        public Thunder(String nombre, String edad, String allstars, String titulos) {
            this.nombre = nombre;
            this.edad = edad;
            this.allstars = allstars;
            this.titulos = titulos;
        }

        @Override
        public String toString() {
            return "Thunder{" +
                    "nombre='" + nombre + '\'' +
                    ", edad='" + edad + '\'' +
                    ", allstars='" + allstars + '\'' +
                    ", titulos='" + titulos + '\'' +
                    '}';
        }
    }



    private static class Timberwolves {
        private String nombre;
        private String edad;
        private String allstars;
        private String titulos;

        public Timberwolves(String nombre, String edad, String allstars, String titulos) {
            this.nombre = nombre;
            this.edad = edad;
            this.allstars = allstars;
            this.titulos = titulos;
        }

        @Override
        public String toString() {
            return "Timberwolves{" +
                    "nombre='" + nombre + '\'' +
                    ", edad='" + edad + '\'' +
                    ", allstars='" + allstars + '\'' +
                    ", titulos='" + titulos + '\'' +
                    '}';
        }
    }

    private static class Warriors {
        private String nombre;
        private String edad;
        private String allstars;
        private String titulos;

        public Warriors(String nombre, String edad, String allstars, String titulos) {
            this.nombre = nombre;
            this.edad = edad;
            this.allstars = allstars;
            this.titulos = titulos;
        }

        @Override
        public String toString() {
            return "Warriors{" +
                    "nombre='" + nombre + '\'' +
                    ", edad='" + edad + '\'' +
                    ", allstars='" + allstars + '\'' +
                    ", titulos='" + titulos + '\'' +
                    '}';
        }
    }





}