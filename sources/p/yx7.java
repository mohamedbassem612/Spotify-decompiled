package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.yx7[], still in use, count: 1, list:
  (r0v1 p.yx7[]) from 0x002c: CONSTRUCTOR (r0v1 p.yx7[]) A[WRAPPED] (LINE:45) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yx7 {
    /* JADX INFO: Fake field, exist only in values array */
    PLAYLIST(0, "spotify:playlist:5a5gHPxvuRZWo1PmM6JV9g"),
    /* JADX INFO: Fake field, exist only in values array */
    PROFILE(1, "spotify:artist:4gzpq5DPGxSnKTe4SA8HAU"),
    /* JADX INFO: Fake field, exist only in values array */
    SHOW(2, "spotify:show:1lTiywT67jiHoTao8gZooq");

    public static final /* synthetic */ t0z d;
    public final String a;
    public final String b;

    static {
        d = new t0z(yx7VarArr);
    }

    public yx7(int i, String str) {
        super(str, i);
        this.a = str;
        this.b = str;
    }

    public static yx7 valueOf(String str) {
        return (yx7) Enum.valueOf(yx7.class, str);
    }

    public static yx7[] values() {
        return (yx7[]) c.clone();
    }
}
