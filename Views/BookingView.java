package Views;

import java.util.Collection;
import java.util.Date;

import Models.Reservation;
import Models.Table;
import Presenter.View;
import Presenter.ViewObserver;

public class BookingView implements View{

    private ViewObserver observer;

    public void setObserver(ViewObserver observer){
        this.observer = observer;
    }
    

    public void showTables(Collection<Table> tables){
        for (Table table: tables){
            System.out.println(table);
        }
    }

    public void showReservationTableResult(int reservationId){
        if(reservationId > 0){
            System.out.printf("Столик успешо забронирован. Номер вашей брони: #%d\n", reservationId);
        }
        else{
            System.out.println("Неудалось забронировать столик. Попробуйте повторить операцию позже");
        }
    }

    public void reservationTable(Date orderDate, int tableNo, String name){
        observer.onReservationTable(orderDate, tableNo, name);

    }

    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        observer.onchangeReservationTable(oldReservation, reservationDate, tableNo, name);
    }
}
