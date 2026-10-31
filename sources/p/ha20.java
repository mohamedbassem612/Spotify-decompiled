package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v17 p.ha20[], still in use, count: 1, list:
  (r0v17 p.ha20[]) from 0x00c4: CONSTRUCTOR (r0v17 p.ha20[]) A[WRAPPED] (LINE:197) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ha20 {
    None(0),
    /* JADX INFO: Fake field, exist only in values array */
    Echo(1),
    /* JADX INFO: Fake field, exist only in values array */
    Reverb(2),
    /* JADX INFO: Fake field, exist only in values array */
    Riser(3),
    /* JADX INFO: Fake field, exist only in values array */
    ReverbRiser(4),
    FilterIn(5),
    FilterOut(6),
    FilterInFilterOut(7),
    /* JADX INFO: Fake field, exist only in values array */
    EchoAtEnd(8),
    LowPassFilterIn(9),
    LowPassFilterOut(10),
    LowPassFilterInLowPassFilterOut(11),
    FilterInLowPassFilterOut(12),
    LowPassFilterInFilterOut(13),
    HighPassFilterHalfOut(14),
    NoiseOutEnd(15),
    Unknown(-1);

    public static final /* synthetic */ t0z O0;
    public final int a;

    static {
        O0 = new t0z(ha20VarArr);
    }

    public ha20(int i) {
        super(str, i);
        this.a = i;
    }

    public static ha20 valueOf(String str) {
        return (ha20) Enum.valueOf(ha20.class, str);
    }

    public static ha20[] values() {
        return (ha20[]) N0.clone();
    }
}
