package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tsc1 implements iz70 {
    public final oq70 a;
    public final zy70 b;
    public final int c;
    public final bsi0 d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public tsc1(oq70 oq70Var, zy70 zy70Var, int i, bsi0 bsi0Var, String str, boolean z, boolean z2) {
        this.a = oq70Var;
        this.b = zy70Var;
        this.c = i;
        this.d = bsi0Var;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // p.iz70
    public final oq70 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsc1)) {
            return false;
        }
        tsc1 tsc1Var = (tsc1) obj;
        return u890.j(this.a, tsc1Var.a) && u890.j(this.b, tsc1Var.b) && this.c == tsc1Var.c && u890.j(this.d, tsc1Var.d) && u890.j(this.e, tsc1Var.e) && this.f == tsc1Var.f && this.g == tsc1Var.g;
    }

    @Override // p.iz70
    public final zy70 getRequest() {
        return this.b;
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        bsi0 bsi0Var = this.d;
        int iHashCode = (iK + (bsi0Var == null ? 0 : bsi0Var.hashCode())) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + xcg1.g((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.a);
        sb.append(", request=");
        sb.append(this.b);
        sb.append(", dataSource=");
        sb.append(eqq.y(this.c));
        sb.append(", memoryCacheKey=");
        sb.append(this.d);
        sb.append(", diskCacheKey=");
        sb.append(this.e);
        sb.append(", isSampled=");
        sb.append(this.f);
        sb.append(", isPlaceholderCached=");
        return f4i1.g(sb, this.g, ')');
    }
}
