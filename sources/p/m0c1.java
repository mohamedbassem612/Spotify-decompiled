package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m0c1 {
    public final long a;
    public final String b;
    public final Double c;

    public m0c1(long j, String str, Double d) {
        this.a = j;
        this.b = str;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0c1)) {
            return false;
        }
        m0c1 m0c1Var = (m0c1) obj;
        long j = m0c1Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && u890.j(this.b, m0c1Var.b) && u890.j(this.c, m0c1Var.c);
    }

    public final int hashCode() {
        int i = u7h.l;
        int iD = cy30.d(Long.hashCode(this.a) * 31, 31, this.b);
        Double d = this.c;
        return iD + (d == null ? 0 : d.hashCode());
    }
}
