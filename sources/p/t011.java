package p;

import android.os.Bundle;
import com.spotify.scrollsita.v1.Section;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t011 extends hab0 implements iu30 {
    public static final t011 N0;
    public static final t011 O0;
    public static final t011 P0;
    public static final t011 Q0;
    public static final t011 R0;
    public static final t011 S0;
    public static final t011 T0;
    public static final t011 U0;
    public static final t011 V0;
    public static final t011 W0;
    public static final t011 X;
    public static final t011 X0;
    public static final t011 Y;
    public static final t011 Y0;
    public static final t011 Z;
    public static final t011 Z0;
    public static final t011 a1;
    public static final t011 b;
    public static final t011 b1;
    public static final t011 c;
    public static final t011 c1;
    public static final t011 d;
    public static final t011 d1;
    public static final t011 e;
    public static final t011 e1;
    public static final t011 f;
    public static final t011 g;
    public static final t011 h;
    public static final t011 i;
    public static final t011 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new t011(i2, (byte) 0);
        c = new t011(i2, (byte) 1);
        d = new t011(i2, (byte) 2);
        e = new t011(i2, (byte) 3);
        f = new t011(i2, (byte) 4);
        g = new t011(i2, (byte) 5);
        h = new t011(i2, (byte) 6);
        i = new t011(i2, (byte) 7);
        t = new t011(i2, (byte) 8);
        X = new t011(i2, (byte) 9);
        Y = new t011(i2, (byte) 10);
        Z = new t011(i2, (byte) 11);
        N0 = new t011(i2, (byte) 12);
        O0 = new t011(i2, (byte) 13);
        P0 = new t011(i2, (byte) 14);
        Q0 = new t011(i2, (byte) 15);
        R0 = new t011(i2, (byte) 16);
        S0 = new t011(i2, (byte) 17);
        T0 = new t011(i2, (byte) 18);
        U0 = new t011(i2, (byte) 19);
        V0 = new t011(i2, (byte) 20);
        W0 = new t011(i2, (byte) 21);
        X0 = new t011(i2, (byte) 22);
        Y0 = new t011(i2, (byte) 23);
        Z0 = new t011(i2, (byte) 24);
        a1 = new t011(i2, (byte) 25);
        b1 = new t011(i2, (byte) 26);
        c1 = new t011(i2, (byte) 27);
        d1 = new t011(i2, (byte) 28);
        e1 = new t011(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t011(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Integer.valueOf(((pg50) obj).e);
            case 1:
                return Integer.valueOf(((pg50) obj).a);
            case 2:
                return Integer.valueOf(((pg50) obj).c);
            case 3:
                return Float.valueOf(((pg50) obj).b);
            case 4:
                return Boolean.valueOf(((pg50) obj).d);
            case 5:
                return rih1Var;
            case 6:
                return "information-banner-row";
            case 7:
                return ((xv31) obj).e.b;
            case 8:
                ((Number) obj).intValue();
                return null;
            case 9:
                return wxd.a;
            case 10:
                n5j1 n5j1Var = (n5j1) obj;
                ube ubeVar = n5j1Var.c;
                ihl ihlVar = n5j1Var.b;
                yf.p(ubeVar, ihlVar.e, 0.0f, 6);
                yf.p(n5j1Var.d, ihlVar.g, 0.0f, 6);
                return rih1Var;
            case 11:
                dhl dhlVar = (dhl) obj;
                yf.p(dhlVar.e, dhlVar.c.e, 0.0f, 6);
                return rih1Var;
            case 12:
                dhl dhlVar2 = (dhl) obj;
                ube ubeVar2 = dhlVar2.e;
                ihl ihlVar2 = dhlVar2.c;
                yf.p(ubeVar2, ihlVar2.e, 0.0f, 6);
                yf.p(dhlVar2.g, ihlVar2.g, 0.0f, 6);
                xid.r(dhlVar2.d, ihlVar2.d, 0.0f, 6);
                dhlVar2.g(new e5u((p3v) null, "40.0%"));
                return rih1Var;
            case 13:
                b261.c((e261) obj);
                return rih1Var;
            case 14:
                return mno1.h(new mmr0[]{new mmr0("state", (g211) obj)});
            case 15:
                g211 g211Var = (g211) jhc1.t((Bundle) obj, "state", g211.class);
                return g211Var == null ? new g211() : g211Var;
            case 16:
                b261.c((e261) obj);
                return rih1Var;
            case 17:
                b261.F((e261) obj, true);
                return rih1Var;
            case 18:
                uv11 uv11Var = (uv11) obj;
                return new n0q0(xzo1.r(uv11Var.b, uv11Var.a));
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zoy0) obj;
            case 20:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 21:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 22:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 23:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 24:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 25:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 26:
                return Boolean.valueOf((obj instanceof List) || (obj instanceof rih1));
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case 28:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            default:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
        }
    }
}
