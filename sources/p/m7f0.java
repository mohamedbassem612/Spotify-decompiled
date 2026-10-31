package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.m7f0[], still in use, count: 1, list:
  (r0v1 p.m7f0[]) from 0x005b: CONSTRUCTOR (r0v1 p.m7f0[]) A[WRAPPED] (LINE:92) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class m7f0 {
    None(0),
    TwoBeat(1),
    FourBeat(2),
    EightBeat(3),
    SixteenBeat(4),
    HalvingEnd(5),
    OneBeat(8),
    Unknown(-1);

    public static final /* synthetic */ t0z X;
    public final int a;

    static {
        X = new t0z(m7f0VarArr);
    }

    public m7f0(int i) {
        super(str, i);
        this.a = i;
    }

    public static m7f0 valueOf(String str) {
        return (m7f0) Enum.valueOf(m7f0.class, str);
    }

    public static m7f0[] values() {
        return (m7f0[]) t.clone();
    }
}
