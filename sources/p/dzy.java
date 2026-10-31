package p;

import java.util.Map;
import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 p.dzy, still in use, count: 1, list:
  (r1v0 p.dzy) from 0x03bc: INVOKE ("social-feed"), (r1v0 p.dzy) STATIC call: p.oqn1.n(java.lang.Object, java.lang.Object):p.mmr0 A[WRAPPED] (LINE:957)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dzy {
    /* JADX INFO: Fake field, exist only in values array */
    EF1(2131951806, "ACTIVITY"),
    f(0, "ADVERTISEMENT"),
    g(0, "ALBUM"),
    h(0, "ALBUM_RADIO"),
    i(0, "ARTIST"),
    t(0, "AUDIOBOOK"),
    X(0, "ARTIST_RADIO"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8(0, "BROWSE"),
    Y(0, "CHARTS"),
    Z(0, "DAILY_MIX"),
    N0(0, "ENDLESS_FEED"),
    O0(2131956086, "FOLLOW_FEED"),
    P0(0, "GENRE_RADIO"),
    Q0(0, "HOME"),
    R0(0, "LIVE_ROOM_LIVE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(2131957653, "LOCAL_FILES"),
    S0(0, "MUSIC_AUTOPLAY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(0, "NEW_MUSIC_TUESDAY"),
    T0(0, "PLAY_QUEUE"),
    U0(0, "PLAYLIST"),
    V0(0, "PLAYLIST_FOLDER"),
    W0(0, "PLAYLIST_RADIO"),
    X0(0, "PODCAST_AUTOPLAY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(0, "PROFILE"),
    Y0(0, "RADIO"),
    Z0(0, "SEARCH"),
    a1(0, "SHOW"),
    b1(0, "SHOW_VIDEO"),
    c1(0, "SUGGESTED_TRACK"),
    d1(0, "TRACK"),
    e1(0, "TRACK_RADIO"),
    f1(2131954024, "YOUR_EPISODES"),
    g1(2131953998, "YOUR_LIBRARY"),
    h1(0, "YOUR_LIBRARY_ALBUM"),
    i1(0, "YOUR_LIBRARY_ARTIST"),
    j1(2131954001, "YOUR_LIBRARY_PODCAST_DOWNLOADS"),
    k1(2131954002, "YOUR_LIBRARY_PODCAST_EPISODES"),
    l1(2131954003, "YOUR_LIBRARY_PODCAST_FOLLOWING"),
    m1(2131953998, "YOUR_LIBRARY_TRACKS"),
    n1(2131954018, "YOUR_MUSIC"),
    o1(0, "YOUR_MUSIC_ALBUM"),
    p1(0, "YOUR_MUSIC_ARTIST"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(2131953992, "YOUR_MUSIC_OFFLINED_EPISODES"),
    q1(2131954018, "YOUR_MUSIC_TRACKS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(2131953993, "YOUR_MUSIC_UNPLAYED_EPISODES"),
    r1(0, "UNKNOWN");

    public static final gtv0 c;
    public static final Set d;
    public static final Map e;
    public final bx21 a;
    public final bx21 b;

    static {
        dzy dzyVar = g;
        dzy dzyVar2 = i;
        dzy dzyVar3 = Y;
        dzy dzyVar4 = N0;
        dzy dzyVar5 = O0;
        dzy dzyVar6 = Q0;
        dzy dzyVar7 = T0;
        dzy dzyVar8 = U0;
        dzy dzyVar9 = V0;
        dzy dzyVar10 = EF2;
        dzy dzyVar11 = Z0;
        dzy dzyVar12 = f1;
        dzy dzyVar13 = g1;
        dzy dzyVar14 = h1;
        dzy dzyVar15 = i1;
        dzy dzyVar16 = j1;
        dzy dzyVar17 = k1;
        dzy dzyVar18 = l1;
        dzy dzyVar19 = m1;
        dzy dzyVar20 = n1;
        dzy dzyVar21 = o1;
        dzy dzyVar22 = p1;
        c = new gtv0((byte) 14);
        d = dm61.z0(dzyVar12, dzyVar13, dzyVar14, dzyVar15, dzyVar16, dzyVar17, dzyVar18, dzyVar19);
        e = sqg0.J(oqn1.n("album", dzyVar), oqn1.n("com.spotify.feature.album", dzyVar), oqn1.n("artist", dzyVar2), oqn1.n("com.spotify.feature.artist", dzyVar2), oqn1.n("chart", dzyVar3), oqn1.n("discover-weekly", dzyVar8), oqn1.n("library-collection", dzyVar20), oqn1.n("library-collection-album", dzyVar21), oqn1.n("library-collection-artist", dzyVar22), oqn1.n("library-collection-missing-album", dzyVar), oqn1.n("localfiles", dzyVar), oqn1.n("playlist", dzyVar8), oqn1.n("enhanced-session", dzyVar8), oqn1.n("playlistfolder", dzyVar9), oqn1.n("playlists", dzyVar9), oqn1.n("playqueue", dzyVar7), oqn1.n("profile", dzyVar10), oqn1.n("search", dzyVar11), oqn1.n("com.spotify.feature.search", dzyVar11), oqn1.n("com.spotify.feature.profile", dzyVar10), oqn1.n("social-feed", dzyVar), oqn1.n("com.spotify.feature.browse", dzyVar), oqn1.n("com.spotify.feature.newmusictuesday", dzyVar), oqn1.n("com.spotify.feature.chart", dzyVar3), oqn1.n("com.spotify.feature.home", dzyVar6), oqn1.n("home", dzyVar6), oqn1.n("show-format", dzyVar8), oqn1.n("follow-feed", dzyVar5), oqn1.n("endless-feed", dzyVar4));
    }

    public dzy(int i2, String str) {
        super(str, i);
        this.a = new bx21(i);
        this.b = new bx21(i2);
    }

    public static dzy valueOf(String str) {
        return (dzy) Enum.valueOf(dzy.class, str);
    }

    public static dzy[] values() {
        return (dzy[]) s1.clone();
    }
}
