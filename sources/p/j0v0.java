package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j0v0 {
    public final String a;
    public final String b;
    public final yeu0 c;

    public j0v0(String str, String str2, yeu0 yeu0Var) {
        this.a = str;
        this.b = str2;
        this.c = yeu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0v0) {
            j0v0 j0v0Var = (j0v0) obj;
            return this.a.equals(j0v0Var.a) && u890.j(this.b, j0v0Var.b) && this.c == j0v0Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
