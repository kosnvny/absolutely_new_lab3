package person;

public enum Mood {
    ASTONISHED("упали в обморок от случившегося"), SAD("очень сильно огорчились и ушли по домам плакать"), HAPPY("начали петь чипи чипи чапа чапа"), COLD("вдруг стало всё равно на происходящее"), TIRED("не знает, что делать дальше со своей жизнью"), DEFAULT(", не зная, что их ждёт"), AMAZED("готовы взорваться от счастья");
    private String tr;
    Mood(String tr) {
        this.tr = tr;
    }

    public String getTr() {
        return tr;
    }
}
