package p;

import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h5g1 extends hab0 implements iu30 {
    public static final h5g1 N0;
    public static final h5g1 O0;
    public static final h5g1 P0;
    public static final h5g1 Q0;
    public static final h5g1 R0;
    public static final h5g1 S0;
    public static final h5g1 T0;
    public static final h5g1 U0;
    public static final h5g1 V0;
    public static final h5g1 W0;
    public static final h5g1 X;
    public static final h5g1 X0;
    public static final h5g1 Y;
    public static final h5g1 Y0;
    public static final h5g1 Z;
    public static final h5g1 Z0;
    public static final h5g1 a1;
    public static final h5g1 b;
    public static final h5g1 b1;
    public static final h5g1 c;
    public static final h5g1 c1;
    public static final h5g1 d;
    public static final h5g1 d1;
    public static final h5g1 e;
    public static final h5g1 e1;
    public static final h5g1 f;
    public static final h5g1 g;
    public static final h5g1 h;
    public static final h5g1 i;
    public static final h5g1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new h5g1(i2, (byte) 0);
        c = new h5g1(i2, (byte) 1);
        d = new h5g1(i2, (byte) 2);
        e = new h5g1(i2, (byte) 3);
        f = new h5g1(i2, (byte) 4);
        g = new h5g1(i2, (byte) 5);
        h = new h5g1(i2, (byte) 6);
        i = new h5g1(i2, (byte) 7);
        t = new h5g1(i2, (byte) 8);
        X = new h5g1(i2, (byte) 9);
        Y = new h5g1(i2, (byte) 10);
        Z = new h5g1(i2, (byte) 11);
        N0 = new h5g1(i2, (byte) 12);
        O0 = new h5g1(i2, (byte) 13);
        P0 = new h5g1(i2, (byte) 14);
        Q0 = new h5g1(i2, (byte) 15);
        R0 = new h5g1(i2, (byte) 16);
        S0 = new h5g1(i2, (byte) 17);
        T0 = new h5g1(i2, (byte) 18);
        U0 = new h5g1(i2, (byte) 19);
        V0 = new h5g1(i2, (byte) 20);
        W0 = new h5g1(i2, (byte) 21);
        X0 = new h5g1(i2, (byte) 22);
        Y0 = new h5g1(i2, (byte) 23);
        Z0 = new h5g1(i2, (byte) 24);
        a1 = new h5g1(i2, (byte) 25);
        b1 = new h5g1(i2, (byte) 26);
        c1 = new h5g1(i2, (byte) 27);
        d1 = new h5g1(i2, (byte) 28);
        e1 = new h5g1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h5g1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) throws Throwable {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (iix0) obj;
            case 1:
                return Boolean.valueOf(obj instanceof uio);
            case 2:
                if (obj != null) {
                    return (uio) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.curationexperiencetrait.CurationExperienceTrait");
                return null;
            case 3:
                return (uio) obj;
            case 4:
                return (String) obj;
            case 5:
                return (String) obj;
            case 6:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 8:
                return Boolean.valueOf(obj instanceof xkk1);
            case 9:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 10:
                throw ((Throwable) obj);
            case 11:
                return ((arn0) obj).b;
            case 12:
                return ((arn0) obj).b;
            case 13:
                return Long.valueOf(((Number) obj).longValue());
            case 14:
                return Long.valueOf(((Number) obj).longValue());
            case 15:
                return new xag1("", false, false);
            case 16:
                return rih1Var;
            case 17:
                return rih1Var;
            case 18:
                sv31 sv31Var = (sv31) obj;
                return new uce1(sv31Var.b, sv31Var.c, sv31Var.d, sv31Var.e);
            case 19:
                return Integer.valueOf(obj != null ? obj.hashCode() : 0);
            case 20:
                ((Number) obj).intValue();
                return null;
            case 21:
                return Integer.valueOf(obj != null ? obj.hashCode() : 0);
            case 22:
                ((Number) obj).intValue();
                return null;
            case 23:
                return Integer.valueOf(obj != null ? obj.hashCode() : 0);
            case 24:
                ((Number) obj).intValue();
                return null;
            case 25:
                return Integer.valueOf(obj != null ? obj.hashCode() : 0);
            case 26:
                return Integer.valueOf(obj != null ? obj.hashCode() : 0);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((Number) obj).intValue();
                return null;
            case 28:
                return Integer.valueOf(obj != null ? obj.hashCode() : 0);
            default:
                ((Number) obj).intValue();
                return null;
        }
    }
}
