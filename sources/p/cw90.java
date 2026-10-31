package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cw90 {
    public final int a;
    public final List b;

    public cw90(int i, smc0 smc0Var) {
        this.a = i;
        this.b = smc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw90)) {
            return false;
        }
        cw90 cw90Var = (cw90) obj;
        return this.a == cw90Var.a && this.b.equals(cw90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
