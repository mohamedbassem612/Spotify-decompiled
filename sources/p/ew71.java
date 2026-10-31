package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.ew71[], still in use, count: 1, list:
  (r0v1 p.ew71[]) from 0x0078: CONSTRUCTOR (r0v1 p.ew71[]) A[WRAPPED] (LINE:121) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ew71 {
    SONGS(2131962385, 2131962375, 2131962376, 2131962381, "track"),
    /* JADX INFO: Fake field, exist only in values array */
    PODCASTS(2131962384, 2131962373, 2131962374, 2131962380, "episode"),
    /* JADX INFO: Fake field, exist only in values array */
    ALBUMS(2131962365, 2131962367, 2131962368, 2131962377, "album"),
    /* JADX INFO: Fake field, exist only in values array */
    ARTISTS(2131962366, 2131962369, 2131962370, 2131962378, "artist"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYLISTS(2131962383, 2131962371, 2131962372, 2131962379, "playlist_v2");

    public static final /* synthetic */ t0z h;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;

    static {
        h = new t0z(ew71VarArr);
    }

    public ew71(int i, int i2, int i3, int i4, String str) {
        super(str, i);
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
    }

    public static ew71 valueOf(String str) {
        return (ew71) Enum.valueOf(ew71.class, str);
    }

    public static ew71[] values() {
        return (ew71[]) g.clone();
    }
}
