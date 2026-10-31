package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.sx7[], still in use, count: 1, list:
  (r0v1 p.sx7[]) from 0x0020: CONSTRUCTOR (r0v1 p.sx7[]) A[WRAPPED] (LINE:33) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class sx7 {
    OMIT("Omit"),
    YES("true");

    public static final /* synthetic */ t0z e;
    public final String a;

    static {
        e = new t0z(sx7VarArr);
    }

    public sx7(String str) {
        super(str, i);
        this.a = str;
    }

    public static sx7 valueOf(String str) {
        return (sx7) Enum.valueOf(sx7.class, str);
    }

    public static sx7[] values() {
        return (sx7[]) d.clone();
    }
}
