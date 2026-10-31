package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h8k0 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final i8k0 d;

    public h8k0(boolean z, boolean z2, String str, i8k0 i8k0Var) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = i8k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8k0)) {
            return false;
        }
        h8k0 h8k0Var = (h8k0) obj;
        return this.a == h8k0Var.a && this.b == h8k0Var.b && u890.j(this.c, h8k0Var.c) && u890.j(this.d, h8k0Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        i8k0 i8k0Var = this.d;
        return iHashCode + (i8k0Var != null ? i8k0Var.hashCode() : 0);
    }
}
