package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fvb extends hab0 implements bv30 {
    public final /* synthetic */ Float a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvb(Float f, boolean z) {
        super(5);
        this.a = f;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:37:0x011f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0131  */
    /* JADX WARN: Code duplicated, block: B:40:0x0135  */
    /* JADX WARN: Code duplicated, block: B:43:0x0149  */
    /* JADX WARN: Code duplicated, block: B:45:0x014d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0157  */
    /* JADX WARN: Code duplicated, block: B:49:0x015a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0165  */
    /* JADX WARN: Code duplicated, block: B:53:0x0170  */
    /* JADX WARN: Code duplicated, block: B:58:0x0194  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x01db  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:71:0x0247  */
    /* JADX WARN: Code duplicated, block: B:72:0x0251  */
    /* JADX WARN: Code duplicated, block: B:74:0x029d  */
    /* JADX WARN: Code duplicated, block: B:80:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:83:0x02bc  */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        float f;
        float f2;
        float fCopySign;
        int iH;
        tob1 tob1VarB;
        boolean zD;
        Object objT;
        float fAbs;
        float f3;
        float f4;
        p3v p3vVar;
        float f5;
        float fE;
        float f6;
        xrg xrgVar;
        qim0 qim0Var;
        gra graVar;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        float f7;
        qim0 qim0Var2;
        qim0 qim0VarK;
        otn0 otn0Var = (otn0) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        float f8 = ((p3v) obj3).a;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        zov0 zov0Var = cbx.b(x340Var).g;
        if (zBooleanValue) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-1327690088);
            x340Var2.r(false);
            f = 24.0f;
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-1327688319);
            uwr uwrVar = cbx.a;
            zov0 zov0Var2 = cbx.b(x340Var3).g;
            x340Var3.r(false);
            f = 40.0f;
        }
        Float f9 = this.a;
        qim0 qim0VarThen = null;
        float f10 = 1.0f;
        Float f11 = !u890.h(f9 != null ? Float.valueOf(Math.abs(f9.floatValue())) : null, 1.0f) ? f9 : null;
        x340 x340Var4 = x340Var;
        Object objT2 = x340Var4.T();
        m4c m4cVar = fkj0.X;
        if (objT2 == m4cVar) {
            objT2 = us71.i(1.0f, x340Var4);
        }
        drr0 drr0Var = (drr0) objT2;
        boolean zG = x340Var4.g(f9) | x340Var4.i(drr0Var);
        Object objT3 = x340Var4.T();
        if (zG || objT3 == m4cVar) {
            objT3 = new rqa(f9, drr0Var, (byte) 9);
            x340Var4.s0(objT3);
        }
        qxd0.S((Function0) objT3, x340Var4);
        if (f11 == null) {
            if (this.b) {
                fCopySign = Math.copySign(1.0f, drr0Var.s());
            } else {
                f2 = 0.0f;
            }
            if (f11 != null) {
                x340Var4.i0(1792368239);
                x340Var4.r(false);
                iH = 0;
            } else {
                x340Var4.i0(-1327652617);
                uwr uwrVar2 = cbx.a;
                iH = (int) jfv.h(cbx.c(x340Var4).b.b);
                x340Var4.r(false);
            }
            uwr uwrVar3 = cbx.a;
            tob1VarB = z95.b(f2, irn1.o0(iH, 0, ((jhx) cbx.c(x340Var4).a.d).a, 2), "Close icon", (iu30) null, x340Var4, 3072, 20);
            zD = x340Var4.d(((Number) tob1VarB.getValue()).floatValue());
            objT = x340Var4.T();
            if (!zD || objT == m4cVar) {
                fAbs = Math.abs(((Number) tob1VarB.getValue()).floatValue());
                if (fAbs == 0.0f) {
                    objT = null;
                } else {
                    f3 = (f - 24.0f) / 2.0f;
                    f4 = f3 - f8;
                    p3vVar = new p3v(f4);
                    if (p3v.b(f4, 0.0f) <= 0) {
                        p3vVar = null;
                    }
                    if (p3vVar != null) {
                        float f12 = p3vVar.a / f3;
                        f6 = fAbs - f12;
                        if (f6 < 0.0f) {
                            f6 = 0.0f;
                        }
                        f5 = f6 / f12;
                    } else {
                        f5 = fAbs;
                    }
                    if (p3v.c(24.0f, f)) {
                        fE = l1d.e(1.0f, fAbs, 0.33333334f, 0.6666667f);
                    } else {
                        fE = 1.0f;
                    }
                    objT = new xrg(f, fE, fAbs, f5, ((Number) tob1VarB.getValue()).floatValue() * 45.0f, f3 * fAbs, f3);
                }
                x340Var4.s0(objT);
            } else {
                f10 = 1.0f;
            }
            xrgVar = (xrg) objT;
            qim0Var = nim0.a;
            if (xrgVar == null) {
                x340Var4.i0(34092385);
                x340Var4.r(false);
                f7 = f8;
            } else {
                x340Var4.i0(34092386);
                qim0 qim0VarK2 = d9y0.k(u291.f(qim0Var, f10), xrgVar.d);
                if (zBooleanValue) {
                    graVar = een.h;
                } else {
                    graVar = een.e;
                }
                gfh0VarC = t1c.c(graVar, false);
                iHashCode = Long.hashCode(x340Var4.T);
                xos0VarM = x340Var4.m();
                qim0VarE = zr7.E(x340Var4, qim0VarK2);
                hzj.A.getClass();
                if (x340Var4.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(hmb0.t1);
                } else {
                    x340Var4.v0();
                }
                nko1.H(gfh0VarC, x340Var4, y580.O0);
                nko1.H(xos0VarM, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE, x340Var4, y580.Y);
                f7 = f8;
                t1c.a(dug.f(eqr0.D(0.0f, xrgVar.f - xrgVar.g, 1, u291.r(uyn1.B(qim0Var, 0.0f, f8, 0.0f, 0.0f, 13), xrgVar.a)), cbx.a(x340Var4).b.a, er31.a), x340Var4, 0);
                x340Var4.r(true);
                x340Var4.r(false);
            }
            if (xrgVar == null) {
                x340Var4.i0(34677448);
                x340Var4.r(false);
            } else {
                x340Var4.i0(34677449);
                qim0 qim0VarU = k1u.u(eqr0.D(0.0f, xrgVar.f, 1, qim0Var), xrgVar.e);
                float f13 = xrgVar.b;
                qim0VarThen = fj30.F(qim0VarU, f13, f13).then(new pxe1(z4p1.t(u7h.b(cbx.a(x340Var4).a.c, xrgVar.d, 0.0f, 0.0f, 0.0f, 14), cbx.a(x340Var4).b.b)));
                x340Var4.r(false);
            }
            if (qim0VarThen == null) {
                qim0VarThen = qim0Var;
            }
            if (xrgVar != null || (qim0VarK = d9y0.k(qim0Var, f10 - xrgVar.c)) == null) {
                qim0Var2 = qim0Var;
            } else {
                qim0Var2 = qim0VarK;
            }
            mp10.c(otn0Var, zBooleanValue, f7, (qim0) null, qim0VarThen, qim0Var2, x340Var, iIntValue & 1022, 4);
            return rih1.a;
        }
        fCopySign = f11.floatValue();
        f2 = fCopySign;
        if (f11 != null) {
            x340Var4.i0(1792368239);
            x340Var4.r(false);
            iH = 0;
        } else {
            x340Var4.i0(-1327652617);
            uwr uwrVar4 = cbx.a;
            iH = (int) jfv.h(cbx.c(x340Var4).b.b);
            x340Var4.r(false);
        }
        uwr uwrVar5 = cbx.a;
        tob1VarB = z95.b(f2, irn1.o0(iH, 0, ((jhx) cbx.c(x340Var4).a.d).a, 2), "Close icon", (iu30) null, x340Var4, 3072, 20);
        zD = x340Var4.d(((Number) tob1VarB.getValue()).floatValue());
        objT = x340Var4.T();
        if (zD) {
            fAbs = Math.abs(((Number) tob1VarB.getValue()).floatValue());
            if (fAbs == 0.0f) {
                objT = null;
            } else {
                f3 = (f - 24.0f) / 2.0f;
                f4 = f3 - f8;
                p3vVar = new p3v(f4);
                if (p3v.b(f4, 0.0f) <= 0) {
                    p3vVar = null;
                }
                if (p3vVar != null) {
                    float f14 = p3vVar.a / f3;
                    f6 = fAbs - f14;
                    if (f6 < 0.0f) {
                        f6 = 0.0f;
                    }
                    f5 = f6 / f14;
                } else {
                    f5 = fAbs;
                }
                if (p3v.c(24.0f, f)) {
                    fE = l1d.e(1.0f, fAbs, 0.33333334f, 0.6666667f);
                } else {
                    fE = 1.0f;
                }
                objT = new xrg(f, fE, fAbs, f5, ((Number) tob1VarB.getValue()).floatValue() * 45.0f, f3 * fAbs, f3);
            }
            x340Var4.s0(objT);
        } else {
            fAbs = Math.abs(((Number) tob1VarB.getValue()).floatValue());
            if (fAbs == 0.0f) {
                objT = null;
            } else {
                f3 = (f - 24.0f) / 2.0f;
                f4 = f3 - f8;
                p3vVar = new p3v(f4);
                if (p3v.b(f4, 0.0f) <= 0) {
                    p3vVar = null;
                }
                if (p3vVar != null) {
                    float f15 = p3vVar.a / f3;
                    f6 = fAbs - f15;
                    if (f6 < 0.0f) {
                        f6 = 0.0f;
                    }
                    f5 = f6 / f15;
                } else {
                    f5 = fAbs;
                }
                if (p3v.c(24.0f, f)) {
                    fE = l1d.e(1.0f, fAbs, 0.33333334f, 0.6666667f);
                } else {
                    fE = 1.0f;
                }
                objT = new xrg(f, fE, fAbs, f5, ((Number) tob1VarB.getValue()).floatValue() * 45.0f, f3 * fAbs, f3);
            }
            x340Var4.s0(objT);
        }
        xrgVar = (xrg) objT;
        qim0Var = nim0.a;
        if (xrgVar == null) {
            x340Var4.i0(34092385);
            x340Var4.r(false);
            f7 = f8;
        } else {
            x340Var4.i0(34092386);
            qim0 qim0VarK3 = d9y0.k(u291.f(qim0Var, f10), xrgVar.d);
            if (zBooleanValue) {
                graVar = een.h;
            } else {
                graVar = een.e;
            }
            gfh0VarC = t1c.c(graVar, false);
            iHashCode = Long.hashCode(x340Var4.T);
            xos0VarM = x340Var4.m();
            qim0VarE = zr7.E(x340Var4, qim0VarK3);
            hzj.A.getClass();
            if (x340Var4.a != null) {
                tgp1.p();
                throw null;
            }
            x340Var4.m0();
            if (x340Var4.S) {
                x340Var4.l(hmb0.t1);
            } else {
                x340Var4.v0();
            }
            nko1.H(gfh0VarC, x340Var4, y580.O0);
            nko1.H(xos0VarM, x340Var4, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
            nko1.F(x340Var4);
            nko1.H(qim0VarE, x340Var4, y580.Y);
            f7 = f8;
            t1c.a(dug.f(eqr0.D(0.0f, xrgVar.f - xrgVar.g, 1, u291.r(uyn1.B(qim0Var, 0.0f, f8, 0.0f, 0.0f, 13), xrgVar.a)), cbx.a(x340Var4).b.a, er31.a), x340Var4, 0);
            x340Var4.r(true);
            x340Var4.r(false);
        }
        if (xrgVar == null) {
            x340Var4.i0(34677448);
            x340Var4.r(false);
        } else {
            x340Var4.i0(34677449);
            qim0 qim0VarU2 = k1u.u(eqr0.D(0.0f, xrgVar.f, 1, qim0Var), xrgVar.e);
            float f16 = xrgVar.b;
            qim0VarThen = fj30.F(qim0VarU2, f16, f16).then(new pxe1(z4p1.t(u7h.b(cbx.a(x340Var4).a.c, xrgVar.d, 0.0f, 0.0f, 0.0f, 14), cbx.a(x340Var4).b.b)));
            x340Var4.r(false);
        }
        if (qim0VarThen == null) {
            qim0VarThen = qim0Var;
        }
        if (xrgVar != null) {
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
        }
        mp10.c(otn0Var, zBooleanValue, f7, (qim0) null, qim0VarThen, qim0Var2, x340Var, iIntValue & 1022, 4);
        return rih1.a;
    }
}
