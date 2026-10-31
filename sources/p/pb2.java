package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.pb2[], still in use, count: 1, list:
  (r0v1 p.pb2[]) from 0x0024: CONSTRUCTOR (r0v1 p.pb2[]) A[WRAPPED] (LINE:37) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class pb2 {
    /* JADX INFO: Fake field, exist only in values array */
    ESTIMATION("ESTIMATION"),
    /* JADX INFO: Fake field, exist only in values array */
    VERIFICATION("VERIFICATION"),
    UNKNOWN("");

    public static final /* synthetic */ t0z d;
    public final String a;

    static {
        d = new t0z(pb2VarArr);
    }

    public pb2(String str) {
        super(str, i);
        this.a = str;
    }

    public static pb2 valueOf(String str) {
        return (pb2) Enum.valueOf(pb2.class, str);
    }

    public static pb2[] values() {
        return (pb2[]) c.clone();
    }
}
