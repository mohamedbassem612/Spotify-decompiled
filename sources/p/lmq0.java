package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.lmq0[], still in use, count: 1, list:
  (r0v1 p.lmq0[]) from 0x001c: CONSTRUCTOR (r0v1 p.lmq0[]) A[WRAPPED] (LINE:29) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lmq0 {
    /* JADX INFO: Fake field, exist only in values array */
    SOCIAL("notify-social"),
    /* JADX INFO: Fake field, exist only in values array */
    COMMENTS("notify-comments");

    public static final /* synthetic */ t0z c;
    public final String a;

    static {
        c = new t0z(lmq0VarArr);
    }

    public lmq0(String str) {
        super(str, i);
        this.a = str;
    }

    public static lmq0 valueOf(String str) {
        return (lmq0) Enum.valueOf(lmq0.class, str);
    }

    public static lmq0[] values() {
        return (lmq0[]) b.clone();
    }
}
