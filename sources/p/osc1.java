package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class osc1 extends hab0 implements vu30 {
    public static final osc1 N0;
    public static final osc1 O0;
    public static final osc1 P0;
    public static final osc1 Q0;
    public static final osc1 R0;
    public static final osc1 S0;
    public static final osc1 T0;
    public static final osc1 U0;
    public static final osc1 V0;
    public static final osc1 W0;
    public static final osc1 X;
    public static final osc1 X0;
    public static final osc1 Y;
    public static final osc1 Y0;
    public static final osc1 Z;
    public static final osc1 Z0;
    public static final osc1 a1;
    public static final osc1 b;
    public static final osc1 b1;
    public static final osc1 c;
    public static final osc1 c1;
    public static final osc1 d;
    public static final osc1 d1;
    public static final osc1 e;
    public static final osc1 e1;
    public static final osc1 f;
    public static final osc1 g;
    public static final osc1 h;
    public static final osc1 i;
    public static final osc1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new osc1(i2, (byte) 0);
        c = new osc1(i2, (byte) 1);
        d = new osc1(i2, (byte) 2);
        e = new osc1(i2, (byte) 3);
        f = new osc1(i2, (byte) 4);
        g = new osc1(i2, (byte) 5);
        h = new osc1(i2, (byte) 6);
        i = new osc1(i2, (byte) 7);
        t = new osc1(i2, (byte) 8);
        X = new osc1(i2, (byte) 9);
        Y = new osc1(i2, (byte) 10);
        Z = new osc1(i2, (byte) 11);
        N0 = new osc1(i2, (byte) 12);
        O0 = new osc1(i2, (byte) 13);
        P0 = new osc1(i2, (byte) 14);
        Q0 = new osc1(i2, (byte) 15);
        R0 = new osc1(i2, (byte) 16);
        S0 = new osc1(i2, (byte) 17);
        T0 = new osc1(i2, (byte) 18);
        U0 = new osc1(i2, (byte) 19);
        V0 = new osc1(i2, (byte) 20);
        W0 = new osc1(i2, (byte) 21);
        X0 = new osc1(i2, (byte) 22);
        Y0 = new osc1(i2, (byte) 23);
        Z0 = new osc1(i2, (byte) 24);
        a1 = new osc1(i2, (byte) 25);
        b1 = new osc1(i2, (byte) 26);
        c1 = new osc1(i2, (byte) 27);
        d1 = new osc1(i2, (byte) 28);
        e1 = new osc1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ osc1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        mq70 mq70Var;
        pp70 pp70Var;
        long jA;
        long jB;
        u7h u7hVar = null;
        switch (this.a) {
            case 0:
                xkk1 xkk1Var = (xkk1) obj;
                jo70 jo70Var = (jo70) obj2;
                if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (pp70Var = mq70Var.b) != null) {
                    u7hVar = new u7h(pp70Var.a.a.c);
                }
                return new ksc1(u7hVar, jo70Var.a);
            case 1:
                ixx ixxVar = ((afx) obj).a.b;
                int iOrdinal = ((vux) obj2).ordinal();
                if (iOrdinal == 0) {
                    jA = ixxVar.a();
                } else if (iOrdinal == 1) {
                    jA = ixxVar.b();
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    jA = ixxVar.c();
                }
                return new u7h(jA);
            case 2:
                ((Number) obj).intValue();
                return ((bxc1) obj2).a;
            case 3:
                return new rxc1((qxc1) obj, ((Boolean) obj2).booleanValue());
            case 4:
                yxx yxxVar = ((afx) obj).b;
                long j = yxxVar.a;
                int iOrdinal2 = ((vux) obj2).ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        j = yxxVar.b;
                    } else if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                }
                return new u7h(j);
            case 5:
                afx afxVar = (afx) obj;
                int iOrdinal3 = ((vux) obj2).ordinal();
                if (iOrdinal3 == 0 || iOrdinal3 == 1) {
                    jB = u7h.b(u7h.f, 0.1f, 0.0f, 0.0f, 0.0f, 14);
                } else {
                    if (iOrdinal3 != 2) {
                        eg.o();
                        return null;
                    }
                    jB = afxVar.a.d;
                }
                return new u7h(jB);
            case 6:
                zcd1 zcd1Var = (zcd1) obj2;
                return new ycd1((xcd1) obj, zcd1Var.a, zcd1Var.b, zcd1Var.c);
            case 7:
                return null;
            case 8:
                return null;
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                return null;
            case 12:
                return null;
            case 13:
                return null;
            case 14:
                return null;
            case 15:
                return null;
            case 16:
                return null;
            case 17:
                return null;
            case 18:
                return null;
            case 19:
                return null;
            case 20:
                return null;
            case 21:
                return null;
            case 22:
                return null;
            case 23:
                return null;
            case 24:
                return null;
            case 25:
                return null;
            case 26:
                return null;
            case 27:
                return null;
            case 28:
                return null;
            default:
                return null;
        }
    }
}
