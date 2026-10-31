package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum bhy0 implements w190 {
    WARNING(0),
    ERROR(1),
    HIDDEN(2);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    bhy0(int i) {
        this.a = i;
    }

    @Override // p.w190
    public final int getNumber() {
        return this.a;
    }
}
