package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.j5l1[], still in use, count: 1, list:
  (r0v1 p.j5l1[]) from 0x004b: CONSTRUCTOR (r0v1 p.j5l1[]) A[WRAPPED] (LINE:76) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class j5l1 {
    c(2132018270, "base"),
    /* JADX INFO: Fake field, exist only in values array */
    EF25(2132018288, "positive"),
    /* JADX INFO: Fake field, exist only in values array */
    EF38(2132018285, "negative"),
    /* JADX INFO: Fake field, exist only in values array */
    EF51(2132018335, "warning"),
    /* JADX INFO: Fake field, exist only in values array */
    EF64(2132018263, "announcement");

    public static final /* synthetic */ t0z e;
    public final String a;
    public final int b;

    static {
        e = new t0z(j5l1VarArr);
    }

    public j5l1(int i, String str) {
        super(str, i);
        this.a = str;
        this.b = i;
    }

    public static j5l1 valueOf(String str) {
        return (j5l1) Enum.valueOf(j5l1.class, str);
    }

    public static j5l1[] values() {
        return (j5l1[]) d.clone();
    }
}
