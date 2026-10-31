package p;

import android.media.MediaRouter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uwh0 extends MediaRouter.VolumeCallback {
    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        ddt0 ddt0VarN = adt0.n(routeInfo);
        if (ddt0VarN != null) {
            ddt0VarN.a.i(i);
        }
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        ddt0 ddt0VarN = adt0.n(routeInfo);
        if (ddt0VarN != null) {
            ddt0VarN.a.j(i);
        }
    }
}
