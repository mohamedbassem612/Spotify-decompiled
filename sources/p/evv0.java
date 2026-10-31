package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class evv0 {
    public final hqv0 a;
    public final int b;

    public evv0(hqv0 hqv0Var, int i) {
        this.a = hqv0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evv0)) {
            return false;
        }
        evv0 evv0Var = (evv0) obj;
        return this.a.equals(evv0Var.a) && this.b == evv0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
