package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kvz implements a600 {
    public final tv80 a;

    public kvz(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kvz) && u890.j(this.a, ((kvz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
