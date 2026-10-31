package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xz10 {
    public final String a;
    public final PlayerState b;
    public final sy00 c;

    public xz10(String str, PlayerState playerState, sy00 sy00Var) {
        this.a = str;
        this.b = playerState;
        this.c = sy00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz10)) {
            return false;
        }
        xz10 xz10Var = (xz10) obj;
        return this.a.equals(xz10Var.a) && this.b.equals(xz10Var.b) && this.c.equals(xz10Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
