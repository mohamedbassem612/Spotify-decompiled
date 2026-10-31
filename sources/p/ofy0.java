package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum ofy0 implements w190 {
    CONCLUSION_CONDITION(0),
    RETURNS_CONDITION(1),
    HOLDSIN_CONDITION(2);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    ofy0(int i) {
        this.a = i;
    }

    @Override // p.w190
    public final int getNumber() {
        return this.a;
    }
}
