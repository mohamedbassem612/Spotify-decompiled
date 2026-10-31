package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.oe2[], still in use, count: 1, list:
  (r0v1 p.oe2[]) from 0x0032: CONSTRUCTOR (r0v1 p.oe2[]) A[WRAPPED] (LINE:51) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oe2 {
    UNSET("UNSET"),
    /* JADX INFO: Fake field, exist only in values array */
    PENDING_DISABLED("PENDING_DISABLED"),
    /* JADX INFO: Fake field, exist only in values array */
    DISABLED("DISABLED"),
    /* JADX INFO: Fake field, exist only in values array */
    REACTIVATED("REACTIVATED"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPLETED("COMPLETED");

    public static final /* synthetic */ t0z d;
    public final String a;

    static {
        d = new t0z(oe2VarArr);
    }

    public oe2(String str) {
        super(str, i);
        this.a = str;
    }

    public static oe2 valueOf(String str) {
        return (oe2) Enum.valueOf(oe2.class, str);
    }

    public static oe2[] values() {
        return (oe2[]) c.clone();
    }
}
