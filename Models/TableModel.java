package Models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import Presenter.Model;

public class TableModel implements Model {
   private Collection<Table> tables;


   public Collection<Table> loadTables() {
      if (tables == null) {
         tables = new ArrayList<>();
         tables.add(new Table());
         tables.add(new Table());
         tables.add(new Table());
         tables.add(new Table());
         tables.add(new Table());
      }

      return tables;
   }

   public int reservationTable(Date reservationDate, int tableNo, String name) {
      for(Table table: loadTables()){
         if(table.getNo() == tableNo){
            Reservation reservation = new Reservation(reservationDate, name);
            table.getReservations().add(reservation);
            return reservation.getId();
         }
      }

      throw new RuntimeException("Некорректный номер столика");


         }
      


   public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
      for(Table table: loadTables()){
         if(table.getNo() == tableNo){
            Reservation reservation = new Reservation(reservationDate, name);
            table.getReservations().removeIf(r -> r.getId() == oldReservation);
            table.getReservations().add(reservation);
            return reservation.getId();
         
         }
         throw new RuntimeException("Некорректный номер столика");
      }
      return tableNo;
   }
}