package p;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aj71 implements xpw {
    public final ljm0 N0;
    public final ia00 O0 = n3o1.q(this).a(new xi71(this, (byte) 0), new xi71(this, (byte) 1));
    public final psw P0;
    public final a1r0 X;
    public final q8n Y;
    public final ol71 Z;
    public final jxp0 a;
    public final xm41 b;
    public final opl0 c;
    public final i8h1 d;
    public final add e;
    public final k7d f;
    public final ynb0 g;
    public final g871 h;
    public final wh71 i;
    public final lzn0 t;

    public aj71(jxp0 jxp0Var, xm41 xm41Var, opl0 opl0Var, i8h1 i8h1Var, add addVar, k7d k7dVar, ynb0 ynb0Var, g871 g871Var, wh71 wh71Var, lzn0 lzn0Var, a1r0 a1r0Var, q8n q8nVar, ol71 ol71Var) {
        this.a = jxp0Var;
        this.b = xm41Var;
        this.c = opl0Var;
        this.d = i8h1Var;
        this.e = addVar;
        this.f = k7dVar;
        this.g = ynb0Var;
        this.h = g871Var;
        this.i = wh71Var;
        this.t = lzn0Var;
        this.X = a1r0Var;
        this.Y = q8nVar;
        this.Z = ol71Var;
        byte b = 8;
        this.N0 = h7w.D(qi71.c, (bs50) null, qi71.e, new j2i(-467590138, new wcy0(this, b), true), 2);
        j2i j2iVar = new j2i(-305213202, new c771(this, b), true);
        ien0 ien0Var = qsw.a;
        this.P0 = new psw(j2iVar, (byte) 0);
    }

    public static ti71 j(j7d j7dVar) {
        int iOrdinal = j7dVar.ordinal();
        if (iOrdinal == 0) {
            return ti71.c;
        }
        if (iOrdinal == 1) {
            return ti71.b;
        }
        if (iOrdinal == 2) {
            return ti71.a;
        }
        if (iOrdinal == 3) {
            return ti71.d;
        }
        eg.o();
        return null;
    }

    public final rqw a() {
        return this.O0;
    }

    public final jsw c() {
        return this.P0;
    }

    public final void e(ui71 ui71Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2127574784);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ui71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarN = anm1.N("share.sheet.share.onplatform.age.assurance.banner", u291.f(u291.z(nim0.a, (fra) null, 3), 1.0f));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            g(ui71Var, x340Var, i2 & 126);
            otw.c((maa) this.g.get(), new gf71(ui71Var.c, ui71Var.d, ui71Var.e, ui71Var.h, ui71Var.b), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mi71(this, ui71Var, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008e  */
    public final void f(wi71 wi71Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2017407938);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(wi71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(this) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (wi71Var instanceof ui71) {
            x340Var.i0(1122636558);
            ui71 ui71Var = (ui71) wi71Var;
            ti71 ti71Var = ui71Var.g;
            if (ti71Var == ti71.d || ti71Var == ti71.b) {
                x340Var.i0(1122773609);
                x340Var.r(false);
            } else if (ti71Var == ti71.c) {
                qf4 qf4Var = this.e.a;
                if (qf4Var.h() && qf4Var.a()) {
                    x340Var.i0(1122984037);
                    e(ui71Var, x340Var, ((i2 >> 3) & 112) | (i2 & 14));
                    x340Var.r(false);
                } else {
                    x340Var.i0(1123062684);
                    h(ui71Var, x340Var, ((i2 >> 3) & 112) | (i2 & 14));
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(1123062684);
                h(ui71Var, x340Var, ((i2 >> 3) & 112) | (i2 & 14));
                x340Var.r(false);
            }
            x340Var.r(false);
        } else {
            boolean z = wi71Var instanceof vi71;
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(1123177787);
                qim0 qim0VarF = u291.f(u291.z(nim0Var, (fra) null, 3), 1.0f);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                h5p1.e((qim0) null, x340Var, 0);
                x340Var.r(true);
                x340Var.r(false);
            } else {
                if (!(wi71Var instanceof si71)) {
                    throw p3d1.k(x340Var, 1698781225, false);
                }
                x340Var.i0(1123337716);
                int i3 = i2 & 112;
                boolean z2 = i3 == 32;
                Object objT = x340Var.T();
                if (z2 || objT == m4cVar) {
                    objT = new v5a(iu30Var, (lnm) null, (byte) 14);
                    x340Var.s0(objT);
                }
                qxd0.t(rih1.a, x340Var, (vu30) objT);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                boolean z3 = i3 == 32;
                Object objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new m861(iu30Var, (byte) 15);
                    x340Var.s0(objT2);
                }
                x2g0.g(6, (Function0) objT2, x340Var, qim0VarF2);
                x340Var.r(false);
            }
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(this, wi71Var, iu30Var, i, (byte) 20);
        }
    }

    public final void g(ui71 ui71Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(811048239);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ui71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x340Var.b0();
        } else if (ui71Var.f) {
            x340Var.i0(-1547816542);
            qim0 qim0VarN = anm1.N("share.sheet.share.onplatform.onboarding.label.loaded", u291.f(nim0.a, 1.0f));
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = qi71.b;
                x340Var.s0(objT);
            }
            i1k0.f(1, 6, x340Var, s161.b(qim0VarN, true, (iu30) objT));
            x340Var.r(false);
        } else {
            x340Var.i0(-1547486733);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mi71(this, ui71Var, i, (byte) 1);
        }
    }

    public final mqw getBehavior() {
        return this.N0;
    }

    public final void h(ui71 ui71Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(959848003);
        int i2 = (i & 6) == 0 ? (x340Var.g(ui71Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.g(this) ? 32 : 16;
        }
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            Throwable th = null;
            qim0 qim0VarF = u291.f(u291.z(nim0Var, (fra) null, 3), 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            g(ui71Var, x340Var, i2 & 126);
            x340Var.i0(-2059463434);
            List list = ui71Var.a;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    Throwable th2 = th;
                    p7h.T();
                    throw th2;
                }
                a6q0 a6q0Var = (a6q0) obj;
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = (xpw) new pdp0(this.a, (byte) 22).invoke();
                    x340Var.s0(objT);
                }
                arrayList.add(new yq60(new li71(ui71Var.b.b(), a6q0Var, i3, ui71Var.c, ui71Var.d, ui71Var.e, ui71Var.h), (xpw) objT));
                th = th;
                i3 = i4;
                z = false;
            }
            x340Var.r(z);
            wro1.p(mqo1.F(arrayList), anm1.N("share.sheet.share.onplatform.destination_list", u291.f(nim0Var, 1.0f)), (vu30) null, x340Var, 48, 4);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mi71(this, ui71Var, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (p.fn31.Y(r1, r8, r0) == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (p.fn31.Y(r1, r8, r0) == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(p.q6q0 r7, p.o571 r8, p.lnm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.yi71
            if (r0 == 0) goto L13
            r0 = r9
            p.yi71 r0 = (p.yi71) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.yi71 r0 = new p.yi71
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L25
            if (r1 != r2) goto L29
        L25:
            p.hm5.M(r9)
            goto L5c
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L2f:
            p.hm5.M(r9)
            p.b571 r9 = p.b571.d
            p.q8n r1 = r6.Y
            p.d9n r5 = p.d9n.a
            if (r8 == r9) goto L4d
            p.n471 r9 = p.n471.d
            if (r8 != r9) goto L3f
            goto L4d
        L3f:
            p.zi71 r8 = new p.zi71
            r8.<init>(r6, r7, r4, r3)
            r0.c = r2
            java.lang.Object r6 = p.fn31.Y(r1, r8, r0)
            if (r6 != r5) goto L5c
            goto L5b
        L4d:
            p.zi71 r8 = new p.zi71
            r9 = 0
            r8.<init>(r6, r7, r4, r9)
            r0.c = r3
            java.lang.Object r6 = p.fn31.Y(r1, r8, r0)
            if (r6 != r5) goto L5c
        L5b:
            return r5
        L5c:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.aj71.i(p.q6q0, p.o571, p.lnm):java.lang.Object");
    }
}
