package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum zfy0 implements w190 {
    /* JADX INFO: Fake field, exist only in values array */
    DECLARATION(0),
    /* JADX INFO: Fake field, exist only in values array */
    FAKE_OVERRIDE(1),
    /* JADX INFO: Fake field, exist only in values array */
    DELEGATION(2),
    /* JADX INFO: Fake field, exist only in values array */
    SYNTHESIZED(3);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    zfy0(int i) {
        this.a = i;
    }

    @Override // p.w190
    public final int getNumber() {
        return this.a;
    }
}
