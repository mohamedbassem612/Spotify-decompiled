package p;

import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t5b0 extends hab0 implements iu30 {
    public static final t5b0 N0;
    public static final t5b0 O0;
    public static final t5b0 P0;
    public static final t5b0 Q0;
    public static final t5b0 R0;
    public static final t5b0 S0;
    public static final t5b0 T0;
    public static final t5b0 U0;
    public static final t5b0 V0;
    public static final t5b0 W0;
    public static final t5b0 X;
    public static final t5b0 X0;
    public static final t5b0 Y;
    public static final t5b0 Y0;
    public static final t5b0 Z;
    public static final t5b0 Z0;
    public static final t5b0 a1;
    public static final t5b0 b;
    public static final t5b0 b1;
    public static final t5b0 c;
    public static final t5b0 c1;
    public static final t5b0 d;
    public static final t5b0 d1;
    public static final t5b0 e;
    public static final t5b0 e1;
    public static final t5b0 f;
    public static final t5b0 g;
    public static final t5b0 h;
    public static final t5b0 i;
    public static final t5b0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new t5b0(i2, (byte) 0);
        c = new t5b0(i2, (byte) 1);
        d = new t5b0(i2, (byte) 2);
        e = new t5b0(i2, (byte) 3);
        f = new t5b0(i2, (byte) 4);
        g = new t5b0(i2, (byte) 5);
        h = new t5b0(i2, (byte) 6);
        i = new t5b0(i2, (byte) 7);
        t = new t5b0(i2, (byte) 8);
        X = new t5b0(i2, (byte) 9);
        Y = new t5b0(i2, (byte) 10);
        Z = new t5b0(i2, (byte) 11);
        N0 = new t5b0(i2, (byte) 12);
        O0 = new t5b0(i2, (byte) 13);
        P0 = new t5b0(i2, (byte) 14);
        Q0 = new t5b0(i2, (byte) 15);
        R0 = new t5b0(i2, (byte) 16);
        S0 = new t5b0(i2, (byte) 17);
        T0 = new t5b0(i2, (byte) 18);
        U0 = new t5b0(i2, (byte) 19);
        V0 = new t5b0(i2, (byte) 20);
        W0 = new t5b0(i2, (byte) 21);
        X0 = new t5b0(i2, (byte) 22);
        Y0 = new t5b0(i2, (byte) 23);
        Z0 = new t5b0(i2, (byte) 24);
        a1 = new t5b0(i2, (byte) 25);
        b1 = new t5b0(i2, (byte) 26);
        c1 = new t5b0(i2, (byte) 27);
        d1 = new t5b0(i2, (byte) 28);
        e1 = new t5b0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5b0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        w7x w7xVar = w7x.a;
        switch (b2) {
            case 0:
                return Boolean.valueOf((obj instanceof l1z) || (obj instanceof rih1));
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (l1z) obj;
            case 2:
                return (String) obj;
            case 3:
                return rih1Var;
            case 4:
                return (String) obj;
            case 5:
                return rih1Var;
            case 6:
                return (String) obj;
            case 7:
                return rih1Var;
            case 8:
                return Boolean.valueOf(obj instanceof jo70);
            case 9:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 10:
                return Boolean.valueOf(obj instanceof xkk1);
            case 11:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 12:
                return Boolean.valueOf(obj instanceof hll);
            case 13:
                if (obj != null) {
                    return (hll) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.consumptionexperiencetrait.ConsumptionExperienceTrait");
                return null;
            case 14:
                tfa0 tfa0Var = (tfa0) obj;
                tfa0Var.c = true;
                tfa0Var.b = false;
                tfa0Var.a = true;
                return rih1Var;
            case 15:
                iwi0 iwi0Var = (iwi0) obj;
                return new mwi0(iwi0Var.c, iwi0Var.d, iwi0Var.e, iwi0Var.f, iwi0Var.a, iwi0Var.g, iwi0Var.b, iwi0Var.h);
            case 16:
                return w7xVar;
            case 17:
                v211 v211Var = (v211) obj;
                return new c311(v211Var.a, v211Var.b);
            case 18:
                return w7xVar;
            case 19:
                return Boolean.valueOf(((nkg) obj).f == 2);
            case 20:
                l39 l39Var = (l39) obj;
                return new nkg(l39Var.d, mqo1.A(l39Var.f), l39Var.c, l39Var.b, l39Var.e, l39Var.g, l39Var.h);
            case 21:
                return w7xVar;
            case 22:
                return ((fnf1) obj).d;
            case 23:
                return ((amu0) obj).d;
            case 24:
                return w7xVar;
            case 25:
                return ((a581) obj).d;
            case 26:
                return w7xVar;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return ((v3z) obj).d;
            case 28:
                return w7xVar;
            default:
                return ((i98) obj).d;
        }
    }
}
