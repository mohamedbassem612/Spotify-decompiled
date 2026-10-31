package p;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Build;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class avh0 extends MediaRouter2.TransferCallback {
    public final /* synthetic */ bvh0 a;

    public avh0(bvh0 bvh0Var) {
        this.a = bvh0Var;
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onStop(MediaRouter2.RoutingController routingController) {
        bvh0 bvh0Var = this.a;
        bvh0Var.S0 = null;
        nvh0 nvh0Var = (nvh0) bvh0Var.X.remove(routingController);
        if (nvh0Var != null) {
            bvh0Var.t.m(nvh0Var);
        } else {
            Objects.toString(routingController);
        }
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        int iB;
        int i = Build.VERSION.SDK_INT;
        bvh0 bvh0Var = this.a;
        if (i >= 35) {
            iB = v5w.b(routingController2);
        } else {
            iB = bvh0Var.S0 != null ? 1 : 2;
        }
        bvh0Var.S0 = null;
        bvh0Var.X.remove(routingController);
        if (routingController2 == bvh0Var.i.getSystemController()) {
            bvh0Var.t.n(iB);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            return;
        }
        String id = swg0.f(selectedRoutes.get(0)).getId();
        bvh0Var.X.put(routingController2, new xuh0(bvh0Var, routingController2, id));
        bvh0Var.t.o(iB, id);
        bvh0Var.m(routingController2);
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        this.a.S0 = null;
        Objects.toString(mediaRoute2Info);
    }
}
