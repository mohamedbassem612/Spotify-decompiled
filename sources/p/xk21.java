package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xk21 implements chu {
    public final fq0 a;
    public final String b;

    public xk21(String str, fq0 fq0Var) {
        this.a = fq0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk21)) {
            return false;
        }
        xk21 xk21Var = (xk21) obj;
        return this.a.equals(xk21Var.a) && this.b.equals(xk21Var.b);
    }

    public final int hashCode() {
        return l1d.C(2) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
