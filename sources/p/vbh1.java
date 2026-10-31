package p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.lang.annotation.Annotation;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vbh1 extends hab0 implements Function0 {
    public static final vbh1 N0;
    public static final vbh1 O0;
    public static final vbh1 P0;
    public static final vbh1 Q0;
    public static final vbh1 R0;
    public static final vbh1 S0;
    public static final vbh1 T0;
    public static final vbh1 U0;
    public static final vbh1 V0;
    public static final vbh1 W0;
    public static final vbh1 X;
    public static final vbh1 X0;
    public static final vbh1 Y;
    public static final vbh1 Y0;
    public static final vbh1 Z;
    public static final vbh1 Z0;
    public static final vbh1 a1;
    public static final vbh1 b;
    public static final vbh1 b1;
    public static final vbh1 c;
    public static final vbh1 c1;
    public static final vbh1 d;
    public static final vbh1 d1;
    public static final vbh1 e;
    public static final vbh1 e1;
    public static final vbh1 f;
    public static final vbh1 g;
    public static final vbh1 h;
    public static final vbh1 i;
    public static final vbh1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new vbh1(i2, (byte) 0);
        c = new vbh1(i2, (byte) 1);
        d = new vbh1(i2, (byte) 2);
        e = new vbh1(i2, (byte) 3);
        f = new vbh1(i2, (byte) 4);
        g = new vbh1(i2, (byte) 5);
        h = new vbh1(i2, (byte) 6);
        i = new vbh1(i2, (byte) 7);
        t = new vbh1(i2, (byte) 8);
        X = new vbh1(i2, (byte) 9);
        Y = new vbh1(i2, (byte) 10);
        Z = new vbh1(i2, (byte) 11);
        N0 = new vbh1(i2, (byte) 12);
        O0 = new vbh1(i2, (byte) 13);
        P0 = new vbh1(i2, (byte) 14);
        Q0 = new vbh1(i2, (byte) 15);
        R0 = new vbh1(i2, (byte) 16);
        S0 = new vbh1(i2, (byte) 17);
        T0 = new vbh1(i2, (byte) 18);
        U0 = new vbh1(i2, (byte) 19);
        V0 = new vbh1(i2, (byte) 20);
        W0 = new vbh1(i2, (byte) 21);
        X0 = new vbh1(i2, (byte) 22);
        Y0 = new vbh1(i2, (byte) 23);
        Z0 = new vbh1(i2, (byte) 24);
        a1 = new vbh1(i2, (byte) 25);
        b1 = new vbh1(i2, (byte) 26);
        c1 = new vbh1(i2, (byte) 27);
        d1 = new vbh1(i2, (byte) 28);
        e1 = new vbh1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vbh1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return UUID.randomUUID().toString();
            case 1:
                return new r36(chc1.a, (byte) 0);
            case 2:
                return new r36(ze51.a, (byte) 0);
            case 3:
                return new r36(neh1.a, (byte) 0);
            case 4:
                return new r36(bfh1.a, (byte) 0);
            case 5:
                dbr0 yxe1Var = new yxe1(new ehc1(""));
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.G1("UNBOXING_MAIN_HUB", "unboxing/main-hub", 2062, "unboxing"), nik1.p3, (nar0) null), new s9h1(14, true, false, false)}, false);
            case 6:
                return rih1Var;
            case 7:
                return fc11.v("com.spotify.betamax.contextplayercoordinatorimpl.cosmos.UnplayableReason", yjh1.values(), new String[]{"not_available", "not_available_offline", "not_available_in_current_region", "nt_available_in_non_premium", "not_available_by_artist_ban", "local_file_not_found", "local_file_bad_format", "local_file_drm_protected", "user_streaming_disallowed", "user_capping_reached", "background", "driver_distracted", "missing_manifest_id"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 8:
            case 9:
            case 10:
                return rih1Var;
            case 11:
                return new vku();
            case 12:
                return gio1.b(o1a.a);
            case 13:
                return gio1.b(nvi1.t);
            case 14:
                return gio1.b(new kyi1(z6x.a, 0));
            case 15:
                return v8r.q(Boolean.FALSE);
            case 16:
                return new err0(0);
            case 17:
                return v8r.q(Boolean.FALSE);
            case 18:
                return Boolean.TRUE;
            case 19:
                return Boolean.FALSE;
            case 20:
                return h44.b;
            case 21:
                return Boolean.TRUE;
            case 22:
                return Boolean.TRUE;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return rih1Var;
            case 24:
                return null;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 26:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 27:
                return sg01.Companion.serializer();
            case 28:
                return yjh1.Companion.serializer();
            default:
                return Boolean.FALSE;
        }
    }
}
