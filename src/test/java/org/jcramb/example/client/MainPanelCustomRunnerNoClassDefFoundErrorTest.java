package org.jcramb.example.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

/**
 * This test class blows up on the creation of the CellList with a class cast exception.
 */
@RunWith(CustomRunner.class)
public class MainPanelCustomRunnerNoClassDefFoundErrorTest {

    @Test
    public void testCreateCellList() {
        MainPanel mainPanel = new MainPanel(Mockito.mock(CustomCell.class));
        mainPanel.createCellList();
    }
}