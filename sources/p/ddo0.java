package p;

import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ddo0 extends qdo0 {
    public final pim0 c;
    public ndo0 f;
    public bav0 g;
    public boolean h;
    public final p4f0 d = new p4f0();
    public final q5f0 e = new q5f0(2);
    public boolean i = true;
    public boolean j = true;

    public ddo0(pim0 pim0Var) {
        this.c = pim0Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x021b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0226  */
    /* JADX WARN: Code duplicated, block: B:108:0x022e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0282  */
    /* JADX WARN: Code duplicated, block: B:51:0x0141  */
    /* JADX WARN: Code duplicated, block: B:99:0x0213  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    @Override // p.qdo0
    public final boolean a(q5f0 q5f0Var, elb0 elb0Var, oi oiVar, boolean z) {
        p4f0 p4f0Var;
        q5f0 q5f0Var2;
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        bav0 bav0Var;
        int i;
        boolean zA = super.a(q5f0Var, elb0Var, oiVar, z);
        ?? E = this.c;
        if (E.N0) {
            ?? bfn0Var = 0;
            while (E != 0) {
                if (E instanceof mav0) {
                    this.f = z8p1.m((mav0) E);
                } else if ((E.c & 16) != 0 && (E instanceof l5t)) {
                    pim0 pim0Var = ((l5t) E).P0;
                    int i2 = 0;
                    while (pim0Var != null) {
                        if ((pim0Var.c & 16) != 0) {
                            i2++;
                            if (i2 == 1) {
                                E = E;
                                bfn0Var = bfn0Var;
                                bfn0Var = bfn0Var;
                                E = pim0Var;
                            } else {
                                if (bfn0Var == 0) {
                                    bfn0Var = new bfn0(0, new pim0[16]);
                                }
                                if (E != 0) {
                                    bfn0Var.b(E);
                                    E = 0;
                                }
                                bfn0Var.b(pim0Var);
                            }
                        } else {
                            E = E;
                            bfn0Var = bfn0Var;
                        }
                        pim0Var = pim0Var.f;
                        E = E;
                        bfn0Var = bfn0Var;
                    }
                    if (i2 == 1) {
                        E = E;
                        bfn0Var = bfn0Var;
                    } else {
                        E = E;
                        bfn0Var = bfn0Var;
                    }
                }
                E = oap1.e((bfn0) bfn0Var);
            }
            if (this.f != null) {
                int i3 = q5f0Var.i();
                int i4 = 0;
                while (true) {
                    p4f0Var = this.d;
                    q5f0Var2 = this.e;
                    if (i4 >= i3) {
                        break;
                    }
                    long jE = q5f0Var.e(i4);
                    hav0 hav0Var = (hav0) q5f0Var.j(i4);
                    if (p4f0Var.d(jE)) {
                        long jH = hav0Var.h();
                        long jE2 = hav0Var.e();
                        if ((((jH & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((jE2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            ArrayList arrayList = new ArrayList(hav0Var.c().size());
                            List listC = hav0Var.c();
                            int size = listC.size();
                            int i5 = 0;
                            while (i5 < size) {
                                yg60 yg60Var = (yg60) listC.get(i5);
                                int i6 = size;
                                int i7 = i5;
                                long jC = yg60Var.c();
                                if ((((jC & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long jE3 = yg60Var.e();
                                    ndo0 ndo0Var = this.f;
                                    ndo0Var.getClass();
                                    arrayList.add(new yg60(jE3, ndo0Var.q(elb0Var, jC, true), yg60Var.d(), yg60Var.b(), yg60Var.a()));
                                }
                                i5 = i7 + 1;
                                size = i6;
                                listC = listC;
                                i4 = i4;
                            }
                            i = i4;
                            ndo0 ndo0Var2 = this.f;
                            ndo0Var2.getClass();
                            long jQ = ndo0Var2.q(elb0Var, jH, true);
                            ndo0 ndo0Var3 = this.f;
                            ndo0Var3.getClass();
                            q5f0Var2.g(jE, hav0.b(hav0Var, ndo0Var3.q(elb0Var, jE2, true), jQ, arrayList));
                        } else {
                            i = i4;
                        }
                    } else {
                        i = i4;
                    }
                    i4 = i + 1;
                    zA = zA;
                    i3 = i3;
                }
                boolean z5 = zA;
                if (q5f0Var2.i() == 0) {
                    p4f0Var.c();
                    this.a.g();
                    return true;
                }
                int iG = p4f0Var.g();
                while (true) {
                    iG--;
                    if (-1 >= iG) {
                        break;
                    }
                    if (q5f0Var.d(p4f0Var.f(iG)) < 0) {
                        p4f0Var.j(iG);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q5f0Var2.i());
                int i8 = q5f0Var2.i();
                for (int i9 = 0; i9 < i8; i9++) {
                    arrayList2.add(q5f0Var2.j(i9));
                }
                bav0 bav0Var2 = new bav0(arrayList2, oiVar);
                int size2 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i10);
                    if (oiVar.t(((hav0) obj).d())) {
                        break;
                    }
                    i10++;
                }
                hav0 hav0Var2 = (hav0) obj;
                if (hav0Var2 != null) {
                    if (z) {
                        z2 = false;
                        if (!this.i && (hav0Var2.f() || hav0Var2.i())) {
                            ndo0 ndo0Var4 = this.f;
                            ndo0Var4.getClass();
                            z3 = true;
                            this.i = !p8p1.v(ndo0Var4.c, hav0Var2);
                        }
                        if (this.i == this.h && (s8p1.o(bav0Var2.f, 3) || s8p1.o(bav0Var2.f, 4) || s8p1.o(bav0Var2.f, 5))) {
                            bav0Var2.f = this.i ? 4 : 5;
                        } else if (!s8p1.o(bav0Var2.f, 4) && this.h && !this.j) {
                            bav0Var2.f = 3;
                        } else if (s8p1.o(bav0Var2.f, 5) && this.i && hav0Var2.f()) {
                            bav0Var2.f = 3;
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                    }
                    z3 = true;
                    if (this.i == this.h) {
                        if (!s8p1.o(bav0Var2.f, 4)) {
                            if (s8p1.o(bav0Var2.f, 5)) {
                                bav0Var2.f = 3;
                            }
                        } else if (s8p1.o(bav0Var2.f, 5)) {
                            bav0Var2.f = 3;
                        }
                    } else if (!s8p1.o(bav0Var2.f, 4)) {
                        if (s8p1.o(bav0Var2.f, 5)) {
                            bav0Var2.f = 3;
                        }
                    } else if (s8p1.o(bav0Var2.f, 5)) {
                        bav0Var2.f = 3;
                    }
                } else {
                    z2 = false;
                    z3 = true;
                }
                if (!z5 && s8p1.o(bav0Var2.f, 3) && (bav0Var = this.g) != null) {
                    ?? r1 = bav0Var.a;
                    int size3 = r1.size();
                    ?? r4 = bav0Var2.a;
                    if (size3 != r4.size()) {
                        z4 = z3;
                        break;
                    }
                    int size4 = r4.size();
                    ?? r5 = z2;
                    while (true) {
                        if (r5 >= size4) {
                            z4 = z2;
                            break;
                        }
                        if (!Offset.c(((hav0) r1.get(r5)).e(), ((hav0) r4.get(r5)).e())) {
                            z4 = z3;
                            break;
                        }
                        r5++;
                    }
                } else {
                    z4 = z3;
                    break;
                }
                this.g = bav0Var2;
                return z4;
            }
        }
        return true;
    }

    @Override // p.qdo0
    public final void b(oi oiVar) {
        super.b(oiVar);
        bav0 bav0Var = this.g;
        if (bav0Var == null) {
            return;
        }
        this.h = this.i;
        List list = bav0Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hav0 hav0Var = (hav0) list.get(i);
            boolean zF = hav0Var.f();
            boolean zT = oiVar.t(hav0Var.d());
            boolean z = this.i;
            if ((!zF && !zT) || (!zF && !z)) {
                this.d.i(hav0Var.d());
            }
        }
        this.i = false;
        this.j = s8p1.o(bav0Var.f, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        bfn0 bfn0Var = this.a;
        Object[] objArr = bfn0Var.a;
        int i = bfn0Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ddo0) objArr[i2]).c();
        }
        ?? E = this.c;
        ?? bfn0Var2 = 0;
        while (E != 0) {
            if (E instanceof mav0) {
                ((mav0) E).K0();
            } else if ((E.c & 16) != 0 && (E instanceof l5t)) {
                pim0 pim0Var = ((l5t) E).P0;
                int i3 = 0;
                bfn0Var2 = bfn0Var2;
                E = E;
                while (pim0Var != null) {
                    if ((pim0Var.c & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            bfn0Var2 = bfn0Var2;
                            E = pim0Var;
                        } else {
                            if (bfn0Var2 == 0) {
                                bfn0Var2 = new bfn0(0, new pim0[16]);
                            }
                            if (E != 0) {
                                bfn0Var2.b(E);
                                E = 0;
                            }
                            bfn0Var2.b(pim0Var);
                        }
                    }
                    pim0Var = pim0Var.f;
                    bfn0Var2 = bfn0Var2;
                    E = E;
                }
                if (i3 == 1) {
                }
            }
            E = oap1.e((bfn0) bfn0Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(oi oiVar) {
        hmb0 hmb0Var;
        q5f0 q5f0Var = this.e;
        boolean z = false;
        z = false;
        z = false;
        if (q5f0Var.i() != 0) {
            pim0 pim0Var = this.c;
            if (pim0Var.N0) {
                ndo0 ndo0Var = pim0Var.h;
                if ((ndo0Var == null || (hmb0Var = ndo0Var.U0) == null) ? false : hmb0Var.J()) {
                    bav0 bav0Var = this.g;
                    bav0Var.getClass();
                    ndo0 ndo0Var2 = this.f;
                    ndo0Var2.getClass();
                    long j = ndo0Var2.c;
                    ?? E = pim0Var;
                    ?? bfn0Var = 0;
                    while (E != 0) {
                        if (E instanceof mav0) {
                            ((mav0) E).D0(bav0Var, cav0.c, j);
                        } else if ((E.c & 16) != 0 && (E instanceof l5t)) {
                            pim0 pim0Var2 = ((l5t) E).P0;
                            int i = 0;
                            while (pim0Var2 != null) {
                                if ((pim0Var2.c & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        E = E;
                                        bfn0Var = bfn0Var;
                                        bfn0Var = bfn0Var;
                                        E = pim0Var2;
                                    } else {
                                        if (bfn0Var == 0) {
                                            bfn0Var = new bfn0(0, new pim0[16]);
                                        }
                                        if (E != 0) {
                                            bfn0Var.b(E);
                                            E = 0;
                                        }
                                        bfn0Var.b(pim0Var2);
                                    }
                                } else {
                                    E = E;
                                    bfn0Var = bfn0Var;
                                }
                                pim0Var2 = pim0Var2.f;
                                E = E;
                                bfn0Var = bfn0Var;
                            }
                            if (i == 1) {
                                E = E;
                                bfn0Var = bfn0Var;
                            } else {
                                E = E;
                                bfn0Var = bfn0Var;
                            }
                        }
                        E = oap1.e((bfn0) bfn0Var);
                    }
                    if (pim0Var.N0) {
                        bfn0 bfn0Var2 = this.a;
                        Object[] objArr = bfn0Var2.a;
                        int i2 = bfn0Var2.c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((ddo0) objArr[i3]).d(oiVar);
                        }
                    }
                    z = true;
                }
            }
        }
        b(oiVar);
        q5f0Var.a();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r6v10, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(oi oiVar, boolean z) {
        hmb0 hmb0Var;
        if (this.e.i() == 0) {
            return false;
        }
        ?? E = this.c;
        if (E.N0) {
            ndo0 ndo0Var = E.h;
            if ((ndo0Var == null || (hmb0Var = ndo0Var.U0) == null) ? false : hmb0Var.J()) {
                bav0 bav0Var = this.g;
                bav0Var.getClass();
                ndo0 ndo0Var2 = this.f;
                ndo0Var2.getClass();
                long j = ndo0Var2.c;
                ?? E2 = E;
                ?? bfn0Var = 0;
                while (E2 != 0) {
                    if (E2 instanceof mav0) {
                        ((mav0) E2).D0(bav0Var, cav0.a, j);
                    } else if ((E2.c & 16) != 0 && (E2 instanceof l5t)) {
                        pim0 pim0Var = ((l5t) E2).P0;
                        int i = 0;
                        while (pim0Var != null) {
                            if ((pim0Var.c & 16) != 0) {
                                i++;
                                if (i == 1) {
                                    E2 = E2;
                                    bfn0Var = bfn0Var;
                                    bfn0Var = bfn0Var;
                                    E2 = pim0Var;
                                } else {
                                    if (bfn0Var == 0) {
                                        bfn0Var = new bfn0(0, new pim0[16]);
                                    }
                                    if (E2 != 0) {
                                        bfn0Var.b(E2);
                                        E2 = 0;
                                    }
                                    bfn0Var.b(pim0Var);
                                }
                            } else {
                                E2 = E2;
                                bfn0Var = bfn0Var;
                            }
                            pim0Var = pim0Var.f;
                            E2 = E2;
                            bfn0Var = bfn0Var;
                        }
                        if (i == 1) {
                            E2 = E2;
                            bfn0Var = bfn0Var;
                        } else {
                            E2 = E2;
                            bfn0Var = bfn0Var;
                        }
                    }
                    E2 = oap1.e((bfn0) bfn0Var);
                }
                if (E.N0) {
                    bfn0 bfn0Var2 = this.a;
                    Object[] objArr = bfn0Var2.a;
                    int i2 = bfn0Var2.c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ddo0 ddo0Var = (ddo0) objArr[i3];
                        this.f.getClass();
                        ddo0Var.e(oiVar, z);
                    }
                }
                if (E.N0) {
                    ?? bfn0Var3 = 0;
                    while (E != 0) {
                        if (E instanceof mav0) {
                            ((mav0) E).D0(bav0Var, cav0.b, j);
                        } else if ((E.c & 16) != 0 && (E instanceof l5t)) {
                            pim0 pim0Var2 = ((l5t) E).P0;
                            int i4 = 0;
                            while (pim0Var2 != null) {
                                if ((pim0Var2.c & 16) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        E = E;
                                        bfn0Var3 = bfn0Var3;
                                        bfn0Var3 = bfn0Var3;
                                        E = pim0Var2;
                                    } else {
                                        if (bfn0Var3 == 0) {
                                            bfn0Var3 = new bfn0(0, new pim0[16]);
                                        }
                                        if (E != 0) {
                                            bfn0Var3.b(E);
                                            E = 0;
                                        }
                                        bfn0Var3.b(pim0Var2);
                                    }
                                } else {
                                    E = E;
                                    bfn0Var3 = bfn0Var3;
                                }
                                pim0Var2 = pim0Var2.f;
                                E = E;
                                bfn0Var3 = bfn0Var3;
                            }
                            if (i4 == 1) {
                                E = E;
                                bfn0Var3 = bfn0Var3;
                            } else {
                                E = E;
                                bfn0Var3 = bfn0Var3;
                            }
                        }
                        E = oap1.e((bfn0) bfn0Var3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, wdn0 wdn0Var) {
        p4f0 p4f0Var = this.d;
        if (p4f0Var.d(j) && wdn0Var.h(this) < 0) {
            p4f0Var.i(j);
            this.e.h(j);
        }
        bfn0 bfn0Var = this.a;
        Object[] objArr = bfn0Var.a;
        int i = bfn0Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ddo0) objArr[i2]).f(j, wdn0Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ")";
    }
}
