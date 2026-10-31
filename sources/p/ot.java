package p;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ot implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;

    public ot(ArrayList arrayList, vi11 vi11Var) {
        this.a = (byte) 22;
        this.b = arrayList;
        this.c = vi11Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        fv01 fv01Var = (fv01) this.c;
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            au01 au01Var = (au01) this.b.get(iIntValue);
            x340Var2.i0(-950289783);
            qim0 qim0VarA = aqb0Var.a(nim0.a, irn1.o0(150, 0, (dlv) null, 6), irn1.l0(0.0f, 400.0f, (Object) null, 5), (n8b1) null);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarA);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            String strD = fv01.d(au01Var, iIntValue);
            boolean z = (((i & 112) ^ 48) > 32 && x340Var2.e(iIntValue)) || (i & 48) == 32;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new po60(iIntValue, (byte) 28);
                x340Var2.s0(objT);
            }
            dgo1.c(strD, (iu30) objT, apo.r(839186396, new ev01(fv01Var, au01Var), x340Var2), x340Var2, 384);
            x340Var2.r(true);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        cm0 cm0Var = (cm0) this.c;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            ezv0 ezv0Var = (ezv0) this.b.get(iIntValue);
            x340Var2.i0(-909598155);
            otw.c(cm0Var, ezv0Var, (qim0) null, ((ljm0) cm0Var.X).b((Object) null, (dts) null, (String) null), x340Var2, 72, 4);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        int i;
        rih1 rih1Var;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        r951 r951Var = (r951) this.c;
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(i & 1, (i & 147) != 146);
        rih1 rih1Var2 = rih1.a;
        if (!zY) {
            x340Var2.b0();
            return rih1Var2;
        }
        kul kulVar = (cwl) this.b.get(iIntValue);
        x340Var2.i0(591672368);
        if (kulVar instanceof xvl) {
            x340Var2.i0(1820202138);
            otw.c((xpw) r951Var.a.getValue(), ((xvl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof wvl) {
            x340Var2.i0(1820205985);
            otw.c((xpw) r951Var.b.getValue(), ((wvl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof rvl) {
            x340Var2.i0(1820209884);
            otw.c((xpw) r951Var.c.getValue(), ((rvl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof qvl) {
            x340Var2.i0(1820213859);
            otw.c((xpw) r951Var.d.getValue(), ((qvl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof bvl) {
            x340Var2.i0(1820217754);
            otw.c((xpw) r951Var.e.getValue(), ((bvl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof avl) {
            x340Var2.i0(1820221601);
            otw.c((xpw) r951Var.f.getValue(), ((avl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof hvl) {
            x340Var2.i0(1820225467);
            otw.c((xpw) r951Var.g.getValue(), ((hvl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 64, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof oul) {
            x340Var2.i0(1820229345);
            otw.c((xpw) r951Var.h.getValue(), ((oul) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 64, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof kvl) {
            x340Var2.i0(1820233475);
            otw.c((xpw) r951Var.i.getValue(), ((kvl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof lvl) {
            x340Var2.i0(1820237898);
            otw.c((xpw) r951Var.j.getValue(), ((lvl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof bwl) {
            x340Var2.i0(1820242307);
            otw.c((xpw) r951Var.k.getValue(), ((bwl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof jul) {
            x340Var2.i0(1820246235);
            otw.c((xpw) r951Var.l.getValue(), ((jul) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof iul) {
            x340Var2.i0(1820250146);
            otw.c((xpw) r951Var.m.getValue(), ((iul) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof ovl) {
            x340Var2.i0(1820254109);
            otw.c((xpw) r951Var.n.getValue(), ((ovl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof nvl) {
            x340Var2.i0(1820258148);
            otw.c((xpw) r951Var.o.getValue(), ((nvl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof hul) {
            x340Var2.i0(1820262074);
            otw.c((xpw) r951Var.f36p.getValue(), ((hul) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof gul) {
            x340Var2.i0(1820265921);
            otw.c((xpw) r951Var.q.getValue(), ((gul) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof zul) {
            x340Var2.i0(1820269820);
            otw.c((xpw) r951Var.r.getValue(), ((zul) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof yul) {
            x340Var2.i0(1820273795);
            otw.c((xpw) r951Var.s.getValue(), ((yul) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof lul) {
            x340Var2.i0(1820277822);
            otw.c((xpw) r951Var.t.getValue(), ((lul) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof kul) {
            x340Var2.i0(1820281925);
            otw.c((xpw) r951Var.u.getValue(), kulVar.a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof vvl) {
            x340Var2.i0(1820285529);
            otw.c((xpw) r951Var.v.getValue(), ((vvl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof uvl) {
            x340Var2.i0(1820289312);
            otw.c((xpw) r951Var.w.getValue(), ((uvl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof mvl) {
            x340Var2.i0(1820293180);
            otw.c((xpw) r951Var.x.getValue(), ((mvl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (kulVar instanceof tvl) {
            x340Var2.i0(1820297023);
            otw.c((xpw) r951Var.y.getValue(), ((tvl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else {
            if (!(kulVar instanceof pul)) {
                if (kulVar instanceof awl) {
                    x340Var2.i0(1820304575);
                    otw.c((maa) r951Var.A.getValue(), ((awl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 64, 12);
                    x340Var2.r(false);
                } else if (kulVar instanceof ivl) {
                    x340Var2.i0(1820307987);
                    otw.c((xpw) r951Var.B.getValue(), rih1Var2, (qim0) null, (ipb1) null, x340Var2, 48, 12);
                    rih1Var = rih1Var2;
                    x340Var2.r(false);
                } else {
                    rih1Var = rih1Var2;
                    if (kulVar instanceof mul) {
                        x340Var2.i0(1820311650);
                        otw.c((xpw) r951Var.C.getValue(), ((mul) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 64, 12);
                        x340Var2.r(false);
                    } else if (kulVar instanceof nul) {
                        x340Var2.i0(1820315547);
                        otw.c((xpw) r951Var.D.getValue(), ((nul) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        x340Var2.r(false);
                    } else if (kulVar instanceof cvl) {
                        x340Var2.i0(1820319326);
                        otw.c((xpw) r951Var.E.getValue(), ((cvl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 64, 12);
                        x340Var2.r(false);
                    } else if (kulVar instanceof uul) {
                        x340Var2.i0(1820323363);
                        otw.c((xpw) r951Var.F.getValue(), ((uul) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        x340Var2.r(false);
                    } else if (kulVar instanceof vul) {
                        x340Var2.i0(1820327423);
                        otw.c((xpw) r951Var.G.getValue(), ((vul) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        x340Var2.r(false);
                    } else if (kulVar instanceof tul) {
                        x340Var2.i0(1820331458);
                        otw.c((xpw) r951Var.H.getValue(), ((tul) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        x340Var2.r(false);
                    } else if (kulVar instanceof wul) {
                        x340Var2.i0(1820335619);
                        otw.c((xpw) r951Var.I.getValue(), ((wul) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 64, 12);
                        x340Var2.r(false);
                    } else if (kulVar instanceof gvl) {
                        x340Var2.i0(1820339811);
                        otw.c((xpw) r951Var.J.getValue(), ((gvl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        x340Var2.r(false);
                    } else if (kulVar instanceof fvl) {
                        x340Var2.i0(1820343871);
                        otw.c((xpw) r951Var.K.getValue(), ((fvl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        x340Var2.r(false);
                    } else if (kulVar instanceof qul) {
                        x340Var2.i0(1820347939);
                        otw.c((xpw) r951Var.L.getValue(), ((qul) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 64, 12);
                        x340Var2.r(false);
                    } else if (kulVar instanceof zvl) {
                        x340Var2.i0(1820352065);
                        otw.c((xpw) r951Var.M.getValue(), ((zvl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 64, 12);
                        x340Var2.r(false);
                    } else if (kulVar instanceof svl) {
                        x340Var2.i0(1820356360);
                        otw.c((xpw) r951Var.N.getValue(), ((svl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 64, 12);
                        x340Var2.r(false);
                    } else if (kulVar instanceof sul) {
                        x340Var2.i0(1820365516);
                        otw.c((xpw) r951Var.O.getValue(), ((sul) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 64, 12);
                        x340Var2.r(false);
                    } else if (kulVar instanceof pvl) {
                        x340Var2.i0(1820369987);
                        otw.c((xpw) r951Var.P.getValue(), ((pvl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 64, 12);
                        x340Var2.r(false);
                    } else {
                        if (!(kulVar instanceof yvl)) {
                            throw p3d1.k(x340Var2, 1820201523, false);
                        }
                        x340Var2.i0(1820374278);
                        otw.c((xpw) r951Var.Q.getValue(), ((yvl) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 64, 12);
                        x340Var2.r(false);
                    }
                }
                x340Var2.r(false);
                return rih1Var;
            }
            x340Var2.i0(1820300794);
            otw.c((xpw) r951Var.z.getValue(), ((pul) kulVar).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        }
        rih1Var = rih1Var2;
        x340Var2.r(false);
        return rih1Var;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            j681 j681Var = (j681) ((ArrayList) this.b).get(iIntValue);
            x340Var2.i0(1413819768);
            otw.c((xpw) this.c, j681Var, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            yue1 yue1Var = (yue1) ((ArrayList) this.b).get(iIntValue);
            x340Var2.i0(1842357466);
            boolean zG = x340Var2.g(yue1Var);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = hso1.s(yue1Var, (vi11) this.c);
                x340Var2.s0(objT);
            }
            xpw xpwVar = (xpw) objT;
            boolean z = xpwVar instanceof nf60;
            qim0 qim0VarZ = nim0.a;
            if (z) {
                x340Var2.i0(-910395441);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-910394244);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarZ);
                x340Var2.r(false);
            }
            qim0 qim0Var = qim0VarZ;
            if (xpwVar == null) {
                x340Var2.i0(1842628466);
            } else {
                x340Var2.i0(1842628467);
                otw.c(xpwVar, yue1Var, qim0Var, (ipb1) null, x340Var2, 0, 8);
            }
            x340Var2.r(false);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            tfe1 tfe1Var = (tfe1) this.b.get(iIntValue);
            x340Var2.i0(-530070747);
            otw.c((maa) ((ynb0) ((a4f0) this.c).c).get(), new tfe1(tfe1Var.a, tfe1Var.b, tfe1Var.c), (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        iu30 iu30Var = null;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.c;
        c380 c380Var = this.b;
        boolean z = true;
        byte b2 = 0;
        switch (b) {
            case 0:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (x340Var.g(aqb0Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= x340Var.e(iIntValue) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i & 1, (i & 147) != 146)) {
                    ev evVar = (ev) c380Var.get(iIntValue);
                    x340Var2.i0(1786871788);
                    otw.c((maa) ((ynb0) ((pt) obj5).f).get(), new iu(evVar, iIntValue), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    x340Var2.r(false);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                aqb0 aqb0Var2 = (aqb0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (x340Var3.g(aqb0Var2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= x340Var3.e(iIntValue3) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    h951 h951Var = (h951) c380Var.get(iIntValue3);
                    x340Var4.i0(924231494);
                    otw.c((umf0) obj5, new bu3(iIntValue3, h951Var), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                    x340Var4.r(false);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                aqb0 aqb0Var3 = (aqb0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var5 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (x340Var5.g(aqb0Var3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= x340Var5.e(iIntValue5) ? 32 : 16;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(i3 & 1, (i3 & 147) != 146)) {
                    x5d x5dVar = (x5d) c380Var.get(iIntValue5);
                    x340Var6.i0(-484242872);
                    otw.c((pt) obj5, x5dVar, (qim0) null, (ipb1) null, x340Var6, 0, 12);
                    x340Var6.r(false);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                aqb0 aqb0Var4 = (aqb0) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var7 = (b0k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (x340Var7.g(aqb0Var4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= x340Var7.e(iIntValue7) ? 32 : 16;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i4 & 1, (i4 & 147) != 146)) {
                    gzd gzdVar = (gzd) c380Var.get(iIntValue7);
                    x340Var8.i0(1856141747);
                    otw.c((umf0) obj5, new cwd(gzdVar), u291.k(u291.p(nim0Var, 272.0f), 104.0f), (ipb1) null, x340Var8, 0, 8);
                    x340Var8.r(false);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                aqb0 aqb0Var5 = (aqb0) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var9 = (b0k) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                y9f y9fVar = (y9f) obj5;
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (x340Var9.g(aqb0Var5) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= x340Var9.e(iIntValue9) ? 32 : 16;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(i5 & 1, (i5 & 147) != 146)) {
                    goe goeVar = (goe) c380Var.get(iIntValue9);
                    x340Var10.i0(-1159165905);
                    otw.c((jkf) y9fVar.m.getValue(), new ekf(iIntValue9, y9fVar.b.a, goeVar, cwl1.C(y9fVar.k)), (qim0) null, (ipb1) null, x340Var10, 0, 12);
                    x340Var10.r(false);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 5:
                aqb0 aqb0Var6 = (aqb0) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var11 = (b0k) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (x340Var11.g(aqb0Var6) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= x340Var11.e(iIntValue11) ? 32 : 16;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(i6 & 1, (i6 & 147) != 146)) {
                    vpf vpfVar = (vpf) c380Var.get(iIntValue11);
                    x340Var12.i0(-567058148);
                    otw.c((yve) obj5, new wve(iIntValue11, vpfVar.e, vpfVar.a, vpfVar.b, vpfVar.c, vpfVar.d, vpfVar.f, vpfVar.g), (qim0) null, (ipb1) null, x340Var12, 0, 12);
                    x340Var12.r(false);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 6:
                aqb0 aqb0Var7 = (aqb0) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var13 = (b0k) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (x340Var13.g(aqb0Var7) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= x340Var13.e(iIntValue13) ? 32 : 16;
                }
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(i7 & 1, (i7 & 147) != 146)) {
                    hqk hqkVar = (hqk) c380Var.get(iIntValue13);
                    x340Var14.i0(-369470212);
                    otw.c((tgk) obj5, hqkVar, (qim0) null, (ipb1) null, x340Var14, 0, 12);
                    x340Var14.r(false);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 7:
                aqb0 aqb0Var8 = (aqb0) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var15 = (b0k) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                if ((iIntValue16 & 6) == 0) {
                    i8 = iIntValue16 | (x340Var15.g(aqb0Var8) ? 4 : 2);
                } else {
                    i8 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i8 |= x340Var15.e(iIntValue15) ? 32 : 16;
                }
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(i8 & 1, (i8 & 147) != 146)) {
                    o6g0 o6g0Var = (o6g0) ((ArrayList) c380Var).get(iIntValue15);
                    x340Var16.i0(880031783);
                    ((j2i) obj5).c1(aqb0Var8, Integer.valueOf(iIntValue15), o6g0Var, x340Var16, Integer.valueOf(i8 & 126));
                    x340Var16.r(false);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 8:
                aqb0 aqb0Var9 = (aqb0) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                x340 x340Var17 = (b0k) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                if ((iIntValue18 & 6) == 0) {
                    i9 = iIntValue18 | (x340Var17.g(aqb0Var9) ? 4 : 2);
                } else {
                    i9 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i9 |= x340Var17.e(iIntValue17) ? 32 : 16;
                }
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(i9 & 1, (i9 & 147) != 146)) {
                    d6q0 d6q0Var = (d6q0) c380Var.get(iIntValue17);
                    x340Var18.i0(-25368626);
                    wn50 wn50Var = (wn50) obj5;
                    String str = d6q0Var.c ? d6q0Var.b : "";
                    List list = d6q0Var.a;
                    String strZ = d6q0Var.b().z();
                    otw.c(wn50Var, new un50(iIntValue17, strZ != null ? strZ : "", str, list), (qim0) null, (ipb1) null, x340Var18, 0, 12);
                    x340Var18.r(false);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 9:
                aqb0 aqb0Var10 = (aqb0) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                x340 x340Var19 = (b0k) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                vu30 vu30Var = (vu30) obj5;
                if ((iIntValue20 & 6) == 0) {
                    i10 = iIntValue20 | (x340Var19.g(aqb0Var10) ? 4 : 2);
                } else {
                    i10 = iIntValue20;
                }
                if ((iIntValue20 & 48) == 0) {
                    i10 |= x340Var19.e(iIntValue19) ? 32 : 16;
                }
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(i10 & 1, (i10 & 147) != 146)) {
                    f5y f5yVar = (f5y) c380Var.get(iIntValue19);
                    x340Var20.i0(1950467615);
                    String str2 = f5yVar.b;
                    boolean z2 = f5yVar.c;
                    boolean zG = x340Var20.g(vu30Var) | x340Var20.g(f5yVar);
                    Object objT = x340Var20.T();
                    if (zG || objT == fkj0.X) {
                        objT = new t3x(vu30Var, f5yVar, (byte) 6);
                        x340Var20.s0(objT);
                    }
                    rwq0.n(0, str2, (Function0) objT, x340Var20, (qim0) null, z2);
                    x340Var20.r(false);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 10:
                aqb0 aqb0Var11 = (aqb0) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                x340 x340Var21 = (b0k) obj3;
                int iIntValue22 = ((Number) obj4).intValue();
                if ((iIntValue22 & 6) == 0) {
                    i11 = iIntValue22 | (x340Var21.g(aqb0Var11) ? 4 : 2);
                } else {
                    i11 = iIntValue22;
                }
                if ((iIntValue22 & 48) == 0) {
                    i11 |= x340Var21.e(iIntValue21) ? 32 : 16;
                }
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(i11 & 1, (i11 & 147) != 146)) {
                    sn7 sn7Var = (sn7) c380Var.get(iIntValue21);
                    x340Var22.i0(-289692308);
                    otw.c(((yg50) obj5).a, new bo7(sn7Var.a, sn7Var.c, sn7Var.b), (qim0) null, (ipb1) null, x340Var22, 0, 12);
                    x340Var22.r(false);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 11:
                aqb0 aqb0Var12 = (aqb0) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                x340 x340Var23 = (b0k) obj3;
                int iIntValue24 = ((Number) obj4).intValue();
                if ((iIntValue24 & 6) == 0) {
                    i12 = iIntValue24 | (x340Var23.g(aqb0Var12) ? 4 : 2);
                } else {
                    i12 = iIntValue24;
                }
                if ((iIntValue24 & 48) == 0) {
                    i12 |= x340Var23.e(iIntValue23) ? 32 : 16;
                }
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(i12 & 1, (i12 & 147) != 146)) {
                    sn7 sn7Var2 = (sn7) c380Var.get(iIntValue23);
                    x340Var24.i0(1972256382);
                    String str3 = sn7Var2.a;
                    if ((((i12 & 112) ^ 48) <= 32 || !x340Var24.e(iIntValue23)) && (i12 & 48) != 32) {
                        z = false;
                    }
                    Object objT2 = x340Var24.T();
                    if (z || objT2 == fkj0.X) {
                        objT2 = new po60(iIntValue23, (byte) 12);
                        x340Var24.s0(objT2);
                    }
                    dgo1.c(str3, (iu30) objT2, apo.r(605121126, new vx90((p9d0) obj5, sn7Var2, (byte) 23), x340Var24), x340Var24, 384);
                    x340Var24.r(false);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 12:
                aqb0 aqb0Var13 = (aqb0) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                x340 x340Var25 = (b0k) obj3;
                int iIntValue26 = ((Number) obj4).intValue();
                if ((iIntValue26 & 6) == 0) {
                    i13 = iIntValue26 | (x340Var25.g(aqb0Var13) ? 4 : 2);
                } else {
                    i13 = iIntValue26;
                }
                if ((iIntValue26 & 48) == 0) {
                    i13 |= x340Var25.e(iIntValue25) ? 32 : 16;
                }
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(i13 & 1, (i13 & 147) != 146)) {
                    se30 se30Var = (se30) c380Var.get(iIntValue25);
                    x340Var26.i0(-1259432803);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var26, 0);
                    int iHashCode = Long.hashCode(x340Var26.T);
                    xos0 xos0VarM = x340Var26.m();
                    qim0 qim0VarE = zr7.E(x340Var26, nim0Var);
                    hzj.A.getClass();
                    if (x340Var26.a == null) {
                        tgp1.p();
                        throw 0;
                    }
                    x340Var26.m0();
                    if (x340Var26.S) {
                        x340Var26.l(n4kVar);
                    } else {
                        x340Var26.v0();
                    }
                    nko1.H(mbhVarA, x340Var26, y580.O0);
                    nko1.H(xos0VarM, x340Var26, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var26, y580.R0);
                    nko1.F(x340Var26);
                    nko1.H(qim0VarE, x340Var26, y580.Y);
                    String str4 = se30Var.a;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str4, (qim0) null, cbx.d(x340Var26).h, cbx.a(x340Var26).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var26, 0, 0, 2034);
                    uwo1.e(se30Var.b, (qim0) null, cbx.d(x340Var26).g, cbx.a(x340Var26).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var26, 0, 0, 2034);
                    if (iIntValue25 < p7h.L((List) obj5)) {
                        x340Var26.i0(964023751);
                        x0d.s(nim0Var, cbx.b(x340Var26).b.a, x340Var26, false);
                    } else {
                        x340Var26.i0(964115046);
                        x340Var26.r(false);
                    }
                    x340Var26.r(true);
                    x340Var26.r(false);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 13:
                aqb0 aqb0Var14 = (aqb0) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                x340 x340Var27 = (b0k) obj3;
                int iIntValue28 = ((Number) obj4).intValue();
                if ((iIntValue28 & 6) == 0) {
                    i14 = iIntValue28 | (x340Var27.g(aqb0Var14) ? 4 : 2);
                } else {
                    i14 = iIntValue28;
                }
                if ((iIntValue28 & 48) == 0) {
                    i14 |= x340Var27.e(iIntValue27) ? 32 : 16;
                }
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(i14 & 1, (i14 & 147) != 146)) {
                    di90 di90Var = (di90) c380Var.get(iIntValue27);
                    x340Var28.i0(-2129600830);
                    qim0 qim0VarB = aqb0.b(aqb0Var14, anm1.N("mixing_reorder_row_".concat(di90Var.a), nim0Var), irn1.o0(300, 0, (dlv) null, 6), irn1.o0(500, 0, (dlv) null, 6), 4);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var28.T);
                    xos0 xos0VarM2 = x340Var28.m();
                    qim0 qim0VarE2 = zr7.E(x340Var28, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var28.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var28.m0();
                    if (x340Var28.S) {
                        x340Var28.l(n4kVar);
                    } else {
                        x340Var28.v0();
                    }
                    nko1.H(gfh0VarC, x340Var28, y580.O0);
                    nko1.H(xos0VarM2, x340Var28, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var28, y580.R0);
                    nko1.F(x340Var28);
                    nko1.H(qim0VarE2, x340Var28, y580.Y);
                    pek0 pek0Var = (pek0) obj5;
                    i1o1.e(pek0Var.c, new mlk0(di90Var.b, (lhg1) null, false, (Float) null, 0, false, 508), pek0Var.a, (qim0) null, (ipb1) null, e2j.d, (xu30) null, 0, (xu30) null, x340Var28, 196672, 236);
                    x340Var28.r(true);
                    x340Var28.r(false);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 14:
                aqb0 aqb0Var15 = (aqb0) obj;
                int iIntValue29 = ((Number) obj2).intValue();
                x340 x340Var29 = (b0k) obj3;
                int iIntValue30 = ((Number) obj4).intValue();
                if ((iIntValue30 & 6) == 0) {
                    i15 = iIntValue30 | (x340Var29.g(aqb0Var15) ? 4 : 2);
                } else {
                    i15 = iIntValue30;
                }
                if ((iIntValue30 & 48) == 0) {
                    i15 |= x340Var29.e(iIntValue29) ? 32 : 16;
                }
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(i15 & 1, (i15 & 147) != 146)) {
                    gin0 gin0Var = (gin0) c380Var.get(iIntValue29);
                    x340Var30.i0(179397526);
                    vxr0 vxr0Var = new vxr0(28, gin0Var.b, (String) null, false, false);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var30).b;
                    otw.c((eyr0) obj5, vxr0Var, uyn1.B(nim0.a, 16.0f, 0.0f, 0.0f, 0.0f, 14), (ipb1) null, x340Var30, 0, 8);
                    x340Var30.r(false);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 15:
                aqb0 aqb0Var16 = (aqb0) obj;
                int iIntValue31 = ((Number) obj2).intValue();
                x340 x340Var31 = (b0k) obj3;
                int iIntValue32 = ((Number) obj4).intValue();
                if ((iIntValue32 & 6) == 0) {
                    i16 = iIntValue32 | (x340Var31.g(aqb0Var16) ? 4 : 2);
                } else {
                    i16 = iIntValue32;
                }
                if ((iIntValue32 & 48) == 0) {
                    i16 |= x340Var31.e(iIntValue31) ? 32 : 16;
                }
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(i16 & 1, (i16 & 147) != 146)) {
                    fvp0 fvp0Var = (fvp0) ((ArrayList) c380Var).get(iIntValue31);
                    x340Var32.i0(-797642617);
                    otw.c((xpw) ((idd1) ((avp0) obj5).e).getValue(), fvp0Var, (qim0) null, (ipb1) null, x340Var32, 0, 12);
                    x340Var32.r(false);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case 16:
                aqb0 aqb0Var17 = (aqb0) obj;
                int iIntValue33 = ((Number) obj2).intValue();
                x340 x340Var33 = (b0k) obj3;
                int iIntValue34 = ((Number) obj4).intValue();
                i501 i501Var = (i501) obj5;
                if ((iIntValue34 & 6) == 0) {
                    i17 = iIntValue34 | (x340Var33.g(aqb0Var17) ? 4 : 2);
                } else {
                    i17 = iIntValue34;
                }
                if ((iIntValue34 & 48) == 0) {
                    i17 |= x340Var33.e(iIntValue33) ? 32 : 16;
                }
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(i17 & 1, (i17 & 147) != 146)) {
                    c401 c401Var = (c401) c380Var.get(iIntValue33);
                    x340Var34.i0(1770511789);
                    qim0 qim0VarB2 = uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 10.0f, 7);
                    b401 b401Var = c401Var.a;
                    w501 w501Var = new w501(new v501(b401Var.a, b401Var.b, b401Var.d, b401Var.c), c401Var.b, c401Var.c);
                    gw70 gw70Var = i501Var.Z1;
                    if (gw70Var == null) {
                        u890.C("imageLoader");
                        throw null;
                    }
                    if (c401Var.d) {
                        x340Var34.i0(1770719705);
                        boolean zI = x340Var34.i(i501Var);
                        Object objT3 = x340Var34.T();
                        if (zI || objT3 == fkj0.X) {
                            objT3 = new g501(i501Var, b2);
                            x340Var34.s0(objT3);
                        }
                        iu30Var = (iu30) objT3;
                        x340Var34.r(false);
                    } else {
                        x340Var34.i0(1770835304);
                        x340Var34.r(false);
                    }
                    oqo1.g(gw70Var, w501Var, qim0VarB2, iu30Var, x340Var34, 0);
                    x340Var34.r(false);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case 17:
                return a(obj, obj2, obj3, obj4);
            case 18:
                rwj rwjVar = (rwj) obj5;
                aqb0 aqb0Var18 = (aqb0) obj;
                int iIntValue35 = ((Number) obj2).intValue();
                x340 x340Var35 = (b0k) obj3;
                int iIntValue36 = ((Number) obj4).intValue();
                if ((iIntValue36 & 6) == 0) {
                    i18 = iIntValue36 | (x340Var35.g(aqb0Var18) ? 4 : 2);
                } else {
                    i18 = iIntValue36;
                }
                if ((iIntValue36 & 48) == 0) {
                    i18 |= x340Var35.e(iIntValue35) ? 32 : 16;
                }
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(i18 & 1, (i18 & 147) != 146)) {
                    ojd0 ojd0Var = (ojd0) c380Var.get(iIntValue35);
                    x340Var36.i0(594616258);
                    otw.c(rwjVar, ojd0Var, (qim0) null, ((rey0) rwjVar.h).b((Object) null, (dts) null, (String) null), x340Var36, 8, 4);
                    x340Var36.r(false);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
            case 19:
                return d(obj, obj2, obj3, obj4);
            case 20:
                return e(obj, obj2, obj3, obj4);
            case 21:
                return f(obj, obj2, obj3, obj4);
            case 22:
                return g(obj, obj2, obj3, obj4);
            case 23:
                return h(obj, obj2, obj3, obj4);
            default:
                aqb0 aqb0Var19 = (aqb0) obj;
                int iIntValue37 = ((Number) obj2).intValue();
                x340 x340Var37 = (b0k) obj3;
                int iIntValue38 = ((Number) obj4).intValue();
                if ((iIntValue38 & 6) == 0) {
                    i19 = iIntValue38 | (x340Var37.g(aqb0Var19) ? 4 : 2);
                } else {
                    i19 = iIntValue38;
                }
                if ((iIntValue38 & 48) == 0) {
                    i19 |= x340Var37.e(iIntValue37) ? 32 : 16;
                }
                x340 x340Var38 = x340Var37;
                if (x340Var38.Y(i19 & 1, (i19 & 147) != 146)) {
                    yd20 yd20Var = (yd20) c380Var.get(iIntValue37);
                    x340Var38.i0(1258643861);
                    otw.c((bzr) obj5, new ee20(yd20Var), (qim0) null, (ipb1) null, x340Var38, 0, 12);
                    x340Var38.r(false);
                } else {
                    x340Var38.b0();
                }
                return rih1Var;
        }
    }

    public /* synthetic */ ot(List list, Object obj, byte b) {
        this.a = b;
        this.b = list;
        this.c = obj;
    }
}
