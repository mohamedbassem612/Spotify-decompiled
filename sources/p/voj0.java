package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum voj0 implements v190 {
    METRIC_UNSPECIFIED(0),
    METRIC_PLAYLIST_SAVE_COUNT_DELTA(1),
    METRIC_UNIQUE_LISTENER_COUNT(2),
    METRIC_LISTENING_TIME_SECONDS(3),
    UNRECOGNIZED(-1);

    public final int a;

    voj0(int i) {
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
