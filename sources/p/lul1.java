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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class lul1 {
    public static final lul1 c;
    public static final lul1 d;
    public static final cul1 e;
    public static final ful1 f;
    public static final lul1 g;
    public static final /* synthetic */ lul1[] h;
    public final oul1 a;
    public final byte b;

    /* JADX INFO: Fake field, exist only in values array */
    lul1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    lul1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    lul1 EF2;

    static {
        lul1 lul1Var = new lul1("DOUBLE", 0, oul1.DOUBLE, 1);
        lul1 lul1Var2 = new lul1("FLOAT", 1, oul1.FLOAT, 5);
        oul1 oul1Var = oul1.LONG;
        lul1 lul1Var3 = new lul1("INT64", 2, oul1Var, 0);
        lul1 lul1Var4 = new lul1("UINT64", 3, oul1Var, 0);
        oul1 oul1Var2 = oul1.INT;
        lul1 lul1Var5 = new lul1("INT32", 4, oul1Var2, 0);
        c = lul1Var5;
        lul1 lul1Var6 = new lul1("FIXED64", 5, oul1Var, 1);
        lul1 lul1Var7 = new lul1("FIXED32", 6, oul1Var2, 5);
        lul1 lul1Var8 = new lul1("BOOL", 7, oul1.BOOLEAN, 0);
        d = lul1Var8;
        ztl1 ztl1Var = new ztl1("STRING", 8, oul1.STRING, 2);
        oul1 oul1Var3 = oul1.MESSAGE;
        cul1 cul1Var = new cul1("GROUP", 9, oul1Var3, 3);
        e = cul1Var;
        ful1 ful1Var = new ful1("MESSAGE", 10, oul1Var3, 2);
        f = ful1Var;
        iul1 iul1Var = new iul1("BYTES", 11, oul1.BYTE_STRING, 2);
        lul1 lul1Var9 = new lul1("UINT32", 12, oul1Var2, 0);
        lul1 lul1Var10 = new lul1("ENUM", 13, oul1.ENUM, 0);
        g = lul1Var10;
        h = new lul1[]{lul1Var, lul1Var2, lul1Var3, lul1Var4, lul1Var5, lul1Var6, lul1Var7, lul1Var8, ztl1Var, cul1Var, ful1Var, iul1Var, lul1Var9, lul1Var10, new lul1("SFIXED32", 14, oul1Var2, 5), new lul1("SFIXED64", 15, oul1Var, 1), new lul1("SINT32", 16, oul1Var2, 0), new lul1("SINT64", 17, oul1Var, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lul1(String str, int i, oul1 oul1Var, int i2) {
        super(str, i);
        this.a = oul1Var;
        this.b = i2;
    }

    public static lul1 valueOf(String str) {
        return (lul1) Enum.valueOf(lul1.class, str);
    }

    public static lul1[] values() {
        return (lul1[]) h.clone();
    }

    public boolean a() {
        return !(this instanceof ztl1);
    }
}
