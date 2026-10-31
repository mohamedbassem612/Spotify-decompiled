package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xip {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ xip(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final xiz0 a(rgn0 rgn0Var) {
        byte b = this.a;
        ykq ykqVar = this.b;
        switch (b) {
            case 0:
                k42 k42Var = (k42) ((chp) ykqVar).c;
                d0r d0rVar = (d0r) ((jly0) k42Var.l).get();
                lzn0 lzn0Var = (lzn0) ((e140) k42Var.c).f.get();
                c8o.l(lzn0Var);
                return new xiz0(d0rVar, lzn0Var, (yip) ((jly0) k42Var.m).get(), rgn0Var);
            default:
                ojq ojqVar = (ojq) ykqVar.c;
                d0r d0rVar2 = (d0r) ojqVar.Y0.get();
                lzn0 lzn0VarB = ((jiz0) ojqVar.b).b();
                c8o.l(lzn0VarB);
                return new xiz0(d0rVar2, lzn0VarB, (yip) ojqVar.m1.get(), rgn0Var);
        }
    }
}
