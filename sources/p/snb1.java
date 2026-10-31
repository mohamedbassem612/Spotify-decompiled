package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class snb1 {
    public final k6w0 a;
    public final t6l b;
    public final m6l c;
    public final ah91 d;
    public final nqs e;
    public final mr20 f;
    public final zg91 g;
    public final Long h;

    public snb1(k6w0 k6w0Var, t6l t6lVar, m6l m6lVar, ah91 ah91Var, nqs nqsVar, ve01 ve01Var, zg91 zg91Var, Long l) {
        this.a = k6w0Var;
        this.b = t6lVar;
        this.c = m6lVar;
        this.d = ah91Var;
        this.e = nqsVar;
        this.f = ve01Var;
        this.g = zg91Var;
        this.h = l;
    }

    public final nqs a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof snb1) {
            snb1 snb1Var = (snb1) obj;
            if (u890.j(this.a, snb1Var.a) && u890.j(this.b, snb1Var.b) && u890.j(this.c, snb1Var.c) && this.d.equals(snb1Var.d) && this.e == snb1Var.e && this.f.equals(snb1Var.f) && this.g == snb1Var.g && u890.j(this.h, snb1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Long l = this.h;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }
}
