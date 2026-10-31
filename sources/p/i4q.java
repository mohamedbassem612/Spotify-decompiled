package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i4q {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ i4q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final mfm a(lik1 lik1Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                v5q v5qVar = (v5q) ((thq) r7qVar).c;
                return new mfm(lik1Var, (dg30) v5qVar.i.a, new h21(xqu.a(v5qVar.c1), (byte) 20));
            case 1:
                s7q s7qVar = (s7q) r7qVar.d;
                return new mfm(lik1Var, (dg30) s7qVar.t.a, new h21(xqu.a(s7qVar.n2), (byte) 20));
            default:
                teq teqVar = r7qVar.d;
                return new mfm(lik1Var, (dg30) teqVar.f.a, sdl.a(xqu.a(teqVar.s2)));
        }
    }
}
