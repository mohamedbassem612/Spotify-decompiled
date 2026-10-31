package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum uqu0 implements v190 {
    NO_FILTER(0),
    AVAILABLE(1),
    AVAILABLE_OFFLINE(2),
    ARTIST_NOT_BANNED(3),
    NOT_BANNED(4),
    NOT_EXPLICIT(5),
    NOT_EPISODE(6),
    NOT_RECOMMENDATION(7),
    UNPLAYED(8),
    IN_PROGRESS(9),
    NOT_FULLY_PLAYED(10),
    NOT_EPISODE_TRAILER(11),
    RECOMMENDATION(12),
    VIDEO_CONTENT(13),
    NOT_VIDEO_CONTENT(14),
    FINISHED(15),
    NOT_LOCAL_TRACK(16),
    NOT_PAYWALLED(17),
    NOT_FULLY_PLAYED_OR_IN_PROGRESS(18),
    ARTIST_NOT_FOLLOWED(19),
    VIDEO_AVAILABLE_OFFLINE(20),
    VIDEO_NOT_AVAILABLE_OFFLINE(21),
    UNRECOGNIZED(-1);

    public final int a;

    uqu0(int i) {
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
