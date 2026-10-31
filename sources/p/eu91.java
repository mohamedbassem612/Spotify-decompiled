package p;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.ViewGroup;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eu91 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu91(mbg1 mbg1Var, ViewGroup.MarginLayoutParams marginLayoutParams, boolean z, tcd1 tcd1Var) {
        super(1);
        this.a = (byte) 4;
        this.c = mbg1Var;
        this.d = marginLayoutParams;
        this.b = z;
        this.e = tcd1Var;
    }

    public final Object invoke(Object obj) {
        wpw wpwVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z = this.b;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                if (!z) {
                    return new tj4((byte) 18);
                }
                Object systemService = ((Context) obj4).getSystemService("sensor");
                SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
                if (sensorManager == null) {
                    return new tj4((byte) 19);
                }
                Sensor defaultSensor = sensorManager.getDefaultSensor(9);
                if (defaultSensor == null) {
                    return new tj4((byte) 20);
                }
                du91 du91Var = new du91((drr0) obj3, (drr0) obj2);
                sensorManager.registerListener((SensorEventListener) du91Var, defaultSensor, 1);
                return new w9d0(sensorManager, du91Var, (byte) 17);
            case 1:
                e261 e261Var = (e261) obj;
                b261.c(e261Var);
                b261.n(e261Var, (String) obj4);
                epo epoVar = (epo) obj3;
                b261.p(e261Var, z ? Collections.singletonList(epoVar) : p7h.M(new epo[]{epoVar, (epo) obj2}));
                return rih1Var;
            case 2:
                hav0 hav0Var = (hav0) obj;
                String str = (String) obj2;
                int iG = ((y9e1) obj4).b.g(hav0Var.c);
                cde1 cde1Var = (cde1) obj3;
                if (z) {
                    int iQ = o6p1.q(iG, str);
                    if (iQ < cde1Var.b.s()) {
                        cde1Var.f(iQ);
                    }
                } else {
                    int iP = o6p1.p(iG, str);
                    if (iP > cde1Var.a.s()) {
                        cde1Var.e(iP);
                    }
                }
                hav0Var.a();
                return rih1Var;
            case 3:
                e261 e261Var2 = (e261) obj;
                b261.n(e261Var2, (String) obj4);
                b261.x(e261Var2, 0);
                b261.y(e261Var2, z);
                b261.g(e261Var2, (String) obj3, new uuc1((Function0) obj2, (byte) 17));
                return rih1Var;
            case 4:
                z2s z2sVar = (z2s) obj;
                tcd1 tcd1Var = (tcd1) obj2;
                mbg1 mbg1Var = (mbg1) obj4;
                zhy zhyVar = mbg1Var.d;
                wpw wpwVar2 = mbg1Var.f;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) obj3;
                z2sVar.R(av31.class, f6o1.A(zhyVar, marginLayoutParams, (ScrollCardType) null, 2), new ibg1(mbg1Var, z, (byte) 0), h5g1.b1, kbg1.f, false, ggf1.d1);
                if (mbg1Var.n) {
                    z2sVar.R(cv31.class, f6o1.A(mbg1Var.e, marginLayoutParams, (ScrollCardType) null, 2), new ibf1(mbg1Var, (byte) 23), kbg1.i, kbg1.t, false, ggf1.e1);
                    wpwVar = wpwVar2;
                } else {
                    wpwVar = wpwVar2;
                    z2sVar.R(cv31.class, wpwVar, h5g1.R0, kbg1.X, kbg1.Y, false, lbg1.b);
                }
                z2sVar.R(dv31.class, wpwVar, h5g1.S0, h5g1.U0, h5g1.V0, false, ggf1.V0);
                z2sVar.R(ev31.class, mbg1Var.g, new ibg1(mbg1Var, z, (byte) 1), h5g1.W0, h5g1.X0, false, ggf1.W0);
                z2sVar.R(gv31.class, f6o1.A(mbg1Var.h, marginLayoutParams, (ScrollCardType) null, 2), new ibg1(mbg1Var, z, (byte) 2), h5g1.Y0, h5g1.Z0, false, ggf1.X0);
                z2sVar.R(hv31.class, f6o1.A(mbg1Var.i, marginLayoutParams, (ScrollCardType) null, 2), new jbg1(mbg1Var, tcd1Var, z, (byte) 0), h5g1.a1, h5g1.c1, false, ggf1.Y0);
                z2sVar.R(uv31.class, mbg1Var.j, new jbg1(mbg1Var, tcd1Var, z, (byte) 1), h5g1.d1, h5g1.e1, false, ggf1.Z0);
                z2sVar.R(sv31.class, f6o1.A(mbg1Var.k, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), h5g1.T0, kbg1.b, kbg1.c, false, ggf1.a1);
                z2sVar.R(vv31.class, f6o1.A(mbg1Var.l, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new rzf1(mbg1Var, tcd1Var, (byte) 3), kbg1.d, kbg1.e, false, ggf1.b1);
                z2sVar.R(uu31.class, f6o1.A(mbg1Var.b, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new aag1((byte) 1, z), kbg1.g, kbg1.h, false, ggf1.c1);
                return rih1Var;
            case 5:
                e261 e261Var3 = (e261) obj;
                b261.n(e261Var3, (String) obj4);
                if (z) {
                    b261.g(e261Var3, (String) null, new kni1((iu30) obj3, (b5i1) obj2, (byte) 0));
                }
                return rih1Var;
            default:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) ((iu30) obj4).invoke((Context) obj);
                videoSurfaceView.setSupportsSurfaceView(z);
                videoSurfaceView.setUseSurfaceView(z);
                videoSurfaceView.setOnFirstFrameRendered(new aya1((ven0) obj2, (byte) 27));
                ((iu30) obj3).invoke(videoSurfaceView);
                return videoSurfaceView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eu91(Object obj, boolean z, Object obj2, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu91(boolean z, Context context, drr0 drr0Var, drr0 drr0Var2) {
        super(1);
        this.a = (byte) 0;
        this.b = z;
        this.c = context;
        this.d = drr0Var;
        this.e = drr0Var2;
    }
}
