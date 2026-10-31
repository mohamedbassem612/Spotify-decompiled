package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum yq40 implements v190 {
    ACTIVE(0),
    EXPANDED_TRIAL_ACTIVE(1),
    PREMIUM_TRIAL_ACTIVE(2),
    TRIAL_WITH_OFFLINE_ACTIVE(3),
    PREMIUM_NO_OFFLINE_ACTIVE(4),
    NO_TRIAL_HOLDOUT(5),
    TRIAL_DELAY(6),
    UNRECOGNIZED(-1);

    public final int a;

    yq40(int i) {
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
