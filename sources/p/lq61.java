package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lq61 {
    public final String a;
    public final Integer b;
    public final mr20 c;
    public final c0g d;
    public final int e;
    public final c380 f;
    public final hq61 g;

    public lq61(String str, Integer num, x010 x010Var, c0g c0gVar, int i, c9 c9Var, hq61 hq61Var, int i2) {
        num = (i2 & 4) != 0 ? null : num;
        x010Var = (i2 & 8) != 0 ? wbx0.X : x010Var;
        this.a = str;
        this.b = num;
        this.c = x010Var;
        this.d = c0gVar;
        this.e = i;
        this.f = c9Var;
        this.g = hq61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq61)) {
            return false;
        }
        lq61 lq61Var = (lq61) obj;
        return this.a.equals(lq61Var.a) && u890.j(this.b, lq61Var.b) && this.c.equals(lq61Var.c) && this.d.equals(lq61Var.d) && this.e == lq61Var.e && this.f.equals(lq61Var.f) && this.g.equals(lq61Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 961;
        Integer num = this.b;
        return this.g.hashCode() + kk0.f(this.f, kaa0.f(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31, 31), 31);
    }
}
