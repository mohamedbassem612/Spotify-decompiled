package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jp01 {
    public final Set a;
    public final Set b;

    static {
        f46.S0(gp01.values());
    }

    public jp01(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public static final ip01 a(gp01... gp01VarArr) {
        return new ip01(hp01.a, f46.S0(gp01VarArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp01)) {
            return false;
        }
        jp01 jp01Var = (jp01) obj;
        return this.a.equals(jp01Var.a) && this.b.equals(jp01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + gvg.c(Integer.hashCode(15) * 31, 31, this.a);
    }
}
