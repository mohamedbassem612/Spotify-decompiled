package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.ao80[], still in use, count: 1, list:
  (r0v1 p.ao80[]) from 0x007a: CONSTRUCTOR (r0v1 p.ao80[]) A[WRAPPED] (LINE:123) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ao80 {
    /* JADX INFO: Fake field, exist only in values array */
    CONNECTING(0),
    PAIRING(1),
    /* JADX INFO: Fake field, exist only in values array */
    SUBSCRIBING(2),
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCHING_APP_STORE(3),
    /* JADX INFO: Fake field, exist only in values array */
    WAITING_FOR_APP_TO_BE_INSTALLED(4),
    /* JADX INFO: Fake field, exist only in values array */
    LAUNCHING_THE_APP(5),
    /* JADX INFO: Fake field, exist only in values array */
    SUCCESS(6),
    UNKNOWN_ERROR(100),
    /* JADX INFO: Fake field, exist only in values array */
    DEVICE_NOT_FOUND(101),
    /* JADX INFO: Fake field, exist only in values array */
    DEVICE_NOT_SUPPORTED(102),
    /* JADX INFO: Fake field, exist only in values array */
    TIMEOUT(103),
    /* JADX INFO: Fake field, exist only in values array */
    CANCELLED(104);

    public static final /* synthetic */ t0z e;
    public final byte a;

    static {
        e = new t0z(ao80VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ao80(int i) {
        super(str, i);
        this.a = i;
    }

    public static ao80 valueOf(String str) {
        return (ao80) Enum.valueOf(ao80.class, str);
    }

    public static ao80[] values() {
        return (ao80[]) d.clone();
    }
}
