package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k37 {
    public final String a;
    public final boolean b;
    public final int c;

    public k37(String str, int i, boolean z) {
        this.a = str;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k37)) {
            return false;
        }
        k37 k37Var = (k37) obj;
        return this.a.equals(k37Var.a) && this.b == k37Var.b && this.c == k37Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
