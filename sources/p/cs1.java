package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cs1 implements bt1 {
    public final tv80 a;

    public cs1(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cs1) && u890.j(this.a, ((cs1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
