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
public final class y220 {
    public static final y220 b;
    public static final y220 c;
    public static final y220[] d;
    public static final /* synthetic */ y220[] e;
    public final byte a;

    /* JADX INFO: Fake field, exist only in values array */
    y220 EF0;

    static {
        l8a0 l8a0Var = l8a0.DOUBLE;
        y220 y220Var = new y220("DOUBLE", 0, 0, 1, l8a0Var);
        l8a0 l8a0Var2 = l8a0.FLOAT;
        y220 y220Var2 = new y220("FLOAT", 1, 1, 1, l8a0Var2);
        l8a0 l8a0Var3 = l8a0.LONG;
        y220 y220Var3 = new y220("INT64", 2, 2, 1, l8a0Var3);
        y220 y220Var4 = new y220("UINT64", 3, 3, 1, l8a0Var3);
        l8a0 l8a0Var4 = l8a0.INT;
        y220 y220Var5 = new y220("INT32", 4, 4, 1, l8a0Var4);
        y220 y220Var6 = new y220("FIXED64", 5, 5, 1, l8a0Var3);
        y220 y220Var7 = new y220("FIXED32", 6, 6, 1, l8a0Var4);
        l8a0 l8a0Var5 = l8a0.BOOLEAN;
        y220 y220Var8 = new y220("BOOL", 7, 7, 1, l8a0Var5);
        l8a0 l8a0Var6 = l8a0.STRING;
        y220 y220Var9 = new y220("STRING", 8, 8, 1, l8a0Var6);
        l8a0 l8a0Var7 = l8a0.MESSAGE;
        y220 y220Var10 = new y220("MESSAGE", 9, 9, 1, l8a0Var7);
        l8a0 l8a0Var8 = l8a0.BYTE_STRING;
        y220 y220Var11 = new y220("BYTES", 10, 10, 1, l8a0Var8);
        y220 y220Var12 = new y220("UINT32", 11, 11, 1, l8a0Var4);
        l8a0 l8a0Var9 = l8a0.ENUM;
        y220 y220Var13 = new y220("ENUM", 12, 12, 1, l8a0Var9);
        y220 y220Var14 = new y220("SFIXED32", 13, 13, 1, l8a0Var4);
        y220 y220Var15 = new y220("SFIXED64", 14, 14, 1, l8a0Var3);
        y220 y220Var16 = new y220("SINT32", 15, 15, 1, l8a0Var4);
        y220 y220Var17 = new y220("SINT64", 16, 16, 1, l8a0Var3);
        y220 y220Var18 = new y220("GROUP", 17, 17, 1, l8a0Var7);
        y220 y220Var19 = new y220("DOUBLE_LIST", 18, 18, 2, l8a0Var);
        y220 y220Var20 = new y220("FLOAT_LIST", 19, 19, 2, l8a0Var2);
        y220 y220Var21 = new y220("INT64_LIST", 20, 20, 2, l8a0Var3);
        y220 y220Var22 = new y220("UINT64_LIST", 21, 21, 2, l8a0Var3);
        y220 y220Var23 = new y220("INT32_LIST", 22, 22, 2, l8a0Var4);
        y220 y220Var24 = new y220("FIXED64_LIST", 23, 23, 2, l8a0Var3);
        y220 y220Var25 = new y220("FIXED32_LIST", 24, 24, 2, l8a0Var4);
        y220 y220Var26 = new y220("BOOL_LIST", 25, 25, 2, l8a0Var5);
        y220 y220Var27 = new y220("STRING_LIST", 26, 26, 2, l8a0Var6);
        y220 y220Var28 = new y220("MESSAGE_LIST", 27, 27, 2, l8a0Var7);
        y220 y220Var29 = new y220("BYTES_LIST", 28, 28, 2, l8a0Var8);
        y220 y220Var30 = new y220("UINT32_LIST", 29, 29, 2, l8a0Var4);
        y220 y220Var31 = new y220("ENUM_LIST", 30, 30, 2, l8a0Var9);
        y220 y220Var32 = new y220("SFIXED32_LIST", 31, 31, 2, l8a0Var4);
        y220 y220Var33 = new y220("SFIXED64_LIST", 32, 32, 2, l8a0Var3);
        y220 y220Var34 = new y220("SINT32_LIST", 33, 33, 2, l8a0Var4);
        y220 y220Var35 = new y220("SINT64_LIST", 34, 34, 2, l8a0Var3);
        y220 y220Var36 = new y220("DOUBLE_LIST_PACKED", 35, 35, 3, l8a0Var);
        b = y220Var36;
        y220 y220Var37 = new y220("FLOAT_LIST_PACKED", 36, 36, 3, l8a0Var2);
        y220 y220Var38 = new y220("INT64_LIST_PACKED", 37, 37, 3, l8a0Var3);
        y220 y220Var39 = new y220("UINT64_LIST_PACKED", 38, 38, 3, l8a0Var3);
        y220 y220Var40 = new y220("INT32_LIST_PACKED", 39, 39, 3, l8a0Var4);
        y220 y220Var41 = new y220("FIXED64_LIST_PACKED", 40, 40, 3, l8a0Var3);
        y220 y220Var42 = new y220("FIXED32_LIST_PACKED", 41, 41, 3, l8a0Var4);
        y220 y220Var43 = new y220("BOOL_LIST_PACKED", 42, 42, 3, l8a0Var5);
        y220 y220Var44 = new y220("UINT32_LIST_PACKED", 43, 43, 3, l8a0Var4);
        y220 y220Var45 = new y220("ENUM_LIST_PACKED", 44, 44, 3, l8a0Var9);
        y220 y220Var46 = new y220("SFIXED32_LIST_PACKED", 45, 45, 3, l8a0Var4);
        y220 y220Var47 = new y220("SFIXED64_LIST_PACKED", 46, 46, 3, l8a0Var3);
        y220 y220Var48 = new y220("SINT32_LIST_PACKED", 47, 47, 3, l8a0Var4);
        y220 y220Var49 = new y220("SINT64_LIST_PACKED", 48, 48, 3, l8a0Var3);
        c = y220Var49;
        e = new y220[]{y220Var, y220Var2, y220Var3, y220Var4, y220Var5, y220Var6, y220Var7, y220Var8, y220Var9, y220Var10, y220Var11, y220Var12, y220Var13, y220Var14, y220Var15, y220Var16, y220Var17, y220Var18, y220Var19, y220Var20, y220Var21, y220Var22, y220Var23, y220Var24, y220Var25, y220Var26, y220Var27, y220Var28, y220Var29, y220Var30, y220Var31, y220Var32, y220Var33, y220Var34, y220Var35, y220Var36, y220Var37, y220Var38, y220Var39, y220Var40, y220Var41, y220Var42, y220Var43, y220Var44, y220Var45, y220Var46, y220Var47, y220Var48, y220Var49, new y220("GROUP_LIST", 49, 49, 2, l8a0Var7), new y220("MAP", 50, 50, 4, l8a0.VOID)};
        y220[] y220VarArrValues = values();
        d = new y220[y220VarArrValues.length];
        for (y220 y220Var50 : y220VarArrValues) {
            d[y220Var50.a] = y220Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y220(String str, int i, int i2, int i3, l8a0 l8a0Var) {
        super(str, i);
        this.a = i2;
        int iC = l1d.C(i3);
        if (iC == 1 || iC == 3) {
            Class cls = l8a0Var.a;
        }
        if (i3 == 1) {
            l8a0Var.ordinal();
        }
    }

    public static y220 valueOf(String str) {
        return (y220) Enum.valueOf(y220.class, str);
    }

    public static y220[] values() {
        return (y220[]) e.clone();
    }
}
