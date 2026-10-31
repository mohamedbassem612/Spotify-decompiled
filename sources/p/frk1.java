package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class frk1 implements rrk1 {
    public final b32 a;
    public final Double b;

    public frk1(b32 b32Var, Double d) {
        this.a = b32Var;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frk1)) {
            return false;
        }
        frk1 frk1Var = (frk1) obj;
        return this.a.equals(frk1Var.a) && this.b.equals(frk1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
