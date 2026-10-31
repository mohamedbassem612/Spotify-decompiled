package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x8g1 {
    public final String a;
    public final long b;
    public final Long c;

    public x8g1(long j, Long l, String str) {
        this.a = str;
        this.b = j;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8g1)) {
            return false;
        }
        x8g1 x8g1Var = (x8g1) obj;
        return u890.j(this.a, x8g1Var.a) && this.b == x8g1Var.b && u890.j(this.c, x8g1Var.c);
    }

    public final int hashCode() {
        int iF = cy30.f(this.a.hashCode() * 31, this.b, 31);
        Long l = this.c;
        return iF + (l == null ? 0 : l.hashCode());
    }
}
