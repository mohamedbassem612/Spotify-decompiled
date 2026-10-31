package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.t0d[], still in use, count: 1, list:
  (r0v1 p.t0d[]) from 0x001c: CONSTRUCTOR (r0v1 p.t0d[]) A[WRAPPED] (LINE:29) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class t0d {
    /* JADX INFO: Fake field, exist only in values array */
    A('A'),
    /* JADX INFO: Fake field, exist only in values array */
    B('B');

    public static final /* synthetic */ t0z c;
    public final char a;

    static {
        c = new t0z(t0dVarArr);
    }

    public t0d(char c2) {
        super(str, i);
        this.a = c2;
    }

    public static t0d valueOf(String str) {
        return (t0d) Enum.valueOf(t0d.class, str);
    }

    public static t0d[] values() {
        return (t0d[]) b.clone();
    }
}
