package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum qgy implements v190 {
    ENTITY_FILTER_TYPE_UNKNOWN(0),
    ENTITY_FILTER_TYPE_ARTIST(1),
    ENTITY_FILTER_TYPE_TRACK(2),
    ENTITY_FILTER_TYPE_ALBUM(3),
    ENTITY_FILTER_TYPE_PLAYLIST(4),
    ENTITY_FILTER_TYPE_GENRE(5),
    ENTITY_FILTER_TYPE_PROFILE(6),
    ENTITY_FILTER_TYPE_AUDIOBOOK(7),
    UNRECOGNIZED(-1);

    public final int a;

    qgy(int i) {
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
