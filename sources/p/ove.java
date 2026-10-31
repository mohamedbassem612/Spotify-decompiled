package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ove extends epo1 {
    public final String c;
    public final jwm d;
    public final jwm e;
    public final zks0 f;
    public final r4f g;
    public final c380 h;

    public ove(String str, jwm jwmVar, jwm jwmVar2, zks0 zks0Var, r4f r4fVar, c380 c380Var) {
        this.c = str;
        this.d = jwmVar;
        this.e = jwmVar2;
        this.f = zks0Var;
        this.g = r4fVar;
        this.h = c380Var;
        mqo1.A(p7h.M(new jwm[]{jwmVar2, jwmVar}));
    }

    @Override // p.epo1
    public final String E() {
        return this.c;
    }

    @Override // p.epo1
    public final zks0 F() {
        return this.f;
    }

    @Override // p.epo1
    public final c380 G() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ove)) {
            return false;
        }
        ove oveVar = (ove) obj;
        return u890.j(this.c, oveVar.c) && this.d.equals(oveVar.d) && u890.j(this.e, oveVar.e) && u890.j(this.f, oveVar.f) && u890.j(this.g, oveVar.g) && u890.j(this.h, oveVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
