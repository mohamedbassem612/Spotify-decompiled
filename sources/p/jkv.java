package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jkv extends hab0 implements iu30 {
    public static final jkv N0;
    public static final jkv O0;
    public static final jkv P0;
    public static final jkv Q0;
    public static final jkv R0;
    public static final jkv S0;
    public static final jkv T0;
    public static final jkv U0;
    public static final jkv V0;
    public static final jkv W0;
    public static final jkv X;
    public static final jkv X0;
    public static final jkv Y;
    public static final jkv Y0;
    public static final jkv Z;
    public static final jkv Z0;
    public static final jkv a1;
    public static final jkv b;
    public static final jkv b1;
    public static final jkv c;
    public static final jkv c1;
    public static final jkv d;
    public static final jkv d1;
    public static final jkv e;
    public static final jkv e1;
    public static final jkv f;
    public static final jkv g;
    public static final jkv h;
    public static final jkv i;
    public static final jkv t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new jkv(i2, (byte) 0);
        c = new jkv(i2, (byte) 1);
        d = new jkv(i2, (byte) 2);
        e = new jkv(i2, (byte) 3);
        f = new jkv(i2, (byte) 4);
        g = new jkv(i2, (byte) 5);
        h = new jkv(i2, (byte) 6);
        i = new jkv(i2, (byte) 7);
        t = new jkv(i2, (byte) 8);
        X = new jkv(i2, (byte) 9);
        Y = new jkv(i2, (byte) 10);
        Z = new jkv(i2, (byte) 11);
        N0 = new jkv(i2, (byte) 12);
        O0 = new jkv(i2, (byte) 13);
        P0 = new jkv(i2, (byte) 14);
        Q0 = new jkv(i2, (byte) 15);
        R0 = new jkv(i2, (byte) 16);
        S0 = new jkv(i2, (byte) 17);
        T0 = new jkv(i2, (byte) 18);
        U0 = new jkv(i2, (byte) 19);
        V0 = new jkv(i2, (byte) 20);
        W0 = new jkv(i2, (byte) 21);
        X0 = new jkv(i2, (byte) 22);
        Y0 = new jkv(i2, (byte) 23);
        Z0 = new jkv(i2, (byte) 24);
        a1 = new jkv(i2, (byte) 25);
        b1 = new jkv(i2, (byte) 26);
        c1 = new jkv(i2, (byte) 27);
        d1 = new jkv(i2, (byte) 28);
        e1 = new jkv(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jkv(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new a2v(((iey0) obj).a, 1);
            case 1:
                return ((iey0) obj).a;
            case 2:
                return ((iey0) obj).a;
            case 3:
                return ((iey0) obj).a;
            case 4:
                return new a2v(((iey0) obj).a, 1);
            case 5:
                return Boolean.valueOf(obj instanceof jo70);
            case 6:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 7:
                return Boolean.valueOf(obj instanceof xkk1);
            case 8:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 9:
                return ((iey0) obj).a;
            case 10:
                return ((iey0) obj).a;
            case 11:
                return new qkv(((okv) obj).a, "");
            case 12:
                return new okv(((ywo0) obj).a);
            case 13:
                return w7x.a;
            case 14:
                return rih1Var;
            case 15:
                if (((jn4) obj).e()) {
                    return new yzf1(2131104056, 2131233888);
                }
                return null;
            case 16:
                if (((jn4) obj).g()) {
                    return new yzf1(2131104063, 2131233887);
                }
                return null;
            case 17:
                if (((jn4) obj).f()) {
                    return new yzf1(2131104062, 2131233882);
                }
                return null;
            case 18:
                if (((jn4) obj).j()) {
                    return new yzf1(2131101292, 2131233885);
                }
                return null;
            case 19:
                return new yzf1(2131100177, 2131233889);
            case 20:
                return new yzf1(2131100207, 2131233880);
            case 21:
                return new yzf1(2131100264, 2131233890);
            case 22:
                return new yzf1(2131103939, 2131233886);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                if (((jn4) obj).c()) {
                    return new yzf1(2131102516, 2131233883);
                }
                return null;
            case 24:
                if (((jn4) obj).b()) {
                    return new yzf1(2131101554, 2131233881);
                }
                return null;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                if (((jn4) obj).i()) {
                    return new yzf1(2131104473, 2131233892);
                }
                return null;
            case 26:
                if (((jn4) obj).d()) {
                    return new yzf1(2131103614, 2131233884);
                }
                return null;
            case 27:
                if (((jn4) obj).h()) {
                    return new yzf1(2131104461, 2131233891);
                }
                return null;
            case 28:
                zmv zmvVar = (zmv) obj;
                String str = zmvVar.a;
                ova ovaVar = zmvVar.b;
                return new knv(str, str, ovaVar, ovaVar, zmvVar.c, false, hnv.a);
            default:
                b261.t((e261) obj, 0);
                return rih1Var;
        }
    }
}
