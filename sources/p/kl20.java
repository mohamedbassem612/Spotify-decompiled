package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum kl20 {
    Track(40),
    Kallax(554),
    Episode(777),
    Artist(951),
    Album(907),
    PreRelease(907),
    Playlist(955),
    PodcastOrAudiobook(899),
    Genre(1023),
    User(1015),
    Venue(1023),
    PodcastChapter(777),
    Author(959);

    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    kl20(int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        boolean z3 = (i & 4) == 0;
        boolean z4 = (i & 16) == 0;
        boolean z5 = (i & 32) == 0;
        boolean z6 = (i & 64) == 0;
        boolean z7 = (i & 128) == 0;
        boolean z8 = (i & 256) == 0;
        boolean z9 = (i & 512) == 0;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
    }
}
