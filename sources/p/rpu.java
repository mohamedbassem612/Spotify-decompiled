package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.rpu[], still in use, count: 1, list:
  (r0v1 p.rpu[]) from 0x001e: CONSTRUCTOR (r0v1 p.rpu[]) A[WRAPPED] (LINE:31) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rpu {
    STANDARD("default"),
    /* JADX INFO: Fake field, exist only in values array */
    SOMETIMES("sometimes");

    public static final /* synthetic */ t0z d;
    public final String a;

    static {
        d = new t0z(rpuVarArr);
    }

    public rpu(String str) {
        super(str, i);
        this.a = str;
    }

    public static rpu valueOf(String str) {
        return (rpu) Enum.valueOf(rpu.class, str);
    }

    public static rpu[] values() {
        return (rpu[]) c.clone();
    }
}
