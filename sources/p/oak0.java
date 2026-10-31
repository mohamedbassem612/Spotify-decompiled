package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oak0 {
    public final jo70 a;
    public final xkk1 b;

    public oak0(jo70 jo70Var, xkk1 xkk1Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oak0)) {
            return false;
        }
        oak0 oak0Var = (oak0) obj;
        return this.a.equals(oak0Var.a) && this.b.equals(oak0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
