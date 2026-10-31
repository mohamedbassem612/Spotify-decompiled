package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum o111 implements v190 {
    RECOMMENDATIONS_TYPE_UNKNOWN(0),
    RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_ARTIST(1),
    RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_GENRE(2),
    RECOMMENDATIONS_TYPE_PODCASTS_FOR_CATEGORY(3),
    RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_TRACK(4),
    RECOMMENDATIONS_TYPE_PERSONALIZED_PODCASTS_FOR_CATEGORY(6),
    UNRECOGNIZED(-1);

    public final int a;

    o111(int i2) {
        this.a = i2;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
