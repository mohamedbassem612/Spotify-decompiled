package p;

import android.media.MediaRouter;
import android.view.Display;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class twh0 extends MediaRouter.Callback {
    public final adt0 a;

    public twh0(adt0 adt0Var) {
        this.a = adt0Var;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        adt0 adt0Var = this.a;
        if (adt0Var.i(routeInfo)) {
            adt0Var.r();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        adt0 adt0Var;
        int iJ;
        if (adt0.n(routeInfo) != null || (iJ = (adt0Var = this.a).j(routeInfo)) < 0) {
            return;
        }
        adt0Var.s((cdt0) adt0Var.Q0.get(iJ));
        adt0Var.r();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        adt0 adt0Var = this.a;
        int iJ = adt0Var.j(routeInfo);
        if (iJ >= 0) {
            cdt0 cdt0Var = (cdt0) adt0Var.Q0.get(iJ);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != cdt0Var.c.a.getInt("presentationDisplayId", -1)) {
                wmy wmyVar = new wmy(cdt0Var.c);
                wmyVar.D(displayId);
                cdt0Var.c = wmyVar.h();
                adt0Var.r();
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        adt0 adt0Var;
        int iJ;
        if (adt0.n(routeInfo) != null || (iJ = (adt0Var = this.a).j(routeInfo)) < 0) {
            return;
        }
        adt0Var.Q0.remove(iJ);
        adt0Var.r();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        lwh0 lwh0Var;
        adt0 adt0Var = this.a;
        if (routeInfo != adt0Var.t.getSelectedRoute(8388611)) {
            return;
        }
        ddt0 ddt0VarN = adt0.n(routeInfo);
        if (ddt0VarN != null) {
            ddt0VarN.a.k(false);
            return;
        }
        int iJ = adt0Var.j(routeInfo);
        if (iJ >= 0) {
            cdt0 cdt0Var = (cdt0) adt0Var.Q0.get(iJ);
            kv40 kv40Var = adt0Var.i;
            String str = cdt0Var.b;
            kv40Var.a.removeMessages(262);
            kwh0 kwh0VarD = kv40Var.d(kv40Var.s);
            if (kwh0VarD != null) {
                Iterator it = kwh0VarD.b.iterator();
                do {
                    if (!it.hasNext()) {
                        lwh0Var = null;
                        break;
                    }
                    lwh0Var = (lwh0) it.next();
                } while (!lwh0Var.b.equals(str));
                if (lwh0Var != null) {
                    kv40Var.k(lwh0Var, 3, 2, false);
                }
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        adt0 adt0Var;
        int iJ;
        if (adt0.n(routeInfo) != null || (iJ = (adt0Var = this.a).j(routeInfo)) < 0) {
            return;
        }
        cdt0 cdt0Var = (cdt0) adt0Var.Q0.get(iJ);
        int volume = routeInfo.getVolume();
        if (volume != cdt0Var.c.k()) {
            wmy wmyVar = new wmy(cdt0Var.c);
            wmyVar.F(volume);
            cdt0Var.c = wmyVar.h();
            adt0Var.r();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
    }
}
