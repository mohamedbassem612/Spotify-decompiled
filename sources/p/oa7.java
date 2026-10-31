package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oa7 implements za7 {
    public final i a;
    public final tv80 b;

    public oa7(i iVar, tv80 tv80Var) {
        this.a = iVar;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa7)) {
            return false;
        }
        oa7 oa7Var = (oa7) obj;
        return this.a.equals(oa7Var.a) && u890.j(this.b, oa7Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
