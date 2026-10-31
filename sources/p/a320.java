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
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a320 {
    public static final a320 b;
    public static final a320 c;
    public static final a320[] d;
    public static final /* synthetic */ a320[] e;
    public final byte a;

    /* JADX INFO: Fake field, exist only in values array */
    a320 EF0;

    static {
        n8a0 n8a0Var = n8a0.DOUBLE;
        a320 a320Var = new a320("DOUBLE", 0, 0, 1, n8a0Var);
        n8a0 n8a0Var2 = n8a0.FLOAT;
        a320 a320Var2 = new a320("FLOAT", 1, 1, 1, n8a0Var2);
        n8a0 n8a0Var3 = n8a0.LONG;
        a320 a320Var3 = new a320("INT64", 2, 2, 1, n8a0Var3);
        a320 a320Var4 = new a320("UINT64", 3, 3, 1, n8a0Var3);
        n8a0 n8a0Var4 = n8a0.INT;
        a320 a320Var5 = new a320("INT32", 4, 4, 1, n8a0Var4);
        a320 a320Var6 = new a320("FIXED64", 5, 5, 1, n8a0Var3);
        a320 a320Var7 = new a320("FIXED32", 6, 6, 1, n8a0Var4);
        n8a0 n8a0Var5 = n8a0.BOOLEAN;
        a320 a320Var8 = new a320("BOOL", 7, 7, 1, n8a0Var5);
        n8a0 n8a0Var6 = n8a0.STRING;
        a320 a320Var9 = new a320("STRING", 8, 8, 1, n8a0Var6);
        n8a0 n8a0Var7 = n8a0.MESSAGE;
        a320 a320Var10 = new a320("MESSAGE", 9, 9, 1, n8a0Var7);
        n8a0 n8a0Var8 = n8a0.BYTE_STRING;
        a320 a320Var11 = new a320("BYTES", 10, 10, 1, n8a0Var8);
        a320 a320Var12 = new a320("UINT32", 11, 11, 1, n8a0Var4);
        n8a0 n8a0Var9 = n8a0.ENUM;
        a320 a320Var13 = new a320("ENUM", 12, 12, 1, n8a0Var9);
        a320 a320Var14 = new a320("SFIXED32", 13, 13, 1, n8a0Var4);
        a320 a320Var15 = new a320("SFIXED64", 14, 14, 1, n8a0Var3);
        a320 a320Var16 = new a320("SINT32", 15, 15, 1, n8a0Var4);
        a320 a320Var17 = new a320("SINT64", 16, 16, 1, n8a0Var3);
        a320 a320Var18 = new a320("GROUP", 17, 17, 1, n8a0Var7);
        a320 a320Var19 = new a320("DOUBLE_LIST", 18, 18, 2, n8a0Var);
        a320 a320Var20 = new a320("FLOAT_LIST", 19, 19, 2, n8a0Var2);
        a320 a320Var21 = new a320("INT64_LIST", 20, 20, 2, n8a0Var3);
        a320 a320Var22 = new a320("UINT64_LIST", 21, 21, 2, n8a0Var3);
        a320 a320Var23 = new a320("INT32_LIST", 22, 22, 2, n8a0Var4);
        a320 a320Var24 = new a320("FIXED64_LIST", 23, 23, 2, n8a0Var3);
        a320 a320Var25 = new a320("FIXED32_LIST", 24, 24, 2, n8a0Var4);
        a320 a320Var26 = new a320("BOOL_LIST", 25, 25, 2, n8a0Var5);
        a320 a320Var27 = new a320("STRING_LIST", 26, 26, 2, n8a0Var6);
        a320 a320Var28 = new a320("MESSAGE_LIST", 27, 27, 2, n8a0Var7);
        a320 a320Var29 = new a320("BYTES_LIST", 28, 28, 2, n8a0Var8);
        a320 a320Var30 = new a320("UINT32_LIST", 29, 29, 2, n8a0Var4);
        a320 a320Var31 = new a320("ENUM_LIST", 30, 30, 2, n8a0Var9);
        a320 a320Var32 = new a320("SFIXED32_LIST", 31, 31, 2, n8a0Var4);
        a320 a320Var33 = new a320("SFIXED64_LIST", 32, 32, 2, n8a0Var3);
        a320 a320Var34 = new a320("SINT32_LIST", 33, 33, 2, n8a0Var4);
        a320 a320Var35 = new a320("SINT64_LIST", 34, 34, 2, n8a0Var3);
        a320 a320Var36 = new a320("DOUBLE_LIST_PACKED", 35, 35, 3, n8a0Var);
        b = a320Var36;
        a320 a320Var37 = new a320("FLOAT_LIST_PACKED", 36, 36, 3, n8a0Var2);
        a320 a320Var38 = new a320("INT64_LIST_PACKED", 37, 37, 3, n8a0Var3);
        a320 a320Var39 = new a320("UINT64_LIST_PACKED", 38, 38, 3, n8a0Var3);
        a320 a320Var40 = new a320("INT32_LIST_PACKED", 39, 39, 3, n8a0Var4);
        a320 a320Var41 = new a320("FIXED64_LIST_PACKED", 40, 40, 3, n8a0Var3);
        a320 a320Var42 = new a320("FIXED32_LIST_PACKED", 41, 41, 3, n8a0Var4);
        a320 a320Var43 = new a320("BOOL_LIST_PACKED", 42, 42, 3, n8a0Var5);
        a320 a320Var44 = new a320("UINT32_LIST_PACKED", 43, 43, 3, n8a0Var4);
        a320 a320Var45 = new a320("ENUM_LIST_PACKED", 44, 44, 3, n8a0Var9);
        a320 a320Var46 = new a320("SFIXED32_LIST_PACKED", 45, 45, 3, n8a0Var4);
        a320 a320Var47 = new a320("SFIXED64_LIST_PACKED", 46, 46, 3, n8a0Var3);
        a320 a320Var48 = new a320("SINT32_LIST_PACKED", 47, 47, 3, n8a0Var4);
        a320 a320Var49 = new a320("SINT64_LIST_PACKED", 48, 48, 3, n8a0Var3);
        c = a320Var49;
        e = new a320[]{a320Var, a320Var2, a320Var3, a320Var4, a320Var5, a320Var6, a320Var7, a320Var8, a320Var9, a320Var10, a320Var11, a320Var12, a320Var13, a320Var14, a320Var15, a320Var16, a320Var17, a320Var18, a320Var19, a320Var20, a320Var21, a320Var22, a320Var23, a320Var24, a320Var25, a320Var26, a320Var27, a320Var28, a320Var29, a320Var30, a320Var31, a320Var32, a320Var33, a320Var34, a320Var35, a320Var36, a320Var37, a320Var38, a320Var39, a320Var40, a320Var41, a320Var42, a320Var43, a320Var44, a320Var45, a320Var46, a320Var47, a320Var48, a320Var49, new a320("GROUP_LIST", 49, 49, 2, n8a0Var7), new a320("MAP", 50, 50, 4, n8a0.VOID)};
        a320[] a320VarArrValues = values();
        d = new a320[a320VarArrValues.length];
        for (a320 a320Var50 : a320VarArrValues) {
            d[a320Var50.a] = a320Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a320(String str, int i, int i2, int i3, n8a0 n8a0Var) {
        super(str, i);
        this.a = i2;
        int iC = l1d.C(i3);
        if (iC == 1 || iC == 3) {
            Class cls = n8a0Var.a;
        }
        if (i3 == 1) {
            n8a0Var.ordinal();
        }
    }

    public static a320 valueOf(String str) {
        return (a320) Enum.valueOf(a320.class, str);
    }

    public static a320[] values() {
        return (a320[]) e.clone();
    }

    public final int a() {
        return this.a;
    }
}
