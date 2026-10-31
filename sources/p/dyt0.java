package p;

import com.spotify.player.model.PlayerError;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dyt0 implements fyt0 {
    public final PlayerError a;

    public dyt0(PlayerError playerError) {
        this.a = playerError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dyt0) && this.a.equals(((dyt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
