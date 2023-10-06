package app.controller;

import app.model.AppModel;
import app.view.AppView;

public class Controller {

    public void runApp() {
        AppView view = new AppView();
        AppModel model = new AppModel();

        String color = view.getData();
        view.getOutput(model.getResult(color));
    }
}
