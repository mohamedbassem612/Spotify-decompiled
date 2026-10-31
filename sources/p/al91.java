package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class al91 extends d7e {
    public final String c;
    public final int d;
    public final tv80 e;

    public al91(int i, String str, tv80 tv80Var) {
        this.c = str;
        this.d = i;
        this.e = tv80Var;
    }

    public final tv80 D() {
        return this.e;
    }

    public final int E() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al91)) {
            return false;
        }
        al91 al91Var = (al91) obj;
        return u890.j(this.c, al91Var.c) && this.d == al91Var.d && u890.j(this.e, al91Var.e);
    }

    public final int hashCode() {
        int iK = ab80.k(this.d, this.c.hashCode() * 31, 31);
        tv80 tv80Var = this.e;
        return iK + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
