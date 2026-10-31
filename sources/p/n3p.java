package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n3p implements l6k1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ n3p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    @Override // p.l6k1
    public final o6k1 a(hcf1 hcf1Var, iac0 iac0Var, a9l1 a9l1Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                s3p s3pVar = (s3p) ((b2p) r7qVar).c;
                b2p b2pVar = (b2p) s3pVar.d1;
                vtm0 vtm0Var = (vtm0) ((jly0) s3pVar.f).get();
                luk lukVar = (luk) ((i7c) s3pVar.X0).m.get();
                c8o.l(lukVar);
                i3b i3bVar = new i3b(new w75(lukVar), (byte) 8);
                lzn0 lzn0VarC = ((i7c) s3pVar.X0).c();
                c8o.l(lzn0VarC);
                gw70 gw70VarB = ((i7c) s3pVar.X0).b();
                c8o.l(gw70VarB);
                return new o6k1(b2pVar, vtm0Var, i3bVar, lzn0VarC, gw70VarB, hcf1Var, iac0Var, a9l1Var);
            case 1:
                d4p d4pVar = (d4p) ((b2p) r7qVar).c;
                b2p b2pVar2 = d4pVar.C;
                vtm0 vtm0Var2 = (vtm0) d4pVar.D.get();
                luk lukVarC = d4pVar.a.c();
                c8o.l(lukVarC);
                i3b i3bVar2 = new i3b(new w75(lukVarC), (byte) 8);
                lzn0 lzn0VarI = d4pVar.a.i();
                c8o.l(lzn0VarI);
                gw70 gw70VarB2 = d4pVar.a.b();
                c8o.l(gw70VarB2);
                return new o6k1(b2pVar2, vtm0Var2, i3bVar2, lzn0VarI, gw70VarB2, hcf1Var, iac0Var, a9l1Var);
            case 2:
                nwp nwpVar = (nwp) ((gbp) r7qVar).c;
                gbp gbpVar = nwpVar.h1;
                vtm0 vtm0Var3 = (vtm0) nwpVar.i1.get();
                i3b i3bVar3 = new i3b(new w75((luk) nwpVar.g.get()), (byte) 8);
                lzn0 lzn0Var = (lzn0) nwpVar.G.get();
                gw70 gw70VarA0 = nwpVar.a.a0();
                c8o.l(gw70VarA0);
                return new o6k1(gbpVar, vtm0Var3, i3bVar3, lzn0Var, gw70VarA0, hcf1Var, iac0Var, a9l1Var);
            case 3:
                thq thqVar = (thq) r7qVar;
                v5q v5qVar = thqVar.c;
                return new o6k1(v5qVar.C9, (vtm0) v5qVar.D9.get(), new i3b(new w75((luk) v5qVar.b.L1.get()), (byte) 8), (lzn0) v5qVar.U0.get(), (gw70) thqVar.b.d8.get(), hcf1Var, iac0Var, a9l1Var);
            default:
                r7q r7qVar2 = r7qVar;
                teq teqVar = r7qVar2.d;
                return new o6k1(teqVar.Da, (vtm0) teqVar.Ea.get(), new i3b(new w75((luk) teqVar.d.L1.get()), (byte) 8), (lzn0) teqVar.i.get(), (gw70) r7qVar2.b.d8.get(), hcf1Var, iac0Var, a9l1Var);
        }
    }
}
