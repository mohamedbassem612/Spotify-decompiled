package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum iij0 implements v190 {
    ARTIST_ROLE_UNKNOWN(0),
    ARTIST_ROLE_MAIN_ARTIST(1),
    ARTIST_ROLE_FEATURED_ARTIST(2),
    ARTIST_ROLE_REMIXER(3),
    ARTIST_ROLE_ACTOR(4),
    ARTIST_ROLE_COMPOSER(5),
    ARTIST_ROLE_CONDUCTOR(6),
    ARTIST_ROLE_ORCHESTRA(7);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    iij0(int i) {
        this.a = i;
    }

    public static iij0 a(int i) {
        switch (i) {
            case 0:
                return ARTIST_ROLE_UNKNOWN;
            case 1:
                return ARTIST_ROLE_MAIN_ARTIST;
            case 2:
                return ARTIST_ROLE_FEATURED_ARTIST;
            case 3:
                return ARTIST_ROLE_REMIXER;
            case 4:
                return ARTIST_ROLE_ACTOR;
            case 5:
                return ARTIST_ROLE_COMPOSER;
            case 6:
                return ARTIST_ROLE_CONDUCTOR;
            case 7:
                return ARTIST_ROLE_ORCHESTRA;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.a;
    }
}
