package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ti91 extends ui91 {
    public final int a;
    public final tv80 b;

    public ti91(int i, tv80 tv80Var) {
        this.a = i;
        this.b = tv80Var;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti91)) {
            return false;
        }
        ti91 ti91Var = (ti91) obj;
        return this.a == ti91Var.a && u890.j(this.b, ti91Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
