


    public enum Departament {

        SALES("Sprzedaż"),
        ADMINISTRATION("Administracja");

        private String name;

        Departament(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

