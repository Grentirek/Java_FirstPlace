class BreakContinue {
        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                if (i == 4) {
                  break;//This is will stop the code. Output : 1, 2, 3.
                }
                System.out.println(i);
              }         
        }
    }

    class BreakContinue2 {
      public static void main(String[] args) {
          for (int i = 0; i < 10; i++) {
              if (i == 4) {
                continue;//But this is will continue the code and pass the "4" number.
              }
              System.out.println(i);
            }         
      }
  }
