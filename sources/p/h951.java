package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h951 {
    public final int a;
    public final xl81 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public h951(int i, xl81 xl81Var, String str, String str2, String str3, String str4, String str5) {
        this.a = i;
        this.b = xl81Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h951)) {
            return false;
        }
        h951 h951Var = (h951) obj;
        return this.a == h951Var.a && this.b.equals(h951Var.b) && this.c.equals(h951Var.c) && this.d.equals(h951Var.d) && this.e.equals(h951Var.e) && this.f.equals(h951Var.f) && this.g.equals(h951Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d((this.b.hashCode() + (l1d.C(this.a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
