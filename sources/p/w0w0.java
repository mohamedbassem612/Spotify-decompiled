package p;

import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.Connectables;
import com.spotify.mobius.extras.SimpleConnectable;
import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w0w0 implements f4h1 {
    public final MobiusLoop.Controller a;
    public final bfz b;
    public final Function c;

    public w0w0(MobiusLoop.Controller controller, bfz bfzVar, Function function) {
        this.a = controller;
        this.b = bfzVar;
        this.c = function;
    }

    public final Object getView() {
        return (ViewGroup) ((idd1) ((dzp0) this.b.c).b).getValue();
    }

    public final void start() {
        SimpleConnectable simpleConnectableA = Connectables.a(this.c, this.b);
        MobiusLoop.Controller controller = this.a;
        controller.c(simpleConnectableA);
        controller.start();
    }

    public final void stop() {
        MobiusLoop.Controller controller = this.a;
        controller.stop();
        controller.disconnect();
    }
}
