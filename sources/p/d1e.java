package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class d1e {
    public static final /* synthetic */ mma0[] a = {new een0(d1e.class, "contentUri", "getContentUri(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)};
    public static final kiv b = new kiv(xrc.O0, (byte) 1);

    static {
        d261 d261Var = gzd1.a;
    }

    public static final void a(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1090486442);
        int i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarQ = i1p1.q(qim0Var, er31.b(16.0f));
            long jK = f5p1.k(x340Var, 2131100228);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarX = uyn1.x(dug.f(qim0VarQ, jK, er31.b(6.0f)), 8.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            ywx0.l(54, j2iVar, h2c.a, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new klb((byte) 1, i, j2iVar, qim0Var);
        }
    }

    public static final void b(c380 c380Var, int i, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1966500281);
        int i3 = i2 | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.e(i) ? 32 : 16) | (x340Var.e(16) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024) | (x340Var.i(iu30Var2) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            Integer numValueOf = Integer.valueOf(i);
            boolean zG = ((i3 & 112) == 32) | x340Var.g(xtb0VarA);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = new x0e(xtb0VarA, i, (lnm) null, (byte) 0);
                x340Var.s0(objT);
            }
            qxd0.t(numValueOf, x340Var, (vu30) objT);
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == obj) {
                objT3 = new y0e(iu30Var, ven0Var);
                x340Var.s0(objT3);
            }
            d36 d36Var = new d36(12.0f, true, new um5(false));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("carousel_row", bmq0.L(u291.d(qim0Var3, 1.0f), (y0e) objT3, (g6o0) null));
            zzq0 zzq0VarJ = uyn1.j(16.0f, 0.0f, 16.0f, 0.0f, 10);
            boolean z = ((i3 & 57344) == 16384) | ((i3 & 14) == 4);
            Object objT4 = x340Var.T();
            if (z || objT4 == obj) {
                objT4 = new li1((byte) 1, iu30Var2, c380Var);
                x340Var.s0(objT4);
            }
            s3o1.e(qim0VarN, xtb0VarA, zzq0VarJ, d36Var, null, null, null, (iu30) objT4, x340Var, 0, 232);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(c380Var, i, iu30Var, iu30Var2, qim0Var2, i2);
        }
    }

    public static final void c(evl evlVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(433972106);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(evlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            a(48, apo.r(-384927886, new ef8(evlVar, iu30Var, (byte) 12), x340Var), x340Var, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b((byte) 8, i, evlVar, iu30Var, qim0Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(dwl dwlVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2098835535);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(dwlVar) : x340Var.i(dwlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        boolean z = true;
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (dwlVar instanceof evl) {
            x340Var.i0(-275338822);
            qim0 qim0VarN = anm1.N("image_card", d7e.r(1.0f, qim0Var, false));
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !x340Var.i(dwlVar))) {
                z = false;
            }
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new b1e(dwlVar, (byte) 0);
                x340Var.s0(objT);
            }
            c((evl) dwlVar, iu30Var, s161.b(qim0VarN, false, (iu30) objT), x340Var, i2 & 126);
            x340Var.r(false);
        } else if (dwlVar instanceof jvl) {
            x340Var.i0(-275050677);
            qim0 qim0VarN2 = anm1.N("looping_video_card", d7e.r(1.0f, qim0Var, false));
            int i3 = i2 & 14;
            boolean z2 = i3 == 4 || ((i2 & 8) != 0 && x340Var.i(dwlVar));
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new b1e(dwlVar, (byte) 1);
                x340Var.s0(objT2);
            }
            e((jvl) dwlVar, s161.b(qim0VarN2, false, (iu30) objT2), iu30Var, x340Var, ((i2 << 3) & 896) | i3);
            x340Var.r(false);
        } else {
            if (!(dwlVar instanceof xul)) {
                throw p3d1.k(x340Var, 1653685138, false);
            }
            x340Var.i0(-274755278);
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            zhy zhyVar = (zhy) x340Var.k(b);
            qim0 qim0VarN3 = anm1.N("entity_card", qim0Var);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !x340Var.i(dwlVar))) {
                z = false;
            }
            Object objT3 = x340Var.T();
            if (z || objT3 == m4cVar) {
                objT3 = new b1e(dwlVar, (byte) 2);
                x340Var.s0(objT3);
            }
            otw.c(zhyVar, i541.V(((xul) dwlVar).a, context, z4p1.G(f5p1.k(x340Var, 2131100228))), s161.b(qim0VarN3, false, (iu30) objT3), (ipb1) null, x340Var, 0, 8);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b((byte) 9, i, dwlVar, iu30Var, qim0Var);
        }
    }

    public static final void e(jvl jvlVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1129416790);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(jvlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            a(48, apo.r(-1531308654, new ef8(jvlVar, iu30Var, (byte) 13), x340Var), x340Var, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b(jvlVar, qim0Var, iu30Var, i, (byte) 10);
        }
    }

    public static final void f(c380 c380Var, qim0 qim0Var, int i, j2i j2iVar, b0k b0kVar, int i2) {
        hdn0 hdn0Var;
        Integer num;
        int i3;
        boolean z;
        boolean z2;
        c380 c380Var2;
        int i4;
        c380 c380Var3 = c380Var;
        int i5 = i;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        pl3 pl3Var = een.Z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-5553530);
        j06 j06Var = x340Var.a;
        int i6 = i2 | (x340Var.g(c380Var3) ? 4 : 2) | (x340Var.e(3) ? 32 : 16) | (x340Var.e(5) ? 256 : 128) | (x340Var.e(i5) ? 16384 : 8192);
        if (x340Var.Y(i6 & 1, (74899 & i6) != 74898)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(3, x340Var);
            }
            hdn0 hdn0Var2 = (hdn0) objT;
            Integer num2 = 48;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            boolean zG = x340Var.g(watVar) | ((i6 & 57344) == 16384) | ((i6 & 112) == 32) | ((i6 & 896) == 256);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new c1e(watVar, i5, hdn0Var2);
                x340Var.s0(objT2);
            }
            qim0 qim0VarX = ern1.x(qim0VarF, (iu30) objT2);
            mbh mbhVarA = jbh.a(new d36(12.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            x340Var.i0(-564290357);
            int i7 = 0;
            while (i7 < c380Var3.size()) {
                dwl dwlVar = (dwl) c380Var3.get(i7);
                boolean z4 = dwlVar instanceof xul;
                nim0 nim0Var = nim0.a;
                if (z4) {
                    x340Var.i0(-313053482);
                    int i8 = i7;
                    qim0 qim0VarZ = uyn1.z(i5, 0.0f, 2, u291.h(u291.f(nim0Var, 1.0f), 96.0f));
                    hdn0Var = hdn0Var2;
                    jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), pl3Var, x340Var, 0);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
                    hzj.A.getClass();
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(jw31VarA, x340Var, lljVar4);
                    nko1.H(xos0VarM2, x340Var, lljVar3);
                    x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                    nko1.H(qim0VarE2, x340Var, lljVar);
                    num = num2;
                    j2iVar.invoke(dwlVar, x340Var, num);
                    x340Var.r(true);
                    x340Var.r(false);
                    pl3Var = pl3Var;
                    i4 = i8 + 1;
                    c380Var2 = c380Var;
                } else {
                    int i9 = i7;
                    hdn0Var = hdn0Var2;
                    num = num2;
                    x340Var.i0(-312696734);
                    qim0 qim0VarZ2 = uyn1.z(i5, 0.0f, 2, u291.f(nim0Var, 1.0f));
                    jw31 jw31VarA2 = ew31.a(new d36(12.0f, true, new um5(false)), pl3Var, x340Var, 0);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarZ2);
                    hzj.A.getClass();
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(jw31VarA2, x340Var, lljVar4);
                    nko1.H(xos0VarM3, x340Var, lljVar3);
                    x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar);
                    x340Var.i0(448457931);
                    err0 err0Var = (err0) hdn0Var;
                    int iS = err0Var.s();
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= iS) {
                            i3 = i10;
                            z = false;
                            z2 = true;
                            c380Var2 = c380Var;
                        } else {
                            int i12 = i9 + i11;
                            if (i12 < c380Var.size()) {
                                c380Var2 = c380Var;
                                if (!(c380Var2.get(i12) instanceof xul)) {
                                    x340Var.i0(1017454524);
                                    int i13 = iS;
                                    int i14 = i10;
                                    if (1.0f <= 0.0d) {
                                        of80.a("invalid weight; must be greater than zero");
                                    }
                                    wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                                    gfh0 gfh0VarC = t1c.c(een.d, false);
                                    int i15 = i11;
                                    int iHashCode4 = Long.hashCode(x340Var.T);
                                    xos0 xos0VarM4 = x340Var.m();
                                    qim0 qim0VarE4 = zr7.E(x340Var, wnb0Var);
                                    hzj.A.getClass();
                                    x340Var.m0();
                                    pl3 pl3Var2 = pl3Var;
                                    if (x340Var.S) {
                                        x340Var.l(n4kVar);
                                    } else {
                                        x340Var.v0();
                                    }
                                    nko1.H(gfh0VarC, x340Var, lljVar4);
                                    nko1.H(xos0VarM4, x340Var, lljVar3);
                                    x0d.q(iHashCode4, x340Var, lljVar2, x340Var);
                                    nko1.H(qim0VarE4, x340Var, lljVar);
                                    j2iVar.invoke(c380Var2.get(i12), x340Var, num);
                                    x340Var.r(true);
                                    i10 = i14 + 1;
                                    x340Var.r(false);
                                    i11 = i15 + 1;
                                    iS = i13;
                                    pl3Var = pl3Var2;
                                }
                            } else {
                                c380Var2 = c380Var;
                            }
                            i3 = i10;
                            x340Var.i0(1017592474);
                            int iS2 = err0Var.s() - i3;
                            float f = iS2;
                            if (f <= 0.0d) {
                                of80.a("invalid weight; must be greater than zero");
                            }
                            if (f > Float.MAX_VALUE) {
                                f = Float.MAX_VALUE;
                            }
                            z2 = true;
                            op71.g(x340Var, uyn1.z(iS2 * i, 0.0f, 2, new wnb0(f, true)));
                            z = false;
                            x340Var.r(false);
                        }
                        x340Var.r(z);
                        x340Var.r(z2);
                        i4 = i9 + i3;
                        x340Var.r(z);
                    }
                }
                num2 = num;
                i7 = i4;
                hdn0Var2 = hdn0Var;
                pl3Var = pl3Var;
                i5 = i;
                c380Var3 = c380Var2;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r27(c380Var, qim0Var, i, j2iVar, i2);
        }
    }
}
