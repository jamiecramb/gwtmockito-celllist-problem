package org.jcramb.example.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import com.google.gwtmockito.GwtMockitoTestRunner;

/**
 * This test class blows up on the creation of the CellList with a class cast exception.
 */
@RunWith(GwtMockitoTestRunner.class)
public class MainPanelClassCastExceptionTest {

    @Test
    public void testCreateCellList() {
        MainPanel mainPanel = new MainPanel(Mockito.mock(CustomCell.class));
        mainPanel.createCellList();
    }

}