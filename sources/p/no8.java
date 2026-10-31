package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class no8 implements fqw {
    public final /* synthetic */ po8 a;

    public no8(po8 po8Var) {
        this.a = po8Var;
    }

    public final laa a(fai0 fai0Var) {
        po8 po8Var = this.a;
        jeq jeqVar = po8Var.e;
        d0r d0rVar = po8Var.d;
        xzq xzqVar = new xzq(po8Var.f.a(d0rVar), new mo8(po8Var, (byte) 2));
        fdc fdcVar = po8Var.g;
        d2q d2qVar = (d2q) fdcVar.f;
        String str = po8Var.c.a;
        smc0 smc0VarN = k4p1.n();
        f2p f2pVar = (f2p) fdcVar.d;
        d0r d0rVar2 = (d0r) fdcVar.c;
        smc0VarN.add(new xzq(f2pVar.a(d0rVar2), new wk3(str, (byte) 24)));
        s1p s1pVar = (s1p) fdcVar.e;
        fns fnsVar = igu.a;
        smc0VarN.add(new xzq(s1pVar.a(fnsVar, d0rVar2), new wk3(str, (byte) 25)));
        boolean z = fdcVar.b;
        if (!z) {
            smc0VarN.add(new xzq(d2qVar.a(fnsVar, d0rVar2), new go8(str, rcm.a, (byte) 0)));
        }
        return new wzq(jeq.a(jeqVar, d0rVar, xzqVar, k4p1.k(smc0VarN), z ? new xzq(d2qVar.a(fnsVar, d0rVar2), new go8(str, tcm.a, (byte) 0)) : null, 170), oc8.S0);
    }
}
