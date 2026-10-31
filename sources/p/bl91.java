package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bl91 extends d7e {
    public final String c;
    public final if81 d;
    public final tv80 e;

    public bl91(String str, if81 if81Var, tv80 tv80Var) {
        this.c = str;
        this.d = if81Var;
        this.e = tv80Var;
    }

    public final tv80 D() {
        return this.e;
    }

    public final if81 E() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl91)) {
            return false;
        }
        bl91 bl91Var = (bl91) obj;
        return u890.j(this.c, bl91Var.c) && this.d == bl91Var.d && u890.j(this.e, bl91Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        tv80 tv80Var = this.e;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
