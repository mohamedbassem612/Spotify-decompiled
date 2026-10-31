package p;

import com.spotify.player.model.command.PlayCommand;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xkm implements wmc {
    public final PlayCommand a;

    public xkm(PlayCommand playCommand) {
        this.a = playCommand;
    }

    public final PlayCommand a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xkm) && this.a.equals(((xkm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
