package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z030 {
    public final String a;
    public final String b;
    public final boolean c;
    public final uf20 d;

    public z030(String str, String str2, boolean z, uf20 uf20Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = uf20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z030)) {
            return false;
        }
        z030 z030Var = (z030) obj;
        return u890.j(this.a, z030Var.a) && u890.j(this.b, z030Var.b) && this.c == z030Var.c && this.d.equals(z030Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.d.hashCode() + xcg1.g((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c);
    }
}
