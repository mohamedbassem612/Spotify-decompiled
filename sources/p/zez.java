package p;

import android.view.View;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zez implements f4h1 {
    public final yzu a;
    public final MobiusLoop.Controller b;
    public final bfz c;
    public final idd1 d = new idd1(new yez(this));

    public zez(yzu yzuVar, MobiusLoop.Controller controller, bfz bfzVar) {
        this.a = yzuVar;
        this.b = controller;
        this.c = bfzVar;
    }

    public final Object getView() {
        return (View) this.d.getValue();
    }

    public final void start() {
        bfz bfzVar = this.c;
        MobiusLoop.Controller controller = this.b;
        controller.c(bfzVar);
        controller.start();
    }

    public final void stop() {
        MobiusLoop.Controller controller = this.b;
        controller.stop();
        controller.disconnect();
    }
}
