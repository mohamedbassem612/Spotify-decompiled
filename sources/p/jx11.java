package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.jx11[], still in use, count: 1, list:
  (r0v1 p.jx11[]) from 0x002c: CONSTRUCTOR (r0v1 p.jx11[]) A[WRAPPED] (LINE:45) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class jx11 {
    RELEASES("spotify:list:available-releases:artist_{id}"),
    SONGS("spotify:list:available-release-segments-main-roles:artist_{id}"),
    VIDEOS("spotify:list:available-videos:artist_{id}");

    public static final /* synthetic */ t0z f;
    public final String a;

    static {
        f = new t0z(jx11VarArr);
    }

    public jx11(String str) {
        super(str, i);
        this.a = str;
    }

    public static jx11 valueOf(String str) {
        return (jx11) Enum.valueOf(jx11.class, str);
    }

    public static jx11[] values() {
        return (jx11[]) e.clone();
    }

    public final String a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "releases";
        }
        if (iOrdinal == 1) {
            return "songs";
        }
        if (iOrdinal == 2) {
            return "videos";
        }
        eg.o();
        return null;
    }

    public final int b() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return 2131961066;
        }
        if (iOrdinal == 1) {
            return 2131962780;
        }
        if (iOrdinal == 2) {
            return 2131963812;
        }
        eg.o();
        return 0;
    }

    public final String c(String str) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return f4i1.f("spotify:artist:", str, ":releases");
        }
        if (iOrdinal == 1) {
            return f4i1.f("spotify:artist:", str, ":songs");
        }
        if (iOrdinal == 2) {
            return "spotify:artist-music-videos:".concat(str);
        }
        eg.o();
        return null;
    }
}
