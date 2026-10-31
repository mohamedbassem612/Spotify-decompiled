package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kgc1 {
    public final boolean a;
    public final nko1 b;

    public kgc1(boolean z, nko1 nko1Var) {
        this.a = z;
        this.b = nko1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgc1)) {
            return false;
        }
        kgc1 kgc1Var = (kgc1) obj;
        return this.a == kgc1Var.a && this.b.equals(kgc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
