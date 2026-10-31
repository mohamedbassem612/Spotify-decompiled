package p;

import android.media.MediaRouter2;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zuh0 extends MediaRouter2.RouteCallback {
    public final /* synthetic */ bvh0 a;

    public zuh0(bvh0 bvh0Var) {
        this.a = bvh0Var;
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public final void onRoutesAdded(List list) {
        this.a.l();
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public final void onRoutesChanged(List list) {
        this.a.l();
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public final void onRoutesRemoved(List list) {
        this.a.l();
    }
}
