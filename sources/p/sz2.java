package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sz2 extends hab0 implements zu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ zwt0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ h72 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz2(h72 h72Var, zwt0 zwt0Var, float f) {
        super(4);
        this.d = h72Var;
        this.b = zwt0Var;
        this.c = f;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0114  */
    /* JADX WARN: Code duplicated, block: B:40:0x0118  */
    /* JADX WARN: Code duplicated, block: B:41:0x011a  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        fqg0 fqg0VarO;
        byte b = this.a;
        float f = this.c;
        zwt0 zwt0Var = this.b;
        nim0 nim0Var = nim0.a;
        h72 h72Var = this.d;
        fqg0 fqg0VarO2 = null;
        switch (b) {
            case 0:
                mxt0 mxt0Var = (mxt0) obj2;
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                if (((iIntValue & 112) ^ 48) > 32) {
                    if (x340Var.e(mxt0Var.ordinal())) {
                        z = true;
                    } else if ((iIntValue & 48) == 32) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if ((iIntValue & 48) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                x340 x340Var2 = x340Var;
                boolean zG = z | x340Var2.g(h72Var);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    xfx xfxVar = (xfx) h72Var.b;
                    int iOrdinal = mxt0Var.ordinal();
                    if (iOrdinal == 0) {
                        fqg0VarO2 = h72.o(((s691) ((kly0) h72Var.d).get()).a(voo1.s(xfxVar)));
                    } else if (iOrdinal == 1) {
                        fqg0VarO2 = h72.o(((k691) ((kly0) h72Var.e).get()).a(voo1.r(xfxVar)));
                    } else if (iOrdinal == 2) {
                        fqg0VarO2 = h72.o((laa) ((kly0) h72Var.f).get());
                    } else if (iOrdinal == 3) {
                        fqg0VarO2 = h72.o(new jpg0((laa) ((kly0) h72Var.g).get(), fw2.d1));
                    } else if (iOrdinal != 4) {
                        eg.o();
                        return null;
                    }
                    x340Var2.s0(fqg0VarO2);
                    objT = fqg0VarO2;
                }
                xpw xpwVar = (xpw) objT;
                qim0 qim0VarR = u291.r(anm1.N(zwt0Var.a, nim0Var), f);
                rih1 rih1Var = rih1.a;
                if (xpwVar != null) {
                    x340Var2.i0(-1801825208);
                    otw.c(xpwVar, rih1Var, qim0VarR, (ipb1) null, x340Var2, 48, 8);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1801738439);
                    op71.g(x340Var2, qim0VarR);
                    x340Var2.r(false);
                }
                return rih1Var;
            default:
                nxt0 nxt0Var = (nxt0) obj2;
                x340 x340Var3 = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                qim0 qim0VarR2 = u291.r(anm1.N(zwt0Var.a, nim0Var), f);
                rih1 rih1Var2 = rih1.a;
                if (nxt0Var != null) {
                    x340 x340Var4 = x340Var3;
                    x340Var4.i0(-163717395);
                    boolean zG2 = ((((iIntValue2 & 112) ^ 48) > 32 && x340Var4.e(nxt0Var.ordinal())) || (iIntValue2 & 48) == 32) | x340Var4.g(h72Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        int iOrdinal2 = nxt0Var.ordinal();
                        if (iOrdinal2 == 0) {
                            fqg0VarO = h72.o(((dm91) ((kly0) h72Var.h).get()).a(voo1.v((xfx) h72Var.b), ((un4) h72Var.Y).b()));
                        } else if (iOrdinal2 == 1) {
                            fqg0VarO = h72.o((laa) ((kly0) h72Var.i).get());
                        } else if (iOrdinal2 == 2) {
                            fqg0VarO = h72.o((laa) ((kly0) h72Var.t).get());
                        } else {
                            if (iOrdinal2 != 3) {
                                eg.o();
                                return null;
                            }
                            fqg0VarO = h72.o((laa) ((kly0) h72Var.X).get());
                        }
                        objT2 = fqg0VarO;
                        x340Var4.s0(objT2);
                    }
                    otw.c((xpw) objT2, rih1Var2, qim0VarR2, (ipb1) null, x340Var4, 48, 8);
                    x340Var4.r(false);
                } else {
                    x340 x340Var5 = x340Var3;
                    x340Var5.i0(-163550863);
                    op71.g(x340Var5, qim0VarR2);
                    x340Var5.r(false);
                }
                return rih1Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz2(zwt0 zwt0Var, float f, h72 h72Var) {
        super(4);
        this.b = zwt0Var;
        this.c = f;
        this.d = h72Var;
    }
}
