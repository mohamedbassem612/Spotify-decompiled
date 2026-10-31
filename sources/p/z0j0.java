package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z0j0 implements a2j0 {
    public final String a;
    public final w4i1 b;
    public final tol c;

    public z0j0(String str, w4i1 w4i1Var, tol tolVar) {
        this.a = str;
        this.b = w4i1Var;
        this.c = tolVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0j0)) {
            return false;
        }
        z0j0 z0j0Var = (z0j0) obj;
        return u890.j(this.a, z0j0Var.a) && u890.j(this.b, z0j0Var.b) && u890.j(this.c, z0j0Var.c);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ydh.d(this.b, this.a.hashCode() * 31, 31);
    }
}
