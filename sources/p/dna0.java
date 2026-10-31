package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dna0 {
    public final PlayerState a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public dna0(PlayerState playerState, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = playerState;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dna0)) {
            return false;
        }
        dna0 dna0Var = (dna0) obj;
        return this.a.equals(dna0Var.a) && this.b == dna0Var.b && this.c == dna0Var.c && this.d == dna0Var.d && this.e == dna0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
