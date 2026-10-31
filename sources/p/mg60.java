package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.mg60[], still in use, count: 1, list:
  (r0v1 p.mg60[]) from 0x0018: CONSTRUCTOR (r0v1 p.mg60[]) A[WRAPPED] (LINE:25) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mg60 {
    /* JADX INFO: Fake field, exist only in values array */
    NEW_EPISODES(0),
    /* JADX INFO: Fake field, exist only in values array */
    YOUR_EPISODES(1);

    public static final /* synthetic */ t0z b;

    static {
        b = new t0z(mg60VarArr);
    }

    public mg60(int i) {
        super(str, i);
    }

    public static mg60 valueOf(String str) {
        return (mg60) Enum.valueOf(mg60.class, str);
    }

    public static mg60[] values() {
        return (mg60[]) a.clone();
    }
}
