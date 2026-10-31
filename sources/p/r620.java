package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.r620[], still in use, count: 1, list:
  (r0v1 p.r620[]) from 0x0069: CONSTRUCTOR (r0v1 p.r620[]) A[WRAPPED] (LINE:106) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r620 {
    TOP(null, null),
    SHOWS(null, null),
    TRACKS(null, null),
    ALBUMS(null, null),
    ARTISTS(null, null),
    EPISODES(null, null),
    PLAYLISTS(null, null),
    AUDIOBOOKS(null, null),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYLIST_BY_YOU("owned_by_you", PLAYLISTS);

    public static final /* synthetic */ t0z Y;
    public final String a;
    public final r620 b;

    static {
        Y = new t0z(r620VarArr);
    }

    public r620(String str, r620 r620Var) {
        super(str, i);
        this.a = str;
        this.b = r620Var;
    }

    public static r620 valueOf(String str) {
        return (r620) Enum.valueOf(r620.class, str);
    }

    public static r620[] values() {
        return (r620[]) X.clone();
    }
}
