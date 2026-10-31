package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class axr0 {
    public final bxr0 a;
    public final boolean b;

    public axr0(bxr0 bxr0Var, boolean z) {
        this.a = bxr0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axr0)) {
            return false;
        }
        axr0 axr0Var = (axr0) obj;
        return this.a == axr0Var.a && this.b == axr0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
