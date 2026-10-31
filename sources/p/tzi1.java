package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.tzi1[], still in use, count: 1, list:
  (r0v1 p.tzi1[]) from 0x001d: CONSTRUCTOR (r0v1 p.tzi1[]) A[WRAPPED] (LINE:30) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tzi1 {
    FIRST(1),
    SECOND(2);

    public static final /* synthetic */ t0z e;
    public final byte a;

    static {
        e = new t0z(tzi1VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tzi1(int i) {
        super(str, i);
        this.a = i;
    }

    public static tzi1 valueOf(String str) {
        return (tzi1) Enum.valueOf(tzi1.class, str);
    }

    public static tzi1[] values() {
        return (tzi1[]) d.clone();
    }
}
