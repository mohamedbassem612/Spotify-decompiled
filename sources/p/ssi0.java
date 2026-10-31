package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ssi0 {
    public final rsi0 a;
    public final String b;
    public final boolean c;
    public final String d;
    public final tv80 e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public ssi0(rsi0 rsi0Var, String str, boolean z, String str2, tv80 tv80Var, String str3, boolean z2, boolean z3) {
        this.a = rsi0Var;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = tv80Var;
        this.f = str3;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssi0)) {
            return false;
        }
        ssi0 ssi0Var = (ssi0) obj;
        return this.a == ssi0Var.a && u890.j(this.b, ssi0Var.b) && this.c == ssi0Var.c && u890.j(this.d, ssi0Var.d) && this.e.equals(ssi0Var.e) && u890.j(this.f, ssi0Var.f) && this.g == ssi0Var.g && this.h == ssi0Var.h;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + cy30.d(xcg1.g(cy30.d(xcg1.g(this.a.hashCode() * 31, 31, true), 31, this.b), 31, this.c), 31, this.d)) * 31;
        String str = this.f;
        return Boolean.hashCode(this.h) + xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
    }
}
