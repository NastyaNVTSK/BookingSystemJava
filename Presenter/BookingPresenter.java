package Presenter;

import java.util.Collection;
import java.util.Date;

import Models.Table;

public class BookingPresenter implements ViewObserver {
   private Model model;
   private View view;

   public BookingPresenter(Model model, View view) {
      this.model = model;
      this.view = view;
      view.setObserver(this);
   }

   private Collection<Table> loadTables() {
      return model.loadTables();
   }

   public void updateUIShowTables() {
      view.showTables(loadTables());
   }

   private void updateUIShowReservationResult(int reservationId) {
      view.showReservationTableResult(reservationId);
     
   }

   public void onReservationTable(Date orderDate, int tableNo, String name) {
      try {
         int reservationNo = model.reservationTable(orderDate, tableNo, name);
         updateUIShowReservationResult(reservationNo);
      } catch (RuntimeException e) {
         updateUIShowReservationResult(-1);
      }

   }
   public void onchangeReservationTable( int oldReservation, Date reservationDate, int tableNo, String name){
    try{
        int newReservationNo = model.changeReservationTable(oldReservation, reservationDate, tableNo, name);
        updateUIShowReservationResult(newReservationNo);
    }
    catch(RuntimeException e){
        updateUIShowReservationResult(-1);

    }
   }
}
