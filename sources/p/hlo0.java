package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hlo0 extends sio1 {
    public final b561 c;
    public final String d;
    public final qn50 e;
    public final khh0 f;
    public final String g;

    public hlo0(b561 b561Var, String str, qn50 qn50Var, khh0 khh0Var, String str2) {
        this.c = b561Var;
        this.d = str;
        this.e = qn50Var;
        this.f = khh0Var;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlo0)) {
            return false;
        }
        hlo0 hlo0Var = (hlo0) obj;
        return this.c.equals(hlo0Var.c) && u890.j(this.d, hlo0Var.d) && u890.j(this.e, hlo0Var.e) && u890.j(this.f, hlo0Var.f) && u890.j(this.g, hlo0Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(this.c.hashCode() * 31, 31, this.d);
        qn50 qn50Var = this.e;
        int iHashCode = (iD + (qn50Var == null ? 0 : qn50Var.hashCode())) * 31;
        khh0 khh0Var = this.f;
        int iHashCode2 = (iHashCode + (khh0Var == null ? 0 : khh0Var.hashCode())) * 31;
        String str = this.g;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
