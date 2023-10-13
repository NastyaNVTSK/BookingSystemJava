package Presenter;

import java.util.Collection;
import java.util.Date;

import Models.Table;

public interface Model {
   Collection<Table> loadTables();

   int reservationTable(Date data, int tableNo, String nabe);
   int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}

