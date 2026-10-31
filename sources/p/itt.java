package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum itt implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    STATUS_UNKNOWN(0),
    STATUS_SUCCESS(1),
    STATUS_PERMISSION_UNAVAILABLE(2),
    STATUS_TIMEOUT(3),
    STATUS_FAILED(4),
    UNRECOGNIZED(-1);

    public final int a;

    itt(int i) {
        this.a = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
