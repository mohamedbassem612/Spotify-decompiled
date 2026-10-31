package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class o6i1 {
    public static final cr31 a = er31.b(4.0f);

    public static final void a(String str, String str2, b0k b0kVar, int i) {
        String str3;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2111800091);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = str == null || str.length() == 0;
            boolean z3 = str2 == null || str2.length() == 0;
            if (z2 && z3) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new b4((byte) 23, i, str, str2);
                    return;
                }
                return;
            }
            fra fraVar = een.N0;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = osh1.S0;
                x340Var.s0(objT);
            }
            wnb0 wnb0Var = nim0.a;
            qim0 qim0VarB = s161.b(wnb0Var, false, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            if (z2) {
                z = false;
                x340Var.i0(1379508451);
                x340Var.r(false);
            } else {
                x340Var.i0(1379239185);
                zic0 zic0Var = new zic0(1);
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).j;
                long j = cbx.a(x340Var).b.b;
                if (!z3) {
                    wnb0Var = new wnb0(1.0f, false);
                }
                uwo1.e(str, wnb0Var, lee1Var, j, (a0e1) null, (iu30) null, 2, false, zic0Var, 0, (qx8) null, x340Var, i2 & 14, 0, 1712);
                z = false;
                x340Var.r(false);
            }
            if (z2 || z3) {
                x340Var.i0(1379693955);
                x340Var.r(z);
            } else {
                x340Var.i0(1379554610);
                uwr uwrVar2 = cbx.a;
                uwo1.e(" • ", (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 6, 0, 2034);
                z = false;
                x340Var.r(false);
            }
            if (z3) {
                boolean z4 = z;
                str3 = str2;
                x340Var.i0(1379920131);
                x340Var.r(z4);
            } else {
                x340Var.i0(1379731589);
                zic0 zic0Var2 = new zic0(1);
                uwr uwrVar3 = cbx.a;
                str3 = str2;
                uwo1.e(str3, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 2, false, zic0Var2, 0, (qx8) null, x340Var, (i2 >> 3) & 14, 0, 1714);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            str3 = str2;
            x340Var.b0();
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new b4((byte) 24, i, str, str3);
        }
    }

    public static final void b(String str, boolean z, String str2, int i, Function0 function0, j2i j2iVar, Function0 function1, qim0 qim0Var, String str3, String str4, String str5, String str6, b0k b0kVar, int i2) {
        String str7;
        j2i j2iVar2;
        qim0 qim0Var2;
        boolean z2 = z;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-721930117);
        int i3 = (x340Var.g(str4) ? 536870912 : 268435456) | i2 | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | (x340Var.i(function1) ? 1048576 : 524288) | 12582912 | (x340Var.g(str3) ? 67108864 : 33554432);
        if (x340Var.Y(i3 & 1, ((306783379 & i3) == 306783378 && (((x340Var.g(str5) ? (char) 4 : (char) 2) | (x340Var.g(str6) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            String strK = zko1.k(z2, str, str2, str6, str3, x340Var, 0);
            str7 = str2;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("user-activity-row-test-tag", u291.f(qim0Var3, 1.0f));
            boolean zG = x340Var.g(strK);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                z2 = z2;
                objT = new ysf1(strK, (byte) 17);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarN, false, (iu30) objT);
            uvx uvxVar = new uvx(null, 4, null, null, 27);
            String strO0 = cwl1.o0(x340Var, 2131963537);
            boolean z3 = (i3 & 57344) == 16384;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new sah1(function0, (byte) 6);
                x340Var.s0(objT2);
            }
            Function0 function2 = (Function0) objT2;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                j2iVar2 = j2iVar;
                qim0Var2 = qim0Var3;
                jto1.b(qim0VarB, uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO0), function2), (gbx) null, (xu30) null, apo.r(-1265081678, new dba1(str4, (byte) 11), x340Var), apo.r(-448988366, new ay00(z2, str5, str3, (byte) 3), x340Var), apo.r(-370867277, new qvh(i, str7, (byte) 7), x340Var), apo.r(-292746188, new n6i1(j2iVar2, function1, (byte) 0), x340Var), (xu30) null, (xu30) null, apo.r(-58382921, new c2(z2, str, (byte) 10), x340Var), x340Var, 805306432, 197046, 25020);
            }
        } else {
            str7 = str2;
            j2iVar2 = j2iVar;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rpr(str, z2, str7, i, function0, j2iVar2, function1, qim0Var2, str3, str4, str5, str6, i2);
        }
    }

    public static final void c(int i, Function0 function0, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(92984317);
        int i2 = (b0kVar3.i(function0) ? 32 : 16) | i | 384;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(b0kVar3).a.b.a();
            zov0 zov0Var = cbx.b(b0kVar3).g;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(u291.f(qim0Var3, 1.0f), new uvx(null, 4, null, null, 27), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, apo.r(-453157580, new rvh((byte) 15, jA), b0kVar3), apo.r(1392932276, new rvh((byte) 16, jA), b0kVar3), apo.r(124262197, new rvh((byte) 17, jA), b0kVar3), apo.r(-1144407882, new n6i1(j2iVar, function0, (byte) 1), b0kVar3), (xu30) null, (xu30) null, apo.r(-655450823, new rvh((byte) 18, jA), b0kVar3), b0kVar2, 805306432, 197046, 25084);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wpg1(j2iVar, function0, qim0Var2, i);
        }
    }
}
