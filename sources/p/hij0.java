package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum hij0 implements v190 {
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
    hij0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a;
    }
}
