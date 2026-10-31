package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum uij0 implements v190 {
    DEFAULT(0),
    SMALL(1),
    LARGE(2),
    XLARGE(3);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    uij0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a;
    }
}
