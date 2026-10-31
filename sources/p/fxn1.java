package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fxn1 {
    public static final fxn1 b;
    public static final fxn1 c;
    public static final fxn1[] d;
    public static final /* synthetic */ fxn1[] e;
    public final byte a;

    /* JADX INFO: Fake field, exist only in values array */
    fxn1 EF0;

    static {
        e1o1 e1o1Var = e1o1.e;
        fxn1 fxn1Var = new fxn1("DOUBLE", 0, 0, 1, e1o1Var);
        e1o1 e1o1Var2 = e1o1.d;
        fxn1 fxn1Var2 = new fxn1("FLOAT", 1, 1, 1, e1o1Var2);
        e1o1 e1o1Var3 = e1o1.c;
        fxn1 fxn1Var3 = new fxn1("INT64", 2, 2, 1, e1o1Var3);
        fxn1 fxn1Var4 = new fxn1("UINT64", 3, 3, 1, e1o1Var3);
        e1o1 e1o1Var4 = e1o1.b;
        fxn1 fxn1Var5 = new fxn1("INT32", 4, 4, 1, e1o1Var4);
        fxn1 fxn1Var6 = new fxn1("FIXED64", 5, 5, 1, e1o1Var3);
        fxn1 fxn1Var7 = new fxn1("FIXED32", 6, 6, 1, e1o1Var4);
        e1o1 e1o1Var5 = e1o1.f;
        fxn1 fxn1Var8 = new fxn1("BOOL", 7, 7, 1, e1o1Var5);
        e1o1 e1o1Var6 = e1o1.g;
        fxn1 fxn1Var9 = new fxn1("STRING", 8, 8, 1, e1o1Var6);
        e1o1 e1o1Var7 = e1o1.t;
        fxn1 fxn1Var10 = new fxn1("MESSAGE", 9, 9, 1, e1o1Var7);
        e1o1 e1o1Var8 = e1o1.h;
        fxn1 fxn1Var11 = new fxn1("BYTES", 10, 10, 1, e1o1Var8);
        fxn1 fxn1Var12 = new fxn1("UINT32", 11, 11, 1, e1o1Var4);
        e1o1 e1o1Var9 = e1o1.i;
        fxn1 fxn1Var13 = new fxn1("ENUM", 12, 12, 1, e1o1Var9);
        fxn1 fxn1Var14 = new fxn1("SFIXED32", 13, 13, 1, e1o1Var4);
        fxn1 fxn1Var15 = new fxn1("SFIXED64", 14, 14, 1, e1o1Var3);
        fxn1 fxn1Var16 = new fxn1("SINT32", 15, 15, 1, e1o1Var4);
        fxn1 fxn1Var17 = new fxn1("SINT64", 16, 16, 1, e1o1Var3);
        fxn1 fxn1Var18 = new fxn1("GROUP", 17, 17, 1, e1o1Var7);
        fxn1 fxn1Var19 = new fxn1("DOUBLE_LIST", 18, 18, 2, e1o1Var);
        fxn1 fxn1Var20 = new fxn1("FLOAT_LIST", 19, 19, 2, e1o1Var2);
        fxn1 fxn1Var21 = new fxn1("INT64_LIST", 20, 20, 2, e1o1Var3);
        fxn1 fxn1Var22 = new fxn1("UINT64_LIST", 21, 21, 2, e1o1Var3);
        fxn1 fxn1Var23 = new fxn1("INT32_LIST", 22, 22, 2, e1o1Var4);
        fxn1 fxn1Var24 = new fxn1("FIXED64_LIST", 23, 23, 2, e1o1Var3);
        fxn1 fxn1Var25 = new fxn1("FIXED32_LIST", 24, 24, 2, e1o1Var4);
        fxn1 fxn1Var26 = new fxn1("BOOL_LIST", 25, 25, 2, e1o1Var5);
        fxn1 fxn1Var27 = new fxn1("STRING_LIST", 26, 26, 2, e1o1Var6);
        fxn1 fxn1Var28 = new fxn1("MESSAGE_LIST", 27, 27, 2, e1o1Var7);
        fxn1 fxn1Var29 = new fxn1("BYTES_LIST", 28, 28, 2, e1o1Var8);
        fxn1 fxn1Var30 = new fxn1("UINT32_LIST", 29, 29, 2, e1o1Var4);
        fxn1 fxn1Var31 = new fxn1("ENUM_LIST", 30, 30, 2, e1o1Var9);
        fxn1 fxn1Var32 = new fxn1("SFIXED32_LIST", 31, 31, 2, e1o1Var4);
        fxn1 fxn1Var33 = new fxn1("SFIXED64_LIST", 32, 32, 2, e1o1Var3);
        fxn1 fxn1Var34 = new fxn1("SINT32_LIST", 33, 33, 2, e1o1Var4);
        fxn1 fxn1Var35 = new fxn1("SINT64_LIST", 34, 34, 2, e1o1Var3);
        fxn1 fxn1Var36 = new fxn1("DOUBLE_LIST_PACKED", 35, 35, 3, e1o1Var);
        b = fxn1Var36;
        fxn1 fxn1Var37 = new fxn1("FLOAT_LIST_PACKED", 36, 36, 3, e1o1Var2);
        fxn1 fxn1Var38 = new fxn1("INT64_LIST_PACKED", 37, 37, 3, e1o1Var3);
        fxn1 fxn1Var39 = new fxn1("UINT64_LIST_PACKED", 38, 38, 3, e1o1Var3);
        fxn1 fxn1Var40 = new fxn1("INT32_LIST_PACKED", 39, 39, 3, e1o1Var4);
        fxn1 fxn1Var41 = new fxn1("FIXED64_LIST_PACKED", 40, 40, 3, e1o1Var3);
        fxn1 fxn1Var42 = new fxn1("FIXED32_LIST_PACKED", 41, 41, 3, e1o1Var4);
        fxn1 fxn1Var43 = new fxn1("BOOL_LIST_PACKED", 42, 42, 3, e1o1Var5);
        fxn1 fxn1Var44 = new fxn1("UINT32_LIST_PACKED", 43, 43, 3, e1o1Var4);
        fxn1 fxn1Var45 = new fxn1("ENUM_LIST_PACKED", 44, 44, 3, e1o1Var9);
        fxn1 fxn1Var46 = new fxn1("SFIXED32_LIST_PACKED", 45, 45, 3, e1o1Var4);
        fxn1 fxn1Var47 = new fxn1("SFIXED64_LIST_PACKED", 46, 46, 3, e1o1Var3);
        fxn1 fxn1Var48 = new fxn1("SINT32_LIST_PACKED", 47, 47, 3, e1o1Var4);
        fxn1 fxn1Var49 = new fxn1("SINT64_LIST_PACKED", 48, 48, 3, e1o1Var3);
        c = fxn1Var49;
        e = new fxn1[]{fxn1Var, fxn1Var2, fxn1Var3, fxn1Var4, fxn1Var5, fxn1Var6, fxn1Var7, fxn1Var8, fxn1Var9, fxn1Var10, fxn1Var11, fxn1Var12, fxn1Var13, fxn1Var14, fxn1Var15, fxn1Var16, fxn1Var17, fxn1Var18, fxn1Var19, fxn1Var20, fxn1Var21, fxn1Var22, fxn1Var23, fxn1Var24, fxn1Var25, fxn1Var26, fxn1Var27, fxn1Var28, fxn1Var29, fxn1Var30, fxn1Var31, fxn1Var32, fxn1Var33, fxn1Var34, fxn1Var35, fxn1Var36, fxn1Var37, fxn1Var38, fxn1Var39, fxn1Var40, fxn1Var41, fxn1Var42, fxn1Var43, fxn1Var44, fxn1Var45, fxn1Var46, fxn1Var47, fxn1Var48, fxn1Var49, new fxn1("GROUP_LIST", 49, 49, 2, e1o1Var7), new fxn1("MAP", 50, 50, 4, e1o1.a)};
        fxn1[] fxn1VarArrValues = values();
        d = new fxn1[fxn1VarArrValues.length];
        for (fxn1 fxn1Var50 : fxn1VarArrValues) {
            d[fxn1Var50.a] = fxn1Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fxn1(String str, int i, int i2, int i3, e1o1 e1o1Var) {
        super(str, i);
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            e1o1Var.getClass();
        }
        if (i3 == 1) {
            e1o1 e1o1Var2 = e1o1.a;
            e1o1Var.ordinal();
        }
    }

    public static fxn1[] values() {
        return (fxn1[]) e.clone();
    }
}
