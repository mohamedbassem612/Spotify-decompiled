package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e820 {
    public final String a;
    public final d820 b;
    public final int c;
    public final String d;
    public final l651 e;

    public e820(String str, d820 d820Var, int i, String str2, l651 l651Var) {
        this.a = str;
        this.b = d820Var;
        this.c = i;
        this.d = str2;
        this.e = l651Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e820)) {
            return false;
        }
        e820 e820Var = (e820) obj;
        return u890.j(this.a, e820Var.a) && this.b.equals(e820Var.b) && this.c == e820Var.c && u890.j(this.d, e820Var.d) && this.e == e820Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d);
    }
}
