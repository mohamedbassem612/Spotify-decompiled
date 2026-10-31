package p;

import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t4q implements pj3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ t4q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    @Override // p.pj3
    public final oj3 a(r290 r290Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                thq thqVar = (thq) r7qVar;
                v5q v5qVar = (v5q) thqVar.c;
                v5qVar.getClass();
                h380 h380VarB = j380.b(8);
                blc0 blc0Var = blc0.M3;
                daq daqVar = v5qVar.b;
                h380VarB.e(blc0Var, daqVar.E());
                h380VarB.e(blc0.Pg, new k3z((byte) 0, false));
                h380VarB.e(blc0.C8, new k3z((byte) 1, false));
                h380VarB.e(blc0.ed, new img((xrm1) daqVar.l7.get(), (byte) 1));
                h380VarB.e(blc0.fh, new img((p981) daqVar.i8.get(), (byte) 2));
                h380VarB.e(blc0.ti, new xmf1((agc0) daqVar.B7.get(), (nwf1) v5qVar.m5.get()));
                h380VarB.e(blc0.yi, new img((agc0) daqVar.B7.get(), (byte) 3));
                h380VarB.e(blc0.zi, new img((agc0) daqVar.B7.get(), (byte) 3));
                jnq jnqVar = new jnq(new a0m(h380VarB.b(true), (byte) 28), daqVar.X(), daqVar.O(), new rjn(daqVar.R(), (byte) 19), new lqc((byte) 3, false));
                daq daqVar2 = thqVar.b;
                return new oj3(jnqVar, Optional.of(daqVar2.s8), (q8n) daqVar2.E1.get(), r290Var);
            default:
                r7q r7qVar2 = r7qVar;
                teq teqVar = r7qVar2.d;
                teqVar.getClass();
                h380 h380VarB2 = j380.b(8);
                blc0 blc0Var2 = blc0.M3;
                daq daqVar3 = teqVar.d;
                h380VarB2.e(blc0Var2, daqVar3.E());
                h380VarB2.e(blc0.Pg, new k3z((byte) 0, false));
                h380VarB2.e(blc0.C8, new k3z((byte) 1, false));
                h380VarB2.e(blc0.ed, new img((xrm1) daqVar3.l7.get(), (byte) 1));
                h380VarB2.e(blc0.fh, new img((p981) daqVar3.i8.get(), (byte) 2));
                h380VarB2.e(blc0.ti, new xmf1((agc0) daqVar3.B7.get(), (nwf1) teqVar.b1.get()));
                h380VarB2.e(blc0.yi, daqVar3.e2());
                h380VarB2.e(blc0.zi, daqVar3.e2());
                jnq jnqVar2 = new jnq(new a0m(h380VarB2.b(true), (byte) 28), daqVar3.X(), daqVar3.O(), new rjn(daqVar3.R(), (byte) 19), new lqc((byte) 3, false));
                daq daqVar4 = r7qVar2.b;
                return new oj3(jnqVar2, Optional.of(daqVar4.s8), (q8n) daqVar4.E1.get(), r290Var);
        }
    }
}
