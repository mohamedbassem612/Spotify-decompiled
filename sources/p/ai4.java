package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum ai4 implements z0z {
    /* JADX INFO: Fake field, exist only in values array */
    COLORED("colored"),
    /* JADX INFO: Fake field, exist only in values array */
    BOLD("bold"),
    DEFAULT("default");

    public final String a;

    ai4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
