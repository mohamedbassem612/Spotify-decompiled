package p;

import android.app.Activity;
import android.view.Window;
import com.spotify.base.java.logging.Logger;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wpu extends g5 {
    public final Set a = Collections.newSetFromMap(mp10.l());
    public boolean b;

    public final void a(Activity activity) {
        Window window = activity.getWindow();
        if (this.b) {
            Logger.b("Device is docked now: %s", new Object[]{activity.getLocalClassName()});
            window.addFlags(128);
        } else {
            Logger.b("Device is un-docked now: %s", new Object[]{activity.getLocalClassName()});
            window.clearFlags(128);
        }
    }

    @Override // p.g5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.a.add(activity);
        a(activity);
    }

    @Override // p.g5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.a.remove(activity);
    }
}
