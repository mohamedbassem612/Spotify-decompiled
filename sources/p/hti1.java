package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hti1 {
    public static final hti1 c;
    public static final hti1 d;
    public static final hti1 e;
    public static final hti1 f;
    public static final /* synthetic */ hti1[] g;
    public final pgx a;
    public final float b;

    static {
        ngx ngxVar = ngx.e;
        hti1 hti1Var = new hti1("Base", 0, ngxVar, 2.0f);
        c = hti1Var;
        hti1 hti1Var2 = new hti1("Flush", 1, ngxVar, 2.0f);
        d = hti1Var2;
        hti1 hti1Var3 = new hti1("OverMedia", 2, ogx.e, 0.0f);
        e = hti1Var3;
        hti1 hti1Var4 = new hti1("OverNpvCard", 3, ngxVar, 2.0f);
        f = hti1Var4;
        g = new hti1[]{hti1Var, hti1Var2, hti1Var3, hti1Var4};
    }

    public hti1(String str, int i, pgx pgxVar, float f2) {
        super(str, i);
        this.a = pgxVar;
        this.b = f2;
    }

    public static hti1 valueOf(String str) {
        return (hti1) Enum.valueOf(hti1.class, str);
    }

    public static hti1[] values() {
        return (hti1[]) g.clone();
    }
}
