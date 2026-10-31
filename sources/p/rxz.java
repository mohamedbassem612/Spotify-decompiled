package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rxz implements a600 {
    public final tv80 a;

    public rxz(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxz) && u890.j(this.a, ((rxz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
