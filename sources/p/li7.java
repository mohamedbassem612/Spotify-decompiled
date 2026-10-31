package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class li7 implements mi7 {
    public final jmr0 a;
    public final tsc1 b;

    public li7(jmr0 jmr0Var, tsc1 tsc1Var) {
        this.a = jmr0Var;
        this.b = tsc1Var;
    }

    @Override // p.mi7
    public final jmr0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li7)) {
            return false;
        }
        li7 li7Var = (li7) obj;
        return this.a.equals(li7Var.a) && this.b.equals(li7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.a + ", result=" + this.b + ")";
    }
}
