package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.yam0[], still in use, count: 1, list:
  (r0v1 p.yam0[]) from 0x0046: CONSTRUCTOR (r0v1 p.yam0[]) A[WRAPPED] (LINE:71) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class yam0 {
    b("REAL_ENDPOINT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("NEW_ADDRESS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29("NEW_ADDRESS_AUTOCOMPLETE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF39("SAVED_ADDRESS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF49("SAVED_ADDRESS_AUTOCOMPLETE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF59("NETWORK_ERROR");

    public static final /* synthetic */ t0z d;
    public final vu30 a;

    static {
        d = new t0z(yam0VarArr);
    }

    public yam0(String str) {
        super(str, i);
        this.a = vu30Var;
    }

    public static yam0 valueOf(String str) {
        return (yam0) Enum.valueOf(yam0.class, str);
    }

    public static yam0[] values() {
        return (yam0[]) c.clone();
    }
}
