package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x121 {
    public final int a;
    public final String b;
    public final m0u c;
    public final px31 d;

    public x121(int i, String str, m0u m0uVar, px31 px31Var) {
        this.a = i;
        this.b = str;
        this.c = m0uVar;
        this.d = px31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x121)) {
            return false;
        }
        x121 x121Var = (x121) obj;
        return this.a == x121Var.a && u890.j(this.b, x121Var.b) && u890.j(this.c, x121Var.c) && u890.j(this.d, x121Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b)) * 31);
    }
}
