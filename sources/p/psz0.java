package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum psz0 implements v190 {
    CONTENT_RATING_TAG_UNSPECIFIED(0),
    CONTENT_RATING_TAG_EXPLICIT(1),
    CONTENT_RATING_TAG_MOGEF_19(2),
    CONTENT_RATING_TAG_SPOTIFY_18_PLUS(3),
    CONTENT_RATING_TAG_EROTIC(4),
    UNRECOGNIZED(-1);

    public final int a;

    psz0(int i) {
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
