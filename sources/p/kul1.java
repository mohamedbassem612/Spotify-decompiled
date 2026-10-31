package p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class kul1 {
    public static final kul1 X;
    public static final kul1 Y;
    public static final /* synthetic */ kul1[] Z;
    public static final kul1 c;
    public static final kul1 d;
    public static final kul1 e;
    public static final kul1 f;
    public static final ytl1 g;
    public static final bul1 h;
    public static final eul1 i;
    public static final hul1 t;
    public final nul1 a;
    public final byte b;

    /* JADX INFO: Fake field, exist only in values array */
    kul1 EF1;

    static {
        kul1 kul1Var = new kul1("DOUBLE", 0, nul1.d, 1);
        c = kul1Var;
        kul1 kul1Var2 = new kul1("FLOAT", 1, nul1.c, 5);
        nul1 nul1Var = nul1.b;
        kul1 kul1Var3 = new kul1("INT64", 2, nul1Var, 0);
        d = kul1Var3;
        kul1 kul1Var4 = new kul1("UINT64", 3, nul1Var, 0);
        nul1 nul1Var2 = nul1.a;
        kul1 kul1Var5 = new kul1("INT32", 4, nul1Var2, 0);
        e = kul1Var5;
        kul1 kul1Var6 = new kul1("FIXED64", 5, nul1Var, 1);
        kul1 kul1Var7 = new kul1("FIXED32", 6, nul1Var2, 5);
        kul1 kul1Var8 = new kul1("BOOL", 7, nul1.e, 0);
        f = kul1Var8;
        ytl1 ytl1Var = new ytl1("STRING", 8, nul1.f, 2);
        g = ytl1Var;
        nul1 nul1Var3 = nul1.i;
        bul1 bul1Var = new bul1("GROUP", 9, nul1Var3, 3);
        h = bul1Var;
        eul1 eul1Var = new eul1("MESSAGE", 10, nul1Var3, 2);
        i = eul1Var;
        hul1 hul1Var = new hul1("BYTES", 11, nul1.g, 2);
        t = hul1Var;
        kul1 kul1Var9 = new kul1("UINT32", 12, nul1Var2, 0);
        X = kul1Var9;
        kul1 kul1Var10 = new kul1("ENUM", 13, nul1.h, 0);
        Y = kul1Var10;
        Z = new kul1[]{kul1Var, kul1Var2, kul1Var3, kul1Var4, kul1Var5, kul1Var6, kul1Var7, kul1Var8, ytl1Var, bul1Var, eul1Var, hul1Var, kul1Var9, kul1Var10, new kul1("SFIXED32", 14, nul1Var2, 5), new kul1("SFIXED64", 15, nul1Var, 1), new kul1("SINT32", 16, nul1Var2, 0), new kul1("SINT64", 17, nul1Var, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kul1(String str, int i2, nul1 nul1Var, int i3) {
        super(str, i2);
        this.a = nul1Var;
        this.b = i3;
    }

    public static kul1 valueOf(String str) {
        return (kul1) Enum.valueOf(kul1.class, str);
    }

    public static kul1[] values() {
        return (kul1[]) Z.clone();
    }
}
