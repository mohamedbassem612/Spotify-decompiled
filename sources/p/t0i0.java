package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t0i0 {
    public final PlayerState a;
    public final Integer b;
    public final ktl c;
    public final pgl1 d;

    public t0i0(PlayerState playerState, Integer num, ktl ktlVar, pgl1 pgl1Var) {
        this.a = playerState;
        this.b = num;
        this.c = ktlVar;
        this.d = pgl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0i0)) {
            return false;
        }
        t0i0 t0i0Var = (t0i0) obj;
        return u890.j(this.a, t0i0Var.a) && u890.j(this.b, t0i0Var.b) && this.c == t0i0Var.c && u890.j(this.d, t0i0Var.d);
    }

    public final int hashCode() {
        PlayerState playerState = this.a;
        int iHashCode = (playerState == null ? 0 : playerState.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        ktl ktlVar = this.c;
        int iHashCode3 = (iHashCode2 + (ktlVar == null ? 0 : ktlVar.hashCode())) * 31;
        pgl1 pgl1Var = this.d;
        return iHashCode3 + (pgl1Var != null ? pgl1Var.hashCode() : 0);
    }
}
