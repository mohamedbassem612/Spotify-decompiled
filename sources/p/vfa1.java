package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.vfa1[], still in use, count: 1, list:
  (r0v1 p.vfa1[]) from 0x001a: CONSTRUCTOR (r0v1 p.vfa1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:27) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vfa1 {
    /* JADX INFO: Fake field, exist only in values array */
    LINKBUDS_SPEAKER("Linkbuds Speaker"),
    /* JADX INFO: Fake field, exist only in values array */
    YY7863E("YY7863E");

    public static final /* synthetic */ t0z c;
    public final String a;

    static {
        c = new t0z(vfa1VarArr);
    }

    public vfa1(String str) {
        super(str, i);
        this.a = str;
    }

    public static vfa1 valueOf(String str) {
        return (vfa1) Enum.valueOf(vfa1.class, str);
    }

    public static vfa1[] values() {
        return (vfa1[]) b.clone();
    }
}
