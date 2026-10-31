package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qjt implements dkt {
    public final pjt a;
    public final tv80 b;

    public qjt(pjt pjtVar, tv80 tv80Var) {
        this.a = pjtVar;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjt)) {
            return false;
        }
        qjt qjtVar = (qjt) obj;
        return this.a == qjtVar.a && u890.j(this.b, qjtVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
