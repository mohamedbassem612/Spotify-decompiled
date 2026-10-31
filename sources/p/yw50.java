package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yw50 {
    public final bx50 a;
    public final vu30 b;
    public final vu30 c;
    public final vu30 d;
    public final vu30 e;
    public final vu30 f;

    public /* synthetic */ yw50(bx50 bx50Var, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, vu30 vu30Var4, vu30 vu30Var5, int i) {
        this((i & 1) != 0 ? new zw50(false) : bx50Var, vu30Var, vu30Var2, (i & 8) != 0 ? null : vu30Var3, (i & 16) != 0 ? null : vu30Var4, (i & 32) != 0 ? null : vu30Var5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw50)) {
            return false;
        }
        yw50 yw50Var = (yw50) obj;
        return u890.j(this.a, yw50Var.a) && u890.j(this.b, yw50Var.b) && u890.j(this.c, yw50Var.c) && u890.j(this.d, yw50Var.d) && u890.j(this.e, yw50Var.e) && u890.j(this.f, yw50Var.f);
    }

    public final int hashCode() {
        int iG = hrt.g(this.a.hashCode() * 31, 31, this.b);
        vu30 vu30Var = this.c;
        int iHashCode = (iG + (vu30Var == null ? 0 : vu30Var.hashCode())) * 31;
        vu30 vu30Var2 = this.d;
        int iHashCode2 = (iHashCode + (vu30Var2 == null ? 0 : vu30Var2.hashCode())) * 31;
        vu30 vu30Var3 = this.e;
        int iHashCode3 = (iHashCode2 + (vu30Var3 == null ? 0 : vu30Var3.hashCode())) * 31;
        vu30 vu30Var4 = this.f;
        return iHashCode3 + (vu30Var4 != null ? vu30Var4.hashCode() : 0);
    }

    public yw50(bx50 bx50Var, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, vu30 vu30Var4, vu30 vu30Var5) {
        this.a = bx50Var;
        this.b = vu30Var;
        this.c = vu30Var2;
        this.d = vu30Var3;
        this.e = vu30Var4;
        this.f = vu30Var5;
    }
}
