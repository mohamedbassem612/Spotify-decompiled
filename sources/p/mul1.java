package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class mul1 {
    public static final aul1 c;
    public static final dul1 d;
    public static final gul1 e;
    public static final /* synthetic */ mul1[] f;
    public final pul1 a;
    public final byte b;

    /* JADX INFO: Fake field, exist only in values array */
    mul1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    mul1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    mul1 EF2;

    static {
        mul1 mul1Var = new mul1("DOUBLE", 0, pul1.d, 1);
        mul1 mul1Var2 = new mul1("FLOAT", 1, pul1.c, 5);
        pul1 pul1Var = pul1.b;
        mul1 mul1Var3 = new mul1("INT64", 2, pul1Var, 0);
        mul1 mul1Var4 = new mul1("UINT64", 3, pul1Var, 0);
        pul1 pul1Var2 = pul1.a;
        mul1 mul1Var5 = new mul1("INT32", 4, pul1Var2, 0);
        mul1 mul1Var6 = new mul1("FIXED64", 5, pul1Var, 1);
        mul1 mul1Var7 = new mul1("FIXED32", 6, pul1Var2, 5);
        mul1 mul1Var8 = new mul1("BOOL", 7, pul1.e, 0);
        aul1 aul1Var = new aul1("STRING", 8, pul1.f, 2);
        c = aul1Var;
        pul1 pul1Var3 = pul1.i;
        dul1 dul1Var = new dul1("GROUP", 9, pul1Var3, 3);
        d = dul1Var;
        gul1 gul1Var = new gul1("MESSAGE", 10, pul1Var3, 2);
        e = gul1Var;
        f = new mul1[]{mul1Var, mul1Var2, mul1Var3, mul1Var4, mul1Var5, mul1Var6, mul1Var7, mul1Var8, aul1Var, dul1Var, gul1Var, new jul1("BYTES", 11, pul1.g, 2), new mul1("UINT32", 12, pul1Var2, 0), new mul1("ENUM", 13, pul1.h, 0), new mul1("SFIXED32", 14, pul1Var2, 5), new mul1("SFIXED64", 15, pul1Var, 1), new mul1("SINT32", 16, pul1Var2, 0), new mul1("SINT64", 17, pul1Var, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mul1(String str, int i, pul1 pul1Var, int i2) {
        super(str, i);
        this.a = pul1Var;
        this.b = i2;
    }

    public static mul1 valueOf(String str) {
        return (mul1) Enum.valueOf(mul1.class, str);
    }

    public static mul1[] values() {
        return (mul1[]) f.clone();
    }
}
