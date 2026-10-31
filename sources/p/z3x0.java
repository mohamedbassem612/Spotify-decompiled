package p;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z3x0 implements f4h1 {
    public final MobiusLoop.Controller a;
    public final e7x0 b;
    public final FrameLayout c;

    public z3x0(MobiusLoop.Controller controller, e7x0 e7x0Var) {
        this.a = controller;
        this.b = e7x0Var;
        this.c = e7x0Var.t;
    }

    public final Object getView() {
        return this.c;
    }

    public final Bundle serialize() {
        return mno1.h(new mmr0[]{new mmr0("profile_model", (z6x0) this.a.a())});
    }

    public final void start() {
        e7x0 e7x0Var = this.b;
        MobiusLoop.Controller controller = this.a;
        controller.c(e7x0Var);
        controller.start();
    }

    public final void stop() {
        MobiusLoop.Controller controller = this.a;
        controller.stop();
        controller.disconnect();
    }
}
