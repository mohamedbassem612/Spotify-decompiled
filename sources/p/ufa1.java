package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.ufa1[], still in use, count: 1, list:
  (r0v1 p.ufa1[]) from 0x0050: CONSTRUCTOR (r0v1 p.ufa1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:81) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ufa1 {
    /* JADX INFO: Fake field, exist only in values array */
    ULT_WEAR("ULT WEAR"),
    /* JADX INFO: Fake field, exist only in values array */
    WH_1000XM5("WH-1000XM5"),
    /* JADX INFO: Fake field, exist only in values array */
    WH_1000XM6("WH-1000XM6"),
    /* JADX INFO: Fake field, exist only in values array */
    WH_ULT900N("WH-ULT900N"),
    /* JADX INFO: Fake field, exist only in values array */
    YY2954("YY2954"),
    /* JADX INFO: Fake field, exist only in values array */
    YY2981("YY2981"),
    /* JADX INFO: Fake field, exist only in values array */
    YY2984("YY2984"),
    /* JADX INFO: Fake field, exist only in values array */
    YY2985("YY2985");

    public static final /* synthetic */ t0z c;
    public final String a;

    static {
        c = new t0z(ufa1VarArr);
    }

    public ufa1(String str) {
        super(str, i);
        this.a = str;
    }

    public static ufa1 valueOf(String str) {
        return (ufa1) Enum.valueOf(ufa1.class, str);
    }

    public static ufa1[] values() {
        return (ufa1[]) b.clone();
    }
}
