package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum tnt implements v190 {
    DETAILS_TYPE_UNSPECIFIED(0),
    DETAILS_TYPE_LISTENING_MINUTES(1),
    DETAILS_TYPE_TRACKS(2),
    DETAILS_TYPE_ARTISTS(3),
    DETAILS_TYPE_SOCIAL_MINUTES_LISTENED(5),
    DETAILS_TYPE_SOCIAL_ARTISTS(6),
    DETAILS_TYPE_SOCIAL_TRACKS(7),
    DETAILS_TYPE_SOUND_TOWN(10),
    UNRECOGNIZED(-1);

    public final int a;

    tnt(int i) {
        this.a = i;
    }

    public static tnt a(int i) {
        if (i == 0) {
            return DETAILS_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return DETAILS_TYPE_LISTENING_MINUTES;
        }
        if (i == 2) {
            return DETAILS_TYPE_TRACKS;
        }
        if (i == 3) {
            return DETAILS_TYPE_ARTISTS;
        }
        if (i == 5) {
            return DETAILS_TYPE_SOCIAL_MINUTES_LISTENED;
        }
        if (i == 6) {
            return DETAILS_TYPE_SOCIAL_ARTISTS;
        }
        if (i == 7) {
            return DETAILS_TYPE_SOCIAL_TRACKS;
        }
        if (i != 10) {
            return null;
        }
        return DETAILS_TYPE_SOUND_TOWN;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
