package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.gnl1[], still in use, count: 1, list:
  (r0v1 p.gnl1[]) from 0x0034: CONSTRUCTOR (r0v1 p.gnl1[]) A[WRAPPED] (LINE:53) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gnl1 {
    c(2131165552, "MAJOR"),
    d(2131165554, "MINOR"),
    e(2131165553, "MICRO");

    public static final /* synthetic */ t0z g;
    public final int a;
    public final float b;

    static {
        g = new t0z(gnl1VarArr);
    }

    public gnl1(int i, String str) {
        super(str, i);
        this.a = i;
        this.b = f;
    }

    public static gnl1 valueOf(String str) {
        return (gnl1) Enum.valueOf(gnl1.class, str);
    }

    public static gnl1[] values() {
        return (gnl1[]) f.clone();
    }
}
