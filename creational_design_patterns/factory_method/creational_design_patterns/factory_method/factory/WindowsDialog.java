package creational_design_patterns.factory_method.factory;

import creational_design_patterns.factory_method.buttons.*;


/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}