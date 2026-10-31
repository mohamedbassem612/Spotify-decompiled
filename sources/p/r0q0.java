package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r0q0 {
    public final String a;
    public final boolean b;
    public final t0q0 c;
    public final ibk0 d;

    public r0q0(String str, boolean z, t0q0 t0q0Var, ibk0 ibk0Var) {
        this.a = str;
        this.b = z;
        this.c = t0q0Var;
        this.d = ibk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0q0)) {
            return false;
        }
        r0q0 r0q0Var = (r0q0) obj;
        return u890.j(this.a, r0q0Var.a) && this.b == r0q0Var.b && this.c.equals(r0q0Var.c) && this.d.equals(r0q0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31);
    }
}
