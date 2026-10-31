package p;

import android.app.Application;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.impl.models.PluginIntegrationStatus;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kmc {
    public final BehaviorSubject a = BehaviorSubject.g(b7x.a);
    public final ConcurrentHashMap.KeySetView b = ConcurrentHashMap.newKeySet();
    public final LinkedHashMap c = new LinkedHashMap();

    public kmc(Application application) {
        application.registerActivityLifecycleCallbacks(new ec0(this, (byte) 1));
    }

    public final void a(String str, PluginIntegrationStatus pluginIntegrationStatus) {
        int i = jmc.a[pluginIntegrationStatus.ordinal()];
        LinkedHashMap linkedHashMap = this.c;
        if (i == 1) {
            linkedHashMap.remove(str);
        } else {
            if (i != 2) {
                eg.o();
                return;
            }
            linkedHashMap.put(str, pluginIntegrationStatus);
        }
        this.a.onNext(linkedHashMap);
    }
}
