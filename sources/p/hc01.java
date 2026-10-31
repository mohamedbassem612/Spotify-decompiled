package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.hc01[], still in use, count: 1, list:
  (r0v1 p.hc01[]) from 0x008f: CONSTRUCTOR (r0v1 p.hc01[]) A[WRAPPED] (LINE:144) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hc01 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0(z4p1.g(4279374354L), "Paper", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF10(z4p1.g(4284171830L), "Sepia", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF11(z4p1.g(4292134313L), "Ember", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF12(z4p1.g(4291875024L), "Night", false),
    f(z4p1.g(4294967295L), "Spotify", false);

    public static final yla d = new yla((byte) 22);
    public static final hc01 e = new hc01(z4p1.g(4291875024L), "Night", false);
    public static final /* synthetic */ t0z h;
    public final long a;
    public final long b;
    public final boolean c;

    static {
        h = new t0z(new hc01[]{r0, r10, r11, r12, r1});
    }

    public hc01(long j, String str, boolean z) {
        super(str, i);
        this.a = j;
        this.b = j;
        this.c = z;
    }

    public static hc01 valueOf(String str) {
        return (hc01) Enum.valueOf(hc01.class, str);
    }

    public static hc01[] values() {
        return (hc01[]) g.clone();
    }

    public final long a() {
        return this.b;
    }
}
