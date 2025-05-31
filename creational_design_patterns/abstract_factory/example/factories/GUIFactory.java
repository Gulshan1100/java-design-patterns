package creational_design_patterns.abstract_factory.example.factories;

import creational_design_patterns.abstract_factory.example.buttons.Button;
import creational_design_patterns.abstract_factory.example.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}