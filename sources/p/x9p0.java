package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x9p0 implements qyo0 {
    public final yjq a;
    public final jo20 b;

    public x9p0(yjq yjqVar, jo20 jo20Var) {
        this.a = yjqVar;
        this.b = jo20Var;
    }

    @Override // p.qyo0
    public final void c() {
        if (this.b.isEnabled()) {
            return;
        }
        this.a.F();
    }

    @Override // p.qyo0
    public final void d() {
        if (this.b.isEnabled()) {
            return;
        }
        this.a.G();
    }
}
