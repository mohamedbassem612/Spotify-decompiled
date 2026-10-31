package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d9a extends j660 {
    public int n0;
    public int o0;
    public c9a p0;

    @Override // p.j660
    public final l660 Z() {
        c9a c9aVar = this.p0;
        if (c9aVar != null) {
            return c9aVar;
        }
        c9a c9aVar2 = new c9a();
        this.p0 = c9aVar2;
        return c9aVar2;
    }

    @Override // p.j660, p.dil, p.u811, p.od10
    public final void apply() {
        Z();
        int iC = l1d.C(this.n0);
        int i = 1;
        if (iC != 1 && iC != 3) {
            if (iC != 4) {
                i = iC != 5 ? 0 : 3;
            } else {
                i = 2;
            }
        }
        c9a c9aVar = this.p0;
        c9aVar.w0 = i;
        c9aVar.y0 = this.o0;
    }

    @Override // p.dil
    public final dil x(int i) {
        this.o0 = i;
        return this;
    }

    @Override // p.dil
    public final dil y(Float f) {
        this.o0 = this.k0.c(f);
        return this;
    }
}
