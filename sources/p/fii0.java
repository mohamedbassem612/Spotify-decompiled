package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fii0 extends hab0 implements iu30 {
    public static final fii0 N0;
    public static final fii0 O0;
    public static final fii0 P0;
    public static final fii0 Q0;
    public static final fii0 R0;
    public static final fii0 S0;
    public static final fii0 T0;
    public static final fii0 U0;
    public static final fii0 V0;
    public static final fii0 W0;
    public static final fii0 X;
    public static final fii0 X0;
    public static final fii0 Y;
    public static final fii0 Y0;
    public static final fii0 Z;
    public static final fii0 Z0;
    public static final fii0 a1;
    public static final fii0 b;
    public static final fii0 b1;
    public static final fii0 c;
    public static final fii0 c1;
    public static final fii0 d;
    public static final fii0 d1;
    public static final fii0 e;
    public static final fii0 e1;
    public static final fii0 f;
    public static final fii0 g;
    public static final fii0 h;
    public static final fii0 i;
    public static final fii0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new fii0(i2, (byte) 0);
        c = new fii0(i2, (byte) 1);
        d = new fii0(i2, (byte) 2);
        e = new fii0(i2, (byte) 3);
        f = new fii0(i2, (byte) 4);
        g = new fii0(i2, (byte) 5);
        h = new fii0(i2, (byte) 6);
        i = new fii0(i2, (byte) 7);
        t = new fii0(i2, (byte) 8);
        X = new fii0(i2, (byte) 9);
        Y = new fii0(i2, (byte) 10);
        Z = new fii0(i2, (byte) 11);
        N0 = new fii0(i2, (byte) 12);
        O0 = new fii0(i2, (byte) 13);
        P0 = new fii0(i2, (byte) 14);
        Q0 = new fii0(i2, (byte) 15);
        R0 = new fii0(i2, (byte) 16);
        S0 = new fii0(i2, (byte) 17);
        T0 = new fii0(i2, (byte) 18);
        U0 = new fii0(i2, (byte) 19);
        V0 = new fii0(i2, (byte) 20);
        W0 = new fii0(i2, (byte) 21);
        X0 = new fii0(i2, (byte) 22);
        Y0 = new fii0(i2, (byte) 23);
        Z0 = new fii0(i2, (byte) 24);
        a1 = new fii0(i2, (byte) 25);
        b1 = new fii0(i2, (byte) 26);
        c1 = new fii0(i2, (byte) 27);
        d1 = new fii0(i2, (byte) 28);
        e1 = new fii0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fii0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Boolean.valueOf(obj instanceof jo70);
            case 1:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 2:
                return Boolean.valueOf(obj instanceof mtl);
            case 3:
                if (obj != null) {
                    return (mtl) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.contentexperiencetrait.ContentExperienceTrait");
                return null;
            case 4:
                return ((mhi0) obj).b();
            case 5:
                return new xji0(((wji0) obj).a, "", mji0.a);
            case 6:
                return ((wji0) obj).a;
            case 7:
                jo70 jo70Var = (jo70) obj;
                String str = jo70Var != null ? jo70Var.a : null;
                return str == null ? "" : str;
            case 8:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 10:
                return rih1Var;
            case 11:
                return rih1Var;
            case 12:
                return rih1Var;
            case 13:
                return rih1Var;
            case 14:
                return new joi0((ioi0) obj, true);
            case 15:
                return ((hri0) obj).a;
            case 16:
                return ((hri0) obj).a;
            case 17:
                return Boolean.valueOf(obj instanceof tlr0);
            case 18:
                if (obj != null) {
                    return (tlr0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.paidpodcastbanner.PaidPodcastBanner");
                return null;
            case 19:
                return Boolean.valueOf(obj instanceof w281);
            case 20:
                return (k1r) obj;
            case 21:
                iui0 iui0Var = (iui0) obj;
                return new fui0(iui0Var.d, iui0Var.a, 60, iui0Var.b);
            case 22:
                if (jui0.a[((eui0) obj).ordinal()] == 1) {
                    return hui0.a;
                }
                eg.o();
                return null;
            case 23:
                aui0 aui0Var = (aui0) obj;
                return new iui0(aui0Var.a, aui0Var.d, aui0Var.b, aui0Var.c);
            case 24:
                return ((aui0) obj).b;
            case 25:
                ((Number) obj).intValue();
                return null;
            case 26:
                return new oui0(((bfr0) obj).a);
            case 27:
                return ((oxo0) obj).a;
            case 28:
                return Collections.singleton(((bfr0) obj).a);
            default:
                return (String) obj;
        }
    }
}
