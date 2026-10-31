package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k5k1 extends m5k1 {
    public final wkt a;
    public final int b;

    public k5k1(wkt wktVar, int i) {
        this.a = wktVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5k1)) {
            return false;
        }
        k5k1 k5k1Var = (k5k1) obj;
        return this.a.equals(k5k1Var.a) && this.b == k5k1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
