package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum z65 implements z0z {
    SHOW_UPSELL("show_upsell"),
    /* JADX INFO: Fake field, exist only in values array */
    HIDE_CAROUSEL("hide_carousel");

    public final String a;

    z65(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
