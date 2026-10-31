package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class la10 extends hab0 implements iu30 {
    public static final la10 N0;
    public static final la10 O0;
    public static final la10 P0;
    public static final la10 Q0;
    public static final la10 R0;
    public static final la10 S0;
    public static final la10 T0;
    public static final la10 U0;
    public static final la10 V0;
    public static final la10 W0;
    public static final la10 X;
    public static final la10 X0;
    public static final la10 Y;
    public static final la10 Y0;
    public static final la10 Z;
    public static final la10 Z0;
    public static final la10 a1;
    public static final la10 b;
    public static final la10 b1;
    public static final la10 c;
    public static final la10 c1;
    public static final la10 d;
    public static final la10 d1;
    public static final la10 e;
    public static final la10 e1;
    public static final la10 f;
    public static final la10 g;
    public static final la10 h;
    public static final la10 i;
    public static final la10 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new la10(i2, (byte) 0);
        c = new la10(i2, (byte) 1);
        d = new la10(i2, (byte) 2);
        e = new la10(i2, (byte) 3);
        f = new la10(i2, (byte) 4);
        g = new la10(i2, (byte) 5);
        h = new la10(i2, (byte) 6);
        i = new la10(i2, (byte) 7);
        t = new la10(i2, (byte) 8);
        X = new la10(i2, (byte) 9);
        Y = new la10(i2, (byte) 10);
        Z = new la10(i2, (byte) 11);
        N0 = new la10(i2, (byte) 12);
        O0 = new la10(i2, (byte) 13);
        P0 = new la10(i2, (byte) 14);
        Q0 = new la10(i2, (byte) 15);
        R0 = new la10(i2, (byte) 16);
        S0 = new la10(i2, (byte) 17);
        T0 = new la10(i2, (byte) 18);
        U0 = new la10(i2, (byte) 19);
        V0 = new la10(i2, (byte) 20);
        W0 = new la10(i2, (byte) 21);
        X0 = new la10(i2, (byte) 22);
        Y0 = new la10(i2, (byte) 23);
        Z0 = new la10(i2, (byte) 24);
        a1 = new la10(i2, (byte) 25);
        b1 = new la10(i2, (byte) 26);
        c1 = new la10(i2, (byte) 27);
        d1 = new la10(i2, (byte) 28);
        e1 = new la10(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ la10(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                if (!(obj instanceof v6v0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (obj instanceof rih1) {
                    return null;
                }
                return (v6v0) obj;
            case 3:
                if (!(obj instanceof zc8) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zc8) obj;
            case 5:
                if (!(obj instanceof z070) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                if (obj instanceof rih1) {
                    return null;
                }
                return (z070) obj;
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 8:
                if (!(obj instanceof zoy0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zoy0) obj;
            case 10:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 12:
                if (!(obj instanceof a7q0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (a7q0) obj;
            case 14:
                if (!(obj instanceof e2k1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                return Boolean.valueOf(obj instanceof jo70);
            case 16:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 17:
                return Boolean.valueOf(obj instanceof jo70);
            case 18:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 19:
                return ((wsi1) obj).a;
            case 20:
                return ((ho70) obj).a;
            case 21:
                return ((ho70) obj).a;
            case 22:
                return rto.a;
            case 23:
                List list = (List) obj;
                return new rmr0(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 24:
                ArrayList arrayListT1 = o7h.t1((List) obj, 2, 2, false, Y0);
                return new xb10(arrayListT1.isEmpty() ? null : new tfp0(arrayListT1).a());
            case 25:
                return rih1Var;
            case 26:
                return rih1Var;
            case 27:
                return o7h.p1(((pc10) obj).a);
            case 28:
                return (String) obj;
            default:
                return (String) obj;
        }
    }
}
