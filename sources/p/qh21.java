package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qh21 {
    public final boolean a;
    public final boolean b;
    public final ph21 c;

    public qh21(boolean z, boolean z2, ph21 ph21Var) {
        this.a = z;
        this.b = z2;
        this.c = ph21Var;
    }

    public static qh21 a(qh21 qh21Var, boolean z, boolean z2, ph21 ph21Var, int i) {
        if ((i & 1) != 0) {
            z = qh21Var.a;
        }
        if ((i & 2) != 0) {
            z2 = qh21Var.b;
        }
        if ((i & 4) != 0) {
            ph21Var = qh21Var.c;
        }
        qh21Var.getClass();
        return new qh21(z, z2, ph21Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh21)) {
            return false;
        }
        qh21 qh21Var = (qh21) obj;
        return this.a == qh21Var.a && this.b == qh21Var.b && u890.j(this.c, qh21Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        ph21 ph21Var = this.c;
        return iG + (ph21Var == null ? 0 : ph21Var.hashCode());
    }
}
