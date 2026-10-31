package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tdb1 {
    public final boolean a;
    public final int b;
    public final fbp1 c;
    public final c380 d;

    public tdb1(boolean z, int i, fbp1 fbp1Var, c380 c380Var) {
        this.a = z;
        this.b = i;
        this.c = fbp1Var;
        this.d = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdb1)) {
            return false;
        }
        tdb1 tdb1Var = (tdb1) obj;
        return this.a == tdb1Var.a && this.b == tdb1Var.b && u890.j(this.c, tdb1Var.c) && u890.j(this.d, tdb1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ab80.k(this.b, Boolean.hashCode(this.a) * 31, 31)) * 31);
    }
}
