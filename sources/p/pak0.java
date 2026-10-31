package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pak0 {
    public final oak0 a;
    public final oak0 b;

    public pak0(oak0 oak0Var, oak0 oak0Var2) {
        this.a = oak0Var;
        this.b = oak0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pak0)) {
            return false;
        }
        pak0 pak0Var = (pak0) obj;
        return u890.j(this.a, pak0Var.a) && u890.j(this.b, pak0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
