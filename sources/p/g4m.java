package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum g4m implements v190 {
    CONTENT_RATING_UNSPECIFIED(0),
    CONTENT_RATING_EXPLICIT(1),
    CONTENT_RATING_18_PLUS(2),
    CONTENT_RATING_SOUTH_KOREA_19(3),
    CONTENT_RATING_EROTICA(4),
    UNRECOGNIZED(-1);

    public final int a;

    g4m(int i) {
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
