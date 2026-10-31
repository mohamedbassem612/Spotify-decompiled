package p;

import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.spotify.mobius.MobiusLoop;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kcf1 implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public kcf1(iu30 iu30Var, r091 r091Var) {
        this.a = (byte) 9;
        this.b = r091Var;
    }

    public final void dispose() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((lcf1) obj).h.invoke();
                break;
            case 1:
                ((k9) obj).D1((gw91) null);
                break;
            case 2:
                mhg1 mhg1Var = (mhg1) obj;
                mhg1Var.i();
                mhg1Var.a.t1();
                break;
            case 3:
                fns fnsVar = igu.a;
                bs50 bs50Var = pyf0.a;
                geo0 geo0Var = geo0.b;
                bs50Var.getClass();
                fn31.T(smo1.e(flo1.l(bs50Var, geo0Var)), (o8n) null, 0, new b0f1((skg1) obj, (lnm) null, (byte) 11), 3);
                break;
            case 4:
                bpb1 bpb1Var = ((wxl) obj).b;
                bpb1Var.m((Object) null, Integer.valueOf(((Number) bpb1Var.getValue()).intValue() + 1));
                break;
            case 5:
                ((tvh1) obj).f.invoke(0);
                break;
            case 6:
                ((xtm0) obj).c();
                break;
            case 7:
                ((ycl1) obj).d.m((Object) null, Boolean.FALSE);
                break;
            case 8:
                ((xab1) obj).d((CancellationException) null);
                break;
            case 9:
                r091 r091Var = (r091) obj;
                if (r091Var != null) {
                    r091Var.g();
                }
                break;
            case 10:
                ffj1 ffj1Var = (ffj1) obj;
                Boolean bool = ffj1Var.d;
                if (bool != null) {
                    if (!bool.booleanValue()) {
                        ((k0t) ffj1Var.b.getValue()).c(zyz.g);
                    } else {
                        ((xtm0) ffj1Var.c.getValue()).c();
                    }
                }
                break;
            case 11:
                ((hcl1) obj).c.l((Object) null);
                break;
            case 12:
                ((vsl1) obj).c();
                break;
            case 13:
                g2m1 g2m1Var = (g2m1) obj;
                MobiusLoop.Controller controller = g2m1Var.a;
                controller.stop();
                controller.disconnect();
                smo1.p(g2m1Var.b, (CancellationException) null);
                break;
            case 14:
                ((cem1) obj).e.d();
                break;
            default:
                udm1 udm1Var = (udm1) obj;
                udm1Var.e = false;
                SensorManager sensorManager = udm1Var.d;
                if (sensorManager != null) {
                    sensorManager.unregisterListener((SensorEventListener) udm1Var.m);
                }
                udm1Var.d = null;
                udm1Var.j = ((Number) udm1Var.b.getValue()).floatValue();
                udm1Var.i = 0.0f;
                udm1Var.f = null;
                udm1Var.k = false;
                break;
        }
    }

    public /* synthetic */ kcf1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
