package p;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import com.spotify.mobius.Next;
import com.spotify.searchview.proto.Entity;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class o4o1 {
    public static final Object a = new Object();
    public static Method b;
    public static boolean c;
    public static b180 d;

    public static final void a(iu30 iu30Var, gm31 gm31Var, long j, qim0 qim0Var, b0k b0kVar, int i) {
        iu30 iu30Var2;
        int i2;
        iu30 iu30Var3;
        Function0 function0;
        boolean z;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(192675549);
        if ((i & 6) == 0) {
            iu30Var2 = iu30Var;
            i2 = (x340Var.i(iu30Var2) ? 4 : 2) | i;
        } else {
            iu30Var2 = iu30Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(gm31Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gk31 gk31Var = (gk31) x340Var.k(hk31.a);
            qim0 qim0VarR = d7e.r(0.5625f, u291.v(qim0Var, 192.0f), false);
            qqb qqbVarD = k1u.d(1.0f, j);
            qim0 qim0VarQ = i1p1.q(d1u.F(qim0VarR, qqbVarD.a, qqbVarD.b, er31.b(16.0f)), er31.b(16.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarQ);
            hzj.A.getClass();
            Function0 function1 = null;
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
            if (gk31Var == null) {
                x340Var.i0(1856366813);
                x340Var.r(false);
                iu30Var3 = null;
            } else {
                x340Var.i0(1856366814);
                boolean zI = x340Var.i(gk31Var);
                Object objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    objT = new m4d(gk31Var, (byte) 6);
                    x340Var.s0(objT);
                }
                iu30Var3 = (iu30) objT;
                x340Var.r(false);
            }
            if (gk31Var == null) {
                x340Var.i0(1856441616);
                x340Var.r(false);
                function0 = null;
            } else {
                x340Var.i0(1856441617);
                boolean zI2 = x340Var.i(gk31Var);
                Object objT2 = x340Var.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new tud(gk31Var, (byte) 0);
                    x340Var.s0(objT2);
                }
                function0 = (Function0) objT2;
                x340Var.r(false);
            }
            if (gk31Var == null) {
                x340Var.i0(1856502252);
                x340Var.r(false);
                z = true;
            } else {
                x340Var.i0(1856502253);
                boolean zI3 = x340Var.i(gk31Var);
                Object objT3 = x340Var.T();
                if (zI3 || objT3 == m4cVar) {
                    z = true;
                    objT3 = new tud(gk31Var, (byte) 1);
                    x340Var.s0(objT3);
                } else {
                    z = true;
                }
                function1 = (Function0) objT3;
                x340Var.r(false);
            }
            xto.d(iu30Var2, isl.a, iu30Var3, function0, function1, gm31Var, x340Var, (i2 & 14) | 48 | ((i2 << 15) & 3670016), 4);
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q18(iu30Var, gm31Var, j, qim0Var, i);
        }
    }

    public static final void b(hux huxVar, jsl jslVar, y50 y50Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1068490351);
        int i2 = i | ((i & 8) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 4 : 2) | (b0kVar3.g(jslVar) ? 32 : 16) | (b0kVar3.g(y50Var) ? 256 : 128) | (b0kVar3.i(qim0Var) ? 2048 : 1024) | (b0kVar3.i(function0) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            b0kVar2 = b0kVar3;
            wro1.h(new gbx(y50Var, function0), new hdx(0, (vu30) null, (vu30) null, (vu30) null, (hw61) null, 31), qim0Var, (max) null, yla.s(b0kVar3).a(), (vzq0) null, false, (idn0) null, (ga80) null, apo.r(-37311240, new jj50(huxVar, jslVar, (byte) 4), b0kVar3), b0kVar2, (i2 >> 3) & 896, 6, 984);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ik2(huxVar, jslVar, y50Var, qim0Var, function0, i);
        }
    }

    public static final void c(dab0 dab0Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1219940507);
        int i2 = i | (b0kVar3.g(dab0Var) ? 4 : 2) | 48 | (b0kVar3.i(iu30Var) ? 256 : 128);
        boolean z = false;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            af afVarA = ef.c(b0kVar3).a();
            if (afVarA.compareTo(af.e) >= 0 && afVarA.compareTo(af.i) <= 0) {
                z = true;
            }
            qim0 qim0Var3 = nim0.a;
            qim0Var2 = qim0Var3;
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("labeled.switch", qim0Var3), new uvx((pgx) null, 1, (tvx) null, (p3v) null, 26), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, apo.r(1515549485, new zw2(!z, dab0Var, (byte) 11), b0kVar3), apo.r(-1093517876, new h6a0(dab0Var, iu30Var, (byte) 3), b0kVar3), (xu30) null, (xu30) null, apo.r(-330785367, new yy80(dab0Var, (byte) 17), b0kVar3), b0kVar2, 64, 197040, 26620);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mb90(dab0Var, qim0Var2, iu30Var, i, (byte) 16);
        }
    }

    public static final void d(int i, String str, Function0 function0, b0k b0kVar, boolean z) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-503308605);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 896) == 256;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new xet(function0, (byte) 29);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            poo1.g(z, (iu30) objT, new nex(4), yoo1.z(b0kVar3), (qim0) null, 0, (qex) null, (String) null, (max) null, (vu30) null, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(-1322788154, new y5d0(str, (byte) 20), b0kVar3), b0kVar2, (i2 >> 3) & 14, 196608, 32752);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new c980((byte) 1, i, str, function0, z);
        }
    }

    public static final void e(mah0 mah0Var, ArrayList arrayList, iu30 iu30Var, b0k b0kVar, int i) {
        Integer num;
        Object fl9Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1155674852);
        int i2 = (x340Var.g(mah0Var) ? 4 : 2) | i | (x340Var.g(arrayList) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            bbh0 bbh0Var = mah0Var.d;
            int iIndexOf = bbh0Var != null ? arrayList.indexOf(bbh0Var) + 1 : 0;
            x340Var.i0(-1792987276);
            wat watVar = (wat) x340Var.k(t4k.h);
            uwr uwrVar = cbx.a;
            int iI0 = watVar.i0(cbx.b(x340Var).e.b);
            x340Var.r(false);
            Integer numValueOf = Integer.valueOf(iIndexOf);
            Integer numValueOf2 = Integer.valueOf(iI0);
            boolean zG = x340Var.g(xtb0VarA) | x340Var.e(iIndexOf) | x340Var.e(iI0);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                num = numValueOf;
                fl9Var = new fl9(xtb0VarA, iIndexOf, iI0, (lnm) null, (byte) 2);
                x340Var.s0(fl9Var);
            } else {
                fl9Var = objT;
                num = numValueOf;
            }
            qxd0.s(num, numValueOf2, (vu30) fl9Var, x340Var);
            qim0 qim0VarN = anm1.N("match_review_filters", dug.f(u291.f(nim0.a, 1.0f), cbx.a(x340Var).a.c, d4o1.a));
            float f = cbx.b(x340Var).e.b;
            cvx cvxVar = cbx.b(x340Var).b;
            zzq0 zzq0Var = new zzq0(f, 8.0f, f, 8.0f);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new gnf0(arrayList, mah0Var, iu30Var, (byte) 9);
                x340Var.s0(objT2);
            }
            too1.b(qim0VarN, xtb0VarA, zzq0Var, (iu30) objT2, x340Var, 0, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dah0(mah0Var, arrayList, iu30Var, i);
        }
    }

    public static final void f(mah0 mah0Var, String str, bbh0 bbh0Var, p410 p410Var, String str2, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, iu30 iu30Var4, iu30 iu30Var5, iu30 iu30Var6, qim0 qim0Var, xu30 xu30Var, b0k b0kVar, int i) {
        int i2;
        String str3;
        x340 x340Var;
        x340 x340Var2;
        boolean z;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(422444977);
        if ((i & 6) == 0) {
            i2 = (x340Var3.g(mah0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var3.e(bbh0Var == null ? -1 : bbh0Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var3.g(p410Var) : x340Var3.i(p410Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            str3 = str2;
            i2 |= x340Var3.g(str3) ? 16384 : 8192;
        } else {
            str3 = str2;
        }
        if ((i & 196608) == 0) {
            i2 |= x340Var3.i(iu30Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= x340Var3.i(iu30Var2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= x340Var3.i(iu30Var3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= x340Var3.i(iu30Var4) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= x340Var3.i(iu30Var5) ? 536870912 : 268435456;
        }
        int i3 = (x340Var3.i(iu30Var6) ? (char) 4 : (char) 2) | (x340Var3.g(qim0Var) ? ' ' : (char) 16) | (x340Var3.i(xu30Var) ? 256 : 128);
        if (x340Var3.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 147) == 146) ? false : true)) {
            ArrayList arrayList = new ArrayList();
            boolean z2 = true;
            d7 d7Var = new d7(bbh0.e, (byte) 0);
            while (d7Var.hasNext()) {
                Object next = d7Var.next();
                d7 d7Var2 = d7Var;
                List list = (List) mah0Var.a.get((bbh0) next);
                if (list != null) {
                    z = z2;
                    if ((!list.isEmpty()) == z) {
                        arrayList.add(next);
                    }
                } else {
                    z = z2;
                }
                z2 = z;
                d7Var = d7Var2;
            }
            bbh0 bbh0Var2 = mah0Var.d;
            List listSingletonList = bbh0Var2 != null ? Collections.singletonList(bbh0Var2) : arrayList;
            xtb0 xtb0VarA = aub0.a(0, x340Var3, 3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var3).b;
            zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, 16.0f, 7);
            qim0 qim0VarN = anm1.N("match_review_list", u291.d(qim0Var, 1.0f));
            boolean zG = x340Var3.g(arrayList) | ((i2 & 14) == 4) | ((458752 & i2) == 131072) | x340Var3.g(listSingletonList) | ((i2 & 896) == 256) | ((3670016 & i2) == 1048576) | ((29360128 & i2) == 8388608) | ((i3 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && x340Var3.i(p410Var))) | ((57344 & i2) == 16384) | ((234881024 & i2) == 67108864) | ((i2 & 1879048192) == 536870912) | ((i3 & 896) == 256);
            Object objT = x340Var3.T();
            if (zG || objT == fkj0.X) {
                x340Var2 = x340Var3;
                n9g0 n9g0Var = new n9g0(arrayList, listSingletonList, mah0Var, iu30Var, bbh0Var, iu30Var2, iu30Var3, iu30Var6, str, p410Var, str3, iu30Var4, iu30Var5, xu30Var);
                x340Var2.s0(n9g0Var);
                objT = n9g0Var;
            } else {
                x340Var2 = x340Var3;
            }
            x340Var = x340Var2;
            ujo1.d(qim0VarN, xtb0VarA, zzq0VarJ, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, 0, 504);
        } else {
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gah0(mah0Var, str, bbh0Var, p410Var, str2, iu30Var, iu30Var2, iu30Var3, iu30Var4, iu30Var5, iu30Var6, qim0Var, xu30Var, i);
        }
    }

    public static final void g(bbh0 bbh0Var, boolean z, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1062560246);
        int i2 = i | (b0kVar3.e(bbh0Var.ordinal()) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128) | (b0kVar3.i(function1) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ryx ryxVarM = axo1.m(432, b0kVar3, 1);
            n5f1 n5f1VarA = m4f1.a(b0kVar3, 0);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            ven0 ven0VarS = v8r.s(function1, b0kVar3);
            boolean zI = b0kVar3.i(ryxVarM) | b0kVar3.g(ven0VarS);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new tfe0(ryxVarM, ven0VarS, (lnm) null, (byte) 18);
                b0kVar3.s0(objT2);
            }
            qxd0.t(ryxVarM, b0kVar3, (vu30) objT2);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI2 = b0kVar3.i(ryxVarM) | ((i2 & 112) == 32);
            Object objT3 = b0kVar3.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new x3f(z, ryxVarM, (lnm) null);
                b0kVar3.s0(objT3);
            }
            qxd0.t(boolValueOf, b0kVar3, (vu30) objT3);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, cbx.b(b0kVar3).e.b, 12.0f, cbx.b(b0kVar3).e.b, 0.0f, 8);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 48);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarB);
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
            nko1.H(jw31VarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            uwo1.e(t(bbh0Var, b0kVar3), (qim0) null, cbx.d(b0kVar3).h, cbx.a(b0kVar3).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2034);
            b0kVar2 = b0kVar3;
            f3o1.b(48, apo.r(-393954838, new e9g0(bbh0Var, ryxVarM, n5f1VarA, function0, c9nVar, (byte) 3), b0kVar2), b0kVar2);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90(bbh0Var, z, function0, function1, i, (byte) 11);
        }
    }

    public static final void h(mah0 mah0Var, b0k b0kVar, int i) {
        Map map = mah0Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1516471808);
        int i2 = (x340Var.g(mah0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarY = uyn1.y(qim0VarF, cbx.b(x340Var).e.b, cbx.b(x340Var).b.b);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            uwo1.e(cwl1.o0(x340Var, 2131957301), (qim0) null, cbx.d(x340Var).d, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2026);
            if (map.size() == 1 && map.containsKey(bbh0.c)) {
                x340Var.i0(-239316468);
                x340Var.r(false);
            } else {
                x340Var.i0(-239567289);
                cvx cvxVar = cbx.b(x340Var).b;
                uwo1.e(ydh.g(8.0f, 2131957300, x340Var, x340Var, nim0Var), (qim0) null, cbx.d(x340Var).j, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2026);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new iah0(mah0Var, i);
        }
    }

    public static final void i(tte0 tte0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1239029044);
        int i2 = (x340Var.g(tte0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new jac0();
                x340Var.s0(objT);
            }
            jac0 jac0Var = (jac0) objT;
            boolean zI = x340Var.i(jac0Var) | ((i2 & 14) == 4);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new j9n0(tte0Var, jac0Var, (byte) 15);
                x340Var.s0(objT2);
            }
            qxd0.i(rih1.a, (iu30) objT2, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fhk0(tte0Var, i, (byte) 22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x018c  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:115:0x01da  */
    /* JADX WARN: Code duplicated, block: B:116:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:122:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:126:0x021a A[LOOP:1: B:124:0x0214->B:126:0x021a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x0234  */
    /* JADX WARN: Code duplicated, block: B:138:0x0244  */
    /* JADX WARN: Code duplicated, block: B:143:0x0252  */
    /* JADX WARN: Code duplicated, block: B:182:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:187:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:193:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:199:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:201:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:205:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:207:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:211:0x0302  */
    /* JADX WARN: Code duplicated, block: B:213:0x0306  */
    /* JADX WARN: Code duplicated, block: B:217:0x030e  */
    /* JADX WARN: Code duplicated, block: B:220:0x032e  */
    /* JADX WARN: Code duplicated, block: B:221:0x0330  */
    /* JADX WARN: Code duplicated, block: B:224:0x0337  */
    /* JADX WARN: Code duplicated, block: B:225:0x0339  */
    /* JADX WARN: Code duplicated, block: B:228:0x0341  */
    /* JADX WARN: Code duplicated, block: B:229:0x0343  */
    /* JADX WARN: Code duplicated, block: B:232:0x034b  */
    /* JADX WARN: Code duplicated, block: B:233:0x034d  */
    /* JADX WARN: Code duplicated, block: B:236:0x035a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:237:0x035c  */
    /* JADX WARN: Code duplicated, block: B:240:0x0391  */
    /* JADX WARN: Code duplicated, block: B:242:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:246:0x03b9 A[LOOP:2: B:244:0x03b3->B:246:0x03b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:251:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:256:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:261:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:269:0x040c  */
    /* JADX WARN: Code duplicated, block: B:272:0x0419  */
    /* JADX WARN: Code duplicated, block: B:274:0x041c  */
    /* JADX WARN: Code duplicated, block: B:276:0x041f  */
    /* JADX WARN: Code duplicated, block: B:279:0x0424  */
    /* JADX WARN: Code duplicated, block: B:281:0x0428  */
    /* JADX WARN: Code duplicated, block: B:282:0x042b  */
    /* JADX WARN: Code duplicated, block: B:283:0x042f  */
    /* JADX WARN: Code duplicated, block: B:290:0x043d  */
    /* JADX WARN: Code duplicated, block: B:296:0x0449  */
    /* JADX WARN: Code duplicated, block: B:303:0x0459  */
    /* JADX WARN: Code duplicated, block: B:306:0x0470  */
    /* JADX WARN: Code duplicated, block: B:307:0x0472  */
    /* JADX WARN: Code duplicated, block: B:310:0x0479  */
    /* JADX WARN: Code duplicated, block: B:311:0x047b  */
    /* JADX WARN: Code duplicated, block: B:314:0x0483  */
    /* JADX WARN: Code duplicated, block: B:315:0x0485  */
    /* JADX WARN: Code duplicated, block: B:318:0x0492  */
    /* JADX WARN: Code duplicated, block: B:319:0x0494  */
    /* JADX WARN: Code duplicated, block: B:323:0x049e  */
    /* JADX WARN: Code duplicated, block: B:325:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:327:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:331:0x04fd A[LOOP:3: B:329:0x04f7->B:331:0x04fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:338:0x0517  */
    /* JADX WARN: Code duplicated, block: B:343:0x0527  */
    /* JADX WARN: Code duplicated, block: B:348:0x0535  */
    /* JADX WARN: Code duplicated, block: B:380:0x058a  */
    /* JADX WARN: Code duplicated, block: B:386:0x0596  */
    /* JADX WARN: Code duplicated, block: B:392:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:395:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:396:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:399:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:400:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:403:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:404:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:407:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:408:0x05db  */
    /* JADX WARN: Code duplicated, block: B:414:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:417:0x0623  */
    /* JADX WARN: Code duplicated, block: B:419:0x0635  */
    /* JADX WARN: Code duplicated, block: B:423:0x064e A[LOOP:4: B:421:0x0648->B:423:0x064e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:429:0x0665  */
    /* JADX WARN: Code duplicated, block: B:435:0x0670  */
    /* JADX WARN: Code duplicated, block: B:441:0x067c  */
    /* JADX WARN: Code duplicated, block: B:447:0x0688  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:450:0x069a  */
    /* JADX WARN: Code duplicated, block: B:451:0x069c  */
    /* JADX WARN: Code duplicated, block: B:454:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:455:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:461:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:464:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:466:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:469:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:471:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:74:0x0118  */
    /* JADX WARN: Code duplicated, block: B:76:0x011f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0125  */
    /* JADX WARN: Code duplicated, block: B:81:0x014d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0163  */
    /* JADX WARN: Code duplicated, block: B:94:0x0175  */
    /* JADX WARN: Code duplicated, block: B:97:0x017b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0188  */
    public static final void j(xfx xfxVar, lbt0 lbt0Var, qim0 qim0Var, boolean z, boolean z2, boolean z3, boolean z4, iu30 iu30Var, b0k b0kVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z5;
        iu30 iu30Var2;
        x340 x340Var;
        boolean z6;
        h311 h311VarV;
        boolean z7;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        c10 c10Var;
        Iterator it;
        Object next;
        gji0 gji0Var;
        int i6;
        int i7;
        c10 c10Var2;
        c10 c10Var3;
        int iC;
        int color;
        ArrayList arrayList;
        Iterator it2;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z8;
        boolean z9;
        boolean z10;
        Object objT;
        boolean z11;
        String str5;
        String str6;
        String str7;
        String str8;
        int iC2;
        t80 t80Var;
        t80 t80Var2;
        t80 t80Var3;
        ArrayList arrayList2;
        Iterator it3;
        String str9;
        c10 c10Var4;
        String str10;
        c10 c10Var5;
        String str11;
        c10 c10Var6;
        String str12;
        c10 c10Var7;
        String str13;
        String str14;
        String str15;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objT2;
        boolean z17;
        String str16;
        String str17;
        String str18;
        c10 c10Var8;
        c10 c10Var9;
        String str19;
        ArrayList arrayList3;
        Iterator it4;
        String str20;
        c10 c10Var10;
        String str21;
        c10 c10Var11;
        String str22;
        c10 c10Var12;
        String str23;
        int iC3;
        String str24;
        String str25;
        String str26;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        Object objT3;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        ArrayList arrayList4;
        Iterator it5;
        String str32;
        c10 c10Var13;
        String str33;
        c10 c10Var14;
        String str34;
        c10 c10Var15;
        String str35;
        c10 c10Var16;
        c10 c10Var17;
        String str36;
        c10 c10Var18;
        String str37;
        String str38;
        String str39;
        String str40;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean zG;
        Object objT4;
        String str41;
        String str42;
        String str43;
        c10 c10Var19;
        String str44;
        c10 c10Var20;
        c10 c10Var21;
        c10 c10Var22;
        String str45;
        int i8;
        int i9;
        int i10;
        lbt0Var = lbt0Var;
        m4c m4cVar = fkj0.X;
        d7t0 d7t0Var = lbt0Var.a;
        String str46 = d7t0Var.a;
        String str47 = d7t0Var.d;
        Map map = lbt0Var.c;
        nk nkVar = lbt0Var.b;
        boolean z27 = nkVar.c;
        String str48 = nkVar.b;
        ArrayList arrayList5 = nkVar.f;
        im imVar = nkVar.h;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-284979786);
        int i11 = 4;
        if ((i & 6) == 0) {
            i3 = i | (x340Var2.i(xfxVar) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.g(lbt0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var2.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var2.h(z) ? 2048 : 1024;
        }
        int i12 = i3;
        int i13 = i2 & 16;
        if (i13 == 0) {
            i4 = i12;
            if ((i & 24576) == 0) {
                i4 |= x340Var2.h(z2) ? 16384 : 8192;
            }
            if ((i & 196608) == 0) {
                if (x340Var2.h(z3)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i4 |= i10;
            }
            if ((i & 1572864) == 0) {
                if (x340Var2.h(z4)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i4 |= i9;
            }
            if ((i & 12582912) == 0) {
                if (x340Var2.i(iu30Var)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i4 |= i8;
            }
            i5 = i4;
            if ((i5 & 4793491) != 4793490) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (x340Var2.Y(i5 & 1, z5)) {
                if (i13 != 0) {
                    z7 = false;
                } else {
                    z7 = z2;
                }
                mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0Var);
                hzj.A.getClass();
                c10Var = null;
                if (x340Var2.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(hmb0.t1);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                it = arrayList5.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((gji0) next).a);
                gji0Var = (gji0) next;
                if (gji0Var != null || (i6 = gji0Var.e) == 0) {
                    i6 = 1;
                }
                i7 = nkVar.a;
                if (imVar.f || z7) {
                    c10Var2 = null;
                } else {
                    c10Var2 = (c10) map.get(t80.t);
                }
                if (imVar.c) {
                    c10Var = (c10) map.get(t80.e);
                } else if (nkVar.d) {
                    c10Var = (c10) map.get(t80.f);
                }
                c10Var3 = c10Var;
                iC = l1d.C(i6);
                if (iC != 0) {
                    if (iC != 1) {
                        x340Var2.i0(-305415468);
                        x340Var2.r(false);
                        lbt0Var = lbt0Var;
                        iu30Var2 = iu30Var;
                        x340Var = x340Var2;
                    } else {
                        x340Var2.i0(-318087059);
                        iC2 = l1d.C(i7);
                        t80Var = t80.d;
                        t80Var2 = t80.P0;
                        t80Var3 = t80.c;
                        if (iC2 != 0) {
                            if (iC2 != 1) {
                                x340Var2.i0(-314431880);
                                color = ihc1.y0(str47) ? -1 : Color.parseColor(str47);
                                arrayList3 = new ArrayList(q7h.U(arrayList5, 10));
                                it4 = arrayList5.iterator();
                                while (it4.hasNext()) {
                                    arrayList3.add(rpo1.x((gji0) it4.next()));
                                }
                                int i14 = nkVar.g;
                                if (c10Var3 != null || (str20 = c10Var3.b) == null) {
                                    str20 = "";
                                }
                                c10Var10 = (c10) map.get(t80Var);
                                if (c10Var10 != null || (str21 = c10Var10.b) == null) {
                                    str21 = "";
                                }
                                c10Var11 = (c10) map.get(t80Var);
                                if (c10Var11 != null || (str22 = c10Var11.c) == null) {
                                    str22 = "";
                                }
                                w4g0 w4g0Var = new w4g0(str21, str22, z27);
                                boolean z28 = imVar.d;
                                c10Var12 = (c10) map.get(t80Var3);
                                if (c10Var12 != null || (str30 = c10Var12.b) == null) {
                                    str23 = "";
                                } else {
                                    str23 = str30;
                                }
                                int i15 = nkVar.i;
                                iC3 = l1d.C(nkVar.j);
                                if (iC3 != 0) {
                                    i11 = 1;
                                } else if (iC3 != 1) {
                                    i11 = 2;
                                } else if (iC3 != 2) {
                                    i11 = 3;
                                } else if (iC3 != 3) {
                                    eg.o();
                                    return;
                                }
                                long j = nkVar.e;
                                if (c10Var2 != null || (str29 = c10Var2.b) == null) {
                                    str24 = "";
                                } else {
                                    str24 = str29;
                                }
                                if (c10Var2 != null || (str28 = c10Var2.c) == null) {
                                    str25 = "";
                                } else {
                                    str25 = str28;
                                }
                                if (c10Var2 != null || (str27 = c10Var2.e) == null) {
                                    str26 = "";
                                } else {
                                    str26 = str27;
                                }
                                uvm0 uvm0Var = new uvm0(str46, color, i15, i11, j, arrayList3, i14, str48, str20, w4g0Var, z28, str23, str24, str25, str26);
                                if ((i5 & 29360128) == 8388608) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                if ((i5 & 458752) == 131072) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                boolean z29 = z18 | z19;
                                if ((i5 & 3670016) == 1048576) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                boolean zG2 = z29 | z20 | x340Var2.g(c10Var3);
                                if ((i5 & 112) == 32) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                z22 = zG2 | z21;
                                objT3 = x340Var2.T();
                                if (z22 || objT3 == m4cVar) {
                                    zmr0 zmr0Var = new zmr0(iu30Var, z3, z4, c10Var3, lbt0Var, (byte) 1);
                                    x340Var2.s0(zmr0Var);
                                    objT3 = zmr0Var;
                                }
                                y4o1.h(xfxVar, uvm0Var, (qim0) null, z7, (iu30) objT3, x340Var2, (i5 & 14) | ((i5 >> 3) & 7168));
                                z17 = false;
                                x340Var2.r(false);
                                x340Var = x340Var2;
                            } else if (iC2 != 2) {
                                x340Var2.i0(-305451180);
                                z17 = false;
                                x340Var2.r(false);
                                lbt0Var = lbt0Var;
                                iu30Var2 = iu30Var;
                                x340Var = x340Var2;
                            } else {
                                x340Var2.i0(-310633946);
                                if (z) {
                                    str31 = nkVar.k;
                                } else {
                                    str31 = "";
                                }
                                color = ihc1.y0(str47) ? -1 : Color.parseColor(str47);
                                String str49 = str31;
                                arrayList4 = new ArrayList(q7h.U(arrayList5, 10));
                                it5 = arrayList5.iterator();
                                while (it5.hasNext()) {
                                    arrayList4.add(rpo1.x((gji0) it5.next()));
                                }
                                int i16 = nkVar.g;
                                if (c10Var3 != null || (str45 = c10Var3.b) == null) {
                                    str32 = "";
                                } else {
                                    str32 = str45;
                                }
                                c10Var13 = (c10) map.get(t80Var);
                                if (c10Var13 != null || (str33 = c10Var13.b) == null) {
                                    str33 = "";
                                }
                                c10Var14 = (c10) map.get(t80Var);
                                if (c10Var14 != null || (str34 = c10Var14.c) == null) {
                                    str34 = "";
                                }
                                w4g0 w4g0Var2 = new w4g0(str33, str34, z27);
                                boolean z30 = imVar.d;
                                boolean z31 = imVar.j;
                                t80 t80Var4 = t80.X;
                                if (z31 ? !z || !imVar.h ? (c10Var15 = (c10) map.get(t80Var3)) == null || (str35 = c10Var15.b) == null : (c10Var16 = (c10) map.get(t80Var4)) == null || (str35 = c10Var16.b) == null : (c10Var22 = (c10) map.get(t80Var2)) == null || (str35 = c10Var22.b) == null) {
                                }
                                String str50 = (z || !imVar.h ? (c10Var17 = (c10) map.get(t80Var3)) == null || (str36 = c10Var17.c) == null : (c10Var21 = (c10) map.get(t80Var4)) == null || (str36 = c10Var21.c) == null) ? "" : str36;
                                if (imVar.j ? (c10Var18 = (c10) map.get(t80Var3)) == null || (str = c10Var18.d) == null : (c10Var20 = (c10) map.get(t80Var2)) == null || (str = c10Var20.d) == null) {
                                }
                                if (z || (c10Var19 = (c10) map.get(t80.Y)) == null || (str44 = c10Var19.b) == null) {
                                    str37 = "";
                                } else {
                                    str37 = str44;
                                }
                                if (c10Var2 != null || (str43 = c10Var2.b) == null) {
                                    str38 = "";
                                } else {
                                    str38 = str43;
                                }
                                if (c10Var2 != null || (str42 = c10Var2.c) == null) {
                                    str39 = "";
                                } else {
                                    str39 = str42;
                                }
                                if (c10Var2 != null || (str41 = c10Var2.e) == null) {
                                    str40 = "";
                                } else {
                                    str40 = str41;
                                }
                                yvm0 yvm0Var = new yvm0(str46, str49, color, arrayList4, i16, str48, str32, w4g0Var2, z30, str35, str, str38, str39, str40, str50, str37);
                                if ((i5 & 112) == 32) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                                if ((i5 & 29360128) == 8388608) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                boolean z32 = z23 | z24;
                                if ((i5 & 458752) == 131072) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                boolean z33 = z32 | z25;
                                if ((i5 & 3670016) == 1048576) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                zG = z33 | z26 | x340Var2.g(c10Var3);
                                objT4 = x340Var2.T();
                                if (zG || objT4 == m4cVar) {
                                    zmr0 zmr0Var2 = new zmr0(lbt0Var, iu30Var, z3, z4, c10Var3);
                                    x340Var2.s0(zmr0Var2);
                                    objT4 = zmr0Var2;
                                }
                                a6o1.h(xfxVar, yvm0Var, (qim0) null, z7, (iu30) objT4, x340Var2, (i5 & 14) | ((i5 >> 3) & 7168));
                                x340Var = x340Var2;
                                z17 = false;
                                x340Var.r(false);
                            }
                            iu30Var2 = iu30Var;
                        } else {
                            x340Var2.i0(-318302571);
                            color = ihc1.y0(str47) ? -1 : Color.parseColor(str47);
                            arrayList2 = new ArrayList(q7h.U(arrayList5, 10));
                            it3 = arrayList5.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(rpo1.x((gji0) it3.next()));
                            }
                            int i17 = nkVar.g;
                            if (c10Var3 != null || (str19 = c10Var3.b) == null) {
                                str9 = "";
                            } else {
                                str9 = str19;
                            }
                            c10Var4 = (c10) map.get(t80Var);
                            if (c10Var4 != null || (str10 = c10Var4.b) == null) {
                                str10 = "";
                            }
                            c10Var5 = (c10) map.get(t80Var);
                            if (c10Var5 != null || (str11 = c10Var5.c) == null) {
                                str11 = "";
                            }
                            w4g0 w4g0Var3 = new w4g0(str10, str11, z27);
                            boolean z34 = imVar.d;
                            String str51 = (imVar.j ? (c10Var6 = (c10) map.get(t80Var3)) == null || (str12 = c10Var6.b) == null : (c10Var9 = (c10) map.get(t80Var2)) == null || (str12 = c10Var9.b) == null) ? "" : str12;
                            if (imVar.j ? (c10Var7 = (c10) map.get(t80Var3)) == null || (str = c10Var7.d) == null : (c10Var8 = (c10) map.get(t80Var2)) == null || (str = c10Var8.d) == null) {
                            }
                            if (c10Var2 != null || (str18 = c10Var2.b) == null) {
                                str13 = "";
                            } else {
                                str13 = str18;
                            }
                            if (c10Var2 != null || (str17 = c10Var2.c) == null) {
                                str14 = "";
                            } else {
                                str14 = str17;
                            }
                            if (c10Var2 != null || (str16 = c10Var2.e) == null) {
                                str15 = "";
                            } else {
                                str15 = str16;
                            }
                            cwm0 cwm0Var = new cwm0(str46, color, arrayList2, i17, str48, str9, w4g0Var3, z34, str51, str, str13, str14, str15);
                            if ((i5 & 29360128) == 8388608) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if ((i5 & 458752) == 131072) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            boolean z35 = z12 | z13;
                            if ((i5 & 3670016) == 1048576) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            boolean zG3 = z35 | z14 | x340Var2.g(c10Var3);
                            if ((i5 & 112) == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zG3 | z15;
                            objT2 = x340Var2.T();
                            if (!z16 || objT2 == m4cVar) {
                                x340Var = x340Var2;
                                lbt0Var = lbt0Var;
                                iu30Var2 = iu30Var;
                                zmr0 zmr0Var3 = new zmr0(iu30Var2, z3, z4, c10Var3, lbt0Var, (byte) 0);
                                x340Var.s0(zmr0Var3);
                                objT2 = zmr0Var3;
                            } else {
                                lbt0Var = lbt0Var;
                                x340Var = x340Var2;
                                iu30Var2 = iu30Var;
                            }
                            f6o1.e(xfxVar, cwm0Var, (qim0) null, z7, (iu30) objT2, x340Var, (i5 & 14) | ((i5 >> 3) & 7168));
                            z17 = false;
                            x340Var.r(false);
                        }
                        x340Var.r(z17);
                    }
                    z6 = z7;
                } else {
                    iu30Var2 = iu30Var;
                    x340Var = x340Var2;
                    lbt0Var = lbt0Var;
                    x340Var.i0(-319914013);
                    color = ihc1.y0(str47) ? -1 : Color.parseColor(str47);
                    arrayList = new ArrayList(q7h.U(arrayList5, 10));
                    it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(rpo1.x((gji0) it2.next()));
                    }
                    if (c10Var3 != null || (str8 = c10Var3.b) == null) {
                        str = "";
                    } else {
                        str = str8;
                    }
                    if (c10Var2 != null || (str7 = c10Var2.b) == null) {
                        str2 = "";
                    } else {
                        str2 = str7;
                    }
                    if (c10Var2 != null || (str6 = c10Var2.c) == null) {
                        str3 = "";
                    } else {
                        str3 = str6;
                    }
                    if (c10Var2 != null || (str5 = c10Var2.e) == null) {
                        str4 = "";
                    } else {
                        str4 = str5;
                    }
                    ivm0 ivm0Var = new ivm0(color, str46, str48, str, str2, str3, str4, arrayList);
                    if ((i5 & 29360128) == 8388608) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean zG4 = z8 | x340Var.g(c10Var3);
                    if ((i5 & 112) == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = zG4 | z9;
                    objT = x340Var.T();
                    if (!z10 || objT == m4cVar) {
                        z11 = false;
                        objT = new ymr0(iu30Var2, c10Var3, lbt0Var, (byte) 0);
                        x340Var.s0(objT);
                    } else {
                        z11 = false;
                    }
                    z6 = z7;
                    r4o1.y(xfxVar, ivm0Var, (qim0) null, z6, (iu30) objT, x340Var, (i5 & 14) | ((i5 >> 3) & 7168));
                    x340Var.r(z11);
                }
                x340Var.r(true);
            } else {
                iu30Var2 = iu30Var;
                x340Var = x340Var2;
                x340Var.b0();
                z6 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new anr0(xfxVar, lbt0Var, qim0Var, z, z6, z3, z4, iu30Var2, i, i2);
            }
        }
        i4 = i12 | 24576;
        if ((i & 196608) == 0) {
            if (x340Var2.h(z3)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i4 |= i10;
        }
        if ((i & 1572864) == 0) {
            if (x340Var2.h(z4)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i4 |= i9;
        }
        if ((i & 12582912) == 0) {
            if (x340Var2.i(iu30Var)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i4 |= i8;
        }
        i5 = i4;
        if ((i5 & 4793491) != 4793490) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (x340Var2.Y(i5 & 1, z5)) {
            if (i13 != 0) {
                z7 = false;
            } else {
                z7 = z2;
            }
            mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0VarE = zr7.E(x340Var2, qim0Var);
            hzj.A.getClass();
            c10Var = null;
            if (x340Var2.a != null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            it = arrayList5.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((gji0) next).a);
            gji0Var = (gji0) next;
            if (gji0Var != null) {
                i6 = 1;
            } else {
                i6 = 1;
            }
            i7 = nkVar.a;
            if (imVar.f) {
                c10Var2 = null;
            } else {
                c10Var2 = null;
            }
            if (imVar.c) {
                c10Var = (c10) map.get(t80.e);
            } else if (nkVar.d) {
                c10Var = (c10) map.get(t80.f);
            }
            c10Var3 = c10Var;
            iC = l1d.C(i6);
            if (iC != 0) {
                if (iC != 1) {
                    x340Var2.i0(-305415468);
                    x340Var2.r(false);
                    lbt0Var = lbt0Var;
                    iu30Var2 = iu30Var;
                    x340Var = x340Var2;
                } else {
                    x340Var2.i0(-318087059);
                    iC2 = l1d.C(i7);
                    t80Var = t80.d;
                    t80Var2 = t80.P0;
                    t80Var3 = t80.c;
                    if (iC2 != 0) {
                        if (iC2 != 1) {
                            x340Var2.i0(-314431880);
                            if (ihc1.y0(str47)) {
                            }
                            arrayList3 = new ArrayList(q7h.U(arrayList5, 10));
                            it4 = arrayList5.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(rpo1.x((gji0) it4.next()));
                            }
                            int i18 = nkVar.g;
                            if (c10Var3 != null) {
                                str20 = "";
                            } else {
                                str20 = "";
                            }
                            c10Var10 = (c10) map.get(t80Var);
                            if (c10Var10 != null) {
                                str21 = "";
                            } else {
                                str21 = "";
                            }
                            c10Var11 = (c10) map.get(t80Var);
                            if (c10Var11 != null) {
                                str22 = "";
                            } else {
                                str22 = "";
                            }
                            w4g0 w4g0Var4 = new w4g0(str21, str22, z27);
                            boolean z210 = imVar.d;
                            c10Var12 = (c10) map.get(t80Var3);
                            if (c10Var12 != null) {
                                str23 = "";
                            } else {
                                str23 = "";
                            }
                            int i19 = nkVar.i;
                            iC3 = l1d.C(nkVar.j);
                            if (iC3 != 0) {
                                i11 = 1;
                            } else if (iC3 != 1) {
                                i11 = 2;
                            } else if (iC3 != 2) {
                                i11 = 3;
                            } else if (iC3 != 3) {
                                eg.o();
                                return;
                            }
                            long j2 = nkVar.e;
                            if (c10Var2 != null) {
                                str24 = "";
                            } else {
                                str24 = "";
                            }
                            if (c10Var2 != null) {
                                str25 = "";
                            } else {
                                str25 = "";
                            }
                            if (c10Var2 != null) {
                                str26 = "";
                            } else {
                                str26 = "";
                            }
                            uvm0 uvm0Var2 = new uvm0(str46, color, i19, i11, j2, arrayList3, i18, str48, str20, w4g0Var4, z210, str23, str24, str25, str26);
                            if ((i5 & 29360128) == 8388608) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if ((i5 & 458752) == 131072) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            boolean z211 = z18 | z19;
                            if ((i5 & 3670016) == 1048576) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            boolean zG5 = z211 | z20 | x340Var2.g(c10Var3);
                            if ((i5 & 112) == 32) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            z22 = zG5 | z21;
                            objT3 = x340Var2.T();
                            if (z22) {
                                zmr0 zmr0Var4 = new zmr0(iu30Var, z3, z4, c10Var3, lbt0Var, (byte) 1);
                                x340Var2.s0(zmr0Var4);
                                objT3 = zmr0Var4;
                            } else {
                                zmr0 zmr0Var5 = new zmr0(iu30Var, z3, z4, c10Var3, lbt0Var, (byte) 1);
                                x340Var2.s0(zmr0Var5);
                                objT3 = zmr0Var5;
                            }
                            y4o1.h(xfxVar, uvm0Var2, (qim0) null, z7, (iu30) objT3, x340Var2, (i5 & 14) | ((i5 >> 3) & 7168));
                            z17 = false;
                            x340Var2.r(false);
                            x340Var = x340Var2;
                        } else if (iC2 != 2) {
                            x340Var2.i0(-305451180);
                            z17 = false;
                            x340Var2.r(false);
                            lbt0Var = lbt0Var;
                            iu30Var2 = iu30Var;
                            x340Var = x340Var2;
                        } else {
                            x340Var2.i0(-310633946);
                            if (z) {
                                str31 = nkVar.k;
                            } else {
                                str31 = "";
                            }
                            if (ihc1.y0(str47)) {
                            }
                            String str410 = str31;
                            arrayList4 = new ArrayList(q7h.U(arrayList5, 10));
                            it5 = arrayList5.iterator();
                            while (it5.hasNext()) {
                                arrayList4.add(rpo1.x((gji0) it5.next()));
                            }
                            int i110 = nkVar.g;
                            if (c10Var3 != null) {
                                str32 = "";
                            } else {
                                str32 = "";
                            }
                            c10Var13 = (c10) map.get(t80Var);
                            if (c10Var13 != null) {
                                str33 = "";
                            } else {
                                str33 = "";
                            }
                            c10Var14 = (c10) map.get(t80Var);
                            if (c10Var14 != null) {
                                str34 = "";
                            } else {
                                str34 = "";
                            }
                            w4g0 w4g0Var5 = new w4g0(str33, str34, z27);
                            boolean z36 = imVar.d;
                            boolean z37 = imVar.j;
                            t80 t80Var5 = t80.X;
                            str35 = z37 ? "" : "";
                            if (z) {
                                String str52 = imVar.j ? "" : "";
                                if (z) {
                                    str37 = "";
                                } else {
                                    str37 = "";
                                }
                                if (c10Var2 != null) {
                                    str38 = "";
                                } else {
                                    str38 = "";
                                }
                                if (c10Var2 != null) {
                                    str39 = "";
                                } else {
                                    str39 = "";
                                }
                                if (c10Var2 != null) {
                                    str40 = "";
                                } else {
                                    str40 = "";
                                }
                                yvm0 yvm0Var2 = new yvm0(str46, str410, color, arrayList4, i110, str48, str32, w4g0Var5, z36, str35, str52, str38, str39, str40, str50, str37);
                                if ((i5 & 112) == 32) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                                if ((i5 & 29360128) == 8388608) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                boolean z38 = z23 | z24;
                                if ((i5 & 458752) == 131072) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                boolean z39 = z38 | z25;
                                if ((i5 & 3670016) == 1048576) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                zG = z39 | z26 | x340Var2.g(c10Var3);
                                objT4 = x340Var2.T();
                                if (zG) {
                                    zmr0 zmr0Var6 = new zmr0(lbt0Var, iu30Var, z3, z4, c10Var3);
                                    x340Var2.s0(zmr0Var6);
                                    objT4 = zmr0Var6;
                                } else {
                                    zmr0 zmr0Var7 = new zmr0(lbt0Var, iu30Var, z3, z4, c10Var3);
                                    x340Var2.s0(zmr0Var7);
                                    objT4 = zmr0Var7;
                                }
                                a6o1.h(xfxVar, yvm0Var2, (qim0) null, z7, (iu30) objT4, x340Var2, (i5 & 14) | ((i5 >> 3) & 7168));
                                x340Var = x340Var2;
                                z17 = false;
                                x340Var.r(false);
                            } else {
                                if (imVar.j) {
                                }
                                if (z) {
                                    str37 = "";
                                } else {
                                    str37 = "";
                                }
                                if (c10Var2 != null) {
                                    str38 = "";
                                } else {
                                    str38 = "";
                                }
                                if (c10Var2 != null) {
                                    str39 = "";
                                } else {
                                    str39 = "";
                                }
                                if (c10Var2 != null) {
                                    str40 = "";
                                } else {
                                    str40 = "";
                                }
                                yvm0 yvm0Var3 = new yvm0(str46, str410, color, arrayList4, i110, str48, str32, w4g0Var5, z36, str35, str52, str38, str39, str40, str50, str37);
                                if ((i5 & 112) == 32) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                                if ((i5 & 29360128) == 8388608) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                boolean z310 = z23 | z24;
                                if ((i5 & 458752) == 131072) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                boolean z311 = z310 | z25;
                                if ((i5 & 3670016) == 1048576) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                zG = z311 | z26 | x340Var2.g(c10Var3);
                                objT4 = x340Var2.T();
                                if (zG) {
                                    zmr0 zmr0Var8 = new zmr0(lbt0Var, iu30Var, z3, z4, c10Var3);
                                    x340Var2.s0(zmr0Var8);
                                    objT4 = zmr0Var8;
                                } else {
                                    zmr0 zmr0Var9 = new zmr0(lbt0Var, iu30Var, z3, z4, c10Var3);
                                    x340Var2.s0(zmr0Var9);
                                    objT4 = zmr0Var9;
                                }
                                a6o1.h(xfxVar, yvm0Var3, (qim0) null, z7, (iu30) objT4, x340Var2, (i5 & 14) | ((i5 >> 3) & 7168));
                                x340Var = x340Var2;
                                z17 = false;
                                x340Var.r(false);
                            }
                        }
                        iu30Var2 = iu30Var;
                    } else {
                        x340Var2.i0(-318302571);
                        if (ihc1.y0(str47)) {
                        }
                        arrayList2 = new ArrayList(q7h.U(arrayList5, 10));
                        it3 = arrayList5.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(rpo1.x((gji0) it3.next()));
                        }
                        int i111 = nkVar.g;
                        if (c10Var3 != null) {
                            str9 = "";
                        } else {
                            str9 = "";
                        }
                        c10Var4 = (c10) map.get(t80Var);
                        if (c10Var4 != null) {
                            str10 = "";
                        } else {
                            str10 = "";
                        }
                        c10Var5 = (c10) map.get(t80Var);
                        if (c10Var5 != null) {
                            str11 = "";
                        } else {
                            str11 = "";
                        }
                        w4g0 w4g0Var6 = new w4g0(str10, str11, z27);
                        boolean z312 = imVar.d;
                        if (imVar.j) {
                        }
                        String str53 = imVar.j ? "" : "";
                        if (c10Var2 != null) {
                            str13 = "";
                        } else {
                            str13 = "";
                        }
                        if (c10Var2 != null) {
                            str14 = "";
                        } else {
                            str14 = "";
                        }
                        if (c10Var2 != null) {
                            str15 = "";
                        } else {
                            str15 = "";
                        }
                        cwm0 cwm0Var2 = new cwm0(str46, color, arrayList2, i111, str48, str9, w4g0Var6, z312, str51, str53, str13, str14, str15);
                        if ((i5 & 29360128) == 8388608) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((i5 & 458752) == 131072) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z313 = z12 | z13;
                        if ((i5 & 3670016) == 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean zG6 = z313 | z14 | x340Var2.g(c10Var3);
                        if ((i5 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zG6 | z15;
                        objT2 = x340Var2.T();
                        if (z16) {
                            x340Var = x340Var2;
                            lbt0Var = lbt0Var;
                            iu30Var2 = iu30Var;
                            zmr0 zmr0Var10 = new zmr0(iu30Var2, z3, z4, c10Var3, lbt0Var, (byte) 0);
                            x340Var.s0(zmr0Var10);
                            objT2 = zmr0Var10;
                        } else {
                            x340Var = x340Var2;
                            lbt0Var = lbt0Var;
                            iu30Var2 = iu30Var;
                            zmr0 zmr0Var11 = new zmr0(iu30Var2, z3, z4, c10Var3, lbt0Var, (byte) 0);
                            x340Var.s0(zmr0Var11);
                            objT2 = zmr0Var11;
                        }
                        f6o1.e(xfxVar, cwm0Var2, (qim0) null, z7, (iu30) objT2, x340Var, (i5 & 14) | ((i5 >> 3) & 7168));
                        z17 = false;
                        x340Var.r(false);
                    }
                    x340Var.r(z17);
                }
                z6 = z7;
            } else {
                iu30Var2 = iu30Var;
                x340Var = x340Var2;
                lbt0Var = lbt0Var;
                x340Var.i0(-319914013);
                if (ihc1.y0(str47)) {
                }
                arrayList = new ArrayList(q7h.U(arrayList5, 10));
                it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    arrayList.add(rpo1.x((gji0) it2.next()));
                }
                if (c10Var3 != null) {
                    str = "";
                } else {
                    str = "";
                }
                if (c10Var2 != null) {
                    str2 = "";
                } else {
                    str2 = "";
                }
                if (c10Var2 != null) {
                    str3 = "";
                } else {
                    str3 = "";
                }
                if (c10Var2 != null) {
                    str4 = "";
                } else {
                    str4 = "";
                }
                ivm0 ivm0Var2 = new ivm0(color, str46, str48, str, str2, str3, str4, arrayList);
                if ((i5 & 29360128) == 8388608) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean zG7 = z8 | x340Var.g(c10Var3);
                if ((i5 & 112) == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = zG7 | z9;
                objT = x340Var.T();
                if (z10) {
                    z11 = false;
                    objT = new ymr0(iu30Var2, c10Var3, lbt0Var, (byte) 0);
                    x340Var.s0(objT);
                } else {
                    z11 = false;
                    objT = new ymr0(iu30Var2, c10Var3, lbt0Var, (byte) 0);
                    x340Var.s0(objT);
                }
                z6 = z7;
                r4o1.y(xfxVar, ivm0Var2, (qim0) null, z6, (iu30) objT, x340Var, (i5 & 14) | ((i5 >> 3) & 7168));
                x340Var.r(z11);
            }
            x340Var.r(true);
        } else {
            iu30Var2 = iu30Var;
            x340Var = x340Var2;
            x340Var.b0();
            z6 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new anr0(xfxVar, lbt0Var, qim0Var, z, z6, z3, z4, iu30Var2, i, i2);
        }
    }

    public static final void k(String str, tyq tyqVar, jd6 jd6Var, boolean z, Function0 function0, boolean z2, b0k b0kVar, int i) {
        int i2;
        boolean z3 = z2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1725898206);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(tyqVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(jd6Var) : x340Var.i(jd6Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function0) ? 16384 : 8192;
        }
        int i3 = 196608 & i;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.h(z3) ? 1048576 : 524288;
        }
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            boolean z4 = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z4 || objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(1180322719);
                sok.i((qim0) null, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1180386114);
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
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
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                if (z) {
                    x340Var.i0(-475587206);
                    l(jd6Var, str, x340Var, ((i2 >> 6) & 14) | ((i2 << 3) & 112));
                    x340Var.r(false);
                } else {
                    x340Var.i0(-475523780);
                    x340Var.r(false);
                }
                boolean zI = x340Var.i(ven0Var) | ((57344 & i2) == 16384);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new swi0(function0, ven0Var, (byte) 17);
                    x340Var.s0(objT2);
                }
                z3 = z2;
                otw.c(tyqVar, new bwb1(str, z3, (Function0) objT2, true), u291.v(nim0Var, 220.0f), (ipb1) null, x340Var, (i2 >> 3) & 14, 8);
                if (z) {
                    x340Var.i0(-475008932);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-475072358);
                    l(jd6Var, str, x340Var, ((i2 >> 6) & 14) | ((i2 << 3) & 112));
                    x340Var.r(false);
                }
                x340Var.r(true);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wag(str, tyqVar, jd6Var, z, function0, z3, i);
        }
    }

    public static final void l(jd6 jd6Var, String str, b0k b0kVar, int i) {
        int i2;
        jd6 jd6Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-792871769);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(jd6Var) : x340Var.i(jd6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            jd6Var2 = jd6Var;
            x340Var.b0();
        } else if (jd6Var == null) {
            x340Var.i0(1877372422);
            x340Var.r(false);
            jd6Var2 = jd6Var;
        } else {
            x340Var.i0(1877372423);
            jd6Var2 = jd6Var;
            otw.c(jd6Var2, new rwb1(str), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(jd6Var2, str, i, (byte) 5);
        }
    }

    public static final upy0 m(i7d i7dVar) {
        dlq dlqVar = (dlq) i7dVar.i;
        dlqVar.getClass();
        pbq pbqVar = new pbq(i7dVar, dlqVar);
        ykq ykqVar = (ykq) pbqVar.h;
        ykq ykqVar2 = (ykq) pbqVar.i;
        o241 o241Var = (o241) i7dVar.Z;
        c8o.l(o241Var);
        luk lukVar = (luk) i7dVar.a;
        c8o.l(lukVar);
        y170 y170Var = new y170(o241Var, new bpy0(true, lukVar), (byte) 2);
        ykq ykqVar3 = (ykq) pbqVar.g;
        ykq ykqVar4 = (ykq) pbqVar.t;
        ykq ykqVar5 = (ykq) pbqVar.X;
        ykq ykqVar6 = (ykq) pbqVar.c;
        ykq ykqVar7 = (ykq) pbqVar.d;
        ykq ykqVar8 = (ykq) pbqVar.e;
        q8n q8nVar = (q8n) i7dVar.X;
        c8o.l(q8nVar);
        q8n q8nVar2 = (q8n) i7dVar.Y;
        c8o.l(q8nVar2);
        return new upy0(ykqVar, ykqVar2, y170Var, ykqVar3, ykqVar4, ykqVar5, ykqVar6, ykqVar7, ykqVar8, q8nVar, q8nVar2);
    }

    public static final String n(bbh0 bbh0Var, x340 x340Var) {
        int i;
        int iOrdinal = bbh0Var.ordinal();
        if (iOrdinal == 0) {
            i = 2131957296;
        } else if (iOrdinal == 1) {
            i = 2131957290;
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            i = 2131957303;
        }
        return cwl1.o0(x340Var, i);
    }

    public static final void o(oqw oqwVar, ymd0 ymd0Var, iu30 iu30Var) {
        Throwable th = new Throwable("filterNotNull subscription site");
        fai0 fai0Var = new fai0();
        fai0Var.n(ymd0Var, new jp5(fai0Var, th, (byte) 4));
        oqwVar.b(new hnd0(fai0Var), iu30Var);
    }

    public static Context p(Context context) {
        int iR;
        Context applicationContext = context.getApplicationContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && (iR = sf.r(context)) != sf.r(applicationContext)) {
            applicationContext = sf.f(applicationContext, iR);
        }
        if (i >= 30) {
            String strF = w081.f(context);
            if (!Objects.equals(strF, w081.f(applicationContext))) {
                return w081.b(applicationContext, strF);
            }
        }
        return applicationContext;
    }

    public static hg51 q(xpw xpwVar, Object obj, int i) {
        return new hg51(xpwVar, obj, i);
    }

    public static final void r(hji0 hji0Var, iu30 iu30Var, boolean z, boolean z2) {
        boolean zEquals = hji0Var.c.equals(zw.d);
        String str = hji0Var.k;
        String str2 = hji0Var.j;
        if (str2.length() > 0 && str.length() > 0) {
            n57.s("Member " + hji0Var.a + " has both childDetailsUri and regularMemberDetailsUri set");
        }
        if (z && str2.length() > 0) {
            str = str2;
        } else if (!z2 || str.length() <= 0) {
            str = hji0Var.h;
        }
        iu30Var.invoke((zEquals || ihc1.y0(str)) ? new bbt0(hji0Var.e) : new tat0(str));
    }

    public static final Next s(fa6 fa6Var, nmu0 nmu0Var) {
        String str = fa6Var.j;
        y86 y86Var = fa6Var.a;
        if (str == null) {
            return Next.j();
        }
        fa6 fa6VarA = fa6.a(fa6Var, (y86) null, false, false, (String) null, (String) null, false, (String) null, (String) null, 255);
        z740 z740VarC = y86Var.c();
        if (z740VarC != null) {
            return Next.i(fa6VarA, Collections.singleton(new r56(z740VarC)));
        }
        fa6 fa6VarA2 = fa6.a(fa6VarA, y86.a(fa6Var.a, str, false, false, (ie40) null, true, false, (mvh1) null, (nmu0) null, false, false, z6x.a, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -33562629, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER);
        String str2 = fa6Var.k;
        String str3 = y86Var.a;
        xw51 xw51Var = y86Var.x;
        mvh1 mvh1Var = y86Var.l;
        Set set = y86Var.E;
        if (!y86Var.F) {
            set = null;
        }
        return Next.i(fa6VarA2, Collections.singleton(new t56(str, str2, str3, xw51Var, mvh1Var, set, y86Var.z, nmu0Var)));
    }

    public static final String t(bbh0 bbh0Var, b0k b0kVar) {
        int i;
        int iOrdinal = bbh0Var.ordinal();
        if (iOrdinal == 0) {
            i = 2131957295;
        } else if (iOrdinal == 1) {
            i = 2131957289;
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            i = 2131957302;
        }
        return cwl1.o0(b0kVar, i);
    }

    public static final lch1 u(qxc0 qxc0Var) {
        List list = qxc0Var.N0;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ll81) it.next()).a);
        }
        x7i1 x7i1Var = qxc0Var.t;
        boolean z = x7i1Var.f;
        boolean z2 = x7i1Var.b;
        boolean z3 = x7i1Var.Z;
        boolean z4 = qxc0Var.h;
        boolean z5 = qxc0Var.X0;
        int i = qxc0Var.T0;
        Map map = qxc0Var.O0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((Number) entry.getValue()).intValue() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new lch1(arrayList, z, z2, z3, z4, z5, i, linkedHashMap.keySet(), qxc0Var.X);
    }

    public static final Next v(fa6 fa6Var, m86 m86Var) {
        q76 q76Var;
        nmu0 nmu0Var;
        j56 e56Var;
        chr0 chr0Var = fa6Var.c;
        boolean z = fa6Var.f;
        psk pskVar = fa6Var.b;
        y86 y86Var = fa6Var.a;
        if (u890.j(m86Var, k76.a)) {
            return Next.a(cwl1.j0(n56.a));
        }
        boolean z2 = m86Var instanceof u76;
        psk pskVar2 = psk.b;
        if (z2) {
            int iOrdinal = pskVar.ordinal();
            if (iOrdinal == 0) {
                boolean z3 = y86Var.g;
                boolean z4 = y86Var.e;
                if (z3 && !z4) {
                    fa6 fa6VarA = fa6.a(fa6Var, y86.a(y86Var, ((u76) m86Var).a, false, false, (ie40) null, true, false, (mvh1) null, (nmu0) null, false, false, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -8197, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                    String str = y86Var.a;
                    if (str == null) {
                        str = "";
                    }
                    return Next.i(fa6VarA, cwl1.j0(new h56(str, y86Var.C)));
                }
                if (!z4 || !z3) {
                    return Next.j();
                }
                return Next.a(cwl1.j0(new e56("spotify:internal:magpie?config=" + pskVar2 + "&uri=" + y86Var.a)));
            }
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                if (y86Var.o && y86Var.b()) {
                    u76 u76Var = (u76) m86Var;
                    return Next.h(fa6.a(fa6Var, (y86) null, false, false, (String) null, (String) null, true, u76Var.a, u76Var.b, 255));
                }
                u76 u76Var2 = (u76) m86Var;
                return Next.i(fa6.a(fa6Var, y86.a(fa6Var.a, u76Var2.a, false, false, (ie40) null, true, false, (mvh1) null, (nmu0) null, false, false, z6x.a, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -33562629, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER), cwl1.j0(new t56(u76Var2.a, u76Var2.b, y86Var.a, y86Var.x, y86Var.l, y86Var.F ? y86Var.E : null, y86Var.z)));
            }
            if (fa6Var.d && !((u76) m86Var).c) {
                return y86Var.j ? Next.j() : Next.i(fa6.a(fa6Var, y86.a(y86Var, (String) null, false, false, (ie40) null, true, false, (mvh1) null, (nmu0) null, false, false, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -8193, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER), cwl1.j0(o56.a));
            }
            u76 u76Var3 = (u76) m86Var;
            fa6 fa6VarA2 = fa6.a(fa6Var, y86.a(fa6Var.a, u76Var3.a, false, false, (ie40) null, true, false, (mvh1) null, (nmu0) null, false, false, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -8197, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER);
            String str2 = u76Var3.a;
            String str3 = u76Var3.b;
            String str4 = y86Var.a;
            xw51 xw51Var = y86Var.x;
            zk7 zk7Var = y86Var.B;
            zk7 zk7Var2 = zk7Var instanceof zk7 ? zk7Var : null;
            return Next.i(fa6VarA2, cwl1.j0(new g56(str2, str3, str4, xw51Var, zk7Var2 != null ? zk7Var2.b : null, y86Var.z, (y86Var.o && y86Var.b()) ? y86Var.n : null)));
        }
        if (m86Var instanceof w76) {
            return Next.h(fa6.a(fa6Var, y86.a(fa6Var.a, (String) null, false, false, (ie40) null, false, false, (mvh1) null, (nmu0) null, false, ((w76) m86Var).a, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -16777217, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER));
        }
        if (m86Var instanceof t76) {
            return Next.h(fa6.a(fa6Var, y86.a(fa6Var.a, (String) null, false, false, (ie40) null, false, false, (mvh1) null, (nmu0) null, false, false, (List) null, (xw51) null, ((t76) m86Var).a, (bro1) null, (Set) null, false, (z740) null, (z740) null, -1073741825, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER));
        }
        if (m86Var instanceof a76) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            a76 a76Var = (a76) m86Var;
            dxn0 dxn0Var = a76Var.a;
            String str5 = dxn0Var.a;
            int iC = l1d.C(dxn0Var.b);
            if (iC == 0) {
                linkedHashSet.add(new e56(str5));
            } else {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                linkedHashSet.add(new j56(str5, dxn0Var.c));
            }
            String str6 = a76Var.b;
            if (str6 != null) {
                linkedHashSet.add(new q56(str5, str6));
            }
            return Next.i(fa6.a(fa6Var, y86.a(fa6Var.a, (String) null, false, false, (ie40) null, false, false, (mvh1) null, (nmu0) null, false, false, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -8193, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER), linkedHashSet);
        }
        if (m86Var instanceof z66) {
            z66 z66Var = (z66) m86Var;
            return Next.i(fa6.a(fa6Var, y86.a(fa6Var.a, (String) null, false, false, (ie40) null, false, false, (mvh1) null, (nmu0) null, false, false, z66Var.a, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -33562625, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER), cwl1.j0(new w56(z66Var.a)));
        }
        if (m86Var instanceof i76) {
            z740 z740Var = y86Var.I;
            return Next.i(fa6.a(fa6Var, y86.a(y86Var, (String) null, false, false, (ie40) null, false, false, (mvh1) null, (nmu0) null, false, false, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -8193, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER), cwl1.j0(new k56(((i76) m86Var).a, y86Var.G ? z740Var != null ? new umd(z740Var) : tmd.a : smd.a)));
        }
        if (u890.j(m86Var, v76.a)) {
            return Next.i(fa6.a(fa6Var, y86.a(fa6Var.a, (String) null, false, false, (ie40) null, false, false, (mvh1) null, (nmu0) null, false, false, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -8193, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER), cwl1.j0(i56.a));
        }
        boolean z5 = m86Var instanceof d76;
        e56 e56Var2 = f56.a;
        if (z5) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            d76 d76Var = (d76) m86Var;
            dxn0 dxn0Var2 = d76Var.a;
            if ((dxn0Var2 != null ? dxn0Var2.b : 0) == 1) {
                linkedHashSet2.add(new e56(dxn0Var2.a));
            } else {
                linkedHashSet2.add(e56Var2);
            }
            String str7 = d76Var.b;
            String str8 = y86Var.a;
            if (str8 != null && str7 != null) {
                linkedHashSet2.add(new q56(str8, str7));
            }
            return Next.i(fa6.a(fa6Var, y86.a(fa6Var.a, (String) null, false, false, (ie40) null, false, false, (mvh1) null, (nmu0) null, false, false, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -8193, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER), linkedHashSet2);
        }
        if (m86Var instanceof b76) {
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            b76 b76Var = (b76) m86Var;
            String str9 = b76Var.c;
            String str10 = y86Var.a;
            if (str10 != null && str9 != null) {
                linkedHashSet3.add(new q56(str10, str9));
            }
            return Next.i(fa6.a(fa6Var, y86.a(fa6Var.a, (String) null, false, false, (ie40) null, false, false, (mvh1) null, (nmu0) null, false, false, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -8193, 1023), false, true, b76Var.a, b76Var.b, false, (String) null, (String) null, 1822), linkedHashSet3);
        }
        if (u890.j(m86Var, g86.a)) {
            if (!z || y86Var.j) {
                return Next.j();
            }
            String str11 = fa6Var.g;
            return str11 != null ? Next.i(fa6.a(fa6Var, y86.a(y86Var, (String) null, false, false, (ie40) null, true, false, (mvh1) null, (nmu0) null, false, false, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -8193, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, 1886), cwl1.j0(new s56(str11))) : Next.j();
        }
        if (u890.j(m86Var, h86.a)) {
            if (!z) {
                return Next.j();
            }
            String str12 = fa6Var.h;
            if (str12 != null) {
                e56Var2 = new e56(str12);
            }
            return Next.i(fa6.a(fa6Var, (y86) null, false, false, (String) null, (String) null, false, (String) null, (String) null, 1823), cwl1.j0(e56Var2));
        }
        if (m86Var instanceof f86) {
            fa6 fa6VarA3 = fa6.a(fa6Var, y86.a(fa6Var.a, (String) null, false, false, (ie40) null, false, false, (mvh1) null, (nmu0) null, false, false, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -8193, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, 1854);
            dxn0 dxn0Var3 = ((f86) m86Var).a;
            String str13 = dxn0Var3.a;
            int iC2 = l1d.C(dxn0Var3.b);
            if (iC2 == 0) {
                e56Var = new e56(str13);
            } else {
                if (iC2 != 1) {
                    eg.o();
                    return null;
                }
                e56Var = new j56(str13, dxn0Var3.c);
            }
            return Next.i(fa6VarA3, cwl1.j0(e56Var));
        }
        if (u890.j(m86Var, d86.a)) {
            return Next.i(fa6.a(fa6Var, y86.a(fa6Var.a, (String) null, false, false, (ie40) null, false, false, (mvh1) null, (nmu0) null, false, false, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -8193, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, 1854), cwl1.j0(d56.a));
        }
        if (m86Var instanceof e86) {
            e86 e86Var = (e86) m86Var;
            return Next.i(fa6.a(fa6Var, y86.a(fa6Var.a, (String) null, false, false, (ie40) null, false, false, (mvh1) null, (nmu0) null, false, false, e86Var.a, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -33562625, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, 1822), cwl1.j0(new w56(e86Var.a)));
        }
        if (m86Var instanceof c76) {
            c76 c76Var = (c76) m86Var;
            return Next.i(fa6.a(fa6Var, y86.a(fa6Var.a, (String) null, false, false, (ie40) null, false, false, (mvh1) null, (nmu0) null, false, false, c76Var.a, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -33562625, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER), cwl1.j0(new w56(c76Var.a)));
        }
        if (m86Var instanceof z76) {
            n46[] n46VarArr = (n46[]) y86Var.u.toArray(new n46[0]);
            ArrayList arrayListO = p7h.O(Arrays.copyOf(n46VarArr, n46VarArr.length));
            arrayListO.add(((z76) m86Var).b);
            return Next.h(fa6.a(fa6Var, y86.a(fa6Var.a, (String) null, false, false, (ie40) null, false, true, (mvh1) null, (nmu0) null, false, false, arrayListO, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -33570817, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER));
        }
        if (m86Var instanceof a86) {
            List list = y86Var.u;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((n46) obj) instanceof m46)) {
                    arrayList.add(obj);
                }
            }
            return Next.h(fa6.a(fa6Var, y86.a(y86Var, (String) null, false, false, (ie40) null, false, false, (mvh1) null, (nmu0) null, false, false, arrayList, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -33570817, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER));
        }
        if (m86Var instanceof j86) {
            return Next.a(cwl1.j0(new w56(((j86) m86Var).a)));
        }
        if (m86Var instanceof i86) {
            y86 y86Var2 = fa6Var.a;
            i86 i86Var = (i86) m86Var;
            y86 y86VarA = y86.a(y86Var2, (String) null, false, false, (ie40) null, false, false, i86Var.a, (nmu0) null, false, false, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -8454145, 1023);
            String str14 = y86Var2.a;
            return (str14 == null || chr0Var == chr0.b) ? Next.h(fa6.a(fa6Var, y86VarA, false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER)) : Next.i(fa6.a(fa6Var, y86VarA, false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER), cwl1.j0(new u56(str14, y86Var2.v, i86Var.a)));
        }
        if (m86Var instanceof g76) {
            return Next.h(fa6.a(fa6Var, y86.a(fa6Var.a, (String) null, false, false, (ie40) null, false, false, ((g76) m86Var).a, (nmu0) null, false, false, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -65537, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER));
        }
        if (u890.j(m86Var, f76.a)) {
            return Next.j();
        }
        if (m86Var instanceof q76) {
            String str15 = y86Var.a;
            if (y86Var.p || (nmu0Var = (q76Var = (q76) m86Var).a) == y86Var.n) {
                return Next.j();
            }
            return (str15 == null || pskVar != psk.c) ? Next.h(fa6.a(fa6Var, y86.a(y86Var, (String) null, false, false, (ie40) null, false, false, (mvh1) null, nmu0Var, false, false, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -262145, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER)) : Next.i(fa6.a(fa6Var, y86.a(y86Var, (String) null, false, false, (ie40) null, false, false, (mvh1) null, (nmu0) null, true, false, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -1048577, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER), cwl1.j0(new v56(str15, y86Var.v, q76Var.a)));
        }
        if (m86Var instanceof p76) {
            return s(fa6Var, ((p76) m86Var).a);
        }
        if (u890.j(m86Var, o76.a)) {
            return Next.h(fa6.a(fa6Var, (y86) null, false, false, (String) null, (String) null, false, (String) null, (String) null, 255));
        }
        if (m86Var instanceof s76) {
            return Next.h(fa6.a(fa6Var, y86.a(fa6Var.a, (String) null, false, false, (ie40) null, false, false, (mvh1) null, ((s76) m86Var).a, false, false, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -1310721, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER));
        }
        if (u890.j(m86Var, r76.a)) {
            return Next.i(fa6.a(fa6Var, y86.a(fa6Var.a, (String) null, false, false, (ie40) null, false, false, (mvh1) null, (nmu0) null, false, false, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -1048577, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER), cwl1.j0(p56.a));
        }
        if (u890.j(m86Var, j76.a)) {
            return Next.a(cwl1.j0(new e56("spotify:internal:magpie?config=" + pskVar2 + "&uri=" + y86Var.a)));
        }
        if (m86Var instanceof k86) {
            k86 k86Var = (k86) m86Var;
            return Next.h(fa6.a(fa6Var, y86.a(fa6Var.a, (String) null, false, false, (ie40) null, false, false, (mvh1) null, (nmu0) null, false, false, (List) null, new xw51(k86Var.a, k86Var.b), (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -268435457, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER));
        }
        if (u890.j(m86Var, l86.a)) {
            return Next.a(cwl1.j0(m56.a));
        }
        if (m86Var instanceof c86) {
            Set<Map.Entry> setEntrySet = ((c86) m86Var).a.entrySet();
            Set setX0 = y86Var.E;
            for (Map.Entry entry : setEntrySet) {
                String str16 = (String) entry.getKey();
                setX0 = ((Boolean) entry.getValue()).booleanValue() ? dm61.x0(str16, setX0) : dm61.u0(str16, setX0);
            }
            return Next.h(fa6.a(fa6Var, y86.a(fa6Var.a, (String) null, false, false, (ie40) null, false, false, (mvh1) null, (nmu0) null, false, false, (List) null, (xw51) null, (String) null, (bro1) null, setX0, false, (z740) null, (z740) null, -1, 999), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER));
        }
        if (m86Var instanceof e76) {
            return Next.h(fa6.a(fa6Var, y86.a(fa6Var.a, (String) null, false, false, (ie40) null, false, false, (mvh1) null, (nmu0) null, false, false, (List) null, (xw51) null, (String) null, ((e76) m86Var).a, (Set) null, false, (z740) null, (z740) null, -1, 1022), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER));
        }
        if (m86Var instanceof l76) {
            return Next.a(cwl1.j0(new l56(jzn1.s(chr0Var), ((l76) m86Var).a)));
        }
        if (u890.j(m86Var, m76.a)) {
            return Next.j();
        }
        if (m86Var instanceof y76) {
            return Next.j();
        }
        if (m86Var instanceof x76) {
            return Next.h(fa6.a(fa6Var, y86.a(fa6Var.a, ((x76) m86Var).a, false, false, (ie40) null, false, false, (mvh1) null, (nmu0) null, false, false, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -5, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER));
        }
        if (!(m86Var instanceof n76)) {
            if (m86Var instanceof h76) {
                h76 h76Var = (h76) m86Var;
                return Next.h(fa6.a(fa6Var, y86.a(fa6Var.a, (String) null, h76Var.b, h76Var.a, (ie40) null, false, false, (mvh1) null, (nmu0) null, false, false, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, h76Var.c, -3073, 767), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER));
            }
            if (m86Var instanceof b86) {
                b86 b86Var = (b86) m86Var;
                return Next.h(fa6.a(fa6Var, y86.a(fa6Var.a, (String) null, false, false, (ie40) null, false, false, (mvh1) null, (nmu0) null, false, false, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, b86Var.a, b86Var.b, (z740) null, -1, 831), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER));
            }
            eg.o();
            return null;
        }
        n76 n76Var = (n76) m86Var;
        am10 am10Var = n76Var.a;
        y86 y86Var3 = fa6Var.a;
        boolean z6 = am10Var instanceof zl10;
        boolean z7 = z6 || y86Var3.h;
        ie40 he40Var = ge40.a;
        if (!z6) {
            if (!(am10Var instanceof yl10)) {
                eg.o();
                return null;
            }
            yl10 yl10Var = (yl10) am10Var;
            boolean z8 = yl10Var.b instanceof ld;
            omo1 omo1Var = yl10Var.c;
            f1i1 f1i1Var = omo1Var instanceof f1i1 ? (f1i1) omo1Var : null;
            boolean z9 = (f1i1Var != null ? f1i1Var.c : null) instanceof d1i1;
            if (z8 && z9) {
                he40Var = new he40(n76Var.b, yl10Var.a);
            }
        }
        return Next.h(fa6.a(fa6Var, y86.a(y86Var3, (String) null, z7, false, he40Var, false, false, (mvh1) null, (nmu0) null, false, false, (List) null, (xw51) null, (String) null, (bro1) null, (Set) null, false, (z740) null, (z740) null, -5121, 1023), false, false, (String) null, (String) null, false, (String) null, (String) null, Entity.AUTOCOMPLETE_FIELD_NUMBER));
    }

    public static int w(Object obj) {
        return (int) (((long) Integer.rotateLeft((int) (((long) (obj == null ? 0 : obj.hashCode())) * (-862048943)), 15)) * 461845907);
    }
}
