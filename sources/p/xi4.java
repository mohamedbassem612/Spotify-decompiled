package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum xi4 implements z0z {
    DEFAULT("default"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRING("expiring"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED("expired");

    public final String a;

    xi4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
