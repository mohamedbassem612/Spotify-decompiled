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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iin1 {
    public static final iin1 b;
    public static final iin1 c;
    public static final iin1[] d;
    public static final /* synthetic */ iin1[] e;
    public final byte a;

    /* JADX INFO: Fake field, exist only in values array */
    iin1 EF0;

    static {
        zin1 zin1Var = zin1.f;
        iin1 iin1Var = new iin1("DOUBLE", 0, 0, 1, zin1Var);
        zin1 zin1Var2 = zin1.e;
        iin1 iin1Var2 = new iin1("FLOAT", 1, 1, 1, zin1Var2);
        zin1 zin1Var3 = zin1.d;
        iin1 iin1Var3 = new iin1("INT64", 2, 2, 1, zin1Var3);
        iin1 iin1Var4 = new iin1("UINT64", 3, 3, 1, zin1Var3);
        zin1 zin1Var4 = zin1.c;
        iin1 iin1Var5 = new iin1("INT32", 4, 4, 1, zin1Var4);
        iin1 iin1Var6 = new iin1("FIXED64", 5, 5, 1, zin1Var3);
        iin1 iin1Var7 = new iin1("FIXED32", 6, 6, 1, zin1Var4);
        zin1 zin1Var5 = zin1.g;
        iin1 iin1Var8 = new iin1("BOOL", 7, 7, 1, zin1Var5);
        zin1 zin1Var6 = zin1.h;
        iin1 iin1Var9 = new iin1("STRING", 8, 8, 1, zin1Var6);
        zin1 zin1Var7 = zin1.X;
        iin1 iin1Var10 = new iin1("MESSAGE", 9, 9, 1, zin1Var7);
        zin1 zin1Var8 = zin1.i;
        iin1 iin1Var11 = new iin1("BYTES", 10, 10, 1, zin1Var8);
        iin1 iin1Var12 = new iin1("UINT32", 11, 11, 1, zin1Var4);
        zin1 zin1Var9 = zin1.t;
        iin1 iin1Var13 = new iin1("ENUM", 12, 12, 1, zin1Var9);
        iin1 iin1Var14 = new iin1("SFIXED32", 13, 13, 1, zin1Var4);
        iin1 iin1Var15 = new iin1("SFIXED64", 14, 14, 1, zin1Var3);
        iin1 iin1Var16 = new iin1("SINT32", 15, 15, 1, zin1Var4);
        iin1 iin1Var17 = new iin1("SINT64", 16, 16, 1, zin1Var3);
        iin1 iin1Var18 = new iin1("GROUP", 17, 17, 1, zin1Var7);
        iin1 iin1Var19 = new iin1("DOUBLE_LIST", 18, 18, 2, zin1Var);
        iin1 iin1Var20 = new iin1("FLOAT_LIST", 19, 19, 2, zin1Var2);
        iin1 iin1Var21 = new iin1("INT64_LIST", 20, 20, 2, zin1Var3);
        iin1 iin1Var22 = new iin1("UINT64_LIST", 21, 21, 2, zin1Var3);
        iin1 iin1Var23 = new iin1("INT32_LIST", 22, 22, 2, zin1Var4);
        iin1 iin1Var24 = new iin1("FIXED64_LIST", 23, 23, 2, zin1Var3);
        iin1 iin1Var25 = new iin1("FIXED32_LIST", 24, 24, 2, zin1Var4);
        iin1 iin1Var26 = new iin1("BOOL_LIST", 25, 25, 2, zin1Var5);
        iin1 iin1Var27 = new iin1("STRING_LIST", 26, 26, 2, zin1Var6);
        iin1 iin1Var28 = new iin1("MESSAGE_LIST", 27, 27, 2, zin1Var7);
        iin1 iin1Var29 = new iin1("BYTES_LIST", 28, 28, 2, zin1Var8);
        iin1 iin1Var30 = new iin1("UINT32_LIST", 29, 29, 2, zin1Var4);
        iin1 iin1Var31 = new iin1("ENUM_LIST", 30, 30, 2, zin1Var9);
        iin1 iin1Var32 = new iin1("SFIXED32_LIST", 31, 31, 2, zin1Var4);
        iin1 iin1Var33 = new iin1("SFIXED64_LIST", 32, 32, 2, zin1Var3);
        iin1 iin1Var34 = new iin1("SINT32_LIST", 33, 33, 2, zin1Var4);
        iin1 iin1Var35 = new iin1("SINT64_LIST", 34, 34, 2, zin1Var3);
        iin1 iin1Var36 = new iin1("DOUBLE_LIST_PACKED", 35, 35, 3, zin1Var);
        b = iin1Var36;
        iin1 iin1Var37 = new iin1("FLOAT_LIST_PACKED", 36, 36, 3, zin1Var2);
        iin1 iin1Var38 = new iin1("INT64_LIST_PACKED", 37, 37, 3, zin1Var3);
        iin1 iin1Var39 = new iin1("UINT64_LIST_PACKED", 38, 38, 3, zin1Var3);
        iin1 iin1Var40 = new iin1("INT32_LIST_PACKED", 39, 39, 3, zin1Var4);
        iin1 iin1Var41 = new iin1("FIXED64_LIST_PACKED", 40, 40, 3, zin1Var3);
        iin1 iin1Var42 = new iin1("FIXED32_LIST_PACKED", 41, 41, 3, zin1Var4);
        iin1 iin1Var43 = new iin1("BOOL_LIST_PACKED", 42, 42, 3, zin1Var5);
        iin1 iin1Var44 = new iin1("UINT32_LIST_PACKED", 43, 43, 3, zin1Var4);
        iin1 iin1Var45 = new iin1("ENUM_LIST_PACKED", 44, 44, 3, zin1Var9);
        iin1 iin1Var46 = new iin1("SFIXED32_LIST_PACKED", 45, 45, 3, zin1Var4);
        iin1 iin1Var47 = new iin1("SFIXED64_LIST_PACKED", 46, 46, 3, zin1Var3);
        iin1 iin1Var48 = new iin1("SINT32_LIST_PACKED", 47, 47, 3, zin1Var4);
        iin1 iin1Var49 = new iin1("SINT64_LIST_PACKED", 48, 48, 3, zin1Var3);
        c = iin1Var49;
        e = new iin1[]{iin1Var, iin1Var2, iin1Var3, iin1Var4, iin1Var5, iin1Var6, iin1Var7, iin1Var8, iin1Var9, iin1Var10, iin1Var11, iin1Var12, iin1Var13, iin1Var14, iin1Var15, iin1Var16, iin1Var17, iin1Var18, iin1Var19, iin1Var20, iin1Var21, iin1Var22, iin1Var23, iin1Var24, iin1Var25, iin1Var26, iin1Var27, iin1Var28, iin1Var29, iin1Var30, iin1Var31, iin1Var32, iin1Var33, iin1Var34, iin1Var35, iin1Var36, iin1Var37, iin1Var38, iin1Var39, iin1Var40, iin1Var41, iin1Var42, iin1Var43, iin1Var44, iin1Var45, iin1Var46, iin1Var47, iin1Var48, iin1Var49, new iin1("GROUP_LIST", 49, 49, 2, zin1Var7), new iin1("MAP", 50, 50, 4, zin1.b)};
        iin1[] iin1VarArrValues = values();
        d = new iin1[iin1VarArrValues.length];
        for (iin1 iin1Var50 : iin1VarArrValues) {
            d[iin1Var50.a] = iin1Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public iin1(String str, int i, int i2, int i3, zin1 zin1Var) {
        super(str, i);
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            Class cls = zin1Var.a;
        }
        if (i3 == 1) {
            zin1 zin1Var2 = zin1.b;
            zin1Var.ordinal();
        }
    }

    public static iin1[] values() {
        return (iin1[]) e.clone();
    }
}
