package p;

import android.media.MediaRouter2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wuh0 extends MediaRouter2.ControllerCallback {
    public final /* synthetic */ bvh0 a;

    public wuh0(bvh0 bvh0Var) {
        this.a = bvh0Var;
    }

    @Override // android.media.MediaRouter2.ControllerCallback
    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.m(routingController);
    }
}
