package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum ukc0 implements v190 {
    LINK_SESSION_STATUS_UNSPECIFIED(0),
    LINK_SESSION_STATUS_AWAITING_DEPENDENT(1),
    LINK_SESSION_STATUS_AWAITING_PARENT(2),
    LINK_SESSION_STATUS_AWAITING_COMPLETION(3),
    LINK_SESSION_STATUS_COMPLETE(4),
    LINK_SESSION_STATUS_REDEEMED(5),
    LINK_SESSION_STATUS_TERMINATED(6),
    UNRECOGNIZED(-1);

    public final int a;

    ukc0(int i) {
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
