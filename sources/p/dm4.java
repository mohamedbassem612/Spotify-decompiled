package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum dm4 implements z0z {
    ENABLED(rca.d),
    /* JADX INFO: Fake field, exist only in values array */
    DISABLED(rca.e),
    FORCED("forced");

    public final String a;

    dm4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
