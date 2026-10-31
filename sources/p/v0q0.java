package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v0q0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y0q0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0q0(y0q0 y0q0Var, byte b) {
        super(1);
        this.a = b;
        this.b = y0q0Var;
    }

    public final Object invoke(Object obj) {
        String str;
        byte b = this.a;
        y0q0 y0q0Var = this.b;
        switch (b) {
            case 0:
                p0q0 p0q0Var = (p0q0) obj;
                ll30 ll30Var = y0q0Var.e;
                o3r o3rVar = y0q0Var.h;
                j1q0 j1q0VarK = rc2.K(p0q0Var);
                iu30 iu30Var = y0q0Var.g;
                mr20 mr20Var = iu30Var != null ? (mr20) iu30Var.invoke(rc2.y(p0q0Var)) : null;
                d0r d0rVar = y0q0Var.a;
                return mr20Var != null ? h5p1.s(d3p1.H(d0rVar, o3rVar, j1q0VarK), mr20Var, ll30Var.b, new sv8(y0q0Var, p0q0Var, (lnm) null, (byte) 6)) : new x010(d3p1.H(d0rVar, o3rVar, j1q0VarK), ll30Var.b, new t83(y0q0Var, p0q0Var, (lnm) null, (byte) 8), (byte) 1);
            case 1:
                p0q0 p0q0Var2 = (p0q0) obj;
                u0q0 u0q0Var = (u0q0) u890.k(x2p1.n(y0q0Var.a, y0q0Var.h, rc2.K(p0q0Var2)), (d0r) null, (n4r) null);
                String strY = rc2.y(p0q0Var2);
                String str2 = u0q0Var.c.a;
                y4m y4mVar = u0q0Var.a;
                r840 r840Var = u0q0Var.b;
                ast0 ast0Var = u0q0Var.d;
                j82 j82VarA = p0q0Var2.a();
                boolean z = u0q0Var.c.b;
                String strY2 = rc2.y(p0q0Var2);
                Set set = (Set) y0q0Var.e.b.a.getValue();
                j840 j840Var = r840Var instanceof j840 ? (j840) r840Var : null;
                if (j840Var != null && (str = j840Var.b) != null) {
                    strY2 = str;
                }
                return new q0q0(strY, str2, y4mVar, r840Var, ast0Var, j82VarA, h0q0.a, z, set.contains(strY2));
            default:
                ((qtr) obj).b(new lcm(y0q0Var, (lnm) null, (byte) 11));
                return rih1.a;
        }
    }
}
