package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ngm {
    public final String a;
    public final PlayerState b;

    public ngm(PlayerState playerState, String str) {
        this.a = str;
        this.b = playerState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngm)) {
            return false;
        }
        ngm ngmVar = (ngm) obj;
        return this.a.equals(ngmVar.a) && u890.j(this.b, ngmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
