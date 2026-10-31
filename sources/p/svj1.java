package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class svj1 implements tvj1 {
    public final int a;
    public final int b;
    public final int c;

    public svj1(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = (int) (((double) i2) * 1.7777777777777777d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svj1)) {
            return false;
        }
        svj1 svj1Var = (svj1) obj;
        return this.a == svj1Var.a && this.b == svj1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (l1d.C(this.a) * 31);
    }
}
