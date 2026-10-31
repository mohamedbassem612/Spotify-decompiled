package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iom0 extends qaj0 {
    public final z72 b;
    public final uwl c;
    public final f3n1 d;

    public iom0(z72 z72Var, uwl uwlVar, f3n1 f3n1Var) {
        super(bsm1.class);
        this.b = z72Var;
        this.c = uwlVar;
        this.d = f3n1Var;
    }

    @Override // p.qaj0
    public final kpg0 b() {
        if (this.d.a()) {
            return new kpg0(this.c, new hom0(this, (byte) 0));
        }
        return new kpg0(this.b, new hom0(this, (byte) 1));
    }
}
