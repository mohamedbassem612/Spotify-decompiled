package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum lyk1 implements v190 {
    VOTING_STATE_TYPE_UNSPECIFIED(0),
    VOTING_STATE_TYPE_DISABLED(1),
    VOTING_STATE_TYPE_NOT_STARTED(2),
    VOTING_STATE_TYPE_AVAILABLE(3),
    VOTING_STATE_TYPE_AVAILABLE_VOTES_USED(4),
    VOTING_STATE_TYPE_CLOSED(5),
    VOTING_STATE_TYPE_USER_INELIGIBLE(6),
    VOTING_STATE_TYPE_RESULTS(7),
    UNRECOGNIZED(-1);

    public final int a;

    lyk1(int i) {
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
