package p;

import android.content.Context;
import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ej41 extends hab0 implements iu30 {
    public static final ej41 N0;
    public static final ej41 O0;
    public static final ej41 P0;
    public static final ej41 Q0;
    public static final ej41 R0;
    public static final ej41 S0;
    public static final ej41 T0;
    public static final ej41 U0;
    public static final ej41 V0;
    public static final ej41 W0;
    public static final ej41 X;
    public static final ej41 X0;
    public static final ej41 Y;
    public static final ej41 Y0;
    public static final ej41 Z;
    public static final ej41 Z0;
    public static final ej41 a1;
    public static final ej41 b;
    public static final ej41 b1;
    public static final ej41 c;
    public static final ej41 c1;
    public static final ej41 d;
    public static final ej41 d1;
    public static final ej41 e;
    public static final ej41 e1;
    public static final ej41 f;
    public static final ej41 g;
    public static final ej41 h;
    public static final ej41 i;
    public static final ej41 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ej41(i2, (byte) 0);
        c = new ej41(i2, (byte) 1);
        d = new ej41(i2, (byte) 2);
        e = new ej41(i2, (byte) 3);
        f = new ej41(i2, (byte) 4);
        g = new ej41(i2, (byte) 5);
        h = new ej41(i2, (byte) 6);
        i = new ej41(i2, (byte) 7);
        t = new ej41(i2, (byte) 8);
        X = new ej41(i2, (byte) 9);
        Y = new ej41(i2, (byte) 10);
        Z = new ej41(i2, (byte) 11);
        N0 = new ej41(i2, (byte) 12);
        O0 = new ej41(i2, (byte) 13);
        P0 = new ej41(i2, (byte) 14);
        Q0 = new ej41(i2, (byte) 15);
        R0 = new ej41(i2, (byte) 16);
        S0 = new ej41(i2, (byte) 17);
        T0 = new ej41(i2, (byte) 18);
        U0 = new ej41(i2, (byte) 19);
        V0 = new ej41(i2, (byte) 20);
        W0 = new ej41(i2, (byte) 21);
        X0 = new ej41(i2, (byte) 22);
        Y0 = new ej41(i2, (byte) 23);
        Z0 = new ej41(i2, (byte) 24);
        a1 = new ej41(i2, (byte) 25);
        b1 = new ej41(i2, (byte) 26);
        c1 = new ej41(i2, (byte) 27);
        d1 = new ej41(i2, (byte) 28);
        e1 = new ej41(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ej41(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new ec5((Context) obj);
            case 1:
                return new xl41(((kl41) obj).a, (hm41) null, false);
            case 2:
                if (!(obj instanceof qxc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 4:
                return new rxc0(((kl41) obj).a);
            case 5:
                return Boolean.valueOf(mp10.w((qxc0) obj));
            case 6:
                return Integer.valueOf(((Number) obj).intValue());
            case 7:
                return Integer.valueOf(((Number) obj).intValue());
            case 8:
                return Integer.valueOf(((Number) obj).intValue());
            case 9:
                return new ru41(new pu41(0L, 0L, 0L, 0.0f), null);
            case 10:
                ((Number) obj).longValue();
                return rih1Var;
            case 11:
                return ((jp51) obj).a;
            case 12:
                return (m251) obj;
            case 13:
                b261.m((e261) obj, m9h.T0);
                return rih1Var;
            case 14:
                return rih1Var;
            case 15:
                return rih1Var;
            case 16:
                return new bx21(2131954508);
            case 17:
                return rih1Var;
            case 18:
                return ((jq6) obj).b;
            case 19:
                b261.F((e261) obj, true);
                return rih1Var;
            case 20:
                b261.a((e261) obj);
                return rih1Var;
            case 21:
                ((ez20) obj).c(false);
                return rih1Var;
            case 22:
                return pe51.a;
            case 23:
                return ((oe51) obj).a;
            case 24:
                return (w281) obj;
            case 25:
                if (!(obj instanceof w281) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (w281) obj;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                b261.c((e261) obj);
                return rih1Var;
            case 28:
                return rih1Var;
            default:
                return new s460(2, 1006, ((ffr0) obj).a, (String) null, (String) null, (String) null, false);
        }
    }
}
