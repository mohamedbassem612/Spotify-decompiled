package p;

import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bba1 extends hab0 implements iu30 {
    public static final bba1 N0;
    public static final bba1 O0;
    public static final bba1 P0;
    public static final bba1 Q0;
    public static final bba1 R0;
    public static final bba1 S0;
    public static final bba1 T0;
    public static final bba1 U0;
    public static final bba1 V0;
    public static final bba1 W0;
    public static final bba1 X;
    public static final bba1 X0;
    public static final bba1 Y;
    public static final bba1 Y0;
    public static final bba1 Z;
    public static final bba1 Z0;
    public static final bba1 a1;
    public static final bba1 b;
    public static final bba1 b1;
    public static final bba1 c;
    public static final bba1 c1;
    public static final bba1 d;
    public static final bba1 d1;
    public static final bba1 e;
    public static final bba1 e1;
    public static final bba1 f;
    public static final bba1 g;
    public static final bba1 h;
    public static final bba1 i;
    public static final bba1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new bba1(i2, (byte) 0);
        c = new bba1(i2, (byte) 1);
        d = new bba1(i2, (byte) 2);
        e = new bba1(i2, (byte) 3);
        f = new bba1(i2, (byte) 4);
        g = new bba1(i2, (byte) 5);
        h = new bba1(i2, (byte) 6);
        i = new bba1(i2, (byte) 7);
        t = new bba1(i2, (byte) 8);
        X = new bba1(i2, (byte) 9);
        Y = new bba1(i2, (byte) 10);
        Z = new bba1(i2, (byte) 11);
        N0 = new bba1(i2, (byte) 12);
        O0 = new bba1(i2, (byte) 13);
        P0 = new bba1(i2, (byte) 14);
        Q0 = new bba1(i2, (byte) 15);
        R0 = new bba1(i2, (byte) 16);
        S0 = new bba1(i2, (byte) 17);
        T0 = new bba1(i2, (byte) 18);
        U0 = new bba1(i2, (byte) 19);
        V0 = new bba1(i2, (byte) 20);
        W0 = new bba1(i2, (byte) 21);
        X0 = new bba1(i2, (byte) 22);
        Y0 = new bba1(i2, (byte) 23);
        Z0 = new bba1(i2, (byte) 24);
        a1 = new bba1(i2, (byte) 25);
        b1 = new bba1(i2, (byte) 26);
        c1 = new bba1(i2, (byte) 27);
        d1 = new bba1(i2, (byte) 28);
        e1 = new bba1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bba1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return ((xaa1) obj).a;
            case 1:
                return ((zaa1) obj).b;
            case 2:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 4:
                return Boolean.valueOf(obj instanceof jo70);
            case 5:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 6:
                return Boolean.valueOf(obj instanceof qaa1);
            case 7:
                if (obj != null) {
                    return (qaa1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.songdnaeligibility.SongDnaEligibility");
                return null;
            case 8:
                e261 e261Var = (e261) obj;
                b261.F(e261Var, true);
                b261.G(e261Var, 100000.0f);
                return rih1Var;
            case 9:
                b261.f((e261) obj);
                return rih1Var;
            case 10:
                return rih1Var;
            case 11:
                return new xaa1(((eca1) obj).b);
            case 12:
                return new dea1(((fca1) obj).b);
            case 13:
                b261.c((e261) obj);
                return rih1Var;
            case 14:
                return Boolean.valueOf(((sda1) obj).a);
            case 15:
                return ((dea1) obj).a;
            case 16:
                return (qaa1) obj;
            case 17:
                return ((dea1) obj).a;
            case 18:
                return ((dea1) obj).a;
            case 19:
                return ((dea1) obj).a;
            case 20:
                return ((fea1) obj).b;
            case 21:
                return (String) obj;
            case 22:
                return (qtt0) obj;
            case 23:
                return Boolean.valueOf((obj instanceof hll) || (obj instanceof rih1));
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 25:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return Boolean.valueOf((obj instanceof qtt0) || (obj instanceof rih1));
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qtt0) obj;
            default:
                return Boolean.valueOf(obj instanceof jo70);
        }
    }
}
