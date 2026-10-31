package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q37 {
    public final c47 a;
    public final c47 b;
    public final c47 c;
    public final c47 d;
    public final c47 e;
    public final c47 f;

    public q37(c47 c47Var, c47 c47Var2, c47 c47Var3, c47 c47Var4, c47 c47Var5, c47 c47Var6) {
        this.a = c47Var;
        this.b = c47Var2;
        this.c = c47Var3;
        this.d = c47Var4;
        this.e = c47Var5;
        this.f = c47Var6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q37)) {
            return false;
        }
        q37 q37Var = (q37) obj;
        return u890.j(this.a, q37Var.a) && u890.j(this.b, q37Var.b) && u890.j(this.c, q37Var.c) && u890.j(this.d, q37Var.d) && u890.j(this.e, q37Var.e) && u890.j(this.f, q37Var.f);
    }

    public final int hashCode() {
        c47 c47Var = this.a;
        int iHashCode = (c47Var == null ? 0 : c47Var.hashCode()) * 31;
        c47 c47Var2 = this.b;
        int iHashCode2 = (iHashCode + (c47Var2 == null ? 0 : c47Var2.hashCode())) * 31;
        c47 c47Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (c47Var3 == null ? 0 : c47Var3.hashCode())) * 31;
        c47 c47Var4 = this.d;
        int iHashCode4 = (iHashCode3 + (c47Var4 == null ? 0 : c47Var4.hashCode())) * 31;
        c47 c47Var5 = this.e;
        int iHashCode5 = (iHashCode4 + (c47Var5 == null ? 0 : c47Var5.hashCode())) * 31;
        c47 c47Var6 = this.f;
        return iHashCode5 + (c47Var6 != null ? c47Var6.hashCode() : 0);
    }
}
