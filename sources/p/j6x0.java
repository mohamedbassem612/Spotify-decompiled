package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j6x0 extends q6x0 {
    public final String a;
    public final int b;
    public final String c;

    public j6x0(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6x0)) {
            return false;
        }
        j6x0 j6x0Var = (j6x0) obj;
        return u890.j(this.a, j6x0Var.a) && this.b == j6x0Var.b && u890.j(this.c, j6x0Var.c);
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return iK + (str == null ? 0 : str.hashCode());
    }
}
