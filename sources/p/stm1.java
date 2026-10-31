package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class stm1 implements mtm1 {
    public final /* synthetic */ byte a;
    public final ley b;
    public final g37 c;
    public final ryq d;
    public final Object e;

    public /* synthetic */ stm1(ley leyVar, g37 g37Var, ryq ryqVar, Object obj, byte b) {
        this.a = b;
        this.b = leyVar;
        this.c = g37Var;
        this.d = ryqVar;
        this.e = obj;
    }

    @Override // p.mtm1
    public final String a(mhy mhyVar) {
        switch (this.a) {
            case 0:
                break;
        }
        return l1d.m("entity_", ((bhy) mhyVar).b.a);
    }

    @Override // p.mtm1
    public final kpg0 b(ft30 ft30Var) {
        tm tmVar;
        pt ptVar;
        pt ptVar2;
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                aip aipVar = (aip) obj;
                switch (aipVar.a) {
                    case 0:
                        fip fipVar = (fip) aipVar.b.c;
                        tmVar = new tm(ft30Var, new lls0(fipVar.d, false, (byte) 20), fipVar.a());
                        break;
                    case 1:
                        lvq lvqVar = (lvq) ((tsq) aipVar.b).c;
                        q7r0 q7r0Var = lvqVar.d;
                        z0t z0tVarA0 = lvqVar.b.a0();
                        c8o.l(z0tVarA0);
                        tmVar = new tm(ft30Var, new lls0(q7r0Var, z0tVarA0.a.m(), (byte) 20), lvqVar.b());
                        break;
                    default:
                        ovq ovqVar = (ovq) ((tsq) aipVar.b).c;
                        tmVar = new tm(ft30Var, new lls0(ovqVar.c, false, (byte) 20), ovqVar.a());
                        break;
                }
                return new kpg0(tmVar, new c4m1(this, (byte) 13));
            default:
                bip bipVar = (bip) obj;
                byte b2 = 6;
                switch (bipVar.a) {
                    case 0:
                        fip fipVar2 = (fip) bipVar.b.c;
                        evm1 evm1VarI = fipVar2.i();
                        Context context = fipVar2.b.context();
                        c8o.l(context);
                        n4b n4bVar = new n4b(context.getApplicationContext());
                        q130 q130Var = fipVar2.b;
                        Context context2 = q130Var.context();
                        c8o.l(context2);
                        jtl1 jtl1VarF = q130Var.f();
                        c8o.l(jtl1VarF);
                        ptVar = new pt(ft30Var, evm1VarI, n4bVar, new na(context2, jtl1VarF, b2), new lls0(fipVar2.d, false, (byte) 20), fipVar2.a());
                        ptVar2 = ptVar;
                        break;
                    case 1:
                        lvq lvqVar2 = (lvq) ((tsq) bipVar.b).c;
                        evm1 evm1VarN = lvqVar2.n();
                        n4b n4bVar2 = new n4b(lvqVar2.a());
                        kvm1 kvm1Var = lvqVar2.b;
                        Context context3 = kvm1Var.context();
                        c8o.l(context3);
                        jtl1 jtl1VarF2 = kvm1Var.f();
                        c8o.l(jtl1VarF2);
                        na naVar = new na(context3, jtl1VarF2, b2);
                        q7r0 q7r0Var2 = lvqVar2.d;
                        z0t z0tVarA1 = kvm1Var.a0();
                        c8o.l(z0tVarA1);
                        ptVar = new pt(ft30Var, evm1VarN, n4bVar2, naVar, new lls0(q7r0Var2, z0tVarA1.a.m(), (byte) 20), lvqVar2.b());
                        ptVar2 = ptVar;
                        break;
                    default:
                        ovq ovqVar2 = (ovq) ((tsq) bipVar.b).c;
                        evm1 evm1VarI2 = ovqVar2.i();
                        Context context4 = ovqVar2.b.context();
                        c8o.l(context4);
                        n4b n4bVar3 = new n4b(context4.getApplicationContext());
                        xvm1 xvm1Var = ovqVar2.b;
                        Context context5 = xvm1Var.context();
                        c8o.l(context5);
                        jtl1 jtl1VarF3 = xvm1Var.f();
                        c8o.l(jtl1VarF3);
                        ptVar2 = new pt(ft30Var, evm1VarI2, n4bVar3, new na(context5, jtl1VarF3, b2), new lls0(ovqVar2.c, false, (byte) 20), ovqVar2.a());
                        break;
                }
                return new kpg0(ptVar2, new c4m1(this, (byte) 14));
        }
    }
}
