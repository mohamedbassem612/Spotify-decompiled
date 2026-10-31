package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pv51 {
    public final s1b0 a;
    public final boolean b;

    public pv51(s1b0 s1b0Var, boolean z) {
        this.a = s1b0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv51)) {
            return false;
        }
        pv51 pv51Var = (pv51) obj;
        return this.a.equals(pv51Var.a) && this.b == pv51Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
