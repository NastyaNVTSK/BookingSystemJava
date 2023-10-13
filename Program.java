import java.util.Date;

import Models.TableModel;
import Presenter.BookingPresenter;
import Presenter.Model;
import Views.BookingView;

public class Program {

   public static void main(String[] args) {
      Model tableModel = new TableModel();
      BookingView bookingView = new BookingView();
      BookingPresenter presenter = new BookingPresenter(tableModel, bookingView);
      presenter.updateUIShowTables();
      bookingView.reservationTable(new Date(), 4, "Анастасия");
      bookingView.changeReservationTable(4, new Date(), 3, "Анстасия");
   }
}
