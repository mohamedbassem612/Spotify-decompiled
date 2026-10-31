package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iv21 {
    public final vnr0 a;
    public final vnr0 b;
    public final vnr0 c;

    public iv21(vnr0 vnr0Var, vnr0 vnr0Var2, vnr0 vnr0Var3) {
        this.a = vnr0Var;
        this.b = vnr0Var2;
        this.c = vnr0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv21)) {
            return false;
        }
        iv21 iv21Var = (iv21) obj;
        return this.a.equals(iv21Var.a) && this.b.equals(iv21Var.b) && u890.j(this.c, iv21Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        vnr0 vnr0Var = this.c;
        return iHashCode + (vnr0Var == null ? 0 : vnr0Var.hashCode());
    }
}
