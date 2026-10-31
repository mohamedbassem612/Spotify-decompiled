package p;

import com.spotify.yourupdates.domain.models.FetchMode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cvo0 extends smo1 {
    public final FetchMode c;
    public final wro0 d;

    public cvo0(FetchMode fetchMode, wro0 wro0Var) {
        this.c = fetchMode;
        this.d = wro0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvo0)) {
            return false;
        }
        cvo0 cvo0Var = (cvo0) obj;
        return this.c == cvo0Var.c && this.d.equals(cvo0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
