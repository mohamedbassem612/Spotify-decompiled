package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class heg0 {
    public final int a;
    public final String b;

    public heg0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof heg0)) {
            return false;
        }
        heg0 heg0Var = (heg0) obj;
        return this.a == heg0Var.a && this.b.equals(heg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
