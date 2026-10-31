package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum lo4 implements z0z {
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK("network");

    public final String a;

    lo4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
