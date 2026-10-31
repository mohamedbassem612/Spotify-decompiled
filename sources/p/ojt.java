package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ojt implements dkt {
    public final njt a;
    public final tv80 b;

    public ojt(njt njtVar, tv80 tv80Var) {
        this.a = njtVar;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojt)) {
            return false;
        }
        ojt ojtVar = (ojt) obj;
        return this.a == ojtVar.a && u890.j(this.b, ojtVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
