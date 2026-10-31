package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w501 {
    public final v501 a;
    public final String b;
    public final boolean c;

    public w501(v501 v501Var, String str, boolean z) {
        this.a = v501Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w501)) {
            return false;
        }
        w501 w501Var = (w501) obj;
        return this.a.equals(w501Var.a) && u890.j(this.b, w501Var.b) && this.c == w501Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
