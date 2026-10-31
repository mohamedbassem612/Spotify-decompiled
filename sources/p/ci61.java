package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum ci61 implements v190 {
    SESSION_STATUS_UNSPECIFIED(0),
    SESSION_STATUS_PENDING(1),
    SESSION_STATUS_COMPLETE(2),
    SESSION_STATUS_TERMINATED(3),
    SESSION_STATUS_REDEEMED(4),
    UNRECOGNIZED(-1);

    public final int a;

    ci61(int i) {
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
