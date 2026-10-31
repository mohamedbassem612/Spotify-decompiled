package p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s7j1 implements z7j1 {
    public final boolean a;
    public final VideoSurfaceView b;

    public s7j1(VideoSurfaceView videoSurfaceView, boolean z) {
        this.a = z;
        this.b = videoSurfaceView;
    }

    public final boolean a() {
        return this.a;
    }

    public final VideoSurfaceView b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7j1)) {
            return false;
        }
        s7j1 s7j1Var = (s7j1) obj;
        return this.a == s7j1Var.a && this.b.equals(s7j1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
