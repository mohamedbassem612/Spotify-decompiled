package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y9n0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p1f0 b;
    public final /* synthetic */ d0r c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y9n0(p1f0 p1f0Var, d0r d0rVar, byte b) {
        super(1);
        this.a = b;
        this.b = p1f0Var;
        this.c = d0rVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d0r d0rVar = this.c;
        p1f0 p1f0Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x9n0 x9n0Var = new x9n0(p1f0Var, (byte) 0);
                l9n0 l9n0Var = l9n0.i;
                b5n0 b5n0Var = b5n0.Y;
                LinkedHashMap linkedHashMap = ((ji50) obj).b;
                linkedHashMap.put(r9n0.class, r4o1.P(l9n0Var, w7x.a, x9n0Var, b5n0Var));
                c21 c21Var = (c21) ((ptp) p1f0Var.b).a.c;
                ynb0 ynb0VarA = xqu.a((bsp) c21Var.g);
                gw70 gw70Var = (gw70) ((z9n0) c21Var.b).j.get();
                c8o.l(gw70Var);
                linkedHashMap.put(s9n0.class, new r3r(new xzq(new qlb(ynb0VarA, gw70Var, d0rVar), l9n0.t), b5n0.X, 4));
                x9n0 x9n0Var2 = new x9n0(p1f0Var, (byte) 1);
                linkedHashMap.put(t9n0.class, r4o1.Q(l9n0.Y, f46.S0(new yp21[]{new yp21(gw81.class), new yp21(xkk1.class)}), x9n0Var2, b5n0.Z));
                break;
            default:
                two1.v((dnc0) obj, new m441(new ian0((kqi0) p1f0Var.c, (lnm) null, (byte) 0)), false, new y9n0(p1f0Var, d0rVar, b2));
                break;
        }
        return rih1Var;
    }
}
