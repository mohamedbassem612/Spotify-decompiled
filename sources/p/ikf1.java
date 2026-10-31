package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ikf1 {
    public final ContextTrack a;
    public final ContextTrack b;
    public final ContextTrack c;

    public ikf1(ContextTrack contextTrack, ContextTrack contextTrack2, ContextTrack contextTrack3) {
        this.a = contextTrack;
        this.b = contextTrack2;
        this.c = contextTrack3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikf1)) {
            return false;
        }
        ikf1 ikf1Var = (ikf1) obj;
        return u890.j(this.a, ikf1Var.a) && u890.j(this.b, ikf1Var.b) && u890.j(this.c, ikf1Var.c);
    }

    public final int hashCode() {
        ContextTrack contextTrack = this.a;
        int iHashCode = (contextTrack == null ? 0 : contextTrack.hashCode()) * 31;
        ContextTrack contextTrack2 = this.b;
        int iHashCode2 = (iHashCode + (contextTrack2 == null ? 0 : contextTrack2.hashCode())) * 31;
        ContextTrack contextTrack3 = this.c;
        return iHashCode2 + (contextTrack3 != null ? contextTrack3.hashCode() : 0);
    }
}
