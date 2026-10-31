package p;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n8k0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n8k0(Object obj, Object obj2, boolean z, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        hax haxVar;
        vzq0 vzq0Var = (vzq0) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(vzq0Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18);
        j06 j06Var = x340Var2.a;
        if (zY) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarW = uyn1.w(u291.d(nim0Var, 1.0f), vzq0Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarW);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            dlg1 dlg1Var = (dlg1) this.c;
            y7e1 y7e1Var = (y7e1) this.d;
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            String strO0 = cwl1.o0(x340Var2, 2131963526);
            lee1 lee1Var = cbx.d(x340Var2).d;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            uwo1.e(strO0, uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, 16.0f, 7), lee1Var, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2024);
            eyx eyxVar = eyx.e;
            boolean z2 = this.b;
            if (z2) {
                x340Var2.i0(538446830);
                haxVar = new hax(cwl1.o0(x340Var2, 2131963525));
                x340Var2.r(false);
            } else {
                x340Var2.i0(538449689);
                x340Var2.r(false);
                haxVar = jax.a;
            }
            rwo1.a(y7e1Var, eyxVar, u291.f(nim0Var, 1.0f), haxVar, cwl1.o0(x340Var2, 2131963522), (vu30) null, (vu30) null, false, (sjn0) dlg1Var.c, (lee1) null, new kua0(2, Boolean.FALSE, 1, 0, 120), (yta0) null, (e6e1) null, (vu30) null, (idn0) null, (uwg) null, (es41) null, (vzq0) null, 0.0f, false, x340Var2, 390, 0, 0, 2094560);
            String strO1 = cwl1.o0(x340Var2, 2131963521);
            String strN0 = cwl1.n0(2131963520, new Object[]{strO1}, x340Var2);
            c9 c9VarS = mqo1.s(new mae1[]{new mae1(strO1, "https://support.spotify.com/article/managed-accounts-for-premium-family/")});
            lee1 lee1Var2 = cbx.d(x340Var2).j;
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            cvx cvxVar4 = cbx.b(x340Var2).b;
            qim0 qim0VarB2 = uyn1.B(qim0VarF2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            boolean zG = x340Var2.g(dlg1Var);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new ymg1(dlg1Var, (byte) 16);
                x340Var2.s0(objT);
            }
            i8p1.i(strN0, c9VarS, (iu30) objT, qim0VarB2, lee1Var2, 0L, 0L, x340Var2, 0, 96);
            x340Var2.r(true);
            if (z2) {
                x340Var2.i0(167772707);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarD);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                rhx0.a((qim0) null, cbx.a(x340Var2).c.c, 0.0f, 0L, 0, 0.0f, x340Var2, 0, 61);
                x340Var2.r(true);
                x340Var2.r(false);
            } else {
                x340Var2.i0(168095603);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        nim0 nim0Var;
        rdi1 rdi1Var;
        Function0 function0;
        boolean z;
        x340 x340Var;
        x340 x340Var2;
        x340 x340Var3 = (b0k) obj2;
        ((Number) obj3).intValue();
        float fC = ((i2c) obj).c() * 0.3f;
        era eraVar = een.Q0;
        nim0 nim0Var2 = nim0.a;
        qim0 qim0VarD = u291.d(nim0Var2, 1.0f);
        rdi1 rdi1Var2 = (rdi1) this.c;
        Function0 function1 = (Function0) this.d;
        mbh mbhVarA = jbh.a(h36.e, eraVar, x340Var3, 0);
        x340 x340Var4 = x340Var3;
        int iHashCode = Long.hashCode(x340Var4.T);
        xos0 xos0VarM = x340Var4.m();
        qim0 qim0VarE = zr7.E(x340Var3, qim0VarD);
        hzj.A.getClass();
        x340 x340Var5 = x340Var3;
        if (x340Var5.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var5.m0();
        if (x340Var5.S) {
            x340Var5.l(hmb0.t1);
        } else {
            x340Var5.v0();
        }
        nko1.H(mbhVarA, x340Var3, y580.O0);
        nko1.H(xos0VarM, x340Var3, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
        nko1.F(x340Var3);
        nko1.H(qim0VarE, x340Var3, y580.Y);
        if (this.b) {
            nim0Var = nim0Var2;
            rdi1Var = rdi1Var2;
            function0 = function1;
            z = false;
            x340Var = x340Var5;
            x340Var.i0(1692497858);
            x340Var.r(false);
        } else {
            x340Var5.i0(1692184572);
            Uri uri = Uri.parse(rdi1Var2.c);
            qim0 qim0VarN = anm1.N("user-listening-status-image", nim0Var2);
            p3v p3vVar = new p3v(fC);
            rdi1Var = rdi1Var2;
            function0 = function1;
            nim0Var = nim0Var2;
            x340Var = x340Var5;
            eso1.e(uri, isl.a, qim0VarN, p3vVar, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var3, 48, 0, 4080);
            uwr uwrVar = cbx.a;
            z = false;
            ydh.l(nim0Var, cbx.b(x340Var3).b.a, x340Var3, x340Var, false);
        }
        rdi1 rdi1Var3 = rdi1Var;
        String str = rdi1Var3.a;
        uwr uwrVar2 = cbx.a;
        lee1 lee1Var = cbx.d(x340Var3).d;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        cvx cvxVar = cbx.b(x340Var3).b;
        x340 x340Var6 = x340Var;
        uwo1.e(str, uyn1.z(16.0f, 0.0f, 2, qim0VarF), lee1Var, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2024);
        cvx cvxVar2 = cbx.b(x340Var3).b;
        op71.g(x340Var3, u291.h(nim0Var, 12.0f));
        String str2 = rdi1Var3.b;
        lee1 lee1Var2 = cbx.d(x340Var3).g;
        long j = cbx.a(x340Var3).b.b;
        qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
        cvx cvxVar3 = cbx.b(x340Var3).b;
        nim0 nim0Var3 = nim0Var;
        uwo1.e(str2, uyn1.z(16.0f, 0.0f, 2, qim0VarF2), lee1Var2, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2016);
        if (rdi1Var3.d == 2) {
            x340Var2 = x340Var6;
            x340Var2.i0(1693203325);
            String strN = eqq.n(nim0Var3, cbx.b(x340Var3).b.b, x340Var3, 2131963212, x340Var3);
            if (ihc1.y0(strN)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return null;
            }
            foo1.c(new gbx(new y50(strN), function0), new idx(), anm1.N("find-music-button", nim0Var3), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, ppj.a, x340Var3, 0, 48, 2040);
            x340Var2.r(false);
        } else {
            x340Var2 = x340Var6;
            x340Var2.i0(1693792418);
            x340Var2.r(false);
        }
        x340Var2.r(true);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        long j;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        qim0 qim0VarV = nim0.a;
        qim0 qim0VarB = uyn1.B(qim0VarV, 0.0f, 0.0f, 16.0f, 0.0f, 11);
        gra graVar = een.h;
        zxl1 zxl1Var = (zxl1) this.c;
        b2m1 b2m1Var = (b2m1) this.d;
        gfh0 gfh0VarC = t1c.c(graVar, false);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(gfh0VarC, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        String strO0 = cwl1.o0(x340Var, 2131963905);
        lee1 lee1Var = cbx.d(x340Var).k;
        boolean z = this.b;
        if (z) {
            x340Var3.i0(1480567760);
            x340Var3.r(false);
            j = u7h.j;
        } else {
            x340Var3.i0(1480568977);
            j = cbx.a(x340Var).b.c;
            x340Var3.r(false);
        }
        if (z) {
            x340Var3.i0(-1346905681);
            x340Var3.r(false);
        } else {
            x340Var3.i0(-1346817579);
            Object objT = x340Var3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var3);
            }
            idn0 idn0Var = (idn0) objT;
            boolean zI = x340Var3.i(zxl1Var) | x340Var3.i(b2m1Var);
            Object objT2 = x340Var3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new g4k1(zxl1Var, b2m1Var, (byte) 10);
                x340Var3.s0(objT2);
            }
            qim0VarV = bin.v(qim0VarV, idn0Var, (ga80) null, false, (String) null, (pm31) null, (Function0) objT2, 28);
            x340Var3.r(false);
        }
        uwo1.e(strO0, qim0VarV, lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
        if (z) {
            x340Var3.i0(-1346459033);
            xto1.e((qim0) null, 1, 0L, 0L, x340Var, 48, 13);
            x340Var3.r(false);
        } else {
            x340Var3.i0(-1346376387);
            x340Var3.r(false);
        }
        x340Var3.r(true);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:309:0x0b95  */
    /* JADX WARN: Code duplicated, block: B:321:0x0bb1  */
    /* JADX WARN: Code duplicated, block: B:327:0x0bbb  */
    /* JADX WARN: Code duplicated, block: B:332:0x0bc4  */
    /* JADX WARN: Code duplicated, block: B:335:0x0bd7  */
    /* JADX WARN: Code duplicated, block: B:336:0x0bdb  */
    /* JADX WARN: Code duplicated, block: B:338:0x0bde  */
    /* JADX WARN: Code duplicated, block: B:339:0x0be1  */
    /* JADX WARN: Code duplicated, block: B:346:0x0bf0  */
    /* JADX WARN: Code duplicated, block: B:349:0x0bf5  */
    /* JADX WARN: Code duplicated, block: B:352:0x0bff  */
    /* JADX WARN: Code duplicated, block: B:361:0x0c96  */
    /* JADX WARN: Code duplicated, block: B:363:0x0ca4  */
    /* JADX WARN: Code duplicated, block: B:364:0x0ca8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:365:0x0caa  */
    /* JADX WARN: Code duplicated, block: B:366:0x0cae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:367:0x0cb0  */
    /* JADX WARN: Code duplicated, block: B:368:0x0cb5  */
    /* JADX WARN: Code duplicated, block: B:371:0x0cbe  */
    /* JADX WARN: Code duplicated, block: B:372:0x0cfe  */
    /* JADX WARN: Code duplicated, block: B:374:0x0d39  */
    /* JADX WARN: Code duplicated, block: B:376:0x0d66  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        Integer numValueOf;
        boolean z4;
        boolean z5;
        tuj0 tuj0Var;
        wgo0 wgo0Var;
        boolean zI0;
        boolean z6;
        ksl kslVar;
        int iIntValue;
        String strO0;
        b0k b0kVar;
        b0k b0kVar2;
        boolean z7;
        long j;
        q6w0 q6w0Var;
        b8w0 b8w0Var;
        q6w0 q6w0Var2;
        zvx zvxVar;
        zvx zvxVar2;
        int i;
        int i2;
        boolean z8;
        x340 x340Var;
        o17 o17Var;
        g07 g07VarA;
        boolean z9;
        dlv dlvVar;
        int i3;
        int i4;
        byte b;
        bby bbyVarA;
        b0k b0kVar3;
        boolean z10;
        byte b2 = this.a;
        h2c h2cVar = h2c.a;
        n4k n4kVar = hmb0.t1;
        qim0 qim0VarQ = nim0.a;
        boolean z11 = this.b;
        boolean z12 = false;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b2) {
            case 0:
                uwr uwrVar = cbx.a;
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                lhg1 lhg1Var = (lhg1) obj5;
                tuj0 tuj0Var2 = (uuj0) obj4;
                jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, b0kVar4, 0);
                x340 x340Var2 = (x340) b0kVar4;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(b0kVar4, qim0VarQ);
                hzj.A.getClass();
                x340 x340Var3 = (x340) b0kVar4;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(jw31VarA, b0kVar4, y580.O0);
                nko1.H(xos0VarM, b0kVar4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
                nko1.F(b0kVar4);
                nko1.H(qim0VarE, b0kVar4, y580.Y);
                boolean z13 = (lhg1Var == null || lhg1Var.d) ? false : true;
                if (lhg1Var != null && (q6w0Var2 = lhg1Var.a) != null) {
                    z = true;
                    z2 = ila0.u(q6w0Var2);
                    if (lhg1Var == null && lhg1Var.c == z) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (lhg1Var != null || (q6w0Var = lhg1Var.a) == null || (b8w0Var = q6w0Var.a) == null) {
                        numValueOf = null;
                    } else {
                        if (b8w0Var == b8w0.Y) {
                            b8w0Var = null;
                        }
                        if (b8w0Var != null) {
                            numValueOf = Integer.valueOf(apo.w(b8w0Var));
                        } else {
                            numValueOf = null;
                        }
                    }
                    if (!z2 || (z13 && z3)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z13 || z2 || numValueOf == null) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    List listM = p7h.M(new wgo0[]{wgo0.b, wgo0.c});
                    if (tuj0Var2 instanceof tuj0) {
                        tuj0Var = tuj0Var2;
                    } else {
                        tuj0Var = null;
                    }
                    if (tuj0Var != null) {
                        wgo0Var = tuj0Var.a;
                    } else {
                        wgo0Var = null;
                    }
                    zI0 = o7h.i0(listM, wgo0Var);
                    if (!zI0 || z4 || z5 || !z11) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    kslVar = isl.a;
                    if (zI0) {
                        kslVar = kslVar;
                        x340Var3.i0(97684678);
                        x340Var3.r(false);
                    } else {
                        x340Var3.i0(96915878);
                        if (!z5 || z4) {
                            x340Var3.i0(97008258);
                            w0h1.a(ssx.c, kslVar, anm1.N("mixing_transition_icon_true", u291.r(qim0VarQ, 16.0f)), cbx.a(b0kVar4).b.a, 0L, false, b0kVar4, ssx.d | 48, 48);
                            b0kVar4 = b0kVar4;
                            z7 = false;
                            x340Var3.r(false);
                        } else {
                            x340Var3.i0(97301518);
                            qim0 qim0VarN = anm1.N("mixing_transition_icon_false", u291.r(uyn1.x(qim0VarQ, 2.0f), 12.0f));
                            anx anxVar = anx.c;
                            if (z6) {
                                x340Var3.i0(1527168456);
                                j = cbx.a(b0kVar4).b.g;
                                z7 = false;
                                x340Var3.r(false);
                            } else {
                                z7 = false;
                                x340Var3.i0(1527170216);
                                j = cbx.a(b0kVar4).b.c;
                                x340Var3.r(false);
                            }
                            w0h1.a(anxVar, kslVar, qim0VarN, j, 0L, false, b0kVar4, anx.d | 48, 48);
                            x340Var3.r(z7);
                        }
                        x340Var3.r(z7);
                    }
                    if (zI0) {
                        iIntValue = 2131958871;
                    } else if (z4) {
                        iIntValue = 2131958856;
                    } else if (z5) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 2131958854;
                    }
                    strO0 = cwl1.o0(b0kVar4, iIntValue);
                    if (z6) {
                        x340Var3.i0(98071651);
                        b0k b0kVar5 = b0kVar4;
                        uwo1.e(strO0, (qim0) null, cbx.d(b0kVar4).j, cbx.a(b0kVar4).b.g, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar5, 0, 0, 1714);
                        b0kVar2 = b0kVar5;
                        x340Var3.r(false);
                    } else {
                        b0kVar = b0kVar4;
                        x340Var3.i0(98354650);
                        uwo1.e(strO0, (qim0) null, cbx.d(b0kVar).j, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar, 0, 0, 1722);
                        x340Var3.r(false);
                    }
                    if (zI0) {
                        b0kVar2 = b0kVar;
                        x340Var3.i0(98837382);
                        x340Var3.r(false);
                    } else {
                        b0kVar2 = b0kVar;
                        x340Var3.i0(98613159);
                        w0h1.a(plx.c, kslVar, u291.r(qim0VarQ, 8.0f), cbx.a(b0kVar2).b.a, 0L, false, b0kVar2, plx.d | 48, 48);
                        x340Var3.r(false);
                    }
                    x340Var3.r(true);
                    return rih1Var;
                }
                z = true;
                if (lhg1Var == null) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (lhg1Var != null) {
                    numValueOf = null;
                } else {
                    numValueOf = null;
                }
                if (z2) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (z13) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                List listM2 = p7h.M(new wgo0[]{wgo0.b, wgo0.c});
                if (tuj0Var2 instanceof tuj0) {
                    tuj0Var = tuj0Var2;
                } else {
                    tuj0Var = null;
                }
                if (tuj0Var != null) {
                    wgo0Var = tuj0Var.a;
                } else {
                    wgo0Var = null;
                }
                zI0 = o7h.i0(listM2, wgo0Var);
                if (zI0) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                kslVar = isl.a;
                if (zI0) {
                    x340Var3.i0(96915878);
                    if (z5) {
                        x340Var3.i0(97008258);
                        w0h1.a(ssx.c, kslVar, anm1.N("mixing_transition_icon_true", u291.r(qim0VarQ, 16.0f)), cbx.a(b0kVar4).b.a, 0L, false, b0kVar4, ssx.d | 48, 48);
                        b0kVar4 = b0kVar4;
                        z7 = false;
                        x340Var3.r(false);
                    } else {
                        x340Var3.i0(97008258);
                        w0h1.a(ssx.c, kslVar, anm1.N("mixing_transition_icon_true", u291.r(qim0VarQ, 16.0f)), cbx.a(b0kVar4).b.a, 0L, false, b0kVar4, ssx.d | 48, 48);
                        b0kVar4 = b0kVar4;
                        z7 = false;
                        x340Var3.r(false);
                    }
                    x340Var3.r(z7);
                } else {
                    kslVar = kslVar;
                    x340Var3.i0(97684678);
                    x340Var3.r(false);
                }
                if (zI0) {
                    iIntValue = 2131958871;
                } else if (z4) {
                    iIntValue = 2131958856;
                } else if (z5) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 2131958854;
                }
                strO0 = cwl1.o0(b0kVar4, iIntValue);
                if (z6) {
                    x340Var3.i0(98071651);
                    b0k b0kVar6 = b0kVar4;
                    uwo1.e(strO0, (qim0) null, cbx.d(b0kVar4).j, cbx.a(b0kVar4).b.g, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar6, 0, 0, 1714);
                    b0kVar2 = b0kVar6;
                    x340Var3.r(false);
                } else {
                    b0kVar = b0kVar4;
                    x340Var3.i0(98354650);
                    uwo1.e(strO0, (qim0) null, cbx.d(b0kVar).j, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar, 0, 0, 1722);
                    x340Var3.r(false);
                }
                if (zI0) {
                    b0kVar2 = b0kVar;
                    x340Var3.i0(98613159);
                    w0h1.a(plx.c, kslVar, u291.r(qim0VarQ, 8.0f), cbx.a(b0kVar2).b.a, 0L, false, b0kVar2, plx.d | 48, 48);
                    x340Var3.r(false);
                } else {
                    b0kVar2 = b0kVar;
                    x340Var3.i0(98837382);
                    x340Var3.r(false);
                }
                x340Var3.r(true);
                return rih1Var;
            case 1:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarV = u291.v(qim0VarQ, 88.0f);
                uwr uwrVar2 = cbx.a;
                qim0 qim0VarF = dug.f(qim0VarV, cbx.a(x340Var4).a.a.a(), d4o1.a);
                cua cuaVar = cbx.b(x340Var4).f;
                qim0 qim0VarQ2 = i1p1.q(qim0VarF, er31.b(4.0f));
                b9n0 b9n0Var = (b9n0) obj5;
                y8n0 y8n0Var = (z8n0) obj4;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var5 = x340Var4;
                int iHashCode2 = Long.hashCode(x340Var5.T);
                xos0 xos0VarM2 = x340Var5.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarQ2);
                hzj.A.getClass();
                x340 x340Var6 = x340Var4;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(gfh0VarC, x340Var4, y580.O0);
                nko1.H(xos0VarM2, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE2, x340Var4, y580.Y);
                if (z11) {
                    x340Var6.i0(1506740790);
                    ha71.g(b9n0Var.b.c, x340Var4, 0);
                    x340Var6.r(false);
                } else {
                    x340Var6.i0(1506850592);
                    ha71.i(y8n0Var.c.a, x340Var4, 6);
                    x340Var6.r(false);
                }
                x340Var6.r(true);
                return rih1Var;
            case 2:
                ((Number) obj3).intValue();
                ((leq0) obj5).e(z11, (iu30) obj4, (b0k) obj2, 0);
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj2;
                ((Number) obj3).intValue();
                float fD = ((i2c) obj).d();
                float f = 0.55f * fD;
                float f2 = 0.73333335f * fD;
                qim0 qim0VarH = u291.h(u291.f(qim0VarQ, 1.0f), f2);
                n960 n960Var = (n960) obj5;
                n960 n960Var2 = (n960) obj4;
                gra graVar = een.d;
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                x340 x340Var8 = x340Var7;
                int iHashCode3 = Long.hashCode(x340Var8.T);
                xos0 xos0VarM3 = x340Var8.m();
                qim0 qim0VarE3 = zr7.E(x340Var7, qim0VarH);
                hzj.A.getClass();
                x340 x340Var9 = x340Var7;
                if (x340Var9.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var9.m0();
                if (x340Var9.S) {
                    x340Var9.l(n4kVar);
                } else {
                    x340Var9.v0();
                }
                nko1.H(gfh0VarC2, x340Var7, y580.O0);
                nko1.H(xos0VarM3, x340Var7, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var7, y580.R0);
                nko1.F(x340Var7);
                nko1.H(qim0VarE3, x340Var7, y580.Y);
                Uri uri = Uri.parse(n960Var.a);
                if (z11) {
                    x340Var9.i0(622479282);
                    x340Var9.r(false);
                    zvxVar = null;
                } else {
                    x340Var9.i0(-1919581806);
                    uwr uwrVar3 = cbx.a;
                    cua cuaVar2 = cbx.b(x340Var7).f;
                    cua cuaVar3 = cbx.b(x340Var7).f;
                    zvx zvxVar3 = new zvx();
                    x340Var9.r(false);
                    zvxVar = zvxVar3;
                }
                cbx.a.getClass();
                ecx ecxVarA = uwr.a();
                pux puxVarU = flo1.u(x340Var7, n960Var.b);
                float f3 = fD * 0.1f;
                qim0 qim0VarThen = eqr0.C(h2cVar.a(u291.r(qim0VarQ, f), een.f), -f3, f2 * 0.25f).then(z11 ? i1p1.q(qim0VarQ, er31.a) : qim0VarQ);
                isl islVar = isl.a;
                eso1.e(uri, islVar, qim0VarThen, (p3v) null, zvxVar, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, puxVarU, false, false, x340Var7, 1073744944, 0, 3520);
                Uri uri2 = Uri.parse(n960Var2.a);
                if (z11) {
                    x340Var9.i0(623132018);
                    x340Var9.r(false);
                    zvxVar2 = null;
                } else {
                    x340Var9.i0(-1919560750);
                    uwr uwrVar4 = cbx.a;
                    cua cuaVar4 = cbx.b(x340Var7).f;
                    cua cuaVar5 = cbx.b(x340Var7).f;
                    zvx zvxVar4 = new zvx();
                    x340Var9.r(false);
                    zvxVar2 = zvxVar4;
                }
                ecx ecxVarA2 = uwr.a();
                pux puxVarU2 = flo1.u(x340Var7, n960Var2.b);
                qim0 qim0VarC = eqr0.C(h2cVar.a(u291.r(qim0VarQ, f), graVar), f3, 0.0f);
                if (z11) {
                    qim0VarQ = i1p1.q(qim0VarQ, er31.a);
                }
                eso1.e(uri2, islVar, qim0VarC.then(qim0VarQ), (p3v) null, zvxVar2, ecxVarA2, (j6m) null, (tl3) null, (ColorFilter) null, puxVarU2, false, false, x340Var7, 1073744944, 0, 3520);
                x340Var9.r(true);
                return rih1Var;
            case 4:
                x340 x340Var10 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF2 = u291.f(qim0VarQ, 1.0f);
                uwr uwrVar5 = cbx.a;
                cvx cvxVar = cbx.b(x340Var10).b;
                qim0 qim0VarN2 = anm1.N("pins_layout_picker", nho1.F(uyn1.z(0.0f, 16.0f, 1, qim0VarF2)));
                a3t0 a3t0Var = (a3t0) obj5;
                iu30 iu30Var = (iu30) obj4;
                jw31 jw31VarA2 = ew31.a(h36.f, een.Z, x340Var10, 0);
                x340 x340Var11 = x340Var10;
                int iHashCode4 = Long.hashCode(x340Var11.T);
                xos0 xos0VarM4 = x340Var11.m();
                qim0 qim0VarE4 = zr7.E(x340Var10, qim0VarN2);
                hzj.A.getClass();
                x340 x340Var12 = x340Var10;
                if (x340Var12.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var12.m0();
                if (x340Var12.S) {
                    x340Var12.l(n4kVar);
                } else {
                    x340Var12.v0();
                }
                nko1.H(jw31VarA2, x340Var10, y580.O0);
                nko1.H(xos0VarM4, x340Var10, y580.N0);
                nko1.H(Integer.valueOf(iHashCode4), x340Var10, y580.R0);
                nko1.F(x340Var10);
                nko1.H(qim0VarE4, x340Var10, y580.Y);
                x340Var12.i0(-1552987289);
                for (a3t0 a3t0Var2 : a3t0.d) {
                    int iOrdinal = a3t0Var2.ordinal();
                    if (iOrdinal == 0) {
                        i = 2131233462;
                    } else {
                        if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                i = 2131233460;
                            } else {
                                eg.o();
                            }
                            return null;
                        }
                        i = 2131233461;
                    }
                    int i5 = i;
                    int iOrdinal2 = a3t0Var2.ordinal();
                    if (iOrdinal2 == 0) {
                        i2 = 2131962120;
                    } else if (iOrdinal2 == 1) {
                        i2 = 2131962119;
                    } else {
                        if (iOrdinal2 != 2) {
                            eg.o();
                            return null;
                        }
                        i2 = 2131962117;
                    }
                    String strO1 = cwl1.o0(x340Var10, i2);
                    boolean z14 = a3t0Var == a3t0Var2;
                    boolean zG = x340Var12.g(iu30Var) | x340Var12.e(a3t0Var2.ordinal());
                    Object objT = x340Var12.T();
                    if (zG || objT == fkj0.X) {
                        objT = new shq0((byte) 24, a3t0Var2, iu30Var);
                        x340Var12.s0(objT);
                    }
                    rwo1.e(i5, strO1, z14, this.b, (Function0) objT, (qim0) null, x340Var10, 0);
                }
                x340Var12.r(false);
                x340Var12.r(true);
                return rih1Var;
            case 5:
                String str = (String) obj4;
                hou0 hou0Var = (hou0) obj5;
                x340 x340Var13 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (z11) {
                    x340Var = x340Var13;
                    x340Var.i0(1321551971);
                    z8 = false;
                    hou0Var.f(0, str, x340Var, (qim0) null);
                } else {
                    z8 = false;
                    x340Var = x340Var13;
                    x340Var.i0(1321552926);
                    hou0Var.i(0, str, x340Var, (qim0) null);
                }
                x340Var.r(z8);
                return rih1Var;
            case 6:
                x340 x340Var14 = (b0k) obj2;
                ((Number) obj3).intValue();
                iu30 iu30Var2 = (iu30) obj4;
                gdx gdxVarS = yla.s(x340Var14);
                v2v0 v2v0Var = (v2v0) obj5;
                pk1 pk1Var = new pk1(v2v0Var.l ? qk1.b : qk1.a, false, v2v0Var.b, cwl1.o0(x340Var14, 2131951772), null, 18);
                jax haxVar = !z11 ? jax.a : new hax("Content restricted");
                x340 x340Var15 = x340Var14;
                boolean zG2 = x340Var15.g(iu30Var2);
                Object objT2 = x340Var15.T();
                if (zG2 || objT2 == fkj0.X) {
                    objT2 = new smt0(iu30Var2, (byte) 13);
                    x340Var15.s0(objT2);
                }
                h7p1.a(pk1Var, new gbx(z50.c, (Function0) objT2), (qim0) null, haxVar, gdxVarS, x340Var15, 0, 4);
                return rih1Var;
            case 7:
                aw70 aw70Var = (aw70) obj;
                qt01 qt01Var = (qt01) obj2;
                tqw tqwVar = (tqw) obj3;
                String str2 = aw70Var.i;
                String str3 = aw70Var.h;
                if (qt01Var instanceof ot01) {
                    tqwVar.getClass();
                    ((lo60) obj5).a(str3, n3o1.y(tqwVar), (Bundle) null);
                } else {
                    if (!(qt01Var instanceof pt01)) {
                        eg.o();
                        return null;
                    }
                    vgm vgmVar = (vgm) obj4;
                    String str4 = nik1.z0.a;
                    tqwVar.getClass();
                    tv80 tv80VarY = n3o1.y(tqwVar);
                    String str5 = aw70Var.c;
                    j47 j47Var = (j47) o7h.s0(aw70Var.f.a);
                    vgmVar.d(str3, str4, tv80VarY, new tgm((String) null, false, true, false, false, false, false, new yh10(str5, (j47Var == null || (o17Var = j47Var.a) == null || (g07VarA = o17Var.a()) == null) ? null : g07VarA.a, (String) null, (ugo0) null, 12), false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (!z11 || str2.length() <= 0) ? null : new p860(str2, 1), (mgo0) null, false, false, -268435719, 1));
                }
                return rih1Var;
            case 8:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x340 x340Var16 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var16.h(zBooleanValue) ? 4 : 2;
                }
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    if (z11) {
                        x340Var17.i0(1291838281);
                        ((ys11) obj5).g(((jmb1) obj4).e, zBooleanValue, x340Var17, (iIntValue2 << 3) & 112);
                        z9 = false;
                    } else {
                        z9 = false;
                        x340Var17.i0(1392332943);
                    }
                    x340Var17.r(z9);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 9:
                b0k b0kVar7 = (b0k) obj2;
                ((Number) obj3).intValue();
                u4p1.q(z11, apo.r(1671750729, new tc11((jmb1) obj5, (vu30) obj4, (byte) 11), b0kVar7), b0kVar7, 48);
                return rih1Var;
            case 10:
                b0k b0kVar8 = (b0k) obj2;
                ((Number) obj3).intValue();
                u4p1.q(z11, apo.r(1656913303, new tc11((jmb1) obj5, (uu11) obj4, (byte) 12), b0kVar8), b0kVar8, 48);
                return rih1Var;
            case 11:
                g2c g2cVar = (g2c) obj;
                x340 x340Var18 = (b0k) obj2;
                ((Number) obj3).intValue();
                u37 u37Var = (u37) obj5;
                eso1.h(hso1.G(znx.c, 0L, 0L, x340Var18, znx.d, 30), isl.a, (qim0) null, u4p1.W(((o27) obj4).a, u37Var, x340Var18), (zvx) null, u4p1.P(0, u37Var, x340Var18), (j6m) null, (tl3) null, (ColorFilter) null, x340Var18, 56, 468);
                if (z11) {
                    x340 x340Var19 = x340Var18;
                    x340Var19.i0(1876540667);
                    u4p1.t(g2cVar.b(qim0VarQ), x340Var19, 0);
                    x340Var19.r(false);
                } else {
                    x340 x340Var20 = x340Var18;
                    x340Var20.i0(1876631962);
                    x340Var20.r(false);
                }
                return rih1Var;
            case 12:
                b0k b0kVar9 = (b0k) obj2;
                ((Number) obj3).intValue();
                u4p1.q(z11, apo.r(1203645093, new wwx((vu30) obj5, (vu30) obj4, (byte) 2), b0kVar9), b0kVar9, 48);
                return rih1Var;
            case 13:
                x340 x340Var21 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ft51.g((fb91) obj5, z11, (idn0) obj4, x340Var22, 0);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 14:
                b0k b0kVar10 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar6 = cbx.a;
                cvx cvxVar2 = cbx.b(b0kVar10).b;
                Integer num = (Integer) obj5;
                atb1 atb1Var = (atb1) obj4;
                mbh mbhVarA = jbh.a(new d36(6.0f, true, new um5(false)), een.P0, b0kVar10, 0);
                x340 x340Var23 = (x340) b0kVar10;
                int iHashCode5 = Long.hashCode(x340Var23.T);
                xos0 xos0VarM5 = x340Var23.m();
                qim0 qim0VarE5 = zr7.E(b0kVar10, qim0VarQ);
                hzj.A.getClass();
                x340 x340Var24 = (x340) b0kVar10;
                if (x340Var24.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var24.m0();
                if (x340Var24.S) {
                    x340Var24.l(n4kVar);
                } else {
                    x340Var24.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, b0kVar10, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM5, b0kVar10, lljVar2);
                Integer numValueOf2 = Integer.valueOf(iHashCode5);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf2, b0kVar10, lljVar3);
                nko1.F(b0kVar10);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE5, b0kVar10, lljVar4);
                qim0 qim0VarF3 = u291.f(qim0VarQ, 1.0f);
                cvx cvxVar3 = cbx.b(b0kVar10).b;
                jw31 jw31VarA3 = ew31.a(new d36(4.0f, true, new um5(false)), een.N0, b0kVar10, 0);
                int iHashCode6 = Long.hashCode(x340Var24.T);
                xos0 xos0VarM6 = x340Var24.m();
                qim0 qim0VarE6 = zr7.E(b0kVar10, qim0VarF3);
                x340Var24.m0();
                if (x340Var24.S) {
                    x340Var24.l(n4kVar);
                } else {
                    x340Var24.v0();
                }
                nko1.H(jw31VarA3, b0kVar10, lljVar);
                nko1.H(xos0VarM6, b0kVar10, lljVar2);
                i3a.l(iHashCode6, b0kVar10, lljVar3, b0kVar10);
                nko1.H(qim0VarE6, b0kVar10, lljVar4);
                String str6 = atb1Var.b;
                List list = atb1Var.i;
                d761 d761Var = atb1Var.c;
                uwo1.e(str6, new wnb0(1.0f, true), cbx.d(b0kVar10).m, cbx.a(b0kVar10).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, b0kVar10, 0, 0, 1712);
                plx plxVar = plx.c;
                zov0 zov0Var = cbx.b(b0kVar10).g;
                w0h1.a(plxVar, isl.a, u291.m(qim0VarQ, 12.0f), cbx.a(b0kVar10).b.b, 0L, false, b0kVar10, plx.d | 48, 48);
                x340Var24.r(true);
                Object objT3 = x340Var24.T();
                if (objT3 == fkj0.X) {
                    objT3 = Boolean.valueOf(num != null);
                    x340Var24.s0(objT3);
                }
                boolean zBooleanValue2 = ((Boolean) objT3).booleanValue();
                boolean z15 = num != null;
                if (zBooleanValue2) {
                    bbyVarA = bby.b;
                    dlvVar = null;
                    i3 = 6;
                    i4 = 0;
                    b = 2;
                } else {
                    dlvVar = null;
                    i3 = 6;
                    i4 = 0;
                    b = 2;
                    bbyVarA = xay.e(2, irn1.o0(150, 0, (dlv) null, 6)).a(xay.d(irn1.o0(150, 0, (dlv) null, 6), (fra) null, 14));
                }
                ln00 ln00VarA = xay.f(b, irn1.o0(150, i4, dlvVar, i3)).a(xay.l(14, irn1.o0(150, i4, dlvVar, i3)));
                j2i j2iVarR = apo.r(1479185426, new hbt0(num, b), b0kVar10);
                pbh pbhVar = pbh.a;
                fq7.b(pbhVar, z15, (qim0) null, bbyVarA, ln00VarA, (String) null, j2iVarR, b0kVar10, 1572870, 18);
                cvx cvxVar4 = cbx.b(b0kVar10).b;
                op71.g(b0kVar10, pbhVar.a(1.0f, u291.h(qim0VarQ, 4.0f), true));
                if (!z11) {
                    qim0VarQ = u291.f(qim0VarQ, 1.0f);
                }
                up30.b(atb1Var, qim0VarQ, z11, b0kVar10, 8);
                oap1.b(atb1Var.e, (qim0) null, b0kVar10, 0, 2);
                if (d761Var != null) {
                    x340Var24.i0(-823505388);
                    b0kVar3 = b0kVar10;
                    qgo1.f(d761Var.g(new cjc0(2), b0kVar10, 0), (qim0) null, (a0e1) null, 2, false, (iu30) null, b0kVar3, 8, 54);
                    x340Var24.r(false);
                } else {
                    b0kVar3 = b0kVar10;
                    x340Var24.i0(-823347784);
                    x340Var24.r(false);
                }
                if (list.isEmpty()) {
                    x340Var24.i0(-823053160);
                    x340Var24.r(false);
                } else {
                    x340Var24.i0(-823301098);
                    List<ctb1> list2 = list;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    for (ctb1 ctb1Var : list2) {
                        arrayList.add(new phx(10, 0L, ctb1Var.a, (String) null, ctb1Var.b));
                    }
                    fc11.a(mqo1.A(arrayList), (qim0) null, hcx.c, (hux) null, false, 0, (gbx) null, (String) null, (idn0) null, b0kVar3, 392, 506);
                    x340Var24.r(false);
                }
                x340Var24.r(true);
                return rih1Var;
            case 15:
                x340 x340Var25 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                gra graVar2 = een.d;
                x340 x340Var26 = x340Var25;
                boolean zY = x340Var26.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16);
                j06 j06Var = x340Var26.a;
                if (zY) {
                    fra fraVar = een.N0;
                    qim0 qim0VarH2 = pqo.h(qim0VarQ, z11);
                    xu30 xu30Var = (xu30) obj5;
                    xu30 xu30Var2 = (xu30) obj4;
                    jw31 jw31VarA4 = ew31.a(h36.a, fraVar, x340Var26, 48);
                    int iHashCode7 = Long.hashCode(x340Var26.T);
                    xos0 xos0VarM7 = x340Var26.m();
                    qim0 qim0VarE7 = zr7.E(x340Var26, qim0VarH2);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var26.m0();
                    if (x340Var26.S) {
                        x340Var26.l(n4kVar);
                    } else {
                        x340Var26.v0();
                    }
                    llj lljVar5 = y580.O0;
                    nko1.H(jw31VarA4, x340Var26, lljVar5);
                    llj lljVar6 = y580.N0;
                    nko1.H(xos0VarM7, x340Var26, lljVar6);
                    Integer numValueOf3 = Integer.valueOf(iHashCode7);
                    llj lljVar7 = y580.R0;
                    nko1.H(numValueOf3, x340Var26, lljVar7);
                    nko1.F(x340Var26);
                    llj lljVar8 = y580.Y;
                    nko1.H(qim0VarE7, x340Var26, lljVar8);
                    if (xu30Var == null) {
                        x340Var26.i0(1115749747);
                    } else {
                        x340Var26.i0(1115749748);
                        gfh0 gfh0VarC3 = t1c.c(graVar2, false);
                        int iHashCode8 = Long.hashCode(x340Var26.T);
                        xos0 xos0VarM8 = x340Var26.m();
                        qim0 qim0VarE8 = zr7.E(x340Var26, qim0VarQ);
                        x340Var26.m0();
                        if (x340Var26.S) {
                            x340Var26.l(n4kVar);
                        } else {
                            x340Var26.v0();
                        }
                        nko1.H(gfh0VarC3, x340Var26, lljVar5);
                        nko1.H(xos0VarM8, x340Var26, lljVar6);
                        x0d.q(iHashCode8, x340Var26, lljVar7, x340Var26);
                        nko1.H(qim0VarE8, x340Var26, lljVar8);
                        xu30Var.invoke(h2cVar, x340Var26, 6);
                        x340Var26.r(true);
                        z12 = false;
                    }
                    x340Var26.r(z12);
                    if (xu30Var2 == null) {
                        x340Var26.i0(1115796371);
                        x340Var26.r(z12);
                        z10 = true;
                    } else {
                        x340Var26.i0(1115796372);
                        gfh0 gfh0VarC4 = t1c.c(graVar2, z12);
                        int iHashCode9 = Long.hashCode(x340Var26.T);
                        xos0 xos0VarM9 = x340Var26.m();
                        qim0 qim0VarE9 = zr7.E(x340Var26, qim0VarQ);
                        x340Var26.m0();
                        if (x340Var26.S) {
                            x340Var26.l(n4kVar);
                        } else {
                            x340Var26.v0();
                        }
                        nko1.H(gfh0VarC4, x340Var26, lljVar5);
                        nko1.H(xos0VarM9, x340Var26, lljVar6);
                        x0d.q(iHashCode9, x340Var26, lljVar7, x340Var26);
                        nko1.H(qim0VarE9, x340Var26, lljVar8);
                        xu30Var2.invoke(h2cVar, x340Var26, 6);
                        z10 = true;
                        x340Var26.r(true);
                        x340Var26.r(false);
                    }
                    x340Var26.r(z10);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 16:
                b0k b0kVar11 = (b0k) obj2;
                ((Number) obj3).intValue();
                int iU = jch0.U(((Float) obj5).floatValue());
                yxo1.j(0, cwl1.U(2131820931, iU, new Object[]{Integer.valueOf(iU)}, b0kVar11), (Function0) obj4, b0kVar11, (qim0) null, this.b);
                return rih1Var;
            case 17:
                ((Number) obj3).intValue();
                x760.o((zff1) obj5, (srt0) obj4, (qim0) null, this.b, (b0k) obj2, 8);
                return rih1Var;
            case 18:
                return a(obj, obj2, obj3);
            case 19:
                return d(obj, obj2, obj3);
            case 20:
                ((Number) obj3).intValue();
                Function0 function0 = (Function0) obj5;
                x340 x340Var27 = (b0k) obj2;
                boolean zG3 = x340Var27.g(function0);
                Object objT4 = x340Var27.T();
                if (zG3 || objT4 == fkj0.X) {
                    objT4 = new izg1(function0, (byte) 8);
                    x340Var27.s0(objT4);
                }
                aex.b(this.b, (iu30) objT4, (qim0) null, (String) null, 0, (idn0) obj4, (ga80) null, x340Var27, 0, 92);
                return rih1Var;
            case 21:
                return e(obj, obj2, obj3);
            default:
                x340 x340Var28 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var29 = x340Var28;
                if (x340Var29.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    ixm1.b(384, (Function0) obj4, x340Var29, u291.f(qim0VarQ, 1.0f), this.b, ((azr) obj5) != null);
                } else {
                    x340Var29.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n8k0(Object obj, boolean z, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n8k0(boolean z, Object obj, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
