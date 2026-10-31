package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ll00 implements r731, hs80 {
    public final n731 a;
    public final idd1 b = new idd1(new pdy(this, (byte) 24));

    public ll00(a731 a731Var, bn70 bn70Var) {
        this.a = new n731(a731Var.a(bn70Var.a), "Home Resume Point State Machine");
    }

    public final p731 a() {
        return (p731) this.b.getValue();
    }

    @Override // p.hs80
    public final r4u d(chm0 chm0Var) {
        return r4u.d(new il00(chm0Var, (byte) 0), r4u.a(new jl00(this, (byte) 0)));
    }

    @Override // p.hs80
    public final void dispose() {
        this.a.b();
    }

    @Override // p.hs80
    public final void start() {
        this.a.e();
    }
}
