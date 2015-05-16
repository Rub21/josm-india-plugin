
package org.openstreetmap.josm.plugins.india;

import org.openstreetmap.josm.gui.IconToggleButton;
import org.openstreetmap.josm.gui.MapFrame;
import org.openstreetmap.josm.plugins.Plugin;
import org.openstreetmap.josm.plugins.PluginInformation;

public class India extends Plugin {

    private IconToggleButton btn;
    protected static IndiaDialog indiaDialog;


    public India(PluginInformation info) {
        super(info);
    }


    @Override
    public void mapFrameInitialized(MapFrame oldFrame, MapFrame newFrame) {
        if (newFrame != null) {
            newFrame.addToggleDialog(indiaDialog = new IndiaDialog());
        }
    }
}
