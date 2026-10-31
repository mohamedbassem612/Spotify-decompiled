package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jf81 {
    public final int a;
    public final int b;

    public jf81(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf81)) {
            return false;
        }
        jf81 jf81Var = (jf81) obj;
        return this.a == jf81Var.a && this.b == jf81Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (l1d.C(this.a) * 31);
    }
}
