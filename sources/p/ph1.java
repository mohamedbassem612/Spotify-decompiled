package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.ph1[], still in use, count: 1, list:
  (r0v1 p.ph1[]) from 0x0028: CONSTRUCTOR (r0v1 p.ph1[]) A[WRAPPED] (LINE:41) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ph1 {
    /* JADX INFO: Fake field, exist only in values array */
    AudiobookBoost("1"),
    /* JADX INFO: Fake field, exist only in values array */
    AudiobookFamily("2"),
    Invalid("");

    public static final /* synthetic */ t0z d;
    public final String a;

    static {
        d = new t0z(ph1VarArr);
    }

    public ph1(String str) {
        super(str, i);
        this.a = str;
    }

    public static ph1 valueOf(String str) {
        return (ph1) Enum.valueOf(ph1.class, str);
    }

    public static ph1[] values() {
        return (ph1[]) c.clone();
    }
}
