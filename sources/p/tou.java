package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tou implements uou {
    public final PlayerState a;

    public tou(PlayerState playerState) {
        this.a = playerState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tou) && this.a.equals(((tou) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
