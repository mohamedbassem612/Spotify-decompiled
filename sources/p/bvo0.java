package p;

import com.spotify.yourupdates.domain.models.FetchMode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bvo0 extends smo1 {
    public final FetchMode c;
    public final cae0 d;

    public bvo0(FetchMode fetchMode, cae0 cae0Var) {
        this.c = fetchMode;
        this.d = cae0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvo0)) {
            return false;
        }
        bvo0 bvo0Var = (bvo0) obj;
        return this.c == bvo0Var.c && this.d.equals(bvo0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
