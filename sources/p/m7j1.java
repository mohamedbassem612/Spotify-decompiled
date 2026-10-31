package p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m7j1 implements o7j1 {
    public final VideoSurfaceView a;
    public final boolean b;

    public m7j1(VideoSurfaceView videoSurfaceView, boolean z) {
        this.a = videoSurfaceView;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7j1)) {
            return false;
        }
        m7j1 m7j1Var = (m7j1) obj;
        return u890.j(this.a, m7j1Var.a) && this.b == m7j1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
