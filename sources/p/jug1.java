package p;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jug1 {
    public static final jug1 e = new jug1(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final jma c;
    public Object[] d;

    public jug1(int i, int i2, Object[] objArr, jma jmaVar) {
        this.a = i;
        this.b = i2;
        this.c = jmaVar;
        this.d = objArr;
    }

    public static jug1 k(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, jma jmaVar) {
        if (i3 > 30) {
            return new jug1(0, 0, new Object[]{obj, obj2, obj3, obj4}, jmaVar);
        }
        int iV = upn1.v(i, i3);
        int iV2 = upn1.v(i2, i3);
        if (iV != iV2) {
            return new jug1((1 << iV) | (1 << iV2), 0, iV < iV2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, jmaVar);
        }
        return new jug1(0, 1 << iV, new Object[]{k(i, obj, obj2, i2, obj3, obj4, i3 + 5, jmaVar)}, jmaVar);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, jma jmaVar) {
        Object obj3 = this.d[i];
        return upn1.e(this.d, i, u(i2) + 1, k(obj3 == null ? 0 : obj3.hashCode(), obj3, y(i), i3, obj, obj2, i4 + 5, jmaVar));
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += t(i).b();
        }
        return iBitCount;
    }

    public final int c(Object obj) {
        rr80 rr80VarO = yoi1.O(yoi1.Q(0, this.d.length), 2);
        int i = rr80VarO.a;
        int i2 = rr80VarO.b;
        int i3 = rr80VarO.c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return -1;
        }
        while (true) {
            int i4 = i + i3;
            if (u890.j(obj, this.d[i])) {
                return i;
            }
            if (i == i2) {
                return -1;
            }
            i = i4;
        }
    }

    public final boolean d(int i, int i2, Object obj) {
        int iV = 1 << upn1.v(i, i2);
        if (i(iV)) {
            return u890.j(obj, this.d[f(iV)]);
        }
        if (!j(iV)) {
            return false;
        }
        jug1 jug1VarT = t(u(iV));
        if (i2 == 30) {
            return jug1VarT.c(obj) != -1;
        }
        return jug1VarT.d(i, i2 + 5, obj);
    }

    public final boolean e(jug1 jug1Var) {
        if (this == jug1Var) {
            return true;
        }
        if (this.b == jug1Var.b && this.a == jug1Var.a) {
            int length = this.d.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                if (this.d[i] == jug1Var.d[i]) {
                    i = i2;
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final boolean g(jug1 jug1Var, vu30 vu30Var) {
        int i;
        if (this == jug1Var) {
            return true;
        }
        int i2 = this.a;
        if (i2 != jug1Var.a || (i = this.b) != jug1Var.b) {
            return false;
        }
        if (i2 == 0 && i == 0) {
            Object[] objArr = this.d;
            if (objArr.length != jug1Var.d.length) {
                return false;
            }
            Iterable iterableO = yoi1.O(yoi1.Q(0, objArr.length), 2);
            if ((iterableO instanceof Collection) && ((Collection) iterableO).isEmpty()) {
                return true;
            }
            Iterator it = iterableO.iterator();
            while (it.hasNext()) {
                int iNextInt = ((lr80) it).nextInt();
                Object obj = jug1Var.d[iNextInt];
                Object objY = jug1Var.y(iNextInt);
                int iC = c(obj);
                if (!(iC != -1 ? ((Boolean) vu30Var.invoke(y(iC), objY)).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        int iBitCount = Integer.bitCount(i2) * 2;
        rr80 rr80VarO = yoi1.O(yoi1.Q(0, iBitCount), 2);
        int i3 = rr80VarO.a;
        int i4 = rr80VarO.b;
        int i5 = rr80VarO.c;
        if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
            while (true) {
                int i6 = i3 + i5;
                if (!u890.j(this.d[i3], jug1Var.d[i3]) || !((Boolean) vu30Var.invoke(y(i3), jug1Var.y(i3))).booleanValue()) {
                    return false;
                }
                if (i3 == i4) {
                    break;
                }
                i3 = i6;
            }
        }
        int length = this.d.length;
        while (iBitCount < length) {
            int i7 = iBitCount + 1;
            if (!t(iBitCount).g(jug1Var.t(iBitCount), vu30Var)) {
                return false;
            }
            iBitCount = i7;
        }
        return true;
    }

    public final Object h(int i, int i2, Object obj) {
        int iV = 1 << upn1.v(i, i2);
        if (i(iV)) {
            int iF = f(iV);
            if (u890.j(obj, this.d[iF])) {
                return y(iF);
            }
            return null;
        }
        if (!j(iV)) {
            return null;
        }
        jug1 jug1VarT = t(u(iV));
        if (i2 != 30) {
            return jug1VarT.h(i, i2 + 5, obj);
        }
        int iC = jug1VarT.c(obj);
        if (iC != -1) {
            return jug1VarT.y(iC);
        }
        return null;
    }

    public final boolean i(int i) {
        return (this.a & i) != 0;
    }

    public final boolean j(int i) {
        return (this.b & i) != 0;
    }

    public final jug1 l(int i, hps0 hps0Var) {
        hps0Var.k(hps0Var.c() - 1);
        hps0Var.j(y(i));
        if (this.d.length == 2) {
            return null;
        }
        jma jmaVarH = hps0Var.h();
        Object[] objArr = this.d;
        if (this.c != jmaVarH) {
            return new jug1(0, 0, upn1.c(i, objArr), hps0Var.h());
        }
        this.d = upn1.c(i, objArr);
        return this;
    }

    public final jug1 m(int i, Object obj, Object obj2, int i2, hps0 hps0Var) {
        hps0 hps0Var2;
        jug1 jug1VarM;
        int iV = 1 << upn1.v(i, i2);
        boolean zI = i(iV);
        jma jmaVar = this.c;
        if (zI) {
            int iF = f(iV);
            if (!u890.j(obj, this.d[iF])) {
                hps0Var.k(hps0Var.c() + 1);
                jma jmaVarH = hps0Var.h();
                if (jmaVar != jmaVarH) {
                    return new jug1(this.a ^ iV, this.b | iV, a(iF, iV, i, obj, obj2, i2, jmaVarH), jmaVarH);
                }
                this.d = a(iF, iV, i, obj, obj2, i2, jmaVarH);
                this.a ^= iV;
                this.b |= iV;
                return this;
            }
            hps0Var.j(y(iF));
            if (y(iF) == obj2) {
                return this;
            }
            if (jmaVar == hps0Var.h()) {
                this.d[iF + 1] = obj2;
                return this;
            }
            hps0Var.i(hps0Var.f() + 1);
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = obj2;
            return new jug1(this.a, this.b, objArrCopyOf, hps0Var.h());
        }
        if (!j(iV)) {
            hps0Var.k(hps0Var.c() + 1);
            jma jmaVarH2 = hps0Var.h();
            int iF2 = f(iV);
            Object[] objArr2 = this.d;
            if (jmaVar != jmaVarH2) {
                return new jug1(this.a | iV, this.b, upn1.b(objArr2, iF2, obj, obj2), jmaVarH2);
            }
            this.d = upn1.b(objArr2, iF2, obj, obj2);
            this.a |= iV;
            return this;
        }
        int iU = u(iV);
        jug1 jug1VarT = t(iU);
        if (i2 == 30) {
            int iC = jug1VarT.c(obj);
            if (iC != -1) {
                hps0Var.j(jug1VarT.y(iC));
                if (jug1VarT.c == hps0Var.h()) {
                    jug1VarT.d[iC + 1] = obj2;
                    jug1VarM = jug1VarT;
                } else {
                    hps0Var.i(hps0Var.f() + 1);
                    Object[] objArr3 = jug1VarT.d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    objArrCopyOf2[iC + 1] = obj2;
                    jug1VarM = new jug1(0, 0, objArrCopyOf2, hps0Var.h());
                }
            } else {
                hps0Var.k(hps0Var.c() + 1);
                jug1VarM = new jug1(0, 0, upn1.b(jug1VarT.d, 0, obj, obj2), hps0Var.h());
            }
            hps0Var2 = hps0Var;
        } else {
            hps0Var2 = hps0Var;
            jug1VarM = jug1VarT.m(i, obj, obj2, i2 + 5, hps0Var2);
        }
        return jug1VarT == jug1VarM ? this : s(iU, jug1VarM, hps0Var2.h());
    }

    public final jug1 n(jug1 jug1Var, int i, w9t w9tVar, hps0 hps0Var) {
        jug1 jug1Var2;
        jug1 jug1VarK;
        if (this == jug1Var) {
            w9tVar.b(b());
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            jma jmaVarH = hps0Var.h();
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + jug1Var.d.length);
            int length = this.d.length;
            rr80 rr80VarO = yoi1.O(yoi1.Q(0, jug1Var.d.length), 2);
            int i3 = rr80VarO.a;
            int i4 = rr80VarO.b;
            int i5 = rr80VarO.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    int i6 = i3 + i5;
                    if (c(jug1Var.d[i3]) != -1) {
                        w9tVar.c(w9tVar.a() + 1);
                    } else {
                        Object[] objArr2 = jug1Var.d;
                        objArrCopyOf[length] = objArr2[i3];
                        objArrCopyOf[length + 1] = objArr2[i3 + 1];
                        length += 2;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 = i6;
                }
            }
            if (length != this.d.length) {
                if (length != jug1Var.d.length) {
                    return length == objArrCopyOf.length ? new jug1(0, 0, objArrCopyOf, jmaVarH) : new jug1(0, 0, Arrays.copyOf(objArrCopyOf, length), jmaVarH);
                }
            }
            return this;
        }
        int i7 = this.b | jug1Var.b;
        int i8 = this.a;
        int i9 = jug1Var.a;
        int i10 = (i8 ^ i9) & (~i7);
        int i11 = i8 & i9;
        while (i11 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i11);
            if (u890.j(this.d[f(iLowestOneBit)], jug1Var.d[jug1Var.f(iLowestOneBit)])) {
                i10 |= iLowestOneBit;
            } else {
                i7 |= iLowestOneBit;
            }
            i11 ^= iLowestOneBit;
        }
        if ((i7 & i10) != 0) {
            eg.m("Check failed.");
            return null;
        }
        if (u890.j(this.c, hps0Var.h()) && this.a == i10 && this.b == i7) {
            jug1Var2 = this;
        } else {
            jug1Var2 = new jug1(i10, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i10) * 2)], null);
        }
        int i12 = 0;
        while (i7 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i7);
            Object[] objArr3 = jug1Var2.d;
            int length2 = (objArr3.length - 1) - i12;
            if (j(iLowestOneBit2)) {
                jug1VarK = t(u(iLowestOneBit2));
                if (jug1Var.j(iLowestOneBit2)) {
                    jug1VarK = jug1VarK.n(jug1Var.t(jug1Var.u(iLowestOneBit2)), i + 5, w9tVar, hps0Var);
                } else if (jug1Var.i(iLowestOneBit2)) {
                    int iF = jug1Var.f(iLowestOneBit2);
                    Object obj = jug1Var.d[iF];
                    Object objY = jug1Var.y(iF);
                    int iC = hps0Var.c();
                    jug1VarK = jug1VarK.m(obj == null ? i2 : obj.hashCode(), obj, objY, i + 5, hps0Var);
                    if (hps0Var.c() == iC) {
                        w9tVar.c(w9tVar.a() + 1);
                    }
                }
            } else if (jug1Var.j(iLowestOneBit2)) {
                jug1 jug1VarT = jug1Var.t(jug1Var.u(iLowestOneBit2));
                if (i(iLowestOneBit2)) {
                    int iF2 = f(iLowestOneBit2);
                    Object obj2 = this.d[iF2];
                    int iHashCode = obj2 == null ? i2 : obj2.hashCode();
                    int i13 = i + 5;
                    if (jug1VarT.d(iHashCode, i13, obj2)) {
                        w9tVar.c(w9tVar.a() + 1);
                        jug1VarK = jug1VarT;
                    } else {
                        jug1VarK = jug1VarT.m(obj2 == null ? 0 : obj2.hashCode(), obj2, y(iF2), i13, hps0Var);
                    }
                } else {
                    jug1VarK = jug1VarT;
                }
            } else {
                int iF3 = f(iLowestOneBit2);
                Object obj3 = this.d[iF3];
                Object objY2 = y(iF3);
                int iF4 = jug1Var.f(iLowestOneBit2);
                Object obj4 = jug1Var.d[iF4];
                jug1VarK = k(obj3 == null ? 0 : obj3.hashCode(), obj3, objY2, obj4 == null ? 0 : obj4.hashCode(), obj4, jug1Var.y(iF4), i + 5, hps0Var.h());
            }
            objArr3[length2] = jug1VarK;
            i12++;
            i7 ^= iLowestOneBit2;
            i2 = 0;
        }
        int i14 = 0;
        while (i10 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i10);
            int i15 = i14 * 2;
            if (jug1Var.i(iLowestOneBit3)) {
                int iF5 = jug1Var.f(iLowestOneBit3);
                Object[] objArr4 = jug1Var2.d;
                objArr4[i15] = jug1Var.d[iF5];
                objArr4[i15 + 1] = jug1Var.y(iF5);
                if (i(iLowestOneBit3)) {
                    w9tVar.c(w9tVar.a() + 1);
                }
            } else {
                int iF6 = f(iLowestOneBit3);
                Object[] objArr5 = jug1Var2.d;
                objArr5[i15] = this.d[iF6];
                objArr5[i15 + 1] = y(iF6);
            }
            i14++;
            i10 ^= iLowestOneBit3;
        }
        if (!e(jug1Var2)) {
            return jug1Var.e(jug1Var2) ? jug1Var : jug1Var2;
        }
        return this;
    }

    public final jug1 o(int i, Object obj, int i2, hps0 hps0Var) {
        jug1 jug1VarO;
        int iV = 1 << upn1.v(i, i2);
        if (i(iV)) {
            int iF = f(iV);
            if (u890.j(obj, this.d[iF])) {
                return q(iF, iV, hps0Var);
            }
        } else if (j(iV)) {
            int iU = u(iV);
            jug1 jug1VarT = t(iU);
            if (i2 == 30) {
                int iC = jug1VarT.c(obj);
                jug1VarO = iC != -1 ? jug1VarT.l(iC, hps0Var) : jug1VarT;
            } else {
                jug1VarO = jug1VarT.o(i, obj, i2 + 5, hps0Var);
            }
            return r(jug1VarT, jug1VarO, iU, iV, hps0Var.h());
        }
        return this;
    }

    public final jug1 p(int i, Object obj, Object obj2, int i2, hps0 hps0Var) {
        hps0 hps0Var2;
        jug1 jug1VarP;
        int iV = 1 << upn1.v(i, i2);
        if (i(iV)) {
            int iF = f(iV);
            return (u890.j(obj, this.d[iF]) && u890.j(obj2, y(iF))) ? q(iF, iV, hps0Var) : this;
        }
        if (!j(iV)) {
            return this;
        }
        int iU = u(iV);
        jug1 jug1VarT = t(iU);
        if (i2 == 30) {
            int iC = jug1VarT.c(obj);
            jug1VarP = (iC == -1 || !u890.j(obj2, jug1VarT.y(iC))) ? jug1VarT : jug1VarT.l(iC, hps0Var);
            hps0Var2 = hps0Var;
        } else {
            hps0Var2 = hps0Var;
            jug1VarP = jug1VarT.p(i, obj, obj2, i2 + 5, hps0Var2);
        }
        return r(jug1VarT, jug1VarP, iU, iV, hps0Var2.h());
    }

    public final jug1 q(int i, int i2, hps0 hps0Var) {
        hps0Var.k(hps0Var.c() - 1);
        hps0Var.j(y(i));
        if (this.d.length == 2) {
            return null;
        }
        jma jmaVarH = hps0Var.h();
        Object[] objArr = this.d;
        if (this.c != jmaVarH) {
            return new jug1(i2 ^ this.a, this.b, upn1.c(i, objArr), hps0Var.h());
        }
        this.d = upn1.c(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final jug1 r(jug1 jug1Var, jug1 jug1Var2, int i, int i2, jma jmaVar) {
        if (jug1Var2 != null) {
            return jug1Var != jug1Var2 ? s(i, jug1Var2, jmaVar) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.c != jmaVar) {
            return new jug1(this.a, this.b ^ i2, upn1.d(i, objArr), jmaVar);
        }
        this.d = upn1.d(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final jug1 s(int i, jug1 jug1Var, jma jmaVar) {
        jma jmaVar2 = jug1Var.c;
        Object[] objArr = this.d;
        if (objArr.length == 1 && jug1Var.d.length == 2 && jug1Var.b == 0) {
            jug1Var.a = this.b;
            return jug1Var;
        }
        if (this.c == jmaVar) {
            objArr[i] = jug1Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = jug1Var;
        return new jug1(this.a, this.b, objArrCopyOf, jmaVar);
    }

    public final jug1 t(int i) {
        Object obj = this.d[i];
        if (obj != null) {
            return (jug1) obj;
        }
        bhn0.i("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return null;
    }

    public final int u(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
    
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
    
        r4.s(x(r1, r2, r4.j()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p.svh0 v(java.lang.Object r13, int r14, int r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.jug1.v(java.lang.Object, int, int, java.lang.Object):p.svh0");
    }

    public final jug1 w(int i, int i2, String str) {
        jug1 jug1VarW;
        int iV = 1 << upn1.v(i, i2);
        if (i(iV)) {
            int iF = f(iV);
            if (!str.equals(this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new jug1(this.a ^ iV, this.b, upn1.c(iF, objArr), null);
            }
        } else {
            if (!j(iV)) {
                return this;
            }
            int iU = u(iV);
            jug1 jug1VarT = t(iU);
            if (i2 == 30) {
                int iC = jug1VarT.c(str);
                if (iC != -1) {
                    Object[] objArr2 = jug1VarT.d;
                    jug1VarW = objArr2.length == 2 ? null : new jug1(0, 0, upn1.c(iC, objArr2), null);
                } else {
                    jug1VarW = jug1VarT;
                }
            } else {
                jug1VarW = jug1VarT.w(i, i2 + 5, str);
            }
            if (jug1VarW != null) {
                return jug1VarT != jug1VarW ? x(iU, iV, jug1VarW) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new jug1(this.a, this.b ^ iV, upn1.d(iU, objArr3), null);
            }
        }
        return null;
    }

    public final jug1 x(int i, int i2, jug1 jug1Var) {
        Object[] objArr = jug1Var.d;
        if (objArr.length != 2 || jug1Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = jug1Var;
            return new jug1(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            jug1Var.a = this.b;
            return jug1Var;
        }
        return new jug1(this.a ^ i2, this.b ^ i2, upn1.f(i, f(i2), objArr[0], objArr[1], this.d), null);
    }

    public final Object y(int i) {
        return this.d[i + 1];
    }
}
