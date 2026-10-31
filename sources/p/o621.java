package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o621 {
    public final ContextTrack a;
    public final Boolean b;
    public final kl3 c;
    public final boolean d;

    public o621(ContextTrack contextTrack, Boolean bool, kl3 kl3Var, boolean z) {
        this.a = contextTrack;
        this.b = bool;
        this.c = kl3Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o621)) {
            return false;
        }
        o621 o621Var = (o621) obj;
        return this.a.equals(o621Var.a) && u890.j(this.b, o621Var.b) && this.c.equals(o621Var.c) && this.d == o621Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31);
    }
}
