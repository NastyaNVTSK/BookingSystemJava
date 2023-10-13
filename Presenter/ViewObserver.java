package Presenter;

import java.util.Date;

public interface ViewObserver {
       void onReservationTable(Date orderDate, int tableNo, String name);
       
       void onchangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}




  

