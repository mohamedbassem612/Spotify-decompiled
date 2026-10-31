package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ygf extends ahf {
    public final oz61 a;
    public final boolean b;

    public ygf(oz61 oz61Var, boolean z) {
        this.a = oz61Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygf)) {
            return false;
        }
        ygf ygfVar = (ygf) obj;
        return this.a.equals(ygfVar.a) && this.b == ygfVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
