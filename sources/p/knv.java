package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class knv {
    public final String a;
    public final String b;
    public final ova c;
    public final ova d;
    public final c380 e;
    public final boolean f;
    public final jnv g;

    public knv(String str, String str2, ova ovaVar, ova ovaVar2, c380 c380Var, boolean z, jnv jnvVar) {
        this.a = str;
        this.b = str2;
        this.c = ovaVar;
        this.d = ovaVar2;
        this.e = c380Var;
        this.f = z;
        this.g = jnvVar;
    }

    public static knv a(knv knvVar, String str, ova ovaVar, boolean z, jnv jnvVar, int i) {
        String str2 = knvVar.a;
        if ((i & 2) != 0) {
            str = knvVar.b;
        }
        String str3 = str;
        ova ovaVar2 = knvVar.c;
        if ((i & 8) != 0) {
            ovaVar = knvVar.d;
        }
        ova ovaVar3 = ovaVar;
        c380 c380Var = knvVar.e;
        if ((i & 32) != 0) {
            z = knvVar.f;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            jnvVar = knvVar.g;
        }
        return new knv(str2, str3, ovaVar2, ovaVar3, c380Var, z2, jnvVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knv)) {
            return false;
        }
        knv knvVar = (knv) obj;
        return u890.j(this.a, knvVar.a) && u890.j(this.b, knvVar.b) && this.c == knvVar.c && this.d == knvVar.d && u890.j(this.e, knvVar.e) && this.f == knvVar.f && u890.j(this.g, knvVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + xcg1.g(kk0.f(this.e, (this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31), 31, this.f);
    }
}
