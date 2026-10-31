package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j0e0 implements k0e0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final o0e0 e;

    public j0e0(String str, String str2, String str3, int i, o0e0 o0e0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = o0e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0e0)) {
            return false;
        }
        j0e0 j0e0Var = (j0e0) obj;
        return this.a.equals(j0e0Var.a) && this.b.equals(j0e0Var.b) && this.c.equals(j0e0Var.c) && this.d == j0e0Var.d && this.e.equals(j0e0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ab80.k(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }
}
