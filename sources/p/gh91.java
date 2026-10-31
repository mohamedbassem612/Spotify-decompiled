package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gh91 implements ih91 {
    public final t6l a;
    public final m6l b;
    public final ah91 c;
    public final nqs d;
    public final mr20 e;
    public final long f;
    public final zg91 g;
    public final ptj h;

    public gh91(t6l t6lVar, m6l m6lVar, ah91 ah91Var, nqs nqsVar, mr20 mr20Var, long j, zg91 zg91Var, ptj ptjVar) {
        this.a = t6lVar;
        this.b = m6lVar;
        this.c = ah91Var;
        this.d = nqsVar;
        this.e = mr20Var;
        this.f = j;
        this.g = zg91Var;
        this.h = ptjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gh91) {
            gh91 gh91Var = (gh91) obj;
            if (u890.j(this.a, gh91Var.a) && u890.j(this.b, gh91Var.b) && this.c.equals(gh91Var.c) && this.d == gh91Var.d && this.e.equals(gh91Var.e) && this.f == gh91Var.f && this.g == gh91Var.g && this.h.equals(gh91Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + cy30.f((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, this.f, 31)) * 31);
    }
}
