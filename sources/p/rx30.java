package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.rx30[], still in use, count: 1, list:
  (r0v1 p.rx30[]) from 0x0090: CONSTRUCTOR (r0v1 p.rx30[]) A[WRAPPED] (LINE:145) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class rx30 {
    None(0),
    ReverbOutCentre(1),
    ReverbCutEnd(2),
    ReverbOutEnd(3),
    EchoHalfCutEnd(4),
    EchoHalfOutEnd(5),
    Echo3QCutEnd(6),
    Echo3QOutEnd(7),
    DelayHalfCutEnd(8),
    Delay3QCutEnd(9),
    Echo1CutEnd(10),
    Echo1OutEnd(11),
    Unknown(-1);

    public static final /* synthetic */ t0z P0;
    public final int a;

    static {
        P0 = new t0z(rx30VarArr);
    }

    public rx30(int i) {
        super(str, i);
        this.a = i;
    }

    public static rx30 valueOf(String str) {
        return (rx30) Enum.valueOf(rx30.class, str);
    }

    public static rx30[] values() {
        return (rx30[]) O0.clone();
    }
}
