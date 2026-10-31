package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q3x implements i3x {
    public gt40 a = et40.a;

    @Override // p.i3x
    public final i3x a() {
        q3x q3xVar = new q3x();
        q3xVar.a = this.a;
        return q3xVar;
    }

    @Override // p.i3x
    public final gt40 b() {
        return this.a;
    }

    @Override // p.i3x
    public final void c(gt40 gt40Var) {
        this.a = gt40Var;
    }

    public final String toString() {
        return "EmittableSpacer(modifier=" + this.a + ')';
    }
}
