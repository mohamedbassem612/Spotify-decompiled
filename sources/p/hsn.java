package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum hsn implements v190 {
    ORIGIN_TYPE_UNSPECIFIED(0),
    ORIGIN_TYPE_FRESH(1),
    ORIGIN_TYPE_CLONED(2),
    ORIGIN_TYPE_AGENTIC(3);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    hsn(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a;
    }
}
