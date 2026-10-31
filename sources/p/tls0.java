package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum tls0 implements v190 {
    CLAIM_FAIL_REASON_UNSPECIFIED(0),
    CLAIM_FAIL_REASON_ANONYMOUS(1),
    CLAIM_FAIL_REASON_NO_GRANT_FOUND(2),
    CLAIM_FAIL_REASON_GRANT_EXPIRED(3);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    tls0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a;
    }
}
