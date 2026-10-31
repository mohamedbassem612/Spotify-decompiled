package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class loe0 extends moe0 {
    public final String a;
    public final String b;
    public final woe0 c;
    public final woe0 d;

    public loe0(String str, String str2, woe0 woe0Var, woe0 woe0Var2) {
        this.a = str;
        this.b = str2;
        this.c = woe0Var;
        this.d = woe0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loe0)) {
            return false;
        }
        loe0 loe0Var = (loe0) obj;
        return this.a.equals(loe0Var.a) && this.b.equals(loe0Var.b) && u890.j(this.c, loe0Var.c) && u890.j(this.d, loe0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
