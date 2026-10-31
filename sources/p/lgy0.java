package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum lgy0 implements w190 {
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED(0),
    /* JADX INFO: Fake field, exist only in values array */
    MUST_USE(1),
    /* JADX INFO: Fake field, exist only in values array */
    EXPLICITLY_IGNORABLE(2);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    lgy0(int i) {
        this.a = i;
    }

    @Override // p.w190
    public final int getNumber() {
        return this.a;
    }
}
