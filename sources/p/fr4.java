package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum fr4 implements z0z {
    TITLE_MEDIUM("TitleMedium"),
    /* JADX INFO: Fake field, exist only in values array */
    TITLE_SMALL("TitleSmall");

    public final String a;

    fr4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
