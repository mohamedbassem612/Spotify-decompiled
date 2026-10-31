package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x7g0 extends hon1 {
    public final String e;
    public final int f;

    public x7g0(String str, int i) {
        this.e = str;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7g0)) {
            return false;
        }
        x7g0 x7g0Var = (x7g0) obj;
        return this.e.equals(x7g0Var.e) && this.f == x7g0Var.f;
    }

    public final int hashCode() {
        return l1d.C(this.f) + (this.e.hashCode() * 31);
    }
}
