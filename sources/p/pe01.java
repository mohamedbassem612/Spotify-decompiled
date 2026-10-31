package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pe01 {
    public final boolean a;
    public final hc01 b;
    public final fd01 c;
    public final int d;

    public pe01(boolean z, hc01 hc01Var, fd01 fd01Var, int i) {
        this.a = z;
        this.b = hc01Var;
        this.c = fd01Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe01)) {
            return false;
        }
        pe01 pe01Var = (pe01) obj;
        return this.a == pe01Var.a && this.b == pe01Var.b && this.c == pe01Var.c && this.d == pe01Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31);
    }
}
