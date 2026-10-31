package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uyg0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final gzg0 e;

    public uyg0(String str, String str2, boolean z, boolean z2, gzg0 gzg0Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = gzg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyg0)) {
            return false;
        }
        uyg0 uyg0Var = (uyg0) obj;
        return this.a.equals(uyg0Var.a) && u890.j(this.b, uyg0Var.b) && this.c == uyg0Var.c && this.d == uyg0Var.d && u890.j(this.e, uyg0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g(xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        gzg0 gzg0Var = this.e;
        return iG + (gzg0Var != null ? gzg0Var.hashCode() : 0);
    }
}
