package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum ogy0 implements w190 {
    IN(0),
    OUT(1),
    INV(2),
    STAR(3);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    ogy0(int i) {
        this.a = i;
    }

    @Override // p.w190
    public final int getNumber() {
        return this.a;
    }
}
