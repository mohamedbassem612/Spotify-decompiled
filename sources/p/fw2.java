package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fw2 extends hab0 implements iu30 {
    public static final fw2 N0;
    public static final fw2 O0;
    public static final fw2 P0;
    public static final fw2 Q0;
    public static final fw2 R0;
    public static final fw2 S0;
    public static final fw2 T0;
    public static final fw2 U0;
    public static final fw2 V0;
    public static final fw2 W0;
    public static final fw2 X;
    public static final fw2 X0;
    public static final fw2 Y;
    public static final fw2 Y0;
    public static final fw2 Z;
    public static final fw2 Z0;
    public static final fw2 a1;
    public static final fw2 b;
    public static final fw2 b1;
    public static final fw2 c;
    public static final fw2 c1;
    public static final fw2 d;
    public static final fw2 d1;
    public static final fw2 e;
    public static final fw2 e1;
    public static final fw2 f;
    public static final fw2 g;
    public static final fw2 h;
    public static final fw2 i;
    public static final fw2 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new fw2(i2, (byte) 0);
        c = new fw2(i2, (byte) 1);
        d = new fw2(i2, (byte) 2);
        e = new fw2(i2, (byte) 3);
        f = new fw2(i2, (byte) 4);
        g = new fw2(i2, (byte) 5);
        h = new fw2(i2, (byte) 6);
        i = new fw2(i2, (byte) 7);
        t = new fw2(i2, (byte) 8);
        X = new fw2(i2, (byte) 9);
        Y = new fw2(i2, (byte) 10);
        Z = new fw2(i2, (byte) 11);
        N0 = new fw2(i2, (byte) 12);
        O0 = new fw2(i2, (byte) 13);
        P0 = new fw2(i2, (byte) 14);
        Q0 = new fw2(i2, (byte) 15);
        R0 = new fw2(i2, (byte) 16);
        S0 = new fw2(i2, (byte) 17);
        T0 = new fw2(i2, (byte) 18);
        U0 = new fw2(i2, (byte) 19);
        V0 = new fw2(i2, (byte) 20);
        W0 = new fw2(i2, (byte) 21);
        X0 = new fw2(i2, (byte) 22);
        Y0 = new fw2(i2, (byte) 23);
        Z0 = new fw2(i2, (byte) 24);
        a1 = new fw2(i2, (byte) 25);
        b1 = new fw2(i2, (byte) 26);
        c1 = new fw2(i2, (byte) 27);
        d1 = new fw2(i2, (byte) 28);
        e1 = new fw2(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fw2(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        qw2 qw2Var = qw2.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return qw2Var;
            case 1:
                return ((pw2) obj).b;
            case 2:
                return (xkk1) obj;
            case 3:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 5:
                return qw2Var;
            case 6:
                b261.a((e261) obj);
                return rih1Var;
            case 7:
                b261.f((e261) obj);
                return rih1Var;
            case 8:
                b261.f((e261) obj);
                return rih1Var;
            case 9:
                return ((qm31) obj).a;
            case 10:
                b261.f((e261) obj);
                return rih1Var;
            case 11:
                return ((px2) obj).d;
            case 12:
                px2 px2Var = (px2) obj;
                return px2Var.a((String) px2Var.b.getValue(), (Locale) px2Var.c.getValue());
            case 13:
                ((qtr) obj).b(new kr(5, (lnm) null, (byte) 1));
                return rih1Var;
            case 14:
                return ((r2t) obj).f();
            case 15:
                return new k68((String) obj);
            case 16:
                return new euy(true);
            case 17:
                return new xsy((String) obj, true);
            case 18:
                return new q491(3, (iu30) null);
            case 19:
                return new tr71(gr71.a);
            case 20:
                return new f3l(0.0f, 4089, false);
            case 21:
                return ((q4g) obj).name();
            case 22:
                pxg1 pxg1Var = fz2.a;
                return hm5.P(xay.e(2, pxg1Var), xay.f(2, pxg1Var));
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return ((r2t) obj).j().b;
            case 24:
                pxg1 pxg1Var2 = tz2.a;
                return hm5.P(xay.e(2, pxg1Var2), xay.f(2, pxg1Var2));
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                pxg1 pxg1Var3 = tz2.a;
                return hm5.P(xay.e(2, pxg1Var3), xay.f(2, pxg1Var3));
            case 26:
                return l4o1.b0((ContextTrack) obj);
            case 27:
                return new jpt0((ipt0) null, 1);
            case 28:
                return new om51(false);
            default:
                return new lo51(true);
        }
    }
}
