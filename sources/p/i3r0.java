package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class i3r0 implements yfr0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zl5 b;

    public /* synthetic */ i3r0(zl5 zl5Var, byte b) {
        this.a = b;
        this.b = zl5Var;
    }

    public final rfr0 a(int i, String str, zob1 zob1Var) {
        s4b1 s4b1VarX;
        byte b = this.a;
        sua suaVar = ey71.a;
        z6x z6xVar = z6x.a;
        switch (b) {
            case 0:
                zl5 zl5Var = this.b;
                return new rfr0(d5p1.t(new x010(((v8n0) zl5Var.k).a(), zob1Var, new e3r0(str, zl5Var, i, (lnm) null, (byte) 1), (byte) 1), (u9c0) zl5Var.o, suaVar, z6xVar), false);
            case 1:
                zl5 zl5Var2 = this.b;
                return new rfr0(d5p1.t(new d3r0(zob1Var, zl5Var2, str, i, (byte) 12), (u9c0) zl5Var2.o, suaVar, zl5Var2.t(i, str, (ioj0) zob1Var.getValue())), false);
            default:
                zl5 zl5Var3 = this.b;
                xf4 xf4Var = (xf4) zl5Var3.i;
                oev0 oev0Var = (oev0) zl5Var3.r;
                u9c0 u9c0Var = (u9c0) zl5Var3.o;
                try {
                    Set set = s4b1.f;
                    s4b1VarX = uic.x(str);
                    break;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    s4b1VarX = null;
                }
                if ((s4b1VarX != null ? s4b1VarX.c : null) != blc0.u1) {
                    return new rfr0(gio1.b(z6xVar), false);
                }
                fu20 fu20Var = new fu20(new x010((xe01) new haa0(((r5b0) ((ynb0) zl5Var3.q).get()).a, s4b1VarX.h(), u9c0Var, new c1v0(oev0Var.e, (byte) 4)).d, rqt0.u(new ld2(zob1Var, str, (byte) 25)), new dwf0(tnt0.T0, (lnm) null, (byte) 11), (byte) 1), new e3p0(zl5Var3, (lnm) null, (byte) 16), (byte) 1);
                boolean z = xf4Var.o() && xf4Var.p();
                p811 p811Var = new p811();
                p811 p811Var2 = new p811();
                p811 p811Var3 = new p811();
                yqu0 yqu0Var = (yqu0) oev0Var.a.c;
                p811Var3.a = ((aev0) ((xe01) yqu0Var.b).a.getValue()).b;
                return new rfr0(d5p1.t(new x010(new iib(new ht20(rqt0.u(new x010(fu20Var, (xe01) yqu0Var.b, new kdk(oev0Var, p811Var3, z, p811Var, new n811(), p811Var2, (lnm) null), (byte) 1)), new kdt0(oev0Var, (lnm) null, (byte) 4)), new xx0(oev0Var, (lnm) null, (byte) 16), (byte) 6), zob1Var, new p4r0(zl5Var3, str, i, (lnm) null, (byte) 1), (byte) 1), u9c0Var, new alb1(0L, Long.MAX_VALUE), zl5.E(zl5Var3, (ioj0) zob1Var.getValue(), str, i, null)), true);
        }
    }
}
