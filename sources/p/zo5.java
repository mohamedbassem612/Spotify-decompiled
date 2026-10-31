package p;

import android.app.PendingIntent;
import android.os.Bundle;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zo5 {
    public final Map a;

    public zo5(Map map) {
        this.a = map;
    }

    public final PendingIntent a(AppLifecycleServicePendingIntent appLifecycleServicePendingIntent, Bundle bundle) {
        appLifecycleServicePendingIntent.toString();
        iu30 iu30Var = (iu30) this.a.get(appLifecycleServicePendingIntent);
        if (iu30Var != null) {
            return (PendingIntent) iu30Var.invoke(bundle);
        }
        hhg1.g(appLifecycleServicePendingIntent, "Non-existing pending intent for ");
        return null;
    }
}
