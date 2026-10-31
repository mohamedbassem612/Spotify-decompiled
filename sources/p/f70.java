package p;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f70 implements jsw {
    public final /* synthetic */ byte a;

    public /* synthetic */ f70(byte b) {
        this.a = b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a(int i, Object obj, b0k b0kVar, ksw kswVar, iu30 iu30Var) throws NoWhenBranchMatchedException {
        qk1 qk1Var;
        jax haxVar;
        gdx gdxVarS;
        switch (this.a) {
            case 0:
                o((o6u0) obj, iu30Var, kswVar, b0kVar, i);
                return;
            case 1:
                r((nhb1) obj, iu30Var, kswVar, b0kVar, i);
                return;
            case 2:
                g((pr7) obj, iu30Var, kswVar, b0kVar, i);
                return;
            case 3:
                h((lt7) obj, iu30Var, kswVar, b0kVar, i);
                return;
            case 4:
                i((nqa) obj, iu30Var, kswVar, b0kVar, i);
                return;
            case 5:
                j((s6h) obj, iu30Var, kswVar, b0kVar, i);
                return;
            case 6:
                k((v9n) obj, iu30Var, kswVar, b0kVar, i);
                return;
            case 7:
                boolean z = true;
                vho vhoVar = (vho) obj;
                sho shoVar = vhoVar.d;
                x340 x340Var = (x340) b0kVar;
                x340Var.i0(-92668861);
                if (vhoVar.h) {
                    boolean z2 = shoVar instanceof pho;
                    nim0 nim0Var = nim0.a;
                    if (z2) {
                        x340Var.i0(966129974);
                        mno1.e(vhoVar, iu30Var, anm1.N("curation-button", nim0Var), x340Var, (i & 14) | 384 | (i & 112));
                        x340Var.r(false);
                    } else {
                        boolean z3 = shoVar instanceof sho;
                        if (z3) {
                            x340Var.i0(966333582);
                            fbp1.h(vhoVar, shoVar.a, iu30Var, anm1.N("curation-button", nim0Var), x340Var, ((i << 3) & 896) | (i & 14) | 3072);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(966586635);
                            qim0 qim0VarN = anm1.N("curation-button", nim0Var);
                            boolean z4 = vhoVar.c;
                            if (z4) {
                                qk1Var = qk1.b;
                            } else {
                                if (z4) {
                                    eg.o();
                                    return;
                                }
                                qk1Var = qk1.a;
                            }
                            qk1 qk1Var2 = qk1Var;
                            boolean zJ = u890.j(shoVar, oho.a);
                            j7p1 j7p1Var = sk1.c;
                            if (!zJ) {
                                if (u890.j(shoVar, qho.a)) {
                                    j7p1Var = tk1.c;
                                } else if (u890.j(shoVar, rho.a)) {
                                    j7p1Var = rk1.c;
                                } else if (!z2 && !z3) {
                                    eg.o();
                                    return;
                                }
                            }
                            pk1 pk1Var = new pk1(qk1Var2, false, vhoVar.f, vhoVar.g, j7p1Var, 2);
                            if (vhoVar.a) {
                                x340Var.i0(1139574277);
                                haxVar = new hax(cwl1.o0(x340Var, 2131954741));
                                x340Var.r(false);
                            } else {
                                x340Var.i0(1139572535);
                                x340Var.r(false);
                                haxVar = jax.a;
                            }
                            jax jaxVar = haxVar;
                            nho nhoVar = vhoVar.e;
                            if (u890.j(nhoVar, kho.a)) {
                                x340Var.i0(-521180490);
                                gdxVarS = yla.r(x340Var);
                                x340Var.r(false);
                            } else if (u890.j(nhoVar, lho.a)) {
                                x340Var.i0(1023356673);
                                gdx gdxVarR = yla.r(x340Var);
                                uwr uwrVar = cbx.a;
                                zov0 zov0Var = cbx.b(x340Var).g;
                                cvx cvxVar = cbx.b(x340Var).b;
                                gdxVarS = gdx.b(gdxVarR, (zzq0) null, 16.0f, 0.0f, 16.0f, 53);
                                x340Var.r(false);
                            } else {
                                if (!u890.j(nhoVar, mho.a)) {
                                    throw p3d1.k(x340Var, -521182223, false);
                                }
                                x340Var.i0(-521171408);
                                gdxVarS = yla.s(x340Var);
                                x340Var.r(false);
                            }
                            gdx gdxVar = gdxVarS;
                            if ((((i & 112) ^ 48) <= 32 || !x340Var.g(iu30Var)) && (i & 48) != 32) {
                                z = false;
                            }
                            Object objT = x340Var.T();
                            if (z || objT == fkj0.X) {
                                objT = new qzn(iu30Var, (byte) 8);
                                x340Var.s0(objT);
                            }
                            h7p1.a(pk1Var, new gbx(z50.c, (Function0) objT), qim0VarN, jaxVar, gdxVar, x340Var, 384, 0);
                            x340Var.r(false);
                        }
                    }
                }
                x340Var.r(false);
                return;
            case 8:
                l((au30) obj, iu30Var, kswVar, b0kVar, i);
                return;
            case 9:
                boolean z5 = true;
                gmd0 gmd0Var = (gmd0) obj;
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.i0(-123032915);
                if ((((i & 112) ^ 48) <= 32 || !x340Var2.g(iu30Var)) && (i & 48) != 32) {
                    z5 = false;
                }
                Object objT2 = x340Var2.T();
                if (z5 || objT2 == fkj0.X) {
                    objT2 = new d720(iu30Var, (byte) 25);
                    x340Var2.s0(objT2);
                }
                s1p1.e(gmd0Var, (vu30) objT2, x340Var2, i & 14);
                x340Var2.r(false);
                return;
            case 10:
                m((rnf0) obj, iu30Var, kswVar, b0kVar, i);
                return;
            case 11:
                n((oum0) obj, iu30Var, kswVar, b0kVar, i);
                return;
            case 12:
                p((qay0) obj, iu30Var, kswVar, b0kVar, i);
                return;
            case 13:
                q((mby0) obj, iu30Var, kswVar, b0kVar, i);
                return;
            case 14:
                r((nhb1) obj, iu30Var, kswVar, b0kVar, i);
                return;
            case 15:
                boolean z6 = true;
                wb81 wb81Var = (wb81) obj;
                x340 x340Var3 = (x340) b0kVar;
                x340Var3.i0(-1021188041);
                if ((((i & 112) ^ 48) <= 32 || !x340Var3.g(iu30Var)) && (i & 48) != 32) {
                    z6 = false;
                }
                Object objT3 = x340Var3.T();
                if (z6 || objT3 == fkj0.X) {
                    objT3 = new pba1(iu30Var, (byte) 26);
                    x340Var3.s0(objT3);
                }
                bpo1.l(wb81Var, (Function0) objT3, x340Var3, i & 14);
                x340Var3.r(false);
                return;
            case 16:
                s((a3e1) obj, iu30Var, kswVar, b0kVar, i);
                return;
            case 17:
                t((xke1) obj, iu30Var, kswVar, b0kVar, i);
                return;
            case 18:
                u((rhj1) obj, iu30Var, kswVar, b0kVar, i);
                return;
            default:
                r((nhb1) obj, iu30Var, kswVar, b0kVar, i);
                return;
        }
    }

    public void c(lqa lqaVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(194124756);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(lqaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            xwa xwaVarF = fae1.F(b0kVar3);
            wkt wktVar = lqaVar.h;
            boolean zG = ((i2 & 14) == 4) | ((i2 & 112) == 32) | b0kVar3.g(xwaVarF);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                el0 el0Var = new el0(lqaVar, iu30Var, xwaVarF, (lnm) null, (byte) 9);
                b0kVar3.s0(el0Var);
                objT = el0Var;
            }
            qxd0.t(wktVar, b0kVar3, (vu30) objT);
            b0kVar2 = b0kVar3;
            und.a(xwaVarF, null, 0.0f, apo.r(244231161, new cka(lqaVar, (byte) 3), b0kVar3), b0kVar2, 3072, 6);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(this, lqaVar, iu30Var, i, (byte) 29);
        }
    }

    public void d(q6h q6hVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1704864820);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(q6hVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            xwa xwaVarF = fae1.F(x340Var);
            und.a(xwaVarF, null, 0.0f, apo.r(360158001, new hwd(q6hVar, iu30Var, fae1.F(x340Var), xwaVarF, (byte) 15), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b(this, q6hVar, iu30Var, i, (byte) 25);
        }
    }

    public void e(yt30 yt30Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1010952627);
        if ((i & 6) == 0) {
            i2 = i | (x340Var2.g(yt30Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            xwa xwaVarF = fae1.F(x340Var2);
            und.a(xwaVarF, null, 0.0f, apo.r(585033266, new rr10(yt30Var, (byte) 19), x340Var2), x340Var2, 3072, 6);
            x340Var = x340Var2;
            wkt wktVar = yt30Var.e;
            boolean zG = ((i2 & 14) == 4) | x340Var.g(xwaVarF) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                lqv lqvVar = new lqv(yt30Var, xwaVarF, iu30Var, false, (lnm) null, (byte) 17);
                x340Var.s0(lqvVar);
                objT = lqvVar;
            }
            qxd0.t(wktVar, x340Var, (vu30) objT);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(this, yt30Var, iu30Var, i, (byte) 11);
        }
    }

    public void f(kby0 kby0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1071151397);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(kby0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            xwa xwaVarF = fae1.F(x340Var);
            und.a(xwaVarF, null, 0.0f, apo.r(-1936848874, new pby0(kby0Var, iu30Var, fae1.F(x340Var), xwaVarF, (byte) 0), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(this, kby0Var, iu30Var, i, (byte) 10);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void g(pr7 pr7Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(228121716);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(pr7Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            xwa xwaVarF = fae1.F(x340Var);
            wkt wktVar = pr7Var.i;
            int i3 = i2 & 112;
            boolean zG = (i3 == 32) | ((i2 & 14) == 4) | x340Var.g(xwaVarF);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                el0 el0Var = new el0(pr7Var, iu30Var, xwaVarF, (lnm) null, (byte) 7);
                x340Var.s0(el0Var);
                objT = el0Var;
            }
            qxd0.t(wktVar, x340Var, (vu30) objT);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            lr7 lr7Var = pr7Var.h;
            if (lr7Var instanceof mr7) {
                x340Var.i0(181655481);
                dxo1.k(qim0VarD, x340Var, 6);
                x340Var.r(false);
            } else if (lr7Var instanceof lr7) {
                x340Var.i0(1336431884);
                lr7 lr7Var2 = lr7Var;
                cso1.a(pr7Var.c, pr7Var.d, lr7Var2.a, pr7Var.f, lr7Var2.b, xwaVarF, qim0VarD, x340Var, 1572864, 0);
                x340Var.r(false);
            } else {
                if (!(lr7Var instanceof kr7)) {
                    throw p3d1.k(x340Var, 181653484, false);
                }
                x340Var.i0(181669412);
                boolean z = i3 == 32;
                Object objT2 = x340Var.T();
                if (z || objT2 == m4cVar) {
                    objT2 = new ge3(iu30Var, (byte) 28);
                    x340Var.s0(objT2);
                }
                rwo1.h(6, (Function0) objT2, x340Var, qim0VarD);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l8(i, this, pr7Var, iu30Var, kswVar, (byte) 19);
        }
    }

    public void h(lt7 lt7Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) {
        int i2;
        xwa xwaVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1835928904);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(lt7Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            xwa xwaVarF = fae1.F(x340Var);
            wkt wktVar = lt7Var.N0;
            boolean zI = x340Var.i(wktVar) | ((i2 & 112) == 32) | x340Var.g(xwaVarF);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                xwaVar = xwaVarF;
                nt7 nt7Var = new nt7(wktVar, iu30Var, xwaVar, null, (byte) 0);
                x340Var.s0(nt7Var);
                objT = nt7Var;
            } else {
                xwaVar = xwaVarF;
            }
            qxd0.t(wktVar, x340Var, (vu30) objT);
            cso1.a(lt7Var.c, lt7Var.d, lt7Var.f, lt7Var.g, lt7Var.h, xwaVar, (qim0) null, x340Var, 0, 64);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l8(i, this, lt7Var, iu30Var, kswVar, (byte) 20);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void i(nqa nqaVar, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1644447349);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(nqaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1043) != 1042)) {
            boolean z = nqaVar instanceof mqa;
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(-234058424);
                dxo1.k(u291.d(nim0Var, 1.0f), x340Var, 6);
                x340Var.r(false);
            } else if (nqaVar instanceof kqa) {
                x340Var.i0(-234055695);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                boolean z2 = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new nc8(iu30Var, (byte) 12);
                    x340Var.s0(objT);
                }
                rwo1.h(6, (Function0) objT, x340Var, qim0VarD);
                x340Var.r(false);
            } else {
                if (!(nqaVar instanceof lqa)) {
                    throw p3d1.k(x340Var, -234059478, false);
                }
                x340Var.i0(-234051920);
                c((lqa) nqaVar, iu30Var, x340Var, ((i2 >> 3) & 896) | (i2 & 126));
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(i, this, nqaVar, iu30Var, kswVar, (byte) 0);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void j(s6h s6hVar, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1109660845);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(s6hVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1043) != 1042)) {
            boolean z = s6hVar instanceof r6h;
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(1232186752);
                dxo1.k(u291.d(nim0Var, 1.0f), x340Var, 6);
                x340Var.r(false);
            } else if (s6hVar instanceof p6h) {
                x340Var.i0(1232189481);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                boolean z2 = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new frf(iu30Var, (byte) 27);
                    x340Var.s0(objT);
                }
                rwo1.h(6, (Function0) objT, x340Var, qim0VarD);
                x340Var.r(false);
            } else {
                if (!(s6hVar instanceof q6h)) {
                    throw p3d1.k(x340Var, 1232185698, false);
                }
                x340Var.i0(1232193256);
                d((q6h) s6hVar, iu30Var, x340Var, ((i2 >> 3) & 896) | (i2 & 126));
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(i, this, s6hVar, iu30Var, kswVar, (byte) 26);
        }
    }

    public void k(v9n v9nVar, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2117014035);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(v9nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            fno1.b(0, v9nVar.a, x340Var, (qim0) null);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(i, this, v9nVar, iu30Var, kswVar, (byte) 18);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void l(au30 au30Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(994643374);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(au30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1043) != 1042)) {
            boolean z = au30Var instanceof zt30;
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(-1925420479);
                dxo1.k(u291.d(nim0Var, 1.0f), x340Var, 6);
                x340Var.r(false);
            } else if (au30Var instanceof wt30) {
                x340Var.i0(-1925417750);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                boolean z2 = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new bb30(iu30Var, (byte) 10);
                    x340Var.s0(objT);
                }
                rwo1.h(6, (Function0) objT, x340Var, qim0VarD);
                x340Var.r(false);
            } else {
                if (!(au30Var instanceof yt30)) {
                    throw p3d1.k(x340Var, -1925421533, false);
                }
                x340Var.i0(-1925413975);
                e((yt30) au30Var, iu30Var, x340Var, ((i2 >> 3) & 896) | (i2 & 126));
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, this, au30Var, iu30Var, kswVar, (byte) 2);
        }
    }

    public void m(rnf0 rnf0Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        xwa xwaVar;
        m4c m4cVar = fkj0.X;
        List list = rnf0Var.h;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-823438049);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(rnf0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            iu30Var2 = iu30Var;
            i2 |= x340Var.i(iu30Var2) ? 32 : 16;
        } else {
            iu30Var2 = iu30Var;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            xwa xwaVarF = fae1.F(x340Var);
            wkt wktVar = rnf0Var.t;
            boolean zG = ((i2 & 14) == 4) | ((i2 & 112) == 32) | x340Var.g(xwaVarF);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                iu30 iu30Var3 = iu30Var2;
                xwaVar = xwaVarF;
                ary aryVar = new ary(rnf0Var, iu30Var3, xwaVar, (lnm) null, (byte) 16);
                x340Var.s0(aryVar);
                objT = aryVar;
            } else {
                xwaVar = xwaVarF;
            }
            qxd0.t(wktVar, x340Var, (vu30) objT);
            boolean zG2 = x340Var.g(list);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = mqo1.A(list);
                x340Var.s0(objT2);
            }
            und.a(xwaVar, u291.d(nim0.a, 1.0f), 0.0f, apo.r(-365606524, new d0e0(rnf0Var, (c380) objT2, (byte) 24), x340Var), x340Var, 3120, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, this, rnf0Var, iu30Var, kswVar, (byte) 23);
        }
    }

    public void n(oum0 oum0Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1558803606);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(oum0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String str = oum0Var.a;
            String strO0 = cwl1.o0(x340Var, 2131958979);
            String str2 = oum0Var.b;
            String str3 = oum0Var.c;
            String str4 = oum0Var.d;
            String strO1 = cwl1.o0(x340Var, 2131958982);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new nfk0(iu30Var, (byte) 9);
                x340Var.s0(objT);
            }
            boo1.h(new z9i0(str, strO0, str2, str3, str4, strO1, (Function0) objT, (String) null, (String) null, (Function0) null), (qim0) null, x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(i, this, oum0Var, iu30Var, kswVar, (byte) 8);
        }
    }

    public void o(o6u0 o6u0Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-910503715);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(o6u0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            r2p1 r2p1Var = o6u0Var.b;
            String str = o6u0Var.c;
            String str2 = o6u0Var.d;
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new p1(iu30Var, (byte) 12);
                x340Var.s0(objT);
            }
            g0p1.a(r2p1Var, str, str2, (Function0) objT, x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l8(i, this, o6u0Var, iu30Var, kswVar, (byte) 2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void p(qay0 qay0Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var;
        Object ae1Var;
        xwa xwaVar;
        xwa xwaVar2;
        qay0 qay0Var2 = qay0Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-292407982);
        if ((i & 6) == 0) {
            i2 = i | (x340Var2.g(qay0Var2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            xwa xwaVarF = fae1.F(x340Var2);
            xwa xwaVarF2 = fae1.F(x340Var2);
            wkt wktVar = qay0Var2.d;
            int i3 = i2 & 112;
            boolean zG = (i3 == 32) | ((i2 & 14) == 4) | x340Var2.g(xwaVarF) | x340Var2.g(xwaVarF2);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                xwaVar = xwaVarF;
                xwaVar2 = xwaVarF2;
                ae1Var = new ae1(qay0Var2, iu30Var, xwaVar, xwaVar2, (lnm) null, (byte) 16);
                x340Var2.s0(ae1Var);
            } else {
                ae1Var = objT;
                xwaVar = xwaVarF;
                xwaVar2 = xwaVarF2;
            }
            qxd0.t(wktVar, x340Var2, (vu30) ae1Var);
            may0 may0Var = qay0Var2.b;
            boolean z = may0Var instanceof nay0;
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var2.i0(-1831173147);
                dxo1.k(u291.d(nim0Var, 1.0f), x340Var2, 6);
                x340Var2.r(false);
            } else if (may0Var instanceof lay0) {
                x340Var2.i0(-1831170199);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                boolean z2 = i3 == 32;
                Object objT2 = x340Var2.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new h7w0(iu30Var, (byte) 27);
                    x340Var2.s0(objT2);
                }
                rwo1.h(6, (Function0) objT2, x340Var2, qim0VarD);
                x340Var2.r(false);
            } else {
                if (!(may0Var instanceof may0)) {
                    throw p3d1.k(x340Var2, -1831174819, false);
                }
                x340Var2.i0(-931565074);
                may0 may0Var2 = may0Var;
                s9y0 s9y0Var = new s9y0(may0Var2.a, may0Var2.d, may0Var2.b, may0Var2.c);
                j2i j2iVarR = apo.r(593778964, new bgo(xwaVar, (byte) 1), x340Var2);
                j2i j2iVarR2 = apo.r(-1582137357, new bgo(xwaVar2, (byte) 2), x340Var2);
                x340Var = x340Var2;
                jzn1.j(s9y0Var, (qim0) null, j2iVarR, j2iVarR2, x340Var, 3456, 2);
                x340Var.r(false);
            }
            x340Var = x340Var2;
        } else {
            qay0Var2 = qay0Var2;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(this, qay0Var2, iu30Var, kswVar, i, (byte) 13);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void q(mby0 mby0Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1117300250);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(mby0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1043) != 1042)) {
            boolean z = mby0Var instanceof lby0;
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(-16279635);
                dxo1.k(u291.d(nim0Var, 1.0f), x340Var, 6);
                x340Var.r(false);
            } else if (mby0Var instanceof jby0) {
                x340Var.i0(-16276906);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                boolean z2 = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new h7w0(iu30Var, (byte) 28);
                    x340Var.s0(objT);
                }
                rwo1.h(6, (Function0) objT, x340Var, qim0VarD);
                x340Var.r(false);
            } else {
                if (!(mby0Var instanceof kby0)) {
                    throw p3d1.k(x340Var, -16280689, false);
                }
                x340Var.i0(-16273131);
                f((kby0) mby0Var, iu30Var, x340Var, ((i2 >> 3) & 896) | (i2 & 126));
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(this, mby0Var, iu30Var, kswVar, i, (byte) 14);
        }
    }

    public void r(nhb1 nhb1Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) {
        boolean z = false;
        byte b = 2;
        byte b2 = 1;
        switch (this.a) {
            case 1:
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(1501347362);
                int i2 = (i & 6) == 0 ? i | ((i & 8) == 0 ? x340Var.g(nhb1Var) : x340Var.i(nhb1Var) ? 4 : 2) : i;
                if ((i & 48) == 0) {
                    i2 |= x340Var.i(iu30Var) ? 32 : 16;
                }
                if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                    nyx.a(2, (wux) null, apo.r(-1319077265, new u52(nhb1Var, iu30Var, z ? (byte) 1 : (byte) 0), x340Var), x340Var, 3078, 6);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new l8(i, this, nhb1Var, iu30Var, kswVar, (byte) 11);
                }
                break;
            case 14:
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.k0(788073128);
                int i3 = (i & 6) == 0 ? i | ((i & 8) == 0 ? x340Var2.g(nhb1Var) : x340Var2.i(nhb1Var) ? 4 : 2) : i;
                if ((i & 48) == 0) {
                    i3 |= x340Var2.i(iu30Var) ? 32 : 16;
                }
                if (x340Var2.Y(i3 & 1, (i3 & 19) != 18)) {
                    nyx.a(2, (wux) null, apo.r(883787381, new u52(nhb1Var, iu30Var, b2), x340Var2), x340Var2, 3078, 6);
                } else {
                    x340Var2.b0();
                }
                h311 h311VarV2 = x340Var2.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new nk31(i, (Object) this, (Object) nhb1Var, (Object) iu30Var, (Object) kswVar, (byte) 22);
                }
                break;
            default:
                x340 x340Var3 = (x340) b0kVar;
                x340Var3.k0(-1278554432);
                int i4 = (i & 6) == 0 ? i | ((i & 8) == 0 ? x340Var3.g(nhb1Var) : x340Var3.i(nhb1Var) ? 4 : 2) : i;
                if ((i & 48) == 0) {
                    i4 |= x340Var3.i(iu30Var) ? 32 : 16;
                }
                if (x340Var3.Y(i4 & 1, (i4 & 19) != 18)) {
                    nyx.a(2, (wux) null, apo.r(1618782995, new u52(nhb1Var, iu30Var, b), x340Var3), x340Var3, 3078, 6);
                } else {
                    x340Var3.b0();
                }
                h311 h311VarV3 = x340Var3.v();
                if (h311VarV3 != null) {
                    h311VarV3.d = new swk1(i, this, nhb1Var, iu30Var, kswVar, (byte) 8);
                }
                break;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void s(a3e1 a3e1Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var;
        iu30 iu30Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1860637045);
        if ((i & 6) == 0) {
            i2 = i | (x340Var2.i(a3e1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            xwa xwaVarF = fae1.F(x340Var2);
            wkt wktVar = a3e1Var.N0;
            int i3 = i2 & 112;
            boolean zI = x340Var2.i(wktVar) | (i3 == 32) | x340Var2.g(xwaVarF);
            Object objT = x340Var2.T();
            if (zI || objT == m4cVar) {
                nt7 nt7Var = new nt7(wktVar, iu30Var, xwaVarF, null, (byte) 1);
                iu30Var2 = iu30Var;
                x340Var2.s0(nt7Var);
                objT = nt7Var;
            } else {
                iu30Var2 = iu30Var;
            }
            qxd0.t(wktVar, x340Var2, (vu30) objT);
            y2e1 y2e1Var = a3e1Var.c;
            boolean z = y2e1Var instanceof x2e1;
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var2.i0(610385330);
                dxo1.k(u291.d(nim0Var, 1.0f), x340Var2, 6);
                x340Var2.r(false);
            } else if (y2e1Var instanceof v2e1) {
                x340Var2.i0(610485677);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                boolean z2 = i3 == 32;
                Object objT2 = x340Var2.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new pwc1(iu30Var2, (byte) 9);
                    x340Var2.s0(objT2);
                }
                rwo1.h(6, (Function0) objT2, x340Var2, qim0VarD);
                x340Var2.r(false);
            } else {
                if (!(y2e1Var instanceof w2e1)) {
                    throw p3d1.k(x340Var2, -1365785002, false);
                }
                x340Var2.i0(610692323);
                x340Var = x340Var2;
                und.a(xwaVarF, null, 0.0f, apo.r(-1104904336, new sdb1(y2e1Var, a3e1Var, (byte) 22), x340Var2), x340Var, 3072, 6);
                x340Var.r(false);
            }
            x340Var = x340Var2;
        } else {
            x340Var = x340Var2;
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uoc1(i, this, a3e1Var, iu30Var2, kswVar, (byte) 12);
        }
    }

    public void t(xke1 xke1Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2103713950);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(xke1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1043) != 1042)) {
            String str = xke1Var.a;
            String strO0 = cwl1.o0(x340Var, 2131963177);
            String strO1 = cwl1.o0(x340Var, 2131963184);
            String strK = xke1Var.b ? x0d.k(x340Var, 1820968642, 2131963179, x340Var, false) : x0d.k(x340Var, 1821105724, 2131963178, x340Var, false);
            String strO2 = cwl1.o0(x340Var, 2131963182);
            String strO3 = cwl1.o0(x340Var, 2131963183);
            String strO4 = cwl1.o0(x340Var, 2131963180);
            String strO5 = cwl1.o0(x340Var, 2131963181);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new pwc1(iu30Var, (byte) 14);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z2 = i3 == 32;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new pwc1(iu30Var, (byte) 15);
                x340Var.s0(objT2);
            }
            boo1.h(new z9i0(str, strO0, strO1, strK, strO2, strO3, function0, strO4, strO5, (Function0) objT2), (qim0) null, x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uoc1(i, this, xke1Var, iu30Var, kswVar, (byte) 16);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void u(rhj1 rhj1Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        Object ae1Var;
        xwa xwaVar;
        xwa xwaVar2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-632699143);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(rhj1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            xwa xwaVarF = fae1.F(x340Var);
            xwa xwaVarF2 = fae1.F(x340Var);
            wkt wktVar = rhj1Var.Y;
            int i3 = i2 & 112;
            boolean zG = (i3 == 32) | ((i2 & 14) == 4) | x340Var.g(xwaVarF) | x340Var.g(xwaVarF2);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                xwaVar = xwaVarF;
                xwaVar2 = xwaVarF2;
                ae1Var = new ae1(rhj1Var, iu30Var, xwaVar, xwaVar2, (lnm) null, (byte) 26);
                x340Var.s0(ae1Var);
            } else {
                ae1Var = objT;
                xwaVar = xwaVarF;
                xwaVar2 = xwaVarF2;
            }
            qxd0.t(wktVar, x340Var, (vu30) ae1Var);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            phj1 phj1Var = rhj1Var.X;
            if (phj1Var instanceof ohj1) {
                x340Var.i0(1861504382);
                dxo1.k(qim0VarD, x340Var, 6);
                x340Var.r(false);
            } else if (phj1Var instanceof mhj1) {
                x340Var.i0(1872150152);
                mhj1 mhj1Var = (mhj1) phj1Var;
                b2p1.s(new qij1(rhj1Var.c, rhj1Var.d, rhj1Var.e, rhj1Var.f, mhj1Var.a, rhj1Var.g, mhj1Var.b, mhj1Var.c), xwaVar, xwaVar2, qim0VarD, (xwa) null, x340Var, 3072, 16);
                x340Var.r(false);
            } else {
                if (!(phj1Var instanceof lhj1)) {
                    throw p3d1.k(x340Var, 1861502704, false);
                }
                x340Var.i0(1861528521);
                boolean z = i3 == 32;
                Object objT2 = x340Var.T();
                if (z || objT2 == m4cVar) {
                    objT2 = new y0j1(iu30Var, (byte) 22);
                    x340Var.s0(objT2);
                }
                rwo1.h(6, (Function0) objT2, x340Var, qim0VarD);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, this, rhj1Var, iu30Var, kswVar, (byte) 22);
        }
    }
}
