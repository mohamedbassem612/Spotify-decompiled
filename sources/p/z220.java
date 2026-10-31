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
public final class z220 {
    public static final z220 b;
    public static final z220 c;
    public static final z220[] d;
    public static final /* synthetic */ z220[] e;
    public final byte a;

    /* JADX INFO: Fake field, exist only in values array */
    z220 EF0;

    static {
        m8a0 m8a0Var = m8a0.DOUBLE;
        z220 z220Var = new z220("DOUBLE", 0, 0, 1, m8a0Var);
        m8a0 m8a0Var2 = m8a0.FLOAT;
        z220 z220Var2 = new z220("FLOAT", 1, 1, 1, m8a0Var2);
        m8a0 m8a0Var3 = m8a0.LONG;
        z220 z220Var3 = new z220("INT64", 2, 2, 1, m8a0Var3);
        z220 z220Var4 = new z220("UINT64", 3, 3, 1, m8a0Var3);
        m8a0 m8a0Var4 = m8a0.INT;
        z220 z220Var5 = new z220("INT32", 4, 4, 1, m8a0Var4);
        z220 z220Var6 = new z220("FIXED64", 5, 5, 1, m8a0Var3);
        z220 z220Var7 = new z220("FIXED32", 6, 6, 1, m8a0Var4);
        m8a0 m8a0Var5 = m8a0.BOOLEAN;
        z220 z220Var8 = new z220("BOOL", 7, 7, 1, m8a0Var5);
        m8a0 m8a0Var6 = m8a0.STRING;
        z220 z220Var9 = new z220("STRING", 8, 8, 1, m8a0Var6);
        m8a0 m8a0Var7 = m8a0.MESSAGE;
        z220 z220Var10 = new z220("MESSAGE", 9, 9, 1, m8a0Var7);
        m8a0 m8a0Var8 = m8a0.BYTE_STRING;
        z220 z220Var11 = new z220("BYTES", 10, 10, 1, m8a0Var8);
        z220 z220Var12 = new z220("UINT32", 11, 11, 1, m8a0Var4);
        m8a0 m8a0Var9 = m8a0.ENUM;
        z220 z220Var13 = new z220("ENUM", 12, 12, 1, m8a0Var9);
        z220 z220Var14 = new z220("SFIXED32", 13, 13, 1, m8a0Var4);
        z220 z220Var15 = new z220("SFIXED64", 14, 14, 1, m8a0Var3);
        z220 z220Var16 = new z220("SINT32", 15, 15, 1, m8a0Var4);
        z220 z220Var17 = new z220("SINT64", 16, 16, 1, m8a0Var3);
        z220 z220Var18 = new z220("GROUP", 17, 17, 1, m8a0Var7);
        z220 z220Var19 = new z220("DOUBLE_LIST", 18, 18, 2, m8a0Var);
        z220 z220Var20 = new z220("FLOAT_LIST", 19, 19, 2, m8a0Var2);
        z220 z220Var21 = new z220("INT64_LIST", 20, 20, 2, m8a0Var3);
        z220 z220Var22 = new z220("UINT64_LIST", 21, 21, 2, m8a0Var3);
        z220 z220Var23 = new z220("INT32_LIST", 22, 22, 2, m8a0Var4);
        z220 z220Var24 = new z220("FIXED64_LIST", 23, 23, 2, m8a0Var3);
        z220 z220Var25 = new z220("FIXED32_LIST", 24, 24, 2, m8a0Var4);
        z220 z220Var26 = new z220("BOOL_LIST", 25, 25, 2, m8a0Var5);
        z220 z220Var27 = new z220("STRING_LIST", 26, 26, 2, m8a0Var6);
        z220 z220Var28 = new z220("MESSAGE_LIST", 27, 27, 2, m8a0Var7);
        z220 z220Var29 = new z220("BYTES_LIST", 28, 28, 2, m8a0Var8);
        z220 z220Var30 = new z220("UINT32_LIST", 29, 29, 2, m8a0Var4);
        z220 z220Var31 = new z220("ENUM_LIST", 30, 30, 2, m8a0Var9);
        z220 z220Var32 = new z220("SFIXED32_LIST", 31, 31, 2, m8a0Var4);
        z220 z220Var33 = new z220("SFIXED64_LIST", 32, 32, 2, m8a0Var3);
        z220 z220Var34 = new z220("SINT32_LIST", 33, 33, 2, m8a0Var4);
        z220 z220Var35 = new z220("SINT64_LIST", 34, 34, 2, m8a0Var3);
        z220 z220Var36 = new z220("DOUBLE_LIST_PACKED", 35, 35, 3, m8a0Var);
        b = z220Var36;
        z220 z220Var37 = new z220("FLOAT_LIST_PACKED", 36, 36, 3, m8a0Var2);
        z220 z220Var38 = new z220("INT64_LIST_PACKED", 37, 37, 3, m8a0Var3);
        z220 z220Var39 = new z220("UINT64_LIST_PACKED", 38, 38, 3, m8a0Var3);
        z220 z220Var40 = new z220("INT32_LIST_PACKED", 39, 39, 3, m8a0Var4);
        z220 z220Var41 = new z220("FIXED64_LIST_PACKED", 40, 40, 3, m8a0Var3);
        z220 z220Var42 = new z220("FIXED32_LIST_PACKED", 41, 41, 3, m8a0Var4);
        z220 z220Var43 = new z220("BOOL_LIST_PACKED", 42, 42, 3, m8a0Var5);
        z220 z220Var44 = new z220("UINT32_LIST_PACKED", 43, 43, 3, m8a0Var4);
        z220 z220Var45 = new z220("ENUM_LIST_PACKED", 44, 44, 3, m8a0Var9);
        z220 z220Var46 = new z220("SFIXED32_LIST_PACKED", 45, 45, 3, m8a0Var4);
        z220 z220Var47 = new z220("SFIXED64_LIST_PACKED", 46, 46, 3, m8a0Var3);
        z220 z220Var48 = new z220("SINT32_LIST_PACKED", 47, 47, 3, m8a0Var4);
        z220 z220Var49 = new z220("SINT64_LIST_PACKED", 48, 48, 3, m8a0Var3);
        c = z220Var49;
        e = new z220[]{z220Var, z220Var2, z220Var3, z220Var4, z220Var5, z220Var6, z220Var7, z220Var8, z220Var9, z220Var10, z220Var11, z220Var12, z220Var13, z220Var14, z220Var15, z220Var16, z220Var17, z220Var18, z220Var19, z220Var20, z220Var21, z220Var22, z220Var23, z220Var24, z220Var25, z220Var26, z220Var27, z220Var28, z220Var29, z220Var30, z220Var31, z220Var32, z220Var33, z220Var34, z220Var35, z220Var36, z220Var37, z220Var38, z220Var39, z220Var40, z220Var41, z220Var42, z220Var43, z220Var44, z220Var45, z220Var46, z220Var47, z220Var48, z220Var49, new z220("GROUP_LIST", 49, 49, 2, m8a0Var7), new z220("MAP", 50, 50, 4, m8a0.VOID)};
        z220[] z220VarArrValues = values();
        d = new z220[z220VarArrValues.length];
        for (z220 z220Var50 : z220VarArrValues) {
            d[z220Var50.a] = z220Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z220(String str, int i, int i2, int i3, m8a0 m8a0Var) {
        super(str, i);
        this.a = i2;
        int iC = l1d.C(i3);
        if (iC == 1 || iC == 3) {
            Class cls = m8a0Var.a;
        }
        if (i3 == 1) {
            m8a0Var.ordinal();
        }
    }

    public static z220 valueOf(String str) {
        return (z220) Enum.valueOf(z220.class, str);
    }

    public static z220[] values() {
        return (z220[]) e.clone();
    }
}
