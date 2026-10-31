package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.uvj1[], still in use, count: 1, list:
  (r0v1 p.uvj1[]) from 0x0050: CONSTRUCTOR (r0v1 p.uvj1[]) A[WRAPPED] (LINE:81) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class uvj1 {
    /* JADX INFO: Fake field, exist only in values array */
    VeryHigh(2131963740, 2131963741, 1920, 1080),
    /* JADX INFO: Fake field, exist only in values array */
    High(2131956560, 2131956561, 1280, 720),
    /* JADX INFO: Fake field, exist only in values array */
    Normal(2131959134, 2131959135, 720, 480),
    Low(2131957780, 2131957781, 352, 240);

    public static final /* synthetic */ t0z g;
    public final int a;
    public final int b;
    public final short c;
    public final short d;

    static {
        g = new t0z(uvj1VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public uvj1(int i, int i2, int i3, int i4) {
        super(str, i);
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static uvj1 valueOf(String str) {
        return (uvj1) Enum.valueOf(uvj1.class, str);
    }

    public static uvj1[] values() {
        return (uvj1[]) f.clone();
    }
}
