package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j2g0 extends hab0 implements iu30 {
    public static final j2g0 N0;
    public static final j2g0 O0;
    public static final j2g0 P0;
    public static final j2g0 Q0;
    public static final j2g0 R0;
    public static final j2g0 S0;
    public static final j2g0 T0;
    public static final j2g0 U0;
    public static final j2g0 V0;
    public static final j2g0 W0;
    public static final j2g0 X;
    public static final j2g0 X0;
    public static final j2g0 Y;
    public static final j2g0 Y0;
    public static final j2g0 Z;
    public static final j2g0 Z0;
    public static final j2g0 a1;
    public static final j2g0 b;
    public static final j2g0 b1;
    public static final j2g0 c;
    public static final j2g0 c1;
    public static final j2g0 d;
    public static final j2g0 d1;
    public static final j2g0 e;
    public static final j2g0 e1;
    public static final j2g0 f;
    public static final j2g0 g;
    public static final j2g0 h;
    public static final j2g0 i;
    public static final j2g0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new j2g0(i2, (byte) 0);
        c = new j2g0(i2, (byte) 1);
        d = new j2g0(i2, (byte) 2);
        e = new j2g0(i2, (byte) 3);
        f = new j2g0(i2, (byte) 4);
        g = new j2g0(i2, (byte) 5);
        h = new j2g0(i2, (byte) 6);
        i = new j2g0(i2, (byte) 7);
        t = new j2g0(i2, (byte) 8);
        X = new j2g0(i2, (byte) 9);
        Y = new j2g0(i2, (byte) 10);
        Z = new j2g0(i2, (byte) 11);
        N0 = new j2g0(i2, (byte) 12);
        O0 = new j2g0(i2, (byte) 13);
        P0 = new j2g0(i2, (byte) 14);
        Q0 = new j2g0(i2, (byte) 15);
        R0 = new j2g0(i2, (byte) 16);
        S0 = new j2g0(i2, (byte) 17);
        T0 = new j2g0(i2, (byte) 18);
        U0 = new j2g0(i2, (byte) 19);
        V0 = new j2g0(i2, (byte) 20);
        W0 = new j2g0(i2, (byte) 21);
        X0 = new j2g0(i2, (byte) 22);
        Y0 = new j2g0(i2, (byte) 23);
        Z0 = new j2g0(i2, (byte) 24);
        a1 = new j2g0(i2, (byte) 25);
        b1 = new j2g0(i2, (byte) 26);
        c1 = new j2g0(i2, (byte) 27);
        d1 = new j2g0(i2, (byte) 28);
        e1 = new j2g0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2g0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                b261.d((e261) obj);
                return rih1Var;
            case 1:
                b261.c((e261) obj);
                return rih1Var;
            case 2:
                n2g0 n2g0Var = (n2g0) obj;
                return new o2g0(n2g0Var.e, "", n2g0Var.d);
            case 3:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case 4:
                s3g0 s3g0Var = (s3g0) obj;
                return new y3g0(s3g0Var.b, s3g0Var.a);
            case 5:
                return mno1.h(new mmr0[]{new mmr0("ManageBlockedContentModel", (r6g0) obj)});
            case 6:
                return mno1.h(new mmr0[]{new mmr0("ManageBlockedContentModel", (r6g0) obj)});
            case 7:
                b261.c((e261) obj);
                return rih1Var;
            case 8:
                return new u0l0((i3l0) obj);
            case 9:
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((u0l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 10:
                a9g0 a9g0Var = (a9g0) obj;
                return a9g0Var.a == ox3.b ? a9g0Var : a9g0.a(a9g0Var, true);
            case 11:
                return a9g0.a((a9g0) obj, false);
            case 12:
                return mno1.h(new mmr0[]{new mmr0("ManagedAccountAllowlistingRequestsModel", (b9g0) obj)});
            case 13:
                b261.c((e261) obj);
                return rih1Var;
            case 14:
                return qon1.C(((dbg0) obj).a);
            case 15:
                idg0 idg0Var = (idg0) obj;
                return upn1.B(idg0Var.a, idg0Var.b);
            case 16:
                xfg0 xfg0Var = (yfg0) obj;
                if (xfg0Var instanceof xfg0) {
                    return new agg0(xfg0Var.a);
                }
                if (xfg0Var instanceof wfg0) {
                    return zfg0.a;
                }
                eg.o();
                return null;
            case 17:
                return wfg0.a;
            case 18:
                return new olg0(((ilg0) obj).c);
            case 19:
                return ((ilg0) obj).a;
            case 20:
                return ((ilg0) obj).a;
            case 21:
                return ((ilg0) obj).b;
            case 22:
                return ((ilg0) obj).b;
            case 23:
                return ((ilg0) obj).a;
            case 24:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 25:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 26:
                return Boolean.valueOf((obj instanceof z6a1) || (obj instanceof rih1));
            case 27:
                if (obj instanceof rih1) {
                    return null;
                }
                return (z6a1) obj;
            case 28:
                return Boolean.valueOf(obj instanceof jo70);
            default:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
        }
    }
}
