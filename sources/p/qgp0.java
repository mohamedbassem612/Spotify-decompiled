package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qgp0 {
    public final vbe a;
    public final boolean b;
    public final h4p1 c;

    public qgp0(vbe vbeVar, boolean z, h4p1 h4p1Var) {
        this.a = vbeVar;
        this.b = z;
        this.c = h4p1Var;
    }

    public static qgp0 a(qgp0 qgp0Var, vbe vbeVar, boolean z, h4p1 h4p1Var, int i) {
        if ((i & 1) != 0) {
            vbeVar = qgp0Var.a;
        }
        if ((i & 2) != 0) {
            z = qgp0Var.b;
        }
        if ((i & 4) != 0) {
            h4p1Var = qgp0Var.c;
        }
        return new qgp0(vbeVar, z, h4p1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgp0)) {
            return false;
        }
        qgp0 qgp0Var = (qgp0) obj;
        return this.a.equals(qgp0Var.a) && this.b == qgp0Var.b && u890.j(this.c, qgp0Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        h4p1 h4p1Var = this.c;
        return iG + (h4p1Var == null ? 0 : h4p1Var.hashCode());
    }
}
