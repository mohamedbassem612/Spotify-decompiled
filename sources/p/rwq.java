package p;

import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class rwq {
    public static final j2i a = new j2i(-1571120048, new yfi(), false);
    public static final j2i b = new j2i(-1455401925, new dh((byte) 4), false);
    public static b180 c;
    public static b180 d;

    public static final void a(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        int i2;
        int i3;
        boolean z;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1888264589);
        int i4 = 4;
        int i5 = (b0kVar3.i(function0) ? 4 : 2) | i | 48;
        boolean z2 = false;
        if (b0kVar3.Y(i5 & 1, (i5 & 19) != 18)) {
            f65 f65Var = (f65) b0kVar3.k(t4k.s);
            String strO0 = cwl1.o0(b0kVar3, 2131952412);
            String strO1 = cwl1.o0(b0kVar3, 2131952413);
            String strN0 = cwl1.n0(2131952411, new Object[]{"__LEARN__", "__USAGE_LIMITS__"}, b0kVar3);
            b0kVar3.i0(2146086304);
            ye5 ye5Var = new ye5();
            b0kVar3.i0(2146092438);
            int length = 0;
            while (length < strN0.length()) {
                int iW0 = ihc1.w0(strN0, "__LEARN__", length, z2, i4);
                Integer numValueOf = Integer.valueOf(iW0);
                if (iW0 < 0) {
                    numValueOf = null;
                }
                int iIntValue = numValueOf != null ? numValueOf.intValue() : Integer.MAX_VALUE;
                int iW1 = ihc1.w0(strN0, "__USAGE_LIMITS__", length, z2, i4);
                Integer numValueOf2 = iW1 >= 0 ? Integer.valueOf(iW1) : null;
                int iMin = Math.min(iIntValue, numValueOf2 != null ? numValueOf2.intValue() : Integer.MAX_VALUE);
                if (iMin == Integer.MAX_VALUE) {
                    b0kVar3.i0(-388584344);
                    b0kVar3.r(false);
                    ye5Var.g(strN0.substring(length));
                    length = strN0.length();
                    i4 = 4;
                    z2 = false;
                } else {
                    b0kVar3.i0(-388477053);
                    if (iMin > length) {
                        ye5Var.g(strN0.substring(length, iMin));
                    }
                    if (iMin == iIntValue) {
                        b0kVar3.i0(-388355502);
                        boolean zI = b0kVar3.i(f65Var);
                        Object objT = b0kVar3.T();
                        if (zI || objT == m4cVar) {
                            z = false;
                            objT = new j03(f65Var, (byte) 0);
                            b0kVar3.s0(objT);
                        } else {
                            z = false;
                        }
                        vhg.c(ye5Var, strO0, "https://www.spotify.com/legal/privacy-policy", vhg.a, (iu30) objT);
                        i3 = iMin + 9;
                        b0kVar3.r(z);
                        i2 = 4;
                    } else {
                        b0kVar3.i0(-388205338);
                        i2 = 4;
                        boolean z3 = (i5 & 14) == 4;
                        Object objT2 = b0kVar3.T();
                        if (z3 || objT2 == m4cVar) {
                            objT2 = new vj0(function0, (byte) 1);
                            b0kVar3.s0(objT2);
                        }
                        vhg.a(ye5Var, strO1, "usage_limits", vhg.a, (iu30) objT2);
                        i3 = iMin + 16;
                        z = false;
                        b0kVar3.r(false);
                    }
                    b0kVar3.r(z);
                    z2 = z;
                    length = i3;
                    i4 = i2;
                }
            }
            boolean z4 = z2;
            b0kVar3.r(z4);
            af5 af5VarP = ye5Var.p();
            b0kVar3.r(z4);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar3).m;
            long j = cbx.a(b0kVar3).b.b;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0Var3 = nim0.a;
            qim0Var2 = qim0Var3;
            b0kVar2 = b0kVar3;
            uwo1.d(af5VarP, j, uyn1.z(16.0f, 0.0f, 2, qim0Var3), lee1Var, null, null, 0, false, null, 0, null, null, b0kVar2, 0, 0, 4080);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(function0, qim0Var2, i, (byte) 3);
        }
    }

    public static final void b(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        Function0 function2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(967830691);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            function2 = function1;
            mqo1.e(function2, null, null, kji.a, kji.b, apo.r(220888545, new bvk(function0, (byte) 21), x340Var), apo.r(1270757760, new bvk(function1, (byte) 22), x340Var), x340Var, ((i2 >> 3) & 14) | 1797120, 6);
        } else {
            function2 = function1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function2, i, (byte) 17);
        }
    }

    public static final void c(int i, String str, String str2, String str3, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1394678515);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.g(str3) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024) | 24576;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarF);
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
            uwr uwrVar = cbx.a;
            uwo1.e(str, null, cbx.d(b0kVar3).f, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, i2 & 14, 0, 2026);
            lee1 lee1Var = cbx.d(b0kVar3).j;
            long j = cbx.a(b0kVar3).b.b;
            cvx cvxVar = cbx.b(b0kVar3).b;
            uwo1.e(str2, uyn1.B(qim0Var3, 0.0f, 12.0f, 0.0f, 0.0f, 13), lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, (i2 >> 3) & 14, 0, 2016);
            b0kVar2 = b0kVar3;
            qim0 qim0VarB = uyn1.B(qim0Var3, 0.0f, cbx.b(b0kVar2).b.a, 0.0f, 0.0f, 13);
            idx idxVar = new idx();
            boolean z = (i2 & 7168) == 2048;
            Object objT = b0kVar2.T();
            if (z || objT == fkj0.X) {
                objT = new j160(function0, (byte) 21);
                b0kVar2.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), idxVar, qim0VarB, null, null, null, null, null, iti.a, null, apo.r(-1542523544, new dz40(str3, (byte) 19), b0kVar2), b0kVar2, 805306368, 48, 1528);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new duh(str, str2, str3, function0, qim0Var2, i, (byte) 2);
        }
    }

    public static final void d(float f, f5v0 f5v0Var, int i, boolean z, tob1 tob1Var, qim0 qim0Var, b0k b0kVar, int i2) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2004285025);
        int i3 = i2 | (x340Var.d(f) ? 4 : 2) | (x340Var.i(f5v0Var) ? 32 : 16) | (x340Var.e(i) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.g(tob1Var) ? 16384 : 8192) | (x340Var.g(qim0Var) ? 131072 : 65536);
        if (x340Var.Y(i3 & 1, (i3 & 74899) != 74898)) {
            float fM0 = ((wat) x340Var.k(t4k.h)).M0(i);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            fra fraVar = een.N0;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            boolean z2 = (i3 & 57344) == 16384;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new ctd1(tob1Var, (byte) 15);
                x340Var.s0(objT);
            }
            qim0 qim0VarC = i541.C(qim0VarF, (iu30) objT);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v7f1.g;
                x340Var.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarC, true, (iu30) objT2);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 48);
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
            vnr0 vnr0VarQ = omo1.q((vnr0) f5v0Var.a.invoke(x340Var, 0), cbx.d(x340Var).c, cbx.d(x340Var).b, x340Var);
            nim0 nim0Var = nim0.a;
            qgo1.f(vnr0VarQ, u291.x(fM0, 0.0f, 2, nim0Var), new a0e1(3), 1, false, null, x340Var, 3080, 48);
            if (z) {
                x340Var.i0(805127578);
                yk4 yk4Var = new yk4(f5v0Var.b.a);
                cbx.a.getClass();
                ecx ecxVarA = uwr.a();
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = v7f1.h;
                    x340Var.s0(objT3);
                }
                eso1.f(yk4Var, isl.a, s161.a(nim0Var, (iu30) objT3), new p3v(f), (zvx) null, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, x340Var, ((i3 << 9) & 7168) | 24624, 448);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(805415103);
                x340Var.r(false);
            }
            qgo1.f((vnr0) f5v0Var.c.invoke(x340Var, 0), new wnb0(1.0f, true), new a0e1(5), 2, false, null, x340Var, 3080, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m140(f, f5v0Var, i, z, tob1Var, qim0Var, i2);
        }
    }

    public static final void e(cce cceVar, dbp dbpVar, z0i z0iVar, n1i n1iVar, qim0 qim0Var, b0k b0kVar, int i) {
        cce cceVar2;
        int i2;
        z0i z0iVar2 = z0iVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(46419795);
        if ((i & 6) == 0) {
            cceVar2 = cceVar;
            i2 = (x340Var.i(cceVar2) ? 4 : 2) | i;
        } else {
            cceVar2 = cceVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(dbpVar) : x340Var.i(dbpVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(z0iVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.e(n1iVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(qim0Var) ? 16384 : 8192;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                switch (dbpVar.a) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        hbp hbpVar = (hbp) dbpVar.b.c;
                        objT = new y0i((ebp) hbpVar.e2.get(), new t7o0((q9l1) hbpVar.g.get(), (byte) 4));
                        break;
                    default:
                        mxp mxpVar = (mxp) dbpVar.b.c;
                        objT = new y0i((ebp) mxpVar.e2.get(), new t7o0((q9l1) mxpVar.g.get(), (byte) 4));
                        break;
                }
                x340Var.s0(objT);
            }
            y0i y0iVar = (y0i) objT;
            LinkedHashMap linkedHashMap = y0iVar.c;
            LinkedHashMap linkedHashMap2 = y0iVar.c;
            t7o0 t7o0Var = y0iVar.b;
            ebp ebpVar = y0iVar.a;
            Object obj = linkedHashMap.get(z0iVar2);
            if (obj == null) {
                xm90 xm90VarA = ebpVar.a(t7o0Var, (z0i) null, (n2u0) null);
                linkedHashMap.put(z0iVar2, xm90VarA);
                obj = xm90VarA;
            }
            cceVar2.a(((i3 >> 6) & 896) | 8 | ((i3 >> 3) & 112) | ((i3 << 9) & 7168), ((xm90) obj).d, z0iVar2, x340Var, qim0Var);
            z0iVar2 = z0iVar2;
            for (z0i z0iVar3 : dm61.u0(z0iVar2, linkedHashMap2.keySet())) {
                xm90 xm90Var = (xm90) linkedHashMap2.get(z0iVar3);
                if (xm90Var != null) {
                    xm90Var.a(n1i.a);
                }
                w0h1.k(linkedHashMap2).remove(z0iVar3);
            }
            y0iVar.d = z0iVar2;
            n1i n1iVar2 = y0iVar.e;
            Object objA = linkedHashMap2.get(z0iVar2);
            if (objA == null) {
                objA = ebpVar.a(t7o0Var, (z0i) null, (n2u0) null);
                linkedHashMap2.put(z0iVar2, objA);
            }
            ((xm90) objA).a(n1iVar2);
            boolean zI = x340Var.i(y0iVar) | ((i3 & 7168) == 2048);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new p2z0(y0iVar, n1iVar, (lnm) null, (byte) 21);
                x340Var.s0(objT2);
            }
            qxd0.t(n1iVar, x340Var, (vu30) objT2);
            boolean zI2 = x340Var.i(y0iVar) | x340Var.i(z0iVar2);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new hf31(y0iVar, z0iVar2, (byte) 4);
                x340Var.s0(objT3);
            }
            qxd0.i(z0iVar2, (iu30) objT3, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0(cceVar, dbpVar, z0iVar2, n1iVar, qim0Var, i, (byte) 28);
        }
    }

    public static final void f(yqg yqgVar, float f, int i, int i2, ycu0 ycu0Var, int i3, float f2, pmg1 pmg1Var, boolean z, qim0 qim0Var, float f3, b0k b0kVar, int i4) {
        qim0 qim0Var2;
        ven0 ven0Var;
        long j;
        boolean z2;
        ycu0 ycu0Var2;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1045783266);
        int i5 = i4 | (x340Var.g(yqgVar) ? 32 : 16) | (x340Var.d(f) ? 256 : 128) | (x340Var.e(i) ? 2048 : 1024) | (x340Var.e(i2) ? 16384 : 8192) | (x340Var.g(ycu0Var) ? 131072 : 65536) | (x340Var.e(i3) ? 1048576 : 524288) | (x340Var.d(f2) ? 8388608 : 4194304) | (x340Var.g(pmg1Var) ? 67108864 : 33554432) | (x340Var.h(z) ? 536870912 : 268435456);
        int i6 = 6 | (x340Var.d(f3) ? ' ' : (char) 16);
        if (x340Var.Y(i5 & 1, ((i5 & 306783377) == 306783376 && (i6 & 19) == 18) ? false : true)) {
            uwr uwrVar = cbx.a;
            long j2 = cbx.a(x340Var).b.c;
            float f4 = i * f;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = p3d1.m(0L, x340Var);
            }
            ven0 ven0Var2 = (frr0) objT;
            boolean z3 = ((i6 & 112) == 32) | ((458752 & i5) == 131072) | ((i5 & 112) == 32);
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                ven0Var = ven0Var2;
                j = j2;
                z2 = false;
                ycu0Var2 = ycu0Var;
                wj40 wj40Var = new wj40(ycu0Var2, yqgVar, f3, ven0Var, (lnm) null, (byte) 5);
                x340Var.s0(wj40Var);
                objT2 = wj40Var;
            } else {
                ycu0Var2 = ycu0Var;
                j = j2;
                ven0Var = ven0Var2;
                z2 = false;
            }
            qxd0.t(ycu0Var2, x340Var, (vu30) objT2);
            qim0Var2 = nim0.a;
            qim0 qim0VarH = u291.h(u291.f(qim0Var2, 1.0f), f2);
            boolean zD = ((57344 & 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0182: ARITH (r3v14 'zD' boolean) = (wrap boolean:0x0178: ARITH (wrap boolean:0x0173: ARITH (wrap boolean:0x016c: ARITH (wrap boolean:0x015f: ARITH (wrap boolean:0x0152: ARITH (wrap boolean:?: TERNARY null = ((wrap int:0x0148: ARITH (57344 int) & (r21v0 int) A[WRAPPED] (LINE:329)) == (16384 int)) ? true : (r20v1 'z2' boolean)) | (wrap boolean:?: TERNARY null = ((wrap int:0x013b: ARITH (1879048192 int) & (r21v0 int) A[WRAPPED] (LINE:316)) == (536870912 int)) ? true : (r20v1 'z2' boolean)) A[DONT_WRAP, WRAPPED] (LINE:339)) | (wrap boolean:?: TERNARY null = ((wrap int:0x0155: ARITH (234881024 int) & (r21v0 int) A[WRAPPED] (LINE:342)) == (67108864 int)) ? true : (r20v1 'z2' boolean)) A[DONT_WRAP, WRAPPED] (LINE:352)) | (wrap boolean:?: TERNARY null = ((wrap int:0x0162: ARITH (3670016 int) & (r21v0 int) A[WRAPPED] (LINE:355)) == (1048576 int)) ? true : (r20v1 'z2' boolean)) A[DONT_WRAP, WRAPPED] (LINE:365)) | (wrap boolean:0x016f: INVOKE (r12v1 'x340Var' p.x340), (r7v9 'f4' float) VIRTUAL call: p.x340.d(float):boolean A[WRAPPED] (LINE:368)) A[DONT_WRAP, WRAPPED] (LINE:372)) | (wrap boolean:0x0174: INVOKE (r12v1 'x340Var' p.x340), (r8v3 'j' long) VIRTUAL call: p.x340.f(long):boolean A[WRAPPED] (LINE:373)) A[DONT_WRAP, WRAPPED] (LINE:377)) | (wrap boolean:?: TERNARY null = ((wrap int:0x0179: ARITH (r0v12 'i5' int) & (896 int) A[WRAPPED] (LINE:378)) != (256 int)) ? (r20v1 'z2' boolean) : true) A[DECLARE_VAR] (LINE:387) in method: p.rwq.f(p.yqg, float, int, int, p.ycu0, int, float, p.pmg1, boolean, p.qim0, float, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 int
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 472
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.rwq.f(p.yqg, float, int, int, p.ycu0, int, float, p.pmg1, boolean, p.qim0, float, p.b0k, int):void");
        }

        public static final ven0 g(mr20 mr20Var, Object obj, o8n o8nVar, b0k b0kVar, int i, int i2) {
            if ((i2 & 2) != 0) {
                o8nVar = o6x.a;
            }
            o8n o8nVar2 = o8nVar;
            x340 x340Var = (x340) b0kVar;
            boolean zI = x340Var.i(o8nVar2) | x340Var.i(mr20Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new q721(o8nVar2, mr20Var, (lnm) null, (byte) 13);
                x340Var.s0(objT);
            }
            return yto.o(obj, mr20Var, o8nVar2, (vu30) objT, x340Var, ((i >> 3) & 14) | ((i << 3) & 112) | (i & 896));
        }

        public static final ven0 h(zob1 zob1Var, b0k b0kVar, int i) {
            return g(zob1Var, zob1Var.getValue(), o6x.a, b0kVar, (i & 14) | ((i << 3) & 896), 0);
        }

        public static final b180 i() {
            b180 b180Var = d;
            if (b180Var != null) {
                return b180Var;
            }
            a180 a180Var = new a180("Encore.Vector.VideoVertical24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = bui1.a;
            long j = u7h.b;
            n6a1 n6a1Var = new n6a1(j);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new f9s0(15.196f, 12.0f));
            arrayList.add(new e9s0(10.0f, 9.0f));
            arrayList.add(new r9s0(6.0f));
            arrayList.add(b9s0.c);
            a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
            n6a1 n6a1Var2 = new n6a1(j);
            cwh0 cwh0VarG = lf51.g(21.0f, 4.0f);
            cwh0VarG.c(3.0f, 3.0f, false, false, -3.0f, -3.0f);
            cwh0VarG.j(6.0f, 1.0f);
            cwh0VarG.c(3.0f, 3.0f, false, false, -3.0f, 3.0f);
            cwh0VarG.v(16.0f);
            cwh0VarG.c(3.0f, 3.0f, false, false, 3.0f, 3.0f);
            cwh0VarG.i(12.0f);
            cwh0VarG.c(3.0f, 3.0f, false, false, 3.0f, -3.0f);
            cwh0VarG.e();
            cwh0VarG.l(18.0f, 3.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
            cwh0VarG.v(16.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
            cwh0VarG.j(6.0f, 21.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
            cwh0VarG.j(5.0f, 4.0f);
            cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
            cwh0VarG.e();
            a180.a(a180Var, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180 b180VarB = a180Var.b();
            d = b180VarB;
            return b180VarB;
        }

        public static final boolean j(hob1 hob1Var) {
            if (!(hob1Var.h instanceof dr00)) {
                return false;
            }
            String str = hob1Var.d;
            Set set = s4b1.f;
            return uic.h(str, new blc0[]{blc0.ti, blc0.ui}) && !hob1Var.J;
        }

        public static final boolean k(int i) {
            return i >= 5;
        }

        public static final boolean l(String str, String str2) {
            Set set = s4b1.f;
            if (uic.h(str, new blc0[]{blc0.ti, blc0.ui})) {
                return uic.h(str2, new blc0[]{blc0.g1, blc0.h1, blc0.j1}) || uic.i(str2, s4b1.g) || uic.g(str2, blc0.Yc);
            }
            return false;
        }

        public static boolean m(bk4 bk4Var) {
            return bk4Var.f();
        }

        public static final boolean n(mey0 mey0Var, er00 er00Var) {
            String str = mey0Var.c;
            if (!(er00Var instanceof dr00) || !u890.j(str, mey0Var.d)) {
                return false;
            }
            Set set = s4b1.f;
            return uic.h(str, new blc0[]{blc0.ti, blc0.ui});
        }

        public static boolean o(bk4 bk4Var) {
            return bk4Var.i();
        }

        public static boolean p(bk4 bk4Var) {
            return bk4Var.j();
        }

        public static final m441 q(Function0 function0) {
            return new m441(new hgo0(function0, (lnm) null));
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
        public static final Object r(sy21 sy21Var) throws HttpException {
            if (!sy21Var.a.Q0) {
                throw new HttpException(sy21Var);
            }
            Object obj = sy21Var.b;
            if (obj != null) {
                return obj;
            }
            eg.m("Required value was null.");
            return null;
        }

        public static final String s(j120 j120Var) {
            int iOrdinal = j120Var.ordinal();
            if (iOrdinal == 0) {
                return "legacy";
            }
            if (iOrdinal == 1) {
                return "no_data";
            }
            eg.o();
            return null;
        }

        public static final Next t(gok gokVar, snk snkVar) {
            if (snkVar instanceof onk) {
                List list = ((onk) snkVar).a;
                return list.isEmpty() ? Next.h(new dok(gokVar.a(), gokVar.b())) : Next.h(new eok(gokVar.a(), list, gokVar.b()));
            }
            if (snkVar.equals(nnk.a)) {
                return Next.h(new dok(gokVar.a(), gokVar.b()));
            }
            if (snkVar instanceof qnk) {
                return Next.a(Collections.singleton(new hmk(((qnk) snkVar).a)));
            }
            if (snkVar instanceof gnk) {
                fbh0 fbh0Var = ((gnk) snkVar).a;
                return Next.a(Collections.singleton(new gmk(fbh0Var.a, fbh0Var.d)));
            }
            if (snkVar instanceof jnk) {
                return Next.a(Collections.singleton(new kmk(((jnk) snkVar).a)));
            }
            if (snkVar instanceof pnk) {
                fbh0 fbh0Var2 = ((pnk) snkVar).a;
                return Next.a(Collections.singleton(new imk(fbh0Var2.a, fbh0Var2.b)));
            }
            if (snkVar instanceof ink) {
                ink inkVar = (ink) snkVar;
                return Next.i(new fok(gokVar.a(), gokVar.b()), f46.S0(new omk[]{new emk(gokVar.a()), new nmk(inkVar.a, inkVar.b)}));
            }
            if (snkVar instanceof hnk) {
                return Next.a(Collections.singleton(new mmk(((hnk) snkVar).a)));
            }
            if (snkVar instanceof lnk) {
                return Next.a(Collections.singleton(new fmk(((lnk) snkVar).a)));
            }
            if (snkVar instanceof rnk) {
                return Next.a(Collections.singleton(new jmk(((rnk) snkVar).a)));
            }
            if (snkVar.equals(mnk.a)) {
                return Next.i(new fok(gokVar.a(), gokVar.b()), Collections.singleton(new emk(gokVar.a())));
            }
            if (snkVar.equals(knk.a)) {
                return !(gokVar instanceof eok) ? Next.j() : Next.a(Collections.singleton(new lmk(((eok) gokVar).a)));
            }
            eg.o();
            return null;
        }

        public static Next u(kak0 kak0Var) {
            List list = kak0Var.Z;
            if (list.size() < 2) {
                return Next.j();
            }
            ruq0 ruq0Var = kak0Var.S0.b;
            return Next.h(kak0.a(kak0Var, new odm0(ruq0Var.a, list, ruq0Var.b), (Boolean) null, wcu0.a, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -81, 1048575));
        }
    }
