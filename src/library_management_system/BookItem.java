package library_management_system;

import java.util.Date;

public class BookItem extends Book {
   private String barCode;
   private boolean isReferenceOnly;
   private BookStatus status;
   private Date borrowedAt;
   private Date dueDate;
   private Rack placedAt;
   private Date dateOfPurchase;
   private Date publicationDate;
   private BookFormat format;
   
   
//   public boolean checkout() {
//	   
//   }
}
