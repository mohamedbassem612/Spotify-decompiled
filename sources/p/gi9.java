package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gi9 {
    public final String a;
    public final int b;
    public final int c;
    public final di9 d;
    public final Integer e;
    public final long f;

    public gi9(String str, int i, int i2, di9 di9Var, Integer num, long j) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = di9Var;
        this.e = num;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi9)) {
            return false;
        }
        gi9 gi9Var = (gi9) obj;
        return this.a.equals(gi9Var.a) && this.b == gi9Var.b && this.c == gi9Var.c && this.d == gi9Var.d && u890.j(this.e, gi9Var.e) && this.f == gi9Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ab80.k(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31)) * 31;
        Integer num = this.e;
        return Long.hashCode(this.f) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }
}
