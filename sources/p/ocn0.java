package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ocn0 {
    public final boolean a;
    public final boolean b;

    public ocn0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocn0)) {
            return false;
        }
        ocn0 ocn0Var = (ocn0) obj;
        return this.a == ocn0Var.a && this.b == ocn0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
