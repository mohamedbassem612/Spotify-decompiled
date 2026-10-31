package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ybd1 {
    public final if81 a;
    public final if81 b;
    public final int c;
    public final tv80 d;

    public ybd1(if81 if81Var, if81 if81Var2, int i, tv80 tv80Var) {
        this.a = if81Var;
        this.b = if81Var2;
        this.c = i;
        this.d = tv80Var;
    }

    public final if81 a() {
        return this.b;
    }

    public final tv80 b() {
        return this.d;
    }

    public final int c() {
        return this.c;
    }

    public final if81 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybd1)) {
            return false;
        }
        ybd1 ybd1Var = (ybd1) obj;
        return this.a == ybd1Var.a && this.b == ybd1Var.b && this.c == ybd1Var.c && u890.j(this.d, ybd1Var.d);
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        tv80 tv80Var = this.d;
        return iK + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
