package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p880 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q880 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p880(q880 q880Var, byte b) {
        super(4);
        this.a = b;
        this.b = q880Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue;
        sg90 sg90Var;
        String strF;
        byte b = this.a;
        q880 q880Var = this.b;
        switch (b) {
            case 0:
                jjm0 jjm0Var = (jjm0) obj;
                int iIntValue = ((Number) obj4).intValue();
                x340 x340Var = (b0k) obj3;
                x340Var.i0(-2140168612);
                r880 r880Var = q880Var.a;
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = q880Var.c.a(r880Var.b, (Long) null, mdg1.b);
                    x340Var.s0(objT);
                }
                dj41 dj41Var = (dj41) objT;
                boolean zI = x340Var.i(q880Var) | x340Var.i(dj41Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new sv8(q880Var, dj41Var, (lnm) null, (byte) 3);
                    x340Var.s0(objT2);
                }
                jjm0Var.a((zu30) objT2, x340Var, (iIntValue << 3) & 112);
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = q880Var.d.a(dj41Var.k, true);
                    x340Var.s0(objT3);
                }
                ven0 ven0VarG = rwq.g((mr20) objT3, gi41.b, (o8n) null, x340Var, 0, 2);
                if (q880Var.h.a() && ((sg90Var = r880Var.c) == null || sg90Var.equals(pg90.a))) {
                    x340Var.i0(1028217286);
                    Object objT4 = x340Var.T();
                    if (objT4 == m4cVar) {
                        objT4 = d3p1.F(q880Var.i, q880.Z, r880Var.b);
                        x340Var.s0(objT4);
                    }
                    i1r i1rVar = (k1r) rwq.h((zob1) objT4, x340Var, 0).getValue();
                    if (i1rVar instanceof i1r) {
                        zBooleanValue = ((Boolean) i1rVar.a).booleanValue();
                    } else {
                        if (!(i1rVar instanceof h1r) && !u890.j(i1rVar, j1r.a)) {
                            eg.o();
                            return null;
                        }
                        zBooleanValue = false;
                    }
                    x340Var.r(false);
                } else {
                    x340Var.i0(1028654603);
                    x340Var.r(false);
                    zBooleanValue = false;
                }
                m880 m880Var = new m880((ji41) ven0VarG.getValue(), zBooleanValue);
                x340Var.r(false);
                return m880Var;
            default:
                lkl0 lkl0Var = (lkl0) obj;
                n880 n880Var = (n880) obj3;
                h880 h880Var = (k880) obj4;
                if (h880Var instanceof h880) {
                    h880 h880Var2 = h880Var;
                    r880 r880Var2 = q880Var.a;
                    return lkl0Var.e(dj20.d(16, r880Var2.a, zjy.r(h880Var2.a), h880Var2.b, r880Var2.c));
                }
                if (!(h880Var instanceof i880) || (strF = q880Var.f((i880) h880Var, n880Var)) == null) {
                    return null;
                }
                return lkl0Var.e(strF);
        }
    }
}
