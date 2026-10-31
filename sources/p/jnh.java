package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jnh implements snh {
    public final sn51 a;
    public final tv80 b;

    public jnh(sn51 sn51Var, tv80 tv80Var) {
        this.a = sn51Var;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnh)) {
            return false;
        }
        jnh jnhVar = (jnh) obj;
        return this.a.equals(jnhVar.a) && u890.j(this.b, jnhVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
