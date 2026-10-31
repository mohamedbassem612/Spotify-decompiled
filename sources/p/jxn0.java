package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jxn0 implements lxn0, fgb1 {
    public final int a;
    public final boolean b;

    public jxn0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxn0)) {
            return false;
        }
        jxn0 jxn0Var = (jxn0) obj;
        return this.a == jxn0Var.a && this.b == jxn0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (l1d.C(this.a) * 31);
    }
}
