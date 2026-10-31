package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t0k1 extends x0k1 {
    public final int a;
    public final boolean b;

    public t0k1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0k1)) {
            return false;
        }
        t0k1 t0k1Var = (t0k1) obj;
        return this.a == t0k1Var.a && this.b == t0k1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (l1d.C(this.a) * 31);
    }
}
