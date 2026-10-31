package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.ioc1[], still in use, count: 1, list:
  (r0v1 p.ioc1[]) from 0x004e: CONSTRUCTOR (r0v1 p.ioc1[]) A[WRAPPED] (LINE:79) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ioc1 {
    c(0, "UNKNOWN_REPLACEMENT_MODE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(1, "WITH_TIME_PRORATION"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(2, "CHARGE_PRORATED_PRICE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3(3, "WITHOUT_PRORATION"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(4, "CHARGE_FULL_PRICE"),
    d(5, "DEFERRED"),
    e(6, "KEEP_EXISTING"),
    /* JADX INFO: Fake field, exist only in values array */
    EF67(7, "CHARGE_FULL_PRICE_WITH_PRORATED_REFUND");

    public static final /* synthetic */ t0z g;
    public final String a;
    public final byte b;

    static {
        g = new t0z(ioc1VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ioc1(int i, String str) {
        super(str, i);
        this.a = str;
        this.b = i;
    }

    public static ioc1 valueOf(String str) {
        return (ioc1) Enum.valueOf(ioc1.class, str);
    }

    public static ioc1[] values() {
        return (ioc1[]) f.clone();
    }
}
