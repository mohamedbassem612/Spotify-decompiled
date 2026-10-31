package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class meu0 {
    public final PlayerState a;
    public final rp91 b;
    public final ktl c;
    public final boolean d;

    public meu0(PlayerState playerState, rp91 rp91Var, ktl ktlVar, boolean z) {
        this.a = playerState;
        this.b = rp91Var;
        this.c = ktlVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof meu0)) {
            return false;
        }
        meu0 meu0Var = (meu0) obj;
        return this.a.equals(meu0Var.a) && this.b == meu0Var.b && this.c == meu0Var.c && this.d == meu0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
