package p;

import android.view.Surface;
import android.view.ViewGroup;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wsg {
    public final Surface a;
    public final int b;
    public final int c;
    public final ViewGroup d;

    public wsg(Surface surface, int i, int i2, VideoSurfaceView videoSurfaceView) {
        this.a = surface;
        this.b = i;
        this.c = i2;
        this.d = videoSurfaceView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsg)) {
            return false;
        }
        wsg wsgVar = (wsg) obj;
        return u890.j(this.a, wsgVar.a) && this.b == wsgVar.b && this.c == wsgVar.c && u890.j(this.d, wsgVar.d);
    }

    public final int hashCode() {
        Surface surface = this.a;
        int iF = kaa0.f(this.c, kaa0.f(this.b, (surface == null ? 0 : surface.hashCode()) * 31, 31), 31);
        ViewGroup viewGroup = this.d;
        return iF + (viewGroup != null ? viewGroup.hashCode() : 0);
    }
}
