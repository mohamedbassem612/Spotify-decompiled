package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ig51 {
    public final String a;
    public final List b;
    public final vu30 c;

    public ig51(String str, smc0 smc0Var, vu30 vu30Var) {
        this.a = str;
        this.b = smc0Var;
        this.c = vu30Var;
    }

    public final vu30 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig51)) {
            return false;
        }
        ig51 ig51Var = (ig51) obj;
        return u890.j(this.a, ig51Var.a) && this.b.equals(ig51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
