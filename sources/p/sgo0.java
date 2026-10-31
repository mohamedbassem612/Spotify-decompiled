package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sgo0 {
    public final String a;
    public final hzy b;
    public final jo70 c;

    public sgo0(String str, hzy hzyVar, jo70 jo70Var) {
        this.a = str;
        this.b = hzyVar;
        this.c = jo70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgo0)) {
            return false;
        }
        sgo0 sgo0Var = (sgo0) obj;
        return u890.j(this.a, sgo0Var.a) && u890.j(this.b, sgo0Var.b) && u890.j(this.c, sgo0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hzy hzyVar = this.b;
        int iC = (iHashCode + (hzyVar == null ? 0 : l1d.C(hzyVar.a))) * 31;
        jo70 jo70Var = this.c;
        return iC + (jo70Var != null ? jo70Var.hashCode() : 0);
    }
}
