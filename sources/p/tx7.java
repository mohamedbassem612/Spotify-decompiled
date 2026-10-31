package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.tx7[], still in use, count: 1, list:
  (r0v1 p.tx7[]) from 0x002d: CONSTRUCTOR (r0v1 p.tx7[]) A[WRAPPED] (LINE:46) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class tx7 {
    NONE(0, null),
    /* JADX INFO: Fake field, exist only in values array */
    SINCE_U_BEEN_GONE(1, "spotify:track:6JY1IdkZGeIcPegKxjSKeb"),
    /* JADX INFO: Fake field, exist only in values array */
    EYE_OF_THE_TIGER(2, "spotify:track:2HHtWyy5CgaQbC7XSoOb0e");

    public static final /* synthetic */ t0z e;
    public final String a;
    public final String b;

    static {
        e = new t0z(tx7VarArr);
    }

    public tx7(int i, String str) {
        super(str, i);
        this.a = str;
        this.b = str;
    }

    public static tx7 valueOf(String str) {
        return (tx7) Enum.valueOf(tx7.class, str);
    }

    public static tx7[] values() {
        return (tx7[]) d.clone();
    }
}
