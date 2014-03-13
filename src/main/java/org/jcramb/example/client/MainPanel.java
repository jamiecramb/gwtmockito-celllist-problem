package org.jcramb.example.client;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MainPanel extends Composite {

    private static MainPanelUiBinder uiBinder = GWT.create(MainPanelUiBinder.class);

    interface MainPanelUiBinder extends UiBinder<Widget, MainPanel> {
    }

    public MainPanel() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiField
    CellList<String> cellList;

    private Cell<String> myCell;

    public MainPanel(final Cell<String> myCell) {
        this.myCell = myCell;
    }

    @UiFactory
    public CellList<String> createCellList() {
        return new CellList<String>(this.myCell);
    }

    class MyCell extends AbstractCell<String> {

        @Override
        public void render(final com.google.gwt.cell.client.Cell.Context context, final String value,
                final SafeHtmlBuilder sb) {

        }

    }
}
