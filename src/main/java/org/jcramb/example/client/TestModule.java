package org.jcramb.example.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class TestModule implements EntryPoint {

    @Override
    public void onModuleLoad() {
        RootPanel.get().add(new MainPanel(new CustomCell()));
    }
}