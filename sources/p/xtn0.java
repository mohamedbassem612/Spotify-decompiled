package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xtn0 implements z0i {
    public final String a;
    public final String b;
    public final String c;
    public final lfc d;
    public final hux e;
    public final aec f;

    public xtn0(String str, String str2, String str3, lfc lfcVar, hux huxVar, aec aecVar) {
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
        if (!(obj instanceof xtn0)) {
            return false;
        }
        xtn0 xtn0Var = (xtn0) obj;
        return this.a.equals(xtn0Var.a) && this.b.equals(xtn0Var.b) && this.c.equals(xtn0Var.c) && this.d == xtn0Var.d && u890.j(this.e, xtn0Var.e) && this.f == xtn0Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        hux huxVar = this.e;
        return this.f.hashCode() + ((iHashCode + (huxVar == null ? 0 : huxVar.hashCode())) * 31);
    }
}
