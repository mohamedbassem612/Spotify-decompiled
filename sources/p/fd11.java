package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fd11 extends hab0 implements iu30 {
    public static final fd11 N0;
    public static final fd11 O0;
    public static final fd11 P0;
    public static final fd11 Q0;
    public static final fd11 R0;
    public static final fd11 S0;
    public static final fd11 T0;
    public static final fd11 U0;
    public static final fd11 V0;
    public static final fd11 W0;
    public static final fd11 X;
    public static final fd11 X0;
    public static final fd11 Y;
    public static final fd11 Y0;
    public static final fd11 Z;
    public static final fd11 Z0;
    public static final fd11 a1;
    public static final fd11 b;
    public static final fd11 b1;
    public static final fd11 c;
    public static final fd11 c1;
    public static final fd11 d;
    public static final fd11 d1;
    public static final fd11 e;
    public static final fd11 e1;
    public static final fd11 f;
    public static final fd11 g;
    public static final fd11 h;
    public static final fd11 i;
    public static final fd11 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new fd11(i2, (byte) 0);
        c = new fd11(i2, (byte) 1);
        d = new fd11(i2, (byte) 2);
        e = new fd11(i2, (byte) 3);
        f = new fd11(i2, (byte) 4);
        g = new fd11(i2, (byte) 5);
        h = new fd11(i2, (byte) 6);
        i = new fd11(i2, (byte) 7);
        t = new fd11(i2, (byte) 8);
        X = new fd11(i2, (byte) 9);
        Y = new fd11(i2, (byte) 10);
        Z = new fd11(i2, (byte) 11);
        N0 = new fd11(i2, (byte) 12);
        O0 = new fd11(i2, (byte) 13);
        P0 = new fd11(i2, (byte) 14);
        Q0 = new fd11(i2, (byte) 15);
        R0 = new fd11(i2, (byte) 16);
        S0 = new fd11(i2, (byte) 17);
        T0 = new fd11(i2, (byte) 18);
        U0 = new fd11(i2, (byte) 19);
        V0 = new fd11(i2, (byte) 20);
        W0 = new fd11(i2, (byte) 21);
        X0 = new fd11(i2, (byte) 22);
        Y0 = new fd11(i2, (byte) 23);
        Z0 = new fd11(i2, (byte) 24);
        a1 = new fd11(i2, (byte) 25);
        b1 = new fd11(i2, (byte) 26);
        c1 = new fd11(i2, (byte) 27);
        d1 = new fd11(i2, (byte) 28);
        e1 = new fd11(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fd11(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 1:
                return Boolean.valueOf(obj instanceof xkk1);
            case 2:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 3:
                return rih1.a;
            case 4:
                return new sl1(true);
            case 5:
                return new k68((String) obj);
            case 6:
                return new euy(false);
            case 7:
                return new xsy((String) obj, false);
            case 8:
                return new ail0((bil0) obj, (byte) 3);
            case 9:
                return new ail0((bil0) obj, (byte) 1);
            case 10:
                return new ail0((bil0) obj, (byte) 4);
            case 11:
                return new ail0((bil0) obj, (byte) 2);
            case 12:
                return new ail0((bil0) obj, (byte) 0);
            case 13:
                return new om51(false);
            case 14:
                return new lo51(((Boolean) obj).booleanValue());
            case 15:
                return new lo51(((Boolean) obj).booleanValue());
            case 16:
                return new c7v0(1, ((Boolean) obj).booleanValue());
            case 17:
                return new lo51(((Boolean) obj).booleanValue());
            case 18:
                return new lo51(((Boolean) obj).booleanValue());
            case 19:
                return new sl1(true);
            case 20:
                return new ii11(new ue21("", 1, 1, false), 2);
            case 21:
                return new ni11(new f0g1("", 0L, 0L, false, ((lo51) obj).a, false, (yzf1) null, (agv) null, 224), 2, sig0.a);
            case 22:
                return ((ni11) obj).a;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return (e0g1) obj;
            case 24:
                mm91 mm91Var = new mm91(false);
                rp91 rp91Var = rp91.b;
                return new em91("", "", mm91Var, false, new sp91(rp91Var, rp91Var, rp91.a), 40);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return (em91) obj;
            case 26:
                return (am91) obj;
            case 27:
                return new l691("", true, new fvf1(0L, 0L));
            case 28:
                return (l691) obj;
            default:
                return (j691) obj;
        }
    }
}
