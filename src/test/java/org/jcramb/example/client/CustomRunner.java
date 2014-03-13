package org.jcramb.example.client;

import java.util.Collection;

import org.junit.runners.model.InitializationError;

import com.google.gwt.user.cellview.client.CellList;
import com.google.gwtmockito.GwtMockitoTestRunner;

public class CustomRunner extends GwtMockitoTestRunner {

    public CustomRunner(final Class<?> unitTestClass) throws InitializationError {
        super(unitTestClass);
    }

    @Override
    protected Collection<Class<?>> getClassesToStub() {
        Collection<Class<?>> classesToStub = super.getClassesToStub();
        classesToStub.add(CellList.class);
        return classesToStub;
    }
}
