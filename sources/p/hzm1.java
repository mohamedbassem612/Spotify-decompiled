package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hzm1 {
    public final int a;
    public final drq0 b;
    public final rj51 c;
    public final xjd1 d;

    public hzm1(drq0 drq0Var) {
        rj51 rj51Var = new rj51();
        xjd1 xjd1Var = new xjd1();
        this.a = 1;
        this.b = drq0Var;
        this.c = rj51Var;
        this.d = xjd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzm1)) {
            return false;
        }
        hzm1 hzm1Var = (hzm1) obj;
        return this.a == hzm1Var.a && this.b.equals(hzm1Var.b) && this.c.equals(hzm1Var.c) && this.d.equals(hzm1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (l1d.C(this.a) * 31)) * 31)) * 31);
    }
}
