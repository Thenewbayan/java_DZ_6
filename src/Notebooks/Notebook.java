package Notebooks;


import java.util.Objects;

public class Notebook {
    // Подумать над структурой класса
    // Ноутбук(или Единорогов) для магазина техники - выделить поля и методы.
    // Реализовать в java. Создать множество ноутбуков. Переопределить toString,
    // equals и hashCode(как на семинаре).
    // Вывести на печать экземпляры класса, сравнить пару экземпляров и найти один
    // экземпляр в наборе.
    
        public String manufacturer;
        public String model;
        public double diagonal_monitor;
        public String type_OS;
        public int ROM_capacity;
        public int RAM_capacity;
        public int id;

        public Notebook(String manufacturer, String model, double diagonal_monitor,
                String type_OS, int ROM_capacity, int RAM_capacity, int id) {
            this.manufacturer = manufacturer;
            this.model = model;
            this.diagonal_monitor = diagonal_monitor;
            this.ROM_capacity = ROM_capacity;
            this.RAM_capacity = RAM_capacity;
            this.id = id;
        }

        public String toString() {
           
            return "Производитель: " + manufacturer + " ID: " + id + " Модель: " + model + 
                    " Диагональ экрана: " + diagonal_monitor + " Размер ПЗУ " + ROM_capacity +
                    " Размер ОЗУ " + RAM_capacity;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Notebook notebook = (Notebook) o;
            return manufacturer == notebook.manufacturer && model == notebook.model && diagonal_monitor == notebook.diagonal_monitor ;
        }
        public int hashCode() {
            return Objects.hash(manufacturer, model, diagonal_monitor, id);
        }
    

    }


