package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 p.duk1[], still in use, count: 1, list:
  (r0v3 p.duk1[]) from 0x00a8: CONSTRUCTOR (r0v3 p.duk1[]) A[WRAPPED] (LINE:169) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class duk1 {
    None(0),
    Cut(1),
    Crossfade(2),
    /* JADX INFO: Fake field, exist only in values array */
    SlowInFastOut(3),
    /* JADX INFO: Fake field, exist only in values array */
    FastInSlowOut(4),
    SlowInSlowOut(5),
    CrossShape(6),
    FullOverlap(7),
    /* JADX INFO: Fake field, exist only in values array */
    Switcheroo(8),
    SlowInFastOutAtEnd(9),
    FastInAtStartSlowOut(10),
    SlowInSemiFastOutAtEnd(11),
    FadeInOneBarCutOut(12),
    OverlapOneBarCutOut(13),
    Unknown(-1);

    public static final /* synthetic */ t0z O0;
    public final int a;

    static {
        O0 = new t0z(duk1VarArr);
    }

    public duk1(int i) {
        super(str, i);
        this.a = i;
    }

    public static duk1 valueOf(String str) {
        return (duk1) Enum.valueOf(duk1.class, str);
    }

    public static duk1[] values() {
        return (duk1[]) N0.clone();
    }
}
