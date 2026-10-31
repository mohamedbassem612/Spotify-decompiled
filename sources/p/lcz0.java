package p;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lcz0 extends hab0 implements iu30 {
    public static final lcz0 N0;
    public static final lcz0 O0;
    public static final lcz0 P0;
    public static final lcz0 Q0;
    public static final lcz0 R0;
    public static final lcz0 S0;
    public static final lcz0 T0;
    public static final lcz0 U0;
    public static final lcz0 V0;
    public static final lcz0 W0;
    public static final lcz0 X;
    public static final lcz0 X0;
    public static final lcz0 Y;
    public static final lcz0 Y0;
    public static final lcz0 Z;
    public static final lcz0 Z0;
    public static final lcz0 a1;
    public static final lcz0 b;
    public static final lcz0 b1;
    public static final lcz0 c;
    public static final lcz0 c1;
    public static final lcz0 d;
    public static final lcz0 d1;
    public static final lcz0 e;
    public static final lcz0 e1;
    public static final lcz0 f;
    public static final lcz0 g;
    public static final lcz0 h;
    public static final lcz0 i;
    public static final lcz0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new lcz0(i2, (byte) 0);
        c = new lcz0(i2, (byte) 1);
        d = new lcz0(i2, (byte) 2);
        e = new lcz0(i2, (byte) 3);
        f = new lcz0(i2, (byte) 4);
        g = new lcz0(i2, (byte) 5);
        h = new lcz0(i2, (byte) 6);
        i = new lcz0(i2, (byte) 7);
        t = new lcz0(i2, (byte) 8);
        X = new lcz0(i2, (byte) 9);
        Y = new lcz0(i2, (byte) 10);
        Z = new lcz0(i2, (byte) 11);
        N0 = new lcz0(i2, (byte) 12);
        O0 = new lcz0(i2, (byte) 13);
        P0 = new lcz0(i2, (byte) 14);
        Q0 = new lcz0(i2, (byte) 15);
        R0 = new lcz0(i2, (byte) 16);
        S0 = new lcz0(i2, (byte) 17);
        T0 = new lcz0(i2, (byte) 18);
        U0 = new lcz0(i2, (byte) 19);
        V0 = new lcz0(i2, (byte) 20);
        W0 = new lcz0(i2, (byte) 21);
        X0 = new lcz0(i2, (byte) 22);
        Y0 = new lcz0(i2, (byte) 23);
        Z0 = new lcz0(i2, (byte) 24);
        a1 = new lcz0(i2, (byte) 25);
        b1 = new lcz0(i2, (byte) 26);
        c1 = new lcz0(i2, (byte) 27);
        d1 = new lcz0(i2, (byte) 28);
        e1 = new lcz0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lcz0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 2:
                return Boolean.valueOf(obj instanceof jo70);
            case 3:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 4:
                return new gez0((bez0) null);
            case 5:
                return rih1Var;
            case 6:
                return new iez0(((gez0) obj).a);
            case 7:
                agz0 agz0Var = new agz0((Context) obj);
                agz0Var.setVisibility(0);
                agz0Var.setAlpha(1.0f);
                return agz0Var;
            case 8:
                return mno1.h(new mmr0[]{new mmr0("QUIZ_GAMEPLAY_MODEL", (fiz0) obj)});
            case 9:
                tiz0 tiz0Var = (tiz0) obj;
                return new uiz0("", tiz0Var.b, tiz0Var.c, tiz0Var.d);
            case 10:
                return ((tiz0) obj).a;
            case 11:
                jo70 jo70Var = (jo70) obj;
                return new siz0(jo70Var != null ? jo70Var.a : null);
            case 12:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 14:
                return ((fjz0) obj).d;
            case 15:
                return ((fjz0) obj).d;
            case 16:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 18:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 20:
                ((kd31) obj).p(-15.0f);
                return rih1Var;
            case 21:
                return l1d.m("spotify:internal:quiz:recommendations:", Uri.encode(((sjz0) obj).a));
            case 22:
                return ((t211) obj).a;
            case 23:
                return new fkz0(((ekz0) obj).a, "", null);
            case 24:
                ((qtr) obj).b(new pnp0(5, (lnm) null));
                return rih1Var;
            case 25:
                return ((ekz0) obj).a;
            case 26:
                return ((ekz0) obj).a;
            case 27:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            default:
                return Boolean.valueOf(obj instanceof jo70);
        }
    }
}
