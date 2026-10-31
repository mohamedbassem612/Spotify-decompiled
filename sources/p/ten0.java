package p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class ten0 extends jv91 {
    public static final int[] n = new int[0];
    public final iu30 e;
    public final iu30 f;
    public int g;
    public oen0 h;
    public ArrayList i;
    public nv91 j;
    public int[] k;
    public int l;
    public boolean m;

    public ten0(long j, nv91 nv91Var, iu30 iu30Var, iu30 iu30Var2) {
        super(j, nv91Var);
        this.e = iu30Var;
        this.f = iu30Var2;
        this.j = nv91.e;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (pv91.c) {
            this.j = this.j.f(j);
        }
    }

    public void B(oen0 oen0Var) {
        this.h = oen0Var;
    }

    public ten0 C(iu30 iu30Var, iu30 iu30Var2) {
        y5o0 y5o0Var;
        if (this.c) {
            bmv0.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            bmv0.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = pv91.c;
        synchronized (obj) {
            long j = pv91.e;
            pv91.e = j + 1;
            pv91.d = pv91.d.f(j);
            nv91 nv91VarD = d();
            r(nv91VarD.f(j));
            y5o0Var = new y5o0(j, pv91.a(nv91VarD, g() + 1, j), pv91.i(iu30Var, e(), true), pv91.j(iu30Var2, i()), this);
        }
        if (this.m || this.c) {
            return y5o0Var;
        }
        long jG = g();
        synchronized (obj) {
            long j2 = pv91.e;
            pv91.e = j2 + 1;
            s(j2);
            pv91.d = pv91.d.f(g());
        }
        r(pv91.a(d(), jG + 1, g()));
        return y5o0Var;
    }

    @Override // p.jv91
    public final void b() {
        pv91.d = pv91.d.c(g()).b(this.j);
    }

    @Override // p.jv91
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (pv91.c) {
            o();
        }
        l();
    }

    @Override // p.jv91
    public int h() {
        return this.g;
    }

    @Override // p.jv91
    public iu30 i() {
        return this.f;
    }

    @Override // p.jv91
    public void k() {
        this.l++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // p.jv91
    public void l() {
        if (this.l <= 0) {
            bmv0.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        oen0 oen0VarX = x();
        if (oen0VarX != null) {
            if (this.m) {
                bmv0.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = oen0VarX.b;
            long[] jArr = oen0VarX.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (cqb1 cqb1VarK = ((ypb1) objArr[(i2 << 3) + i4]).k(); cqb1VarK != null; cqb1VarK = cqb1VarK.b) {
                                    long j2 = cqb1VarK.a;
                                    if (j2 == jG || o7h.i0(this.j, Long.valueOf(j2))) {
                                        ef41 ef41Var = pv91.a;
                                        cqb1VarK.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // p.jv91
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // p.jv91
    public void n(ypb1 ypb1Var) {
        oen0 oen0VarX = x();
        if (oen0VarX == null) {
            oen0 oen0Var = ij41.a;
            oen0VarX = new oen0();
            B(oen0VarX);
        }
        oen0VarX.a(ypb1Var);
    }

    @Override // p.jv91
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            pv91.f.i(this.k[i]);
        }
        o();
    }

    @Override // p.jv91
    public void t(int i) {
        this.g = i;
    }

    @Override // p.jv91
    public jv91 u(iu30 iu30Var) {
        b6o0 b6o0Var;
        if (this.c) {
            bmv0.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            bmv0.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = pv91.c;
        synchronized (obj) {
            long j = pv91.e;
            pv91.e = j + 1;
            pv91.d = pv91.d.f(j);
            b6o0Var = new b6o0(j, pv91.a(d(), jG + 1, j), pv91.i(iu30Var, e(), true), this);
        }
        if (this.m || this.c) {
            return b6o0Var;
        }
        long jG2 = g();
        synchronized (obj) {
            long j2 = pv91.e;
            pv91.e = j2 + 1;
            s(j2);
            pv91.d = pv91.d.f(g());
        }
        r(pv91.a(d(), jG2 + 1, g()));
        return b6o0Var;
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (pv91.c) {
            long j = pv91.e;
            pv91.e = j + 1;
            s(j);
            pv91.d = pv91.d.f(g());
        }
        r(pv91.a(d(), jG + 1, g()));
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0182 A[EDGE_INSN: B:113:0x0182->B:86:0x0182 BREAK  A[LOOP:4: B:73:0x0149->B:85:0x017f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0135  */
    /* JADX WARN: Code duplicated, block: B:84:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x017f A[Catch: all -> 0x0112, LOOP:4: B:73:0x0149->B:85:0x017f, LOOP_END, TryCatch #0 {all -> 0x0112, blocks: (B:43:0x00c0, B:45:0x00d0, B:48:0x00dc, B:50:0x00e8, B:52:0x00f2, B:54:0x00f8, B:56:0x010a, B:61:0x0119, B:67:0x012e, B:70:0x013f, B:73:0x0149, B:75:0x0155, B:77:0x015f, B:79:0x0165, B:81:0x0172, B:82:0x0177, B:85:0x017f, B:86:0x0182, B:88:0x0186, B:90:0x018d, B:92:0x0199, B:93:0x019e, B:94:0x01a1), top: B:102:0x00c0 }] */
    public nln w() {
        HashMap mapM;
        List list;
        oen0 oen0Var;
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        oen0 oen0VarX = x();
        if (oen0VarX != null) {
            long j4 = pv91.j.b;
            mapM = pv91.m(j4, this, pv91.d.c(j4));
        } else {
            mapM = null;
        }
        List list2 = z6x.a;
        synchronized (pv91.c) {
            try {
                pv91.t(this);
                if (oen0VarX == null || oen0VarX.d == 0) {
                    b();
                    rv40 rv40Var = pv91.j;
                    oen0 oen0Var2 = rv40Var.h;
                    pv91.s(rv40Var, pv91.a);
                    if (oen0Var2 == null || !oen0Var2.h()) {
                        list = list2;
                        oen0Var = null;
                    } else {
                        list = pv91.h;
                        oen0Var = oen0Var2;
                    }
                } else {
                    rv40 rv40Var2 = pv91.j;
                    nln nlnVarZ = z(pv91.e, oen0VarX, mapM, pv91.d.c(rv40Var2.b));
                    if (!nlnVarZ.equals(lv91.e)) {
                        return nlnVarZ;
                    }
                    b();
                    oen0Var = rv40Var2.h;
                    pv91.s(rv40Var2, pv91.a);
                    B(null);
                    rv40Var2.h = null;
                    list = pv91.h;
                }
                this.m = true;
                if (oen0Var != null) {
                    jj41 jj41VarZ = t4n1.z(oen0Var);
                    if (!jj41VarZ.a.g()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((vu30) list.get(i)).invoke(jj41VarZ, this);
                        }
                    }
                }
                if (oen0VarX != null && oen0VarX.h()) {
                    jj41 jj41VarZ2 = t4n1.z(oen0VarX);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((vu30) list.get(i2)).invoke(jj41VarZ2, this);
                    }
                }
                synchronized (pv91.c) {
                    try {
                        p();
                        pv91.d();
                        char c3 = 7;
                        long j5 = -9187201950435737472L;
                        if (oen0Var != null) {
                            Object[] objArr = oen0Var.b;
                            long[] jArr = oen0Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j2 = 128;
                                while (true) {
                                    long j6 = jArr[i3];
                                    j3 = 255;
                                    if ((((~j6) << c3) & j6 & j5) != j5) {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        int i5 = 0;
                                        while (i5 < i4) {
                                            if ((j6 & 255) < 128) {
                                                c2 = c3;
                                                ypb1 ypb1Var = (ypb1) objArr[(i3 << 3) + i5];
                                                if (pv91.o(ypb1Var)) {
                                                    pv91.g.d(ypb1Var);
                                                }
                                                j6 >>= 8;
                                                i5++;
                                                c3 = c2;
                                                j5 = j5;
                                            } else {
                                                c2 = c3;
                                            }
                                            j6 >>= 8;
                                            i5++;
                                            c3 = c2;
                                            j5 = j5;
                                        }
                                        c = c3;
                                        j = j5;
                                        if (i4 != 8) {
                                            break;
                                        }
                                    } else {
                                        c = c3;
                                        j = j5;
                                    }
                                    if (i3 == length) {
                                        break;
                                    }
                                    i3++;
                                    c3 = c;
                                    j5 = j;
                                }
                            } else {
                                c = 7;
                                j = -9187201950435737472L;
                                j2 = 128;
                                j3 = 255;
                            }
                        } else {
                            c = 7;
                            j = -9187201950435737472L;
                            j2 = 128;
                            j3 = 255;
                        }
                        if (oen0VarX != null) {
                            Object[] objArr2 = oen0VarX.b;
                            long[] jArr2 = oen0VarX.a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j7 = jArr2[i6];
                                    if ((((~j7) << c) & j7 & j) == j) {
                                        if (i6 != length2) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j7 & j3) < j2) {
                                                ypb1 ypb1Var2 = (ypb1) objArr2[(i6 << 3) + i8];
                                                if (pv91.o(ypb1Var2)) {
                                                    pv91.g.d(ypb1Var2);
                                                }
                                            }
                                            j7 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 != length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                ypb1 ypb1Var3 = (ypb1) arrayList.get(i9);
                                if (pv91.o(ypb1Var3)) {
                                    pv91.g.d(ypb1Var3);
                                }
                            }
                        }
                        this.i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return lv91.e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public oen0 x() {
        return this.h;
    }

    @Override // p.jv91
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public iu30 e() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x016d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0177  */
    /* JADX WARN: Code duplicated, block: B:78:0x019c  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a3 A[LOOP:3: B:79:0x01a1->B:80:0x01a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:88:0x018a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final nln z(long j, oen0 oen0Var, HashMap map, nv91 nv91Var) {
        ArrayList arrayList;
        ArrayList arrayListN0;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        int size2;
        int i2;
        ypb1 ypb1Var;
        cqb1 cqb1Var;
        nv91 nv91Var2;
        Object[] objArr;
        long[] jArr;
        nv91 nv91Var3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j2;
        ArrayList arrayList4;
        cqb1 cqb1VarN;
        nv91 nv91VarE = d().f(g()).e(this.j);
        Object[] objArr3 = oen0Var.b;
        long[] jArr3 = oen0Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList2 = null;
            arrayListN0 = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            ypb1 ypb1Var2 = (ypb1) objArr3[(i4 << 3) + i6];
                            jArr2 = jArr3;
                            cqb1 cqb1VarK = ypb1Var2.k();
                            i3 = i6;
                            ArrayList arrayList5 = arrayList2;
                            cqb1 cqb1VarQ = pv91.q(cqb1VarK, j, nv91Var);
                            if (cqb1VarQ == null) {
                                arrayList4 = arrayListN0;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayListN0;
                                j2 = j3;
                                cqb1 cqb1VarQ2 = pv91.q(cqb1VarK, g(), nv91VarE);
                                if (cqb1VarQ2 != null && cqb1VarQ2.a != 1 && !cqb1VarQ.equals(cqb1VarQ2)) {
                                    nv91Var3 = nv91VarE;
                                    cqb1 cqb1VarQ3 = pv91.q(cqb1VarK, g(), d());
                                    if (cqb1VarQ3 == null) {
                                        pv91.p();
                                        throw null;
                                    }
                                    if (map == null || (cqb1VarN = (cqb1) map.get(cqb1VarQ)) == null) {
                                        cqb1VarN = ypb1Var2.n(cqb1VarQ2, cqb1VarQ, cqb1VarQ3);
                                    }
                                    if (cqb1VarN == null) {
                                        return new kv91(this);
                                    }
                                    if (!cqb1VarN.equals(cqb1VarQ3)) {
                                        if (cqb1VarN.equals(cqb1VarQ)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(oqn1.n(ypb1Var2, cqb1VarQ.c(g())));
                                            arrayListN0 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayListN0.add(ypb1Var2);
                                            arrayList2 = arrayList6;
                                        } else {
                                            arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList2.add(!cqb1VarN.equals(cqb1VarQ2) ? oqn1.n(ypb1Var2, cqb1VarN) : oqn1.n(ypb1Var2, cqb1VarQ2.c(g())));
                                        }
                                    }
                                    arrayListN0 = arrayList4;
                                }
                                arrayList2 = arrayList5;
                                arrayListN0 = arrayList4;
                            }
                            nv91Var3 = nv91VarE;
                            arrayList2 = arrayList5;
                            arrayListN0 = arrayList4;
                        } else {
                            nv91Var3 = nv91VarE;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i6;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i6 = i3 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        nv91VarE = nv91Var3;
                    }
                    nv91Var2 = nv91VarE;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    nv91Var2 = nv91VarE;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 != length) {
                    i4++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    nv91VarE = nv91Var2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    mmr0 mmr0Var = (mmr0) arrayList2.get(i2);
                    ypb1Var = (ypb1) mmr0Var.a;
                    cqb1Var = (cqb1) mmr0Var.b;
                    cqb1Var.a = j;
                    synchronized (pv91.c) {
                        cqb1Var.b = ypb1Var.k();
                        ypb1Var.l(cqb1Var);
                    }
                }
            }
            if (arrayListN0 != null) {
                size = arrayListN0.size();
                for (i = 0; i < size; i++) {
                    oen0Var.l((ypb1) arrayListN0.get(i));
                }
                arrayList3 = this.i;
                if (arrayList3 != null) {
                    arrayListN0 = o7h.N0(arrayListN0, arrayList3);
                }
                this.i = arrayListN0;
            }
            return lv91.e;
        }
        arrayList = null;
        arrayListN0 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i2 < size2) {
                mmr0 mmr0Var2 = (mmr0) arrayList2.get(i2);
                ypb1Var = (ypb1) mmr0Var2.a;
                cqb1Var = (cqb1) mmr0Var2.b;
                cqb1Var.a = j;
                synchronized (pv91.c) {
                    cqb1Var.b = ypb1Var.k();
                    ypb1Var.l(cqb1Var);
                }
            }
        }
        if (arrayListN0 != null) {
            size = arrayListN0.size();
            while (i < size) {
                oen0Var.l((ypb1) arrayListN0.get(i));
            }
            arrayList3 = this.i;
            if (arrayList3 != null) {
                arrayListN0 = o7h.N0(arrayListN0, arrayList3);
            }
            this.i = arrayListN0;
        }
        return lv91.e;
    }
}
