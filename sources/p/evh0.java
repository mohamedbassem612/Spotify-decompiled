package p;

import android.media.RoutingSessionInfo;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class evh0 {
    public final mvh0 b;
    public final long c;
    public final int d;
    public boolean g;
    public RoutingSessionInfo h;
    public String i;
    public String j;
    public final /* synthetic */ fvh0 k;
    public final y36 a = new y36(0);
    public boolean f = false;
    public final WeakReference e = new WeakReference(null);

    public evh0(fvh0 fvh0Var, mvh0 mvh0Var, long j, int i) {
        this.k = fvh0Var;
        this.b = mvh0Var;
        this.c = j;
        this.d = i;
    }

    public final void a(String str, RoutingSessionInfo routingSessionInfo, RoutingSessionInfo routingSessionInfo2) {
        y36 y36Var;
        nvh0 nvh0Var;
        List<String> selectedRoutes = routingSessionInfo == null ? Collections.EMPTY_LIST : routingSessionInfo.getSelectedRoutes();
        List<String> selectedRoutes2 = routingSessionInfo2 == null ? Collections.EMPTY_LIST : routingSessionInfo2.getSelectedRoutes();
        Iterator<String> it = selectedRoutes2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            y36Var = this.a;
            if (!zHasNext) {
                break;
            }
            String next = it.next();
            tvh0 tvh0Var = (tvh0) this.e.get();
            if ((tvh0Var != null ? (nvh0) tvh0Var.i.get(next) : (nvh0) y36Var.get(next)) == null) {
                nvh0 nvh0VarD = (nvh0) y36Var.get(next);
                if (nvh0VarD == null) {
                    uvh0 uvh0Var = this.k.b;
                    if (str == null) {
                        zvh0 zvh0Var = (zvh0) ((mv2) uvh0Var).c;
                        nvh0VarD = (zvh0Var != null ? zvh0Var.d : null).c(next);
                    } else {
                        zvh0 zvh0Var2 = (zvh0) ((mv2) uvh0Var).c;
                        nvh0VarD = (zvh0Var2 != null ? zvh0Var2.d : null).d(next, str);
                    }
                    if (nvh0VarD != null) {
                        y36Var.put(next, nvh0VarD);
                    }
                }
                if (nvh0VarD != null) {
                    nvh0VarD.f();
                }
            }
        }
        for (String str2 : selectedRoutes) {
            if (!selectedRoutes2.contains(str2) && (nvh0Var = (nvh0) y36Var.remove(str2)) != null) {
                nvh0Var.i(0);
                nvh0Var.e();
            }
        }
    }

    public final void b(gvh0 gvh0Var, Collection collection) {
        RoutingSessionInfo routingSessionInfo = this.h;
        if (routingSessionInfo == null) {
            return;
        }
        if (gvh0Var != null && !gvh0Var.a.getBoolean("enabled", true)) {
            this.k.onReleaseSession(0L, this.i);
            return;
        }
        RoutingSessionInfo.Builder builderB = k34.b(routingSessionInfo);
        if (gvh0Var != null) {
            this.j = gvh0Var.g();
            builderB.setName(gvh0Var.j()).setVolume(gvh0Var.k()).setVolumeMax(gvh0Var.m()).setVolumeHandling(gvh0Var.l());
            builderB.clearSelectedRoutes();
            if (gvh0Var.e().isEmpty()) {
                builderB.addSelectedRoute(this.j);
            } else {
                Iterator it = gvh0Var.e().iterator();
                while (it.hasNext()) {
                    builderB.addSelectedRoute((String) it.next());
                }
            }
            Bundle controlHints = routingSessionInfo.getControlHints();
            if (controlHints == null) {
                controlHints = new Bundle();
            }
            controlHints.putString("androidx.mediarouter.media.KEY_SESSION_NAME", gvh0Var.j());
            controlHints.putBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE", gvh0Var.a);
            builderB.setControlHints(controlHints);
        }
        this.h = builderB.build();
        if (collection != null && !collection.isEmpty()) {
            builderB.clearSelectedRoutes();
            builderB.clearSelectableRoutes();
            builderB.clearDeselectableRoutes();
            builderB.clearTransferableRoutes();
            d46 d46Var = new d46(0);
            Iterator it2 = collection.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                kvh0 kvh0Var = (kvh0) it2.next();
                String strG = kvh0Var.a.g();
                d46Var.add(strG);
                int i = kvh0Var.b;
                if (i == 2 || i == 3) {
                    builderB.addSelectedRoute(strG);
                    z = true;
                }
                if (kvh0Var.d) {
                    builderB.addSelectableRoute(strG);
                }
                if (kvh0Var.c) {
                    builderB.addDeselectableRoute(strG);
                }
                if (kvh0Var.e) {
                    builderB.addTransferableRoute(strG);
                }
            }
            if (z) {
                this.h = builderB.build();
            }
        }
        int i2 = fvh0.e;
        if ((this.d & 5) == 5 && gvh0Var != null) {
            String strG2 = gvh0Var.g();
            RoutingSessionInfo routingSessionInfo2 = this.h;
            ovh0 ovh0Var = ovh0.b;
            a(strG2, routingSessionInfo, routingSessionInfo2);
        }
        jqd0 jqd0Var = this.k.d;
        List list = jqd0Var != null ? (List) jqd0Var.d : Collections.EMPTY_LIST;
        d46 d46Var2 = new d46(0);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            d46Var2.add(((gvh0) it3.next()).g());
        }
        fvh0.b(d46Var2, this.h);
        boolean z2 = this.f;
        if (z2) {
            this.k.notifySessionUpdated(this.h);
        } else {
            if (z2) {
                return;
            }
            this.f = true;
            this.k.notifySessionCreated(this.c, this.h);
        }
    }
}
