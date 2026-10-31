package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fuo0 extends puo0 {
    public final boolean a;
    public final boolean b;

    public fuo0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuo0)) {
            return false;
        }
        fuo0 fuo0Var = (fuo0) obj;
        return this.a == fuo0Var.a && this.b == fuo0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
