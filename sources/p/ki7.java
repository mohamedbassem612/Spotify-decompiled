package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ki7 implements mi7 {
    public final jmr0 a;

    public ki7(jmr0 jmr0Var) {
        this.a = jmr0Var;
    }

    @Override // p.mi7
    public final jmr0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ki7) && u890.j(this.a, ((ki7) obj).a);
    }

    public final int hashCode() {
        jmr0 jmr0Var = this.a;
        if (jmr0Var == null) {
            return 0;
        }
        return jmr0Var.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.a + ")";
    }
}
