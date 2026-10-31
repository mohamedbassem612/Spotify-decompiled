package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uxb0 {
    public final boolean a;
    public final int b;

    public uxb0(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxb0)) {
            return false;
        }
        uxb0 uxb0Var = (uxb0) obj;
        return this.a == uxb0Var.a && this.b == uxb0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
