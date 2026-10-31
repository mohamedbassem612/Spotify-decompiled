package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ypa1 {
    public final Float a;
    public final int b;

    public ypa1(Float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypa1)) {
            return false;
        }
        ypa1 ypa1Var = (ypa1) obj;
        return u890.j(this.a, ypa1Var.a) && this.b == ypa1Var.b;
    }

    public final int hashCode() {
        Float f = this.a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        int i = this.b;
        return iHashCode + (i != 0 ? l1d.C(i) : 0);
    }
}
