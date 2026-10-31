package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jjf0 implements ljf0 {
    public final boolean a;
    public final xlk1 b;

    public jjf0(boolean z, xlk1 xlk1Var) {
        this.a = z;
        this.b = xlk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjf0)) {
            return false;
        }
        jjf0 jjf0Var = (jjf0) obj;
        return this.a == jjf0Var.a && this.b == jjf0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
