package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum kg4 implements z0z {
    DISABLED(rca.e),
    /* JADX INFO: Fake field, exist only in values array */
    VARIANT_1("variant_1"),
    /* JADX INFO: Fake field, exist only in values array */
    VARIANT_2("variant_2");

    public final String a;

    kg4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
