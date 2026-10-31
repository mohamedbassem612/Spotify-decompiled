package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jbj1 {
    public final int a;
    public final int b;

    public jbj1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbj1)) {
            return false;
        }
        jbj1 jbj1Var = (jbj1) obj;
        return this.a == jbj1Var.a && this.b == jbj1Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (l1d.C(this.a) * 31);
    }
}
