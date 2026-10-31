package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rk11 {
    public final /* synthetic */ tvp a;

    public rk11(tvp tvpVar) {
        this.a = tvpVar;
    }

    public static Set b(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return f46.S0(new aq21[]{new zp21(jo70.class), new yp21(xkk1.class)});
        }
        if (iC == 1) {
            return f46.S0(new yp21[]{new yp21(jo70.class), new yp21(xkk1.class), new yp21(hll.class), new yp21(a7q0.class), new yp21(pnt.class), new yp21(l98.class)});
        }
        eg.o();
        return null;
    }

    public final xpw a(zob1 zob1Var, maa maaVar, int i) {
        kdy0 kdy0Var;
        kdy0 kdy0Var2;
        tvp tvpVar = this.a;
        switch (tvpVar.a) {
            case 0:
                nwp nwpVar = (nwp) ((gbp) tvpVar.b).c;
                gw70 gw70VarA0 = nwpVar.a.a0();
                c8o.l(gw70VarA0);
                kdy0Var = new kdy0(gw70VarA0, (lzn0) nwpVar.G.get(), zob1Var, maaVar, (byte) 17);
                kdy0Var2 = kdy0Var;
                break;
            case 1:
                thq thqVar = (thq) tvpVar.b;
                kdy0Var = new kdy0((gw70) thqVar.b.d8.get(), (lzn0) ((v5q) thqVar.c).U0.get(), zob1Var, maaVar, (byte) 17);
                kdy0Var2 = kdy0Var;
                break;
            default:
                r7q r7qVar = tvpVar.b;
                kdy0Var2 = new kdy0((gw70) r7qVar.b.d8.get(), (lzn0) r7qVar.d.i.get(), zob1Var, maaVar, (byte) 17);
                break;
        }
        maa maaVar2 = (maa) kdy0Var2.b;
        zob1 zob1Var2 = (zob1) kdy0Var2.e;
        lzn0 lzn0Var = (lzn0) kdy0Var2.d;
        gw70 gw70Var = (gw70) kdy0Var2.c;
        int iC = l1d.C(i);
        if (iC != 0) {
            if (iC == 1) {
                return new et90(gw70Var, lzn0Var, zob1Var2, maaVar2);
            }
            eg.o();
            return null;
        }
        c8o.l(gw70Var);
        c8o.l(lzn0Var);
        c8o.l(zob1Var2);
        return new izg(gw70Var, lzn0Var, zob1Var2, maaVar2);
    }
}
