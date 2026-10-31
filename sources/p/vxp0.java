package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vxp0 {
    public static final vxp0 d = new vxp0(0, 0, false);
    public final int a;
    public final int b;
    public final boolean c;

    public vxp0(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxp0)) {
            return false;
        }
        vxp0 vxp0Var = (vxp0) obj;
        return this.a == vxp0Var.a && this.b == vxp0Var.b && this.c == vxp0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
