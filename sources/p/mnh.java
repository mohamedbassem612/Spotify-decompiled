package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mnh implements snh {
    public final String a;
    public final String b;
    public final ygh c;
    public final tv80 d;
    public final boolean e;

    public mnh(String str, String str2, ygh yghVar, tv80 tv80Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = yghVar;
        this.d = tv80Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnh)) {
            return false;
        }
        mnh mnhVar = (mnh) obj;
        return u890.j(this.a, mnhVar.a) && u890.j(this.b, mnhVar.b) && u890.j(this.c, mnhVar.c) && u890.j(this.d, mnhVar.d) && this.e == mnhVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        tv80 tv80Var = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31);
    }
}
