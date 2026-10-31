package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.rjm1[], still in use, count: 1, list:
  (r0v1 p.rjm1[]) from 0x0038: CONSTRUCTOR (r0v1 p.rjm1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:57) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class rjm1 {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');

    public static final /* synthetic */ t0z h;
    public final char a;
    public final char b;

    static {
        h = new t0z(rjm1VarArr);
    }

    public rjm1(char c, char c2) {
        super(str, i);
        this.a = c;
        this.b = c2;
    }

    public static rjm1 valueOf(String str) {
        return (rjm1) Enum.valueOf(rjm1.class, str);
    }

    public static rjm1[] values() {
        return (rjm1[]) g.clone();
    }
}
