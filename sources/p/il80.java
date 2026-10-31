package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class il80 {
    public final xk80 a;
    public final String b;
    public final String c;
    public final String d;
    public final u7h e;
    public final u7h f;

    public il80(xk80 xk80Var, String str, String str2, String str3, u7h u7hVar, u7h u7hVar2) {
        this.a = xk80Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = u7hVar;
        this.f = u7hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il80)) {
            return false;
        }
        il80 il80Var = (il80) obj;
        return this.a.equals(il80Var.a) && u890.j(this.b, il80Var.b) && u890.j(this.c, il80Var.c) && u890.j(this.d, il80Var.d) && u890.j(this.e, il80Var.e) && u890.j(this.f, il80Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iD = cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        u7h u7hVar = this.e;
        int iHashCode3 = (iHashCode2 + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31;
        u7h u7hVar2 = this.f;
        return iHashCode3 + (u7hVar2 != null ? Long.hashCode(u7hVar2.a) : 0);
    }
}
