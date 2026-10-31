package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hpv extends jpv {
    public final tv80 a;

    public hpv(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hpv) && u890.j(this.a, ((hpv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
