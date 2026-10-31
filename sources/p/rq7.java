package p;

import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rq7 extends hab0 implements iu30 {
    public static final rq7 N0;
    public static final rq7 O0;
    public static final rq7 P0;
    public static final rq7 Q0;
    public static final rq7 R0;
    public static final rq7 S0;
    public static final rq7 T0;
    public static final rq7 U0;
    public static final rq7 V0;
    public static final rq7 W0;
    public static final rq7 X;
    public static final rq7 X0;
    public static final rq7 Y;
    public static final rq7 Y0;
    public static final rq7 Z;
    public static final rq7 Z0;
    public static final rq7 a1;
    public static final rq7 b;
    public static final rq7 b1;
    public static final rq7 c;
    public static final rq7 c1;
    public static final rq7 d;
    public static final rq7 d1;
    public static final rq7 e;
    public static final rq7 e1;
    public static final rq7 f;
    public static final rq7 g;
    public static final rq7 h;
    public static final rq7 i;
    public static final rq7 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new rq7(i2, (byte) 0);
        c = new rq7(i2, (byte) 1);
        d = new rq7(i2, (byte) 2);
        e = new rq7(i2, (byte) 3);
        f = new rq7(i2, (byte) 4);
        g = new rq7(i2, (byte) 5);
        h = new rq7(i2, (byte) 6);
        i = new rq7(i2, (byte) 7);
        t = new rq7(i2, (byte) 8);
        X = new rq7(i2, (byte) 9);
        Y = new rq7(i2, (byte) 10);
        Z = new rq7(i2, (byte) 11);
        N0 = new rq7(i2, (byte) 12);
        O0 = new rq7(i2, (byte) 13);
        P0 = new rq7(i2, (byte) 14);
        Q0 = new rq7(i2, (byte) 15);
        R0 = new rq7(i2, (byte) 16);
        S0 = new rq7(i2, (byte) 17);
        T0 = new rq7(i2, (byte) 18);
        U0 = new rq7(i2, (byte) 19);
        V0 = new rq7(i2, (byte) 20);
        W0 = new rq7(i2, (byte) 21);
        X0 = new rq7(i2, (byte) 22);
        Y0 = new rq7(i2, (byte) 23);
        Z0 = new rq7(i2, (byte) 24);
        a1 = new rq7(i2, (byte) 25);
        b1 = new rq7(i2, (byte) 26);
        c1 = new rq7(i2, (byte) 27);
        d1 = new rq7(i2, (byte) 28);
        e1 = new rq7(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rq7(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 1:
                or7 or7Var = (or7) obj;
                return new pr7(or7Var.a, or7Var.b, or7Var.c, or7Var.d, or7Var.e, or7Var.f, or7Var.g, (nr7) null, 384);
            case 2:
                u771 u771Var = ((g271) obj).a;
                c871 c871Var = u771Var.b.b;
                if (c871Var instanceof qr7) {
                    qr7 qr7Var = (qr7) c871Var;
                    return new or7(qr7Var.e, qr7Var.f, qr7Var.a, qr7Var.b, qr7Var.c, qr7Var.d, u771Var);
                }
                eg.m("Check failed.");
                return null;
            case 3:
                return ((sr7) obj).a;
            case 4:
                return ((sr7) obj).a;
            case 5:
                return ((sr7) obj).a;
            case 6:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 8:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 10:
                return Boolean.valueOf(obj instanceof jo70);
            case 11:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 12:
                kt7 kt7Var = (kt7) obj;
                u771 u771Var2 = kt7Var.a;
                int i2 = kt7Var.b;
                mt7 mt7Var = kt7Var.c;
                return new lt7(u771Var2, i2, mt7Var.a, mt7Var.b, mt7Var.c, mt7Var.d, mt7Var.e, mt7Var.f, mt7Var.g, mt7Var.h, mt7Var.i, mt7Var.t, mt7Var.X, null);
            case 13:
                g271 g271Var = (g271) obj;
                u771 u771Var3 = g271Var.a;
                c871 c871Var2 = u771Var3.b.b;
                if (c871Var2 instanceof mt7) {
                    return new kt7(u771Var3, g271Var.c, (mt7) c871Var2);
                }
                eg.m("Check failed.");
                return null;
            case 14:
                return rih1Var;
            case 15:
                return rih1Var;
            case 16:
                return rih1Var;
            case 17:
                return new pv7(false, "");
            case 18:
                return new bw7();
            case 19:
                return mno1.h(new mmr0[]{new mmr0("AudioLanguagePageElementStateKey", (bw7) obj)});
            case 20:
                ((xas) obj).a(U0, c37.T0);
                return rih1Var;
            case 21:
                return new q08(((p08) obj).a, null, null, null, nfu0.c);
            case 22:
                return ((p08) obj).a;
            case 23:
                return ((p08) obj).a;
            case 24:
                return ((p08) obj).b;
            case 25:
                return ((p08) obj).a;
            case 26:
                return ((p08) obj).a;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return ((p08) obj).b;
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            default:
                if (!(obj instanceof qtt0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
