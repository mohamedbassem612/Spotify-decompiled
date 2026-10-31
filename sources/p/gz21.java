package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gz21 implements rz21 {
    public final String a;
    public final String b;
    public final c380 c;
    public final cz21 d;
    public final ez21 e;
    public final dz21 f;
    public final String g;

    public gz21(String str, String str2, c380 c380Var, cz21 cz21Var, ez21 ez21Var, dz21 dz21Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = c380Var;
        this.d = cz21Var;
        this.e = ez21Var;
        this.f = dz21Var;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz21)) {
            return false;
        }
        gz21 gz21Var = (gz21) obj;
        return this.a.equals(gz21Var.a) && this.b.equals(gz21Var.b) && u890.j(this.c, gz21Var.c) && u890.j(this.d, gz21Var.d) && u890.j(this.e, gz21Var.e) && u890.j(this.f, gz21Var.f) && u890.j(this.g, gz21Var.g);
    }

    public final int hashCode() {
        int iF = kk0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        cz21 cz21Var = this.d;
        int iHashCode = (iF + (cz21Var == null ? 0 : cz21Var.hashCode())) * 31;
        ez21 ez21Var = this.e;
        int iHashCode2 = (iHashCode + (ez21Var == null ? 0 : ez21Var.hashCode())) * 31;
        dz21 dz21Var = this.f;
        int iHashCode3 = (iHashCode2 + (dz21Var == null ? 0 : dz21Var.hashCode())) * 31;
        String str = this.g;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }
}
