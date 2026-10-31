package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mad1 implements z0i {
    public final String a;
    public final long b;
    public final long c;
    public final Integer d;

    public mad1(String str, long j, long j2, Integer num) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mad1)) {
            return false;
        }
        mad1 mad1Var = (mad1) obj;
        return this.a.equals(mad1Var.a) && this.b == mad1Var.b && this.c == mad1Var.c && u890.j(this.d, mad1Var.d);
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        Integer num = this.d;
        return iF + (num == null ? 0 : num.hashCode());
    }
}
