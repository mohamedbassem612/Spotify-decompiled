package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rbw extends l0o1 {
    public final ContextTrack g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final qtf1 l;
    public final String m;

    public rbw(ContextTrack contextTrack, boolean z, boolean z2, boolean z3, boolean z4, qtf1 qtf1Var, String str) {
        this.g = contextTrack;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = qtf1Var;
        this.m = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbw)) {
            return false;
        }
        rbw rbwVar = (rbw) obj;
        return this.g.equals(rbwVar.g) && this.h == rbwVar.h && this.i == rbwVar.i && this.j == rbwVar.j && this.k == rbwVar.k && u890.j(this.l, rbwVar.l) && u890.j(this.m, rbwVar.m);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.g.hashCode() * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        qtf1 qtf1Var = this.l;
        int iHashCode = (iG + (qtf1Var == null ? 0 : qtf1Var.hashCode())) * 31;
        String str = this.m;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
