package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k3x implements i3x {
    public gt40 a = et40.a;
    public z9h b = bhx0.a;

    @Override // p.i3x
    public final i3x a() {
        k3x k3xVar = new k3x();
        k3xVar.a = this.a;
        k3xVar.b = this.b;
        return k3xVar;
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
        return "EmittableCircularProgressIndicator(modifier=" + this.a + ", color=" + this.b + ')';
    }
}
