package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum zrd {
    c(10, "SMALL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19(12, "MEDIUM");

    public final byte a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    zrd(int i, String str) {
        this.a = i;
        this.b = i;
    }
}
