package p;

import com.spotify.martini.martinidata.model.Mode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lq10 {
    public final String a;
    public final Mode b;

    public lq10(String str, Mode mode) {
        this.a = str;
        this.b = mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq10)) {
            return false;
        }
        lq10 lq10Var = (lq10) obj;
        return u890.j(this.a, lq10Var.a) && this.b == lq10Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
