package p;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class djl extends cjl {
    public int B0;
    public int C0;
    public int x0;
    public ArrayList u0 = new ArrayList();
    public ix7 v0 = new ix7(this);
    public vgr w0 = new vgr(this);
    public vda y0 = null;
    public boolean z0 = false;
    public yic0 A0 = new yic0();
    public int D0 = 0;
    public int E0 = 0;
    public tbe[] F0 = new tbe[4];
    public tbe[] G0 = new tbe[4];
    public int H0 = 257;
    public boolean I0 = false;
    public boolean J0 = false;
    public WeakReference K0 = null;
    public WeakReference L0 = null;
    public WeakReference M0 = null;
    public WeakReference N0 = null;
    public HashSet O0 = new HashSet();
    public uda P0 = new uda();

    public static void a0(cjl cjlVar, vda vdaVar, uda udaVar) {
        int i;
        int i2;
        if (vdaVar == null) {
            return;
        }
        int i3 = cjlVar.i0;
        int[] iArr = cjlVar.u;
        if (i3 == 8 || (cjlVar instanceof tq50) || (cjlVar instanceof c9a)) {
            udaVar.e = 0;
            udaVar.f = 0;
            return;
        }
        bjl[] bjlVarArr = cjlVar.U;
        udaVar.a = bjlVarArr[0];
        udaVar.b = bjlVarArr[1];
        udaVar.c = cjlVar.s();
        udaVar.d = cjlVar.m();
        udaVar.i = false;
        udaVar.j = 0;
        bjl bjlVar = udaVar.a;
        bjl bjlVar2 = bjl.c;
        boolean z = bjlVar == bjlVar2;
        boolean z2 = udaVar.b == bjlVar2;
        boolean z3 = z && cjlVar.Y > 0.0f;
        boolean z4 = z2 && cjlVar.Y > 0.0f;
        bjl bjlVar3 = bjl.b;
        bjl bjlVar4 = bjl.a;
        if (z && cjlVar.v(0) && cjlVar.s == 0 && !z3) {
            udaVar.a = bjlVar3;
            if (z2 && cjlVar.t == 0) {
                udaVar.a = bjlVar4;
            }
            z = false;
        }
        if (z2 && cjlVar.v(1) && cjlVar.t == 0 && !z4) {
            udaVar.b = bjlVar3;
            if (z && cjlVar.s == 0) {
                udaVar.b = bjlVar4;
            }
            z2 = false;
        }
        if (cjlVar.C()) {
            udaVar.a = bjlVar4;
            z = false;
        }
        if (cjlVar.D()) {
            udaVar.b = bjlVar4;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                udaVar.a = bjlVar4;
            } else if (!z2) {
                if (udaVar.b == bjlVar4) {
                    i2 = udaVar.d;
                } else {
                    udaVar.a = bjlVar3;
                    vdaVar.b(cjlVar, udaVar);
                    i2 = udaVar.f;
                }
                udaVar.a = bjlVar4;
                udaVar.c = (int) (cjlVar.Y * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                udaVar.b = bjlVar4;
            } else if (!z) {
                if (udaVar.a == bjlVar4) {
                    i = udaVar.c;
                } else {
                    udaVar.b = bjlVar3;
                    vdaVar.b(cjlVar, udaVar);
                    i = udaVar.e;
                }
                udaVar.b = bjlVar4;
                int i4 = cjlVar.Z;
                float f = cjlVar.Y;
                if (i4 == -1) {
                    udaVar.d = (int) (i / f);
                } else {
                    udaVar.d = (int) (f * i);
                }
            }
        }
        vdaVar.b(cjlVar, udaVar);
        cjlVar.T(udaVar.e);
        cjlVar.O(udaVar.f);
        cjlVar.F = udaVar.h;
        cjlVar.K(udaVar.g);
        udaVar.j = 0;
    }

    @Override // p.cjl
    public final void E() {
        this.A0.t();
        this.B0 = 0;
        this.C0 = 0;
        this.u0.clear();
        super.E();
    }

    @Override // p.cjl
    public final void H(cab cabVar) {
        super.H(cabVar);
        int size = this.u0.size();
        for (int i = 0; i < size; i++) {
            ((cjl) this.u0.get(i)).H(cabVar);
        }
    }

    @Override // p.cjl
    public final void U(boolean z, boolean z2) {
        super.U(z, z2);
        int size = this.u0.size();
        for (int i = 0; i < size; i++) {
            ((cjl) this.u0.get(i)).U(z, z2);
        }
    }

    public final void W(cjl cjlVar) {
        this.u0.add(cjlVar);
        cjl cjlVar2 = cjlVar.V;
        if (cjlVar2 != null) {
            ((djl) cjlVar2).u0.remove(cjlVar);
            cjlVar.E();
        }
        cjlVar.V = this;
    }

    public final void X(cjl cjlVar, int i) {
        if (i == 0) {
            int i2 = this.D0 + 1;
            tbe[] tbeVarArr = this.G0;
            if (i2 >= tbeVarArr.length) {
                tbeVarArr = (tbe[]) Arrays.copyOf(tbeVarArr, tbeVarArr.length * 2);
                this.G0 = tbeVarArr;
            }
            int i3 = this.D0;
            tbeVarArr[i3] = new tbe(cjlVar, 0, this.z0);
            this.D0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.E0 + 1;
            tbe[] tbeVarArr2 = this.F0;
            if (i4 >= tbeVarArr2.length) {
                tbeVarArr2 = (tbe[]) Arrays.copyOf(tbeVarArr2, tbeVarArr2.length * 2);
                this.F0 = tbeVarArr2;
            }
            int i5 = this.E0;
            tbeVarArr2[i5] = new tbe(cjlVar, 1, this.z0);
            this.E0 = i5 + 1;
        }
    }

    public final void Y(yic0 yic0Var) {
        djl djlVar;
        yic0 yic0Var2;
        HashSet hashSet = this.O0;
        boolean zB0 = b0(64);
        c(yic0Var, zB0);
        int size = this.u0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            cjl cjlVar = (cjl) this.u0.get(i);
            boolean[] zArr = cjlVar.T;
            zArr[0] = false;
            zArr[1] = false;
            if (cjlVar instanceof c9a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                cjl cjlVar2 = (cjl) this.u0.get(i2);
                if (cjlVar2 instanceof c9a) {
                    c9a c9aVar = (c9a) cjlVar2;
                    for (int i3 = 0; i3 < c9aVar.v0; i3++) {
                        cjl cjlVar3 = c9aVar.u0[i3];
                        if (c9aVar.x0 || cjlVar3.d()) {
                            int i4 = c9aVar.w0;
                            if (i4 == 0 || i4 == 1) {
                                cjlVar3.T[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                cjlVar3.T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            cjl cjlVar4 = (cjl) this.u0.get(i5);
            cjlVar4.getClass();
            boolean z2 = cjlVar4 instanceof ljk1;
            if (z2 || (cjlVar4 instanceof tq50)) {
                if (z2) {
                    hashSet.add(cjlVar4);
                } else {
                    cjlVar4.c(yic0Var, zB0);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ljk1 ljk1Var = (ljk1) ((cjl) it.next());
                for (int i6 = 0; i6 < ljk1Var.v0; i6++) {
                    if (hashSet.contains(ljk1Var.u0[i6])) {
                        ljk1Var.c(yic0Var, zB0);
                        hashSet.remove(ljk1Var);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((cjl) it2.next()).c(yic0Var, zB0);
                }
                hashSet.clear();
            }
        }
        boolean z3 = yic0.f148p;
        bjl bjlVar = bjl.b;
        if (z3) {
            HashSet<cjl> hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                cjl cjlVar5 = (cjl) this.u0.get(i7);
                cjlVar5.getClass();
                if (!(cjlVar5 instanceof ljk1) && !(cjlVar5 instanceof tq50)) {
                    hashSet2.add(cjlVar5);
                }
            }
            djlVar = this;
            yic0Var2 = yic0Var;
            djlVar.b(this, yic0Var2, hashSet2, this.U[0] == bjlVar ? 0 : 1, false);
            for (cjl cjlVar6 : hashSet2) {
                ltn1.v(djlVar, yic0Var2, cjlVar6);
                cjlVar6.c(yic0Var2, zB0);
            }
        } else {
            djlVar = this;
            yic0Var2 = yic0Var;
            for (int i8 = 0; i8 < size; i8++) {
                cjl cjlVar7 = (cjl) djlVar.u0.get(i8);
                if (cjlVar7 instanceof djl) {
                    bjl[] bjlVarArr = cjlVar7.U;
                    bjl bjlVar2 = bjlVarArr[0];
                    bjl bjlVar3 = bjlVarArr[1];
                    bjl bjlVar4 = bjl.a;
                    if (bjlVar2 == bjlVar) {
                        cjlVar7.P(bjlVar4);
                    }
                    if (bjlVar3 == bjlVar) {
                        cjlVar7.R(bjlVar4);
                    }
                    cjlVar7.c(yic0Var2, zB0);
                    if (bjlVar2 == bjlVar) {
                        cjlVar7.P(bjlVar2);
                    }
                    if (bjlVar3 == bjlVar) {
                        cjlVar7.R(bjlVar3);
                    }
                } else {
                    ltn1.v(djlVar, yic0Var2, cjlVar7);
                    if (!(cjlVar7 instanceof ljk1) && !(cjlVar7 instanceof tq50)) {
                        cjlVar7.c(yic0Var2, zB0);
                    }
                }
            }
        }
        if (djlVar.D0 > 0) {
            jhc1.m(djlVar, yic0Var2, (ArrayList) null, 0);
        }
        if (djlVar.E0 > 0) {
            jhc1.m(djlVar, yic0Var2, (ArrayList) null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:246:0x0408  */
    /* JADX WARN: Code duplicated, block: B:248:0x041f  */
    /* JADX WARN: Code duplicated, block: B:250:0x0435  */
    /* JADX WARN: Code duplicated, block: B:252:0x0439  */
    /* JADX WARN: Code duplicated, block: B:255:0x0445  */
    /* JADX WARN: Code duplicated, block: B:257:0x044e A[LOOP:14: B:256:0x044c->B:257:0x044e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:261:0x0461 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:276:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:279:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:282:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:283:0x0505  */
    /* JADX WARN: Code duplicated, block: B:285:0x0508  */
    /* JADX WARN: Code duplicated, block: B:287:0x0510 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:290:0x0518  */
    /* JADX WARN: Code duplicated, block: B:293:0x052a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:297:0x0540 A[PHI: r15 r21
      0x0540: PHI (r15v12 ??) = (r15v11 ??), (r15v16 ??), (r15v16 ??), (r15v16 ??) binds: [B:284:0x0506, B:292:0x0528, B:293:0x052a, B:295:0x0530] A[DONT_GENERATE, DONT_INLINE]
      0x0540: PHI (r21v7 boolean) = (r21v6 boolean), (r21v8 boolean), (r21v8 boolean), (r21v8 boolean) binds: [B:284:0x0506, B:292:0x0528, B:293:0x052a, B:295:0x0530] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:299:0x0546  */
    /* JADX WARN: Code duplicated, block: B:362:0x0547 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r28v0, types: [p.cjl, p.djl] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void Z() {
        lhl lhlVar;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        lhl lhlVar2;
        ?? r15;
        boolean[] zArr;
        boolean[] zArr2;
        int i3;
        boolean z4;
        int i4;
        int iMax;
        boolean z5;
        int iMax2;
        ?? r4;
        ?? r16;
        int i5;
        ?? r17;
        boolean zB0;
        int size;
        int i6;
        boolean z6;
        cjl cjlVar;
        ?? r18;
        int i7;
        lhl lhlVar3;
        yic0 yic0Var = this.A0;
        this.a0 = 0;
        this.b0 = 0;
        this.I0 = false;
        this.J0 = false;
        int size2 = this.u0.size();
        int iMax3 = Math.max(0, s());
        int iMax4 = Math.max(0, m());
        bjl[] bjlVarArr = this.U;
        bjl bjlVar = bjlVarArr[1];
        bjl bjlVar2 = bjlVarArr[0];
        int i8 = this.x0;
        lhl lhlVar4 = this.K;
        lhl lhlVar5 = this.J;
        bjl bjlVar3 = bjl.a;
        if (i8 == 0 && ltn1.z(this.H0, 1)) {
            vda vdaVar = this.y0;
            bjl[] bjlVarArr2 = this.U;
            bjl bjlVar4 = bjlVarArr2[0];
            bjl bjlVar5 = bjlVarArr2[1];
            G();
            ArrayList arrayList = this.u0;
            int size3 = arrayList.size();
            for (int i9 = 0; i9 < size3; i9++) {
                ((cjl) arrayList.get(i9)).G();
            }
            boolean z7 = this.z0;
            if (bjlVar4 == bjlVar3) {
                M(0, s());
            } else {
                lhlVar5.l(0);
                this.a0 = 0;
            }
            boolean z8 = false;
            int i10 = 0;
            boolean z9 = false;
            while (i10 < size3) {
                boolean z10 = z8;
                cjl cjlVar2 = (cjl) arrayList.get(i10);
                int i11 = i10;
                if (cjlVar2 instanceof tq50) {
                    tq50 tq50Var = (tq50) cjlVar2;
                    lhlVar3 = lhlVar5;
                    if (tq50Var.y0 == 1) {
                        int i12 = tq50Var.v0;
                        if (i12 != -1) {
                            tq50Var.W(i12);
                        } else if (tq50Var.w0 != -1 && C()) {
                            tq50Var.W(s() - tq50Var.w0);
                        } else if (C()) {
                            tq50Var.W((int) ((tq50Var.u0 * s()) + 0.5f));
                        }
                        z10 = true;
                    }
                } else {
                    lhlVar3 = lhlVar5;
                    if ((cjlVar2 instanceof c9a) && ((c9a) cjlVar2).a0() == 0) {
                        z8 = z10;
                        z9 = true;
                    }
                    i10 = i11 + 1;
                    lhlVar5 = lhlVar3;
                }
                z8 = z10;
                i10 = i11 + 1;
                lhlVar5 = lhlVar3;
            }
            lhlVar = lhlVar5;
            if (z8) {
                for (int i13 = 0; i13 < size3; i13 = i7 + 1) {
                    cjl cjlVar3 = (cjl) arrayList.get(i13);
                    if (cjlVar3 instanceof tq50) {
                        tq50 tq50Var2 = (tq50) cjlVar3;
                        i7 = i13;
                        if (tq50Var2.y0 == 1) {
                            j2h1.w(0, vdaVar, tq50Var2, z7);
                        }
                    } else {
                        i7 = i13;
                    }
                }
            }
            j2h1.w(0, vdaVar, (cjl) this, z7);
            if (z9) {
                for (int i14 = 0; i14 < size3; i14++) {
                    cjl cjlVar4 = (cjl) arrayList.get(i14);
                    if (cjlVar4 instanceof c9a) {
                        c9a c9aVar = (c9a) cjlVar4;
                        if (c9aVar.a0() == 0 && c9aVar.Z()) {
                            j2h1.w(1, vdaVar, c9aVar, z7);
                        }
                    }
                }
            }
            if (bjlVar5 == bjlVar3) {
                N(0, m());
            } else {
                lhlVar4.l(0);
                this.b0 = 0;
            }
            int i15 = 0;
            boolean z11 = false;
            boolean z12 = false;
            while (i15 < size3) {
                cjl cjlVar5 = (cjl) arrayList.get(i15);
                int i16 = i15;
                if (cjlVar5 instanceof tq50) {
                    tq50 tq50Var3 = (tq50) cjlVar5;
                    if (tq50Var3.y0 == 0) {
                        int i17 = tq50Var3.v0;
                        if (i17 != -1) {
                            tq50Var3.W(i17);
                        } else if (tq50Var3.w0 != -1 && D()) {
                            tq50Var3.W(m() - tq50Var3.w0);
                        } else if (D()) {
                            tq50Var3.W((int) ((tq50Var3.u0 * m()) + 0.5f));
                        }
                        z11 = true;
                    }
                } else if ((cjlVar5 instanceof c9a) && ((c9a) cjlVar5).a0() == 1) {
                    z12 = true;
                }
                i15 = i16 + 1;
            }
            if (z11) {
                for (int i18 = 0; i18 < size3; i18++) {
                    cjl cjlVar6 = (cjl) arrayList.get(i18);
                    if (cjlVar6 instanceof tq50) {
                        tq50 tq50Var4 = (tq50) cjlVar6;
                        if (tq50Var4.y0 == 0) {
                            j2h1.L(1, vdaVar, tq50Var4);
                        }
                    }
                }
            }
            j2h1.L(0, vdaVar, (cjl) this);
            if (z12) {
                for (int i19 = 0; i19 < size3; i19++) {
                    cjl cjlVar7 = (cjl) arrayList.get(i19);
                    if (cjlVar7 instanceof c9a) {
                        c9a c9aVar2 = (c9a) cjlVar7;
                        if (c9aVar2.a0() == 1 && c9aVar2.Z()) {
                            j2h1.L(1, vdaVar, c9aVar2);
                        }
                    }
                }
            }
            for (int i20 = 0; i20 < size3; i20++) {
                cjl cjlVar8 = (cjl) arrayList.get(i20);
                if (cjlVar8.B() && j2h1.k(cjlVar8)) {
                    a0(cjlVar8, vdaVar, j2h1.a);
                    if (!(cjlVar8 instanceof tq50)) {
                        j2h1.w(0, vdaVar, cjlVar8, z7);
                        j2h1.L(0, vdaVar, cjlVar8);
                    } else if (((tq50) cjlVar8).y0 == 0) {
                        j2h1.L(0, vdaVar, cjlVar8);
                    } else {
                        j2h1.w(0, vdaVar, cjlVar8, z7);
                    }
                }
            }
            for (int i21 = 0; i21 < size2; i21++) {
                cjl cjlVar9 = (cjl) this.u0.get(i21);
                if (cjlVar9.B() && !(cjlVar9 instanceof tq50) && !(cjlVar9 instanceof c9a) && !(cjlVar9 instanceof ljk1) && !cjlVar9.G) {
                    bjl bjlVarL = cjlVar9.l(0);
                    bjl bjlVarL2 = cjlVar9.l(1);
                    bjl bjlVar6 = bjl.c;
                    if (bjlVarL != bjlVar6 || cjlVar9.s == 1 || bjlVarL2 != bjlVar6 || cjlVar9.t == 1) {
                        a0(cjlVar9, this.y0, new uda());
                    }
                }
            }
        } else {
            yic0Var = yic0Var;
            lhlVar = lhlVar5;
        }
        bjl bjlVar7 = bjl.b;
        if (size2 <= 2 || !((bjlVar2 == bjlVar7 || bjlVar == bjlVar7) && ltn1.z(this.H0, 1024) && uyn1.E((djl) this, this.y0))) {
            i = iMax4;
            i2 = iMax3;
            z = false;
        } else {
            if (bjlVar2 == bjlVar7) {
                if (iMax3 >= s() || iMax3 <= 0) {
                    iMax3 = s();
                } else {
                    T(iMax3);
                    this.I0 = true;
                }
            }
            if (bjlVar == bjlVar7) {
                if (iMax4 >= m() || iMax4 <= 0) {
                    iMax4 = m();
                } else {
                    O(iMax4);
                    this.J0 = true;
                }
            }
            i = iMax4;
            i2 = iMax3;
            z = true;
        }
        int i22 = 64;
        boolean z13 = b0(64) || b0(128);
        yic0Var.getClass();
        yic0 yic0Var2 = yic0Var;
        yic0Var2.g = false;
        if (this.H0 == 0 || !z13) {
            z2 = true;
        } else {
            z2 = true;
            yic0Var2.g = true;
        }
        ArrayList arrayList2 = this.u0;
        bjl[] bjlVarArr3 = this.U;
        boolean z14 = bjlVarArr3[0] == bjlVar7 || bjlVarArr3[z2 ? 1 : 0] == bjlVar7;
        this.D0 = 0;
        this.E0 = 0;
        int i23 = 0;
        while (i23 < size2) {
            cjl cjlVar10 = (cjl) this.u0.get(i23);
            if (cjlVar10 instanceof djl) {
                ((djl) cjlVar10).Z();
            }
            i23++;
            i22 = 64;
        }
        boolean zB1 = b0(i22);
        boolean z15 = z;
        int i24 = 0;
        ?? r19 = 1;
        while (r19 != 0) {
            boolean z16 = z14;
            int i25 = i24 + 1;
            try {
                yic0Var2.t();
                z3 = z15;
                try {
                    this.D0 = 0;
                    this.E0 = 0;
                    i(yic0Var2);
                    for (int i26 = 0; i26 < size2; i26++) {
                        ((cjl) this.u0.get(i26)).i(yic0Var2);
                    }
                    Y(yic0Var2);
                    try {
                        WeakReference weakReference = this.K0;
                        if (weakReference == null || weakReference.get() == null) {
                            lhlVar2 = lhlVar4;
                        } else {
                            lhlVar2 = lhlVar4;
                            try {
                                yic0Var2.f(yic0Var2.k((lhl) this.K0.get()), yic0Var2.k(lhlVar4), 0, 5);
                                this.K0 = null;
                            } catch (Exception e) {
                                e = e;
                                r18 = 1;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                r15 = r18;
                                zArr = ltn1.a;
                                if (r15 != 0) {
                                    zArr[2] = false;
                                    zB0 = b0(64);
                                    V(yic0Var2, zB0);
                                    size = this.u0.size();
                                    i6 = 0;
                                    z6 = false;
                                    while (i6 < size) {
                                        boolean[] zArr3 = zArr;
                                        cjlVar = (cjl) this.u0.get(i6);
                                        cjlVar.V(yic0Var2, zB0);
                                        int i27 = i6;
                                        boolean z17 = zB0;
                                        if (cjlVar.h == -1) {
                                            z6 = true;
                                        } else {
                                            z6 = true;
                                        }
                                        i6 = i27 + 1;
                                        zArr = zArr3;
                                        zB0 = z17;
                                        z6 = z6;
                                    }
                                    zArr2 = zArr;
                                    z4 = z6;
                                } else {
                                    zArr2 = zArr;
                                    V(yic0Var2, zB1);
                                    for (i3 = 0; i3 < size2; i3++) {
                                        ((cjl) this.u0.get(i3)).V(yic0Var2, zB1);
                                    }
                                    z4 = false;
                                }
                                if (z16) {
                                    i4 = size2;
                                } else {
                                    i4 = size2;
                                }
                                iMax = Math.max(this.d0, s());
                                z5 = z4;
                                if (iMax > s()) {
                                    T(iMax);
                                    this.U[0] = bjlVar3;
                                    z5 = true;
                                    z3 = true;
                                }
                                iMax2 = Math.max(this.e0, m());
                                if (iMax2 > m()) {
                                    O(iMax2);
                                    r4 = 1;
                                    this.U[1] = bjlVar3;
                                    r16 = 1;
                                    z3 = true;
                                } else {
                                    r4 = 1;
                                }
                                if (z3) {
                                    r16 = z5;
                                    z15 = z3;
                                    i5 = 8;
                                    r17 = r16;
                                } else {
                                    r16 = z5;
                                    if (this.U[0] == bjlVar7) {
                                        r16 = r16;
                                        if (s() > i2) {
                                            this.I0 = r4;
                                            this.U[0] = bjlVar3;
                                            T(i2);
                                            ?? r110 = r4;
                                            z3 = r110 == true ? 1 : 0;
                                            r16 = r110;
                                        }
                                    }
                                    r16 = r16;
                                    r16 = r16;
                                    if (this.U[r4] == bjlVar7) {
                                        r16 = z5;
                                        z15 = z3;
                                        i5 = 8;
                                        r17 = r16;
                                    } else {
                                        r16 = z5;
                                        z15 = z3;
                                        i5 = 8;
                                        r17 = r16;
                                    }
                                }
                                if (i25 > i5) {
                                    r17 = 0;
                                }
                                i24 = i25;
                                z14 = z16;
                                bjlVar3 = bjlVar3;
                                lhlVar4 = lhlVar2;
                                size2 = i4;
                                r19 = r17;
                            }
                        }
                        WeakReference weakReference2 = this.M0;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            yic0Var2.f(yic0Var2.k(this.M), yic0Var2.k((lhl) this.M0.get()), 0, 5);
                            this.M0 = null;
                        }
                        WeakReference weakReference3 = this.L0;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            lhl lhlVar6 = lhlVar;
                            try {
                                lhlVar = lhlVar6;
                                yic0Var2.f(yic0Var2.k((lhl) this.L0.get()), yic0Var2.k(lhlVar6), 0, 5);
                                this.L0 = null;
                            } catch (Exception e2) {
                                e = e2;
                                lhlVar = lhlVar6;
                                r18 = 1;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                r15 = r18;
                            }
                        }
                        WeakReference weakReference4 = this.N0;
                        if (weakReference4 != null && weakReference4.get() != null) {
                            yic0Var2.f(yic0Var2.k(this.L), yic0Var2.k((lhl) this.N0.get()), 0, 5);
                            this.N0 = null;
                        }
                        yic0Var2.p();
                        r15 = 1;
                    } catch (Exception e3) {
                        e = e3;
                        lhlVar2 = lhlVar4;
                    }
                } catch (Exception e4) {
                    e = e4;
                    lhlVar2 = lhlVar4;
                    r18 = r19;
                    e.printStackTrace();
                    System.out.println("EXCEPTION : " + e);
                    r15 = r18;
                    zArr = ltn1.a;
                    if (r15 != 0) {
                        zArr[2] = false;
                        zB0 = b0(64);
                        V(yic0Var2, zB0);
                        size = this.u0.size();
                        i6 = 0;
                        z6 = false;
                        while (i6 < size) {
                            boolean[] zArr4 = zArr;
                            cjlVar = (cjl) this.u0.get(i6);
                            cjlVar.V(yic0Var2, zB0);
                            int i28 = i6;
                            boolean z18 = zB0;
                            if (cjlVar.h == -1) {
                                z6 = true;
                            } else {
                                z6 = true;
                            }
                            i6 = i28 + 1;
                            zArr = zArr4;
                            zB0 = z18;
                            z6 = z6;
                        }
                        zArr2 = zArr;
                        z4 = z6;
                    } else {
                        zArr2 = zArr;
                        V(yic0Var2, zB1);
                        while (i3 < size2) {
                            ((cjl) this.u0.get(i3)).V(yic0Var2, zB1);
                        }
                        z4 = false;
                    }
                    if (z16) {
                        i4 = size2;
                    } else {
                        i4 = size2;
                    }
                    iMax = Math.max(this.d0, s());
                    z5 = z4;
                    if (iMax > s()) {
                        T(iMax);
                        this.U[0] = bjlVar3;
                        z5 = true;
                        z3 = true;
                    }
                    iMax2 = Math.max(this.e0, m());
                    if (iMax2 > m()) {
                        O(iMax2);
                        r4 = 1;
                        this.U[1] = bjlVar3;
                        r16 = 1;
                        z3 = true;
                    } else {
                        r4 = 1;
                    }
                    if (z3) {
                        r16 = z5;
                        if (this.U[0] == bjlVar7) {
                            r16 = r16;
                            if (s() > i2) {
                                this.I0 = r4;
                                this.U[0] = bjlVar3;
                                T(i2);
                                ?? r111 = r4;
                                z3 = r111 == true ? 1 : 0;
                                r16 = r111;
                            }
                        }
                        r16 = r16;
                        r16 = r16;
                        if (this.U[r4] == bjlVar7) {
                            r16 = z5;
                            z15 = z3;
                            i5 = 8;
                            r17 = r16;
                        } else {
                            r16 = z5;
                            z15 = z3;
                            i5 = 8;
                            r17 = r16;
                        }
                    } else {
                        r16 = z5;
                        z15 = z3;
                        i5 = 8;
                        r17 = r16;
                    }
                    if (i25 > i5) {
                        r17 = 0;
                    }
                    i24 = i25;
                    z14 = z16;
                    bjlVar3 = bjlVar3;
                    lhlVar4 = lhlVar2;
                    size2 = i4;
                    r19 = r17;
                }
            } catch (Exception e5) {
                e = e5;
                z3 = z15;
            }
            zArr = ltn1.a;
            if (r15 != 0) {
                zArr[2] = false;
                zB0 = b0(64);
                V(yic0Var2, zB0);
                size = this.u0.size();
                i6 = 0;
                z6 = false;
                while (i6 < size) {
                    boolean[] zArr5 = zArr;
                    cjlVar = (cjl) this.u0.get(i6);
                    cjlVar.V(yic0Var2, zB0);
                    int i29 = i6;
                    boolean z19 = zB0;
                    if (cjlVar.h == -1 || cjlVar.i != -1) {
                        z6 = true;
                    }
                    i6 = i29 + 1;
                    zArr = zArr5;
                    zB0 = z19;
                    z6 = z6;
                }
                zArr2 = zArr;
                z4 = z6;
            } else {
                zArr2 = zArr;
                V(yic0Var2, zB1);
                while (i3 < size2) {
                    ((cjl) this.u0.get(i3)).V(yic0Var2, zB1);
                }
                z4 = false;
            }
            if (z16 || i25 >= 8 || !zArr2[2]) {
                i4 = size2;
            } else {
                int i30 = 0;
                int iMax5 = 0;
                int iMax6 = 0;
                while (i30 < size2) {
                    cjl cjlVar11 = (cjl) this.u0.get(i30);
                    iMax6 = Math.max(iMax6, cjlVar11.s() + cjlVar11.a0);
                    iMax5 = Math.max(iMax5, cjlVar11.m() + cjlVar11.b0);
                    i30++;
                    size2 = size2;
                }
                i4 = size2;
                int iMax7 = Math.max(this.d0, iMax6);
                int iMax8 = Math.max(this.e0, iMax5);
                z4 = z4;
                if (bjlVar2 == bjlVar7 && s() < iMax7) {
                    z4 = z4;
                    T(iMax7);
                    this.U[0] = bjlVar7;
                    z4 = true;
                    z3 = true;
                }
                if (bjlVar == bjlVar7 && m() < iMax8) {
                    O(iMax8);
                    this.U[1] = bjlVar7;
                    z4 = true;
                    z3 = true;
                }
            }
            iMax = Math.max(this.d0, s());
            z5 = z4;
            if (iMax > s()) {
                T(iMax);
                this.U[0] = bjlVar3;
                z5 = true;
                z3 = true;
            }
            iMax2 = Math.max(this.e0, m());
            if (iMax2 > m()) {
                O(iMax2);
                r4 = 1;
                this.U[1] = bjlVar3;
                r16 = 1;
                z3 = true;
            } else {
                r4 = 1;
            }
            if (z3) {
                r16 = z5;
                if (this.U[0] == bjlVar7 && i2 > 0) {
                    r16 = r16;
                    if (s() > i2) {
                        this.I0 = r4;
                        this.U[0] = bjlVar3;
                        T(i2);
                        ?? r112 = r4;
                        z3 = r112 == true ? 1 : 0;
                        r16 = r112;
                    }
                }
                r16 = r16;
                r16 = r16;
                if (this.U[r4] == bjlVar7 || i <= 0 || m() <= i) {
                    r16 = z5;
                    z15 = z3;
                    i5 = 8;
                    r17 = r16;
                } else {
                    this.J0 = r4;
                    this.U[r4] = bjlVar3;
                    O(i);
                    i5 = 8;
                    z15 = true;
                    r17 = 1;
                }
            } else {
                r16 = z5;
                z15 = z3;
                i5 = 8;
                r17 = r16;
            }
            if (i25 > i5) {
                r17 = 0;
            }
            i24 = i25;
            z14 = z16;
            bjlVar3 = bjlVar3;
            lhlVar4 = lhlVar2;
            size2 = i4;
            r19 = r17;
        }
        boolean z20 = z15;
        this.u0 = arrayList2;
        if (z20) {
            bjl[] bjlVarArr4 = this.U;
            bjlVarArr4[0] = bjlVar2;
            bjlVarArr4[1] = bjlVar;
        }
        H(yic0Var2.l);
    }

    public final boolean b0(int i) {
        return (this.H0 & i) == i;
    }

    @Override // p.cjl
    public final void p(StringBuilder sb) {
        sb.append(this.k + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.W);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.X);
        sb.append("\n");
        Iterator it = this.u0.iterator();
        while (it.hasNext()) {
            ((cjl) it.next()).p(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
