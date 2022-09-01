package com.springboot.school.view;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    private Button submit;

    private FormLayout form;

    public MainView() {
        VerticalLayout content = new VerticalLayout();
        add(content);
        initForm();
        content.add(form);
    }

    private void initForm() {
        form = new FormLayout();
        submit = new Button("Submit");
        submit.addClickListener((e) -> {
            System.out.println("Press Submit");
        });
        form.add(submit);
    }
}
