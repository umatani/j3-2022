class Leap {
  static final int START = 1990;
  static final int END   = 2110;

  static boolean isleap(int y) {
    if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
      return true;
    else
      return false;
  }

  public static void main(String args[]) {
    for (int year = START; year <= END; year++) {
      if (isleap(year)) /* found a leap year */
        System.out.print(" " + year);
    }
    System.out.println(); // line feed
  }
}
