package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dvp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ dvp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final jw2 a(zob1 zob1Var, d6g1 d6g1Var, mt31 mt31Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                nwp nwpVar = (nwp) ((gbp) r7qVar).c;
                lzn0 lzn0Var = (lzn0) nwpVar.G.get();
                gw70 gw70VarA0 = nwpVar.a.a0();
                c8o.l(gw70VarA0);
                return new jw2(lzn0Var, gw70VarA0, (rzo) nwpVar.m0.get(), zob1Var, d6g1Var, mt31Var);
            case 1:
                thq thqVar = (thq) r7qVar;
                v5q v5qVar = thqVar.c;
                return new jw2((lzn0) v5qVar.U0.get(), (gw70) thqVar.b.d8.get(), (rzo) v5qVar.Y6.get(), zob1Var, d6g1Var, mt31Var);
            case 2:
                r7q r7qVar2 = r7qVar;
                s7q s7qVar = r7qVar2.d;
                return new jw2((lzn0) s7qVar.U0.get(), (gw70) r7qVar2.b.d8.get(), (rzo) s7qVar.A6.get(), zob1Var, d6g1Var, mt31Var);
            default:
                r7q r7qVar3 = r7qVar;
                teq teqVar = r7qVar3.d;
                return new jw2((lzn0) teqVar.i.get(), (gw70) r7qVar3.b.d8.get(), (rzo) teqVar.Pb.get(), zob1Var, d6g1Var, mt31Var);
        }
    }
}
