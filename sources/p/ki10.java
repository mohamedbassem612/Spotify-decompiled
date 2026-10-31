package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ki10 implements bbr0 {
    public final bbr0 a;
    public final bbr0 b;

    public ki10(bbr0 bbr0Var, bbr0 bbr0Var2) {
        this.a = bbr0Var;
        this.b = bbr0Var2;
    }

    @Override // p.bbr0
    public final war0 b0(Class cls) {
        return new ji10(this.a.b0(cls), this.b.b0(cls));
    }
}
