package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t7i0 extends v7i0 {
    public final e7i0 a;

    public t7i0(e7i0 e7i0Var) {
        this.a = e7i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7i0) && u890.j(this.a, ((t7i0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
