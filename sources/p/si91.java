package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class si91 extends ui91 {
    public final int a;
    public final if81 b;
    public final tv80 c;

    public si91(int i, if81 if81Var, tv80 tv80Var) {
        this.a = i;
        this.b = if81Var;
        this.c = tv80Var;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si91)) {
            return false;
        }
        si91 si91Var = (si91) obj;
        return this.a == si91Var.a && this.b == si91Var.b && u890.j(this.c, si91Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        tv80 tv80Var = this.c;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
