import org.junit.jupiter.api.Test;

class GeometricObjectTesting {

  @Test
  void test() {
    Object[] objects = {new Square(), new Square(), new Square(), new Square(), new Square()};
    {
      for (int i = 0; i < objects.length; i++) {
        if (objects[i] instanceof Colorable) {
          ((Colorable) objects[i]).howToColor();
        }
      }
    }
  }
}


