package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum e7d implements v190 {
    CAMPAIGN_STATE_UNSPECIFIED(0),
    CAMPAIGN_STATE_ACTIVE(1),
    CAMPAIGN_STATE_PAUSED(2),
    CAMPAIGN_STATE_CANCELLED(3),
    CAMPAIGN_STATE_COMPLETED(4),
    UNRECOGNIZED(-1);

    public final int a;

    e7d(int i) {
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
