package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qfk extends nln {
    public final String e;
    public final tv80 f;

    public qfk(int i, String str, tv80 tv80Var) {
        super((byte) 4);
        this.e = str;
        this.f = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfk)) {
            return false;
        }
        qfk qfkVar = (qfk) obj;
        return u890.j(this.e, qfkVar.e) && u890.j(this.f, qfkVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.e.hashCode() * 31;
        tv80 tv80Var = this.f;
        return (iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31;
    }
}
