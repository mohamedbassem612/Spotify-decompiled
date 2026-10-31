package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.fr2[], still in use, count: 1, list:
  (r0v1 p.fr2[]) from 0x004e: CONSTRUCTOR (r0v1 p.fr2[]) A[WRAPPED] (LINE:79) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fr2 {
    TOOL_START("tool_start"),
    /* JADX INFO: Fake field, exist only in values array */
    TOOL_END("tool_end"),
    THINKING("thinking"),
    ROUTINE_RESULT("routine_result"),
    PERMISSION_REQUEST("permission_request"),
    PERMISSION_RESOLVED("permission_resolved");

    public static final /* synthetic */ t0z h;
    public final String a;

    static {
        h = new t0z(fr2VarArr);
    }

    public fr2(String str) {
        super(str, i);
        this.a = str;
    }

    public static fr2 valueOf(String str) {
        return (fr2) Enum.valueOf(fr2.class, str);
    }

    public static fr2[] values() {
        return (fr2[]) g.clone();
    }
}
