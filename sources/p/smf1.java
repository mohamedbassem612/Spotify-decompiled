package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class smf1 extends hab0 implements iu30 {
    public static final smf1 N0;
    public static final smf1 O0;
    public static final smf1 P0;
    public static final smf1 Q0;
    public static final smf1 R0;
    public static final smf1 S0;
    public static final smf1 T0;
    public static final smf1 U0;
    public static final smf1 V0;
    public static final smf1 W0;
    public static final smf1 X;
    public static final smf1 X0;
    public static final smf1 Y;
    public static final smf1 Y0;
    public static final smf1 Z;
    public static final smf1 Z0;
    public static final smf1 a1;
    public static final smf1 b;
    public static final smf1 b1;
    public static final smf1 c;
    public static final smf1 c1;
    public static final smf1 d;
    public static final smf1 d1;
    public static final smf1 e;
    public static final smf1 e1;
    public static final smf1 f;
    public static final smf1 g;
    public static final smf1 h;
    public static final smf1 i;
    public static final smf1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new smf1(i2, (byte) 0);
        c = new smf1(i2, (byte) 1);
        d = new smf1(i2, (byte) 2);
        e = new smf1(i2, (byte) 3);
        f = new smf1(i2, (byte) 4);
        g = new smf1(i2, (byte) 5);
        h = new smf1(i2, (byte) 6);
        i = new smf1(i2, (byte) 7);
        t = new smf1(i2, (byte) 8);
        X = new smf1(i2, (byte) 9);
        Y = new smf1(i2, (byte) 10);
        Z = new smf1(i2, (byte) 11);
        N0 = new smf1(i2, (byte) 12);
        O0 = new smf1(i2, (byte) 13);
        P0 = new smf1(i2, (byte) 14);
        Q0 = new smf1(i2, (byte) 15);
        R0 = new smf1(i2, (byte) 16);
        S0 = new smf1(i2, (byte) 17);
        T0 = new smf1(i2, (byte) 18);
        U0 = new smf1(i2, (byte) 19);
        V0 = new smf1(i2, (byte) 20);
        W0 = new smf1(i2, (byte) 21);
        X0 = new smf1(i2, (byte) 22);
        Y0 = new smf1(i2, (byte) 23);
        Z0 = new smf1(i2, (byte) 24);
        a1 = new smf1(i2, (byte) 25);
        b1 = new smf1(i2, (byte) 26);
        c1 = new smf1(i2, (byte) 27);
        d1 = new smf1(i2, (byte) 28);
        e1 = new smf1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ smf1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (eid) obj;
            case 1:
                return ((zul1) obj).getEntityUri();
            case 2:
                return "";
            case 3:
                return new lof1(112, "", d, false);
            case 4:
                return new mof1("", "", "", false, false, l4m.c, false, eqa1.a, false, (String) null, (String) null, (String) null);
            case 5:
                return ((ho70) obj).a;
            case 6:
                return ((ho70) obj).a;
            case 7:
                return ((ho70) obj).a;
            case 8:
                return ((ho70) obj).a;
            case 9:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 12:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 13:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                if (!(obj instanceof mtl) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 17:
                if (!(obj instanceof mtl) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 20:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 21:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 25:
                oof1 oof1Var = (oof1) obj;
                String str = oof1Var.b;
                return str == null ? oof1Var.a : str;
            case 26:
                return ((nof1) obj).a();
            case 27:
                return ((oof1) obj).b;
            case 28:
                return ((nof1) obj).a();
            default:
                oof1 oof1Var2 = (oof1) obj;
                String str2 = oof1Var2.b;
                return str2 == null ? oof1Var2.a : str2;
        }
    }
}
