package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dxp0 {
    public final boolean a;
    public final boolean b;
    public final int c;

    public dxp0(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxp0)) {
            return false;
        }
        dxp0 dxp0Var = (dxp0) obj;
        return this.a == dxp0Var.a && this.b == dxp0Var.b && this.c == dxp0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
