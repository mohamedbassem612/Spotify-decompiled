package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q0q0 {
    public final String a;
    public final String b;
    public final y4m c;
    public final r840 d;
    public final ast0 e;
    public final j82 f;
    public final i0q0 g;
    public final boolean h;
    public final boolean i;

    public q0q0(String str, String str2, y4m y4mVar, r840 r840Var, ast0 ast0Var, j82 j82Var, i0q0 i0q0Var, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = y4mVar;
        this.d = r840Var;
        this.e = ast0Var;
        this.f = j82Var;
        this.g = i0q0Var;
        this.h = z;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0q0)) {
            return false;
        }
        q0q0 q0q0Var = (q0q0) obj;
        return u890.j(this.a, q0q0Var.a) && u890.j(this.b, q0q0Var.b) && this.c.equals(q0q0Var.c) && this.d.equals(q0q0Var.d) && this.e == q0q0Var.e && u890.j(this.f, q0q0Var.f) && this.g.equals(q0q0Var.g) && this.h == q0q0Var.h && this.i == q0q0Var.i;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.i) + xcg1.g((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.h);
    }
}
