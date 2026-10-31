package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wyp implements stw0 {
    public final vi2 a;
    public final jly0 b = xqu.b(new ywp(this, 1, (byte) 25));
    public final jly0 c = xqu.b(new ywp(this, 0, (byte) 25));
    public final jly0 d = xqu.b(new ywp(this, 2, (byte) 25));

    public wyp(vi2 vi2Var) {
        this.a = vi2Var;
    }

    public final luw0 a() {
        return iwv0.q(iwv0.n(this.a.c()));
    }

    public final o241 b() {
        return (o241) this.c.get();
    }

    public final cuw0 c() {
        return new cuw0(this.a.b(), (o241) this.c.get(), new r241(a()));
    }

    public final r241 d() {
        return new r241(a());
    }

    public final ov20 e() {
        return (ov20) this.d.get();
    }
}
