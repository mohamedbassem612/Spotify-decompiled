package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f9a1 extends hab0 implements bv30 {
    public final /* synthetic */ Object N0;
    public final /* synthetic */ Object O0;
    public final /* synthetic */ tyq P0;
    public final /* synthetic */ Object Q0;
    public final /* synthetic */ Object R0;
    public final /* synthetic */ r6h1 X;
    public final /* synthetic */ cm0 Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ ttm0 b;
    public final /* synthetic */ rea1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ngs0 f;
    public final /* synthetic */ na9 g;
    public final /* synthetic */ d0r h;
    public final /* synthetic */ hvp0 i;
    public final /* synthetic */ xyf1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9a1(d0r d0rVar, hvp0 hvp0Var, lik1 lik1Var, xyf1 xyf1Var, wks wksVar, hw2 hw2Var, w6a1 w6a1Var, cm0 cm0Var, rea1 rea1Var, njm njmVar, boolean z, boolean z2, ngs0 ngs0Var, na9 na9Var, b9u0 b9u0Var, r6h1 r6h1Var, ttm0 ttm0Var) {
        super(5);
        this.h = d0rVar;
        this.i = hvp0Var;
        this.Z = lik1Var;
        this.t = xyf1Var;
        this.N0 = wksVar;
        this.O0 = hw2Var;
        this.P0 = w6a1Var;
        this.Y = cm0Var;
        this.c = rea1Var;
        this.Q0 = njmVar;
        this.d = z;
        this.e = z2;
        this.f = ngs0Var;
        this.g = na9Var;
        this.R0 = b9u0Var;
        this.X = r6h1Var;
        this.b = ttm0Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        lik1 lik1Var;
        Object obj6;
        boolean z;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj7 = this.R0;
        Object obj8 = this.Q0;
        xzq xzqVar = this.P0;
        Object obj9 = this.O0;
        Object obj10 = this.N0;
        Object obj11 = this.Z;
        ttm0 ttm0Var = this.b;
        o6x o6xVar = o6x.a;
        switch (b) {
            case 0:
                w6a1 w6a1Var = (w6a1) xzqVar;
                hw2 hw2Var = (hw2) obj9;
                lik1 lik1Var2 = (lik1) obj11;
                x8a1 x8a1Var = (x8a1) obj2;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                Object obj12 = fkj0.X;
                long j = x8a1Var.a;
                c380<sic1> c380Var = x8a1Var.c;
                if ((iIntValue & 48) == 0) {
                    iIntValue |= x340Var.g(x8a1Var) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
                    Object objT = x340Var2.T();
                    if (objT == obj12) {
                        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                        for (sic1 sic1Var : c380Var) {
                            lik1 lik1Var3 = lik1Var2;
                            arrayList.add(new h8k1(sic1Var, sic1Var));
                            obj7 = obj7;
                            lik1Var2 = lik1Var3;
                        }
                        lik1Var = lik1Var2;
                        obj6 = obj7;
                        objT = gio1.b(arrayList);
                        x340Var2.s0(objT);
                    } else {
                        lik1Var = lik1Var2;
                        obj6 = obj7;
                    }
                    wen0 wen0Var = (wen0) objT;
                    int i = iIntValue & 112;
                    boolean zI = x340Var2.i(wen0Var) | (i == 32);
                    Object objT2 = x340Var2.T();
                    if (zI || objT2 == obj12) {
                        objT2 = new wp41(wen0Var, x8a1Var, (lnm) null, (byte) 22);
                        x340Var2.s0(objT2);
                    }
                    qxd0.t(x8a1Var, x340Var2, (vu30) objT2);
                    Object objT3 = x340Var2.T();
                    if (objT3 == obj12) {
                        objT3 = qxd0.M(o6xVar, x340Var2);
                        x340Var2.s0(objT3);
                    }
                    c9n c9nVar = (c9n) objT3;
                    Object objT4 = x340Var2.T();
                    if (objT4 == obj12) {
                        objT4 = new kkw0(ttm0Var, c9nVar);
                        x340Var2.s0(objT4);
                    }
                    kkw0 kkw0Var = (kkw0) objT4;
                    iac0 iac0Var = (iac0) x340Var2.k(jfe0.a);
                    na9 na9Var = this.g;
                    ngs0 ngs0Var = this.f;
                    rea1 rea1Var = this.c;
                    if (c380Var == null || !c380Var.isEmpty()) {
                        for (sic1 sic1Var2 : c380Var) {
                            if ((sic1Var2 instanceof mic1) || (sic1Var2 instanceof iic1) || (sic1Var2 instanceof lic1) || (sic1Var2 instanceof nic1)) {
                                x340Var2.i0(500929413);
                                dsa0.k(new u7h(j), this.h, this.i, lik1Var, wen0Var, this.t, (wks) obj10, iac0Var, kkw0Var, hw2Var, w6a1Var, this.Y, rea1Var, (njm) obj8, x8a1Var.b, this.d, this.e, ngs0Var, na9Var, (b9u0) obj6, this.X, x340Var2, 100663296);
                                x340Var2.r(false);
                                break;
                            }
                        }
                        x340Var2.i0(502001889);
                        dsa0.e(new u7h(j), x8a1Var, lik1Var, hw2Var, w6a1Var, this.Y, rea1Var, x8a1Var.b, this.d, this.e, ngs0Var, na9Var, x340Var2, i | 262144);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(502001889);
                        dsa0.e(new u7h(j), x8a1Var, lik1Var, hw2Var, w6a1Var, this.Y, rea1Var, x8a1Var.b, this.d, this.e, ngs0Var, na9Var, x340Var2, i | 262144);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                break;
            default:
                jm6 jm6Var = (jm6) obj2;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                if ((iIntValue2 & 48) == 0) {
                    z = true;
                    iIntValue2 |= x340Var3.g(jm6Var) ? 32 : 16;
                } else {
                    z = true;
                }
                int i2 = iIntValue2;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(i2 & 1, (i2 & 1041) != 1040 ? z : false)) {
                    Object objT5 = x340Var4.T();
                    Object obj13 = fkj0.X;
                    if (objT5 == obj13) {
                        objT5 = gio1.b(jm6Var);
                        x340Var4.s0(objT5);
                    }
                    wen0 wen0Var2 = (wen0) objT5;
                    boolean z2 = !jm6Var.b.isEmpty();
                    boolean zI2 = x340Var4.i(wen0Var2) | ((i2 & 112) == 32 ? z : false);
                    Object objT6 = x340Var4.T();
                    if (zI2 || objT6 == obj13) {
                        objT6 = new kwb1(wen0Var2, jm6Var, null, (byte) 19);
                        x340Var4.s0(objT6);
                    }
                    qxd0.t(jm6Var, x340Var4, (vu30) objT6);
                    Object objT7 = x340Var4.T();
                    if (objT7 == obj13) {
                        objT7 = qxd0.M(o6xVar, x340Var4);
                        x340Var4.s0(objT7);
                    }
                    c9n c9nVar2 = (c9n) objT7;
                    Object objT8 = x340Var4.T();
                    if (objT8 == obj13) {
                        objT8 = new kkw0(ttm0Var, c9nVar2);
                        x340Var4.s0(objT8);
                    }
                    kkw0 kkw0Var2 = (kkw0) objT8;
                    iac0 iac0Var2 = (iac0) x340Var4.k(jfe0.a);
                    Object objT9 = x340Var4.T();
                    if (objT9 == obj13) {
                        xh71 xh71Var = ((ab71) ((lbq) ((frq) ((jly0) this.c.a.c).get()).a.b).b).a;
                        c8o.l(xh71Var);
                        ngs0 ngs0Var2 = new ngs0(xh71Var);
                        x340Var4.s0(ngs0Var2);
                        objT9 = ngs0Var2;
                    }
                    irn1.u((qim0) null, apo.r(1700528057, new ddh1(this.d, this.e, this.f, z2, jm6Var, (maa) objT9, this.g), x340Var4), (vu30) null, (erl1) null, apo.r(-569552129, new xka(jm6Var, (xzq) obj11, this.h, (fos) obj10, (kt91) obj9, xzqVar, (hw2) obj8, this.i, wen0Var2, (mjm) obj7, this.t, this.X, iac0Var2, kkw0Var2, this.Y, (byte) 2), x340Var4), x340Var4, 24624, 13);
                } else {
                    x340Var4.b0();
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9a1(ttm0 ttm0Var, rea1 rea1Var, boolean z, boolean z2, ngs0 ngs0Var, na9 na9Var, xzq xzqVar, d0r d0rVar, fos fosVar, kt91 kt91Var, xzq xzqVar2, hw2 hw2Var, hvp0 hvp0Var, mjm mjmVar, xyf1 xyf1Var, r6h1 r6h1Var, cm0 cm0Var) {
        super(5);
        this.b = ttm0Var;
        this.c = rea1Var;
        this.d = z;
        this.e = z2;
        this.f = ngs0Var;
        this.g = na9Var;
        this.Z = xzqVar;
        this.h = d0rVar;
        this.N0 = fosVar;
        this.O0 = kt91Var;
        this.P0 = xzqVar2;
        this.Q0 = hw2Var;
        this.i = hvp0Var;
        this.R0 = mjmVar;
        this.t = xyf1Var;
        this.X = r6h1Var;
        this.Y = cm0Var;
    }
}
