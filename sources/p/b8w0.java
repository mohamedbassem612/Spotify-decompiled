package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v24 p.b8w0[], still in use, count: 1, list:
  (r0v24 p.b8w0[]) from 0x011d: CONSTRUCTOR (r0v24 p.b8w0[]) A[WRAPPED] (LINE:286) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class b8w0 {
    None(0),
    SimpleFade(1),
    EqSwap(2),
    BassSwap(3),
    BassSwapFilterIn(4),
    /* JADX INFO: Fake field, exist only in values array */
    BassSwapFilterOut(5),
    /* JADX INFO: Fake field, exist only in values array */
    BassSwapEcho(6),
    /* JADX INFO: Fake field, exist only in values array */
    BassAndMidSwap(7),
    /* JADX INFO: Fake field, exist only in values array */
    FilterFadeOut(8),
    /* JADX INFO: Fake field, exist only in values array */
    FilterFadeIn(9),
    /* JADX INFO: Fake field, exist only in values array */
    FilterFadeInOut(10),
    SimpleCut(11),
    /* JADX INFO: Fake field, exist only in values array */
    ReverbCut(12),
    /* JADX INFO: Fake field, exist only in values array */
    RiserCut(13),
    /* JADX INFO: Fake field, exist only in values array */
    ReverbRiserCut(14),
    /* JADX INFO: Fake field, exist only in values array */
    LowPassFilterFadeInOut(15),
    /* JADX INFO: Fake field, exist only in values array */
    BassSwapLowPassFilterOut(16),
    BassSwapLowPassFilterIn(17),
    /* JADX INFO: Fake field, exist only in values array */
    BassSwapLowPassFilterOut(18),
    /* JADX INFO: Fake field, exist only in values array */
    LowPassFilterFadeInOut(19),
    Dissolve(20),
    Surge(21),
    Afterglow(22),
    Unknown(-1);

    public static final /* synthetic */ t0z N0;
    public final int a;

    static {
        N0 = new t0z(b8w0VarArr);
    }

    public b8w0(int i) {
        super(str, i);
        this.a = i;
    }

    public static b8w0 valueOf(String str) {
        return (b8w0) Enum.valueOf(b8w0.class, str);
    }

    public static b8w0[] values() {
        return (b8w0[]) Z.clone();
    }
}
