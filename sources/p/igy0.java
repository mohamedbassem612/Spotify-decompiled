package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum igy0 implements w190 {
    CLASS(0),
    PACKAGE(1),
    LOCAL(2);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    igy0(int i) {
        this.a = i;
    }

    @Override // p.w190
    public final int getNumber() {
        return this.a;
    }
}
