package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ohz0 {
    public final long a;
    public final long b;
    public final gqb c;

    public ohz0(long j, long j2, gqb gqbVar) {
        this.a = j;
        this.b = j2;
        this.c = gqbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohz0)) {
            return false;
        }
        ohz0 ohz0Var = (ohz0) obj;
        long j = ohz0Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, ohz0Var.b) && this.c.equals(ohz0Var.c);
    }

    public final int hashCode() {
        int i = u7h.l;
        return this.c.hashCode() + cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
    }
}
