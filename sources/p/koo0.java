package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class koo0 {
    public final int a;
    public final boolean b;

    public koo0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof koo0)) {
            return false;
        }
        koo0 koo0Var = (koo0) obj;
        return this.a == koo0Var.a && this.b == koo0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (l1d.C(this.a) * 31);
    }
}
