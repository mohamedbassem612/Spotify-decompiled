package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l7u0 implements ybj1 {
    public final dv0 a;

    public l7u0(dv0 dv0Var) {
        this.a = dv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7u0) && u890.j(this.a, ((l7u0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
