package p;

import android.content.Context;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l6j1 extends hab0 implements iu30 {
    public static final l6j1 N0;
    public static final l6j1 O0;
    public static final l6j1 P0;
    public static final l6j1 Q0;
    public static final l6j1 R0;
    public static final l6j1 S0;
    public static final l6j1 T0;
    public static final l6j1 U0;
    public static final l6j1 V0;
    public static final l6j1 W0;
    public static final l6j1 X;
    public static final l6j1 X0;
    public static final l6j1 Y;
    public static final l6j1 Y0;
    public static final l6j1 Z;
    public static final l6j1 Z0;
    public static final l6j1 a1;
    public static final l6j1 b;
    public static final l6j1 b1;
    public static final l6j1 c;
    public static final l6j1 c1;
    public static final l6j1 d;
    public static final l6j1 d1;
    public static final l6j1 e;
    public static final l6j1 e1;
    public static final l6j1 f;
    public static final l6j1 g;
    public static final l6j1 h;
    public static final l6j1 i;
    public static final l6j1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new l6j1(i2, (byte) 0);
        c = new l6j1(i2, (byte) 1);
        d = new l6j1(i2, (byte) 2);
        e = new l6j1(i2, (byte) 3);
        f = new l6j1(i2, (byte) 4);
        g = new l6j1(i2, (byte) 5);
        h = new l6j1(i2, (byte) 6);
        i = new l6j1(i2, (byte) 7);
        t = new l6j1(i2, (byte) 8);
        X = new l6j1(i2, (byte) 9);
        Y = new l6j1(i2, (byte) 10);
        Z = new l6j1(i2, (byte) 11);
        N0 = new l6j1(i2, (byte) 12);
        O0 = new l6j1(i2, (byte) 13);
        P0 = new l6j1(i2, (byte) 14);
        Q0 = new l6j1(i2, (byte) 15);
        R0 = new l6j1(i2, (byte) 16);
        S0 = new l6j1(i2, (byte) 17);
        T0 = new l6j1(i2, (byte) 18);
        U0 = new l6j1(i2, (byte) 19);
        V0 = new l6j1(i2, (byte) 20);
        W0 = new l6j1(i2, (byte) 21);
        X0 = new l6j1(i2, (byte) 22);
        Y0 = new l6j1(i2, (byte) 23);
        Z0 = new l6j1(i2, (byte) 24);
        a1 = new l6j1(i2, (byte) 25);
        b1 = new l6j1(i2, (byte) 26);
        c1 = new l6j1(i2, (byte) 27);
        d1 = new l6j1(i2, (byte) 28);
        e1 = new l6j1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l6j1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                String str = ((n6j1) obj).d;
                return str == null ? "" : str;
            case 1:
                String str2 = ((n6j1) obj).d;
                return str2 == null ? "" : str2;
            case 2:
                b261.c((e261) obj);
                return rih1Var;
            case 3:
                return ((b7j1) obj).c;
            case 4:
                return b7x.a;
            case 5:
                return ((c7j1) obj).c;
            case 6:
                b261.f((e261) obj);
                return rih1Var;
            case 7:
                return (kej1) obj;
            case 8:
                gi90 gi90Var = (gi90) obj;
                String str3 = gi90Var.b;
                return str3.length() == 0 ? gi90Var.e : str3;
            case 9:
                ((Number) obj).intValue();
                return null;
            case 10:
                return ((jej1) obj).b;
            case 11:
                ((Number) obj).intValue();
                return null;
            case 12:
                return rih1Var;
            case 13:
                return ((yej1) obj).c;
            case 14:
                return ((yej1) obj).b;
            case 15:
                return Boolean.valueOf(obj instanceof bbl1);
            case 16:
                if (obj != null) {
                    return (bbl1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.watchfeedseeditemtrait.WatchFeedSeedItemTrait");
                return null;
            case 17:
                return Boolean.valueOf(obj instanceof bbl1);
            case 18:
                if (obj != null) {
                    return (bbl1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.watchfeedseeditemtrait.WatchFeedSeedItemTrait");
                return null;
            case 19:
                t4t0 t4t0Var = (t4t0) obj;
                return new yej1(t4t0Var.f, t4t0Var.a, t4t0Var.b, t4t0Var.c, t4t0Var.d, 0.5625f);
            case 20:
                u4t0 u4t0Var = (u4t0) obj;
                return new yej1(u4t0Var.f, u4t0Var.a, u4t0Var.b, u4t0Var.c, u4t0Var.d, 0.75f);
            case 21:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                videoSurfaceView.setBufferingThrobberEnabled(false);
                videoSurfaceView.setScaleType(b3k1.c);
                return videoSurfaceView;
            case 22:
                return ((cyo0) obj).b;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new nuj1("video-preview-carousel-npv-scroll", ((cyo0) obj).a, "npv");
            case 24:
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return o7h.p1(((cyo0) obj).a);
            case 26:
                return ((ufj1) obj).a;
            case 27:
                return ((ufj1) obj).a;
            case 28:
                return ((ufj1) obj).a;
            default:
                return ((ufj1) obj).a;
        }
    }
}
