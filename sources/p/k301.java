package p;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k301 extends hab0 implements iu30 {
    public static final k301 N0;
    public static final k301 O0;
    public static final k301 P0;
    public static final k301 Q0;
    public static final k301 R0;
    public static final k301 S0;
    public static final k301 T0;
    public static final k301 U0;
    public static final k301 V0;
    public static final k301 W0;
    public static final k301 X;
    public static final k301 X0;
    public static final k301 Y;
    public static final k301 Y0;
    public static final k301 Z;
    public static final k301 Z0;
    public static final k301 a1;
    public static final k301 b;
    public static final k301 b1;
    public static final k301 c;
    public static final k301 c1;
    public static final k301 d;
    public static final k301 d1;
    public static final k301 e;
    public static final k301 e1;
    public static final k301 f;
    public static final k301 g;
    public static final k301 h;
    public static final k301 i;
    public static final k301 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new k301(i2, (byte) 0);
        c = new k301(i2, (byte) 1);
        d = new k301(i2, (byte) 2);
        e = new k301(i2, (byte) 3);
        f = new k301(i2, (byte) 4);
        g = new k301(i2, (byte) 5);
        h = new k301(i2, (byte) 6);
        i = new k301(i2, (byte) 7);
        t = new k301(i2, (byte) 8);
        X = new k301(i2, (byte) 9);
        Y = new k301(i2, (byte) 10);
        Z = new k301(i2, (byte) 11);
        N0 = new k301(i2, (byte) 12);
        O0 = new k301(i2, (byte) 13);
        P0 = new k301(i2, (byte) 14);
        Q0 = new k301(i2, (byte) 15);
        R0 = new k301(i2, (byte) 16);
        S0 = new k301(i2, (byte) 17);
        T0 = new k301(i2, (byte) 18);
        U0 = new k301(i2, (byte) 19);
        V0 = new k301(i2, (byte) 20);
        W0 = new k301(i2, (byte) 21);
        X0 = new k301(i2, (byte) 22);
        Y0 = new k301(i2, (byte) 23);
        Z0 = new k301(i2, (byte) 24);
        a1 = new k301(i2, (byte) 25);
        b1 = new k301(i2, (byte) 26);
        c1 = new k301(i2, (byte) 27);
        d1 = new k301(i2, (byte) 28);
        e1 = new k301(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k301(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Integer.valueOf(-((Number) obj).intValue());
            case 1:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case 2:
                return (Parcelable) jhc1.t((Bundle) obj, "parcelable", o501.class);
            case 3:
                cas casVar = (a7m0) obj;
                casVar.a = atz0.h;
                casVar.a(c, d);
                return rih1Var;
            case 4:
                ((Number) obj).longValue();
                return rih1Var;
            case 5:
                ((Number) obj).longValue();
                return rih1Var;
            case 6:
                return rih1Var;
            case 7:
                return "spotify:chat-reactions-sheet";
            case 8:
                return rih1Var;
            case 9:
                return hm5.P(xay.e(3, (ni20) null), xay.f(3, (ni20) null));
            case 10:
                return new a701((v601) obj);
            case 11:
                return (ga01) obj;
            case 12:
                k8g1 k8g1Var = (k8g1) obj;
                return new v601(k8g1Var.a, k8g1Var.h, k8g1Var.d, k8g1Var.e, k8g1Var.i, k8g1Var.f, k8g1Var.g, k8g1Var.t, k8g1Var.X);
            case 13:
                return Boolean.valueOf(obj instanceof k8g1);
            case 14:
                if (obj != null) {
                    return (k8g1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.transcript.model.Transcript");
                return null;
            case 15:
                dhl dhlVar = (dhl) obj;
                xid xidVar = dhlVar.d;
                ihl ihlVar = dhlVar.c;
                xid.r(xidVar, ihlVar.d, 0.0f, 6);
                xid.r(dhlVar.f, ihlVar.f, 0.0f, 6);
                yf.p(dhlVar.e, ihlVar.e, 0.0f, 6);
                yf.p(dhlVar.g, ihlVar.g, 0.0f, 6);
                hrt.m((p3v) null, "spread", dhlVar, (p3v) null, "wrap");
                return rih1Var;
            case 16:
                return ((vxo0) obj).a;
            case 17:
                return Boolean.valueOf(obj instanceof k8g1);
            case 18:
                if (obj != null) {
                    return (k8g1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.transcript.model.Transcript");
                return null;
            case 19:
                return (ga01) obj;
            case 20:
                return (k8g1) obj;
            case 21:
                n701 n701Var = ((uxo0) obj).a;
                return new v601(n701Var.a, n701Var.b, n701Var.c, n701Var.d, n701Var.e, n701Var.f, n701Var.g, n701Var.h, n701Var.i);
            case 22:
                return w7x.a;
            case 23:
                gl21 gl21Var = (gl21) obj;
                return new am21(gl21Var.b, gl21Var.a);
            case 24:
                return Integer.valueOf(obj != null ? obj.hashCode() : 0);
            case 25:
                ((Number) obj).intValue();
                return null;
            case 26:
                return new ma01();
            case 27:
                return (ga01) obj;
            case 28:
                return (k8g1) obj;
            default:
                return new ga01(10, (String) obj, null, true);
        }
    }
}
