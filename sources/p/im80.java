package p;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import j$.time.Clock;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class im80 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        ytw0 ytw0Var = jfv.b;
        a = fdg1.k0(1, ngv.f);
    }

    public static final void a(cl80 cl80Var, iu30 iu30Var, iu30 iu30Var2, kl80 kl80Var, qim0 qim0Var, b0k b0kVar, int i) {
        boolean z;
        boolean z2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1148221246);
        int i2 = i | (x340Var.g(cl80Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(iu30Var2) ? 256 : 128) | (x340Var.i(kl80Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0VarN = anm1.N("insight-card-" + cl80Var.getId(), qim0Var);
            if (cl80Var instanceof zk80) {
                x340Var.i0(-1539236345);
                if (kl80Var != null) {
                    x340Var.i0(-1539203919);
                    otw.c(kl80Var, new hl80((xk80) cl80Var, iu30Var, iu30Var2), qim0VarN, (ipb1) null, x340Var, (i2 >> 9) & 14, 8);
                    x340Var.r(false);
                    z2 = false;
                } else {
                    x340Var.i0(-1538987632);
                    zk80 zk80Var = (zk80) cl80Var;
                    int i3 = i2 & 14;
                    boolean z3 = ((i2 & 112) == 32) | (i3 == 4);
                    Object objT = x340Var.T();
                    if (z3 || objT == m4cVar) {
                        objT = new gm80(iu30Var, cl80Var, (byte) 0);
                        x340Var.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    boolean z4 = ((i2 & 896) == 256) | (i3 == 4);
                    Object objT2 = x340Var.T();
                    if (z4 || objT2 == m4cVar) {
                        objT2 = new gm80(iu30Var2, cl80Var, (byte) 1);
                        x340Var.s0(objT2);
                    }
                    z2 = false;
                    grn1.j(zk80Var, function0, (Function0) objT2, null, zk80Var.d, null, null, null, qim0VarN, x340Var, i3 | 14355456, 0);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
                x340Var.r(z2);
            } else if (cl80Var instanceof al80) {
                x340Var.i0(366010405);
                al80 al80Var = (al80) cl80Var;
                boolean z5 = (i2 & 896) == 256;
                int i4 = i2 & 14;
                boolean z6 = z5 | (i4 == 4);
                Object objT3 = x340Var.T();
                if (z6 || objT3 == m4cVar) {
                    objT3 = new gm80(iu30Var2, cl80Var, (byte) 2);
                    x340Var.s0(objT3);
                }
                h1p1.g(al80Var, (Function0) objT3, qim0VarN, x340Var, i4);
                x340Var.r(false);
            } else {
                if (!(cl80Var instanceof yk80)) {
                    throw p3d1.k(x340Var, 365988430, false);
                }
                x340Var.i0(-1538395780);
                if (kl80Var != null) {
                    x340Var.i0(-1538361711);
                    otw.c(kl80Var, new hl80((xk80) cl80Var, iu30Var, iu30Var2), qim0VarN, (ipb1) null, x340Var, (i2 >> 9) & 14, 8);
                    x340Var.r(false);
                    z = false;
                } else {
                    x340Var.i0(-1538147067);
                    yk80 yk80Var = (yk80) cl80Var;
                    String str = yk80Var.d;
                    int i5 = i2 & 14;
                    boolean z7 = ((i2 & 112) == 32) | (i5 == 4);
                    Object objT4 = x340Var.T();
                    if (z7 || objT4 == m4cVar) {
                        objT4 = new gm80(iu30Var, cl80Var, (byte) 3);
                        x340Var.s0(objT4);
                    }
                    Function0 function1 = (Function0) objT4;
                    boolean z8 = ((i2 & 896) == 256) | (i5 == 4);
                    Object objT5 = x340Var.T();
                    if (z8 || objT5 == m4cVar) {
                        objT5 = new gm80(iu30Var2, cl80Var, (byte) 4);
                        x340Var.s0(objT5);
                    }
                    z = false;
                    ply.b(yk80Var, null, str, null, function1, (Function0) objT5, qim0VarN, x340Var, i5 | 3120, 0);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
                x340Var.r(z);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uk20((byte) 14, i, (Object) cl80Var, (Object) iu30Var, (Object) iu30Var2, (Object) kl80Var, (Object) qim0Var);
        }
    }

    public static final void b(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-560701104);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, cbx.a(x340Var).a.c, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0.a);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            uwo1.e(cwl1.o0(x340Var, 2131956677), null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            gfx.g(4, apo.r(734915079, new ql(cwl1.o0(x340Var, 2131956678), function0, (byte) 10), x340Var), x340Var, 54);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(function0, qim0Var, i, (byte) 14);
        }
    }

    public static final void c(qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-468150448);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, cbx.a(x340Var).a.c, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            xto1.e(u291.B(nim0.a, (gra) null, 3), 6, 0L, 0L, x340Var, 54, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2(qim0Var, i, (byte) 14);
        }
    }

    public static final void d(List list, Set set, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, kl80 kl80Var, Clock clock, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        Set set2;
        iu30 iu30Var4;
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1270162812);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            set2 = set;
            i2 |= b0kVar3.g(set2) ? 32 : 16;
        } else {
            set2 = set;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            iu30Var4 = iu30Var3;
            i2 |= b0kVar3.i(iu30Var4) ? 16384 : 8192;
        } else {
            iu30Var4 = iu30Var3;
        }
        if ((i & 196608) == 0) {
            i2 |= b0kVar3.i(kl80Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= b0kVar3.i(clock) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 8388608 : 4194304;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 4793491) != 4793490)) {
            boolean zG = b0kVar3.g(clock);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = v8r.q(clock.instant());
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zG2 = b0kVar3.g(ven0Var) | b0kVar3.i(clock);
            Object objT2 = b0kVar3.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new x060(clock, ven0Var, (lnm) null, (byte) 20);
                b0kVar3.s0(objT2);
            }
            qxd0.t(clock, b0kVar3, (vu30) objT2);
            boolean z = ((Configuration) b0kVar3.k(AndroidCompositionLocals_androidKt.a)).fontScale >= 1.3f;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarN = anm1.N("insights-list", dug.f(u291.d(qim0Var, 1.0f), cbx.a(b0kVar3).a.c, d4o1.a));
            zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, 16.0f, 7);
            boolean zI = b0kVar3.i(list) | ((i2 & 112) == 32) | b0kVar3.g(ven0Var) | ((57344 & i2) == 16384) | b0kVar3.h(z) | b0kVar3.d(16.0f) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | b0kVar3.i(kl80Var);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                qz9 qz9Var = new qz9(list, set2, iu30Var4, ven0Var, z, iu30Var, iu30Var2, kl80Var);
                b0kVar3.s0(qz9Var);
                objT3 = qz9Var;
            }
            b0kVar2 = b0kVar3;
            ujo1.d(qim0VarN, null, zzq0VarJ, false, null, null, null, false, null, (iu30) objT3, b0kVar2, 0, 506);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new f1c(list, set, iu30Var, iu30Var2, iu30Var3, kl80Var, clock, qim0Var, i);
        }
    }

    public static final void e(List list, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, Set set, kl80 kl80Var, boolean z, boolean z2, Function0 function0, iu30 iu30Var3, Clock clock, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        Clock clock2;
        qim0 qim0Var3;
        Clock clock3;
        qim0 qim0Var4;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-729621721);
        int i2 = i | (x340Var2.i(list) ? 4 : 2) | (x340Var2.i(iu30Var) ? 32 : 16) | (x340Var2.i(iu30Var2) ? 256 : 128) | 3072 | (x340Var2.g(set) ? 16384 : 8192) | (x340Var2.i(kl80Var) ? 131072 : 65536) | (x340Var2.h(z) ? 1048576 : 524288) | (x340Var2.h(z2) ? 8388608 : 4194304) | (x340Var2.i(function0) ? 67108864 : 33554432) | (x340Var2.i(iu30Var3) ? 536870912 : 268435456);
        if (x340Var2.Y(i2 & 1, (306783379 & i2) != 306783378)) {
            x340Var2.d0();
            if ((i & 1) == 0 || x340Var2.E()) {
                Clock clockSystemUTC = Clock.systemUTC();
                qim0Var3 = nim0.a;
                clock3 = clockSystemUTC;
            } else {
                x340Var2.b0();
                qim0Var3 = qim0Var;
                clock3 = clock;
            }
            x340Var2.s();
            if (z) {
                x340Var2.i0(-1086789083);
                c(qim0Var3, x340Var2, 6);
                x340Var2.r(false);
            } else {
                if (z2) {
                    x340Var2.i0(-1086787583);
                    b(((i2 >> 24) & 14) | 48, function0, x340Var2, qim0Var3);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1086784825);
                    int i3 = i2 << 3;
                    qim0Var4 = qim0Var3;
                    d(list, set, iu30Var, iu30Var2, iu30Var3, kl80Var, clock3, qim0Var4, x340Var2, (i2 & 458752) | (i2 & 14) | ((i2 >> 9) & 112) | (i3 & 896) | (i3 & 7168) | ((i2 >> 15) & 57344) | 12582912);
                    x340Var = x340Var2;
                    x340Var.r(false);
                }
                clock2 = clock3;
                qim0Var2 = qim0Var4;
            }
            x340Var = x340Var2;
            qim0Var4 = qim0Var3;
            clock2 = clock3;
            qim0Var2 = qim0Var4;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
            clock2 = clock;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new seb(list, iu30Var, iu30Var2, qim0Var2, set, kl80Var, z, z2, function0, iu30Var3, clock2, i);
        }
    }
}
