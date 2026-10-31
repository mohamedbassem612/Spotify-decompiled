package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qnx0 {
    public final pnx0 a;
    public final w281 b;
    public final hzy c;
    public final jo70 d;
    public final String e;

    public qnx0(pnx0 pnx0Var, w281 w281Var, hzy hzyVar, jo70 jo70Var, String str) {
        this.a = pnx0Var;
        this.b = w281Var;
        this.c = hzyVar;
        this.d = jo70Var;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnx0)) {
            return false;
        }
        qnx0 qnx0Var = (qnx0) obj;
        return this.a.equals(qnx0Var.a) && u890.j(this.b, qnx0Var.b) && u890.j(this.c, qnx0Var.c) && u890.j(this.d, qnx0Var.d) && u890.j(this.e, qnx0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        w281 w281Var = this.b;
        int iHashCode2 = (iHashCode + (w281Var == null ? 0 : w281Var.hashCode())) * 31;
        hzy hzyVar = this.c;
        int iC = (iHashCode2 + (hzyVar == null ? 0 : l1d.C(hzyVar.a))) * 31;
        jo70 jo70Var = this.d;
        int iHashCode3 = (iC + (jo70Var == null ? 0 : jo70Var.hashCode())) * 31;
        String str = this.e;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }
}
