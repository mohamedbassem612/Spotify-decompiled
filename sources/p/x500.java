package p;

import android.view.View;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x500 extends d1o1 {
    public final VideoSurfaceView e;
    public final View f;

    public x500(VideoSurfaceView videoSurfaceView, View view) {
        this.e = videoSurfaceView;
        this.f = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x500)) {
            return false;
        }
        x500 x500Var = (x500) obj;
        return u890.j(this.e, x500Var.e) && u890.j(this.f, x500Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.e.hashCode() * 31;
        View view = this.f;
        return iHashCode + (view == null ? 0 : view.hashCode());
    }
}
