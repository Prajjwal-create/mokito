
package testcode;import static org.junit.jupiter.api.Assertions.*;import java.util.Arrays;
import java.util.Collections;import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;import businesscode.ColorBag;class ColorBagJunit5Test {
private ColorBag colorBag;
@BeforeEach
void setUp() throws Exception {
colorBag=new ColorBag();
colorBag.add("red");
colorBag.add("green");
colorBag.add("yellow");
colorBag.add("blue");
colorBag.add("violet");
colorBag.add("brown");
} @Test
@DisplayName("Added color should be in bag")
void testAdd() {
var newColor="pink";
colorBag.add(newColor);
assertTrue(colorBag.contains(newColor),"failure");
}


@Test
@DisplayName("Removed color should not be in the Bag")
void testRemove() {
var color="green";
colorBag.remove(color);
assertFalse(colorBag.contains(color),"failure");
}

@Test
@DisplayName("Color Bag Set should be transformed into List")
void testToList() {
var myList=Arrays.asList("red","green","yellow","blue","violet","brown");
var colorList=colorBag.toList();
Collections.sort(myList);
Collections.sort(colorList);
assertEquals(colorList, myList,"Failure");
}
@Test
void testSize() {
	   int bSize=colorBag.size();
		assertEquals(5,bSize,"failure");
	}

}

