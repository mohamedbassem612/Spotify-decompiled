package p;

import com.spotify.player.model.Restrictions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xl51 {
    public final String a;
    public final Restrictions b;
    public final xp91 c;
    public final fvf1 d;

    public xl51(String str, Restrictions restrictions, xp91 xp91Var, fvf1 fvf1Var) {
        this.a = str;
        this.b = restrictions;
        this.c = xp91Var;
        this.d = fvf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl51)) {
            return false;
        }
        xl51 xl51Var = (xl51) obj;
        return this.a.equals(xl51Var.a) && this.b.equals(xl51Var.b) && this.c.equals(xl51Var.c) && this.d.equals(xl51Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
