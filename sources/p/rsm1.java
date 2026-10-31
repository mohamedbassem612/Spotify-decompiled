package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum rsm1 implements v190 {
    NAME(0),
    RECENTLY_ADDED(1),
    CREATOR(2),
    CUSTOM(4),
    RECENTLY_UPDATED(5),
    RECENTLY_PLAYED_OR_ADDED(6),
    RELEVANCE(7),
    EVENT_START_TIME(8),
    RELEASE_DATE(9),
    RECENTS(10),
    UNRECOGNIZED(-1);

    public final int a;

    rsm1(int i) {
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
