package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pid0 implements aik1 {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final Integer e;
    public final Integer f;
    public final b5p1 g;
    public final ooc1 h;
    public final roc1 i;
    public final boolean j;

    public pid0(long j, int i, int i2, int i3, Integer num, Integer num2, b5p1 b5p1Var, ooc1 ooc1Var, roc1 roc1Var, boolean z) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = num;
        this.f = num2;
        this.g = b5p1Var;
        this.h = ooc1Var;
        this.i = roc1Var;
        this.j = z;
    }

    @Override // p.aik1
    public final int a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pid0)) {
            return false;
        }
        pid0 pid0Var = (pid0) obj;
        return this.a == pid0Var.a && this.b == pid0Var.b && this.c == pid0Var.c && this.d == pid0Var.d && u890.j(this.e, pid0Var.e) && u890.j(this.f, pid0Var.f) && this.g.equals(pid0Var.g) && u890.j(this.h, pid0Var.h) && u890.j(this.i, pid0Var.i) && this.j == pid0Var.j;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.d, kaa0.f(this.c, kaa0.f(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
        Integer num = this.e;
        int iHashCode = (iF + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
