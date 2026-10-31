package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kug1 {
    public static final kug1 e = new kug1(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final ypa c;
    public Object[] d;

    public kug1(int i, int i2, Object[] objArr, ypa ypaVar) {
        this.a = i;
        this.b = i2;
        this.c = ypaVar;
        this.d = objArr;
    }

    public static kug1 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, ypa ypaVar) {
        if (i3 > 30) {
            return new kug1(0, 0, new Object[]{obj, obj2, obj3, obj4}, ypaVar);
        }
        int iT = xpn1.t(i, i3);
        int iT2 = xpn1.t(i2, i3);
        if (iT != iT2) {
            return new kug1((1 << iT) | (1 << iT2), 0, iT < iT2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, ypaVar);
        }
        return new kug1(0, 1 << iT, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, ypaVar)}, ypaVar);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, ypa ypaVar) {
        Object obj3 = this.d[i];
        return xpn1.n(this.d, i, t(i2) + 1, j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, ypaVar));
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        rr80 rr80VarO = yoi1.O(yoi1.Q(0, this.d.length), 2);
        int i = rr80VarO.a;
        int i2 = rr80VarO.b;
        int i3 = rr80VarO.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!u890.j(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iT = 1 << xpn1.t(i, i2);
        if (h(iT)) {
            return u890.j(obj, this.d[f(iT)]);
        }
        if (!i(iT)) {
            return false;
        }
        kug1 kug1VarS = s(t(iT));
        return i2 == 30 ? kug1VarS.c(obj) : kug1VarS.d(i, i2 + 5, obj);
    }

    public final boolean e(kug1 kug1Var) {
        if (this == kug1Var) {
            return true;
        }
        if (this.b == kug1Var.b && this.a == kug1Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == kug1Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int iT = 1 << xpn1.t(i, i2);
        if (h(iT)) {
            int iF = f(iT);
            if (u890.j(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iT)) {
            return null;
        }
        kug1 kug1VarS = s(t(iT));
        if (i2 != 30) {
            return kug1VarS.g(i, i2 + 5, obj);
        }
        rr80 rr80VarO = yoi1.O(yoi1.Q(0, kug1VarS.d.length), 2);
        int i3 = rr80VarO.a;
        int i4 = rr80VarO.b;
        int i5 = rr80VarO.c;
        if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
            while (!u890.j(obj, kug1VarS.d[i3])) {
                if (i3 != i4) {
                    i3 += i5;
                }
            }
            return kug1VarS.x(i3);
        }
        return null;
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final kug1 k(int i, ips0 ips0Var) {
        ips0Var.g(ips0Var.f - 1);
        ips0Var.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != ips0Var.b) {
            return new kug1(0, 0, xpn1.l(i, objArr), ips0Var.b);
        }
        this.d = xpn1.l(i, objArr);
        return this;
    }

    public final kug1 l(int i, Object obj, Object obj2, int i2, ips0 ips0Var) {
        ips0 ips0Var2;
        kug1 kug1VarL;
        int iT = 1 << xpn1.t(i, i2);
        boolean zH = h(iT);
        ypa ypaVar = this.c;
        if (zH) {
            int iF = f(iT);
            if (!u890.j(obj, this.d[iF])) {
                ips0Var.g(ips0Var.f + 1);
                ypa ypaVar2 = ips0Var.b;
                if (ypaVar != ypaVar2) {
                    return new kug1(this.a ^ iT, this.b | iT, a(iF, iT, i, obj, obj2, i2, ypaVar2), ypaVar2);
                }
                this.d = a(iF, iT, i, obj, obj2, i2, ypaVar2);
                this.a ^= iT;
                this.b |= iT;
                return this;
            }
            ips0Var.d = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (ypaVar == ips0Var.b) {
                this.d[iF + 1] = obj2;
                return this;
            }
            ips0Var.e++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = obj2;
            return new kug1(this.a, this.b, objArrCopyOf, ips0Var.b);
        }
        if (!i(iT)) {
            ips0Var.g(ips0Var.f + 1);
            ypa ypaVar3 = ips0Var.b;
            int iF2 = f(iT);
            Object[] objArr2 = this.d;
            if (ypaVar != ypaVar3) {
                return new kug1(this.a | iT, this.b, xpn1.k(objArr2, iF2, obj, obj2), ypaVar3);
            }
            this.d = xpn1.k(objArr2, iF2, obj, obj2);
            this.a |= iT;
            return this;
        }
        int iT2 = t(iT);
        kug1 kug1VarS = s(iT2);
        if (i2 == 30) {
            rr80 rr80VarO = yoi1.O(yoi1.Q(0, kug1VarS.d.length), 2);
            int i3 = rr80VarO.a;
            int i4 = rr80VarO.b;
            int i5 = rr80VarO.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!u890.j(obj, kug1VarS.d[i3])) {
                        if (i3 == i4) {
                            ips0Var.g(ips0Var.f + 1);
                            kug1VarL = new kug1(0, 0, xpn1.k(kug1VarS.d, 0, obj, obj2), ips0Var.b);
                            break;
                        }
                        i3 += i5;
                    } else {
                        ips0Var.d = kug1VarS.x(i3);
                        if (kug1VarS.c != ips0Var.b) {
                            ips0Var.e++;
                            Object[] objArr3 = kug1VarS.d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                            objArrCopyOf2[i3 + 1] = obj2;
                            kug1VarL = new kug1(0, 0, objArrCopyOf2, ips0Var.b);
                            break;
                        }
                        kug1VarS.d[i3 + 1] = obj2;
                        kug1VarL = kug1VarS;
                        break;
                    }
                }
            } else {
                ips0Var.g(ips0Var.f + 1);
                kug1VarL = new kug1(0, 0, xpn1.k(kug1VarS.d, 0, obj, obj2), ips0Var.b);
                break;
            }
            ips0Var2 = ips0Var;
        } else {
            ips0Var2 = ips0Var;
            kug1VarL = kug1VarS.l(i, obj, obj2, i2 + 5, ips0Var2);
        }
        return kug1VarS == kug1VarL ? this : r(iT2, kug1VarL, ips0Var2.b);
    }

    public final kug1 m(kug1 kug1Var, int i, x9t x9tVar, ips0 ips0Var) {
        kug1 kug1Var2;
        Object[] objArr;
        kug1 kug1VarJ;
        if (this == kug1Var) {
            x9tVar.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            ypa ypaVar = ips0Var.b;
            int i3 = kug1Var.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + kug1Var.d.length);
            int length = this.d.length;
            rr80 rr80VarO = yoi1.O(yoi1.Q(0, kug1Var.d.length), 2);
            int i4 = rr80VarO.a;
            int i5 = rr80VarO.b;
            int i6 = rr80VarO.c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(kug1Var.d[i4])) {
                        x9tVar.a++;
                    } else {
                        Object[] objArr3 = kug1Var.d;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                if (length == kug1Var.d.length) {
                    return kug1Var;
                }
                return length == objArrCopyOf.length ? new kug1(0, 0, objArrCopyOf, ypaVar) : new kug1(0, 0, Arrays.copyOf(objArrCopyOf, length), ypaVar);
            }
        } else {
            int i7 = this.b | kug1Var.b;
            int i8 = this.a;
            int i9 = kug1Var.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (u890.j(this.d[f(iLowestOneBit)], kug1Var.d[kug1Var.f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                bmv0.b("Check failed.");
            }
            if (u890.j(this.c, ips0Var.b) && this.a == i12 && this.b == i7) {
                kug1Var2 = this;
            } else {
                kug1Var2 = new kug1(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            }
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = kug1Var2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(iLowestOneBit2)) {
                    kug1VarJ = s(t(iLowestOneBit2));
                    if (kug1Var.i(iLowestOneBit2)) {
                        kug1VarJ = kug1VarJ.m(kug1Var.s(kug1Var.t(iLowestOneBit2)), i + 5, x9tVar, ips0Var);
                        objArr = objArr4;
                    } else if (kug1Var.h(iLowestOneBit2)) {
                        int iF = kug1Var.f(iLowestOneBit2);
                        Object obj = kug1Var.d[iF];
                        Object objX = kug1Var.x(iF);
                        int i15 = ips0Var.f;
                        objArr = objArr4;
                        kug1VarJ = kug1VarJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, ips0Var);
                        if (ips0Var.f == i15) {
                            x9tVar.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (kug1Var.i(iLowestOneBit2)) {
                        kug1 kug1VarS = kug1Var.s(kug1Var.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.d[iF2];
                            int i16 = i + 5;
                            if (kug1VarS.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                x9tVar.a++;
                                kug1VarJ = kug1VarS;
                            } else {
                                kug1VarJ = kug1VarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i16, ips0Var);
                            }
                        } else {
                            kug1VarJ = kug1VarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = kug1Var.f(iLowestOneBit2);
                        Object obj4 = kug1Var.d[iF4];
                        kug1VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, kug1Var.x(iF4), i + 5, ips0Var.b);
                    }
                }
                objArr[length2] = kug1VarJ;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (kug1Var.h(iLowestOneBit3)) {
                    int iF5 = kug1Var.f(iLowestOneBit3);
                    Object[] objArr5 = kug1Var2.d;
                    objArr5[i18] = kug1Var.d[iF5];
                    objArr5[i18 + 1] = kug1Var.x(iF5);
                    if (h(iLowestOneBit3)) {
                        x9tVar.a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = kug1Var2.d;
                    objArr6[i18] = this.d[iF6];
                    objArr6[i18 + 1] = x(iF6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!e(kug1Var2)) {
                return kug1Var.e(kug1Var2) ? kug1Var : kug1Var2;
            }
        }
        return this;
    }

    public final kug1 n(int i, Object obj, int i2, ips0 ips0Var) {
        kug1 kug1VarN;
        int iT = 1 << xpn1.t(i, i2);
        if (h(iT)) {
            int iF = f(iT);
            if (u890.j(obj, this.d[iF])) {
                return p(iF, iT, ips0Var);
            }
        } else if (i(iT)) {
            int iT2 = t(iT);
            kug1 kug1VarS = s(iT2);
            if (i2 == 30) {
                rr80 rr80VarO = yoi1.O(yoi1.Q(0, kug1VarS.d.length), 2);
                int i3 = rr80VarO.a;
                int i4 = rr80VarO.b;
                int i5 = rr80VarO.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!u890.j(obj, kug1VarS.d[i3])) {
                            if (i3 == i4) {
                                kug1VarN = kug1VarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            kug1VarN = kug1VarS.k(i3, ips0Var);
                            break;
                        }
                    }
                } else {
                    kug1VarN = kug1VarS;
                    break;
                }
            } else {
                kug1VarN = kug1VarS.n(i, obj, i2 + 5, ips0Var);
            }
            return q(kug1VarS, kug1VarN, iT2, iT, ips0Var.b);
        }
        return this;
    }

    public final kug1 o(int i, Object obj, Object obj2, int i2, ips0 ips0Var) {
        ips0 ips0Var2;
        kug1 kug1VarO;
        int iT = 1 << xpn1.t(i, i2);
        if (h(iT)) {
            int iF = f(iT);
            return (u890.j(obj, this.d[iF]) && u890.j(obj2, x(iF))) ? p(iF, iT, ips0Var) : this;
        }
        if (!i(iT)) {
            return this;
        }
        int iT2 = t(iT);
        kug1 kug1VarS = s(iT2);
        if (i2 == 30) {
            rr80 rr80VarO = yoi1.O(yoi1.Q(0, kug1VarS.d.length), 2);
            int i3 = rr80VarO.a;
            int i4 = rr80VarO.b;
            int i5 = rr80VarO.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!u890.j(obj, kug1VarS.d[i3]) || !u890.j(obj2, kug1VarS.x(i3))) {
                        if (i3 == i4) {
                            kug1VarO = kug1VarS;
                            break;
                        }
                        i3 += i5;
                    } else {
                        kug1VarO = kug1VarS.k(i3, ips0Var);
                        break;
                    }
                }
            } else {
                kug1VarO = kug1VarS;
                break;
            }
            ips0Var2 = ips0Var;
        } else {
            ips0Var2 = ips0Var;
            kug1VarO = kug1VarS.o(i, obj, obj2, i2 + 5, ips0Var2);
        }
        return q(kug1VarS, kug1VarO, iT2, iT, ips0Var2.b);
    }

    public final kug1 p(int i, int i2, ips0 ips0Var) {
        ips0Var.g(ips0Var.f - 1);
        ips0Var.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != ips0Var.b) {
            return new kug1(i2 ^ this.a, this.b, xpn1.l(i, objArr), ips0Var.b);
        }
        this.d = xpn1.l(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final kug1 q(kug1 kug1Var, kug1 kug1Var2, int i, int i2, ypa ypaVar) {
        ypa ypaVar2 = this.c;
        if (kug1Var2 != null) {
            return (ypaVar2 == ypaVar || kug1Var != kug1Var2) ? r(i, kug1Var2, ypaVar) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (ypaVar2 != ypaVar) {
            return new kug1(this.a, this.b ^ i2, xpn1.m(i, objArr), ypaVar);
        }
        this.d = xpn1.m(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final kug1 r(int i, kug1 kug1Var, ypa ypaVar) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && kug1Var.d.length == 2 && kug1Var.b == 0) {
            kug1Var.a = this.b;
            return kug1Var;
        }
        if (this.c == ypaVar) {
            objArr[i] = kug1Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = kug1Var;
        return new kug1(this.a, this.b, objArrCopyOf, ypaVar);
    }

    public final kug1 s(int i) {
        return (kug1) this.d[i];
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d3, code lost:
    
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d6, code lost:
    
        r15.t(w(r3, r2, r15.k()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e1, code lost:
    
        return r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p.svh0 u(java.lang.Object r15, int r16, int r17, java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.kug1.u(java.lang.Object, int, int, java.lang.Object):p.svh0");
    }

    public final kug1 v(int i, int i2, Object obj) {
        kug1 kug1VarV;
        int iT = 1 << xpn1.t(i, i2);
        if (h(iT)) {
            int iF = f(iT);
            if (!u890.j(obj, this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length == 2) {
                return null;
            }
            return new kug1(this.a ^ iT, this.b, xpn1.l(iF, objArr), null);
        }
        if (!i(iT)) {
            return this;
        }
        int iT2 = t(iT);
        kug1 kug1VarS = s(iT2);
        if (i2 == 30) {
            rr80 rr80VarO = yoi1.O(yoi1.Q(0, kug1VarS.d.length), 2);
            int i3 = rr80VarO.a;
            int i4 = rr80VarO.b;
            int i5 = rr80VarO.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!u890.j(obj, kug1VarS.d[i3])) {
                        if (i3 == i4) {
                            kug1VarV = kug1VarS;
                            break;
                        }
                        i3 += i5;
                    } else {
                        Object[] objArr2 = kug1VarS.d;
                        if (objArr2.length != 2) {
                            kug1VarV = new kug1(0, 0, xpn1.l(i3, objArr2), null);
                            break;
                        }
                        kug1VarV = null;
                        break;
                    }
                }
            } else {
                kug1VarV = kug1VarS;
                break;
            }
        } else {
            kug1VarV = kug1VarS.v(i, i2 + 5, obj);
        }
        if (kug1VarV != null) {
            return kug1VarS != kug1VarV ? w(iT2, iT, kug1VarV) : this;
        }
        Object[] objArr3 = this.d;
        if (objArr3.length == 1) {
            return null;
        }
        return new kug1(this.a, this.b ^ iT, xpn1.m(iT2, objArr3), null);
    }

    public final kug1 w(int i, int i2, kug1 kug1Var) {
        Object[] objArr = kug1Var.d;
        if (objArr.length != 2 || kug1Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = kug1Var;
            return new kug1(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            kug1Var.a = this.b;
            return kug1Var;
        }
        return new kug1(this.a ^ i2, this.b ^ i2, xpn1.o(i, f(i2), objArr[0], objArr[1], this.d), null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
