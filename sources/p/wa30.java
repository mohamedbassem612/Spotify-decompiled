package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wa30 {
    public final String a;
    public final int b;
    public final db30 c;
    public final c380 d;
    public final boolean e;

    public wa30(String str, int i, db30 db30Var, c9 c9Var, boolean z) {
        this.a = str;
        this.b = i;
        this.c = db30Var;
        this.d = c9Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa30)) {
            return false;
        }
        wa30 wa30Var = (wa30) obj;
        return this.a.equals(wa30Var.a) && this.b == wa30Var.b && u890.j(this.c, wa30Var.c) && this.d.equals(wa30Var.d) && this.e == wa30Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + kk0.f(this.d, (this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31)) * 31, 31);
    }
}
