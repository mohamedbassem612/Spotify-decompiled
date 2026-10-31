package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum fz4 implements z0z {
    FAR("far"),
    /* JADX INFO: Fake field, exist only in values array */
    CLOSE("close"),
    /* JADX INFO: Fake field, exist only in values array */
    IMMEDIATE("immediate");

    public final String a;

    fz4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
