package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qap {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ qap(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final tm a(bpb1 bpb1Var) {
        byte b = this.a;
        jly0 jly0Var = this.b;
        switch (b) {
            case 0:
                b6p b6pVar = (b6p) ((j7p) jly0Var).b;
                lzn0 lzn0Var = (lzn0) ((wzp) b6pVar.b).a.i.get();
                c8o.l(lzn0Var);
                z710 z710Var = (z710) ((wzp) b6pVar.b).a.q9.get();
                c8o.l(z710Var);
                return new tm(lzn0Var, z710Var, bpb1Var);
            default:
                k2q k2qVar = (k2q) ((bpq) jly0Var).b;
                lzn0 lzn0Var2 = (lzn0) ((ibq) k2qVar.b).a.i.get();
                c8o.l(lzn0Var2);
                z710 z710Var2 = (z710) ((ibq) k2qVar.b).a.q9.get();
                c8o.l(z710Var2);
                return new tm(lzn0Var2, z710Var2, bpb1Var);
        }
    }
}
