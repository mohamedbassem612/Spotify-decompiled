package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ipv extends jpv {
    public final tv80 a;

    public ipv(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ipv) && u890.j(this.a, ((ipv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
