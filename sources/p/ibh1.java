package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.ibh1[], still in use, count: 1, list:
  (r0v1 p.ibh1[]) from 0x0046: CONSTRUCTOR (r0v1 p.ibh1[]) A[WRAPPED] (LINE:71) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ibh1 {
    /* JADX INFO: Fake field, exist only in values array */
    Success("SUCCESS"),
    /* JADX INFO: Fake field, exist only in values array */
    Queued("QUEUED"),
    /* JADX INFO: Fake field, exist only in values array */
    Error("ERROR"),
    Disabled("DISABLED"),
    /* JADX INFO: Fake field, exist only in values array */
    Processing("PROCESSING"),
    /* JADX INFO: Fake field, exist only in values array */
    PendingGeneration("PENDING_GENERATION");

    public static final /* synthetic */ t0z d;
    public final String a;

    static {
        d = new t0z(ibh1VarArr);
    }

    public ibh1(String str) {
        super(str, i);
        this.a = str;
    }

    public static ibh1 valueOf(String str) {
        return (ibh1) Enum.valueOf(ibh1.class, str);
    }

    public static ibh1[] values() {
        return (ibh1[]) c.clone();
    }
}
