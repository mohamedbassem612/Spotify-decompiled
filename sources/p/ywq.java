package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ywq extends hab0 implements iu30 {
    public static final ywq N0;
    public static final ywq O0;
    public static final ywq P0;
    public static final ywq Q0;
    public static final ywq R0;
    public static final ywq S0;
    public static final ywq T0;
    public static final ywq U0;
    public static final ywq V0;
    public static final ywq W0;
    public static final ywq X;
    public static final ywq X0;
    public static final ywq Y;
    public static final ywq Y0;
    public static final ywq Z;
    public static final ywq Z0;
    public static final ywq a1;
    public static final ywq b;
    public static final ywq b1;
    public static final ywq c;
    public static final ywq c1;
    public static final ywq d;
    public static final ywq d1;
    public static final ywq e;
    public static final ywq e1;
    public static final ywq f;
    public static final ywq g;
    public static final ywq h;
    public static final ywq i;
    public static final ywq t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ywq(i2, (byte) 0);
        c = new ywq(i2, (byte) 1);
        d = new ywq(i2, (byte) 2);
        e = new ywq(i2, (byte) 3);
        f = new ywq(i2, (byte) 4);
        g = new ywq(i2, (byte) 5);
        h = new ywq(i2, (byte) 6);
        i = new ywq(i2, (byte) 7);
        t = new ywq(i2, (byte) 8);
        X = new ywq(i2, (byte) 9);
        Y = new ywq(i2, (byte) 10);
        Z = new ywq(i2, (byte) 11);
        N0 = new ywq(i2, (byte) 12);
        O0 = new ywq(i2, (byte) 13);
        P0 = new ywq(i2, (byte) 14);
        Q0 = new ywq(i2, (byte) 15);
        R0 = new ywq(i2, (byte) 16);
        S0 = new ywq(i2, (byte) 17);
        T0 = new ywq(i2, (byte) 18);
        U0 = new ywq(i2, (byte) 19);
        V0 = new ywq(i2, (byte) 20);
        W0 = new ywq(i2, (byte) 21);
        X0 = new ywq(i2, (byte) 22);
        Y0 = new ywq(i2, (byte) 23);
        Z0 = new ywq(i2, (byte) 24);
        a1 = new ywq(i2, (byte) 25);
        b1 = new ywq(i2, (byte) 26);
        c1 = new ywq(i2, (byte) 27);
        d1 = new ywq(i2, (byte) 28);
        e1 = new ywq(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ywq(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                return new uwq((vnb1) obj);
            case 1:
                if (!(obj instanceof vnb1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vnb1) obj;
            case 3:
                b261.c((e261) obj);
                return rih1Var;
            case 4:
                b261.c((e261) obj);
                return rih1Var;
            case 5:
                return rih1Var;
            case 6:
                return rih1Var;
            case 7:
                return ((yyq) obj).getMessage();
            case 8:
                return Boolean.valueOf(obj instanceof lo7);
            case 9:
                if (obj != null) {
                    return (lo7) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.audioassociations.AudioAssociations");
                return null;
            case 10:
                return (String) obj;
            case 11:
                return (lo7) obj;
            case 12:
                return i3p1.u((yyq) obj);
            case 13:
                return rih1Var;
            case 14:
                return rih1Var;
            case 15:
                if (!(obj instanceof hd0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hd0) obj;
            case 17:
                uv11 uv11Var = (uv11) obj;
                return new id0(uv11Var.b, uv11Var.a);
            case 18:
                hd0 hd0Var = (hd0) obj;
                int i2 = hd0Var != null ? hd0Var.a : 0;
                int i3 = i2 == 0 ? -1 : t3r.a[l1d.C(i2)];
                if (i3 == -1 || i3 == 1) {
                    return rrt0.b;
                }
                if (i3 == 2) {
                    return rrt0.a;
                }
                if (i3 == 3) {
                    return rrt0.c;
                }
                eg.o();
                return null;
            case 19:
                if (!(obj instanceof rry) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                if (obj instanceof rih1) {
                    return null;
                }
                return (rry) obj;
            case 21:
                if (!(obj instanceof hi40) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hi40) obj;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                if (!(obj instanceof hi40) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hi40) obj;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                uv11 uv11Var2 = (uv11) obj;
                return new sry(uv11Var2.b, uv11Var2.a);
            case 26:
                uv11 uv11Var3 = (uv11) obj;
                return new fsy(uv11Var3.b, uv11Var3.a);
            case 27:
                uv11 uv11Var4 = (uv11) obj;
                return new esy(uv11Var4.b, uv11Var4.a);
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qfd) obj;
            default:
                if (!(obj instanceof qfd) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
