package p;

import android.R;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class rno1 {
    public static final tzg1 a = new tzg1(new p5e1((byte) 23), new qti1((byte) 10));
    public static final tzg1 b = new tzg1(new p5e1((byte) 24), new p5e1((byte) 25));
    public static final tzg1 c = new tzg1(new p5e1((byte) 26), new p5e1((byte) 27));
    public static final tzg1 d = new tzg1(new p5e1((byte) 28), new p5e1((byte) 29));
    public static final tzg1 e = new tzg1(new qti1((byte) 0), new qti1((byte) 1));
    public static final tzg1 f = new tzg1(new qti1((byte) 2), new qti1((byte) 3));
    public static final tzg1 g = new tzg1(new qti1((byte) 4), new qti1((byte) 5));
    public static final tzg1 h = new tzg1(new qti1((byte) 6), new qti1((byte) 7));
    public static final tzg1 i = new tzg1(new qti1((byte) 8), new qti1((byte) 9));
    public static b180 j;

    public static final void a(String str, String str2, q960 q960Var, qim0 qim0Var, b0k b0kVar, int i2) {
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1744343123);
        int i3 = i2 | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(q960Var) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            if (q960Var == null) {
                x340Var.i0(-106848939);
            } else {
                x340Var.i0(-106848938);
                c(q960Var, qim0Var, x340Var, (i3 >> 6) & 112);
            }
            x340Var.r(false);
            if (str == null) {
                x340Var.i0(-106788830);
                x340Var.r(false);
                z = true;
            } else {
                x340Var.i0(-106788829);
                uwr uwrVar = cbx.a;
                long j2 = cbx.a(x340Var).b.b;
                cjc0 cjc0Var = new cjc0(1);
                boolean z2 = (i3 & 112) == 32;
                Object objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new ry40(str2, (byte) 10);
                    x340Var.s0(objT);
                }
                uwo1.e(str, s161.b(nim0Var, false, (iu30) objT), cbx.d(x340Var).j, j2, null, null, 2, false, cjc0Var, 0, null, x340Var, i3 & 14, 0, 1712);
                x340Var.r(false);
                z = true;
            }
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cb60(i2, (Object) str, (Object) str2, (Object) q960Var, (Object) qim0Var, (byte) 2);
        }
    }

    public static final void b(c380 c380Var, String str, v0a v0aVar, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        boolean z;
        hax haxVar;
        String str2;
        List list;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(345942448);
        j06 j06Var = ((x340) b0kVar2).a;
        if ((i2 & 6) == 0) {
            i3 = (b0kVar2.g(c380Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar2.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar2.g(v0aVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar2.i(iu30Var) ? 2048 : 1024;
        }
        if (b0kVar2.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object objT = b0kVar2.T();
            if (objT == m4cVar) {
                objT = v8r.q((v0aVar == null || (list = v0aVar.a) == null) ? w7x.a : o7h.p1(list));
                b0kVar2.s0(objT);
            }
            tob1 tob1Var = (ven0) objT;
            Object objT2 = b0kVar2.T();
            if (objT2 == m4cVar) {
                if (v0aVar == null || (str2 = v0aVar.b) == null) {
                    str2 = "";
                }
                objT2 = v8r.q(new y7e1(str2, 2));
                b0kVar2.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            boolean zContains = str != null ? ((Set) tob1Var.getValue()).contains(str) : false;
            qim0 qim0Var = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarH = l6o1.H(uyn1.B(uyn1.z(16.0f, 0.0f, 2, qim0VarF), 0.0f, 0.0f, 0.0f, cbx.b(b0kVar2).b.b, 7), l6o1.C(0, 0, 1, b0kVar2), false, 14);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarH);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z2 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar4);
            nko1.H(xos0VarM, b0kVar2, lljVar3);
            x0d.q(iHashCode, b0kVar2, lljVar2, b0kVar2);
            nko1.H(qim0VarE, b0kVar2, lljVar);
            String strO0 = cwl1.o0(b0kVar2, 2131959035);
            lee1 lee1Var = cbx.d(b0kVar2).f;
            long j2 = cbx.a(b0kVar2).b.a;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0 qim0Var2 = qim0Var;
            int i4 = i3;
            boolean z3 = zContains;
            tob1 tob1Var2 = tob1Var;
            float f2 = 1.0f;
            uwo1.e(strO0, uyn1.B(qim0Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), lee1Var, j2, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2032);
            b0k b0kVar3 = b0kVar2;
            b0kVar3.i0(-915331147);
            Iterator it = c380Var.iterator();
            while (it.hasNext()) {
                osz0 osz0Var = (osz0) it.next();
                boolean zContains2 = ((Set) tob1Var2.getValue()).contains(osz0Var.a);
                tob1 tob1Var3 = tob1Var2;
                boolean zI = b0kVar3.i(tob1Var3) | b0kVar3.g(osz0Var);
                Object objT3 = b0kVar3.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new j3y0(osz0Var, tob1Var3, (byte) 13);
                    b0kVar3.s0(objT3);
                }
                iu30 iu30Var2 = (iu30) objT3;
                qim0 qim0VarF2 = u291.f(qim0Var2, f2);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, qim0VarF2);
                pm31 pm31Var = new pm31(1);
                boolean zG = b0kVar3.g(iu30Var2) | b0kVar3.h(zContains2);
                Object objT4 = b0kVar3.T();
                if (zG || objT4 == m4cVar) {
                    objT4 = new z20(iu30Var2, zContains2, (byte) 25);
                    b0kVar3.s0(objT4);
                }
                qim0 qim0VarQ = dgo1.q(qim0VarZ, zContains2, false, pm31Var, (Function0) objT4, 10);
                jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
                int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
                xos0 xos0VarM2 = b0kVar3.m();
                qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarQ);
                hzj.A.getClass();
                b0kVar3.m0();
                if (((x340) b0kVar3).S) {
                    b0kVar3.l(n4kVar);
                } else {
                    b0kVar3.v0();
                }
                nko1.H(jw31VarA, b0kVar3, lljVar4);
                nko1.H(xos0VarM2, b0kVar3, lljVar3);
                x0d.q(iHashCode2, b0kVar3, lljVar2, b0kVar3);
                nko1.H(qim0VarE2, b0kVar3, lljVar);
                b0k b0kVar4 = b0kVar3;
                tob1Var2 = tob1Var3;
                uwo1.e(cwl1.o0(b0kVar3, osz0Var.b), new wnb0(1.0f, true), cbx.d(b0kVar3).g, 0L, null, null, 0, false, null, 0, null, b0kVar4, 0, 0, 2040);
                b0kVar3 = b0kVar4;
                aex.b(zContains2, iu30Var2, null, null, 0, null, null, b0kVar3, 0, 124);
                b0kVar3.r(true);
                qim0Var2 = qim0Var2;
                m4cVar = m4cVar;
                f2 = 1.0f;
            }
            qim0 qim0Var3 = qim0Var2;
            m4c m4cVar2 = m4cVar;
            b0kVar3.r(false);
            if (z3) {
                b0kVar3.i0(1690674899);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar4 = cbx.b(b0kVar3).b;
                op71.g(b0kVar3, u291.h(qim0Var3, 16.0f));
                y7e1 y7e1Var = (y7e1) ven0Var.getValue();
                String strO1 = cwl1.o0(b0kVar3, 2131959032);
                lee1 lee1Var2 = cbx.d(b0kVar3).j;
                b0kVar3.i0(-915283117);
                b0kVar3.i0(939287598);
                zxx zxxVarM = pwo1.m(b0kVar3);
                b0kVar3.r(false);
                fyx fyxVar = new fyx(zxx.a(zxxVarM, zxxVarM.f, 0L, 0L, 0L, 1007));
                b0kVar3.r(false);
                b0k b0kVar5 = b0kVar3;
                z = z3;
                rwo1.a(y7e1Var, fyxVar, null, null, strO1, null, null, false, null, lee1Var2, null, null, null, null, null, null, null, null, 0.0f, false, b0kVar5, 0, 0, 0, 2096108);
                b0kVar3 = b0kVar5;
                b0kVar3.r(false);
            } else {
                z = z3;
                b0kVar3.i0(1691206332);
                b0kVar3.r(false);
            }
            uwr uwrVar4 = cbx.a;
            cvx cvxVar5 = cbx.b(b0kVar3).b;
            qim0 qim0VarO = ab80.o(qim0Var3, 16.0f, b0kVar3, qim0Var3, 1.0f);
            jw31 jw31VarA2 = ew31.a(h36.e, een.Z, b0kVar3, 0);
            int iHashCode3 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM3 = b0kVar3.m();
            qim0 qim0VarE3 = zr7.E(b0kVar3, qim0VarO);
            hzj.A.getClass();
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA2, b0kVar3, lljVar4);
            nko1.H(xos0VarM3, b0kVar3, lljVar3);
            x0d.q(iHashCode3, b0kVar3, lljVar2, b0kVar3);
            nko1.H(qim0VarE3, b0kVar3, lljVar);
            tob1 tob1Var4 = tob1Var2;
            boolean zH = b0kVar3.h(z) | b0kVar3.i(ven0Var) | ((i4 & 7168) == 2048) | b0kVar3.i(tob1Var4);
            Object objT5 = b0kVar3.T();
            if (zH || objT5 == m4cVar2) {
                objT5 = new zg6(z, iu30Var, ven0Var, tob1Var4, (byte) 9);
                b0kVar3.s0(objT5);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT5);
            idx idxVar = new idx(6);
            if (((Set) tob1Var4.getValue()).isEmpty()) {
                b0kVar3.i0(-138595147);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131959034));
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-138431126);
                b0kVar3.r(false);
                haxVar = jax.a;
            }
            b0k b0kVar6 = b0kVar3;
            foo1.c(gbxVar, idxVar, null, haxVar, null, null, null, null, null, null, cbj.b, b0kVar6, 0, 48, 2028);
            b0kVar2 = b0kVar6;
            b0kVar2.r(true);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(c380Var, str, v0aVar, iu30Var, i2, (byte) 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(q960 q960Var, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        int i4;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1962249030);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.g(q960Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.i(qim0Var) ? 32 : 16;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new zi50(q960Var, (byte) 13);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0Var, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarA);
            hzj.A.getClass();
            grx grxVar = null;
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            int iC = l1d.C(q960Var.a);
            if (iC != 0) {
                if (iC == 1) {
                    grxVar = dmx.c;
                } else if (iC == 2) {
                    grxVar = orx.c;
                } else {
                    if (iC != 3) {
                        eg.o();
                        return;
                    }
                    grxVar = grx.c;
                }
            }
            grx grxVar2 = grxVar;
            if (grxVar2 == null) {
                b0kVar3.i0(-1032340175);
                b0kVar3.r(false);
                b0kVar2 = b0kVar3;
                i4 = 1;
            } else {
                b0kVar3.i0(-1032340174);
                long jK = f5p1.k(b0kVar3, 2131101555);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                qim0 qim0VarThen = uyn1.B(nim0.a, 0.0f, 0.0f, 4.0f, 0.0f, 11).then(new i5j1(een.N0));
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                i4 = 1;
                b0kVar2 = b0kVar3;
                w0h1.a(grxVar2, isl.a, u291.r(qim0VarThen, 12.0f), jK, 0L, false, b0kVar2, 56, 48);
                b0kVar2.r(false);
            }
            String str = q960Var.b;
            uwr uwrVar2 = cbx.a;
            long j2 = cbx.a(b0kVar2).b.b;
            cjc0 cjc0Var = new cjc0(i4);
            boolean z2 = i4;
            b0kVar3 = b0kVar2;
            uwo1.e(str, null, cbx.d(b0kVar2).j, j2, null, null, 2, false, cjc0Var, 0, null, b0kVar3, 0, 0, 1714);
            b0kVar3.r(z2);
        } else {
            b0kVar3.b0();
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new say(q960Var, qim0Var, i2, (byte) 28);
        }
    }

    public static final void d(c380 c380Var, qyl qylVar, iu30 iu30Var, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1624183820);
        int i3 = (x340Var.g(c380Var) ? 4 : 2) | i2 | 48 | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                djc1 djc1Var = new djc1();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                djc1Var.a = linkedHashMap;
                iu30Var.invoke(djc1Var);
                objT = new bjc1(mqo1.B(linkedHashMap));
                x340Var.s0(objT);
            }
            e(c380Var, (bjc1) objT, x340Var, (i3 & 14) | 384);
            qylVar = oyl.a;
        } else {
            x340Var.b0();
        }
        qyl qylVar2 = qylVar;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qm71((byte) 26, i2, c380Var, qylVar2, iu30Var);
        }
    }

    public static final void e(c380 c380Var, bjc1 bjc1Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(967248592);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? x340Var.g(c380Var) : x340Var.i(c380Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? x340Var.g(bjc1Var) : x340Var.i(bjc1Var) ? 32 : 16;
        }
        int i4 = i2 & 384;
        oyl oylVar = oyl.a;
        if (i4 == 0) {
            i3 |= x340Var.i(oylVar) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            mno1.c(oylVar, apo.r(333451901, new sdb1(c380Var, bjc1Var, (byte) 6), x340Var), x340Var, ((i3 >> 6) & 14) | 48, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(c380Var, bjc1Var, i2);
        }
    }

    public static final tzg1 f() {
        return new tzg1(x0y.Y0, x0y.Z0);
    }

    public static GradientDrawable g(Context context, int i2) {
        return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{vno1.j(0.4f, i2), foo1.t(context, R.attr.windowBackground)});
    }

    public static final o961 h(q8n q8nVar, ggh gghVar, clo cloVar) {
        bpb1 bpb1VarB = gio1.b(w7x.a);
        h961 h961Var = (h961) gghVar.invoke(d5p1.h(bpb1VarB));
        return new o961(new jha(new zsc(new ldz0(1, (byte) 22), new q961(h961Var, (byte) 0), q8nVar, yda.d), new myq0(new l5v0(h961Var, (byte) 14), new l451(h961Var, (byte) 14), (byte) 13), q8nVar), bpb1VarB, cloVar);
    }

    public static adn i(zcn zcnVar) {
        cqz0 cqz0Var = dqz0.a;
        String str = zcnVar.a;
        List list = zcnVar.b;
        return new adn(str, zcnVar.d, list, zcnVar.c, (yy30) null, (mu91) null, (zhd) null, 0, 0, 0, 0, (String) null, (String) null, (ArrayList) null, false, o7h.d1(p7h.R(list, cqz0Var), 10), 0, 98288);
    }

    public static zzq0 j(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        cua cuaVar = cbx.b(b0kVar).f;
        return new zzq0(6.0f, 6.0f, 6.0f, 6.0f);
    }

    public static df41 k() {
        return xtb0.y;
    }

    public static cr31 l(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        cua cuaVar = cbx.b(b0kVar).f;
        return er31.b(6.0f);
    }

    public static j1p0 m(d1p0 d1p0Var, CompletableFromAction completableFromAction, int i2) {
        boolean z = (i2 & 2) == 0;
        if ((i2 & 8) != 0) {
            completableFromAction = CompletableEmpty.a;
        }
        return new j1p0(d1p0Var, z, completableFromAction);
    }

    public static final jge n(mr20 mr20Var, jge jgeVar, iu30 iu30Var) {
        return hu20.e(mr20Var, new qd0((lnm) null, jgeVar, iu30Var, (byte) 18));
    }

    public static final Uri o(j2i1 j2i1Var) {
        return Uri.parse(j2i1Var.a);
    }

    public static final RuntimeException p(yyq yyqVar) {
        if (!(yyqVar instanceof uyq)) {
            return new RuntimeException(yyqVar.getMessage());
        }
        uyq uyqVar = (uyq) yyqVar;
        RuntimeException runtimeException = new RuntimeException(uyqVar.getMessage());
        Iterator it = uyqVar.a.iterator();
        while (it.hasNext()) {
            j2h1.h(runtimeException, p((yyq) it.next()));
        }
        return runtimeException;
    }

    public static final rxh1 q(int i2) {
        int iC = l1d.C(i2);
        if (iC == 0) {
            return rxh1.b;
        }
        if (iC == 1) {
            return rxh1.c;
        }
        if (iC == 2) {
            return rxh1.d;
        }
        eg.o();
        return null;
    }

    public static void r(int i2, int i3) {
        String strQ;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strQ = ioo1.Q("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    hhg1.n(f4i1.c(i3, "negative size: "));
                    return;
                }
                strQ = ioo1.Q("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strQ);
        }
    }

    public static void s(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            eg.g(u(i2, i3, "index"));
        }
    }

    public static void t(int i2, int i3, int i4) {
        String strU;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                strU = u(i2, i4, "start index");
            } else {
                strU = (i3 < 0 || i3 > i4) ? u(i3, i4, "end index") : ioo1.Q("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strU);
        }
    }

    public static String u(int i2, int i3, String str) {
        if (i2 < 0) {
            return ioo1.Q("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return ioo1.Q("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        hhg1.n(f4i1.c(i3, "negative size: "));
        return null;
    }
}
