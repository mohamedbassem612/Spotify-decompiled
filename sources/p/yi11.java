package p;

import com.spotify.player.model.Restrictions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yi11 {
    public final String a;
    public final Restrictions b;
    public final fvf1 c;
    public final tig0 d;

    public yi11(String str, Restrictions restrictions, fvf1 fvf1Var, tig0 tig0Var) {
        this.a = str;
        this.b = restrictions;
        this.c = fvf1Var;
        this.d = tig0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi11)) {
            return false;
        }
        yi11 yi11Var = (yi11) obj;
        return this.a.equals(yi11Var.a) && this.b.equals(yi11Var.b) && this.c.equals(yi11Var.c) && this.d.equals(yi11Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
