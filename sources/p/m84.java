package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum m84 implements z0z {
    /* JADX INFO: Fake field, exist only in values array */
    ENABLED(rca.d),
    DISABLED(rca.e),
    /* JADX INFO: Fake field, exist only in values array */
    DISABLED_ALLOW_OVERRIDE("disabled_allow_override");

    public final String a;

    m84(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
