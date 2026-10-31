package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.qzy0[], still in use, count: 1, list:
  (r0v1 p.qzy0[]) from 0x0026: CONSTRUCTOR (r0v1 p.qzy0[]) A[WRAPPED] (LINE:39) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qzy0 {
    STANDARD(0),
    VERY_HIGH(1),
    LOSSLESS(2);

    public static final /* synthetic */ t0z f;
    public final String a;

    static {
        f = new t0z(qzy0VarArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzy0(int i) {
        super(str, i);
        String strValueOf = String.valueOf(i);
        this.a = strValueOf;
    }

    public static qzy0 valueOf(String str) {
        return (qzy0) Enum.valueOf(qzy0.class, str);
    }

    public static qzy0[] values() {
        return (qzy0[]) e.clone();
    }
}
