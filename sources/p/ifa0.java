package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.ifa0[], still in use, count: 1, list:
  (r0v1 p.ifa0[]) from 0x0065: CONSTRUCTOR (r0v1 p.ifa0[]) A[WRAPPED] (LINE:102) call: p.t0z.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ifa0 {
    /* JADX INFO: Fake field, exist only in values array */
    START(11.0f, 116.0f, 95.0f, 73.0f, 2.0f, new lit(6.0f, 84.0f, 82.0f, 111.0f), 32.0f),
    /* JADX INFO: Fake field, exist only in values array */
    MIDDLE(114.0f, 152.0f, 88.0f, 88.0f, 3.0f, new lit(106.0f, 152.0f, 87.0f, 101.0f)),
    /* JADX INFO: Fake field, exist only in values array */
    END(18.0f, 236.0f, 89.0f, 73.0f, 2.0f, new lit(22.0f, 237.0f, 79.0f, 107.0f));

    public static final /* synthetic */ t0z i;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final lit f;
    public final float g;

    static {
        i = new t0z(ifa0VarArr);
    }

    public ifa0(float f, float f2, float f3, float f4, float f5, lit litVar, float f6) {
        super(str, i);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = litVar;
        this.g = f6;
    }

    public static ifa0 valueOf(String str) {
        return (ifa0) Enum.valueOf(ifa0.class, str);
    }

    public static ifa0[] values() {
        return (ifa0[]) h.clone();
    }

    public /* synthetic */ ifa0(float f, float f2, float f3, float f4, float f5, lit litVar) {
        this(f, f2, f3, f4, f5, litVar, 0.0f);
    }
}
