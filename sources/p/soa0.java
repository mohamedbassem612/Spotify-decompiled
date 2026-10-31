package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class soa0 {
    public final ny7 a;
    public final Object b;

    public soa0(ny7 ny7Var, Object obj) {
        this.a = ny7Var;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof soa0)) {
            return false;
        }
        soa0 soa0Var = (soa0) obj;
        return this.a.equals(soa0Var.a) && this.b.equals(soa0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
