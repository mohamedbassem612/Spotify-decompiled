package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nbk0 {
    public final String a;
    public final boolean b;

    public nbk0(String str, int i, boolean z) {
        str = (i & 1) != 0 ? "" : str;
        z = (i & 2) != 0 ? false : z;
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbk0)) {
            return false;
        }
        nbk0 nbk0Var = (nbk0) obj;
        return this.a.equals(nbk0Var.a) && this.b == nbk0Var.b;
    }

    public final int hashCode() {
        return l1d.C(1) + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, false);
    }
}
