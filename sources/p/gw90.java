package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gw90 {
    public final int a;
    public final List b;

    public gw90(int i, smc0 smc0Var) {
        this.a = i;
        this.b = smc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw90)) {
            return false;
        }
        gw90 gw90Var = (gw90) obj;
        return this.a == gw90Var.a && this.b.equals(gw90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
