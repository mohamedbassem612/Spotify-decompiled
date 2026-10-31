package p;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n7h0 {
    public final b6h0 a;
    public final m6q b;
    public final o6q c;
    public final kvp d;
    public final mpa1 e;
    public final g38 f;
    public final r3d g;
    public final x6h0 h;
    public final j2e0 i;
    public final ruz j;
    public final p7h0 k;
    public final cnc0 l;
    public final h3h1 m;
    public final boolean n;
    public final boolean o;

    public n7h0(b6h0 b6h0Var, m6q m6qVar, o6q o6qVar, kvp kvpVar, mpa1 mpa1Var, g38 g38Var, r3d r3dVar, x6h0 x6h0Var, j2e0 j2e0Var, lzn0 lzn0Var, ruz ruzVar, p7h0 p7h0Var, cnc0 cnc0Var, h3h1 h3h1Var) {
        this.a = b6h0Var;
        this.b = m6qVar;
        this.c = o6qVar;
        this.d = kvpVar;
        this.e = mpa1Var;
        this.f = g38Var;
        this.g = r3dVar;
        this.h = x6h0Var;
        this.i = j2e0Var;
        this.j = ruzVar;
        this.k = p7h0Var;
        this.l = cnc0Var;
        this.m = h3h1Var;
        boolean z = x6h0Var.a instanceof m6h0;
        this.n = z;
        this.o = !z;
    }

    public static final boolean b(ven0 ven0Var) {
        return ((Boolean) ven0Var.getValue()).booleanValue();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:324:0x090b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r1v44, types: [int] */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v53 */
    public final void a(iu30 iu30Var, boolean z, boolean z2, boolean z3, zh80 zh80Var, boolean z4, boolean z5, Function0 function0, boolean z6, String str, boolean z7, boolean z8, j2e0 j2e0Var, String str2, boolean z9, boolean z10, boolean z11, boolean z12, Function0 function1, Function0 function2, boolean z13, Uri uri, boolean z14, lg01 lg01Var, boolean z15, boolean z16, Function0 function3, Function0 function4, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        b0k b0kVar2;
        qim0 qim0Var2;
        Object obj;
        tob1 tob1Var;
        hdn0 hdn0Var;
        Boolean bool;
        b0k b0kVar3;
        tob1 tob1Var2;
        tob1 tob1Var3;
        Object obj2;
        q1d0 q1d0Var;
        int i2;
        Object obj3;
        int i3;
        float f;
        be50 be50Var;
        boolean z17;
        qim0 qim0VarF;
        float f2;
        boolean z18;
        d36 d36Var;
        boolean z19;
        iu30 iu30Var2;
        j2e0 j2e0Var2;
        m4c m4cVar;
        float f3;
        ?? r0;
        boolean z20;
        Object obj4;
        ?? r6;
        Object obj5;
        b0k b0kVar4 = (x340) b0kVar;
        b0kVar4.k0(-399087084);
        int i4 = i | (b0kVar4.i(iu30Var) ? 4 : 2) | (b0kVar4.h(z) ? 32 : 16) | (b0kVar4.h(z2) ? 256 : 128) | (b0kVar4.h(z3) ? 2048 : 1024) | (b0kVar4.e(zh80Var.ordinal()) ? 16384 : 8192) | (b0kVar4.h(z4) ? 131072 : 65536) | (b0kVar4.h(z5) ? 1048576 : 524288) | (b0kVar4.i(function0) ? 8388608 : 4194304) | (b0kVar4.h(z6) ? 67108864 : 33554432) | (b0kVar4.g(str) ? 536870912 : 268435456);
        int i5 = (b0kVar4.h(z7) ? 4 : 2) | (b0kVar4.h(z8) ? 32 : 16) | (b0kVar4.g(j2e0Var) ? 256 : 128) | (b0kVar4.g(str2) ? 2048 : 1024) | (b0kVar4.h(false) ? 16384 : 8192) | (b0kVar4.h(z9) ? 131072 : 65536) | (b0kVar4.h(z10) ? 1048576 : 524288) | (b0kVar4.h(z11) ? 8388608 : 4194304) | (b0kVar4.h(z12) ? 67108864 : 33554432) | (b0kVar4.i(function1) ? 536870912 : 268435456);
        int i6 = (b0kVar4.i(function2) ? 4 : 2) | (b0kVar4.h(z13) ? 32 : 16) | (b0kVar4.g(uri) ? 256 : 128) | (b0kVar4.h(z14) ? 2048 : 1024) | (b0kVar4.i(lg01Var) ? 16384 : 8192) | (b0kVar4.h(z15) ? 131072 : 65536) | (b0kVar4.h(z16) ? 1048576 : 524288) | (b0kVar4.i(function3) ? 8388608 : 4194304) | (b0kVar4.i(function4) ? 67108864 : 33554432) | 805306368;
        int i7 = b0kVar4.i(this) ? 4 : 2;
        if (b0kVar4.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 306783379) == 306783378 && (i6 & 306783379) == 306783378 && (i7 & 3) == 2) ? false : true)) {
            xtb0 xtb0VarA = aub0.a(0, b0kVar4, 3);
            Object objT = b0kVar4.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                obj = objT;
                c9n c9nVarM = qxd0.M(o6x.a, b0kVar4);
                b0kVar4.s0(c9nVarM);
                obj = c9nVarM;
            }
            obj = objT;
            c9n c9nVar = (c9n) obj;
            q1d0 q1d0VarN = jyo1.n(xtb0VarA, this.l, this.m, b0kVar4, 0);
            x6h0 x6h0Var = this.h;
            s6h0 s6h0Var = x6h0Var.a;
            ?? r5 = ((s6h0Var instanceof j6h0) || (s6h0Var instanceof q6h0)) ? 1 : 0;
            int i8 = i4 << 6;
            wat watVar = (wat) b0kVar4.k(t4k.h);
            ven0 ven0VarS = v8r.s(iu30Var, b0kVar4);
            Object objT2 = b0kVar4.T();
            Object objH = objT2;
            if (objT2 == m4cVar2) {
                objH = bb00.h(0, b0kVar4);
            }
            err0 err0Var = (hdn0) objH;
            Object objT3 = b0kVar4.T();
            Object objO = objT3;
            if (objT3 == m4cVar2) {
                objO = ktd.o(0.0f, b0kVar4);
            }
            tob1 tob1Var4 = (ven0) objO;
            Object objT4 = b0kVar4.T();
            Object objL = objT4;
            if (objT4 == m4cVar2) {
                objL = c13.l((boolean) r5, b0kVar4);
            }
            tob1 tob1Var5 = (ven0) objL;
            Object objT5 = b0kVar4.T();
            Object objH2 = objT5;
            if (objT5 == m4cVar2) {
                objH2 = bb00.h((int) r5, b0kVar4);
            }
            hdn0 hdn0Var2 = (hdn0) objH2;
            ?? r21 = r5;
            Object objT6 = b0kVar4.T();
            Object obj6 = objT6;
            if (objT6 == m4cVar2) {
                hrr0 hrr0VarQ = v8r.q((Object) null);
                b0kVar4.s0(hrr0VarQ);
                obj6 = hrr0VarQ;
            }
            tob1 tob1Var6 = (ven0) obj6;
            Object objT7 = b0kVar4.T();
            Object obj7 = objT7;
            if (objT7 == m4cVar2) {
                hrr0 hrr0VarQ2 = v8r.q((Object) null);
                b0kVar4.s0(hrr0VarQ2);
                obj7 = hrr0VarQ2;
            }
            ven0 ven0Var = (ven0) obj7;
            Object objT8 = b0kVar4.T();
            Object obj8 = objT8;
            if (objT8 == m4cVar2) {
                hrr0 hrr0VarQ3 = v8r.q(Boolean.FALSE);
                b0kVar4.s0(hrr0VarQ3);
                obj8 = hrr0VarQ3;
            }
            ven0 ven0Var2 = (ven0) obj8;
            Boolean boolValueOf = Boolean.valueOf(z4);
            boolean zH = b0kVar4.h(z4) | b0kVar4.i(hdn0Var2) | b0kVar4.i(tob1Var5) | b0kVar4.i(tob1Var6) | b0kVar4.i(ven0Var) | b0kVar4.i(ven0Var2) | b0kVar4.i(tob1Var4);
            Object objT9 = b0kVar4.T();
            if (zH || objT9 == m4cVar2) {
                tob1Var = tob1Var6;
                hdn0Var = hdn0Var2;
                bool = boolValueOf;
                b0kVar3 = b0kVar4;
                tob1Var2 = tob1Var4;
                tob1Var3 = tob1Var5;
                af0 af0Var = new af0(z4, hdn0Var, tob1Var3, tob1Var, ven0Var, ven0Var2, tob1Var2, (lnm) null, (byte) 14);
                b0kVar3.s0(af0Var);
                obj2 = af0Var;
            } else {
                tob1Var = tob1Var6;
                hdn0Var = hdn0Var2;
                bool = boolValueOf;
                b0kVar3 = b0kVar4;
                tob1Var2 = tob1Var4;
                tob1Var3 = tob1Var5;
                obj2 = objT9;
            }
            qxd0.t(bool, b0kVar3, (vu30) obj2);
            boolean zI = b0kVar3.i(ven0Var) | b0kVar3.i(q1d0VarN) | b0kVar3.i(tob1Var) | b0kVar3.i(tob1Var3) | b0kVar3.i(hdn0Var) | b0kVar3.i(ven0VarS);
            Object objT10 = b0kVar3.T();
            if (zI || objT10 == m4cVar2) {
                objT10 = new j96(q1d0VarN, ven0Var, tob1Var, tob1Var3, hdn0Var, ven0VarS);
                q1d0Var = q1d0VarN;
                b0kVar3.s0(objT10);
            } else {
                q1d0Var = q1d0VarN;
            }
            iu30 iu30Var3 = (iu30) objT10;
            Integer numValueOf = Integer.valueOf(((err0) hdn0Var).s());
            boolean zI2 = b0kVar3.i(hdn0Var) | b0kVar3.i(err0Var) | b0kVar3.i(ven0Var) | b0kVar3.i(q1d0Var) | b0kVar3.i(tob1Var) | b0kVar3.e(0) | b0kVar3.i(tob1Var2) | b0kVar3.i(watVar) | b0kVar3.i(ven0Var2) | b0kVar3.i(xtb0VarA);
            Object objT11 = b0kVar3.T();
            if (zI2 || objT11 == m4cVar2) {
                objT11 = new zvy(q1d0Var, hdn0Var, err0Var, ven0Var, tob1Var, watVar, xtb0VarA, tob1Var2, ven0Var2, (lnm) null);
                b0kVar3.s0(objT11);
            }
            qxd0.t(numValueOf, b0kVar3, (vu30) objT11);
            Boolean bool2 = (Boolean) tob1Var3.getValue();
            bool2.getClass();
            Integer num = (Integer) tob1Var.getValue();
            Integer numValueOf2 = Integer.valueOf(err0Var.s());
            boolean zI3 = b0kVar3.i(tob1Var) | b0kVar3.i(tob1Var3) | b0kVar3.i(err0Var) | b0kVar3.i(xtb0VarA) | b0kVar3.i(ven0Var2) | b0kVar3.i(watVar) | b0kVar3.i(tob1Var2);
            Object objT12 = b0kVar3.T();
            if (zI3 || objT12 == m4cVar2) {
                objT12 = new zn0(tob1Var, tob1Var3, err0Var, xtb0VarA, watVar, ven0Var2, tob1Var2, (lnm) null, (byte) 15);
                b0kVar3.s0(objT12);
            }
            qxd0.r(bool2, num, numValueOf2, (vu30) objT12, b0kVar3);
            Boolean bool3 = (Boolean) tob1Var3.getValue();
            bool3.getClass();
            Integer num2 = (Integer) tob1Var.getValue();
            boolean zI4 = b0kVar3.i(tob1Var) | b0kVar3.i(tob1Var3) | b0kVar3.i(xtb0VarA) | b0kVar3.i(ven0Var2);
            Object objT13 = b0kVar3.T();
            if (zI4 || objT13 == m4cVar2) {
                objT13 = new z290(tob1Var, tob1Var3, xtb0VarA, ven0Var2, (lnm) null, (byte) 22);
                b0kVar3.s0(objT13);
            }
            qxd0.s(bool3, num2, (vu30) objT13, b0kVar3);
            float f4 = ((Boolean) tob1Var3.getValue()).booleanValue() ? ((p3v) tob1Var2.getValue()).a : 0.0f;
            boolean zI5 = b0kVar3.i(err0Var);
            Object objT14 = b0kVar3.T();
            if (zI5 || objT14 == m4cVar2) {
                i2 = 0;
                myg0 myg0Var = new myg0(err0Var, (byte) 0);
                b0kVar3.s0(myg0Var);
                obj3 = myg0Var;
            } else {
                i2 = 0;
                obj3 = objT14;
            }
            fyg0 fyg0Var = new fyg0(iu30Var3, f4, (iu30) obj3);
            ven0 ven0VarH = rwq.h(q1d0Var.b, b0kVar3, i2);
            s6h0 s6h0Var2 = x6h0Var.a;
            p6h0 p6h0Var = s6h0Var2 instanceof p6h0 ? (p6h0) s6h0Var2 : null;
            String str3 = p6h0Var != null ? p6h0Var.b : null;
            if (str3 != null) {
                b0kVar3.i0(-731975279);
                i1o1.h(xtb0VarA, q1d0Var, str3, b0kVar3, 64);
                b0kVar3.r(false);
            } else if (r21 == 0) {
                b0kVar3.i0(-731784133);
                List list = ((rnc0) ven0VarH.getValue()).b;
                if ((list instanceof Collection) && list.isEmpty()) {
                    i3 = 0;
                } else {
                    Iterator it = list.iterator();
                    i3 = 0;
                    while (it.hasNext()) {
                        if (!(((h8k1) it.next()).a instanceof q5h0) && (i3 = i3 + 1) < 0) {
                            p7h.S();
                            throw null;
                        }
                    }
                }
                i1o1.a(xtb0VarA, i3, b0kVar3, 0);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-731642866);
                b0kVar3.r(false);
            }
            kiv kivVar = t4k.h;
            wat watVar2 = (wat) b0kVar3.k(kivVar);
            Object objT15 = b0kVar3.T();
            Object objI = objT15;
            if (objT15 == m4cVar2) {
                objI = us71.i(0.0f, b0kVar3);
            }
            drr0 drr0Var = (drr0) objI;
            boolean z21 = (!z6 || str == null || str.length() == 0 || z8) ? false : true;
            be50 be50VarA = he50.a(b0kVar3);
            Object objT16 = b0kVar3.T();
            Object objH3 = objT16;
            if (objT16 == m4cVar2) {
                objH3 = kaa0.h(0L, b0kVar3);
            }
            ven0 ven0Var3 = (ven0) objH3;
            Object objT17 = b0kVar3.T();
            Object obj9 = objT17;
            if (objT17 == m4cVar2) {
                bs91 bs91Var = new bs91();
                b0kVar3.s0(bs91Var);
                obj9 = bs91Var;
            }
            bs91 bs91Var2 = (bs91) obj9;
            String strO0 = cwl1.o0(b0kVar3, 2131958339);
            boolean zI6 = b0kVar3.i(c9nVar) | b0kVar3.i(bs91Var2);
            Object objT18 = b0kVar3.T();
            Object obj10 = objT18;
            if (zI6 || objT18 == m4cVar2) {
                gqa0 gqa0Var = new gqa0(c9nVar, bs91Var2, (byte) 1);
                b0kVar3.s0(gqa0Var);
                obj10 = gqa0Var;
            }
            iu30 iu30Var4 = (iu30) obj10;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarY = too1.y(qim0VarD, lhc.g(b0kVar3).c);
            boolean z22 = z21;
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarY);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z23 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z23) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf3 = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf3, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            qim0 qim0VarR = i1p1.r(new wnb0(1.0f, true));
            boolean zG = b0kVar3.g(fyg0Var);
            Object objT19 = b0kVar3.T();
            Object obj11 = objT19;
            if (zG || objT19 == m4cVar2) {
                z6h0 z6h0Var = new z6h0(fyg0Var, (byte) 1);
                b0kVar3.s0(z6h0Var);
                obj11 = z6h0Var;
            }
            qim0 qim0VarU = lrn1.u(qim0VarR, (iu30) obj11);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarU);
            q1d0 q1d0Var2 = q1d0Var;
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(gfh0VarC, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            if (z6) {
                b0kVar3.i0(353042887);
                float fN0 = watVar2.N0(drr0Var.s());
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                f = fN0 + 16.0f;
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(353145745);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                b0kVar3.r(false);
                f = 16.0f;
            }
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            float f5 = cbx.b(b0kVar3).b.c;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            float f6 = f5 - 16.0f;
            h8k1 h8k1Var = (h8k1) o7h.C0(((rnc0) ven0VarH.getValue()).b);
            boolean z24 = (h8k1Var != null ? h8k1Var.a : null) instanceof y5h0;
            qim0 qim0VarD2 = u291.d(qim0Var3, 1.0f);
            if (z22) {
                b0kVar3.i0(353687439);
                boolean zI7 = b0kVar3.i(ven0Var3);
                Object objT20 = b0kVar3.T();
                if (zI7 || objT20 == m4cVar2) {
                    obj5 = objT20;
                    sqa0 sqa0Var = new sqa0(ven0Var3, (byte) 24);
                    b0kVar3.s0(sqa0Var);
                    obj5 = sqa0Var;
                }
                qim0 qim0VarX = ern1.x(qim0Var3, (iu30) obj5);
                be50Var = be50VarA;
                boolean zI8 = b0kVar3.i(be50Var);
                Object objT21 = b0kVar3.T();
                Object obj12 = objT21;
                if (zI8 || objT21 == m4cVar2) {
                    tnd tndVar = new tnd(be50Var, (byte) 1);
                    b0kVar3.s0(tndVar);
                    obj12 = tndVar;
                }
                qim0VarF = dug.f(exd0.s(qim0VarX, (iu30) obj12), cbx.a(b0kVar3).a.c, d4o1.a);
                z17 = false;
                b0kVar3.r(false);
            } else {
                be50Var = be50VarA;
                z17 = false;
                b0kVar3.i0(354274300);
                b0kVar3.r(false);
                qim0VarF = qim0Var3;
            }
            qim0 qim0VarN = anm1.N("martini-page-list", qim0VarD2.then(qim0VarF));
            p3v p3vVar = new p3v(fyg0Var.b);
            if (z24) {
                b0kVar3.i0(-1235485222);
                b0kVar3.r(z17);
                f2 = 0.0f;
            } else {
                b0kVar3.i0(-1235484100);
                cvx cvxVar5 = cbx.b(b0kVar3).b;
                b0kVar3.r(z17);
                f2 = 16.0f;
            }
            zzq0 zzq0VarJ = uyn1.j(0.0f, f, 0.0f, pap1.y(p3vVar, new p3v(f2)).a, 5);
            if (z4) {
                b0kVar3.i0(354872290);
                cvx cvxVar6 = cbx.b(b0kVar3).b;
                z18 = false;
                d36Var = new d36(12.0f, false, new g21(een.O0, (byte) 28));
                b0kVar3.r(false);
                z19 = true;
            } else {
                z18 = false;
                b0kVar3.i0(354980759);
                cvx cvxVar7 = cbx.b(b0kVar3).b;
                z19 = true;
                d36Var = new d36(16.0f, true, new um5(false));
                b0kVar3.r(false);
            }
            d36 d36Var2 = d36Var;
            boolean zI9 = b0kVar3.i(q1d0Var2) | b0kVar3.i(ven0VarH) | b0kVar3.d(f6) | b0kVar3.d(16.0f);
            Object objT22 = b0kVar3.T();
            Object obj13 = objT22;
            if (zI9 || objT22 == m4cVar2) {
                ja5 ja5Var = new ja5(q1d0Var2, ven0VarH, f6, (byte) 5);
                b0kVar3.s0(ja5Var);
                obj13 = ja5Var;
            }
            b0k b0kVar5 = b0kVar3;
            ujo1.d(qim0VarN, xtb0VarA, zzq0VarJ, false, d36Var2, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) obj13, b0kVar5, 0, 488);
            b0kVar2 = b0kVar5;
            h2c h2cVar = h2c.a;
            if (z6) {
                b0kVar2.i0(356346154);
                be50 be50Var2 = z22 ? be50Var : null;
                long j = ((Offset) ven0Var3.getValue()).a;
                qim0 qim0VarX2 = lrn1.x(h2cVar.a(qim0Var3, een.e), 2.0f);
                boolean zI10 = b0kVar2.i(drr0Var);
                Object objT23 = b0kVar2.T();
                Object obj14 = objT23;
                if (zI10 || objT23 == m4cVar2) {
                    qg6 qg6Var = new qg6(drr0Var, (byte) 19);
                    b0kVar2.s0(qg6Var);
                    obj14 = qg6Var;
                }
                qim0 qim0VarU2 = lrn1.u(qim0VarX2, (iu30) obj14);
                int i9 = i5 << 6;
                int i10 = ((
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0846: ARITH (r8v35 'i10' int) = (wrap int:0x0843: ARITH (wrap int:0x083e: ARITH (wrap int:0x0838: ARITH (wrap int:0x0836: ARITH (wrap int:0x0834: ARITH (r16v10 int) >> (24 int) A[WRAPPED]) & (112 int) A[WRAPPED]) | (6 int) A[DONT_WRAP, WRAPPED]) | (wrap int:0x083c: ARITH (r11v45 'i9' int) & (896 int) A[WRAPPED]) A[DONT_WRAP, WRAPPED]) | (wrap int:0x0841: ARITH (wrap int:0x083f: ARITH (r5v13 'i4' int) << (9 int) A[WRAPPED]) & (7168 int) A[WRAPPED]) A[DONT_WRAP, WRAPPED]) | (wrap int:0x0844: ARITH (r11v45 'i9' int) & (57344 int) A[WRAPPED]) A[DECLARE_VAR] in method: p.n7h0.a(p.iu30, boolean, boolean, boolean, p.zh80, boolean, boolean, kotlin.jvm.functions.Function0, boolean, java.lang.String, boolean, boolean, p.j2e0, java.lang.String, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, android.net.Uri, boolean, p.lg01, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes9.dex
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
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v10 int
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 2784
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.n7h0.a(p.iu30, boolean, boolean, boolean, p.zh80, boolean, boolean, kotlin.jvm.functions.Function0, boolean, java.lang.String, boolean, boolean, p.j2e0, java.lang.String, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, android.net.Uri, boolean, p.lg01, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.qim0, p.b0k, int):void");
            }

            public final void c(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
                qim0 qim0Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(1179042979);
                int i2 = i | (x340Var.i(iu30Var) ? 4 : 2) | 48 | (x340Var.i(this) ? 256 : 128);
                if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                    Object objT = x340Var.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        mhg0 mhg0Var = new mhg0(iu30Var, (byte) 7);
                        m6q m6qVar = this.b;
                        switch (m6qVar.a) {
                            case 0:
                                s7q s7qVar = (s7q) m6qVar.b.d;
                                daq daqVar = s7qVar.b;
                                objT = new ni60(new ii60((q8n) daqVar.V2.get(), (q8n) daqVar.E1.get(), (kt91) daqVar.f8.get(), new gal((jr2) daqVar.gq.get(), new mp8((yqg) daqVar.J1.get(), (byte) 28), (byte) 8), (a2n) daqVar.hq.get()), new bm00((n6q) s7qVar.K6.get(), (byte) 14), mhg0Var);
                                break;
                            default:
                                teq teqVar = ((thq) m6qVar.b).c;
                                daq daqVar2 = teqVar.a.a;
                                objT = new ni60(new ii60((q8n) daqVar2.V2.get(), (q8n) daqVar2.E1.get(), (kt91) daqVar2.f8.get(), new gal((jr2) daqVar2.gq.get(), new mp8((yqg) daqVar2.J1.get(), (byte) 28), (byte) 8), (a2n) daqVar2.hq.get()), new bm00((n6q) teqVar.a.g9.get(), (byte) 14), mhg0Var);
                                break;
                        }
                        x340Var.s0(objT);
                    }
                    ni60 ni60Var = (ni60) objT;
                    qim0 qim0Var3 = nim0.a;
                    qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
                    boolean zI = x340Var.i(this);
                    Object objT2 = x340Var.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new i7h0(this, (byte) 0);
                        x340Var.s0(objT2);
                    }
                    dgo1.c(ni60Var, (iu30) objT2, apo.r(2025122149, new mbf0(ni60Var, (byte) 24), x340Var), x340Var, 384);
                    x340Var.r(true);
                    qim0Var2 = qim0Var3;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new rvg0(this, iu30Var, qim0Var2, i, (byte) 5);
                }
            }

            public final void d(iu30 iu30Var, boolean z, boolean z2, boolean z3, boolean z4, Function0 function0, boolean z5, boolean z6, Function0 function1, String str, iu30 iu30Var2, boolean z7, Uri uri, boolean z8, boolean z9, boolean z10, Function0 function2, Function0 function3, qim0 qim0Var, b0k b0kVar, int i) {
                int i2;
                Function0 function4;
                lz20 lz20Var;
                tob1 tob1Var;
                ven0 ven0Var;
                byte b;
                boolean z11;
                boolean z12;
                xi80 xi80Var;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1024792540);
                if ((i & 6) == 0) {
                    i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var.h(z) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= x340Var.h(z2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i2 |= x340Var.h(z3) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    i2 |= x340Var.h(z4) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    function4 = function0;
                    i2 |= x340Var.i(function4) ? 131072 : 65536;
                } else {
                    function4 = function0;
                }
                if ((i & 1572864) == 0) {
                    i2 |= x340Var.h(z5) ? 1048576 : 524288;
                }
                if ((i & 12582912) == 0) {
                    i2 |= x340Var.h(z6) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    i2 |= x340Var.i(function1) ? 67108864 : 33554432;
                }
                if ((i & 805306368) == 0) {
                    i2 |= x340Var.g(str) ? 536870912 : 268435456;
                }
                int i3 = i2;
                int i4 = (x340Var.i(iu30Var2) ? (char) 4 : (char) 2) | (x340Var.h(z7) ? ' ' : (char) 16) | (x340Var.g(uri) ? (char) 256 : (char) 128) | (x340Var.h(z8) ? (char) 2048 : (char) 1024) | (x340Var.h(z9) ? (char) 16384 : (char) 8192) | (x340Var.h(z10) ? (char) 0 : (char) 0) | (x340Var.i(function2) ? (char) 0 : (char) 0) | (x340Var.i(function3) ? (char) 0 : (char) 0) | (x340Var.i(qim0Var) ? (char) 0 : (char) 0) | (x340Var.i(this) ? (char) 0 : (char) 0);
                if (x340Var.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 306783379) == 306783378) ? false : true)) {
                    Object objT = x340Var.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = pzm.i(x340Var);
                    }
                    lz20 lz20Var2 = (lz20) objT;
                    k6a1 k6a1Var = (k6a1) x340Var.k(t4k.q);
                    x6h0 x6h0Var = this.h;
                    if (!x6h0Var.c || z4) {
                        lz20Var = lz20Var2;
                        x340Var.i0(-966032130);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-966170514);
                        lz20Var = lz20Var2;
                        boolean zI = x340Var.i(lz20Var2) | x340Var.i(k6a1Var) | ((i3 & 458752) == 131072);
                        Object objT2 = x340Var.T();
                        if (zI || objT2 == m4cVar) {
                            objT2 = new az80(lz20Var, k6a1Var, function4, false, (lnm) null, (byte) 18);
                            x340Var.s0(objT2);
                        }
                        qxd0.t(rih1.a, x340Var, (vu30) objT2);
                        x340Var.r(false);
                    }
                    Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
                    ven0 ven0VarS = v8r.s(iu30Var, x340Var);
                    ven0 ven0VarS2 = v8r.s(function1, x340Var);
                    ven0 ven0VarS3 = v8r.s(function2, x340Var);
                    ven0 ven0VarS4 = v8r.s(str, x340Var);
                    ven0 ven0VarS5 = v8r.s(iu30Var2, x340Var);
                    Object objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = v8r.q(Boolean.FALSE);
                        x340Var.s0(objT3);
                    }
                    ven0 ven0Var2 = (ven0) objT3;
                    Object objT4 = x340Var.T();
                    if (objT4 == m4cVar) {
                        objT4 = v8r.q(Boolean.FALSE);
                        x340Var.s0(objT4);
                    }
                    tob1 tob1Var2 = (ven0) objT4;
                    boolean zG = x340Var.g(this.g);
                    Object objT5 = x340Var.T();
                    if (zG || objT5 == m4cVar) {
                        tob1Var = tob1Var2;
                        ven0Var = ven0VarS;
                        objT5 = new k7h0(this, ven0Var2, tob1Var, ven0Var, (byte) 0);
                        x340Var.s0(objT5);
                    } else {
                        tob1Var = tob1Var2;
                        ven0Var = ven0VarS;
                    }
                    Function0 function5 = (Function0) objT5;
                    if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                        x340Var.i0(-964894337);
                        String strO0 = cwl1.o0(x340Var, 2131958210);
                        String strO1 = cwl1.o0(x340Var, 2131958209);
                        String strO2 = cwl1.o0(x340Var, 2131958207);
                        String strO3 = cwl1.o0(x340Var, 2131958206);
                        boolean zI2 = x340Var.i(ven0Var2);
                        Object objT6 = x340Var.T();
                        if (zI2 || objT6 == m4cVar) {
                            objT6 = new c470(ven0Var2, (byte) 22);
                            x340Var.s0(objT6);
                        }
                        Function0 function6 = (Function0) objT6;
                        boolean zI3 = x340Var.i(ven0Var2) | x340Var.g(function5);
                        Object objT7 = x340Var.T();
                        if (zI3 || objT7 == m4cVar) {
                            objT7 = new cb(ven0Var2, function5, (byte) 27);
                            x340Var.s0(objT7);
                        }
                        Function0 function7 = (Function0) objT7;
                        if (ihc1.y0(strO2)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return;
                        }
                        zgx zgxVar = new zgx(strO2, new gbx(new y50(strO2), function7));
                        boolean zI4 = x340Var.i(ven0Var2);
                        Object objT8 = x340Var.T();
                        if (zI4 || objT8 == m4cVar) {
                            objT8 = new c470(ven0Var2, (byte) 23);
                            x340Var.s0(objT8);
                        }
                        Function0 function8 = (Function0) objT8;
                        if (ihc1.y0(strO3)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return;
                        }
                        zgx zgxVar2 = new zgx(strO3, new gbx(new y50(strO3), function8));
                        b = 2;
                        z11 = false;
                        mqo1.d(function6, (i3u) null, (hux) null, strO0, strO1, zgxVar, zgxVar2, x340Var, 2359296, 6);
                        x340Var = x340Var;
                        x340Var.r(false);
                    } else {
                        b = 2;
                        z11 = false;
                        x340Var.i0(-963972738);
                        x340Var.r(false);
                    }
                    if (((Boolean) tob1Var.getValue()).booleanValue()) {
                        x340Var.i0(-963899795);
                        String strO4 = cwl1.o0(x340Var, 2131958210);
                        String strO5 = cwl1.o0(x340Var, 2131958209);
                        String strO6 = cwl1.o0(x340Var, 2131958208);
                        String strO7 = cwl1.o0(x340Var, 2131958206);
                        boolean zI5 = x340Var.i(tob1Var);
                        Object objT9 = x340Var.T();
                        if (zI5 || objT9 == m4cVar) {
                            objT9 = new c470(tob1Var, (byte) 24);
                            x340Var.s0(objT9);
                        }
                        Function0 function9 = (Function0) objT9;
                        boolean zI6 = x340Var.i(tob1Var) | x340Var.i((Object) 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x03a4: ARITH (r5v13 'zI6' boolean) = (wrap boolean:0x039c: INVOKE (r14v4 'x340Var' p.x340), (r3v5 'tob1Var' p.tob1) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:81)) | (wrap boolean:0x03a0: INVOKE (r14v4 'x340Var' p.x340), (wrap java.lang.Object:?: CAST (java.lang.Object) (r16v10 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED]) A[DECLARE_VAR] (LINE:81) in method: p.n7h0.d(p.iu30, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function0, boolean, boolean, kotlin.jvm.functions.Function0, java.lang.String, p.iu30, boolean, android.net.Uri, boolean, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes9.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v10 ??
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 1308
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p.n7h0.d(p.iu30, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function0, boolean, boolean, kotlin.jvm.functions.Function0, java.lang.String, p.iu30, boolean, android.net.Uri, boolean, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.qim0, p.b0k, int):void");
                    }

                    public final void e(iu30 iu30Var, boolean z, boolean z2, boolean z3, boolean z4, Function0 function0, boolean z5, boolean z6, boolean z7, boolean z8, Function0 function1, Function0 function2, String str, iu30 iu30Var2, boolean z9, Uri uri, boolean z10, boolean z11, boolean z12, Function0 function3, Function0 function4, qim0 qim0Var, b0k b0kVar, int i, int i2, int i3) {
                        boolean z13;
                        int i4;
                        int i5;
                        boolean z14;
                        n7h0 n7h0Var;
                        b0k b0kVar2;
                        b0k b0kVar3 = (x340) b0kVar;
                        b0kVar3.k0(569800425);
                        int i6 = (b0kVar3.i(iu30Var) ? 4 : 2) | i | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.h(z2) ? 256 : 128) | (b0kVar3.h(z3) ? 2048 : 1024);
                        if ((i & 24576) == 0) {
                            z13 = z4;
                            i6 |= b0kVar3.h(z13) ? 16384 : 8192;
                        } else {
                            z13 = z4;
                        }
                        if ((i & 196608) == 0) {
                            i6 |= b0kVar3.i(function0) ? 131072 : 65536;
                        }
                        int i7 = i6 | (b0kVar3.h(z5) ? 1048576 : 524288);
                        if ((i & 12582912) == 0) {
                            i7 |= b0kVar3.h(z6) ? 8388608 : 4194304;
                        }
                        if ((i & 100663296) == 0) {
                            i7 |= b0kVar3.h(z7) ? 67108864 : 33554432;
                        }
                        if ((i & 805306368) == 0) {
                            i7 |= b0kVar3.h(z8) ? 536870912 : 268435456;
                        }
                        if ((i2 & 6) == 0) {
                            i4 = i2 | (b0kVar3.i(function1) ? 4 : 2);
                        } else {
                            i4 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i4 |= b0kVar3.i(function2) ? 32 : 16;
                        }
                        if ((i2 & 384) == 0) {
                            i4 |= b0kVar3.g(str) ? 256 : 128;
                        }
                        if ((i2 & 3072) == 0) {
                            i4 |= b0kVar3.i(iu30Var2) ? 2048 : 1024;
                        }
                        if ((i2 & 24576) == 0) {
                            i4 |= b0kVar3.h(z9) ? 16384 : 8192;
                        }
                        if ((i2 & 196608) == 0) {
                            i4 |= b0kVar3.g(uri) ? 131072 : 65536;
                        }
                        if ((i2 & 1572864) == 0) {
                            i4 |= b0kVar3.h(z10) ? 1048576 : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            i4 |= b0kVar3.h(z11) ? 8388608 : 4194304;
                        }
                        if ((i2 & 100663296) == 0) {
                            i4 |= b0kVar3.h(z12) ? 67108864 : 33554432;
                        }
                        if ((i2 & 805306368) == 0) {
                            i4 |= b0kVar3.i(function3) ? 536870912 : 268435456;
                        }
                        if ((i3 & 6) == 0) {
                            i5 = i3 | (b0kVar3.i(function4) ? 4 : 2);
                        } else {
                            i5 = i3;
                        }
                        if ((i3 & 48) == 0) {
                            i5 |= b0kVar3.i(qim0Var) ? 32 : 16;
                        }
                        if ((i3 & 384) == 0) {
                            i5 |= b0kVar3.i(this) ? 256 : 128;
                        }
                        int i8 = i5;
                        if (b0kVar3.Y(i7 & 1, ((i7 & 306783379) == 306783378 && (i4 & 306783379) == 306783378 && (i8 & 147) == 146) ? false : true)) {
                            ven0 ven0VarS = v8r.s(iu30Var, b0kVar3);
                            ven0 ven0VarS2 = v8r.s(Boolean.valueOf(z), b0kVar3);
                            ven0 ven0VarS3 = v8r.s(Boolean.valueOf(z2), b0kVar3);
                            ven0 ven0VarS4 = v8r.s(Boolean.valueOf(z3), b0kVar3);
                            ven0 ven0VarS5 = v8r.s(Boolean.valueOf(z13), b0kVar3);
                            ven0 ven0VarS6 = v8r.s(function0, b0kVar3);
                            ven0 ven0VarS7 = v8r.s(Boolean.valueOf(z5), b0kVar3);
                            ven0 ven0VarS8 = v8r.s(Boolean.valueOf(z6), b0kVar3);
                            ven0 ven0VarS9 = v8r.s(str, b0kVar3);
                            ven0 ven0VarS10 = v8r.s(iu30Var2, b0kVar3);
                            ven0 ven0VarS11 = v8r.s(Boolean.valueOf(z9), b0kVar3);
                            boolean z15 = false;
                            ven0 ven0VarS12 = v8r.s(uri, b0kVar3);
                            ven0 ven0VarS13 = v8r.s(Boolean.valueOf(z10), b0kVar3);
                            ven0 ven0VarS14 = v8r.s(Boolean.valueOf(z11), b0kVar3);
                            ven0 ven0VarS15 = v8r.s(Boolean.valueOf(z12), b0kVar3);
                            ven0 ven0VarS16 = v8r.s(function3, b0kVar3);
                            ven0 ven0VarS17 = v8r.s(function2, b0kVar3);
                            ven0 ven0VarS18 = v8r.s(Boolean.valueOf(z8), b0kVar3);
                            ven0 ven0VarS19 = v8r.s(function1, b0kVar3);
                            Object objT = b0kVar3.T();
                            Object obj = fkj0.X;
                            if (objT == obj) {
                                objT = Boolean.valueOf(this.k.Y);
                                b0kVar3.s0(objT);
                            }
                            boolean zBooleanValue = ((Boolean) objT).booleanValue();
                            Object objT2 = b0kVar3.T();
                            if (objT2 == obj) {
                                objT2 = Boolean.valueOf(z7 || this.k.Z);
                                b0kVar3.s0(objT2);
                            }
                            boolean zBooleanValue2 = ((Boolean) objT2).booleanValue();
                            uwr uwrVar = cbx.a;
                            long jA = cbx.a(b0kVar3).a.a.a();
                            zov0 zov0Var = cbx.b(b0kVar3).g;
                            enk1 enk1Var = new enk1(jA, (umk1) null, z6, 16);
                            qim0 qim0VarF = dug.f(u291.f(nim0.a, 1.0f), cbx.a(b0kVar3).a.a.a(), er31.c(16.0f, 16.0f, 0.0f, 0.0f));
                            cvx cvxVar = cbx.b(b0kVar3).b;
                            cvx cvxVar2 = cbx.b(b0kVar3).b;
                            qim0 qim0VarY = uyn1.y(qim0VarF, 12.0f, 8.0f);
                            if ((i7 & 29360128) == 8388608) {
                                z15 = true;
                            }
                            Object objT3 = b0kVar3.T();
                            if (z15 || objT3 == obj) {
                                ty60 ty60VarA = this.e.a(this.f);
                                kvp kvpVar = this.d;
                                ruz ruzVar = this.j;
                                m7h0 m7h0Var = new m7h0(z7, ven0VarS18, ven0VarS13, ven0VarS19, this, function4, ven0VarS, ven0VarS2, ven0VarS3, ven0VarS4, ven0VarS5, ven0VarS6, ven0VarS7, ven0VarS8, ven0VarS9, ven0VarS10, ven0VarS11, ven0VarS12, ven0VarS14, ven0VarS15, ven0VarS16);
                                z14 = z7;
                                n7h0Var = this;
                                objT3 = kvpVar.a(ruzVar, ty60VarA, m7h0Var, new sqa0(ven0VarS, (byte) 25), s4h0.O0, new sqa0(ven0VarS10, (byte) 26), enk1Var, qim0VarY, zBooleanValue, new xt7(n7h0Var, z14, (byte) 6), new tzf0(n7h0Var, (byte) 20), zBooleanValue2 ? new c470(ven0VarS17, (byte) 26) : null);
                                b0kVar2 = b0kVar3;
                                b0kVar2.s0(objT3);
                            } else {
                                z14 = z7;
                                n7h0Var = this;
                                b0kVar2 = b0kVar3;
                            }
                            otw.c((orm0) objT3, rih1.a, qim0Var, (ipb1) null, b0kVar2, ((i8 << 3) & 896) | 48, 8);
                        } else {
                            z14 = z7;
                            n7h0Var = this;
                            b0kVar2 = b0kVar3;
                            b0kVar2.b0();
                        }
                        h311 h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new l7h0(n7h0Var, iu30Var, z, z2, z3, z4, function0, z5, z6, z14, z8, function1, function2, str, iu30Var2, z9, uri, z10, z11, z12, function3, function4, qim0Var, i, i2, i3);
                        }
                    }
                }
