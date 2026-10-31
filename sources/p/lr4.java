package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum lr4 implements z0z {
    CONTROL(rca.b),
    /* JADX INFO: Fake field, exist only in values array */
    FADE_SHIMMER("fade_shimmer"),
    TEXT_PRINTING("text_printing");

    public final String a;

    lr4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
