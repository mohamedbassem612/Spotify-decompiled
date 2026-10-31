package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ntp implements stw0 {
    public final ugb a;
    public final vi2 b;
    public final bsp c = new bsp(this, 2, (byte) 16);
    public final jly0 d = xqu.b(new bsp(this, 1, (byte) 16));
    public final jly0 e = xqu.b(new bsp(this, 0, (byte) 16));
    public final jly0 f = xqu.b(new bsp(this, 3, (byte) 16));

    public ntp(vi2 vi2Var, ugb ugbVar) {
        this.a = ugbVar;
        this.b = vi2Var;
    }

    @Override // p.stw0
    public final luw0 a() {
        return new luw0(iwv0.n(this.b.c()));
    }

    @Override // p.stw0
    public final o241 b() {
        return (o241) this.f.get();
    }

    @Override // p.stw0
    public final cuw0 c() {
        return new cuw0(this.b.b(), (o241) this.f.get(), new r241(a()));
    }

    @Override // p.stw0
    public final r241 d() {
        return new r241(a());
    }

    @Override // p.stw0
    public final ov20 e() {
        return (ov20) this.e.get();
    }
}
