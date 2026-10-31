package p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h601 implements o5s {
    public final /* synthetic */ j601 a;

    public h601(j601 j601Var) {
        this.a = j601Var;
    }

    public final void onPause(iac0 iac0Var) {
        MobiusLoop.Controller controller = this.a.d;
        controller.stop();
        controller.disconnect();
    }

    public final void onResume(iac0 iac0Var) {
        j601 j601Var = this.a;
        j601Var.h.invoke(j601Var.t);
        MobiusLoop.Controller controller = j601Var.d;
        controller.c(j601Var);
        controller.start();
    }
}
