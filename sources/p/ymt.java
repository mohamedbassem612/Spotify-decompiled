package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ymt extends kbb {
    public final String d;
    public final o571 e;
    public final Throwable f;
    public final ou80 g;

    public ymt(String str, o571 o571Var, Throwable th, ou80 ou80Var) {
        this.d = str;
        this.e = o571Var;
        this.f = th;
        this.g = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymt)) {
            return false;
        }
        ymt ymtVar = (ymt) obj;
        return u890.j(this.d, ymtVar.d) && u890.j(this.e, ymtVar.e) && this.f.equals(ymtVar.f) && u890.j(this.g, ymtVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31;
        ou80 ou80Var = this.g;
        return iHashCode + (ou80Var == null ? 0 : ou80Var.a.hashCode());
    }
}
