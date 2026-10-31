package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.a410[], still in use, count: 1, list:
  (r0v1 p.a410[]) from 0x006e: CONSTRUCTOR (r0v1 p.a410[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:111) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class a410 {
    /* JADX INFO: Fake field, exist only in values array */
    RECENTLY_PLAYED("com.spotify.recently-played"),
    /* JADX INFO: Fake field, exist only in values array */
    BROWSE("com.spotify.browse"),
    /* JADX INFO: Fake field, exist only in values array */
    YOUR_LIBRARY("com.spotify.your-library"),
    /* JADX INFO: Fake field, exist only in values array */
    YOUR_ALBUMS("com.spotify.your-albums"),
    /* JADX INFO: Fake field, exist only in values array */
    YOUR_ARTISTS("com.spotify.your-artists"),
    /* JADX INFO: Fake field, exist only in values array */
    YOUR_PLAYLISTS("com.spotify.your-playlists"),
    /* JADX INFO: Fake field, exist only in values array */
    YOUR_PODCASTS("com.spotify.your-podcasts"),
    /* JADX INFO: Fake field, exist only in values array */
    YOUR_AUDIOBOOKS("com.spotify.your-audiobooks"),
    /* JADX INFO: Fake field, exist only in values array */
    DOWNLOADED("com.spotify.downloaded"),
    /* JADX INFO: Fake field, exist only in values array */
    OFFLINE("com.spotify.offline");

    public static final /* synthetic */ t0z c;
    public final String a;

    static {
        c = new t0z(a410VarArr);
    }

    public a410(String str) {
        super(str, i);
        this.a = str;
    }

    public static a410 valueOf(String str) {
        return (a410) Enum.valueOf(a410.class, str);
    }

    public static a410[] values() {
        return (a410[]) b.clone();
    }
}
