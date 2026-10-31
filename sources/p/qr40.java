package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum qr40 implements v190 {
    VOTING_WIDGET_STATE_UNSPECIFIED(0),
    VOTING_WIDGET_STATE_AVAILABLE(1),
    VOTING_WIDGET_STATE_AVAILABLE_VOTES_USED(2),
    VOTING_WIDGET_STATE_CLOSED(3),
    UNRECOGNIZED(-1);

    public final int a;

    qr40(int i) {
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
