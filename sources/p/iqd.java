package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class iqd implements dwo {
    public final em4 a;
    public final MobiusLoop.Controller b;

    public iqd(rqd rqdVar, em4 em4Var) {
        this.a = em4Var;
        if (em4Var.a() == dm4.b || em4Var.a() == dm4.c) {
            zqd zqdVar = new zqd(w7x.a);
            uqd uqdVar = (uqd) rqdVar;
            drd drdVar = uqdVar.a;
            h241 h241Var = uqdVar.b;
            jqd jqdVar = uqdVar.c;
            kly0 kly0Var = uqdVar.d;
            ypd ypdVar = uqdVar.e;
            MobiusLoop.Controller controllerB = Mobius.b(l1d.g(Mobius.d(tqd.a, RxConnectables.a(lqd.a(drdVar, uqdVar.f))).h(b3o1.x(kly0Var, h241Var, jqdVar, ypdVar))), zqdVar, sqd.a, MainThreadWorkRunner.a());
            this.b = controllerB;
            controllerB.c(hqd.b);
            controllerB.start();
        }
    }

    public final void shutdown() {
        MobiusLoop.Controller controller;
        em4 em4Var = this.a;
        if ((em4Var.a() == dm4.b || em4Var.a() == dm4.c) && (controller = this.b) != null) {
            controller.stop();
            controller.disconnect();
        }
    }
}
