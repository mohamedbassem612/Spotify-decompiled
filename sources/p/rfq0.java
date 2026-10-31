package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rfq0 extends hab0 implements iu30 {
    public static final rfq0 N0;
    public static final rfq0 O0;
    public static final rfq0 P0;
    public static final rfq0 Q0;
    public static final rfq0 R0;
    public static final rfq0 S0;
    public static final rfq0 T0;
    public static final rfq0 U0;
    public static final rfq0 V0;
    public static final rfq0 W0;
    public static final rfq0 X;
    public static final rfq0 X0;
    public static final rfq0 Y;
    public static final rfq0 Y0;
    public static final rfq0 Z;
    public static final rfq0 Z0;
    public static final rfq0 a1;
    public static final rfq0 b;
    public static final rfq0 b1;
    public static final rfq0 c;
    public static final rfq0 c1;
    public static final rfq0 d;
    public static final rfq0 d1;
    public static final rfq0 e;
    public static final rfq0 e1;
    public static final rfq0 f;
    public static final rfq0 g;
    public static final rfq0 h;
    public static final rfq0 i;
    public static final rfq0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new rfq0(i2, (byte) 0);
        c = new rfq0(i2, (byte) 1);
        d = new rfq0(i2, (byte) 2);
        e = new rfq0(i2, (byte) 3);
        f = new rfq0(i2, (byte) 4);
        g = new rfq0(i2, (byte) 5);
        h = new rfq0(i2, (byte) 6);
        i = new rfq0(i2, (byte) 7);
        t = new rfq0(i2, (byte) 8);
        X = new rfq0(i2, (byte) 9);
        Y = new rfq0(i2, (byte) 10);
        Z = new rfq0(i2, (byte) 11);
        N0 = new rfq0(i2, (byte) 12);
        O0 = new rfq0(i2, (byte) 13);
        P0 = new rfq0(i2, (byte) 14);
        Q0 = new rfq0(i2, (byte) 15);
        R0 = new rfq0(i2, (byte) 16);
        S0 = new rfq0(i2, (byte) 17);
        T0 = new rfq0(i2, (byte) 18);
        U0 = new rfq0(i2, (byte) 19);
        V0 = new rfq0(i2, (byte) 20);
        W0 = new rfq0(i2, (byte) 21);
        X0 = new rfq0(i2, (byte) 22);
        Y0 = new rfq0(i2, (byte) 23);
        Z0 = new rfq0(i2, (byte) 24);
        a1 = new rfq0(i2, (byte) 25);
        b1 = new rfq0(i2, (byte) 26);
        c1 = new rfq0(i2, (byte) 27);
        d1 = new rfq0(i2, (byte) 28);
        e1 = new rfq0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rfq0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                e261 e261Var = (e261) obj;
                b261.F(e261Var, true);
                b261.G(e261Var, -100000.0f);
                return rih1Var;
            case 1:
                b261.c((e261) obj);
                return rih1Var;
            case 2:
                qgq0 qgq0Var = (qgq0) obj;
                return new rzw0(qgq0Var.a, qgq0Var.b, qgq0Var.c, qgq0Var.d);
            case 3:
                qzw0 qzw0Var = (qzw0) obj;
                if (qzw0Var instanceof pzw0) {
                    return ogq0.a;
                }
                if (qzw0Var instanceof ozw0) {
                    return ngq0.a;
                }
                eg.o();
                return null;
            case 4:
                return rih1Var;
            case 5:
                return rih1Var;
            case 6:
                return rih1Var;
            case 7:
                return "other-video-disabled";
            case 8:
                l631 l631Var = (l631) obj;
                if (l631Var != null) {
                    return l631Var.a;
                }
                return null;
            case 9:
                return (String) obj;
            case 10:
                return ((jo70) obj).a;
            case 11:
                return Boolean.valueOf((obj instanceof l631) || (obj instanceof rih1));
            case 12:
                if (obj instanceof rih1) {
                    return null;
                }
                return (l631) obj;
            case 13:
                return Boolean.valueOf(obj instanceof jo70);
            case 14:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 15:
                return new isq0(tsq0.a, null, false);
            case 16:
                return new gsq0((iix0) obj);
            case 17:
                return Boolean.valueOf(obj instanceof iix0);
            case 18:
                if (obj != null) {
                    return (iix0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.progressstate.state.ProgressState");
                return null;
            case 19:
                return Observable.just(((zsq0) obj).a);
            case 20:
                return Observable.error(((xsq0) obj).a);
            case 22:
            case 21:
                return rih1Var;
            case 23:
                return rih1Var;
            case 24:
                return rih1Var;
            case 25:
                ((kd31) obj).i(1);
                return rih1Var;
            case 26:
                kwq0 kwq0Var = (kwq0) obj;
                if (kwq0Var != null) {
                    return kwq0Var.a;
                }
                return null;
            case 27:
                return new qvc0((String) obj, (c3d0) null, (Set) null, (mqz0) null, 14);
            case 28:
                return new rxc0((String) obj);
            default:
                return new qvc0((String) obj, (c3d0) null, (Set) null, (mqz0) null, 14);
        }
    }
}
