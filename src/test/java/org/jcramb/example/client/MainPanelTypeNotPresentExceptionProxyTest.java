package org.jcramb.example.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import com.google.gwt.user.cellview.client.CellList;
import com.google.gwtmockito.GwtMockitoTestRunner;
import com.google.gwtmockito.WithClassesToStub;

/**
 * This test class blows up with java.lang.ArrayStoreException: sun.reflect.annotation.TypeNotPresentExceptionProxy.
 */
@RunWith(GwtMockitoTestRunner.class)
@WithClassesToStub({
    CellList.class
})
public class MainPanelTypeNotPresentExceptionProxyTest {

    @Test
    public void testCreateCellList() {
        MainPanel mainPanel = new MainPanel(Mockito.mock(CustomCell.class));
        mainPanel.createCellList();
    }

}