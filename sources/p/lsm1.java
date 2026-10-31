package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum lsm1 implements v190 {
    UNKNOWN(0),
    PLAYLIST(1),
    SHOW(2),
    BOOK(3),
    ALBUM(4),
    ARTIST(5),
    AUTHOR(6),
    EVENT(7),
    WRITABLE(20),
    BY_YOU(21),
    BY_SPOTIFY(22),
    BY_OTHERS(23),
    IS_MIXED(24),
    FOLDER(25),
    PUBLISHED(26),
    PUBLISHABLE(27),
    EXCLUDE_WORKOUT(28),
    IN_PROGRESS(40),
    UNPLAYED(41),
    FINISHED(42),
    UPCOMING(60),
    VENUE(61),
    PAST(62),
    DOWNLOADED(100),
    UNRECOGNIZED(-1);

    public final int a;

    lsm1(int i) {
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
