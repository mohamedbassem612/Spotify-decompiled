package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qdg1 implements sdg1 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final rdg1 e;
    public final long f;
    public final pdg1 g;
    public final ndg1 h;

    public qdg1(String str, String str2, String str3, long j, rdg1 rdg1Var, long j2, pdg1 pdg1Var, ndg1 ndg1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = rdg1Var;
        this.f = j2;
        this.g = pdg1Var;
        this.h = ndg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdg1)) {
            return false;
        }
        qdg1 qdg1Var = (qdg1) obj;
        return this.a.equals(qdg1Var.a) && this.b.equals(qdg1Var.b) && this.c.equals(qdg1Var.c) && this.d == qdg1Var.d && u890.j(this.e, qdg1Var.e) && this.f == qdg1Var.f && u890.j(this.g, qdg1Var.g) && u890.j(this.h, qdg1Var.h);
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31);
        rdg1 rdg1Var = this.e;
        int iF2 = cy30.f((iF + (rdg1Var == null ? 0 : rdg1Var.hashCode())) * 31, this.f, 31);
        pdg1 pdg1Var = this.g;
        int iHashCode = (iF2 + (pdg1Var == null ? 0 : pdg1Var.hashCode())) * 31;
        ndg1 ndg1Var = this.h;
        return iHashCode + (ndg1Var != null ? ndg1Var.hashCode() : 0);
    }
}
