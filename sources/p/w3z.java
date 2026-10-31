package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum w3z implements v190 {
    EPISODE_GATED_VALUE_PROP_UNKNOWN(0),
    EPISODE_GATED_VALUE_PROP_UNSPECIFIED(1),
    EPISODE_GATED_VALUE_PROP_AD_FREE(2),
    EPISODE_GATED_VALUE_PROP_EXTENDED(3),
    EPISODE_GATED_VALUE_PROP_EARLY_ACCESS(4),
    EPISODE_GATED_VALUE_PROP_VIDEO(5),
    EPISODE_GATED_VALUE_PROP_FULL_LENGTH_EPISODES(6),
    EPISODE_GATED_VALUE_PROP_NONE(7),
    UNRECOGNIZED(-1);

    public final int a;

    w3z(int i) {
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
