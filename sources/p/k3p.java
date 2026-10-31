package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k3p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ k3p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final nm1 a(d0r d0rVar) {
        byte b = this.a;
        jly0 jly0Var = this.b;
        switch (b) {
            case 0:
                s3p s3pVar = (s3p) ((b2p) jly0Var).c;
                gw70 gw70VarB = ((i7c) s3pVar.X0).b();
                c8o.l(gw70VarB);
                lzn0 lzn0VarC = ((i7c) s3pVar.X0).c();
                c8o.l(lzn0VarC);
                return new nm1(d0rVar, gw70VarB, lzn0VarC);
            default:
                d4p d4pVar = (d4p) ((b2p) jly0Var).c;
                gw70 gw70VarB2 = d4pVar.a.b();
                c8o.l(gw70VarB2);
                lzn0 lzn0VarI = d4pVar.a.i();
                c8o.l(lzn0VarI);
                return new nm1(d0rVar, gw70VarB2, lzn0VarI);
        }
    }
}
