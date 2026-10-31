package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.AndroidLogger;
import com.spotify.mobius.android.MobiusAndroid;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tj implements n6j0 {
    public final /* synthetic */ uj a;
    public final /* synthetic */ hi b;

    public tj(uj ujVar, hi hiVar) {
        this.a = ujVar;
        this.b = hiVar;
    }

    public final View f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        uj ujVar = this.a;
        rcr rcrVar = ujVar.c;
        odr odrVar = (odr) rcrVar.e.invoke(viewGroup);
        odrVar.n(new j2(ujVar, (byte) 3));
        ujVar.f = odrVar;
        pcr pcrVar = rcrVar.f;
        qcr qcrVar = (qcr) rcrVar.b().invoke(this.b);
        ocr ocrVar = new ocr();
        kcr kcrVar = pcrVar.a;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(hcr.class, new so(kcrVar, ujVar, (byte) 8));
        subtypeEffectHandlerBuilderC.g(gcr.class, new bk1(kcrVar, (byte) 10));
        subtypeEffectHandlerBuilderC.c(fcr.class, new jcr(ujVar, kcrVar));
        subtypeEffectHandlerBuilderC.c(dcr.class, new a21(kcrVar, ujVar, (byte) 29));
        subtypeEffectHandlerBuilderC.c(ecr.class, new yrh(ujVar, (byte) 12));
        subtypeEffectHandlerBuilderC.c(icr.class, new jcr(kcrVar));
        MobiusLoop.Controller controllerA = MobiusAndroid.a(Mobius.d(ocrVar, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).f(new AndroidLogger()), qcrVar);
        ujVar.g = controllerA;
        controllerA.c(ujVar);
        MobiusLoop.Controller controller = ujVar.g;
        if (controller != null) {
            controller.start();
            return odrVar.getView();
        }
        u890.C("loopController");
        throw null;
    }
}
