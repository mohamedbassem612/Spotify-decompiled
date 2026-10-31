package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hvf1 {
    public final ContextTrack a;
    public final Integer b;
    public final int c;

    public hvf1(ContextTrack contextTrack, Integer num, int i) {
        this.a = contextTrack;
        this.b = num;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvf1)) {
            return false;
        }
        hvf1 hvf1Var = (hvf1) obj;
        return u890.j(this.a, hvf1Var.a) && u890.j(this.b, hvf1Var.b) && this.c == hvf1Var.c;
    }

    public final int hashCode() {
        ContextTrack contextTrack = this.a;
        int iHashCode = (contextTrack == null ? 0 : contextTrack.hashCode()) * 31;
        Integer num = this.b;
        return Integer.hashCode(this.c) + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }
}
