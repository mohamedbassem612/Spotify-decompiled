package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vbb1 {
    public final boolean a;
    public final boolean b;
    public final nl61 c;

    public vbb1(boolean z, boolean z2, nl61 nl61Var) {
        this.a = z;
        this.b = z2;
        this.c = nl61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbb1)) {
            return false;
        }
        vbb1 vbb1Var = (vbb1) obj;
        return this.a == vbb1Var.a && this.b == vbb1Var.b && u890.j(this.c, vbb1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
