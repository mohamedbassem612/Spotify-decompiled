package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k420 {
    public final int a;
    public final int b;
    public final String c;

    public k420(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k420)) {
            return false;
        }
        k420 k420Var = (k420) obj;
        return this.a == k420Var.a && this.b == k420Var.b && this.c.equals(k420Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ab80.k(this.b, l1d.C(this.a) * 31, 31);
    }
}
