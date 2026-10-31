package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y8j1 {
    public final String a;
    public final n1x b;
    public final ji0 c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public y8j1(String str, n1x n1xVar, ji0 ji0Var, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = n1xVar;
        this.c = ji0Var;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final ji0 a() {
        return this.c;
    }

    public final n1x b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8j1)) {
            return false;
        }
        y8j1 y8j1Var = (y8j1) obj;
        return u890.j(this.a, y8j1Var.a) && this.b.equals(y8j1Var.b) && this.c.equals(y8j1Var.c) && u890.j(this.d, y8j1Var.d) && u890.j(this.e, y8j1Var.e) && u890.j(this.f, y8j1Var.f) && u890.j(this.g, y8j1Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.d(cy30.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }
}
