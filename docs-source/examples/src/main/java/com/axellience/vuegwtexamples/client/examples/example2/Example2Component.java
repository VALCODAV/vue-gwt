package com.axellience.vuegwtexamples.client.examples.example2;

import com.axellience.vuegwt.client.VueComponent;
import com.axellience.vuegwt.jsr69.component.annotations.Component;
import jsinterop.annotations.JsType;

@JsType
@Component
public class Example2Component extends VueComponent {
    public String linkTarget;
    public String linkName;

    @Override
    public void created() {
        this.linkTarget = "https://github.com/Axellience/vue-gwt";
        this.linkName = "Hello Vue GWT!";
    }
}