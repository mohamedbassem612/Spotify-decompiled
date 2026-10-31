package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vga1 {
    public final uga1 a;
    public final sga1 b;
    public final boolean c;
    public final cga1 d;

    public /* synthetic */ vga1(uga1 uga1Var, sga1 sga1Var, boolean z, cga1 cga1Var, int i) {
        this((i & 1) != 0 ? b4x0.P0 : uga1Var, (i & 2) != 0 ? r3x0.Q0 : sga1Var, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : cga1Var);
    }

    public static vga1 a(vga1 vga1Var, boolean z) {
        return new vga1(vga1Var.a, vga1Var.b, z, vga1Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vga1)) {
            return false;
        }
        vga1 vga1Var = (vga1) obj;
        return u890.j(this.a, vga1Var.a) && u890.j(this.b, vga1Var.b) && this.c == vga1Var.c && u890.j(this.d, vga1Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        cga1 cga1Var = this.d;
        return iG + (cga1Var == null ? 0 : cga1Var.hashCode());
    }

    public vga1(uga1 uga1Var, sga1 sga1Var, boolean z, cga1 cga1Var) {
        this.a = uga1Var;
        this.b = sga1Var;
        this.c = z;
        this.d = cga1Var;
    }
}
