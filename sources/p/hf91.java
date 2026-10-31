package p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hf91 {
    public final ze91 a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public fdn0 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final up20 f49p;
    public final up20 q;
    public final up20 r;
    public fdn0 s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public edn0 x;

    static {
        new t2b((byte) 25);
    }

    public hf91(ze91 ze91Var) {
        this.a = ze91Var;
        int[] iArr = ze91Var.a;
        this.b = iArr;
        Object[] objArr = ze91Var.c;
        this.c = objArr;
        this.d = ze91Var.i;
        this.e = ze91Var.t;
        this.f = ze91Var.X;
        int i = ze91Var.b;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = ze91Var.d;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.f49p = new up20((byte) 2);
        this.q = new up20((byte) 2);
        this.r = new up20((byte) 2);
        this.u = i;
        this.v = -1;
    }

    public static int h(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static void y(hf91 hf91Var) {
        int i = hf91Var.v;
        int iQ = hf91Var.q(i);
        int[] iArr = hf91Var.b;
        int i2 = (iQ * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        hf91Var.V(hf91Var.F(i, iArr));
    }

    public final void A(int i) {
        s340 s340Var;
        int i2;
        s340 s340Var2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int iN = n() - this.h;
                ArrayList arrayList = this.d;
                if (i6 < i) {
                    for (int iB = bf91.b(arrayList, i6, iN); iB < this.d.size() && (i3 = (s340Var2 = (s340) this.d.get(iB)).a) < 0 && (i4 = i3 + iN) < i; iB++) {
                        s340Var2.a = i4;
                    }
                } else {
                    for (int iB2 = bf91.b(arrayList, i, iN); iB2 < this.d.size() && (i2 = (s340Var = (s340) this.d.get(iB2)).a) >= 0; iB2++) {
                        s340Var.a = -(iN - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    f46.P(i8 + i7, i7, i9, iArr, iArr);
                } else {
                    f46.P(i9, i9 + i8, i7 + i8, iArr, iArr);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iN2 = n();
            if (i6 >= iN2) {
                g0k.a("Check failed");
            }
            while (i6 < iN2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.b[i10];
                int iO = i11 > -2 ? i11 : (o() + i11) - (-2);
                if (iO >= i) {
                    iO = -((o() - iO) - (-2));
                }
                if (iO != i11) {
                    this.b[i10] = iO;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }

    public final void B(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, o());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iQ = q(iMin);
                int iQ2 = q(i5);
                int i7 = this.g;
                while (iQ < iQ2) {
                    int i8 = (iQ * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        g0k.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    iQ++;
                    if (iQ == i7) {
                        iQ += this.h;
                    }
                }
            } else {
                int iQ3 = q(i5);
                int iQ4 = q(iMin);
                while (iQ3 < iQ4) {
                    int i10 = (iQ3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        g0k.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    iQ3++;
                    if (iQ3 == this.g) {
                        iQ3 += this.h;
                    }
                }
            }
            this.m = iMin;
        }
        this.k = i;
    }

    public final List C(s340 s340Var, hf91 hf91Var) {
        if (hf91Var.n <= 0) {
            g0k.a("Check failed");
        }
        if (this.n != 0) {
            g0k.a("Check failed");
        }
        if (!s340Var.a()) {
            g0k.a("Check failed");
        }
        int iC = c(s340Var) + 1;
        int i = this.t;
        if (i > iC || iC >= this.u) {
            g0k.a("Check failed");
        }
        int iF = F(iC, this.b);
        int iT = t(iC);
        int iE = x(iC) ? 1 : E(iC);
        List listM = t2b.m(this, iC, hf91Var, false);
        V(iF);
        boolean z = iE > 0;
        while (iF >= i) {
            int iQ = q(iF);
            int[] iArr = this.b;
            int i2 = iQ * 5;
            int i3 = i2 + 3;
            iArr[i3] = iArr[i3] - iT;
            if (z) {
                int i4 = iArr[i2 + 1];
                if ((1073741824 & i4) != 0) {
                    z = false;
                } else {
                    bf91.f(iQ, (i4 & 67108863) - iE, iArr);
                }
            }
            iF = F(iF, this.b);
        }
        if (z) {
            if (this.o < iE) {
                g0k.a("Check failed");
            }
            this.o -= iE;
        }
        return listM;
    }

    public final Object D(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        if ((iArr[(iQ * 5) + 1] & 1073741824) != 0) {
            return this.c[g(f(iQ, iArr))];
        }
        return null;
    }

    public final int E(int i) {
        return this.b[(q(i) * 5) + 1] & 67108863;
    }

    public final int F(int i, int[] iArr) {
        int i2 = iArr[(q(i) * 5) + 2];
        return i2 > -2 ? i2 : (o() + i2) - (-2);
    }

    public final Object G(Object obj) {
        if (this.n > 0) {
            w(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[g(i)];
        if (this.i > this.j) {
            g0k.a("Writing to an invalid slot");
        }
        this.c[g(this.i - 1)] = obj;
        return obj2;
    }

    public final void H() {
        int i;
        edn0 edn0Var = this.x;
        if (edn0Var != null) {
            while (qxd0.O(edn0Var)) {
                int iT = qxd0.T(edn0Var);
                int iQ = q(iT);
                int iT2 = iT + 1;
                int iT3 = t(iT) + iT;
                while (true) {
                    if (iT2 >= iT3) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(q(iT2) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iT2 += t(iT2);
                    }
                }
                int[] iArr = this.b;
                int i2 = (iQ * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iF = F(iT, iArr);
                    if (iF >= 0) {
                        qxd0.I(edn0Var, iF);
                    }
                }
            }
        }
    }

    public final boolean I() {
        if (this.n != 0) {
            g0k.a("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int iF = f(q(i), this.b);
        int iM = M();
        P(this.v);
        edn0 edn0Var = this.x;
        if (edn0Var != null) {
            while (qxd0.O(edn0Var) && qxd0.Q(edn0Var) >= i) {
                qxd0.T(edn0Var);
            }
        }
        boolean zJ = J(i, this.t - i);
        K(iF, this.i - iF, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= iM;
        return zJ;
    }

    public final boolean J(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            A(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.e;
                int i3 = i + i2;
                int iB = bf91.b(this.d, i3, n() - this.h);
                if (iB >= this.d.size()) {
                    iB--;
                }
                int i4 = iB + 1;
                int i5 = 0;
                while (iB >= 0) {
                    s340 s340Var = (s340) this.d.get(iB);
                    int iC = c(s340Var);
                    if (iC < i) {
                        break;
                    }
                    if (iC < i3) {
                        s340Var.a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iB + 1;
                        }
                        i4 = iB;
                    }
                    iB--;
                }
                z = i4 < i5;
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(q(i8) * 5) + 1] & 67108864) != 0) {
                V(i8);
            }
        }
        return z;
    }

    public final void K(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            B(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            f46.e0(this.c, (te70) null, i, i5);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object L(int i, int i2, Object obj) {
        int iO = O(q(i), this.b);
        int iF = f(q(i + 1), this.b);
        int i3 = iO + i2;
        if (i3 < iO || i3 >= iF) {
            g0k.a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iG = g(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[iG];
        objArr[iG] = obj;
        return obj2;
    }

    public final int M() {
        int iQ = q(this.t);
        int i = this.t;
        int[] iArr = this.b;
        int i2 = iQ * 5;
        int i3 = iArr[i2 + 3] + i;
        this.t = i3;
        this.i = f(q(i3), iArr);
        int i4 = this.b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void N() {
        int i = this.u;
        this.t = i;
        this.i = f(q(i), this.b);
    }

    public final int O(int i, int[] iArr) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int iD = bf91.d(i, iArr);
        return iD < 0 ? (this.c.length - this.l) + iD + 1 : iD;
    }

    public final z340 P(int i) {
        s340 s340VarS;
        HashMap map = this.e;
        if (map == null || (s340VarS = S(i)) == null) {
            return null;
        }
        return (z340) map.get(s340VarS);
    }

    public final void Q() {
        if (this.n != 0) {
            g0k.a("Key must be supplied when inserting");
        }
        m4c m4cVar = fkj0.X;
        R(0, m4cVar, m4cVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(int i, Object obj, Object obj2, boolean z) {
        int i2;
        m4c m4cVar = fkj0.X;
        int i3 = this.v;
        Object[] objArr = this.n > 0;
        this.r.h(this.o);
        if (objArr == true) {
            int i4 = this.t;
            int iF = f(q(i4), this.b);
            v(1);
            this.i = iF;
            this.j = iF;
            int iQ = q(i4);
            int i5 = obj != m4cVar ? 1 : 0;
            int i6 = (z || obj2 == m4cVar) ? 0 : 1;
            int iH = h(iF, this.k, this.l, this.c.length);
            if (iH >= 0 && this.m < i4) {
                iH = -(((this.c.length - this.l) - iH) + 1);
            }
            int[] iArr = this.b;
            int i7 = this.v;
            int i8 = iQ * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = iH;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                w(i9, i4);
                Object[] objArr2 = this.c;
                int i10 = this.i;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.i = i10;
            }
            this.o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0) {
                P(i3);
            }
        } else {
            this.f49p.h(i3);
            this.q.h((n() - this.h) - this.u);
            int i11 = this.t;
            int iQ2 = q(i11);
            if (!u890.j(obj2, m4cVar)) {
                if (z) {
                    W(this.t, obj2);
                } else {
                    U(obj2);
                }
            }
            this.i = O(iQ2, this.b);
            this.j = f(q(this.t + 1), this.b);
            int[] iArr2 = this.b;
            int i12 = iQ2 * 5;
            this.o = iArr2[i12 + 1] & 67108863;
            this.v = i11;
            this.t = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.u = i2;
    }

    public final s340 S(int i) {
        ArrayList arrayList;
        int iC;
        if (i < 0 || i >= o() || (iC = bf91.c((arrayList = this.d), i, o())) < 0) {
            return null;
        }
        return (s340) arrayList.get(iC);
    }

    public final void T(Object obj) {
        if (this.n <= 0 || this.i == this.k) {
            G(obj);
            return;
        }
        fdn0 fdn0Var = this.s;
        if (fdn0Var == null) {
            fdn0Var = new fdn0();
        }
        this.s = fdn0Var;
        int i = this.v;
        Object objB = fdn0Var.b(i);
        if (objB == null) {
            objB = new wdn0();
            fdn0Var.i(i, objB);
        }
        ((wdn0) objB).b(obj);
    }

    public final void U(Object obj) {
        int iQ = q(this.t);
        int i = (iQ * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            g0k.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[g(Integer.bitCount(iArr[i] >> 29) + f(iQ, iArr))] = obj;
    }

    public final void V(int i) {
        if (i >= 0) {
            edn0 edn0VarL = this.x;
            if (edn0VarL == null) {
                edn0VarL = qxd0.L();
                this.x = edn0VarL;
            }
            qxd0.I(edn0VarL, i);
        }
    }

    public final void W(int i, Object obj) {
        int iQ = q(i);
        int[] iArr = this.b;
        if (iQ >= iArr.length || (iArr[(iQ * 5) + 1] & 1073741824) == 0) {
            g0k.a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[g(f(iQ, this.b))] = obj;
    }

    public final void a(int i) {
        if (i < 0) {
            g0k.a("Cannot seek backwards");
        }
        if (this.n > 0) {
            bmv0.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        int i3 = this.v;
        if (i2 < i3 || i2 > this.u) {
            g0k.a("Cannot seek outside the current group (" + i3 + "-" + this.u + ")");
        }
        this.t = i2;
        int iF = f(q(i2), this.b);
        this.i = iF;
        this.j = iF;
    }

    public final s340 b(int i) {
        ArrayList arrayList = this.d;
        int iC = bf91.c(arrayList, i, o());
        if (iC >= 0) {
            return (s340) arrayList.get(iC);
        }
        if (i > this.g) {
            i = -(o() - i);
        }
        s340 s340Var = new s340(i);
        arrayList.add(-(iC + 1), s340Var);
        return s340Var;
    }

    public final int c(s340 s340Var) {
        int i = s340Var.a;
        return i < 0 ? o() + i : i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.h((n() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.f49p.a == 0) {
            A(o());
            B(this.c.length - this.l, this.g);
            int i = this.k;
            f46.e0(this.c, (te70) null, i, this.l + i);
            H();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap map = this.e;
        fdn0 fdn0Var = this.f;
        ze91 ze91Var = this.a;
        if (!ze91Var.g) {
            bmv0.a("Unexpected writer close()");
        }
        ze91Var.g = false;
        ze91Var.a = iArr;
        ze91Var.b = i2;
        ze91Var.c = objArr;
        ze91Var.d = i3;
        ze91Var.i = arrayList;
        ze91Var.t = map;
        ze91Var.X = fdn0Var;
    }

    public final int f(int i, int[] iArr) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.l) + i2 + 1 : i2;
    }

    public final int g(int i) {
        return (this.l * (i < this.k ? 0 : 1)) + i;
    }

    public final void i() {
        wdn0 wdn0Var;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int iQ = q(i3);
        int i4 = this.o;
        int i5 = i - i3;
        int i6 = iQ * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        up20 up20Var = this.r;
        if (z) {
            fdn0 fdn0Var = this.s;
            if (fdn0Var != null && (wdn0Var = (wdn0) fdn0Var.b(i3)) != null) {
                Object[] objArr = wdn0Var.a;
                int i8 = wdn0Var.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    G(objArr[i9]);
                }
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            bf91.f(iQ, i4, iArr);
            int iG = up20Var.g();
            if (z2) {
                i4 = 1;
            }
            this.o = iG + i4;
            int iF = F(i3, this.b);
            this.v = iF;
            int iO = iF < 0 ? o() : q(iF + 1);
            int iF2 = iO >= 0 ? f(iO, this.b) : 0;
            this.i = iF2;
            this.j = iF2;
            return;
        }
        if (i != i2) {
            g0k.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        bf91.f(iQ, i4, iArr2);
        int iG2 = this.f49p.g();
        this.u = (n() - this.h) - this.q.g();
        this.v = iG2;
        int iF3 = F(i3, this.b);
        int iG3 = up20Var.g();
        this.o = iG3;
        if (iF3 == iG2) {
            this.o = iG3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iF3 != 0 && iF3 != iG2 && (i14 != 0 || i13 != 0)) {
                int iQ2 = q(iF3);
                if (i13 != 0) {
                    int[] iArr3 = this.b;
                    int i15 = (iQ2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.b;
                    bf91.f(iQ2, (iArr4[(iQ2 * 5) + 1] & 67108863) + i14, iArr4);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(iQ2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iF3 = F(iF3, iArr5);
            }
        }
        this.o += i14;
    }

    public final void j() {
        if (this.n <= 0) {
            bmv0.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.a != this.f49p.a) {
                g0k.a("startGroup/endGroup mismatch while inserting");
            }
            this.u = (n() - this.h) - this.q.g();
        }
    }

    public final void k(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            g0k.a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                g0k.a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            Q();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void l(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((o() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(q(i3) * 5) + 2] = i;
            int i4 = this.b[(q(i3) * 5) + 3] + i3;
            l(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final void m(int i, vu30 vu30Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int iF = F(i, this.b);
        int iO = o();
        int iT = t(i) + i;
        int i6 = i;
        gdn0 gdn0Var = null;
        edn0 edn0Var = null;
        while (i6 < iT) {
            int iF2 = f(q(i6), this.b);
            int i7 = i6 + 1;
            int iF3 = f(q(i7), this.b);
            while (iF2 < iF3) {
                Object obj = this.c[g(iF2)];
                if (!(obj instanceof b440) || (i5 = ot11.v((b440) obj).b) < 0) {
                    i4 = iF;
                    vu30Var.invoke(Integer.valueOf(iF2), obj);
                } else {
                    int iT2 = t(i6) + i6;
                    int i8 = i7;
                    int i9 = 0;
                    while (i8 < iT2 && i9 < i5) {
                        int iQ = q(i8);
                        int i10 = iF;
                        int[] iArr = this.b;
                        int i11 = iQ * 5;
                        i8 = iArr[i11 + 3] + i8;
                        if (i8 < iT2 && (iArr[i11 + 1] & 536870912) == 0) {
                            i9++;
                        }
                        iF = i10;
                    }
                    i4 = iF;
                    if (gdn0Var == null) {
                        int[] iArr2 = xr80.a;
                        gdn0Var = new gdn0();
                    }
                    if (edn0Var == null) {
                        edn0Var = new edn0();
                    }
                    gdn0Var.a(i8);
                    edn0Var.a(i8);
                    edn0Var.a(iF2);
                }
                iF2++;
                iF = i4;
            }
            int i12 = iF;
            iF = i7 < iO ? F(i7, this.b) : -1;
            if (iF != i6) {
                int iF4 = i12;
                while (true) {
                    if (edn0Var == null || gdn0Var == null || !gdn0Var.g(i6)) {
                        i2 = iO;
                    } else {
                        int i13 = edn0Var.b;
                        int i14 = i13 / 2;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < i14) {
                            int i17 = i15 * 2;
                            int i18 = iO;
                            int iC = edn0Var.c(i17);
                            if (iC == i6) {
                                int iC2 = edn0Var.c(i17 + 1);
                                vu30Var.invoke(Integer.valueOf(iC2), this.c[g(iC2)]);
                            } else if (i17 != i16) {
                                int i19 = i16 + 1;
                                edn0Var.f(i16, iC);
                                i16 += 2;
                                edn0Var.f(i19, edn0Var.c(i17 + 1));
                            } else {
                                i16 += 2;
                            }
                            i15++;
                            vu30Var = vu30Var;
                            iO = i18;
                        }
                        i2 = iO;
                        if (i16 != i13) {
                            if (i16 < 0 || i16 > (i3 = edn0Var.b) || i13 < 0 || i13 > i3) {
                                eqr0.O("Index must be between 0 and size");
                                throw null;
                            }
                            if (i13 < i16) {
                                eqr0.N("The end index must be < start index");
                                throw null;
                            }
                            if (i13 != i16) {
                                if (i13 < i3) {
                                    int[] iArr3 = edn0Var.a;
                                    f46.P(i16, i13, i3, iArr3, iArr3);
                                }
                                edn0Var.b -= i13 - i16;
                            }
                        }
                    }
                    if (i6 == i || iF4 == iF) {
                        break;
                    }
                    i6 = iF4;
                    iO = i2;
                    iF4 = F(iF4, this.b);
                    vu30Var = vu30Var;
                }
            } else {
                i2 = iO;
            }
            i6 = i7;
            iO = i2;
        }
    }

    public final int n() {
        return this.b.length / 5;
    }

    public final int o() {
        return n() - this.h;
    }

    public final Object p(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        int i2 = (iQ * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return fkj0.X;
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + f(iQ, iArr)];
    }

    public final int q(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    public final int r(int i) {
        return this.b[q(i) * 5];
    }

    public final Object s(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        int i2 = iQ * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final int t(int i) {
        return this.b[(q(i) * 5) + 3];
    }

    public final String toString() {
        int i = this.t;
        int i2 = this.u;
        int iO = o();
        int i3 = this.g;
        int i4 = this.h + i3;
        StringBuilder sbQ = cy30.q(i, i2, "SlotWriter(current = ", " end=", " size = ");
        ktd.p(iO, i3, " gap=", "-", sbQ);
        return gvg.j(sbQ, i4, ")");
    }

    public final boolean u(int i, int i2) {
        int iN;
        int iT;
        if (i2 == this.v) {
            iN = this.u;
        } else {
            up20 up20Var = this.f49p;
            if (i2 > up20Var.f(0)) {
                iT = t(i2);
            } else {
                int[] iArr = (int[]) up20Var.b;
                int iMin = Math.min(iArr.length, up20Var.a);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iT = t(i2);
                } else {
                    iN = (n() - this.h) - ((int[]) this.q.b)[i3];
                }
            }
            iN = iT + i2;
        }
        return i > i2 && i < iN;
    }

    public final void v(int i) {
        if (i > 0) {
            int i2 = this.t;
            A(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                f46.P(0, 0, i3 * 5, iArr, iArr2);
                f46.P((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.b = iArr2;
                i4 = i6;
                iArr = iArr2;
            }
            int i7 = this.u;
            if (i7 >= i3) {
                this.u = i7 + i;
            }
            int i8 = i3 + i;
            this.g = i8;
            this.h = i4 - i;
            int iH = h(i5 > 0 ? f(q(i2 + i), iArr) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.b[(i9 * 5) + 4] = iH;
            }
            int i10 = this.m;
            if (i10 >= i3) {
                this.m = i10 + i;
            }
        }
    }

    public final void w(int i, int i2) {
        if (i > 0) {
            B(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean x(int i) {
        return (this.b[(q(i) * 5) + 1] & 1073741824) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(ze91 ze91Var, int i) {
        if (this.n <= 0) {
            g0k.a("Check failed");
        }
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i == 0 && this.t == 0 && this.a.b == 0) {
            int[] iArr = ze91Var.a;
            int i2 = iArr[(i * 5) + 3];
            int i3 = ze91Var.b;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr3 = this.c;
                ArrayList arrayList = this.d;
                HashMap map = this.e;
                fdn0 fdn0Var = this.f;
                Object[] objArr4 = ze91Var.c;
                int i4 = ze91Var.d;
                HashMap map2 = ze91Var.t;
                fdn0 fdn0Var2 = ze91Var.X;
                this.b = iArr;
                this.c = objArr4;
                this.d = ze91Var.i;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr4.length - i4;
                this.m = i3;
                this.e = map2;
                this.f = fdn0Var2;
                ze91Var.a = iArr2;
                ze91Var.b = objArr2 == true ? 1 : 0;
                ze91Var.c = objArr3;
                ze91Var.d = objArr == true ? 1 : 0;
                ze91Var.i = arrayList;
                ze91Var.t = map;
                ze91Var.X = fdn0Var;
                return;
            }
        }
        hf91 hf91VarI = ze91Var.i();
        try {
            t2b.d(hf91VarI, i, this);
            boolean z2 = true;
        } finally {
            hf91VarI.e(z);
        }
    }
}
