package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fdw {
    public final tv80 a;

    public fdw(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fdw) && u890.j(this.a, ((fdw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
