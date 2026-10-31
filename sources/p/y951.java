package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y951 extends q1o1 {
    public final String e;
    public final int f;
    public final boolean g;

    public y951(String str, int i, boolean z) {
        this.e = str;
        this.f = i;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y951)) {
            return false;
        }
        y951 y951Var = (y951) obj;
        return u890.j(this.e, y951Var.e) && this.f == y951Var.f && this.g == y951Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + xcg1.g(xcg1.g(xcg1.g(ab80.k(this.f, this.e.hashCode() * 31, 31), 31, this.g), 31, false), 961, false);
    }

    public final int j() {
        return this.f;
    }

    public final String p() {
        return this.e;
    }

    public final boolean r() {
        return this.g;
    }
}
