package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum rtb1 implements v190 {
    UNRECOGNISED(0),
    TIME_LISTENED_STAT(1),
    ARTIST_STAT(2),
    TRACK_STAT(3),
    SOCIAL_TIME_LISTENED_STAT(5),
    SOCIAL_ARTISTS_STAT(6),
    SOCIAL_TRACKS_STAT(7),
    UNRECOGNIZED(-1);

    public final int a;

    rtb1(int i) {
        this.a = i;
    }

    public static rtb1 a(int i) {
        if (i == 0) {
            return UNRECOGNISED;
        }
        if (i == 1) {
            return TIME_LISTENED_STAT;
        }
        if (i == 2) {
            return ARTIST_STAT;
        }
        if (i == 3) {
            return TRACK_STAT;
        }
        if (i == 5) {
            return SOCIAL_TIME_LISTENED_STAT;
        }
        if (i == 6) {
            return SOCIAL_ARTISTS_STAT;
        }
        if (i != 7) {
            return null;
        }
        return SOCIAL_TRACKS_STAT;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
