package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vxz0 {
    public final String a;
    public final long b;
    public final uxz0 c;

    public vxz0(String str, long j, uxz0 uxz0Var) {
        this.a = str;
        this.b = j;
        this.c = uxz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxz0)) {
            return false;
        }
        vxz0 vxz0Var = (vxz0) obj;
        return this.a.equals(vxz0Var.a) && this.b == vxz0Var.b && this.c.equals(vxz0Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
