package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum nsz implements v190 {
    FAILURE_REASON_UNSPECIFIED(0),
    FAILURE_REASON_TRANSPORT_ERROR(1),
    FAILURE_REASON_TIMEOUT(2),
    FAILURE_REASON_CANCELLED(3),
    UNRECOGNIZED(-1);

    public final int a;

    nsz(int i) {
        this.a = i;
    }

    @Override // p.v190
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
