package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gxy0 {
    public final kxy0 a;
    public final exy0 b;

    public gxy0(kxy0 kxy0Var, exy0 exy0Var) {
        this.a = kxy0Var;
        this.b = exy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxy0)) {
            return false;
        }
        gxy0 gxy0Var = (gxy0) obj;
        return this.a == gxy0Var.a && u890.j(this.b, gxy0Var.b);
    }

    public final int hashCode() {
        kxy0 kxy0Var = this.a;
        return this.b.hashCode() + ((kxy0Var == null ? 0 : kxy0Var.hashCode()) * 31);
    }
}
