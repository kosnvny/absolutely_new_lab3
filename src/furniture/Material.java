package furniture;

public enum Material {
    WOOD("дерево"), PLASTIC("пластик"), GLASS("стекло"), CLOTH("ткань");
    private final String translation;
    Material(String translation) {
        this.translation = translation;
    }
    public String getTranslation() {
        return translation;
    }
}
