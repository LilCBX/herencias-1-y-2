public class MainT {
    public static void main(String[] args) {
        tenis1 tenis1 = new tenis1("Lebron 21", "70", "nike", "amortiguacion");
        tenis2 tenis2 = new tenis2("Kobe 6 protro", "241", "nike", "agarre");
        tenis3 tenis3 = new tenis3("AE 1", "79", "adidas", "agarre");
        tenis4 tenis4 = new tenis4("JT 1", "90", "Jordan", "contencion");
        tenis5 tenis5 = new tenis5("way of wade 11", "264", "li-ning", "agarre y contencion");
        tenis6 tenis6 = new tenis6("GTcut 2", "180", "nike", "amortiguacion y agarre");
        tenis7 tenis7 = new tenis7("Kai 1", "114", "anta", "agarre y contencion");
        tenis8 tenis8 = new tenis8("retro 11", "147", "jordan", "durabilidad y agarre");
        tenis9 tenis9 = new tenis9("harden vol.7", "190", "adidas", "durabilidad y agarre");
        tenis10 tenis10 = new tenis10("curry flow 11", "127", "under armour", "agarre y comodidad");

        System.out.println(tenis1);
        System.out.println(tenis2);
        System.out.println(tenis3);
        System.out.println(tenis4);
        System.out.println(tenis5);
        System.out.println(tenis6);
        System.out.println(tenis7);
        System.out.println(tenis8);
        System.out.println(tenis9);
        System.out.println(tenis10);


    }

    private static class tenis1 {
        private String nombre_tenis;
        private String precio_en_dolares;
        private String marca;
        private String punto_fuerte;

        public tenis1(String nombre_tenis, String precio_en_dolares, String marca, String punto_fuerte) {
            this.nombre_tenis = nombre_tenis;
            this.precio_en_dolares = precio_en_dolares;
            this.marca = marca;
            this.punto_fuerte = punto_fuerte;
        }

        @Override
        public String toString() {
            return "tenis1{" +
                    "nombre del tenis='" + nombre_tenis + '\'' +
                    ", precio en dolares='" + precio_en_dolares + '\'' +
                    ", marca del tenis='" + marca + '\'' +
                    ", puntos fuertes='" + punto_fuerte + '\'' +
                    '}';
        }
    }

    private static class tenis2 {
        private String nombre_tenis;
        private String precio_en_dolares;
        private String marca;
        private String punto_fuerte;

        public tenis2(String nombre_tenis, String precio_en_dolares, String marca, String punto_fuerte) {
            this.nombre_tenis = nombre_tenis;
            this.precio_en_dolares = precio_en_dolares;
            this.marca = marca;
            this.punto_fuerte = punto_fuerte;
        }

        @Override
        public String toString() {
            return "tenis2{" +
                    "nombre del tenis='" + nombre_tenis + '\'' +
                    ", precio en dolares='" + precio_en_dolares + '\'' +
                    ", marca del tenis='" + marca + '\'' +
                    ", puntos fuertes='" + punto_fuerte + '\'' +
                    '}';
        }
    }

    private static class tenis3 {
        private String nombre_tenis;
        private String precio_en_dolares;
        private String marca;
        private String punto_fuerte;

        public tenis3(String nombre_tenis, String precio_en_dolares, String marca, String punto_fuerte) {
            this.nombre_tenis = nombre_tenis;
            this.precio_en_dolares = precio_en_dolares;
            this.marca = marca;
            this.punto_fuerte = punto_fuerte;
        }

        @Override
        public String toString() {
            return "tenis3{" +
                    "nombre del tenis='" + nombre_tenis + '\'' +
                    ", precio en dolares='" + precio_en_dolares + '\'' +
                    ", marca del tenis='" + marca + '\'' +
                    ", puntos fuertes='" + punto_fuerte + '\'' +
                    '}';
        }
    }

    private static class tenis4 {
        private String nombre_tenis;
        private String precio_en_dolares;
        private String marca;
        private String punto_fuerte;

        public tenis4(String nombre_tenis, String precio_en_dolares, String marca, String punto_fuerte) {
            this.nombre_tenis = nombre_tenis;
            this.precio_en_dolares = precio_en_dolares;
            this.marca = marca;
            this.punto_fuerte = punto_fuerte;
        }

        @Override
        public String toString() {
            return "tenis4{" +
                    "nombre del tenis='" + nombre_tenis + '\'' +
                    ", precio en dolares='" + precio_en_dolares + '\'' +
                    ", marca del tenis='" + marca + '\'' +
                    ", puntos fuertes='" + punto_fuerte + '\'' +
                    '}';
        }
    }

    private static class tenis5 {
        private String nombre_tenis;
        private String precio_en_dolares;
        private String marca;
        private String punto_fuerte;

        public tenis5(String nombre_tenis, String precio_en_dolares, String marca, String punto_fuerte) {
            this.nombre_tenis = nombre_tenis;
            this.precio_en_dolares = precio_en_dolares;
            this.marca = marca;
            this.punto_fuerte = punto_fuerte;
        }

        @Override
        public String toString() {
            return "tenis5{" +
                    "nombre del tenis='" + nombre_tenis + '\'' +
                    ", precio en dolares='" + precio_en_dolares + '\'' +
                    ", marca del tenis='" + marca + '\'' +
                    ", puntos fuertes='" + punto_fuerte + '\'' +
                    '}';
        }
    }

    private static class tenis6 {
        private String nombre_tenis;
        private String precio_en_dolares;
        private String marca;
        private String punto_fuerte;

        public tenis6(String nombre_tenis, String precio_en_dolares, String marca, String punto_fuerte) {
            this.nombre_tenis = nombre_tenis;
            this.precio_en_dolares = precio_en_dolares;
            this.marca = marca;
            this.punto_fuerte = punto_fuerte;
        }

        @Override
        public String toString() {
            return "tenis6{" +
                    "nombre del tenis='" + nombre_tenis + '\'' +
                    ", precio en dolares='" + precio_en_dolares + '\'' +
                    ", marca del tenis='" + marca + '\'' +
                    ", puntos fuertes='" + punto_fuerte + '\'' +
                    '}';
        }
    }

    private static class tenis7 {
        private String nombre_tenis;
        private String precio_en_dolares;
        private String marca;
        private String punto_fuerte;

        public tenis7(String nombre_tenis, String precio_en_dolares, String marca, String punto_fuerte) {
            this.nombre_tenis = nombre_tenis;
            this.precio_en_dolares = precio_en_dolares;
            this.marca = marca;
            this.punto_fuerte = punto_fuerte;
        }

        @Override
        public String toString() {
            return "tenis7{" +
                    "nombre del tenis='" + nombre_tenis + '\'' +
                    ", precio en dolares='" + precio_en_dolares + '\'' +
                    ", marca del tenis='" + marca + '\'' +
                    ", puntos fuertes='" + punto_fuerte + '\'' +
                    '}';
        }
    }

    private static class tenis8 {
        private String nombre_tenis;
        private String precio_en_dolares;
        private String marca;
        private String punto_fuerte;

        public tenis8(String nombre_tenis, String precio_en_dolares, String marca, String punto_fuerte) {
            this.nombre_tenis = nombre_tenis;
            this.precio_en_dolares = precio_en_dolares;
            this.marca = marca;
            this.punto_fuerte = punto_fuerte;
        }

        @Override
        public String toString() {
            return "tenis8{" +
                    "nombre del tenis='" + nombre_tenis + '\'' +
                    ", precio en dolares='" + precio_en_dolares + '\'' +
                    ", marca del tenis='" + marca + '\'' +
                    ", puntos fuertes='" + punto_fuerte + '\'' +
                    '}';
        }
    }



    private static class tenis9 {
        private String nombre_tenis;
        private String precio_en_dolares;
        private String marca;
        private String punto_fuerte;

        public tenis9(String nombre_tenis, String precio_en_dolares, String marca, String punto_fuerte) {
            this.nombre_tenis = nombre_tenis;
            this.precio_en_dolares = precio_en_dolares;
            this.marca = marca;
            this.punto_fuerte = punto_fuerte;
        }

        @Override
        public String toString() {
            return "tenis9{" +
                    "nombre del tenis='" + nombre_tenis + '\'' +
                    ", precio en dolares='" + precio_en_dolares + '\'' +
                    ", marca del tenis='" + marca + '\'' +
                    ", puntos fuertes='" + punto_fuerte + '\'' +
                    '}';
        }
    }

    private static class tenis10 {
        private String nombre_tenis;
        private String precio_en_dolares;
        private String marca;
        private String punto_fuerte;

        public tenis10(String nombre_tenis, String precio_en_dolares, String marca, String punto_fuerte) {
            this.nombre_tenis = nombre_tenis;
            this.precio_en_dolares = precio_en_dolares;
            this.marca = marca;
            this.punto_fuerte = punto_fuerte;
        }

        @Override
        public String toString() {
            return "tenis10{" +
                    "nombre del tenis='" + nombre_tenis + '\'' +
                    ", precio en dolares='" + precio_en_dolares + '\'' +
                    ", marca del tenis='" + marca + '\'' +
                    ", puntos fuertes='" + punto_fuerte + '\'' +
                    '}';
        }
    }





}