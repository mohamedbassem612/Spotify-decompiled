package p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eta1 implements o5s {
    public final /* synthetic */ MobiusLoop.Controller a;

    public eta1(MobiusLoop.Controller controller) {
        this.a = controller;
    }

    public final void onDestroy(iac0 iac0Var) {
        this.a.disconnect();
    }

    public final void onStart(iac0 iac0Var) {
        this.a.start();
    }

    public final void onStop(iac0 iac0Var) {
        this.a.stop();
    }
}
