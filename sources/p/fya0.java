package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fya0 implements hya0 {
    public final tv80 a;

    public fya0(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fya0) && u890.j(this.a, ((fya0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
