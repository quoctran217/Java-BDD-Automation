package core.pagefactory;

import core.element.ElementWrapper;
import org.openqa.selenium.By;

import java.util.List;

public interface qSearchContext {

    List<ElementWrapper> findElements(By var1);

    ElementWrapper findElement(By var1);
}
