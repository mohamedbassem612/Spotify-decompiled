package p;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class a4p1 {
    public static b180 a;
    public static b180 b;

    /* JADX WARN: Code duplicated, block: B:100:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:103:0x0273  */
    /* JADX WARN: Code duplicated, block: B:104:0x0277  */
    /* JADX WARN: Code duplicated, block: B:107:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:111:0x02cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:71:0x0104  */
    /* JADX WARN: Code duplicated, block: B:73:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x010e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0111 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x0115  */
    /* JADX WARN: Code duplicated, block: B:82:0x0118  */
    /* JADX WARN: Code duplicated, block: B:83:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0120  */
    /* JADX WARN: Code duplicated, block: B:86:0x0125  */
    /* JADX WARN: Code duplicated, block: B:88:0x012b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0150  */
    /* JADX WARN: Code duplicated, block: B:92:0x016f  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d6  */
    public static final void a(lhg1 lhg1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        float f;
        boolean z;
        Integer numValueOf;
        boolean z2;
        boolean z3;
        int iIntValue;
        boolean z4;
        long j;
        int i3;
        int i4;
        zzq0 zzq0Var;
        boolean z5;
        zzq0 zzq0VarP;
        p3v p3vVar;
        float fX;
        anx anxVar;
        boolean z6;
        q6w0 q6w0Var;
        b8w0 b8w0Var;
        q6w0 q6w0Var2;
        q6w0 q6w0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1803708696);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(lhg1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarB = u291.b(0.0f, 16.0f, 1, u291.f(qim0Var, 1.0f));
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z7 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z7) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf2, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            x340Var.i0(1708255838);
            if (((lhg1Var == null || (q6w0Var3 = lhg1Var.a) == null) ? null : q6w0Var3.a) == b8w0.b) {
                x340Var.r(false);
                z6 = true;
            } else {
                boolean z8 = lhg1Var != null && lhg1Var.d;
                boolean z9 = (lhg1Var == null || (q6w0Var2 = lhg1Var.a) == null || !ila0.u(q6w0Var2)) ? false : true;
                if (z9) {
                    f = 1.0f;
                } else {
                    if (z8 || lhg1Var == null) {
                        f = 1.0f;
                    } else {
                        f = 1.0f;
                        if (lhg1Var.c) {
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
                        if (z8 || z9 || numValueOf == null) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (!z || z2) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z) {
                            iIntValue = 2131958856;
                        } else if (!z2) {
                            iIntValue = 2131958854;
                        } else {
                            if (numValueOf == null) {
                                hhg1.n("Required value was null.");
                                return;
                            }
                            iIntValue = numValueOf.intValue();
                        }
                        String strO0 = cwl1.o0(x340Var, iIntValue);
                        avw0 avw0Var = cbx.b(x340Var).c;
                        cvx cvxVar = cbx.b(x340Var).b;
                        zov0 zov0Var2 = cbx.b(x340Var).g;
                        z4 = z3;
                        long j2 = cbx.a(x340Var).b.b;
                        if (z4) {
                            x340Var.i0(-2023073626);
                            long jA = cbx.a(x340Var).a.b.a();
                            x340Var.r(false);
                            j = jA;
                        } else {
                            x340Var.i0(-2023073107);
                            x340Var.r(false);
                            j = u7h.j;
                        }
                        uvx uvxVar = (uvx) x340Var.k(vvx.a);
                        vzq0 vzq0Var = uvxVar.e;
                        i3 = uvxVar.c;
                        i4 = uvxVar.a;
                        kiv kivVar = t4k.n;
                        float fN = uyn1.n(vzq0Var, (flb0) x340Var.k(kivVar));
                        zzq0Var = uvxVar.d;
                        if (zzq0Var == null) {
                            x340Var.i0(-2023064808);
                            zzq0VarP = gto1.p(i4, x340Var, i3);
                            z5 = false;
                            x340Var.r(false);
                        } else {
                            z5 = false;
                            x340Var.i0(-2023067071);
                            x340Var.r(false);
                            zzq0VarP = zzq0Var;
                        }
                        float fN2 = uyn1.n(zzq0VarP, (flb0) x340Var.k(kivVar)) + fN;
                        p3vVar = uvxVar.i;
                        if (p3vVar == null) {
                            x340Var.i0(-2023058605);
                            fX = gto1.x(i4, x340Var, i3);
                            x340Var.r(z5);
                        } else {
                            x340Var.i0(-2023060589);
                            x340Var.r(z5);
                            fX = p3vVar.a;
                        }
                        float f2 = (fX / 2.0f) + fN2;
                        h2c h2cVar = h2c.a;
                        nim0 nim0Var = nim0.a;
                        float f3 = f2 - f;
                        qim0 qim0VarH = u291.h(u291.v(eqr0.D(0.0f, -6.0f, 1, uyn1.B(h2cVar.a(nim0Var, graVar), f3, 0.0f, 0.0f, 0.0f, 14)), 2.0f), 6.0f);
                        long jA2 = cbx.a(x340Var).a.b.a();
                        u5j1 u5j1Var = d4o1.a;
                        t1c.a(dug.f(qim0VarH, jA2, u5j1Var), x340Var, 0);
                        qim0 qim0VarB2 = uyn1.B(u291.b(0.0f, 16.0f, 1, u291.f(nim0Var, f)), f2 - 6.0f, 0.0f, 0.0f, 0.0f, 14);
                        jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                        int iHashCode2 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM2 = x340Var.m();
                        qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB2);
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(n4kVar);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(jw31VarA, x340Var, lljVar);
                        nko1.H(xos0VarM2, x340Var, lljVar2);
                        x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                        nko1.H(qim0VarE2, x340Var, lljVar4);
                        qim0 qim0VarR = u291.r(nim0Var, 12.0f);
                        cua cuaVar = cbx.b(x340Var).f;
                        qim0 qim0VarF = dug.f(qim0VarR, j, er31.b(2.0f));
                        gfh0 gfh0VarC2 = t1c.c(een.h, false);
                        int iHashCode3 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM3 = x340Var.m();
                        qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF);
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(n4kVar);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(gfh0VarC2, x340Var, lljVar);
                        nko1.H(xos0VarM3, x340Var, lljVar2);
                        x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                        nko1.H(qim0VarE3, x340Var, lljVar4);
                        qim0 qim0VarR2 = u291.r(nim0Var, 12.0f);
                        if (!z || z2) {
                            anxVar = ssx.c;
                        } else {
                            anxVar = anx.c;
                        }
                        w0h1.a(anxVar, isl.a, qim0VarR2, j2, 0L, false, x340Var, 56, 48);
                        x340Var.r(true);
                        lee1 lee1Var = cbx.d(x340Var).j;
                        long j3 = cbx.a(x340Var).b.b;
                        cjc0 cjc0Var = new cjc0(1);
                        cvx cvxVar2 = cbx.b(x340Var).b;
                        z6 = true;
                        uwo1.e(strO0, uyn1.B(nim0Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), lee1Var, j3, null, null, 2, false, cjc0Var, 0, null, x340Var, 0, 0, 1712);
                        x340Var.r(true);
                        t1c.a(dug.f(u291.h(u291.v(eqr0.D(0.0f, 6.0f, 1, uyn1.B(h2cVar.a(nim0Var, een.t), f3, 0.0f, 0.0f, 0.0f, 14)), 2.0f), 6.0f), cbx.a(x340Var).a.b.a(), u5j1Var), x340Var, 0);
                        x340Var.r(false);
                    }
                    z = false;
                    if (lhg1Var != null) {
                        numValueOf = null;
                    } else {
                        numValueOf = null;
                    }
                    if (z8) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (z) {
                        iIntValue = 2131958856;
                    } else if (!z2) {
                        iIntValue = 2131958854;
                    } else {
                        if (numValueOf == null) {
                            hhg1.n("Required value was null.");
                            return;
                        }
                        iIntValue = numValueOf.intValue();
                    }
                    String strO1 = cwl1.o0(x340Var, iIntValue);
                    avw0 avw0Var2 = cbx.b(x340Var).c;
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    zov0 zov0Var3 = cbx.b(x340Var).g;
                    z4 = z3;
                    long j4 = cbx.a(x340Var).b.b;
                    if (z4) {
                        x340Var.i0(-2023073626);
                        long jA3 = cbx.a(x340Var).a.b.a();
                        x340Var.r(false);
                        j = jA3;
                    } else {
                        x340Var.i0(-2023073107);
                        x340Var.r(false);
                        j = u7h.j;
                    }
                    uvx uvxVar2 = (uvx) x340Var.k(vvx.a);
                    vzq0 vzq0Var2 = uvxVar2.e;
                    i3 = uvxVar2.c;
                    i4 = uvxVar2.a;
                    kiv kivVar2 = t4k.n;
                    float fN3 = uyn1.n(vzq0Var2, (flb0) x340Var.k(kivVar2));
                    zzq0Var = uvxVar2.d;
                    if (zzq0Var == null) {
                        x340Var.i0(-2023064808);
                        zzq0VarP = gto1.p(i4, x340Var, i3);
                        z5 = false;
                        x340Var.r(false);
                    } else {
                        z5 = false;
                        x340Var.i0(-2023067071);
                        x340Var.r(false);
                        zzq0VarP = zzq0Var;
                    }
                    float fN4 = uyn1.n(zzq0VarP, (flb0) x340Var.k(kivVar2)) + fN3;
                    p3vVar = uvxVar2.i;
                    if (p3vVar == null) {
                        x340Var.i0(-2023058605);
                        fX = gto1.x(i4, x340Var, i3);
                        x340Var.r(z5);
                    } else {
                        x340Var.i0(-2023060589);
                        x340Var.r(z5);
                        fX = p3vVar.a;
                    }
                    float f4 = (fX / 2.0f) + fN4;
                    h2c h2cVar2 = h2c.a;
                    nim0 nim0Var2 = nim0.a;
                    float f5 = f4 - f;
                    qim0 qim0VarH2 = u291.h(u291.v(eqr0.D(0.0f, -6.0f, 1, uyn1.B(h2cVar2.a(nim0Var2, graVar), f5, 0.0f, 0.0f, 0.0f, 14)), 2.0f), 6.0f);
                    long jA4 = cbx.a(x340Var).a.b.a();
                    u5j1 u5j1Var2 = d4o1.a;
                    t1c.a(dug.f(qim0VarH2, jA4, u5j1Var2), x340Var, 0);
                    qim0 qim0VarB3 = uyn1.B(u291.b(0.0f, 16.0f, 1, u291.f(nim0Var2, f)), f4 - 6.0f, 0.0f, 0.0f, 0.0f, 14);
                    jw31 jw31VarA2 = ew31.a(h36.a, een.N0, x340Var, 0);
                    int iHashCode4 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM4 = x340Var.m();
                    qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB3);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(jw31VarA2, x340Var, lljVar);
                    nko1.H(xos0VarM4, x340Var, lljVar2);
                    x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE4, x340Var, lljVar4);
                    qim0 qim0VarR3 = u291.r(nim0Var2, 12.0f);
                    cua cuaVar2 = cbx.b(x340Var).f;
                    qim0 qim0VarF2 = dug.f(qim0VarR3, j, er31.b(2.0f));
                    gfh0 gfh0VarC3 = t1c.c(een.h, false);
                    int iHashCode5 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM5 = x340Var.m();
                    qim0 qim0VarE5 = zr7.E(x340Var, qim0VarF2);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var, lljVar);
                    nko1.H(xos0VarM5, x340Var, lljVar2);
                    x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE5, x340Var, lljVar4);
                    qim0 qim0VarR4 = u291.r(nim0Var2, 12.0f);
                    if (z) {
                        anxVar = ssx.c;
                    } else {
                        anxVar = ssx.c;
                    }
                    w0h1.a(anxVar, isl.a, qim0VarR4, j4, 0L, false, x340Var, 56, 48);
                    x340Var.r(true);
                    lee1 lee1Var2 = cbx.d(x340Var).j;
                    long j5 = cbx.a(x340Var).b.b;
                    cjc0 cjc0Var2 = new cjc0(1);
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    z6 = true;
                    uwo1.e(strO1, uyn1.B(nim0Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14), lee1Var2, j5, null, null, 2, false, cjc0Var2, 0, null, x340Var, 0, 0, 1712);
                    x340Var.r(true);
                    t1c.a(dug.f(u291.h(u291.v(eqr0.D(0.0f, 6.0f, 1, uyn1.B(h2cVar2.a(nim0Var2, een.t), f5, 0.0f, 0.0f, 0.0f, 14)), 2.0f), 6.0f), cbx.a(x340Var).a.b.a(), u5j1Var2), x340Var, 0);
                    x340Var.r(false);
                }
                z = true;
                if (lhg1Var != null) {
                    numValueOf = null;
                } else {
                    numValueOf = null;
                }
                if (z8) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (z) {
                    iIntValue = 2131958856;
                } else if (!z2) {
                    iIntValue = 2131958854;
                } else {
                    if (numValueOf == null) {
                        hhg1.n("Required value was null.");
                        return;
                    }
                    iIntValue = numValueOf.intValue();
                }
                String strO2 = cwl1.o0(x340Var, iIntValue);
                avw0 avw0Var3 = cbx.b(x340Var).c;
                cvx cvxVar5 = cbx.b(x340Var).b;
                zov0 zov0Var4 = cbx.b(x340Var).g;
                z4 = z3;
                long j6 = cbx.a(x340Var).b.b;
                if (z4) {
                    x340Var.i0(-2023073626);
                    long jA5 = cbx.a(x340Var).a.b.a();
                    x340Var.r(false);
                    j = jA5;
                } else {
                    x340Var.i0(-2023073107);
                    x340Var.r(false);
                    j = u7h.j;
                }
                uvx uvxVar3 = (uvx) x340Var.k(vvx.a);
                vzq0 vzq0Var3 = uvxVar3.e;
                i3 = uvxVar3.c;
                i4 = uvxVar3.a;
                kiv kivVar3 = t4k.n;
                float fN5 = uyn1.n(vzq0Var3, (flb0) x340Var.k(kivVar3));
                zzq0Var = uvxVar3.d;
                if (zzq0Var == null) {
                    x340Var.i0(-2023064808);
                    zzq0VarP = gto1.p(i4, x340Var, i3);
                    z5 = false;
                    x340Var.r(false);
                } else {
                    z5 = false;
                    x340Var.i0(-2023067071);
                    x340Var.r(false);
                    zzq0VarP = zzq0Var;
                }
                float fN6 = uyn1.n(zzq0VarP, (flb0) x340Var.k(kivVar3)) + fN5;
                p3vVar = uvxVar3.i;
                if (p3vVar == null) {
                    x340Var.i0(-2023058605);
                    fX = gto1.x(i4, x340Var, i3);
                    x340Var.r(z5);
                } else {
                    x340Var.i0(-2023060589);
                    x340Var.r(z5);
                    fX = p3vVar.a;
                }
                float f6 = (fX / 2.0f) + fN6;
                h2c h2cVar3 = h2c.a;
                nim0 nim0Var3 = nim0.a;
                float f7 = f6 - f;
                qim0 qim0VarH3 = u291.h(u291.v(eqr0.D(0.0f, -6.0f, 1, uyn1.B(h2cVar3.a(nim0Var3, graVar), f7, 0.0f, 0.0f, 0.0f, 14)), 2.0f), 6.0f);
                long jA6 = cbx.a(x340Var).a.b.a();
                u5j1 u5j1Var3 = d4o1.a;
                t1c.a(dug.f(qim0VarH3, jA6, u5j1Var3), x340Var, 0);
                qim0 qim0VarB4 = uyn1.B(u291.b(0.0f, 16.0f, 1, u291.f(nim0Var3, f)), f6 - 6.0f, 0.0f, 0.0f, 0.0f, 14);
                jw31 jw31VarA3 = ew31.a(h36.a, een.N0, x340Var, 0);
                int iHashCode6 = Long.hashCode(x340Var.T);
                xos0 xos0VarM6 = x340Var.m();
                qim0 qim0VarE6 = zr7.E(x340Var, qim0VarB4);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA3, x340Var, lljVar);
                nko1.H(xos0VarM6, x340Var, lljVar2);
                x0d.q(iHashCode6, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE6, x340Var, lljVar4);
                qim0 qim0VarR5 = u291.r(nim0Var3, 12.0f);
                cua cuaVar3 = cbx.b(x340Var).f;
                qim0 qim0VarF3 = dug.f(qim0VarR5, j, er31.b(2.0f));
                gfh0 gfh0VarC4 = t1c.c(een.h, false);
                int iHashCode7 = Long.hashCode(x340Var.T);
                xos0 xos0VarM7 = x340Var.m();
                qim0 qim0VarE7 = zr7.E(x340Var, qim0VarF3);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC4, x340Var, lljVar);
                nko1.H(xos0VarM7, x340Var, lljVar2);
                x0d.q(iHashCode7, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE7, x340Var, lljVar4);
                qim0 qim0VarR6 = u291.r(nim0Var3, 12.0f);
                if (z) {
                    anxVar = ssx.c;
                } else {
                    anxVar = ssx.c;
                }
                w0h1.a(anxVar, isl.a, qim0VarR6, j6, 0L, false, x340Var, 56, 48);
                x340Var.r(true);
                lee1 lee1Var3 = cbx.d(x340Var).j;
                long j7 = cbx.a(x340Var).b.b;
                cjc0 cjc0Var3 = new cjc0(1);
                cvx cvxVar6 = cbx.b(x340Var).b;
                z6 = true;
                uwo1.e(strO2, uyn1.B(nim0Var3, 8.0f, 0.0f, 0.0f, 0.0f, 14), lee1Var3, j7, null, null, 2, false, cjc0Var3, 0, null, x340Var, 0, 0, 1712);
                x340Var.r(true);
                t1c.a(dug.f(u291.h(u291.v(eqr0.D(0.0f, 6.0f, 1, uyn1.B(h2cVar3.a(nim0Var3, een.t), f7, 0.0f, 0.0f, 0.0f, 14)), 2.0f), 6.0f), cbx.a(x340Var).a.b.a(), u5j1Var3), x340Var, 0);
                x340Var.r(false);
            }
            x340Var.r(z6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(lhg1Var, qim0Var, i, (byte) 12);
        }
    }

    public static final void b(final boolean z, final int i, final x6e1 x6e1Var, b0k b0kVar, final int i2) {
        int i3;
        z9e1 z9e1VarD;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1344558920);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(l1d.C(i)) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(x6e1Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 14;
            boolean zG = (i4 == 4) | x340Var.g(x6e1Var);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = new u6e1(x6e1Var, z);
                x340Var.s0(objT);
            }
            b4e1 b4e1Var = (b4e1) objT;
            boolean zI = x340Var.i(x6e1Var) | (i4 == 4);
            Object objT2 = x340Var.T();
            if (zI || objT2 == obj) {
                objT2 = new z6e1(x6e1Var, z);
                x340Var.s0(objT2);
            }
            jyp0 jyp0Var = (jyp0) objT2;
            boolean zH = nbe1.h(x6e1Var.l().b);
            int i5 = (int) (z ? x6e1Var.l().b >> 32 : x6e1Var.l().b & 4294967295L);
            r1c0 r1c0Var = x6e1Var.d;
            float fK = (r1c0Var == null || (z9e1VarD = r1c0Var.d()) == null) ? 0.0f : x4p1.k(z9e1VarD.a, i5);
            boolean zI2 = x340Var.i(b4e1Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == obj) {
                objT3 = new ae4(b4e1Var, (byte) 14);
                x340Var.s0(objT3);
            }
            t4n1.k(jyp0Var, z, i, zH, 0L, fK, f8d1.b(nim0.a, b4e1Var, (PointerInputEventHandler) objT3), x340Var, (i3 << 3) & 1008, 16);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.y6e1
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = czo1.p(i2 | 1);
                    a4p1.b(z, i, x6e1Var, (b0k) obj2, iP);
                    return rih1.a;
                }
            };
        }
    }

    public static final void c(adj1 adj1Var, paj1 paj1Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-939120464);
        int i2 = (x340Var.g(adj1Var) ? 4 : 2) | i | (x340Var.e(paj1Var.ordinal()) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            bcu0 bcu0Var = (bcu0) x340Var.k(ibj1.a);
            bzs bzsVar = (bzs) x340Var.k(ibj1.d);
            av0 av0Var = (av0) x340Var.k(ibj1.c);
            h44 h44Var = (h44) x340Var.k(ibj1.f);
            taj1 taj1VarA = adj1Var.a();
            fq0 fq0Var = taj1VarA.a;
            List list = taj1VarA.e;
            boolean zG = x340Var.g(fq0Var.h());
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = av0Var.b(taj1VarA, list);
                if (objT == null) {
                    hhg1.n("Required value was null.");
                    return;
                }
                x340Var.s0(objT);
            }
            o2u0 o2u0Var = (o2u0) objT;
            boolean zG2 = x340Var.g(fq0Var.h());
            Object objT2 = x340Var.T();
            Object obj = objT2;
            if (zG2 || objT2 == m4cVar) {
                uoa uoaVarA = bcu0Var.a(o2u0Var);
                int iOrdinal = paj1Var.ordinal();
                uoaVarA.q(((iOrdinal == 0 || iOrdinal == 2) && h44Var == h44.b) ? false : true);
                x340Var.s0(uoaVarA);
                obj = uoaVarA;
            }
            uoa uoaVar = (uoa) obj;
            boolean zG3 = x340Var.g(fq0Var.h());
            Object objT3 = x340Var.T();
            if (zG3 || objT3 == m4cVar) {
                objT3 = c13.l(uoaVar.e() != null, x340Var);
            }
            ven0 ven0Var = (ven0) objT3;
            if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                ven0Var.setValue(Boolean.valueOf(adj1Var instanceof bdj1));
            }
            if (uoaVar.e() == null && adj1Var.isVisible() && (adj1Var instanceof xcj1)) {
                uoaVar.g(o2u0Var);
            }
            if (adj1Var instanceof cdj1) {
                o2u0 o2u0VarB = av0Var.b(taj1VarA, list);
                if (o2u0VarB == null) {
                    hhg1.n("Required value was null.");
                    return;
                }
                uoaVar.g(o2u0VarB);
            }
            boolean zI = x340Var.i(bzsVar) | x340Var.i(uoaVar) | ((i2 & 14) == 4);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new jyi1(bzsVar, uoaVar, adj1Var, (byte) 5);
                x340Var.s0(objT4);
            }
            qxd0.i(uoaVar, (iu30) objT4, x340Var);
            uoaVar.p(adj1Var.e() ? 3 : 1);
            gfx.b(1, apo.r(-1897399387, new tte1(adj1Var, paj1Var, ven0Var, uoaVar, taj1VarA, (byte) 13), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eii1(adj1Var, paj1Var, i, (byte) 13);
        }
    }

    public static final void d(uoa uoaVar, b3k1 b3k1Var, a7j1 a7j1Var, qim0 qim0Var, b0k b0kVar, int i) {
        b3k1 b3k1Var2;
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1949184129);
        int i2 = i | (b0kVar3.i(uoaVar) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= b0kVar3.e(b3k1Var.ordinal()) ? 32 : 16;
        }
        int i3 = i2 | (b0kVar3.i(a7j1Var) ? 256 : 128) | (b0kVar3.i(qim0Var) ? 2048 : 1024);
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            b0kVar3.f0(560218503, b0kVar3.K(uoaVar, a7j1Var));
            boolean zI = b0kVar3.i(uoaVar);
            Object objT = b0kVar3.T();
            if (zI || objT == m4cVar) {
                hcf1 hcf1Var = new hcf1(1, uoaVar, uoa.class, "addSurface", "addSurface(Lcom/spotify/betamax/player/VideoSurfaceView;)V", 0, (byte) 22);
                b0kVar3.s0(hcf1Var);
                objT = hcf1Var;
            }
            iu30 iu30Var = (nla0) objT;
            boolean zI2 = b0kVar3.i(uoaVar);
            Object objT2 = b0kVar3.T();
            if (zI2 || objT2 == m4cVar) {
                hcf1 hcf1Var2 = new hcf1(1, uoaVar, uoa.class, "removeSurface", "removeSurface(Lcom/spotify/betamax/player/VideoSurfaceView;)V", 0, (byte) 23);
                b0kVar3.s0(hcf1Var2);
                objT2 = hcf1Var2;
            }
            iu30 iu30Var2 = (nla0) objT2;
            boolean zI3 = b0kVar3.i(a7j1Var) | ((i3 & 112) == 32);
            Object objT3 = b0kVar3.T();
            if (zI3 || objT3 == m4cVar) {
                b3k1Var2 = b3k1Var;
                objT3 = new hij1(a7j1Var, b3k1Var2, (byte) 3);
                b0kVar3.s0(objT3);
            } else {
                b3k1Var2 = b3k1Var;
            }
            b0kVar2 = b0kVar3;
            dm5.b((iu30) objT3, qim0Var, (iu30) null, iu30Var2, iu30Var, b0kVar2, (i3 >> 6) & 112, 4);
            b0kVar2.r(false);
        } else {
            b3k1Var2 = b3k1Var;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lxl(uoaVar, b3k1Var2, a7j1Var, qim0Var, i);
        }
    }

    public static final p6r0 e(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            return yon1.G1("AGE_SIGNAL_SIGNUP_CONFIRM_AGE", "age-signal/signup/confirm-age", 134, "age-signal");
        }
        if (iC == 1) {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            return yon1.G1("AGE_SIGNAL_SIGNUP_ASK_PARENT", "age-signal/signup/ask-parent", 133, "age-signal");
        }
        if (iC == 2) {
            AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
            return yon1.G1("AGE_SIGNAL_SIGNUP_MANAGED_ACCOUNT", "age-signal/signup/managed-account", 135, "age-signal");
        }
        eg.o();
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(PlayerState playerState, lkd lkdVar, fza1 fza1Var, boolean z, onm onmVar) throws AbortFlowException {
        rdu0 rdu0Var;
        ContextTrack contextTrack;
        LinkedHashSet linkedHashSet;
        ContextTrack contextTrack2;
        LinkedHashSet linkedHashSet2;
        boolean z2;
        if (onmVar instanceof rdu0) {
            rdu0Var = (rdu0) onmVar;
            int i = rdu0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                rdu0Var.e = i - Integer.MIN_VALUE;
            } else {
                rdu0Var = new rdu0(onmVar);
            }
        } else {
            rdu0Var = new rdu0(onmVar);
        }
        Object obj = rdu0Var.d;
        int i2 = rdu0Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            contextTrack = (ContextTrack) playerState.track().h();
            if (contextTrack == null) {
                return suw.a;
            }
            linkedHashSet = new LinkedHashSet();
            String strContextUri = playerState.contextUri();
            if (strContextUri == null) {
                strContextUri = "";
            }
            if (fza1Var.b(strContextUri)) {
                linkedHashSet.add(iu0.CONTEXT_IS_SPONSORED);
            }
            if (l4o1.E(contextTrack)) {
                linkedHashSet.add(iu0.TRACK_IS_AD);
            } else if (l4o1.P(contextTrack)) {
                linkedHashSet.add(iu0.TRACK_IS_PODCAST);
            } else if (l4o1.Y(contextTrack)) {
                linkedHashSet.add(iu0.TRACK_IS_MUSIC_VIDEO);
            } else {
                vd0 vd0VarC = lkdVar.c(contextTrack);
                rdu0Var.a = contextTrack;
                rdu0Var.b = linkedHashSet;
                rdu0Var.c = z;
                rdu0Var.e = 1;
                Object objI = b5p1.i(vd0VarC, rdu0Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
                contextTrack2 = contextTrack;
                obj = objI;
                linkedHashSet2 = linkedHashSet;
            }
            z2 = false;
            return linkedHashSet.isEmpty() ? new ruw(contextTrack.uri(), z2) : new quw(contextTrack.uri(), linkedHashSet);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = rdu0Var.c;
        linkedHashSet2 = rdu0Var.b;
        contextTrack2 = rdu0Var.a;
        hm5.M(obj);
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue && z) {
            linkedHashSet2.add(iu0.TRACK_IS_CANVAS);
        }
        linkedHashSet = linkedHashSet2;
        contextTrack = contextTrack2;
        z2 = zBooleanValue;
        if (linkedHashSet.isEmpty()) {
        }
    }

    public static final ArrayList g(l7h1 l7h1Var) {
        ArrayList arrayList = new ArrayList();
        z6h1 z6h1Var = ((q6h1) l7h1Var).c;
        Iterator it = z6h1Var.b.a.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((y6h1) it.next()).d);
        }
        arrayList.addAll(z6h1Var.a.d);
        return arrayList;
    }

    public static final js20 h(iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, o8n o8nVar, iu30 iu30Var3) {
        qtr qtrVar = new qtr();
        iu30Var3.invoke(qtrVar);
        return new js20(iu30Var, iu30Var2, vu30Var, qtrVar, true, o8nVar, false);
    }

    public static final b180 i() {
        b180 b180Var = b;
        if (b180Var != null) {
            return b180Var;
        }
        a180 a180Var = new a180("Encore.Vector.Search24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = bui1.a;
        n6a1 n6a1Var = new n6a1(u7h.b);
        cwh0 cwh0VarG = lf51.g(10.533f, 1.279f);
        cwh0VarG.f(5.352f, 1.279f, 1.126f, 5.419f, 1.126f, 10.558f);
        cwh0VarG.f(1.126f, 15.697f, 5.352f, 19.837f, 10.533f, 19.837f);
        cwh0VarG.f(12.767f, 19.837f, 14.823f, 19.067f, 16.44f, 17.779f);
        cwh0VarG.j(20.793f, 22.132f);
        cwh0VarG.f(21.183f, 22.523f, 21.817f, 22.523f, 22.207f, 22.132f);
        cwh0VarG.f(22.598f, 21.742f, 22.598f, 21.108f, 22.207f, 20.718f);
        cwh0VarG.j(17.863f, 16.374f);
        cwh0VarG.f(19.162f, 14.785f, 19.94f, 12.763f, 19.94f, 10.558f);
        cwh0VarG.f(19.94f, 5.419f, 15.714f, 1.279f, 10.533f, 1.279f);
        cwh0VarG.e();
        cwh0VarG.l(3.126f, 10.558f);
        cwh0VarG.f(3.126f, 6.552f, 6.428f, 3.279f, 10.533f, 3.279f);
        cwh0VarG.f(14.638f, 3.279f, 17.94f, 6.552f, 17.94f, 10.558f);
        cwh0VarG.f(17.94f, 14.564f, 14.638f, 17.837f, 10.533f, 17.837f);
        cwh0VarG.f(6.428f, 17.837f, 3.126f, 14.564f, 3.126f, 10.558f);
        cwh0VarG.e();
        a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
        b180 b180VarB = a180Var.b();
        b = b180VarB;
        return b180VarB;
    }

    public static final String j(int i, String str, Context context, boolean z) {
        if (z) {
            String string = context.getString(2131961057, str);
            string.getClass();
            return string;
        }
        if (14 <= i && i <= Integer.MAX_VALUE) {
            return context.getString(2131963502, str);
        }
        if (2 <= i && i < 14) {
            return context.getResources().getQuantityString(2131820653, i, Integer.valueOf(i));
        }
        if (i == 1) {
            return context.getString(2131961068);
        }
        return i == 0 ? context.getString(2131961067) : "";
    }

    public static final a7j1 k(List list) {
        ArrayList<a7j1> arrayList = new ArrayList();
        for (Object obj : list) {
            a7j1 a7j1Var = (a7j1) obj;
            if (a7j1Var.b > 0 && a7j1Var.c > 0) {
                arrayList.add(obj);
            }
        }
        a7j1 a7j1Var2 = (a7j1) o7h.s0(arrayList);
        if (a7j1Var2 == null) {
            return null;
        }
        if (arrayList.isEmpty()) {
            return a7j1Var2;
        }
        for (a7j1 a7j1Var3 : arrayList) {
            if (((long) a7j1Var3.b) * ((long) a7j1Var2.c) != ((long) a7j1Var2.b) * ((long) a7j1Var3.c)) {
                return null;
            }
        }
        return a7j1Var2;
    }

    public static final go80 l(klm klmVar, acp0 acp0Var, rbp0 rbp0Var, rbp0 rbp0Var2, acp0 acp0Var2, acp0 acp0Var3, acp0 acp0Var4) {
        return klmVar.a("SleepTimerControllerDaemon", new ndp0(acp0Var, rbp0Var, rbp0Var2, acp0Var2, acp0Var3, acp0Var4, (byte) 1));
    }

    public static final boolean m(x6e1 x6e1Var, boolean z) {
        elb0 elb0VarC;
        r1c0 r1c0Var = x6e1Var.d;
        if (r1c0Var == null || (elb0VarC = r1c0Var.c()) == null) {
            return false;
        }
        return ljo1.o(x6e1Var.j(z), ljo1.u(elb0VarC));
    }

    public static y6e0 n() {
        return new y6e0(df.Z0);
    }

    public static final i4r o(f4r f4rVar) {
        return new i4r(ent0.g, f4rVar);
    }

    public static awj q() {
        return new awj(new a7e0(2131954203, 2131954202), (byte) 3);
    }

    public static final y6r0 r(y6r0 y6r0Var) {
        if (y6r0Var != null) {
            return y6r0Var;
        }
        y6r0.Companion.getClass();
        return new y6r0("");
    }

    public static final ArrayList s(l7h1 l7h1Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((q6h1) l7h1Var).c.b.a.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((y6h1) it.next()).d.iterator();
            while (it2.hasNext()) {
                arrayList.add(((a7h1) it2.next()).a);
            }
        }
        return arrayList;
    }

    public static final ArrayList t(l7h1 l7h1Var) {
        List list = ((q6h1) l7h1Var).c.a.d;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((a7h1) it.next()).a);
        }
        return arrayList;
    }

    public static final LinkedHashMap u(Context context, String str, ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            String str2 = ((vrj0) obj).a;
            Object objH = linkedHashMap.get(str2);
            if (objH == null) {
                objH = cfm0.h(str2, linkedHashMap);
            }
            ((List) objH).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), new bu71(context, str, (List) entry.getValue()));
        }
        return linkedHashMap2;
    }

    public static y6e0 v(e491... e491VarArr) {
        return new y6e0(new jgd0(e491VarArr, (byte) 7));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object w(q6h q6hVar, rp5 rp5Var, z2h z2hVar, onm onmVar) {
        u6h u6hVar;
        i7h i7hVar;
        q6h q6hVar2 = q6hVar;
        if (onmVar instanceof u6h) {
            u6hVar = (u6h) onmVar;
            int i = u6hVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                u6hVar.d = i - Integer.MIN_VALUE;
            } else {
                u6hVar = new u6h(onmVar);
            }
        } else {
            u6hVar = new u6h(onmVar);
        }
        Object objC = u6hVar.c;
        int i2 = u6hVar.d;
        if (i2 == 0) {
            hm5.M(objC);
            int i3 = q6hVar2.t;
            wa71 wa71Var = q6hVar2.e;
            e9d1 e9d1VarO = b9p1.o(rp5Var.a, i3);
            int iG = z4p1.G(u7h.b);
            List list = e9d1VarO.a;
            i7hVar = new i7h(new ilw0(i3, iG, ((x8d1) o7h.q0(list)).b()), list);
            z2h z2hVarA = z2hVar.a(wa71Var.a);
            String str = wa71Var.a;
            u6hVar.a = q6hVar2;
            u6hVar.b = i7hVar;
            u6hVar.d = 1;
            objC = z2hVarA.c(str, u6hVar);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i7h i7hVar2 = u6hVar.b;
            q6h q6hVar3 = u6hVar.a;
            hm5.M(objC);
            i7hVar = i7hVar2;
            q6hVar2 = q6hVar3;
        }
        y2h y2hVar = (y2h) objC;
        return new i6h(q6hVar2.g, q6hVar2.h, q6hVar2.i, q6hVar2.t, i7hVar.a, i7hVar.b, y2hVar.a, y2hVar.b, q6hVar2.Q0);
    }

    public static final Set x(q6h q6hVar, int i) {
        Set set = q6hVar.d;
        auu0 auu0Var = q6hVar.Q0;
        if ((auu0Var instanceof auu0) && set.contains(a7h.b)) {
            return Collections.singleton(new d6h(auu0Var.d));
        }
        if (!set.contains(a7h.a)) {
            return w7x.a;
        }
        return Collections.singleton(new e6h(q6hVar.N0, i, q6hVar.Z));
    }

    public void p(txf0 txf0Var, txf0 txf0Var2, txf0 txf0Var3, txf0 txf0Var4) {
        if (this instanceof gu9) {
            txf0Var.accept(this);
            return;
        }
        if (this instanceof ju9) {
            txf0Var2.accept(this);
            return;
        }
        if (this instanceof hu9) {
            txf0Var3.accept(this);
        } else if (this instanceof iu9) {
            txf0Var4.accept(this);
        } else {
            eg.o();
        }
    }
}
