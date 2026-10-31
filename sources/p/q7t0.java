package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q7t0 {
    public static final lfb d;
    public static final q7t0 e;
    public static final /* synthetic */ q7t0[] f;
    public static final /* synthetic */ t0z g;
    public final String a;
    public final int b;
    public final long c;

    /* JADX INFO: Fake field, exist only in values array */
    q7t0 EF0;

    static {
        uwr uwrVar = cbx.a;
        zsc zscVar = zex.a;
        gmt gmtVar = (gmt) zscVar.c;
        xex xexVar = (xex) gmtVar.b;
        long j = xexVar.I;
        q7t0 q7t0Var = new q7t0(0, 2131102823, j, "Individual", "premium");
        q7t0 q7t0Var2 = new q7t0(1, 2131102823, j, "Free", "premiumFree");
        wex wexVar = (wex) gmtVar.c;
        q7t0 q7t0Var3 = new q7t0(2, 2131102908, wexVar.e, "Family", "premiumFamily");
        q7t0 q7t0Var4 = new q7t0(3, 2131102840, xexVar.f, "Duo", "premiumDuo");
        q7t0 q7t0Var5 = new q7t0(4, 2131103065, wexVar.j, "Student", "premiumStudent");
        q7t0 q7t0Var6 = new q7t0(5, 2131102942, wexVar.b, "Lite", "premiumLite");
        q7t0 q7t0Var7 = new q7t0(6, 2131102958, xexVar.v, "LiteGBB", "premiumLiteGBB");
        long j2 = xexVar.m;
        q7t0 q7t0Var8 = new q7t0(7, 2131103031, j2, "Standard", "premiumStandard");
        q7t0 q7t0Var9 = new q7t0(8, 2131104013, xexVar.n, "StandardStudent", "standardStudent");
        long j3 = xexVar.J;
        q7t0 q7t0Var10 = new q7t0(9, 2131102999, j3, "Platinum", "premiumPlatinum");
        q7t0 q7t0Var11 = new q7t0(10, 2131102999, j3, "PlatinumBasic", "basicPlatinum");
        q7t0 q7t0Var12 = new q7t0(11, 2131102876, j2, "PremiumExperimental", "premiumExperimental");
        q7t0 q7t0Var13 = new q7t0(12, 2131102858, xexVar.d, "PremiumDuoExperimental", "premiumDuoExperimental");
        q7t0 q7t0Var14 = new q7t0(13, 2131102924, xexVar.E, "PremiumFamilyExperimental", "premiumFamilyExperimental");
        q7t0 q7t0Var15 = new q7t0(14, 2131103081, xexVar.q, "PremiumStudentExperimental", "premiumStudentExperimental");
        q7t0 q7t0Var16 = new q7t0(15, 2131101509, ((yex) zscVar.d).h, "Fallback", "premiumFallback");
        e = q7t0Var16;
        q7t0[] q7t0VarArr = {q7t0Var, q7t0Var2, q7t0Var3, q7t0Var4, q7t0Var5, q7t0Var6, q7t0Var7, q7t0Var8, q7t0Var9, q7t0Var10, q7t0Var11, q7t0Var12, q7t0Var13, q7t0Var14, q7t0Var15, q7t0Var16};
        f = q7t0VarArr;
        g = new t0z(q7t0VarArr);
        d = new lfb((byte) 19);
    }

    public q7t0(int i, int i2, long j, String str, String str2) {
        super(str, i);
        this.a = str2;
        this.b = i2;
        this.c = j;
    }

    public static q7t0 valueOf(String str) {
        return (q7t0) Enum.valueOf(q7t0.class, str);
    }

    public static q7t0[] values() {
        return (q7t0[]) f.clone();
    }
}
