package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fi51 {
    public final vnr0 a;
    public final vnr0 b;

    public fi51(vnr0 vnr0Var, vnr0 vnr0Var2) {
        this.a = vnr0Var;
        this.b = vnr0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi51)) {
            return false;
        }
        fi51 fi51Var = (fi51) obj;
        return u890.j(this.a, fi51Var.a) && this.b.equals(fi51Var.b);
    }

    public final int hashCode() {
        vnr0 vnr0Var = this.a;
        return this.b.hashCode() + ((vnr0Var == null ? 0 : vnr0Var.hashCode()) * 31);
    }
}
