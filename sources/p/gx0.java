package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gx0 extends hab0 implements iu30 {
    public static final gx0 N0;
    public static final gx0 O0;
    public static final gx0 P0;
    public static final gx0 Q0;
    public static final gx0 R0;
    public static final gx0 S0;
    public static final gx0 T0;
    public static final gx0 U0;
    public static final gx0 V0;
    public static final gx0 W0;
    public static final gx0 X;
    public static final gx0 X0;
    public static final gx0 Y;
    public static final gx0 Y0;
    public static final gx0 Z;
    public static final gx0 Z0;
    public static final gx0 a1;
    public static final gx0 b;
    public static final gx0 b1;
    public static final gx0 c;
    public static final gx0 c1;
    public static final gx0 d;
    public static final gx0 d1;
    public static final gx0 e;
    public static final gx0 e1;
    public static final gx0 f;
    public static final gx0 g;
    public static final gx0 h;
    public static final gx0 i;
    public static final gx0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new gx0(i2, (byte) 0);
        c = new gx0(i2, (byte) 1);
        d = new gx0(i2, (byte) 2);
        e = new gx0(i2, (byte) 3);
        f = new gx0(i2, (byte) 4);
        g = new gx0(i2, (byte) 5);
        h = new gx0(i2, (byte) 6);
        i = new gx0(i2, (byte) 7);
        t = new gx0(i2, (byte) 8);
        X = new gx0(i2, (byte) 9);
        Y = new gx0(i2, (byte) 10);
        Z = new gx0(i2, (byte) 11);
        N0 = new gx0(i2, (byte) 12);
        O0 = new gx0(i2, (byte) 13);
        P0 = new gx0(i2, (byte) 14);
        Q0 = new gx0(i2, (byte) 15);
        R0 = new gx0(i2, (byte) 16);
        S0 = new gx0(i2, (byte) 17);
        T0 = new gx0(i2, (byte) 18);
        U0 = new gx0(i2, (byte) 19);
        V0 = new gx0(i2, (byte) 20);
        W0 = new gx0(i2, (byte) 21);
        X0 = new gx0(i2, (byte) 22);
        Y0 = new gx0(i2, (byte) 23);
        Z0 = new gx0(i2, (byte) 24);
        a1 = new gx0(i2, (byte) 25);
        b1 = new gx0(i2, (byte) 26);
        c1 = new gx0(i2, (byte) 27);
        d1 = new gx0(i2, (byte) 28);
        e1 = new gx0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gx0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return (r691) obj;
            case 1:
                b261.c((e261) obj);
                return rih1Var;
            case 2:
                b261.c((e261) obj);
                return rih1Var;
            case 3:
                return "";
            case 4:
                return new lof1(112, "", e, false);
            case 5:
                return ((Context) obj).getResources().getString(2131952026);
            case 6:
                return (lof1) obj;
            case 7:
                return (gof1) obj;
            case 8:
                return new ez0("", 0L, 0L, 0L, false, (i6h1) null);
            case 9:
                return rih1Var;
            case 10:
                return rih1Var;
            case 11:
                return mno1.h(new mmr0[]{new mmr0("AddBlockedContentModel", (bb1) obj)});
            case 12:
                return new p3v(((cvx) obj).b);
            case 13:
                return new p3v(8.0f);
            case 14:
                return new p3v(((cvx) obj).a);
            case 15:
                return new p3v(8.0f);
            case 16:
                b261.d((e261) obj);
                return rih1Var;
            case 17:
                b261.d((e261) obj);
                return rih1Var;
            case 18:
                return (qxc0) obj;
            case 19:
                cxc0 cxc0Var = (cxc0) obj;
                return new gd1(cxc0Var.f.f && cxc0Var.a());
            case 20:
                return Boolean.valueOf(obj instanceof qxc0);
            case 21:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 22:
                return new xyk0((i3l0) obj);
            case 23:
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((xyk0) obj).a, r6h1.c, System.currentTimeMillis());
            case 24:
                return new le1(((cxc0) obj).f.a);
            case 25:
                return new vyk0((i3l0) obj);
            case 26:
                return ((uho) obj).a;
            case 27:
                return ((uho) obj).a;
            case 28:
                if (!(obj instanceof iam) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                if (obj instanceof rih1) {
                    return null;
                }
                return (iam) obj;
        }
    }
}
