package p;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class m3b {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        ytw0 ytw0Var = jfv.b;
        a = fdg1.k0(5000, ngv.d);
    }

    public static final void a(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1651894316);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | 48 | (b0kVar3.i(function0) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            gbx gbxVar = new gbx(z50.c, function0);
            nex nexVar = new nex(6);
            lex lexVarZ = yoo1.z(b0kVar3);
            zzq0 zzq0VarH = h(b0kVar3);
            j2i j2iVarR = apo.r(-363039887, new j3b(str, (byte) 0), b0kVar3);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            poo1.e(gbxVar, nexVar, lexVarZ, qim0Var3, 0, (String) null, (max) null, (vu30) null, (vu30) null, (idn0) null, (ga80) null, false, zzq0VarH, j2iVarR, b0kVar2, 3072, 3072, 4080);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, qim0Var2, function0, i, (byte) 4);
        }
    }

    public static final void b(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1295010979);
        int i2 = i | 6 | (b0kVar3.i(function0) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(b0kVar3, 2131952750);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            pex pexVar = pex.b;
            lex lexVarZ = yoo1.z(b0kVar3);
            zzq0 zzq0VarH = h(b0kVar3);
            j2i j2iVar = j9i.e;
            j2i j2iVarR = apo.r(523466360, new j3b(strO0, (byte) 1), b0kVar3);
            qim0Var2 = nim0.a;
            b0kVar2 = b0kVar3;
            poo1.e(gbxVar, pexVar, lexVarZ, qim0Var2, 0, (String) null, (max) null, j2iVar, (vu30) null, (idn0) null, (ga80) null, false, zzq0VarH, j2iVarR, b0kVar2, 12585984, 3072, 3952);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(qim0Var2, function0, i, (byte) 7);
        }
    }

    public static final void c(sob1 sob1Var, yb20 yb20Var, boolean z, String str, boolean z2, ic9 ic9Var, iu30 iu30Var, Function0 function0, Function0 function1, vu30 vu30Var, iu30 iu30Var2, qim0 qim0Var, b0k b0kVar, int i) {
        sob1 sob1Var2;
        b0k b0kVar2;
        qim0 qim0Var2;
        Object next;
        int i2;
        m4c m4cVar = fkj0.X;
        c380 c380Var = yb20Var.a;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1119127788);
        int i3 = i | (b0kVar3.e(sob1Var.ordinal()) ? 4 : 2) | (b0kVar3.i(yb20Var) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.g(str) ? 2048 : 1024) | (b0kVar3.h(z2) ? 16384 : 8192) | (b0kVar3.g(ic9Var) ? 131072 : 65536) | (b0kVar3.i(iu30Var) ? 1048576 : 524288) | (b0kVar3.i(function0) ? 8388608 : 4194304) | (b0kVar3.i(function1) ? 67108864 : 33554432) | (b0kVar3.i(vu30Var) ? 536870912 : 268435456);
        int i4 = (b0kVar3.i(iu30Var2) ? (char) 4 : (char) 2) | '0';
        if (b0kVar3.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            int i5 = i3 & 896;
            boolean zG = b0kVar3.g(yb20Var) | ((i3 & 7168) == 2048) | (i5 == 256);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                if (z) {
                    Iterator it = c380Var.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((ea61) next).a.equals(str));
                    objT = (ea61) next;
                } else {
                    objT = null;
                }
                b0kVar3.s0(objT);
            }
            ea61 ea61Var = (ea61) objT;
            boolean zG2 = b0kVar3.g(yb20Var) | b0kVar3.g(ea61Var);
            Object objT2 = b0kVar3.T();
            if (zG2 || objT2 == m4cVar) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : c380Var) {
                    ea61 ea61Var2 = (ea61) obj;
                    int i6 = i3;
                    if (ea61Var2.d == 3) {
                        if (!ea61Var2.a.equals(ea61Var != null ? ea61Var.a : null)) {
                            arrayList.add(obj);
                        }
                    }
                    i3 = i6;
                }
                i2 = i3;
                objT2 = mqo1.A(arrayList);
                b0kVar3.s0(objT2);
            } else {
                i2 = i3;
            }
            c380 c380Var2 = (c380) objT2;
            int i7 = i2 & 458752;
            boolean z3 = i7 == 131072;
            Object objT3 = b0kVar3.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new kk(ic9Var, (lnm) null, (byte) 26);
                b0kVar3.s0(objT3);
            }
            qxd0.t(rih1.a, b0kVar3, (vu30) objT3);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar3, nim0Var);
            hzj.A.getClass();
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
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            xtb0 xtb0VarA = aub0.a(0, b0kVar3, 3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(16.0f, 8.0f, 16.0f, 8.0f);
            boolean zI = ((i2 & 57344) == 16384) | (i5 == 256) | (i7 == 131072) | ((i2 & 234881024) == 67108864) | ((i2 & 3670016) == 1048576) | b0kVar3.i(ea61Var) | ((i2 & 14) == 4) | b0kVar3.i(yb20Var) | ((i2 & 29360128) == 8388608) | b0kVar3.i(c380Var2) | ((i4 & 14) == 4) | ((i2 & 1879048192) == 536870912);
            Object objT4 = b0kVar3.T();
            if (zI || objT4 == m4cVar) {
                k3b k3bVar = new k3b(z, sob1Var, ea61Var, yb20Var, c380Var2, ic9Var, iu30Var2, vu30Var, z2, function1, iu30Var, function0);
                b0kVar3.s0(k3bVar);
                objT4 = k3bVar;
            }
            b0kVar2 = b0kVar3;
            too1.b((qim0) null, xtb0VarA, zzq0Var, (iu30) objT4, b0kVar2, 0, 1);
            sob1Var2 = sob1Var;
            if (sob1Var2 == sob1.c) {
                b0kVar2.i0(1979648130);
                cvx cvxVar3 = cbx.b(b0kVar2).b;
                cvx cvxVar4 = cbx.b(b0kVar2).b;
                e(uyn1.y(nim0Var, 16.0f, 8.0f), b0kVar2, 0);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1979873004);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
            qim0Var2 = nim0Var;
        } else {
            sob1Var2 = sob1Var;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new l3b(sob1Var2, yb20Var, z, str, z2, ic9Var, iu30Var, function0, function1, vu30Var, iu30Var2, qim0Var2, i);
        }
    }

    public static final void d(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-567330022);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | 48 | (b0kVar3.i(function0) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            gbx gbxVar = new gbx(z50.c, function0);
            pex pexVar = pex.b;
            lex lexVarZ = yoo1.z(b0kVar3);
            zzq0 zzq0VarH = h(b0kVar3);
            j2i j2iVarR = apo.r(1268571679, new j3b(str, (byte) 2), b0kVar3);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            poo1.e(gbxVar, pexVar, lexVarZ, qim0Var3, 0, (String) null, (max) null, (vu30) null, (vu30) null, (idn0) null, (ga80) null, false, zzq0VarH, j2iVarR, b0kVar2, 3072, 3072, 4080);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, qim0Var2, function0, i, (byte) 5);
        }
    }

    public static final void e(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1740861368);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String[] stringArray = ((Resources) x340Var.k(AndroidCompositionLocals_androidKt.c)).getStringArray(2130903045);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(0, x340Var);
            }
            err0 err0Var = (hdn0) objT;
            boolean zI = x340Var.i(err0Var) | x340Var.i(stringArray);
            Object objT2 = x340Var.T();
            lnm lnmVar = null;
            if (zI || objT2 == m4cVar) {
                objT2 = new w7a(stringArray, err0Var, lnmVar, (byte) 13);
                x340Var.s0(objT2);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT2);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            uwo1.e(cwl1.o0(x340Var, 2131952752), (qim0) null, cbx.d(x340Var).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2042);
            uwo1.e(stringArray[err0Var.s()], (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var, i, (byte) 15);
        }
    }

    public static final void f(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1470538878);
        int i2 = i | (b0kVar3.h(z) ? 4 : 2) | 48 | (b0kVar3.i(function0) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            nex nexVar = new nex(6);
            boolean z2 = false;
            lex lexVarZ = yoo1.z(b0kVar3);
            zzq0 zzq0VarH = h(b0kVar3);
            if ((i2 & 896) == 256) {
                z2 = true;
            }
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new vj0(function0, (byte) 5);
                b0kVar3.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            poo1.g(z, (iu30) objT, nexVar, lexVarZ, qim0Var3, 0, (qex) null, (String) null, (max) null, j9i.c, (vu30) null, (idn0) null, (ga80) null, false, zzq0VarH, j9i.d, b0kVar2, (i2 & 14) | 805330944, 196608, 15840);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new le3(z, qim0Var2, function0, i, (byte) 3);
        }
    }

    public static final void g(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1264135662);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = cu9.X;
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            pex pexVar = pex.b;
            lex lexVarZ = yoo1.z(x340Var);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cr31 cr31Var = er31.a;
            qim0 qim0Var3 = nim0.a;
            poo1.e(gbxVar, pexVar, lexVarZ, cwl1.l0(qim0Var3, jA, cr31Var, 12), 0, (String) null, (max) null, (vu30) null, (vu30) null, (idn0) null, (ga80) null, false, h(x340Var), j9i.f, x340Var, 0, 3072, 4080);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var2, i, (byte) 16);
        }
    }

    public static final zzq0 h(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(b0kVar).b;
        return uyn1.h(2, 12.0f, 0.0f);
    }

    public static final int i(yb20 yb20Var, String str) {
        Iterator it = yb20Var.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((ea61) it.next()).a.equals(str)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
