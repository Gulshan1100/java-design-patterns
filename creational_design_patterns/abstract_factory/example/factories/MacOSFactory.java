package creational_design_patterns.abstract_factory.example.factories;

import creational_design_patterns.abstract_factory.example.buttons.Button;
import creational_design_patterns.abstract_factory.example.buttons.MacOSButton;
import creational_design_patterns.abstract_factory.example.checkboxes.Checkbox;
import creational_design_patterns.abstract_factory.example.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}