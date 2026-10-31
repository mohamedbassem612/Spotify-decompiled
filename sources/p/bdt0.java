package p;

import android.media.MediaRouter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bdt0 extends nvh0 {
    public final MediaRouter.RouteInfo a;

    public bdt0(MediaRouter.RouteInfo routeInfo) {
        this.a = routeInfo;
    }

    @Override // p.nvh0
    public final void g(int i) {
        this.a.requestSetVolume(i);
    }

    @Override // p.nvh0
    public final void j(int i) {
        this.a.requestUpdateVolume(i);
    }
}
