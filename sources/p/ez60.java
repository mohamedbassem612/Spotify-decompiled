package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ez60 implements oz60 {
    public final fq0 a;
    public final Set b;

    public ez60(fq0 fq0Var, Set set) {
        this.a = fq0Var;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez60)) {
            return false;
        }
        ez60 ez60Var = (ez60) obj;
        return this.a.equals(ez60Var.a) && this.b.equals(ez60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
