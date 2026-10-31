package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class und {
    public static final kiv a = new kiv(xrc.g, (byte) 1);

    /* JADX WARN: Code duplicated, block: B:102:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f6 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x0133 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x0139  */
    /* JADX WARN: Code duplicated, block: B:73:0x0151  */
    /* JADX WARN: Code duplicated, block: B:74:0x0153  */
    /* JADX WARN: Code duplicated, block: B:77:0x015f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x0161  */
    /* JADX WARN: Code duplicated, block: B:81:0x0174  */
    /* JADX WARN: Code duplicated, block: B:82:0x0176  */
    /* JADX WARN: Code duplicated, block: B:85:0x0184 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x0189  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:97:0x01da  */
    /* JADX WARN: Code duplicated, block: B:99:0x01de  */
    public static final void a(xwa xwaVar, qim0 qim0Var, float f, vu30 vu30Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        float f2;
        int i5;
        boolean z;
        xwa xwaVar2;
        float f3;
        qim0 qim0Var3;
        h311 h311VarV;
        rnd rndVar;
        n4k n4kVar;
        be50 be50VarA;
        zxa zxaVar;
        ven0 ven0VarS;
        boolean zG;
        int i6;
        Object objT;
        de50 de50Var;
        boolean z2;
        boolean zI;
        Object objT2;
        qim0 qim0VarU;
        boolean zI2;
        Object objT3;
        boolean z3;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        gfh0 gfh0VarC2;
        int iHashCode2;
        xos0 xos0VarM2;
        qim0 qim0VarE2;
        int i7;
        vu30 vu30Var2 = vu30Var;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        gra graVar = een.d;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(27410257);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i3 = (x340Var.g(xwaVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.g(qim0Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    f2 = f;
                    if (x340Var.d(f2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if (x340Var.i(vu30Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i3 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    if (i8 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i4 != 0) {
                        f2 = 0.0f;
                    }
                    n4kVar = hmb0.t1;
                    if (xwaVar == null) {
                        x340Var.i0(535389206);
                        gfh0VarC2 = t1c.c(graVar, false);
                        iHashCode2 = Long.hashCode(x340Var.T);
                        xos0VarM2 = x340Var.m();
                        qim0VarE2 = zr7.E(x340Var, qim0Var2);
                        hzj.A.getClass();
                        if (j06Var != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(n4kVar);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(gfh0VarC2, x340Var, lljVar4);
                        nko1.H(xos0VarM2, x340Var, lljVar3);
                        x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                        nko1.H(qim0VarE2, x340Var, lljVar);
                        vu30Var2.invoke(x340Var, Integer.valueOf((i3 >> 9) & 14));
                        x340Var.r(true);
                        x340Var.r(false);
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            return;
                        } else {
                            rndVar = new rnd(xwaVar, qim0Var2, f2, vu30Var2, i, i2, (byte) 0);
                        }
                    } else {
                        xwaVar2 = xwaVar;
                        x340Var.i0(535445905);
                        x340Var.r(false);
                        be50VarA = he50.a(x340Var);
                        zxaVar = (zxa) x340Var.k(a);
                        ven0VarS = v8r.s(Float.valueOf(f2), x340Var);
                        zG = x340Var.g(be50VarA) | x340Var.g(zxaVar);
                        i6 = i3;
                        objT = x340Var.T();
                        if (zG || objT == obj) {
                            objT = new de50(be50VarA, zxaVar, new bp9(ven0VarS, (byte) 13));
                            x340Var.s0(objT);
                        }
                        de50Var = (de50) objT;
                        if ((i6 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zI = z2 | x340Var.i(de50Var);
                        objT2 = x340Var.T();
                        if (zI || objT2 == obj) {
                            objT2 = new ztb(xwaVar2, de50Var, (byte) 15);
                            x340Var.s0(objT2);
                        }
                        qxd0.h(de50Var, xwaVar2, (iu30) objT2, x340Var);
                        if (f2 == 0.0f) {
                            qim0VarU = qim0Var2;
                        } else {
                            qim0VarU = k1u.u(qim0Var2, f2);
                        }
                        zI2 = x340Var.i(be50VarA);
                        objT3 = x340Var.T();
                        if (!zI2 || objT3 == obj) {
                            z3 = false;
                            objT3 = new tnd(be50VarA, (byte) 0);
                            x340Var.s0(objT3);
                        } else {
                            z3 = false;
                        }
                        qim0 qim0VarS = exd0.s(qim0VarU, (iu30) objT3);
                        gfh0VarC = t1c.c(graVar, z3);
                        iHashCode = Long.hashCode(x340Var.T);
                        xos0VarM = x340Var.m();
                        qim0VarE = zr7.E(x340Var, qim0VarS);
                        hzj.A.getClass();
                        if (j06Var != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(n4kVar);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(gfh0VarC, x340Var, lljVar4);
                        nko1.H(xos0VarM, x340Var, lljVar3);
                        x0d.q(iHashCode, x340Var, lljVar2, x340Var);
                        nko1.H(qim0VarE, x340Var, lljVar);
                        vu30Var2 = vu30Var;
                        us71.j((i6 >> 9) & 14, vu30Var2, x340Var, true);
                    }
                    h311VarV.d = rndVar;
                }
                xwaVar2 = xwaVar;
                x340Var.b0();
                f3 = f2;
                qim0Var3 = qim0Var2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    rndVar = new rnd(xwaVar2, qim0Var3, f3, vu30Var2, i, i2, (byte) 1);
                    h311VarV.d = rndVar;
                }
            }
            i3 |= 384;
            f2 = f;
            if ((i & 3072) == 0) {
                if (x340Var.i(vu30Var2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i8 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i4 != 0) {
                    f2 = 0.0f;
                }
                n4kVar = hmb0.t1;
                if (xwaVar == null) {
                    x340Var.i0(535389206);
                    gfh0VarC2 = t1c.c(graVar, false);
                    iHashCode2 = Long.hashCode(x340Var.T);
                    xos0VarM2 = x340Var.m();
                    qim0VarE2 = zr7.E(x340Var, qim0Var2);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var, lljVar4);
                    nko1.H(xos0VarM2, x340Var, lljVar3);
                    x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                    nko1.H(qim0VarE2, x340Var, lljVar);
                    vu30Var2.invoke(x340Var, Integer.valueOf((i3 >> 9) & 14));
                    x340Var.r(true);
                    x340Var.r(false);
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        return;
                    } else {
                        rndVar = new rnd(xwaVar, qim0Var2, f2, vu30Var2, i, i2, (byte) 0);
                    }
                } else {
                    xwaVar2 = xwaVar;
                    x340Var.i0(535445905);
                    x340Var.r(false);
                    be50VarA = he50.a(x340Var);
                    zxaVar = (zxa) x340Var.k(a);
                    ven0VarS = v8r.s(Float.valueOf(f2), x340Var);
                    zG = x340Var.g(be50VarA) | x340Var.g(zxaVar);
                    i6 = i3;
                    objT = x340Var.T();
                    if (zG) {
                        objT = new de50(be50VarA, zxaVar, new bp9(ven0VarS, (byte) 13));
                        x340Var.s0(objT);
                    } else {
                        objT = new de50(be50VarA, zxaVar, new bp9(ven0VarS, (byte) 13));
                        x340Var.s0(objT);
                    }
                    de50Var = (de50) objT;
                    if ((i6 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zI = z2 | x340Var.i(de50Var);
                    objT2 = x340Var.T();
                    if (zI) {
                        objT2 = new ztb(xwaVar2, de50Var, (byte) 15);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new ztb(xwaVar2, de50Var, (byte) 15);
                        x340Var.s0(objT2);
                    }
                    qxd0.h(de50Var, xwaVar2, (iu30) objT2, x340Var);
                    if (f2 == 0.0f) {
                        qim0VarU = qim0Var2;
                    } else {
                        qim0VarU = k1u.u(qim0Var2, f2);
                    }
                    zI2 = x340Var.i(be50VarA);
                    objT3 = x340Var.T();
                    if (zI2) {
                        z3 = false;
                        objT3 = new tnd(be50VarA, (byte) 0);
                        x340Var.s0(objT3);
                    } else {
                        z3 = false;
                        objT3 = new tnd(be50VarA, (byte) 0);
                        x340Var.s0(objT3);
                    }
                    qim0 qim0VarS2 = exd0.s(qim0VarU, (iu30) objT3);
                    gfh0VarC = t1c.c(graVar, z3);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarS2);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, lljVar4);
                    nko1.H(xos0VarM, x340Var, lljVar3);
                    x0d.q(iHashCode, x340Var, lljVar2, x340Var);
                    nko1.H(qim0VarE, x340Var, lljVar);
                    vu30Var2 = vu30Var;
                    us71.j((i6 >> 9) & 14, vu30Var2, x340Var, true);
                }
                h311VarV.d = rndVar;
            }
            xwaVar2 = xwaVar;
            x340Var.b0();
            f3 = f2;
            qim0Var3 = qim0Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                rndVar = new rnd(xwaVar2, qim0Var3, f3, vu30Var2, i, i2, (byte) 1);
                h311VarV.d = rndVar;
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                f2 = f;
                if (x340Var.d(f2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if (x340Var.i(vu30Var2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i8 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i4 != 0) {
                    f2 = 0.0f;
                }
                n4kVar = hmb0.t1;
                if (xwaVar == null) {
                    x340Var.i0(535389206);
                    gfh0VarC2 = t1c.c(graVar, false);
                    iHashCode2 = Long.hashCode(x340Var.T);
                    xos0VarM2 = x340Var.m();
                    qim0VarE2 = zr7.E(x340Var, qim0Var2);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var, lljVar4);
                    nko1.H(xos0VarM2, x340Var, lljVar3);
                    x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                    nko1.H(qim0VarE2, x340Var, lljVar);
                    vu30Var2.invoke(x340Var, Integer.valueOf((i3 >> 9) & 14));
                    x340Var.r(true);
                    x340Var.r(false);
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        return;
                    } else {
                        rndVar = new rnd(xwaVar, qim0Var2, f2, vu30Var2, i, i2, (byte) 0);
                    }
                } else {
                    xwaVar2 = xwaVar;
                    x340Var.i0(535445905);
                    x340Var.r(false);
                    be50VarA = he50.a(x340Var);
                    zxaVar = (zxa) x340Var.k(a);
                    ven0VarS = v8r.s(Float.valueOf(f2), x340Var);
                    zG = x340Var.g(be50VarA) | x340Var.g(zxaVar);
                    i6 = i3;
                    objT = x340Var.T();
                    if (zG) {
                        objT = new de50(be50VarA, zxaVar, new bp9(ven0VarS, (byte) 13));
                        x340Var.s0(objT);
                    } else {
                        objT = new de50(be50VarA, zxaVar, new bp9(ven0VarS, (byte) 13));
                        x340Var.s0(objT);
                    }
                    de50Var = (de50) objT;
                    if ((i6 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zI = z2 | x340Var.i(de50Var);
                    objT2 = x340Var.T();
                    if (zI) {
                        objT2 = new ztb(xwaVar2, de50Var, (byte) 15);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new ztb(xwaVar2, de50Var, (byte) 15);
                        x340Var.s0(objT2);
                    }
                    qxd0.h(de50Var, xwaVar2, (iu30) objT2, x340Var);
                    if (f2 == 0.0f) {
                        qim0VarU = qim0Var2;
                    } else {
                        qim0VarU = k1u.u(qim0Var2, f2);
                    }
                    zI2 = x340Var.i(be50VarA);
                    objT3 = x340Var.T();
                    if (zI2) {
                        z3 = false;
                        objT3 = new tnd(be50VarA, (byte) 0);
                        x340Var.s0(objT3);
                    } else {
                        z3 = false;
                        objT3 = new tnd(be50VarA, (byte) 0);
                        x340Var.s0(objT3);
                    }
                    qim0 qim0VarS3 = exd0.s(qim0VarU, (iu30) objT3);
                    gfh0VarC = t1c.c(graVar, z3);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarS3);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, lljVar4);
                    nko1.H(xos0VarM, x340Var, lljVar3);
                    x0d.q(iHashCode, x340Var, lljVar2, x340Var);
                    nko1.H(qim0VarE, x340Var, lljVar);
                    vu30Var2 = vu30Var;
                    us71.j((i6 >> 9) & 14, vu30Var2, x340Var, true);
                }
                h311VarV.d = rndVar;
            }
            xwaVar2 = xwaVar;
            x340Var.b0();
            f3 = f2;
            qim0Var3 = qim0Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                rndVar = new rnd(xwaVar2, qim0Var3, f3, vu30Var2, i, i2, (byte) 1);
                h311VarV.d = rndVar;
            }
        }
        i3 |= 384;
        f2 = f;
        if ((i & 3072) == 0) {
            if (x340Var.i(vu30Var2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i8 != 0) {
                qim0Var2 = nim0.a;
            }
            if (i4 != 0) {
                f2 = 0.0f;
            }
            n4kVar = hmb0.t1;
            if (xwaVar == null) {
                x340Var.i0(535389206);
                gfh0VarC2 = t1c.c(graVar, false);
                iHashCode2 = Long.hashCode(x340Var.T);
                xos0VarM2 = x340Var.m();
                qim0VarE2 = zr7.E(x340Var, qim0Var2);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                vu30Var2.invoke(x340Var, Integer.valueOf((i3 >> 9) & 14));
                x340Var.r(true);
                x340Var.r(false);
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    return;
                } else {
                    rndVar = new rnd(xwaVar, qim0Var2, f2, vu30Var2, i, i2, (byte) 0);
                }
            } else {
                xwaVar2 = xwaVar;
                x340Var.i0(535445905);
                x340Var.r(false);
                be50VarA = he50.a(x340Var);
                zxaVar = (zxa) x340Var.k(a);
                ven0VarS = v8r.s(Float.valueOf(f2), x340Var);
                zG = x340Var.g(be50VarA) | x340Var.g(zxaVar);
                i6 = i3;
                objT = x340Var.T();
                if (zG) {
                    objT = new de50(be50VarA, zxaVar, new bp9(ven0VarS, (byte) 13));
                    x340Var.s0(objT);
                } else {
                    objT = new de50(be50VarA, zxaVar, new bp9(ven0VarS, (byte) 13));
                    x340Var.s0(objT);
                }
                de50Var = (de50) objT;
                if ((i6 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zI = z2 | x340Var.i(de50Var);
                objT2 = x340Var.T();
                if (zI) {
                    objT2 = new ztb(xwaVar2, de50Var, (byte) 15);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new ztb(xwaVar2, de50Var, (byte) 15);
                    x340Var.s0(objT2);
                }
                qxd0.h(de50Var, xwaVar2, (iu30) objT2, x340Var);
                if (f2 == 0.0f) {
                    qim0VarU = qim0Var2;
                } else {
                    qim0VarU = k1u.u(qim0Var2, f2);
                }
                zI2 = x340Var.i(be50VarA);
                objT3 = x340Var.T();
                if (zI2) {
                    z3 = false;
                    objT3 = new tnd(be50VarA, (byte) 0);
                    x340Var.s0(objT3);
                } else {
                    z3 = false;
                    objT3 = new tnd(be50VarA, (byte) 0);
                    x340Var.s0(objT3);
                }
                qim0 qim0VarS4 = exd0.s(qim0VarU, (iu30) objT3);
                gfh0VarC = t1c.c(graVar, z3);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarS4);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar4);
                nko1.H(xos0VarM, x340Var, lljVar3);
                x0d.q(iHashCode, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE, x340Var, lljVar);
                vu30Var2 = vu30Var;
                us71.j((i6 >> 9) & 14, vu30Var2, x340Var, true);
            }
            h311VarV.d = rndVar;
        }
        xwaVar2 = xwaVar;
        x340Var.b0();
        f3 = f2;
        qim0Var3 = qim0Var2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            rndVar = new rnd(xwaVar2, qim0Var3, f3, vu30Var2, i, i2, (byte) 1);
            h311VarV.d = rndVar;
        }
    }
}
