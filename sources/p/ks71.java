package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ks71 {
    public final w4i1 a;
    public final String b;
    public final int c;
    public final String d;

    public ks71(w4i1 w4i1Var, String str, int i, String str2) {
        this.a = w4i1Var;
        this.b = str;
        this.c = i;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks71)) {
            return false;
        }
        ks71 ks71Var = (ks71) obj;
        return this.a.equals(ks71Var.a) && this.b.equals(ks71Var.b) && this.c == ks71Var.c && u890.j(this.d, ks71Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
