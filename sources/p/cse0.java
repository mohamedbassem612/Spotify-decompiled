package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum cse0 implements ohy0 {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    cse0(int i2) {
        this.a = i2;
    }

    @Override // p.ohy0
    public final int getNumber() {
        return this.a;
    }
}
