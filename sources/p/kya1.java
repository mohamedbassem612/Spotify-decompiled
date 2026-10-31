package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kya1 {
    public final nxq0 a;
    public final nxq0 b;

    public kya1(nxq0 nxq0Var, nxq0 nxq0Var2) {
        this.a = nxq0Var;
        this.b = nxq0Var2;
    }

    public final iac0 a() {
        return this.b;
    }

    public final iac0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kya1)) {
            return false;
        }
        kya1 kya1Var = (kya1) obj;
        return this.a == kya1Var.a && this.b == kya1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
