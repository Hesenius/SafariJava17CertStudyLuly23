package exceptionstuff;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Ex1 {
  void doStuff() throws IOException {}

  void doStuff2() throws FileNotFoundException {}
  void doStuff3() throws SQLException {}

  void tryStuff() throws IOException, SQLException {
    try {
      doStuff();
      doStuff2();
      doStuff3();
      // MUST NOT have parent-child relationship among types
      // in a "Multi-catch" clause
//    } catch (SQLException | FileNotFoundException | IOException ioe){
    } catch (SQLException | IOException ioe) {
//    } catch (Exception ioe) {
//      ioe = ioe; // make it not effectively final
      System.out.println("Bad");
      throw ioe; // provided this is final, or effectively final
//    } catch (FileNotFoundException ioe) {
      // handle both exceptions
//    } catch (IOException ioe) {
//    } catch (SQLException ioe) {
    } finally {

    }
  }
}
