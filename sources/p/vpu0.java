package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vpu0 {
    public final int a;
    public final iqi0 b;
    public final String c;
    public final boolean d;
    public final wls0 e;
    public final boolean f;

    public vpu0(int i, iqi0 iqi0Var, String str, boolean z, wls0 wls0Var, boolean z2) {
        this.a = i;
        this.b = iqi0Var;
        this.c = str;
        this.d = z;
        this.e = wls0Var;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpu0)) {
            return false;
        }
        vpu0 vpu0Var = (vpu0) obj;
        return this.a == vpu0Var.a && this.b.equals(vpu0Var.b) && u890.j(this.c, vpu0Var.c) && this.d == vpu0Var.d && this.e == vpu0Var.e && this.f == vpu0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + xcg1.g(cy30.d((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d)) * 31);
    }
}
