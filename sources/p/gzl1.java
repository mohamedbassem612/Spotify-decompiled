package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.gzl1[], still in use, count: 1, list:
  (r0v1 p.gzl1[]) from 0x0034: CONSTRUCTOR (r0v1 p.gzl1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:53) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@o661
public final class gzl1 {
    STEADY("steady"),
    /* JADX INFO: Fake field, exist only in values array */
    TAPERED("tapered"),
    PYRAMID("pyramid"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERVALS("intervals");

    public static final fzl1 Companion = new fzl1();
    public static final znb0 b = dm5.S(2, w3l1.Z0);
    public static final /* synthetic */ t0z f;
    public final String a;

    static {
        f = new t0z(new gzl1[]{r0, r1, r2, new gzl1("intervals")});
    }

    public gzl1(String str) {
        super(str, i);
        this.a = str;
    }

    public static gzl1 valueOf(String str) {
        return (gzl1) Enum.valueOf(gzl1.class, str);
    }

    public static gzl1[] values() {
        return (gzl1[]) e.clone();
    }
}
