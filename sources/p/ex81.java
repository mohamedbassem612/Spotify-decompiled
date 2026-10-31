package p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ex81 implements o5s {
    public final /* synthetic */ fx81 a;
    public final /* synthetic */ h8l b;

    public ex81(fx81 fx81Var, h8l h8lVar) {
        this.a = fx81Var;
        this.b = h8lVar;
    }

    public final void onStart(iac0 iac0Var) {
        MobiusLoop.Controller controller = this.a.t;
        controller.c(this.b);
        controller.start();
    }

    public final void onStop(iac0 iac0Var) {
        MobiusLoop.Controller controller = this.a.t;
        controller.stop();
        controller.disconnect();
    }
}
