package string;

import java.util.Arrays;

public class FileName {

  public static void main(String[] args) {
    String[] folders = {"c:¥javadev", "c:¥user¥"};
    String fileName = "readme.txt";
    String[] filePaths = buildFilePaths(folders, fileName);
    System.out.println(Arrays.toString(filePaths));
  }

  private static String[] buildFilePaths(String[] folders, String fileName) {
    final String pathSeparator = "¥";
    return Arrays.stream(folders)
        .map(folder -> ensureTrailingSeparator(folder, pathSeparator) + fileName)
        .toArray(String[]::new);
  }

  private static String ensureTrailingSeparator(String path, String pathSeparator) {
    return path.endsWith(pathSeparator) ? path : path + pathSeparator;
  }
}
