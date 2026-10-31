package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum vgy0 implements w190 {
    IN(0),
    OUT(1),
    INV(2);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    vgy0(int i) {
        this.a = i;
    }

    @Override // p.w190
    public final int getNumber() {
        return this.a;
    }
}
