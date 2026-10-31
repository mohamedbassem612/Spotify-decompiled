package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.impl.models.PluginIntegrationStatus;
import com.spotify.player.model.ContextTrack;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tkd implements o5s {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tkd(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void onCreate(iac0 iac0Var) {
        ContextTrack contextTrack;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                vkd vkdVar = (vkd) obj;
                vkdVar.c();
                ((ne) this.c).a0();
                if (vkdVar.l1 == null && (contextTrack = vkdVar.o1) != null) {
                    vkdVar.N(contextTrack);
                }
                vkdVar.m1 = true;
                uoa uoaVar = vkdVar.l1;
                if (uoaVar != null) {
                    uoaVar.l();
                }
                vkdVar.M();
                break;
            default:
                h72 h72Var = ((kjg) obj).a;
                ArrayList arrayList = (ArrayList) h72Var.Y;
                arrayList.clear();
                arrayList.add((baa) h72Var.c);
                arrayList.add((baa) h72Var.d);
                arrayList.add((baa) h72Var.e);
                arrayList.add((baa) h72Var.f);
                arrayList.add((baa) h72Var.g);
                arrayList.add((baa) h72Var.h);
                ((qic) h72Var.t).a.put(((gj5) h72Var.b).getLocalClassName(), new WeakReference((j50) h72Var.X));
                break;
        }
    }

    public final void onDestroy(iac0 iac0Var) {
        switch (this.a) {
            case 0:
                vkd vkdVar = (vkd) this.b;
                vkdVar.m1 = false;
                uoa uoaVar = vkdVar.l1;
                if (uoaVar != null) {
                    uoaVar.f();
                }
                vkdVar.J();
                ne neVar = vkdVar.Z0;
                ((LinkedHashSet) neVar.b).clear();
                ((rku) neVar.d).a();
                uoa uoaVar2 = vkdVar.l1;
                if (uoaVar2 != null) {
                    uoaVar2.k(vkdVar.h1);
                    vkdVar.X0.c(uoaVar2);
                }
                vkdVar.l1 = null;
                vkdVar.r1++;
                vkdVar.p1 = false;
                break;
            default:
                Iterator it = ((ArrayList) ((kjg) this.b).a.Y).iterator();
                while (it.hasNext()) {
                    ((baa) it.next()).f();
                }
                ((f0i) ((t3b1) this.c)).a.d(this);
                break;
        }
    }

    public final void onPause(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((vkd) obj).y1.a = false;
                break;
            default:
                h72 h72Var = ((kjg) obj).a;
                for (baa baaVar : (ArrayList) h72Var.Y) {
                    Logger.g("ClientMessagingPlatform: UI Plugin: UI Hidden for formatType: " + baaVar.e, new Object[0]);
                    baaVar.i.c();
                }
                ((kmc) h72Var.i).a(((gj5) h72Var.b).getLocalClassName(), PluginIntegrationStatus.DETACHED);
                break;
        }
    }

    public final void onResume(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((vkd) obj).y1.a = true;
                break;
            default:
                h72 h72Var = ((kjg) obj).a;
                gj5 gj5Var = (gj5) h72Var.b;
                Iterator it = ((ArrayList) h72Var.Y).iterator();
                while (it.hasNext()) {
                    ((baa) it.next()).g(gj5Var);
                }
                ((kmc) h72Var.i).a(gj5Var.getLocalClassName(), PluginIntegrationStatus.ATTACHED);
                break;
        }
    }
}
