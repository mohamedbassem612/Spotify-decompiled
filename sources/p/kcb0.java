package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kcb0 {
    public final wab0 a;
    public final boolean b;

    public kcb0(wab0 wab0Var, boolean z) {
        this.a = wab0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcb0)) {
            return false;
        }
        kcb0 kcb0Var = (kcb0) obj;
        return this.a.equals(kcb0Var.a) && this.b == kcb0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
