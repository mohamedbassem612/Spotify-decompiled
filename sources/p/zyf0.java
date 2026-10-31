package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zyf0 {
    public static final zyf0 c;
    public static final zyf0 d;
    public static final zyf0 e;
    public static final zyf0 f;
    public static final /* synthetic */ zyf0[] g;
    public static final /* synthetic */ t0z h;
    public final c7p0 a;
    public final boolean b;

    static {
        c7p0 c7p0Var = c7p0.a;
        zyf0 zyf0Var = new zyf0("NOW_PLAYING_VIEW_EXPANDED", 0, c7p0Var, false);
        c = zyf0Var;
        c7p0 c7p0Var2 = c7p0.b;
        zyf0 zyf0Var2 = new zyf0("NOW_PLAYING_VIEW_COLLAPSED", 1, c7p0Var2, false);
        d = zyf0Var2;
        zyf0 zyf0Var3 = new zyf0("NOW_PLAYING_VIEW_EXPANDED_OFF_SCREEN", 2, c7p0Var, true);
        e = zyf0Var3;
        zyf0 zyf0Var4 = new zyf0("NOW_PLAYING_VIEW_COLLAPSED_OFF_SCREEN", 3, c7p0Var2, true);
        f = zyf0Var4;
        zyf0[] zyf0VarArr = {zyf0Var, zyf0Var2, zyf0Var3, zyf0Var4};
        g = zyf0VarArr;
        h = new t0z(zyf0VarArr);
    }

    public zyf0(String str, int i, c7p0 c7p0Var, boolean z) {
        super(str, i);
        this.a = c7p0Var;
        this.b = z;
    }

    public static zyf0 valueOf(String str) {
        return (zyf0) Enum.valueOf(zyf0.class, str);
    }

    public static zyf0[] values() {
        return (zyf0[]) g.clone();
    }
}
