package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class eyt0 implements fyt0 {
    public final PlayerState a;

    public eyt0(PlayerState playerState) {
        this.a = playerState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eyt0) && this.a.equals(((eyt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
