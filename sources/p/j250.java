package p;

import android.app.Activity;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j250 implements qac0 {
    public final rp5 a;
    public final g050 b;
    public final zn41 c;

    public j250(rp5 rp5Var, g050 g050Var, zn41 zn41Var) {
        this.a = rp5Var;
        this.b = g050Var;
        this.c = zn41Var;
    }

    @Override // p.qac0
    public final void a() {
        if (this.a.b()) {
            Logger.b("[GoogleDesktopTaskRemovedPlugin] Google Desktop window closed, shutting down", new Object[0]);
            this.c.a("google-desktop-playback-shutdown", vc40.Z0);
            Activity activity = (Activity) this.b.invoke();
            if (activity == null) {
                Logger.b("[GoogleDesktopTaskRemovedPlugin] NO ACTIVITY TO finishAffinity on", new Object[0]);
                return;
            }
            try {
                activity.setResult(0);
                activity.finishAffinity();
            } catch (IllegalStateException e) {
                Logger.e(e, "[GoogleDesktopTaskRemovedPlugin] finishAffinity failed, process may leak", new Object[0]);
            }
        }
    }
}
