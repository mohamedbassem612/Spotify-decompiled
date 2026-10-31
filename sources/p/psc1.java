package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class psc1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tva1 b;
    public final /* synthetic */ msc1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ psc1(tva1 tva1Var, msc1 msc1Var, byte b) {
        super(2);
        this.a = b;
        this.b = tva1Var;
        this.c = msc1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        xnb xnbVar;
        byte b = this.a;
        msc1 msc1Var = this.c;
        rih1 rih1Var = rih1.a;
        tva1 tva1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                d0r d0rVar = tva1Var.b;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i1o1.e(((axo) tva1Var.f).a(d0rVar, u291.r(nim0.a, 248.0f)), new w27(msc1Var.a.b), d0rVar, (qim0) null, (ipb1) null, wlj.a, (xu30) null, 0, (xu30) null, x340Var2, 196616, 236);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                d0r d0rVar2 = tva1Var.b;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ugx0 ugx0VarA = ((bxo) tva1Var.g).a(d0rVar2, false);
                    lsc1 lsc1Var = msc1Var.a;
                    i1o1.e(ugx0VarA, new rgx0(lsc1Var.d, lsc1Var.e, lsc1Var.b, lsc1Var.c), d0rVar2, (qim0) null, (ipb1) null, wlj.b, (xu30) null, 0, (xu30) null, x340Var4, 196616, 236);
                    i1o1.e(((cxo) tva1Var.t).a(d0rVar2), new hle(lsc1Var.c, false), d0rVar2, (qim0) null, (ipb1) null, wlj.c, (xu30) null, 0, (xu30) null, x340Var4, 196616, 236);
                    if (((w8r0) tva1Var.N0).a()) {
                        x340Var4.i0(2026240007);
                        switch (((hlp) tva1Var.X).a) {
                            case 0:
                                xnbVar = new xnb(d0rVar2, (byte) 3);
                                break;
                            default:
                                xnbVar = new xnb(d0rVar2, (byte) 3);
                                break;
                        }
                        i1o1.e(xnbVar, new hbh0(Long.valueOf(lsc1Var.e + lsc1Var.d), lsc1Var.b, ""), d0rVar2, (qim0) null, (ipb1) null, wlj.d, (xu30) null, 0, (xu30) null, x340Var4, 196616, 236);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(2026794504);
                        x340Var4.r(false);
                    }
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    q7r0 q7r0Var = (q7r0) tva1Var.O0;
                    jsq jsqVar = (jsq) tva1Var.h;
                    ksq ksqVar = (ksq) tva1Var.i;
                    uep uepVar = (uep) tva1Var.Y;
                    k740 k740Var = (k740) tva1Var.P0;
                    if (k740Var == null) {
                        u890.C("gatedContentService");
                        throw null;
                    }
                    stt0 stt0Var = (stt0) tva1Var.Q0;
                    if (stt0Var == null) {
                        u890.C("playabilityService");
                        throw null;
                    }
                    rqo1.c(q7r0Var, this.c, jsqVar, ksqVar, uepVar, k740Var, stt0Var, tva1Var.b, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }
}
