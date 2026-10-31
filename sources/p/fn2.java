package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fn2 extends gn2 {
    public final int a;
    public final int b;

    public fn2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn2)) {
            return false;
        }
        fn2 fn2Var = (fn2) obj;
        return this.a == fn2Var.a && this.b == fn2Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (l1d.C(this.a) * 31);
    }
}
