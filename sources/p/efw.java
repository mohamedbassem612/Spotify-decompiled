package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class efw {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final long e;
    public final mo10 f;
    public final tv80 g;

    public efw(String str, String str2, String str3, boolean z, long j, mo10 mo10Var, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = j;
        this.f = mo10Var;
        this.g = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efw)) {
            return false;
        }
        efw efwVar = (efw) obj;
        return u890.j(this.a, efwVar.a) && u890.j(this.b, efwVar.b) && u890.j(this.c, efwVar.c) && this.d == efwVar.d && this.e == efwVar.e && u890.j(this.f, efwVar.f) && u890.j(this.g, efwVar.g);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (this.f.hashCode() + cy30.f(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), this.e, 31)) * 31;
        tv80 tv80Var = this.g;
        return iHashCode + (tv80Var != null ? tv80Var.hashCode() : 0);
    }
}
