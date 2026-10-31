package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hh81 implements ih81 {
    public final hux a;
    public final Integer b;
    public final String c;
    public final tm81 d;
    public final jh81 e;
    public final nh81 f;

    public hh81(hux huxVar, Integer num, String str, tm81 tm81Var, jh81 jh81Var, nh81 nh81Var) {
        this.a = huxVar;
        this.b = num;
        this.c = str;
        this.d = tm81Var;
        this.e = jh81Var;
        this.f = nh81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh81)) {
            return false;
        }
        hh81 hh81Var = (hh81) obj;
        return u890.j(this.a, hh81Var.a) && this.b.equals(hh81Var.b) && u890.j(this.c, hh81Var.c) && u890.j(this.d, hh81Var.d) && this.e.equals(hh81Var.e) && this.f.equals(hh81Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(pze0.e(this.a.hashCode() * 961, 31, this.b), 31, this.c);
        tm81 tm81Var = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iD + (tm81Var == null ? 0 : tm81Var.hashCode())) * 31)) * 31);
    }
}
