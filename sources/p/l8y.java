package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l8y {
    public final oq70 a;
    public final boolean b;
    public final int c;
    public final String d;

    public l8y(oq70 oq70Var, boolean z, int i, String str) {
        this.a = oq70Var;
        this.b = z;
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8y)) {
            return false;
        }
        l8y l8yVar = (l8y) obj;
        return u890.j(this.a, l8yVar.a) && this.b == l8yVar.b && this.c == l8yVar.c && u890.j(this.d, l8yVar.d);
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return iK + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExecuteResult(image=");
        sb.append(this.a);
        sb.append(", isSampled=");
        sb.append(this.b);
        sb.append(", dataSource=");
        sb.append(eqq.y(this.c));
        sb.append(", diskCacheKey=");
        return gvg.k(sb, this.d, ')');
    }
}
