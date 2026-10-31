package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lq3 extends hr3 {
    public final int a;
    public final tv80 b;

    public lq3(int i, tv80 tv80Var) {
        this.a = i;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq3)) {
            return false;
        }
        lq3 lq3Var = (lq3) obj;
        return this.a == lq3Var.a && this.b.equals(lq3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
