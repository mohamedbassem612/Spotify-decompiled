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
public final class x220 {
    public static final x220 b;
    public static final x220 c;
    public static final x220[] d;
    public static final /* synthetic */ x220[] e;
    public final byte a;

    /* JADX INFO: Fake field, exist only in values array */
    x220 EF0;

    static {
        k8a0 k8a0Var = k8a0.DOUBLE;
        x220 x220Var = new x220("DOUBLE", 0, 0, 1, k8a0Var);
        k8a0 k8a0Var2 = k8a0.FLOAT;
        x220 x220Var2 = new x220("FLOAT", 1, 1, 1, k8a0Var2);
        k8a0 k8a0Var3 = k8a0.LONG;
        x220 x220Var3 = new x220("INT64", 2, 2, 1, k8a0Var3);
        x220 x220Var4 = new x220("UINT64", 3, 3, 1, k8a0Var3);
        k8a0 k8a0Var4 = k8a0.INT;
        x220 x220Var5 = new x220("INT32", 4, 4, 1, k8a0Var4);
        x220 x220Var6 = new x220("FIXED64", 5, 5, 1, k8a0Var3);
        x220 x220Var7 = new x220("FIXED32", 6, 6, 1, k8a0Var4);
        k8a0 k8a0Var5 = k8a0.BOOLEAN;
        x220 x220Var8 = new x220("BOOL", 7, 7, 1, k8a0Var5);
        k8a0 k8a0Var6 = k8a0.STRING;
        x220 x220Var9 = new x220("STRING", 8, 8, 1, k8a0Var6);
        k8a0 k8a0Var7 = k8a0.MESSAGE;
        x220 x220Var10 = new x220("MESSAGE", 9, 9, 1, k8a0Var7);
        k8a0 k8a0Var8 = k8a0.BYTE_STRING;
        x220 x220Var11 = new x220("BYTES", 10, 10, 1, k8a0Var8);
        x220 x220Var12 = new x220("UINT32", 11, 11, 1, k8a0Var4);
        k8a0 k8a0Var9 = k8a0.ENUM;
        x220 x220Var13 = new x220("ENUM", 12, 12, 1, k8a0Var9);
        x220 x220Var14 = new x220("SFIXED32", 13, 13, 1, k8a0Var4);
        x220 x220Var15 = new x220("SFIXED64", 14, 14, 1, k8a0Var3);
        x220 x220Var16 = new x220("SINT32", 15, 15, 1, k8a0Var4);
        x220 x220Var17 = new x220("SINT64", 16, 16, 1, k8a0Var3);
        x220 x220Var18 = new x220("GROUP", 17, 17, 1, k8a0Var7);
        x220 x220Var19 = new x220("DOUBLE_LIST", 18, 18, 2, k8a0Var);
        x220 x220Var20 = new x220("FLOAT_LIST", 19, 19, 2, k8a0Var2);
        x220 x220Var21 = new x220("INT64_LIST", 20, 20, 2, k8a0Var3);
        x220 x220Var22 = new x220("UINT64_LIST", 21, 21, 2, k8a0Var3);
        x220 x220Var23 = new x220("INT32_LIST", 22, 22, 2, k8a0Var4);
        x220 x220Var24 = new x220("FIXED64_LIST", 23, 23, 2, k8a0Var3);
        x220 x220Var25 = new x220("FIXED32_LIST", 24, 24, 2, k8a0Var4);
        x220 x220Var26 = new x220("BOOL_LIST", 25, 25, 2, k8a0Var5);
        x220 x220Var27 = new x220("STRING_LIST", 26, 26, 2, k8a0Var6);
        x220 x220Var28 = new x220("MESSAGE_LIST", 27, 27, 2, k8a0Var7);
        x220 x220Var29 = new x220("BYTES_LIST", 28, 28, 2, k8a0Var8);
        x220 x220Var30 = new x220("UINT32_LIST", 29, 29, 2, k8a0Var4);
        x220 x220Var31 = new x220("ENUM_LIST", 30, 30, 2, k8a0Var9);
        x220 x220Var32 = new x220("SFIXED32_LIST", 31, 31, 2, k8a0Var4);
        x220 x220Var33 = new x220("SFIXED64_LIST", 32, 32, 2, k8a0Var3);
        x220 x220Var34 = new x220("SINT32_LIST", 33, 33, 2, k8a0Var4);
        x220 x220Var35 = new x220("SINT64_LIST", 34, 34, 2, k8a0Var3);
        x220 x220Var36 = new x220("DOUBLE_LIST_PACKED", 35, 35, 3, k8a0Var);
        b = x220Var36;
        x220 x220Var37 = new x220("FLOAT_LIST_PACKED", 36, 36, 3, k8a0Var2);
        x220 x220Var38 = new x220("INT64_LIST_PACKED", 37, 37, 3, k8a0Var3);
        x220 x220Var39 = new x220("UINT64_LIST_PACKED", 38, 38, 3, k8a0Var3);
        x220 x220Var40 = new x220("INT32_LIST_PACKED", 39, 39, 3, k8a0Var4);
        x220 x220Var41 = new x220("FIXED64_LIST_PACKED", 40, 40, 3, k8a0Var3);
        x220 x220Var42 = new x220("FIXED32_LIST_PACKED", 41, 41, 3, k8a0Var4);
        x220 x220Var43 = new x220("BOOL_LIST_PACKED", 42, 42, 3, k8a0Var5);
        x220 x220Var44 = new x220("UINT32_LIST_PACKED", 43, 43, 3, k8a0Var4);
        x220 x220Var45 = new x220("ENUM_LIST_PACKED", 44, 44, 3, k8a0Var9);
        x220 x220Var46 = new x220("SFIXED32_LIST_PACKED", 45, 45, 3, k8a0Var4);
        x220 x220Var47 = new x220("SFIXED64_LIST_PACKED", 46, 46, 3, k8a0Var3);
        x220 x220Var48 = new x220("SINT32_LIST_PACKED", 47, 47, 3, k8a0Var4);
        x220 x220Var49 = new x220("SINT64_LIST_PACKED", 48, 48, 3, k8a0Var3);
        c = x220Var49;
        e = new x220[]{x220Var, x220Var2, x220Var3, x220Var4, x220Var5, x220Var6, x220Var7, x220Var8, x220Var9, x220Var10, x220Var11, x220Var12, x220Var13, x220Var14, x220Var15, x220Var16, x220Var17, x220Var18, x220Var19, x220Var20, x220Var21, x220Var22, x220Var23, x220Var24, x220Var25, x220Var26, x220Var27, x220Var28, x220Var29, x220Var30, x220Var31, x220Var32, x220Var33, x220Var34, x220Var35, x220Var36, x220Var37, x220Var38, x220Var39, x220Var40, x220Var41, x220Var42, x220Var43, x220Var44, x220Var45, x220Var46, x220Var47, x220Var48, x220Var49, new x220("GROUP_LIST", 49, 49, 2, k8a0Var7), new x220("MAP", 50, 50, 4, k8a0.VOID)};
        x220[] x220VarArrValues = values();
        d = new x220[x220VarArrValues.length];
        for (x220 x220Var50 : x220VarArrValues) {
            d[x220Var50.a] = x220Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x220(String str, int i, int i2, int i3, k8a0 k8a0Var) {
        super(str, i);
        this.a = i2;
        int iC = l1d.C(i3);
        if (iC == 1 || iC == 3) {
            Class cls = k8a0Var.a;
        }
        if (i3 == 1) {
            k8a0Var.ordinal();
        }
    }

    public static x220 valueOf(String str) {
        return (x220) Enum.valueOf(x220.class, str);
    }

    public static x220[] values() {
        return (x220[]) e.clone();
    }
}
