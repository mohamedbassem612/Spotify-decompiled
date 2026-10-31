package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.nf21[], still in use, count: 1, list:
  (r0v1 p.nf21[]) from 0x0047: CONSTRUCTOR (r0v1 p.nf21[]) A[WRAPPED] (LINE:72) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class nf21 {
    c(0, "UNKNOWN_REPLACEMENT_MODE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(1, "WITH_TIME_PRORATION"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(2, "CHARGE_PRORATED_PRICE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3(3, "WITHOUT_PRORATION"),
    d(6, "DEFERRED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF60(5, "CHARGE_FULL_PRICE");

    public static final /* synthetic */ t0z f;
    public final String a;
    public final byte b;

    static {
        f = new t0z(nf21VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nf21(int i, String str) {
        super(str, i);
        this.a = str;
        this.b = i;
    }

    public static nf21 valueOf(String str) {
        return (nf21) Enum.valueOf(nf21.class, str);
    }

    public static nf21[] values() {
        return (nf21[]) e.clone();
    }

    public final String a() {
        return this.a;
    }
}
