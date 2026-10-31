package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zd60 {
    public final long a;
    public final long b;
    public final gqb c;

    public zd60(long j, long j2, gqb gqbVar) {
        this.a = j;
        this.b = j2;
        this.c = gqbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd60)) {
            return false;
        }
        zd60 zd60Var = (zd60) obj;
        long j = zd60Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, zd60Var.b) && u890.j(this.c, zd60Var.c);
    }

    public final int hashCode() {
        int i = u7h.l;
        int iF = cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
        gqb gqbVar = this.c;
        return iF + (gqbVar == null ? 0 : gqbVar.hashCode());
    }
}
