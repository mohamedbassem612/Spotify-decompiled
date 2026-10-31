package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum vqu0 implements v190 {
    NO_SORT(0),
    ALBUM_ARTIST_NAME_ASC(1),
    ALBUM_ARTIST_NAME_DESC(2),
    TRACK_NUMBER_ASC(3),
    TRACK_NUMBER_DESC(4),
    DISC_NUMBER_ASC(5),
    DISC_NUMBER_DESC(6),
    ALBUM_NAME_ASC(7),
    ALBUM_NAME_DESC(8),
    ARTIST_NAME_ASC(9),
    ARTIST_NAME_DESC(10),
    NAME_ASC(11),
    NAME_DESC(12),
    ADD_TIME_ASC(13),
    ADD_TIME_DESC(14),
    ADDED_BY_ASC(15),
    ADDED_BY_DESC(16),
    DURATION_ASC(17),
    DURATION_DESC(18),
    SHOW_NAME_ASC(19),
    SHOW_NAME_DESC(20),
    PUBLISH_DATE_ASC(21),
    PUBLISH_DATE_DESC(22),
    PROVIDED_ASC(23),
    PROVIDED_DESC(24),
    UNRECOGNIZED(-1);

    public final int a;

    vqu0(int i) {
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
