package p;

import com.spotify.player.model.Restrictions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d791 {
    public final fvf1 a;
    public final Restrictions b;
    public final String c;

    public d791(fvf1 fvf1Var, Restrictions restrictions, String str) {
        this.a = fvf1Var;
        this.b = restrictions;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d791)) {
            return false;
        }
        d791 d791Var = (d791) obj;
        return this.a.equals(d791Var.a) && this.b.equals(d791Var.b) && u890.j(this.c, d791Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
