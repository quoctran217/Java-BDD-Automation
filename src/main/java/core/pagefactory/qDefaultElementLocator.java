package core.pagefactory;

import core.element.ElementWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.pagefactory.AbstractAnnotations;
import org.openqa.selenium.support.pagefactory.Annotations;

import java.lang.reflect.Field;
import java.util.List;

public class qDefaultElementLocator implements qElementLocator {
    private final qSearchContext searchContext;
    private final boolean shouldCache;
    private final By by;
    private ElementWrapper cachedElement;
    private List<ElementWrapper> cachedElementList;

    public qDefaultElementLocator(qSearchContext searchContext, Field field) {
        this(searchContext, (AbstractAnnotations)(new Annotations(field)));
    }

    public qDefaultElementLocator(qSearchContext searchContext, AbstractAnnotations annotations) {
        this.searchContext = searchContext;
        this.shouldCache = annotations.isLookupCached();
        this.by = annotations.buildBy();
    }

    public ElementWrapper findElement() {
        if (this.cachedElement != null && this.shouldCache()) {
            return this.cachedElement;
        } else {
            ElementWrapper element = this.searchContext.findElement(this.by);
            if (this.shouldCache()) {
                this.cachedElement = element;
            }

            return element;
        }
    }

    public List<ElementWrapper> findElements() {
        if (this.cachedElementList != null && this.shouldCache()) {
            return this.cachedElementList;
        } else {
            List<ElementWrapper> elements = this.searchContext.findElements(this.by);
            if (this.shouldCache()) {
                this.cachedElementList = elements;
            }

            return elements;
        }
    }

    protected boolean shouldCache() {
        return this.shouldCache;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " '" + this.by + "'";
    }
}
