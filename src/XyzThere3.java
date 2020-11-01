public class XyzThere3 {
  public boolean xyzThere(String str) {
    for (int i = 0; i < str.length() - 2; i++) {
      if (str.startsWith("xyz", i) && (i == 0 || str.charAt(i - 1) != '.')) {
        return true;
      }
    }
    return false;
  }
}
