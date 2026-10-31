package p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h050 extends hab0 implements Function0 {
    public static final h050 N0;
    public static final h050 O0;
    public static final h050 P0;
    public static final h050 Q0;
    public static final h050 R0;
    public static final h050 S0;
    public static final h050 T0;
    public static final h050 U0;
    public static final h050 V0;
    public static final h050 W0;
    public static final h050 X;
    public static final h050 X0;
    public static final h050 Y;
    public static final h050 Y0;
    public static final h050 Z;
    public static final h050 Z0;
    public static final h050 a1;
    public static final h050 b;
    public static final h050 b1;
    public static final h050 c;
    public static final h050 c1;
    public static final h050 d;
    public static final h050 d1;
    public static final h050 e;
    public static final h050 e1;
    public static final h050 f;
    public static final h050 g;
    public static final h050 h;
    public static final h050 i;
    public static final h050 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new h050(i2, (byte) 0);
        c = new h050(i2, (byte) 1);
        d = new h050(i2, (byte) 2);
        e = new h050(i2, (byte) 3);
        f = new h050(i2, (byte) 4);
        g = new h050(i2, (byte) 5);
        h = new h050(i2, (byte) 6);
        i = new h050(i2, (byte) 7);
        t = new h050(i2, (byte) 8);
        X = new h050(i2, (byte) 9);
        Y = new h050(i2, (byte) 10);
        Z = new h050(i2, (byte) 11);
        N0 = new h050(i2, (byte) 12);
        O0 = new h050(i2, (byte) 13);
        P0 = new h050(i2, (byte) 14);
        Q0 = new h050(i2, (byte) 15);
        R0 = new h050(i2, (byte) 16);
        S0 = new h050(i2, (byte) 17);
        T0 = new h050(i2, (byte) 18);
        U0 = new h050(i2, (byte) 19);
        V0 = new h050(i2, (byte) 20);
        W0 = new h050(i2, (byte) 21);
        X0 = new h050(i2, (byte) 22);
        Y0 = new h050(i2, (byte) 23);
        Z0 = new h050(i2, (byte) 24);
        a1 = new h050(i2, (byte) 25);
        b1 = new h050(i2, (byte) 26);
        c1 = new h050(i2, (byte) 27);
        d1 = new h050(i2, (byte) 28);
        e1 = new h050(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h050(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return v150.INSTANCE;
            case 1:
                return new pfp0("com.spotify.gpb.googlecheckout.GoogleCheckoutPageViewState.Error.AnotherUserAlreadySubscribed", m150.INSTANCE, new Annotation[0]);
            case 2:
                return new pfp0("com.spotify.gpb.googlecheckout.GoogleCheckoutPageViewState.Error.CountryMismatch", r150.INSTANCE, new Annotation[0]);
            case 3:
                return new pfp0("com.spotify.gpb.googlecheckout.GoogleCheckoutPageViewState.Error.None", v150.INSTANCE, new Annotation[0]);
            case 4:
                return new pfp0("com.spotify.gpb.googlecheckout.GoogleCheckoutPageViewState.Error.SubscriptionNotOwnedByGoogleUser", w150.INSTANCE, new Annotation[0]);
            case 5:
                return "Live sharing dialog requires a negative buttonText";
            case 6:
                return "Live sharing dialog requires a positive button text";
            case 7:
                return "Live sharing dialog requires a non-null and non-blank title";
            case 8:
                return new tgm((String) null, false, false, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -1, 1);
            case 9:
                return rih1Var;
            case 10:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 11:
                return new gf60();
            case 12:
            case 13:
                return rih1Var;
            case 14:
                return new uut0();
            case 15:
                return new r36(chc1.a, (byte) 0);
            case 16:
                return new r36(chc1.a, (byte) 0);
            case 17:
                return new r36(sf70.a, (byte) 0);
            case 18:
                return new r36(vf70.a, (byte) 0);
            case 19:
                return new r36(mf70.a, (byte) 0);
            case 20:
            case 21:
            case 22:
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
            case 24:
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new drr0(1.0f);
            case 26:
            case 27:
            case 28:
                return rih1Var;
            default:
                return v8r.q(null);
        }
    }
}
