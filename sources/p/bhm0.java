package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bhm0 {
    public final y4o1 a;
    public final boolean b;
    public final String c;

    public bhm0(y4o1 y4o1Var, boolean z, String str) {
        this.a = y4o1Var;
        this.b = z;
        this.c = str;
    }

    public static bhm0 a(bhm0 bhm0Var, y4o1 y4o1Var, boolean z, int i) {
        if ((i & 1) != 0) {
            y4o1Var = bhm0Var.a;
        }
        if ((i & 2) != 0) {
            z = bhm0Var.b;
        }
        return new bhm0(y4o1Var, z, bhm0Var.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhm0)) {
            return false;
        }
        bhm0 bhm0Var = (bhm0) obj;
        return u890.j(this.a, bhm0Var.a) && this.b == bhm0Var.b && u890.j(this.c, bhm0Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
