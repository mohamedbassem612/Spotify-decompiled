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
public final class f9o1 {
    public static final f9o1 b;
    public static final f9o1 c;
    public static final f9o1[] d;
    public static final /* synthetic */ f9o1[] e;
    public final byte a;

    /* JADX INFO: Fake field, exist only in values array */
    f9o1 EF0;

    static {
        ico1 ico1Var = ico1.f;
        f9o1 f9o1Var = new f9o1("DOUBLE", 0, 0, 1, ico1Var);
        ico1 ico1Var2 = ico1.e;
        f9o1 f9o1Var2 = new f9o1("FLOAT", 1, 1, 1, ico1Var2);
        ico1 ico1Var3 = ico1.d;
        f9o1 f9o1Var3 = new f9o1("INT64", 2, 2, 1, ico1Var3);
        f9o1 f9o1Var4 = new f9o1("UINT64", 3, 3, 1, ico1Var3);
        ico1 ico1Var4 = ico1.c;
        f9o1 f9o1Var5 = new f9o1("INT32", 4, 4, 1, ico1Var4);
        f9o1 f9o1Var6 = new f9o1("FIXED64", 5, 5, 1, ico1Var3);
        f9o1 f9o1Var7 = new f9o1("FIXED32", 6, 6, 1, ico1Var4);
        ico1 ico1Var5 = ico1.g;
        f9o1 f9o1Var8 = new f9o1("BOOL", 7, 7, 1, ico1Var5);
        ico1 ico1Var6 = ico1.h;
        f9o1 f9o1Var9 = new f9o1("STRING", 8, 8, 1, ico1Var6);
        ico1 ico1Var7 = ico1.X;
        f9o1 f9o1Var10 = new f9o1("MESSAGE", 9, 9, 1, ico1Var7);
        ico1 ico1Var8 = ico1.i;
        f9o1 f9o1Var11 = new f9o1("BYTES", 10, 10, 1, ico1Var8);
        f9o1 f9o1Var12 = new f9o1("UINT32", 11, 11, 1, ico1Var4);
        ico1 ico1Var9 = ico1.t;
        f9o1 f9o1Var13 = new f9o1("ENUM", 12, 12, 1, ico1Var9);
        f9o1 f9o1Var14 = new f9o1("SFIXED32", 13, 13, 1, ico1Var4);
        f9o1 f9o1Var15 = new f9o1("SFIXED64", 14, 14, 1, ico1Var3);
        f9o1 f9o1Var16 = new f9o1("SINT32", 15, 15, 1, ico1Var4);
        f9o1 f9o1Var17 = new f9o1("SINT64", 16, 16, 1, ico1Var3);
        f9o1 f9o1Var18 = new f9o1("GROUP", 17, 17, 1, ico1Var7);
        f9o1 f9o1Var19 = new f9o1("DOUBLE_LIST", 18, 18, 2, ico1Var);
        f9o1 f9o1Var20 = new f9o1("FLOAT_LIST", 19, 19, 2, ico1Var2);
        f9o1 f9o1Var21 = new f9o1("INT64_LIST", 20, 20, 2, ico1Var3);
        f9o1 f9o1Var22 = new f9o1("UINT64_LIST", 21, 21, 2, ico1Var3);
        f9o1 f9o1Var23 = new f9o1("INT32_LIST", 22, 22, 2, ico1Var4);
        f9o1 f9o1Var24 = new f9o1("FIXED64_LIST", 23, 23, 2, ico1Var3);
        f9o1 f9o1Var25 = new f9o1("FIXED32_LIST", 24, 24, 2, ico1Var4);
        f9o1 f9o1Var26 = new f9o1("BOOL_LIST", 25, 25, 2, ico1Var5);
        f9o1 f9o1Var27 = new f9o1("STRING_LIST", 26, 26, 2, ico1Var6);
        f9o1 f9o1Var28 = new f9o1("MESSAGE_LIST", 27, 27, 2, ico1Var7);
        f9o1 f9o1Var29 = new f9o1("BYTES_LIST", 28, 28, 2, ico1Var8);
        f9o1 f9o1Var30 = new f9o1("UINT32_LIST", 29, 29, 2, ico1Var4);
        f9o1 f9o1Var31 = new f9o1("ENUM_LIST", 30, 30, 2, ico1Var9);
        f9o1 f9o1Var32 = new f9o1("SFIXED32_LIST", 31, 31, 2, ico1Var4);
        f9o1 f9o1Var33 = new f9o1("SFIXED64_LIST", 32, 32, 2, ico1Var3);
        f9o1 f9o1Var34 = new f9o1("SINT32_LIST", 33, 33, 2, ico1Var4);
        f9o1 f9o1Var35 = new f9o1("SINT64_LIST", 34, 34, 2, ico1Var3);
        f9o1 f9o1Var36 = new f9o1("DOUBLE_LIST_PACKED", 35, 35, 3, ico1Var);
        b = f9o1Var36;
        f9o1 f9o1Var37 = new f9o1("FLOAT_LIST_PACKED", 36, 36, 3, ico1Var2);
        f9o1 f9o1Var38 = new f9o1("INT64_LIST_PACKED", 37, 37, 3, ico1Var3);
        f9o1 f9o1Var39 = new f9o1("UINT64_LIST_PACKED", 38, 38, 3, ico1Var3);
        f9o1 f9o1Var40 = new f9o1("INT32_LIST_PACKED", 39, 39, 3, ico1Var4);
        f9o1 f9o1Var41 = new f9o1("FIXED64_LIST_PACKED", 40, 40, 3, ico1Var3);
        f9o1 f9o1Var42 = new f9o1("FIXED32_LIST_PACKED", 41, 41, 3, ico1Var4);
        f9o1 f9o1Var43 = new f9o1("BOOL_LIST_PACKED", 42, 42, 3, ico1Var5);
        f9o1 f9o1Var44 = new f9o1("UINT32_LIST_PACKED", 43, 43, 3, ico1Var4);
        f9o1 f9o1Var45 = new f9o1("ENUM_LIST_PACKED", 44, 44, 3, ico1Var9);
        f9o1 f9o1Var46 = new f9o1("SFIXED32_LIST_PACKED", 45, 45, 3, ico1Var4);
        f9o1 f9o1Var47 = new f9o1("SFIXED64_LIST_PACKED", 46, 46, 3, ico1Var3);
        f9o1 f9o1Var48 = new f9o1("SINT32_LIST_PACKED", 47, 47, 3, ico1Var4);
        f9o1 f9o1Var49 = new f9o1("SINT64_LIST_PACKED", 48, 48, 3, ico1Var3);
        c = f9o1Var49;
        e = new f9o1[]{f9o1Var, f9o1Var2, f9o1Var3, f9o1Var4, f9o1Var5, f9o1Var6, f9o1Var7, f9o1Var8, f9o1Var9, f9o1Var10, f9o1Var11, f9o1Var12, f9o1Var13, f9o1Var14, f9o1Var15, f9o1Var16, f9o1Var17, f9o1Var18, f9o1Var19, f9o1Var20, f9o1Var21, f9o1Var22, f9o1Var23, f9o1Var24, f9o1Var25, f9o1Var26, f9o1Var27, f9o1Var28, f9o1Var29, f9o1Var30, f9o1Var31, f9o1Var32, f9o1Var33, f9o1Var34, f9o1Var35, f9o1Var36, f9o1Var37, f9o1Var38, f9o1Var39, f9o1Var40, f9o1Var41, f9o1Var42, f9o1Var43, f9o1Var44, f9o1Var45, f9o1Var46, f9o1Var47, f9o1Var48, f9o1Var49, new f9o1("GROUP_LIST", 49, 49, 2, ico1Var7), new f9o1("MAP", 50, 50, 4, ico1.b)};
        f9o1[] f9o1VarArrValues = values();
        d = new f9o1[f9o1VarArrValues.length];
        for (f9o1 f9o1Var50 : f9o1VarArrValues) {
            d[f9o1Var50.a] = f9o1Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f9o1(String str, int i, int i2, int i3, ico1 ico1Var) {
        super(str, i);
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            Class cls = ico1Var.a;
        }
        if (i3 == 1) {
            ico1 ico1Var2 = ico1.b;
            ico1Var.ordinal();
        }
    }

    public static f9o1[] values() {
        return (f9o1[]) e.clone();
    }
}
