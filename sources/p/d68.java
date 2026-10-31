package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d68 {
    public final PlayerState a;
    public final ktl b;
    public final ne2 c;
    public final boolean d;

    public d68(PlayerState playerState, ktl ktlVar, ne2 ne2Var, boolean z) {
        this.a = playerState;
        this.b = ktlVar;
        this.c = ne2Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d68)) {
            return false;
        }
        d68 d68Var = (d68) obj;
        return this.a.equals(d68Var.a) && this.b == d68Var.b && this.c.equals(d68Var.c) && this.d == d68Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
