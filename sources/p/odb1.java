package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class odb1 {
    public final boolean a;
    public final boolean b;
    public final h2v c;
    public final c380 d;

    public odb1(boolean z, boolean z2, h2v h2vVar, c380 c380Var) {
        this.a = z;
        this.b = z2;
        this.c = h2vVar;
        this.d = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odb1)) {
            return false;
        }
        odb1 odb1Var = (odb1) obj;
        return this.a == odb1Var.a && this.b == odb1Var.b && u890.j(this.c, odb1Var.c) && u890.j(this.d, odb1Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        h2v h2vVar = this.c;
        return this.d.hashCode() + ((iG + (h2vVar == null ? 0 : h2vVar.hashCode())) * 31);
    }
}
