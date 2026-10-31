package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zhd0 {
    public final xhd0 a;
    public final xhd0 b;
    public final xhd0 c;
    public final float d;
    public final iec e;

    public zhd0(xhd0 xhd0Var, xhd0 xhd0Var2, xhd0 xhd0Var3, float f, iec iecVar) {
        this.a = xhd0Var;
        this.b = xhd0Var2;
        this.c = xhd0Var3;
        this.d = f;
        this.e = iecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zhd0) {
            zhd0 zhd0Var = (zhd0) obj;
            if (this.a == zhd0Var.a && this.b == zhd0Var.b && this.c == zhd0Var.c && Float.compare(this.d, zhd0Var.d) == 0 && u890.j(this.e, zhd0Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + x0d.f((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
