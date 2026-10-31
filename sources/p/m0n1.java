package p;

import com.spotify.yourupdates.domain.models.FetchMode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m0n1 extends ern1 {
    public final FetchMode c;
    public final lvo0 d;

    public m0n1(FetchMode fetchMode, lvo0 lvo0Var) {
        this.c = fetchMode;
        this.d = lvo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0n1)) {
            return false;
        }
        m0n1 m0n1Var = (m0n1) obj;
        return this.c == m0n1Var.c && this.d.equals(m0n1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
