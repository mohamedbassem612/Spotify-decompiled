package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j591 {
    public final Integer a;
    public final int b;
    public final int c;
    public final Integer d;
    public final boolean e;

    public j591(Integer num, int i, int i2, Integer num2, boolean z) {
        this.a = num;
        this.b = i;
        this.c = i2;
        this.d = num2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j591)) {
            return false;
        }
        j591 j591Var = (j591) obj;
        return u890.j(this.a, j591Var.a) && this.b == j591Var.b && this.c == j591Var.c && u890.j(this.d, j591Var.d) && this.e == j591Var.e;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iF = kaa0.f(this.c, kaa0.f(this.b, (num == null ? 0 : num.hashCode()) * 31, 31), 31);
        Integer num2 = this.d;
        return Boolean.hashCode(this.e) + ((iF + (num2 != null ? num2.hashCode() : 0)) * 31);
    }
}
