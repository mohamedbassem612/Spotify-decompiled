package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bf90 {
    public final boolean a;
    public final boolean b;

    public bf90(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf90)) {
            return false;
        }
        bf90 bf90Var = (bf90) obj;
        return this.a == bf90Var.a && this.b == bf90Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
