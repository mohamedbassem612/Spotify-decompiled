package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum loy0 implements v190 {
    PUBLISHED_STATE_UNSPECIFIED(0),
    PUBLISHED_STATE_NOT_PUBLISHED(1),
    PUBLISHED_STATE_PUBLISHED(2);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    loy0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a;
    }
}
