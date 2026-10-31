package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.impl.models.PluginIntegrationStatus;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sjg implements o5s {
    public final /* synthetic */ tjg a;

    public sjg(tjg tjgVar) {
        this.a = tjgVar;
    }

    public final void onCreate(iac0 iac0Var) {
        tjg tjgVar = this.a;
        ArrayList arrayList = tjgVar.Y;
        arrayList.clear();
        arrayList.add(tjgVar.b);
        arrayList.add(tjgVar.c);
        arrayList.add(tjgVar.d);
        arrayList.add(tjgVar.e);
        arrayList.add(tjgVar.f);
        arrayList.add(tjgVar.g);
        arrayList.add(tjgVar.h);
        tjgVar.t.a.put(tjgVar.a.getLocalClassName(), new WeakReference(tjgVar.X));
    }

    public final void onDestroy(iac0 iac0Var) {
        tjg tjgVar = this.a;
        Iterator it = tjgVar.Y.iterator();
        while (it.hasNext()) {
            ((baa) it.next()).f();
        }
        ((f0i) tjgVar.a).a.d(this);
    }

    public final void onPause(iac0 iac0Var) {
        tjg tjgVar = this.a;
        for (baa baaVar : tjgVar.Y) {
            Logger.g("ClientMessagingPlatform: UI Plugin: UI Hidden for formatType: " + baaVar.e, new Object[0]);
            baaVar.i.c();
        }
        tjgVar.i.a(tjgVar.a.getLocalClassName(), PluginIntegrationStatus.DETACHED);
    }

    public final void onResume(iac0 iac0Var) {
        tjg tjgVar = this.a;
        gj5 gj5Var = tjgVar.a;
        Iterator it = tjgVar.Y.iterator();
        while (it.hasNext()) {
            ((baa) it.next()).g(gj5Var);
        }
        tjgVar.i.a(gj5Var.getLocalClassName(), PluginIntegrationStatus.ATTACHED);
    }
}
