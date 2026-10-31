package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vvj0 {
    public final azb a;
    public final b8w0 b = b8w0.Unknown;

    public vvj0(azb azbVar) {
        this.a = azbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvj0)) {
            return false;
        }
        vvj0 vvj0Var = (vvj0) obj;
        return this.a.equals(vvj0Var.a) && this.b == vvj0Var.b;
    }

    public final int hashCode() {
        return xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 923521, 31, false), 29791, false), 31, false), 29791, false), 31, false), 961, false);
    }
}
