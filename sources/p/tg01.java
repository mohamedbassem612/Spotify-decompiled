package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.tg01[], still in use, count: 1, list:
  (r0v1 p.tg01[]) from 0x0084: CONSTRUCTOR (r0v1 p.tg01[]) A[WRAPPED] (LINE:133) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class tg01 {
    UNKNOWN(0),
    CAST_INTERNAL_ERROR(1),
    CASTING_STOPPED(2),
    APPLICATION_NOT_RUNNING(3),
    SESSION_START_FAILED(4),
    SESSION_RESUME_FAILED(5),
    CAST_SOCKET_ERROR(6),
    TIMEOUT(7),
    NETWORK_ERROR(8),
    CASTING_ROUTE_CHANGED(9),
    APPLICATION_LAUNCH_ERROR(10),
    CANCELLED(11);

    public static final /* synthetic */ t0z O0;
    public final byte a;

    static {
        O0 = new t0z(tg01VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tg01(int i) {
        super(str, i);
        this.a = i;
    }

    public static tg01 valueOf(String str) {
        return (tg01) Enum.valueOf(tg01.class, str);
    }

    public static tg01[] values() {
        return (tg01[]) N0.clone();
    }
}
