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
public final class rhp1 {
    public static final rhp1 b;
    public static final rhp1 c;
    public static final rhp1[] d;
    public static final /* synthetic */ rhp1[] e;
    public final byte a;

    /* JADX INFO: Fake field, exist only in values array */
    rhp1 EF0;

    static {
        nip1 nip1Var = nip1.f;
        rhp1 rhp1Var = new rhp1("DOUBLE", 0, 0, 1, nip1Var);
        nip1 nip1Var2 = nip1.e;
        rhp1 rhp1Var2 = new rhp1("FLOAT", 1, 1, 1, nip1Var2);
        nip1 nip1Var3 = nip1.d;
        rhp1 rhp1Var3 = new rhp1("INT64", 2, 2, 1, nip1Var3);
        rhp1 rhp1Var4 = new rhp1("UINT64", 3, 3, 1, nip1Var3);
        nip1 nip1Var4 = nip1.c;
        rhp1 rhp1Var5 = new rhp1("INT32", 4, 4, 1, nip1Var4);
        rhp1 rhp1Var6 = new rhp1("FIXED64", 5, 5, 1, nip1Var3);
        rhp1 rhp1Var7 = new rhp1("FIXED32", 6, 6, 1, nip1Var4);
        nip1 nip1Var5 = nip1.g;
        rhp1 rhp1Var8 = new rhp1("BOOL", 7, 7, 1, nip1Var5);
        nip1 nip1Var6 = nip1.h;
        rhp1 rhp1Var9 = new rhp1("STRING", 8, 8, 1, nip1Var6);
        nip1 nip1Var7 = nip1.X;
        rhp1 rhp1Var10 = new rhp1("MESSAGE", 9, 9, 1, nip1Var7);
        nip1 nip1Var8 = nip1.i;
        rhp1 rhp1Var11 = new rhp1("BYTES", 10, 10, 1, nip1Var8);
        rhp1 rhp1Var12 = new rhp1("UINT32", 11, 11, 1, nip1Var4);
        nip1 nip1Var9 = nip1.t;
        rhp1 rhp1Var13 = new rhp1("ENUM", 12, 12, 1, nip1Var9);
        rhp1 rhp1Var14 = new rhp1("SFIXED32", 13, 13, 1, nip1Var4);
        rhp1 rhp1Var15 = new rhp1("SFIXED64", 14, 14, 1, nip1Var3);
        rhp1 rhp1Var16 = new rhp1("SINT32", 15, 15, 1, nip1Var4);
        rhp1 rhp1Var17 = new rhp1("SINT64", 16, 16, 1, nip1Var3);
        rhp1 rhp1Var18 = new rhp1("GROUP", 17, 17, 1, nip1Var7);
        rhp1 rhp1Var19 = new rhp1("DOUBLE_LIST", 18, 18, 2, nip1Var);
        rhp1 rhp1Var20 = new rhp1("FLOAT_LIST", 19, 19, 2, nip1Var2);
        rhp1 rhp1Var21 = new rhp1("INT64_LIST", 20, 20, 2, nip1Var3);
        rhp1 rhp1Var22 = new rhp1("UINT64_LIST", 21, 21, 2, nip1Var3);
        rhp1 rhp1Var23 = new rhp1("INT32_LIST", 22, 22, 2, nip1Var4);
        rhp1 rhp1Var24 = new rhp1("FIXED64_LIST", 23, 23, 2, nip1Var3);
        rhp1 rhp1Var25 = new rhp1("FIXED32_LIST", 24, 24, 2, nip1Var4);
        rhp1 rhp1Var26 = new rhp1("BOOL_LIST", 25, 25, 2, nip1Var5);
        rhp1 rhp1Var27 = new rhp1("STRING_LIST", 26, 26, 2, nip1Var6);
        rhp1 rhp1Var28 = new rhp1("MESSAGE_LIST", 27, 27, 2, nip1Var7);
        rhp1 rhp1Var29 = new rhp1("BYTES_LIST", 28, 28, 2, nip1Var8);
        rhp1 rhp1Var30 = new rhp1("UINT32_LIST", 29, 29, 2, nip1Var4);
        rhp1 rhp1Var31 = new rhp1("ENUM_LIST", 30, 30, 2, nip1Var9);
        rhp1 rhp1Var32 = new rhp1("SFIXED32_LIST", 31, 31, 2, nip1Var4);
        rhp1 rhp1Var33 = new rhp1("SFIXED64_LIST", 32, 32, 2, nip1Var3);
        rhp1 rhp1Var34 = new rhp1("SINT32_LIST", 33, 33, 2, nip1Var4);
        rhp1 rhp1Var35 = new rhp1("SINT64_LIST", 34, 34, 2, nip1Var3);
        rhp1 rhp1Var36 = new rhp1("DOUBLE_LIST_PACKED", 35, 35, 3, nip1Var);
        b = rhp1Var36;
        rhp1 rhp1Var37 = new rhp1("FLOAT_LIST_PACKED", 36, 36, 3, nip1Var2);
        rhp1 rhp1Var38 = new rhp1("INT64_LIST_PACKED", 37, 37, 3, nip1Var3);
        rhp1 rhp1Var39 = new rhp1("UINT64_LIST_PACKED", 38, 38, 3, nip1Var3);
        rhp1 rhp1Var40 = new rhp1("INT32_LIST_PACKED", 39, 39, 3, nip1Var4);
        rhp1 rhp1Var41 = new rhp1("FIXED64_LIST_PACKED", 40, 40, 3, nip1Var3);
        rhp1 rhp1Var42 = new rhp1("FIXED32_LIST_PACKED", 41, 41, 3, nip1Var4);
        rhp1 rhp1Var43 = new rhp1("BOOL_LIST_PACKED", 42, 42, 3, nip1Var5);
        rhp1 rhp1Var44 = new rhp1("UINT32_LIST_PACKED", 43, 43, 3, nip1Var4);
        rhp1 rhp1Var45 = new rhp1("ENUM_LIST_PACKED", 44, 44, 3, nip1Var9);
        rhp1 rhp1Var46 = new rhp1("SFIXED32_LIST_PACKED", 45, 45, 3, nip1Var4);
        rhp1 rhp1Var47 = new rhp1("SFIXED64_LIST_PACKED", 46, 46, 3, nip1Var3);
        rhp1 rhp1Var48 = new rhp1("SINT32_LIST_PACKED", 47, 47, 3, nip1Var4);
        rhp1 rhp1Var49 = new rhp1("SINT64_LIST_PACKED", 48, 48, 3, nip1Var3);
        c = rhp1Var49;
        e = new rhp1[]{rhp1Var, rhp1Var2, rhp1Var3, rhp1Var4, rhp1Var5, rhp1Var6, rhp1Var7, rhp1Var8, rhp1Var9, rhp1Var10, rhp1Var11, rhp1Var12, rhp1Var13, rhp1Var14, rhp1Var15, rhp1Var16, rhp1Var17, rhp1Var18, rhp1Var19, rhp1Var20, rhp1Var21, rhp1Var22, rhp1Var23, rhp1Var24, rhp1Var25, rhp1Var26, rhp1Var27, rhp1Var28, rhp1Var29, rhp1Var30, rhp1Var31, rhp1Var32, rhp1Var33, rhp1Var34, rhp1Var35, rhp1Var36, rhp1Var37, rhp1Var38, rhp1Var39, rhp1Var40, rhp1Var41, rhp1Var42, rhp1Var43, rhp1Var44, rhp1Var45, rhp1Var46, rhp1Var47, rhp1Var48, rhp1Var49, new rhp1("GROUP_LIST", 49, 49, 2, nip1Var7), new rhp1("MAP", 50, 50, 4, nip1.b)};
        rhp1[] rhp1VarArrValues = values();
        d = new rhp1[rhp1VarArrValues.length];
        for (rhp1 rhp1Var50 : rhp1VarArrValues) {
            d[rhp1Var50.a] = rhp1Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rhp1(String str, int i, int i2, int i3, nip1 nip1Var) {
        super(str, i);
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            Class cls = nip1Var.a;
        }
        if (i3 == 1) {
            nip1 nip1Var2 = nip1.b;
            nip1Var.ordinal();
        }
    }

    public static rhp1[] values() {
        return (rhp1[]) e.clone();
    }
}
