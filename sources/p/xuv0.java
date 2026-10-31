package p;

import j$.time.LocalDate;
import j$.time.ZoneOffset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xuv0 extends hab0 implements iu30 {
    public static final xuv0 N0;
    public static final xuv0 O0;
    public static final xuv0 P0;
    public static final xuv0 Q0;
    public static final xuv0 R0;
    public static final xuv0 S0;
    public static final xuv0 T0;
    public static final xuv0 U0;
    public static final xuv0 V0;
    public static final xuv0 W0;
    public static final xuv0 X;
    public static final xuv0 X0;
    public static final xuv0 Y;
    public static final xuv0 Y0;
    public static final xuv0 Z;
    public static final xuv0 Z0;
    public static final xuv0 a1;
    public static final xuv0 b;
    public static final xuv0 b1;
    public static final xuv0 c;
    public static final xuv0 c1;
    public static final xuv0 d;
    public static final xuv0 d1;
    public static final xuv0 e;
    public static final xuv0 e1;
    public static final xuv0 f;
    public static final xuv0 g;
    public static final xuv0 h;
    public static final xuv0 i;
    public static final xuv0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new xuv0(i2, (byte) 0);
        c = new xuv0(i2, (byte) 1);
        d = new xuv0(i2, (byte) 2);
        e = new xuv0(i2, (byte) 3);
        f = new xuv0(i2, (byte) 4);
        g = new xuv0(i2, (byte) 5);
        h = new xuv0(i2, (byte) 6);
        i = new xuv0(i2, (byte) 7);
        t = new xuv0(i2, (byte) 8);
        X = new xuv0(i2, (byte) 9);
        Y = new xuv0(i2, (byte) 10);
        Z = new xuv0(i2, (byte) 11);
        N0 = new xuv0(i2, (byte) 12);
        O0 = new xuv0(i2, (byte) 13);
        P0 = new xuv0(i2, (byte) 14);
        Q0 = new xuv0(i2, (byte) 15);
        R0 = new xuv0(i2, (byte) 16);
        S0 = new xuv0(i2, (byte) 17);
        T0 = new xuv0(i2, (byte) 18);
        U0 = new xuv0(i2, (byte) 19);
        V0 = new xuv0(i2, (byte) 20);
        W0 = new xuv0(i2, (byte) 21);
        X0 = new xuv0(i2, (byte) 22);
        Y0 = new xuv0(i2, (byte) 23);
        Z0 = new xuv0(i2, (byte) 24);
        a1 = new xuv0(i2, (byte) 25);
        b1 = new xuv0(i2, (byte) 26);
        c1 = new xuv0(i2, (byte) 27);
        d1 = new xuv0(i2, (byte) 28);
        e1 = new xuv0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xuv0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Integer.valueOf(((jvv0) obj).b);
            case 1:
                ivv0 ivv0Var = (ivv0) obj;
                return new mtv0(ivv0Var.a, ivv0Var.b);
            case 2:
                ((Number) obj).intValue();
                return null;
            case 3:
                ((Number) obj).intValue();
                return null;
            case 4:
                ((Number) obj).intValue();
                return null;
            case 5:
                ((Number) obj).intValue();
                return null;
            case 6:
                ((Number) obj).intValue();
                return null;
            case 7:
                ((Number) obj).intValue();
                return null;
            case 8:
                ((Number) obj).intValue();
                return null;
            case 9:
                ((Number) obj).intValue();
                return null;
            case 10:
                ((Number) obj).intValue();
                return null;
            case 11:
                jwv0 jwv0Var = ((lwv0) obj).a;
                return new kwv0(jwv0Var.b, jwv0Var.c);
            case 12:
                return rih1Var;
            case 13:
                return rih1Var;
            case 14:
                return fzv0.a;
            case 15:
                return new mzv0("", null, LocalDate.now(ZoneOffset.UTC), 0, "", null);
            case 16:
                return ((oyv0) obj).a;
            case 17:
                return ((oyv0) obj).a;
            case 18:
                return ((oyv0) obj).a;
            case 19:
                return Boolean.valueOf(obj instanceof jo70);
            case 20:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 21:
                return Boolean.valueOf(obj instanceof xkk1);
            case 22:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 23:
                return Boolean.valueOf(obj instanceof zoy0);
            case 24:
                if (obj != null) {
                    return (zoy0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.publishingmetadatatrait.PublishingMetadataTrait");
                return null;
            case 25:
                return rih1Var;
            case 26:
                return ((qei0) obj).b();
            case 27:
                return ((e311) obj).e;
            case 28:
                return "spotify:internal:bluejay:confirm";
            default:
                b261.c((e261) obj);
                return rih1Var;
        }
    }
}
