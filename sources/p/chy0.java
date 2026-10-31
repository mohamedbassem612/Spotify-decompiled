package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum chy0 implements w190 {
    LANGUAGE_VERSION(0),
    COMPILER_VERSION(1),
    API_VERSION(2);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    chy0(int i) {
        this.a = i;
    }

    @Override // p.w190
    public final int getNumber() {
        return this.a;
    }
}
