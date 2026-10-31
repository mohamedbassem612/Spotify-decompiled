package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xvn0 implements cwn0 {
    public final y6r0 a;

    public xvn0(y6r0 y6r0Var) {
        this.a = y6r0Var;
    }

    public final y6r0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xvn0) && this.a.equals(((xvn0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
