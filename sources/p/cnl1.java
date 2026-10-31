package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cnl1 {
    public final int a;
    public final boolean b;

    public cnl1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnl1)) {
            return false;
        }
        cnl1 cnl1Var = (cnl1) obj;
        return this.a == cnl1Var.a && this.b == cnl1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
