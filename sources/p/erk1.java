package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class erk1 implements rrk1 {
    public final b32 a;
    public final boolean b;

    public erk1(b32 b32Var, boolean z) {
        this.a = b32Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erk1)) {
            return false;
        }
        erk1 erk1Var = (erk1) obj;
        return this.a.equals(erk1Var.a) && this.b == erk1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
