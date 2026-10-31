package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ji7 implements mi7 {
    public final jmr0 a;
    public final viz b;

    public ji7(jmr0 jmr0Var, viz vizVar) {
        this.a = jmr0Var;
        this.b = vizVar;
    }

    @Override // p.mi7
    public final jmr0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji7)) {
            return false;
        }
        ji7 ji7Var = (ji7) obj;
        return u890.j(this.a, ji7Var.a) && this.b.equals(ji7Var.b);
    }

    public final int hashCode() {
        jmr0 jmr0Var = this.a;
        return this.b.hashCode() + ((jmr0Var == null ? 0 : jmr0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.a + ", result=" + this.b + ")";
    }
}
