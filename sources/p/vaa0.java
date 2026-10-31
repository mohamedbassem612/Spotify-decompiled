package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.vaa0[], still in use, count: 1, list:
  (r0v1 p.vaa0[]) from 0x0064: CONSTRUCTOR (r0v1 p.vaa0[]) A[WRAPPED] (LINE:101) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class vaa0 {
    None(0),
    SpinbackEnd1Beat(1),
    SpinbackEnd2Beat(2),
    SpinbackEnd4Beat(3),
    VinylStopFast4End(4),
    VinylStopFast2End(5),
    VinylStopFast1End(6),
    VinylStopSlowEnd(7),
    Unknown(-1);

    public static final /* synthetic */ t0z Y;
    public final int a;

    static {
        Y = new t0z(vaa0VarArr);
    }

    public vaa0(int i) {
        super(str, i);
        this.a = i;
    }

    public static vaa0 valueOf(String str) {
        return (vaa0) Enum.valueOf(vaa0.class, str);
    }

    public static vaa0[] values() {
        return (vaa0[]) X.clone();
    }
}
