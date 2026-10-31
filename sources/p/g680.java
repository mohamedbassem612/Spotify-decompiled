package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g680 implements z0i {
    public final String a;
    public final String b;
    public final String c;
    public final lfc d;
    public final hux e;
    public final aec f;

    public g680(String str, String str2, String str3, lfc lfcVar, hux huxVar, aec aecVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = lfcVar;
        this.e = huxVar;
        this.f = aecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g680)) {
            return false;
        }
        g680 g680Var = (g680) obj;
        return this.a.equals(g680Var.a) && this.b.equals(g680Var.b) && this.c.equals(g680Var.c) && this.d == g680Var.d && u890.j(this.e, g680Var.e) && this.f == g680Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        hux huxVar = this.e;
        return this.f.hashCode() + ((iHashCode + (huxVar == null ? 0 : huxVar.hashCode())) * 31);
    }
}
