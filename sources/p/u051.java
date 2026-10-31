package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u051 implements r151 {
    public final int a;
    public final h951 b;

    public u051(int i, h951 h951Var) {
        this.a = i;
        this.b = h951Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u051)) {
            return false;
        }
        u051 u051Var = (u051) obj;
        return this.a == u051Var.a && this.b.equals(u051Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
