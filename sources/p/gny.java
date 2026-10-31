package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gny extends hab0 implements iu30 {
    public static final gny N0;
    public static final gny O0;
    public static final gny P0;
    public static final gny Q0;
    public static final gny R0;
    public static final gny S0;
    public static final gny T0;
    public static final gny U0;
    public static final gny V0;
    public static final gny W0;
    public static final gny X;
    public static final gny X0;
    public static final gny Y;
    public static final gny Y0;
    public static final gny Z;
    public static final gny Z0;
    public static final gny a1;
    public static final gny b;
    public static final gny b1;
    public static final gny c;
    public static final gny c1;
    public static final gny d;
    public static final gny d1;
    public static final gny e;
    public static final gny e1;
    public static final gny f;
    public static final gny g;
    public static final gny h;
    public static final gny i;
    public static final gny t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new gny(i2, (byte) 0);
        c = new gny(i2, (byte) 1);
        d = new gny(i2, (byte) 2);
        e = new gny(i2, (byte) 3);
        f = new gny(i2, (byte) 4);
        g = new gny(i2, (byte) 5);
        h = new gny(i2, (byte) 6);
        i = new gny(i2, (byte) 7);
        t = new gny(i2, (byte) 8);
        X = new gny(i2, (byte) 9);
        Y = new gny(i2, (byte) 10);
        Z = new gny(i2, (byte) 11);
        N0 = new gny(i2, (byte) 12);
        O0 = new gny(i2, (byte) 13);
        P0 = new gny(i2, (byte) 14);
        Q0 = new gny(i2, (byte) 15);
        R0 = new gny(i2, (byte) 16);
        S0 = new gny(i2, (byte) 17);
        T0 = new gny(i2, (byte) 18);
        U0 = new gny(i2, (byte) 19);
        V0 = new gny(i2, (byte) 20);
        W0 = new gny(i2, (byte) 21);
        X0 = new gny(i2, (byte) 22);
        Y0 = new gny(i2, (byte) 23);
        Z0 = new gny(i2, (byte) 24);
        a1 = new gny(i2, (byte) 25);
        b1 = new gny(i2, (byte) 26);
        c1 = new gny(i2, (byte) 27);
        d1 = new gny(i2, (byte) 28);
        e1 = new gny(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gny(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return new m2v0((byte) 1);
            case 1:
                return new cc3(((dzy) obj).a, (byte) 9);
            case 2:
                return new cc3((byte) 6);
            case 3:
                return new cc3((byte) 2);
            case 4:
                return new cc3(((dzy) obj).a, (byte) 3);
            case 5:
                dzy dzyVar = (dzy) obj;
                return new cc3(dzyVar.a, dzyVar.b);
            case 6:
                return new cc3(((dzy) obj).a, (byte) 11);
            case 7:
                return new cc3(((dzy) obj).a, (byte) 12);
            case 8:
                return new cc3((byte) 0);
            case 9:
                return new cc3(((dzy) obj).a, (byte) 8);
            case 10:
                return new cc3((byte) 1);
            case 11:
                return new cc3((byte) 4);
            case 12:
                return new cc3((byte) 5);
            case 13:
                return new cc3((byte) 7);
            case 14:
                return new i46(((fpd) obj).getItems(), (byte) 1);
            case 15:
                j80 j80Var = ((apd) obj).d;
                if (j80Var instanceof j80) {
                    return j80Var;
                }
                return null;
            case 16:
                koy koyVar = (koy) obj;
                o3r o3rVar = zoy.a;
                return new loy(koyVar.a, koyVar.b, "", null, null, false, true, x4m.a, q840.a, ast0.c, null, koyVar.e, koyVar.c);
            case 17:
                return ((koy) obj).a;
            case 18:
                return ((koy) obj).a;
            case 19:
                return ((koy) obj).a;
            case 20:
                return ((koy) obj).a;
            case 21:
                return ((koy) obj).a;
            case 22:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 23:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 24:
                return Boolean.valueOf((obj instanceof hll) || (obj instanceof rih1));
            case 25:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 26:
                return Boolean.valueOf(obj instanceof jo70);
            case 27:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 28:
                return Boolean.valueOf(obj instanceof j6k);
            default:
                if (obj != null) {
                    return (j6k) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.concert.Concert");
                return null;
        }
    }
}
