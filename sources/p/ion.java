package p;

import com.spotify.messages.BetamaxPlaybackSession;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ion implements sfs0 {
    public final BetamaxPlaybackSession a;
    public final int b;

    public ion(BetamaxPlaybackSession betamaxPlaybackSession, int i) {
        this.a = betamaxPlaybackSession;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ion)) {
            return false;
        }
        ion ionVar = (ion) obj;
        return this.a.equals(ionVar.a) && this.b == ionVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
