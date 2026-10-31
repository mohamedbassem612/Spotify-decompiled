package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pve extends epo1 {
    public final String c;
    public final zks0 d;
    public final c380 e;
    public final String f;
    public final r4f g;
    public final c380 h;

    public pve(String str, zks0 zks0Var, c380 c380Var, String str2, r4f r4fVar, c380 c380Var2) {
        this.c = str;
        this.d = zks0Var;
        this.e = c380Var;
        this.f = str2;
        this.g = r4fVar;
        this.h = c380Var2;
    }

    @Override // p.epo1
    public final String E() {
        return this.c;
    }

    @Override // p.epo1
    public final zks0 F() {
        return this.d;
    }

    @Override // p.epo1
    public final c380 G() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pve)) {
            return false;
        }
        pve pveVar = (pve) obj;
        return u890.j(this.c, pveVar.c) && u890.j(this.d, pveVar.d) && u890.j(this.e, pveVar.e) && u890.j(this.f, pveVar.f) && u890.j(this.g, pveVar.g) && u890.j(this.h, pveVar.h);
    }

    public final int hashCode() {
        int iF = kk0.f(this.e, (this.d.hashCode() + (this.c.hashCode() * 31)) * 31, 31);
        String str = this.f;
        return this.h.hashCode() + ((this.g.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 961)) * 31);
    }
}
