package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bu3 {
    public final int a;
    public final h951 b;

    public bu3(int i, h951 h951Var) {
        this.a = i;
        this.b = h951Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu3)) {
            return false;
        }
        bu3 bu3Var = (bu3) obj;
        return this.a == bu3Var.a && u890.j(this.b, bu3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
