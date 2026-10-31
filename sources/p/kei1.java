package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kei1 extends hab0 implements iu30 {
    public static final kei1 N0;
    public static final kei1 O0;
    public static final kei1 P0;
    public static final kei1 Q0;
    public static final kei1 R0;
    public static final kei1 S0;
    public static final kei1 T0;
    public static final kei1 U0;
    public static final kei1 V0;
    public static final kei1 W0;
    public static final kei1 X;
    public static final kei1 X0;
    public static final kei1 Y;
    public static final kei1 Y0;
    public static final kei1 Z;
    public static final kei1 Z0;
    public static final kei1 a1;
    public static final kei1 b;
    public static final kei1 b1;
    public static final kei1 c;
    public static final kei1 c1;
    public static final kei1 d;
    public static final kei1 d1;
    public static final kei1 e;
    public static final kei1 e1;
    public static final kei1 f;
    public static final kei1 g;
    public static final kei1 h;
    public static final kei1 i;
    public static final kei1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new kei1(i2, (byte) 0);
        c = new kei1(i2, (byte) 1);
        d = new kei1(i2, (byte) 2);
        e = new kei1(i2, (byte) 3);
        f = new kei1(i2, (byte) 4);
        g = new kei1(i2, (byte) 5);
        h = new kei1(i2, (byte) 6);
        i = new kei1(i2, (byte) 7);
        t = new kei1(i2, (byte) 8);
        X = new kei1(i2, (byte) 9);
        Y = new kei1(i2, (byte) 10);
        Z = new kei1(i2, (byte) 11);
        N0 = new kei1(i2, (byte) 12);
        O0 = new kei1(i2, (byte) 13);
        P0 = new kei1(i2, (byte) 14);
        Q0 = new kei1(i2, (byte) 15);
        R0 = new kei1(i2, (byte) 16);
        S0 = new kei1(i2, (byte) 17);
        T0 = new kei1(i2, (byte) 18);
        U0 = new kei1(i2, (byte) 19);
        V0 = new kei1(i2, (byte) 20);
        W0 = new kei1(i2, (byte) 21);
        X0 = new kei1(i2, (byte) 22);
        Y0 = new kei1(i2, (byte) 23);
        Z0 = new kei1(i2, (byte) 24);
        a1 = new kei1(i2, (byte) 25);
        b1 = new kei1(i2, (byte) 26);
        c1 = new kei1(i2, (byte) 27);
        d1 = new kei1(i2, (byte) 28);
        e1 = new kei1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kei1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return (mqm) obj;
            case 1:
                return (List) obj;
            case 2:
                return Boolean.valueOf(obj instanceof List);
            case 3:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.contribution.model.Contribution>");
                return null;
            case 4:
                return Boolean.valueOf(obj instanceof nqm);
            case 5:
                if (obj != null) {
                    return (nqm) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.contribution.model.ContributionKindCapabilities");
                return null;
            case 6:
                return Boolean.valueOf(obj instanceof List);
            case 7:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.contribution.model.Contribution>");
                return null;
            case 8:
                return (mqm) obj;
            case 9:
                return (List) obj;
            case 10:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 12:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 14:
                return z6b1.a((String) obj);
            case 15:
                return z6b1.a((String) obj);
            case 16:
                return ((w4i1) obj).b;
            case 17:
                return mno1.h(new mmr0[]{new mmr0("stats-page-saved-instance", (whi1) obj)});
            case 18:
                return new rqe1(2131963214, iqe1.a, ert0.a, "listeningstats");
            case 19:
                return new xji1((uqo) obj, (String) null);
            case 20:
                e261 e261Var = (e261) obj;
                b261.c(e261Var);
                b261.t(e261Var, 0);
                return rih1Var;
            case 21:
                return rih1Var;
            case 22:
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return rih1Var;
            case 24:
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                b261.d((e261) obj);
                return rih1Var;
            case 26:
                b261.d((e261) obj);
                return rih1Var;
            case 27:
                b261.c((e261) obj);
                return rih1Var;
            case 28:
                return ((kvi1) obj).a;
            default:
                return ((kvi1) obj).a;
        }
    }
}
