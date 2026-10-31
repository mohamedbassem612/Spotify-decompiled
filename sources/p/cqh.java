package p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cqh implements o5s {
    public final /* synthetic */ MobiusLoop.Controller a;
    public final /* synthetic */ iqh b;

    public cqh(MobiusLoop.Controller controller, iqh iqhVar) {
        this.a = controller;
        this.b = iqhVar;
    }

    public final void onPause(iac0 iac0Var) {
        MobiusLoop.Controller controller = this.a;
        if (((rph) controller.a()).c()) {
            this.b.b.c((rph) controller.a());
        }
        controller.stop();
        controller.disconnect();
    }

    public final void onResume(iac0 iac0Var) {
        iqh iqhVar = this.b;
        MobiusLoop.Controller controller = this.a;
        controller.c(iqhVar);
        controller.start();
    }
}
