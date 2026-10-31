package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cwp0 extends hab0 implements iu30 {
    public static final cwp0 N0;
    public static final cwp0 O0;
    public static final cwp0 P0;
    public static final cwp0 Q0;
    public static final cwp0 R0;
    public static final cwp0 S0;
    public static final cwp0 T0;
    public static final cwp0 U0;
    public static final cwp0 V0;
    public static final cwp0 W0;
    public static final cwp0 X;
    public static final cwp0 X0;
    public static final cwp0 Y;
    public static final cwp0 Y0;
    public static final cwp0 Z;
    public static final cwp0 Z0;
    public static final cwp0 a1;
    public static final cwp0 b;
    public static final cwp0 b1;
    public static final cwp0 c;
    public static final cwp0 c1;
    public static final cwp0 d;
    public static final cwp0 d1;
    public static final cwp0 e;
    public static final cwp0 e1;
    public static final cwp0 f;
    public static final cwp0 g;
    public static final cwp0 h;
    public static final cwp0 i;
    public static final cwp0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new cwp0(i2, (byte) 0);
        c = new cwp0(i2, (byte) 1);
        d = new cwp0(i2, (byte) 2);
        e = new cwp0(i2, (byte) 3);
        f = new cwp0(i2, (byte) 4);
        g = new cwp0(i2, (byte) 5);
        h = new cwp0(i2, (byte) 6);
        i = new cwp0(i2, (byte) 7);
        t = new cwp0(i2, (byte) 8);
        X = new cwp0(i2, (byte) 9);
        Y = new cwp0(i2, (byte) 10);
        Z = new cwp0(i2, (byte) 11);
        N0 = new cwp0(i2, (byte) 12);
        O0 = new cwp0(i2, (byte) 13);
        P0 = new cwp0(i2, (byte) 14);
        Q0 = new cwp0(i2, (byte) 15);
        R0 = new cwp0(i2, (byte) 16);
        S0 = new cwp0(i2, (byte) 17);
        T0 = new cwp0(i2, (byte) 18);
        U0 = new cwp0(i2, (byte) 19);
        V0 = new cwp0(i2, (byte) 20);
        W0 = new cwp0(i2, (byte) 21);
        X0 = new cwp0(i2, (byte) 22);
        Y0 = new cwp0(i2, (byte) 23);
        Z0 = new cwp0(i2, (byte) 24);
        a1 = new cwp0(i2, (byte) 25);
        b1 = new cwp0(i2, (byte) 26);
        c1 = new cwp0(i2, (byte) 27);
        d1 = new cwp0(i2, (byte) 28);
        e1 = new cwp0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cwp0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                xvp0 xvp0Var = (xvp0) obj;
                int i2 = xvp0Var.f;
                return new awp0(xvp0Var.b, xvp0Var.c, xvp0Var.d, xvp0Var.e, xvp0Var.k, oqn1.p(i2), o0c.F(i2, xvp0Var.g, xvp0Var.h) || xvp0Var.j, bwp0.m(xvp0Var), bwp0.l(xvp0Var));
            case 1:
                Logger.b("%s", new Object[]{(String) obj});
                return rih1Var;
            case 2:
                ((zyp0) obj).l = null;
                return rih1Var;
            case 3:
                ((sp21) obj).t = 3;
                return rih1Var;
            case 4:
                return ((j1q0) obj).c();
            case 5:
                return ((j1q0) obj).c();
            case 6:
                return "mixing-tools";
            case 7:
                return "type";
            case 8:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 9:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 11:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 13:
                if (!(obj instanceof qxc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 15:
                if (!(obj instanceof String) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 17:
                if (!(obj instanceof String) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                return new b3q0(false, 0, 0);
            case 19:
                return ((l6q0) obj).a();
            case 20:
                li71 li71Var = (li71) obj;
                qe71 qe71Var = li71Var.g;
                a6q0 a6q0Var = li71Var.b;
                return new l6q0(a6q0Var, li71Var.a, li71Var.c, li71Var.d, li71Var.e, li71Var.f, (qe71Var instanceof qe71) && u890.j(qe71Var.b, a6q0Var.b().a));
            case 21:
                return ((kb61) obj).c0();
            case 22:
                return new c9q0("", null, null);
            case 23:
                return (String) obj;
            case 24:
                return (rnd0) obj;
            case 25:
                return Boolean.valueOf(obj instanceof rnd0);
            case 26:
                if (obj != null) {
                    return (rnd0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.ontour.ontourdataelement.LiveEventData");
                return null;
            case 27:
                return ((rxo0) obj).a;
            case 28:
                return ((qxo0) obj).a;
            default:
                return w7x.a;
        }
    }
}
