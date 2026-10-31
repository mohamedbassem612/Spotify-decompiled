package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum jno1 {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    jno1(int i) {
        this.a = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.a);
    }
}
