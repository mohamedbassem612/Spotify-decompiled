package p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t7j1 implements z7j1 {
    public final VideoSurfaceView a;

    public t7j1(VideoSurfaceView videoSurfaceView) {
        this.a = videoSurfaceView;
    }

    public final VideoSurfaceView a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7j1) && this.a.equals(((t7j1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
