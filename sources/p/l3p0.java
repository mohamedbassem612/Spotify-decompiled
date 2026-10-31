package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class l3p0 implements q3p0 {
    public final ou80 a;

    public l3p0(ou80 ou80Var) {
        this.a = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3p0) && u890.j(this.a, ((l3p0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
