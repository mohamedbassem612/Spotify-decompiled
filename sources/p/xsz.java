package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum xsz implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    kSuccess(0),
    kWsUpgradeUnauthorized(1),
    kTransportFailure(2),
    /* JADX INFO: Fake field, exist only in values array */
    kInvalidUri(3),
    /* JADX INFO: Fake field, exist only in values array */
    kSslCacertBadfile(4),
    UNRECOGNIZED(-1);

    public final int a;

    xsz(int i) {
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
