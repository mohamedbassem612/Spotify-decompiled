package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h000 implements k700 {
    public final f3b1 a;
    public final f3b1 b;

    public h000(f3b1 f3b1Var, f3b1 f3b1Var2) {
        this.a = f3b1Var;
        this.b = f3b1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h000)) {
            return false;
        }
        h000 h000Var = (h000) obj;
        return u890.j(this.a, h000Var.a) && this.b.equals(h000Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
