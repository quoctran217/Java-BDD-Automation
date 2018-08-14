package core.pagefactory;

import java.lang.reflect.Field;

public final class qDefaultElementLocatorFactory implements qElementLocatorFactory{
    private final qSearchContext searchContext;

    public qDefaultElementLocatorFactory(qSearchContext searchContext) {
        this.searchContext = searchContext;
    }

    public qElementLocator createLocator(Field field) {
        return new qDefaultElementLocator(this.searchContext, field);
    }
}
