package p;

import com.spotify.nowplayingmini.nowplayingmini.NowPlayingMiniMode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class osj0 {
    public final NowPlayingMiniMode a;
    public final int b;

    public osj0(NowPlayingMiniMode nowPlayingMiniMode, int i) {
        this.a = nowPlayingMiniMode;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osj0)) {
            return false;
        }
        osj0 osj0Var = (osj0) obj;
        return this.a.equals(osj0Var.a) && this.b == osj0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
