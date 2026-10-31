package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vgm0 implements ohm0 {
    public final c380 a;
    public final iu30 b;
    public final int c;

    public vgm0(int i, iu30 iu30Var, c380 c380Var) {
        this.a = c380Var;
        this.b = iu30Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgm0)) {
            return false;
        }
        vgm0 vgm0Var = (vgm0) obj;
        return u890.j(this.a, vgm0Var.a) && this.b.equals(vgm0Var.b) && this.c == vgm0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + ktd.g(this.b, kaa0.f(3, this.a.hashCode() * 31, 31), 31);
    }
}
