package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum vfy0 implements w190 {
    TRUE(0),
    FALSE(1),
    NULL(2);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    vfy0(int i) {
        this.a = i;
    }

    @Override // p.w190
    public final int getNumber() {
        return this.a;
    }
}
