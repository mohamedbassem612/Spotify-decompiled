package p;

import com.spotify.scrollsita.v1.Section;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gq30 extends hab0 implements iu30 {
    public static final gq30 N0;
    public static final gq30 O0;
    public static final gq30 P0;
    public static final gq30 Q0;
    public static final gq30 R0;
    public static final gq30 S0;
    public static final gq30 T0;
    public static final gq30 U0;
    public static final gq30 V0;
    public static final gq30 W0;
    public static final gq30 X;
    public static final gq30 X0;
    public static final gq30 Y;
    public static final gq30 Y0;
    public static final gq30 Z;
    public static final gq30 Z0;
    public static final gq30 a1;
    public static final gq30 b;
    public static final gq30 b1;
    public static final gq30 c;
    public static final gq30 c1;
    public static final gq30 d;
    public static final gq30 d1;
    public static final gq30 e;
    public static final gq30 e1;
    public static final gq30 f;
    public static final gq30 g;
    public static final gq30 h;
    public static final gq30 i;
    public static final gq30 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new gq30(i2, (byte) 0);
        c = new gq30(i2, (byte) 1);
        d = new gq30(i2, (byte) 2);
        e = new gq30(i2, (byte) 3);
        f = new gq30(i2, (byte) 4);
        g = new gq30(i2, (byte) 5);
        h = new gq30(i2, (byte) 6);
        i = new gq30(i2, (byte) 7);
        t = new gq30(i2, (byte) 8);
        X = new gq30(i2, (byte) 9);
        Y = new gq30(i2, (byte) 10);
        Z = new gq30(i2, (byte) 11);
        N0 = new gq30(i2, (byte) 12);
        O0 = new gq30(i2, (byte) 13);
        P0 = new gq30(i2, (byte) 14);
        Q0 = new gq30(i2, (byte) 15);
        R0 = new gq30(i2, (byte) 16);
        S0 = new gq30(i2, (byte) 17);
        T0 = new gq30(i2, (byte) 18);
        U0 = new gq30(i2, (byte) 19);
        V0 = new gq30(i2, (byte) 20);
        W0 = new gq30(i2, (byte) 21);
        X0 = new gq30(i2, (byte) 22);
        Y0 = new gq30(i2, (byte) 23);
        Z0 = new gq30(i2, (byte) 24);
        a1 = new gq30(i2, (byte) 25);
        b1 = new gq30(i2, (byte) 26);
        c1 = new gq30(i2, (byte) 27);
        d1 = new gq30(i2, (byte) 28);
        e1 = new gq30(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gq30(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 2:
                return Boolean.valueOf(obj instanceof jo70);
            case 3:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 4:
                return Boolean.valueOf(obj instanceof hll);
            case 5:
                if (obj != null) {
                    return (hll) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.consumptionexperiencetrait.ConsumptionExperienceTrait");
                return null;
            case 6:
                u771 u771Var = ((g271) obj).a;
                c871 c871Var = u771Var.b.b;
                if (!(c871Var instanceof sq30)) {
                    eg.m("Check failed.");
                    return null;
                }
                t771 t771Var = u771Var.a;
                sq30 sq30Var = (sq30) c871Var;
                return new nq30(t771Var.a, sq30Var.a, sq30Var.b, sq30Var.c, sq30Var.d, sq30Var.e, sq30Var.f, sq30Var.g, t771Var.b, u771Var.b.c);
            case 7:
                nq30 nq30Var = (nq30) obj;
                return new oq30(nq30Var.a, nq30Var.b, nq30Var.c, nq30Var.d, nq30Var.e, nq30Var.f, nq30Var.g, nq30Var.h, nq30Var.i, nq30Var.j, null);
            case 8:
                return ((xq30) obj).a;
            case 9:
                return ((xq30) obj).a;
            case 10:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 12:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 14:
                b261.c((e261) obj);
                return rih1Var;
            case 15:
                au30 au30Var = (au30) obj;
                return new vt30(au30Var.j(), au30Var.h(), au30Var.a(), au30Var.k(), au30Var.g(), au30Var.b());
            case 16:
                return pt30.a;
            case 17:
                return Boolean.valueOf(!(((au30) obj) instanceof wt30));
            case 18:
                vt30 vt30Var = (vt30) obj;
                bu30.f.getClass();
                return new zt30(vt30Var.a, vt30Var.b, vt30Var.c, vt30Var.d, (wkt) null, vt30Var.e, vt30Var.f);
            case 19:
                return new tt30((wkt) obj);
            case 20:
                return new ot30(((Boolean) obj).booleanValue());
            case 21:
                g271 g271Var = (g271) obj;
                u771 u771Var2 = g271Var.a;
                cu30 cu30Var = (cu30) u771Var2.b.b;
                int i2 = g271Var.c;
                t771 t771Var2 = u771Var2.a;
                return new vt30(i2, t771Var2.b, u771Var2.b.c, t771Var2.a, cu30Var.a, cu30Var.b);
            case 22:
                dhl dhlVar = (dhl) obj;
                ube ubeVar = dhlVar.e;
                ihl ihlVar = dhlVar.c;
                yf.p(ubeVar, ihlVar.e, 0.0f, 6);
                xid.r(dhlVar.d, ihlVar.d, 0.0f, 6);
                return rih1Var;
            case 23:
                dhl dhlVar2 = (dhl) obj;
                ube ubeVar2 = dhlVar2.e;
                ihl ihlVar2 = dhlVar2.c;
                yf.p(ubeVar2, ihlVar2.e, 12.0f, 4);
                xid.r(dhlVar2.f, ihlVar2.f, 12.0f, 4);
                dhlVar2.f(new e5u((p3v) null, "wrap"));
                return rih1Var;
            case 24:
                Map.Entry entry = (Map.Entry) obj;
                return xcg1.i((String) entry.getKey(), "=", (String) entry.getValue());
            case 25:
                return Integer.valueOf(((Number) obj).intValue() / 4);
            case 26:
                return Integer.valueOf(((Number) obj).intValue());
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return Long.valueOf(((Number) obj).longValue());
            case 28:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            default:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
        }
    }
}
