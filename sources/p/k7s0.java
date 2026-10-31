package p;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k7s0 implements yue1 {
    public final d761 a;
    public final List b;

    public k7s0(d761 d761Var, List list) {
        this.a = d761Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7s0)) {
            return false;
        }
        k7s0 k7s0Var = (k7s0) obj;
        return this.a.equals(k7s0Var.a) && this.b.equals(k7s0Var.b);
    }

    public final String getId() {
        return "past-periods";
    }

    public final int hashCode() {
        return this.b.hashCode() + (Arrays.hashCode(this.a.a) * 31);
    }
}
