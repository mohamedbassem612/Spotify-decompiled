package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v910 {
    public final PlayerState a;

    public v910(PlayerState playerState) {
        this.a = playerState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v910) && u890.j(this.a, ((v910) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
