package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lxg0 extends qxg0 {
    public final lx0 a;

    public lxg0(lx0 lx0Var) {
        this.a = lx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lxg0) && this.a.equals(((lxg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
