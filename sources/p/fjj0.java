package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum fjj0 implements v190 {
    UNKNOWN(0),
    NONE(1),
    ALLOWED(2),
    MANDATORY(3);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    fjj0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a;
    }
}
