package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.Restrictions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cpt0 {
    public final boolean a;
    public final ContextTrack b;
    public final boolean c;
    public final Restrictions d;

    public cpt0(boolean z, ContextTrack contextTrack, boolean z2, Restrictions restrictions) {
        this.a = z;
        this.b = contextTrack;
        this.c = z2;
        this.d = restrictions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpt0)) {
            return false;
        }
        cpt0 cpt0Var = (cpt0) obj;
        return this.a == cpt0Var.a && this.b.equals(cpt0Var.b) && this.c == cpt0Var.c && this.d.equals(cpt0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c);
    }
}
