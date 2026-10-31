package p;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ucp1 {
    public static owo1 a;
    public static b180 b;
    public static b180 c;

    public static final void a(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-422231268);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = u291.z(qim0Var3, (fra) null, 3);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarB = u291.b(0.0f, 56.0f, 1, qim0VarZ);
            ogx ogxVar = ogx.e;
            cvx cvxVar = cbx.b(x340Var).b;
            boolean z = false;
            zzq0 zzq0Var = new zzq0(8.0f, 8.0f, 8.0f, 8.0f);
            if ((i2 & 112) == 32) {
                z = true;
            }
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new y1(function0, (byte) 21);
                x340Var.s0(objT);
            }
            cwl1.b(qim0VarB, een.h, (hw61) null, ogxVar, zzq0Var, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT), (gbx) null, d5i.a, x340Var, 3120, 48, 1508);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(qim0Var2, function0, i, (byte) 1);
        }
    }

    public static final void b(jxp0 jxp0Var, e6q0 e6q0Var, gf71 gf71Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-997224402);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(jxp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(e6q0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(gf71Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= x340Var.i(function0) ? 16384 : 8192;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(12.0f, 0.0f, 2, qim0Var3);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            d(jxp0Var, gf71Var, e6q0Var, x340Var, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896));
            a((i3 >> 9) & 112, function0, x340Var, null);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0(jxp0Var, e6q0Var, gf71Var, qim0Var2, function0, i, (byte) 4);
        }
    }

    public static final void c(int i, String str, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-184499960);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = yv91.a(new sg6((byte) 1, z));
                x340Var.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).g;
            long j = ((u7h) tob1Var.getValue()).a;
            long j2 = ((vex) zex.a.e).c;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(nim0.a, j2, er31.b(16.0f));
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.y(qim0VarF, 16.0f, 8.0f), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2032);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ltj(z, str, qim0Var, i, (byte) 0);
        }
    }

    public static final void d(jxp0 jxp0Var, gf71 gf71Var, e6q0 e6q0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2095287011);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(jxp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(gf71Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(e6q0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = (xpw) new pdp0(jxp0Var, (byte) 22).invoke();
                x340Var.s0(objT);
            }
            xpw xpwVar = (xpw) objT;
            li71 li71Var = new li71(gf71Var.a.b(), new x5q0(e6q0Var.a, e6q0Var.b, gnt.a, new izn0(e6q0Var.b())), 0, gf71Var.b, gf71Var.c, gf71Var.d, gf71Var.e);
            qim0 qim0VarN = anm1.N("share.sheet.share.onplatform.age.assurance.invite.friends", nim0.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            otw.c(xpwVar, li71Var, (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(jxp0Var, gf71Var, e6q0Var, i, (byte) 7);
        }
    }

    public static final void e(jlv0 jlv0Var, qim0 qim0Var, Function0 function0, Function0 function1, iu30 iu30Var, b0k b0kVar, int i) {
        iu30 iu30Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(874974100);
        int i2 = i | (x340Var.g(jlv0Var) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = hlv0.b;
                x340Var.s0(objT);
            }
            iu30 iu30Var3 = (iu30) objT;
            hm5.a(Boolean.valueOf(jlv0Var.b == 1), (qim0) null, (iu30) null, (tl3) null, "", (iu30) null, apo.r(-1920343465, new d34(function1, iu30Var3, qim0Var, function0, (byte) 6), x340Var), x340Var, 1597440, 46);
            iu30Var2 = iu30Var3;
        } else {
            x340Var.b0();
            iu30Var2 = iu30Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e9g0((byte) 23, i, jlv0Var, qim0Var, function0, function1, iu30Var2);
        }
    }

    public static final void f(mr20 mr20Var, boolean z, Function0 function0, j2i j2iVar, b0k b0kVar, int i) {
        j2i j2iVar2;
        Boolean boolValueOf;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-318558425);
        int i2 = i | (x340Var.i(mr20Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ven0 ven0VarJ = f4p1.j(mr20Var, (Object) null, (iac0) null, x340Var, (i2 & 14) | 48, 14);
            if (z) {
                k1r k1rVar = (k1r) ven0VarJ.getValue();
                boolValueOf = k1rVar != null ? Boolean.valueOf(hr21.a(true, k1rVar)) : null;
            } else {
                boolValueOf = Boolean.FALSE;
            }
            boolean zG = x340Var.g(boolValueOf) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new p2z0(boolValueOf, function0, (lnm) null, (byte) 18);
                x340Var.s0(objT);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT);
            if (u890.j(boolValueOf, Boolean.TRUE)) {
                x340Var.i0(-1191953712);
                j2iVar2 = j2iVar;
                j2iVar2.invoke(x340Var, 6);
            } else {
                j2iVar2 = j2iVar;
                x340Var.i0(1704149243);
            }
            x340Var.r(false);
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90((Object) mr20Var, z, (Object) function0, (Object) j2iVar2, i, (byte) 27);
        }
    }

    public static final void g(y5q0 y5q0Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-594160506);
        int i2 = (x340Var.g(y5q0Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            c4p1.k(y5q0Var, z, anm1.N("single.user", qim0Var), apo.r(691403640, new dj71(y5q0Var, (byte) 20), x340Var), x340Var, (i2 & 112) | (i2 & 14) | 3072);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r7e0((Object) y5q0Var, z, (Object) qim0Var, i, (byte) 26);
        }
    }

    public static luk0 h(Integer num, r6h1 r6h1Var) {
        return new luk0(num, r6h1Var);
    }

    public static yue0 i() {
        yue0 yue0Var = yue0.c;
        if (yue0Var != null) {
            return yue0Var;
        }
        yue0 yue0Var2 = new yue0();
        yue0.c = yue0Var2;
        return yue0Var2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final fbp1 j(int i, String str) {
        swp0 swp0Var = swp0.c;
        if (str != null) {
            switch (str.hashCode()) {
                case -1309235419:
                    if (str.equals("expired")) {
                        return qwp0.c;
                    }
                    break;
                case -1211129254:
                    if (str.equals("downloading")) {
                        return new kwp0(i);
                    }
                    break;
                case -934422706:
                    if (str.equals("resync")) {
                        return uwp0.c;
                    }
                    break;
                case 3521:
                    str.equals("no");
                    return swp0Var;
                case 119527:
                    if (str.equals("yes")) {
                        return iwp0.c;
                    }
                    break;
                case 96784904:
                    if (str.equals("error")) {
                        return mwp0.c;
                    }
                    break;
                case 111293437:
                    if (str.equals("waitingSyncNotAllowed")) {
                        return q(i, 4);
                    }
                    break;
                case 119284121:
                    if (str.equals("waitingOfflineMode")) {
                        return q(i, 2);
                    }
                    break;
                case 1116313165:
                    if (str.equals("waiting")) {
                        return q(i, 1);
                    }
                    break;
                case 1881262700:
                    if (str.equals("waitingNoConnection")) {
                        return q(i, 3);
                    }
                    break;
                case 1987113811:
                    if (str.equals("exceeded")) {
                        return owp0.c;
                    }
                    break;
            }
        }
        return swp0Var;
    }

    public static os80 k() {
        return new os80("android.intent.action.VIEW", (byte) 0);
    }

    public static final a080 l(a080 a080Var, boolean z) {
        if (!z) {
            return a080Var;
        }
        gbc gbcVarD1 = a080Var.d1();
        return (gbcVarD1.i0(0L, z9r.b) || gbcVarD1.i0(0L, z9r.a)) ? jhc1.g(new ff01(new wj30(a080Var.d1())), a080Var.getFileSystem()) : a080Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object m(hre1 hre1Var, String str, long j, onm onmVar) {
        ire1 ire1Var;
        if (onmVar instanceof ire1) {
            ire1Var = (ire1) onmVar;
            int i = ire1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ire1Var.b = i - Integer.MIN_VALUE;
            } else {
                ire1Var = new ire1(onmVar);
            }
        } else {
            ire1Var = new ire1(onmVar);
        }
        Object objE = ire1Var.a;
        int i2 = ire1Var.b;
        if (i2 == 0) {
            hm5.M(objE);
            List listSingletonList = Collections.singletonList(new vve1(j));
            ire1Var.b = 1;
            objE = hre1Var.e(str, listSingletonList, ire1Var);
            Object obj = d9n.a;
            if (objE == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objE);
        }
        List list = (List) objE;
        if (list != null) {
            return (tve1) o7h.q0(list);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object n(hre1 hre1Var, String str, long j, onm onmVar) {
        jre1 jre1Var;
        if (onmVar instanceof jre1) {
            jre1Var = (jre1) onmVar;
            int i = jre1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jre1Var.b = i - Integer.MIN_VALUE;
            } else {
                jre1Var = new jre1(onmVar);
            }
        } else {
            jre1Var = new jre1(onmVar);
        }
        Object objF = jre1Var.a;
        int i2 = jre1Var.b;
        if (i2 == 0) {
            hm5.M(objF);
            List listSingletonList = Collections.singletonList(new vve1(j));
            jre1Var.b = 1;
            objF = hre1Var.f(str, listSingletonList, jre1Var);
            Object obj = d9n.a;
            if (objF == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        List list = (List) objF;
        if (list != null) {
            return (uve1) o7h.q0(list);
        }
        return null;
    }

    public static final int o(String str) {
        List listQ0 = ihc1.Q0(str, new String[]{"."}, 0, 6);
        if (listQ0.size() != 3) {
            return 0;
        }
        return Integer.parseInt((String) listQ0.get(2)) + (Integer.parseInt((String) listQ0.get(1)) * 100) + (Integer.parseInt((String) listQ0.get(0)) * 10000);
    }

    public static final wkk1 p(xkk1 xkk1Var) {
        up70 up70VarA;
        mq70 mq70Var = xkk1Var.a;
        pp70 pp70Var = mq70Var.b;
        long j = pp70Var != null ? pp70Var.c.a.c : wkk1.g;
        long j2 = pp70Var != null ? pp70Var.b.a.c : wkk1.f;
        long j3 = pp70Var != null ? pp70Var.c.b.a : wkk1.h;
        mq70 mq70Var2 = xkk1Var.b;
        vp70 vp70Var = vp70.c;
        String str = (mq70Var2 == null || (up70VarA = mq70Var2.a(vp70Var)) == null) ? null : up70VarA.a.a;
        up70 up70VarA2 = mq70Var.a(vp70Var);
        return new wkk1(str, up70VarA2 != null ? up70VarA2.a.a : null, z4p1.G(j), z4p1.G(j2), z4p1.G(j3));
    }

    public static fbp1 q(int i, int i2) {
        return i == 100 ? iwp0.c : new wwp0(i2, i);
    }

    public static synchronized ecp1 r(String str) {
        ecp1 ecp1Var;
        kbp1 kbp1Var = new kbp1(str);
        synchronized (ucp1.class) {
            try {
                owo1 owo1Var = a;
                if (owo1Var == null) {
                    owo1Var = new owo1((byte) 2);
                    a = owo1Var;
                }
                ecp1Var = (ecp1) owo1Var.L0(kbp1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return ecp1Var;
        return ecp1Var;
    }
}
