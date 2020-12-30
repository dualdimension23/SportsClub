import java.math.BigDecimal;

public enum Sports {
   ARCHERY,
   BASKETBALL,
   CLIMBING {
      @Override
      public BigDecimal getFeeFactor() {
         BigDecimal feeFactor = new BigDecimal(1.2);
         return feeFactor;
      }
   },
   DIVING {
      @Override
      public BigDecimal getFeeFactor() {
         BigDecimal feeFactor = new BigDecimal(1.8);
         return feeFactor;
      }
   },
   FOOTBALL,
   GOLF {
      @Override
      public BigDecimal getFeeFactor() {
         BigDecimal feeFactor = new BigDecimal(2.1);
         return feeFactor;
      }
   },
   HANDBALL,
   HOCKEY,
   MOUNTAINBIKING,
   PARKOUR;
   public BigDecimal getFeeFactor() {
      BigDecimal feeFactor = new BigDecimal(1);
      return feeFactor;
   };
   public BigDecimal getFee(BigDecimal feePerSports) {
      // TODO
      // calculate fees depending on sport club’s feePerSports *feeFactor
      BigDecimal feeFactor = new BigDecimal(1);
      return feeFactor;
   };
}