import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class MyArrayListTest {
  @Test
  void testToString(){
    assertThat(new MyArrayList().toString()).isEqualTo("");
  }
}
