package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum a35 implements z0z {
    LARGE("large"),
    /* JADX INFO: Fake field, exist only in values array */
    SMALL("small"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("none");

    public final String a;

    a35(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
