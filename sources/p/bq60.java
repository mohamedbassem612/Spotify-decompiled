package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bq60 implements cq60 {
    public final int a;
    public final int b;

    public bq60(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq60)) {
            return false;
        }
        bq60 bq60Var = (bq60) obj;
        return this.a == bq60Var.a && this.b == bq60Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (l1d.C(this.a) * 31);
    }
}
