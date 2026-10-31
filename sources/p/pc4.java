package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum pc4 implements z0z {
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    WARNING("warning"),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR("error");

    public final String a;

    pc4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
