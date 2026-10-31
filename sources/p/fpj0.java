package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fpj0 implements hpj0 {
    public final Set a;
    public final Set b;

    public fpj0(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final Set a() {
        return this.a;
    }

    public final Set b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpj0)) {
            return false;
        }
        fpj0 fpj0Var = (fpj0) obj;
        return this.a.equals(fpj0Var.a) && this.b.equals(fpj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
