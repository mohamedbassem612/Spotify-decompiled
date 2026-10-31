package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t2d1 {
    public final boolean a;
    public final int b;

    public t2d1(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2d1)) {
            return false;
        }
        t2d1 t2d1Var = (t2d1) obj;
        return this.a == t2d1Var.a && this.b == t2d1Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
