package p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class qrd0 {
    public static final void a(MobiusLoop.Controller controller) {
        if (controller.isRunning()) {
            controller.stop();
            controller.disconnect();
        }
    }
}
