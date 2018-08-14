package core.pagefactory;

import core.element.ElementWrapper;

import java.util.List;

public interface qElementLocator {
    ElementWrapper findElement();

    List<ElementWrapper> findElements();
}
