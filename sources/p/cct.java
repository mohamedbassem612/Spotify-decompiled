package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cct implements kc91, t17 {
    public final /* synthetic */ pbq a;
    public final jge b;
    public final /* synthetic */ pbq c;

    public cct(pbq pbqVar) {
        this.c = pbqVar;
        this.a = pbqVar;
        this.b = hu20.e((xe01) pbqVar.d, new i64(3, (lnm) null, (byte) 6));
    }

    public final zob1 a() {
        return (xe01) this.a.e;
    }

    @Override // p.t17
    public final mr20 b() {
        return this.b;
    }

    public final void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(748384818);
        this.a.c(x340Var, 0);
        x340Var.r(false);
    }

    @Override // p.t17
    public final void e(Integer num, int i) {
        t1v0 t1v0Var = (t1v0) ((xe01) this.c.d).a.getValue();
        p260 p260Var = t1v0Var != null ? t1v0Var.b : null;
        t17 t17Var = p260Var instanceof t17 ? (t17) p260Var : null;
        if (t17Var != null) {
            t17Var.e(num, i);
        }
    }
}
