package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h3k1 {
    public final String a;
    public final boolean b;
    public final int c;

    public h3k1(String str, int i, boolean z) {
        this.a = str;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3k1)) {
            return false;
        }
        h3k1 h3k1Var = (h3k1) obj;
        return u890.j(this.a, h3k1Var.a) && this.b == h3k1Var.b && this.c == h3k1Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return l1d.C(this.c) + xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }
}
