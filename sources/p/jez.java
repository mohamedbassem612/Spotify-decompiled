package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 p.jez[], still in use, count: 1, list:
  (r0v4 p.jez[]) from 0x00aa: CONSTRUCTOR (r0v4 p.jez[]) A[WRAPPED] (LINE:171) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class jez {
    None(0),
    EqSwap(1),
    /* JADX INFO: Fake field, exist only in values array */
    BassFadeIn(2),
    /* JADX INFO: Fake field, exist only in values array */
    BassCrossfade(3),
    BassSwap(4),
    /* JADX INFO: Fake field, exist only in values array */
    BassAndMidSwap(7),
    /* JADX INFO: Fake field, exist only in values array */
    MidSwap(8),
    /* JADX INFO: Fake field, exist only in values array */
    HiSwap(9),
    BassSwapAtEnd(10),
    BassSwapAtStart(11),
    BassCuts(12),
    NoBass(13),
    StartFadeOut(14),
    BassFadeOut(15),
    Unknown(-1);

    public static final /* synthetic */ t0z Z;
    public final int a;

    static {
        Z = new t0z(jezVarArr);
    }

    public jez(int i) {
        super(str, i);
        this.a = i;
    }

    public static jez valueOf(String str) {
        return (jez) Enum.valueOf(jez.class, str);
    }

    public static jez[] values() {
        return (jez[]) Y.clone();
    }
}
