
package org.openstreetmap.josm.plugins.india;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.AbstractAction;
import static javax.swing.Action.NAME;
import static javax.swing.Action.SHORT_DESCRIPTION;
import static javax.swing.Action.SMALL_ICON;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.gui.SideButton;
import org.openstreetmap.josm.gui.dialogs.ToggleDialog;
import static org.openstreetmap.josm.tools.I18n.tr;
import org.openstreetmap.josm.tools.ImageProvider;
import org.openstreetmap.josm.tools.Shortcut;

/**
 *
 * @author ruben
 */
public class IndiaDialog extends ToggleDialog implements ActionListener {

    private final SideButton skipButton;

    JPanel valuePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JPanel jcontenpanel = new JPanel(new GridLayout(1, 0));

    public IndiaDialog() {

        super(tr("India"), "icontofix", tr("Open india window."),
                Shortcut.registerShortcut("tool:india", tr("Toggle: {0}", tr("India")),
                        KeyEvent.VK_F, Shortcut.CTRL_SHIFT), 75);

        skipButton = new SideButton(new AbstractAction() {
            {
                putValue(NAME, tr("Hello"));
                putValue(SMALL_ICON, ImageProvider.get("mapmode", "skip.png"));
                putValue(SHORT_DESCRIPTION, tr("Skip Error"));
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(Main.panel, "Hello word");
            }
        });

        createLayout(jcontenpanel, false, Arrays.asList(new SideButton[]{
            skipButton
        }));
        jcontenpanel.add(valuePanel);

        // Panels
        valuePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jcontenpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        // JComboBox for each task

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
