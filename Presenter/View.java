package Presenter;

import java.util.Collection;
import java.util.Date;

import Models.Table;

public interface View {
   void showTables(Collection<Table> tables);

   void showReservationTableResult(int reservationId);

   void reservationTable(Date orderdate, int tableNo, String name);

   void setObserver(ViewObserver observer);

   void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
