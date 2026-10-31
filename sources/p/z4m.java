package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z4m extends hab0 implements iu30 {
    public static final z4m N0;
    public static final z4m O0;
    public static final z4m P0;
    public static final z4m Q0;
    public static final z4m R0;
    public static final z4m S0;
    public static final z4m T0;
    public static final z4m U0;
    public static final z4m V0;
    public static final z4m W0;
    public static final z4m X;
    public static final z4m X0;
    public static final z4m Y;
    public static final z4m Y0;
    public static final z4m Z;
    public static final z4m Z0;
    public static final z4m a1;
    public static final z4m b;
    public static final z4m b1;
    public static final z4m c;
    public static final z4m c1;
    public static final z4m d;
    public static final z4m d1;
    public static final z4m e;
    public static final z4m e1;
    public static final z4m f;
    public static final z4m g;
    public static final z4m h;
    public static final z4m i;
    public static final z4m t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new z4m(i2, (byte) 0);
        c = new z4m(i2, (byte) 1);
        d = new z4m(i2, (byte) 2);
        e = new z4m(i2, (byte) 3);
        f = new z4m(i2, (byte) 4);
        g = new z4m(i2, (byte) 5);
        h = new z4m(i2, (byte) 6);
        i = new z4m(i2, (byte) 7);
        t = new z4m(i2, (byte) 8);
        X = new z4m(i2, (byte) 9);
        Y = new z4m(i2, (byte) 10);
        Z = new z4m(i2, (byte) 11);
        N0 = new z4m(i2, (byte) 12);
        O0 = new z4m(i2, (byte) 13);
        P0 = new z4m(i2, (byte) 14);
        Q0 = new z4m(i2, (byte) 15);
        R0 = new z4m(i2, (byte) 16);
        S0 = new z4m(i2, (byte) 17);
        T0 = new z4m(i2, (byte) 18);
        U0 = new z4m(i2, (byte) 19);
        V0 = new z4m(i2, (byte) 20);
        W0 = new z4m(i2, (byte) 21);
        X0 = new z4m(i2, (byte) 22);
        Y0 = new z4m(i2, (byte) 23);
        Z0 = new z4m(i2, (byte) 24);
        a1 = new z4m(i2, (byte) 25);
        b1 = new z4m(i2, (byte) 26);
        c1 = new z4m(i2, (byte) 27);
        d1 = new z4m(i2, (byte) 28);
        e1 = new z4m(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z4m(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        d1q0 d1q0Var = d1q0.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                if (rrn1.x(((j1q0) obj).c()) == d1q0Var) {
                    return "obfuscate-restricted-tracks";
                }
                return null;
            case 1:
                if (rrn1.x(((j1q0) obj).c()) == d1q0Var) {
                    return "disable-blocked-content";
                }
                return null;
            case 2:
                String strC = ((j1q0) obj).c();
                if (rrn1.x(strC) == d1q0Var) {
                    return strC;
                }
                return null;
            case 3:
                return Boolean.valueOf(obj instanceof qfd);
            case 4:
                return (k1r) obj;
            case 5:
                return Boolean.valueOf(obj instanceof String);
            case 6:
                return (k1r) obj;
            case 7:
                return Boolean.valueOf(obj instanceof String);
            case 8:
                return (k1r) obj;
            case 9:
                return Boolean.valueOf(obj instanceof vnb1);
            case 10:
                return (k1r) obj;
            case 11:
                kd31 kd31Var = (kd31) obj;
                kd31Var.i(1);
                kd31Var.f(false);
                return rih1Var;
            case 12:
                return rih1Var;
            case 13:
                cas casVar = (a7m0) obj;
                casVar.a = u2m.d;
                casVar.d = aok.a1;
                return rih1Var;
            case 14:
                return new l7m(((two0) obj).a);
            case 15:
                return w7x.a;
            case 16:
                ((kd31) obj).i(1);
                return rih1Var;
            case 17:
                return ((qce1) obj).a;
            case 18:
                return d7b1.a((String) obj) != null ? qjc0.b : qjc0.a;
            case 19:
                return ((qce1) obj).a;
            case 20:
                return (String) obj;
            case 21:
                return (String) obj;
            case 22:
                return new i5i1(((jo70) obj).a);
            case 23:
                return new aw00(((jo70) obj).a);
            case 24:
                return Boolean.valueOf(obj instanceof jo70);
            case 25:
                return Boolean.valueOf(obj instanceof jo70);
            case 26:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 27:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 28:
                return new pbm("", null, null, null, false);
            default:
                return (String) obj;
        }
    }
}
