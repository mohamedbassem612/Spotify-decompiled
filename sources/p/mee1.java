package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mee1 {
    public final boolean a;
    public final kr80 b;
    public int c;
    public int d;

    public mee1(mee1 mee1Var, boolean z) {
        kr80 kr80Var;
        kr80 kr80Var2;
        this.a = z;
        if (mee1Var == null || (kr80Var2 = mee1Var.b) == null) {
            kr80Var = new kr80(null);
        } else {
            kr80Var2.b();
            kr80Var = new kr80(kr80Var2);
        }
        this.b = kr80Var;
        if (mee1Var != null) {
            this.c = mee1Var.c;
            this.d = mee1Var.d;
        } else {
            this.c = 0;
            this.d = 1000;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00df  */
    public final void a(int i) {
        int I;
        int i2;
        if (i == 0) {
            return;
        }
        int i3 = this.d;
        int i4 = i3 + i;
        kr80 kr80Var = this.b;
        edn0 edn0VarO = kr80Var.o();
        int i5 = kr80Var.e;
        int i6 = kr80Var.d;
        if (i6 != i5 && kr80Var.i(i6) >= i3 && kr80Var.j(kr80Var.d) <= i4) {
            int iK = kr80Var.d;
            loop0: while (true) {
                char c = 0;
                while (true) {
                    if (iK == i5) {
                        break loop0;
                    }
                    if (c == 0) {
                        if (kr80Var.h(iK) != i5 && kr80Var.i(kr80Var.h(iK)) >= i3) {
                            iK = kr80Var.h(iK);
                            break;
                        }
                        c = 1;
                    } else if (c == 1) {
                        if (kr80Var.m(iK) <= i4 && kr80Var.g(iK) >= i3) {
                            edn0VarO.a(iK);
                        }
                        if (kr80Var.l(iK) != i5 && kr80Var.i(kr80Var.l(iK)) >= i3 && kr80Var.j(kr80Var.l(iK)) <= i4) {
                            iK = kr80Var.l(iK);
                            break;
                        }
                        c = 2;
                    } else if (c == 2) {
                        if (kr80Var.k(iK) != i5) {
                            c = iK == kr80Var.h(kr80Var.k(iK)) ? (char) 1 : (char) 2;
                        }
                        iK = kr80Var.k(iK);
                    }
                }
            }
        }
        int i7 = edn0VarO.b;
        int i8 = i3;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            int iC = edn0VarO.c(i9);
            long jN = kr80Var.n(iC);
            int I2 = sbl.I(jN);
            int i11 = this.d;
            if (I2 != i11) {
                int I3 = sbl.I(jN);
                if (i11 > I3 || I3 > i4) {
                    I = sbl.I(jN);
                } else if (sbl.G(jN)) {
                    I = this.c;
                } else {
                    I = i4;
                }
            } else {
                I = i4;
            }
            int i12 = i9;
            int i13 = (int) (jN & 2147483647L);
            int i14 = this.d;
            if (i13 == i14) {
                i13 = i4;
            } else if (i14 <= i13 && i13 <= i4) {
                if (sbl.H(jN)) {
                    i13 = i4;
                } else {
                    i13 = this.c;
                }
            }
            long jD = (I >= i13 || (I == this.c && i13 == i4)) ? sbl.D(I, I, false, false) : sbl.D(I, i13, sbl.G(jN), sbl.H(jN));
            int iM = kr80Var.m(iC);
            kr80Var.b.f(iC + 2, jD);
            kr80Var.y(iC);
            int I4 = sbl.I(jD);
            if (I4 >= ((int) (jD & 2147483647L))) {
                kr80Var.d(iC);
                kr80Var.e(iC);
            } else {
                if (I4 < i8 || I4 > i4 || (I4 != iM && iM < i3)) {
                    kr80Var.d(iC);
                    i2 = i12;
                    edn0VarO.f(i10, edn0VarO.c(i2));
                    i10++;
                } else {
                    i8 = I4;
                }
                i9 = i2 + 1;
            }
            i2 = i12;
            i9 = i2 + 1;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            int iC2 = edn0VarO.c(i15);
            kr80Var.s(iC2, 0);
            kr80Var.u(iC2, kr80Var.n(iC2));
            kr80Var.t(iC2, i5);
            kr80Var.w(iC2, i5);
            kr80Var.a(iC2);
        }
        edn0VarO.b = 0;
        kr80Var.c();
        this.d += i;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e2  */
    public final void b(int i) {
        int I;
        int i2;
        if (i == 0) {
            return;
        }
        int i3 = this.c;
        int i4 = i3 - i;
        kr80 kr80Var = this.b;
        edn0 edn0VarO = kr80Var.o();
        int i5 = kr80Var.e;
        int i6 = kr80Var.d;
        if (i6 != i5 && kr80Var.i(i6) >= i4 && kr80Var.j(kr80Var.d) <= i3) {
            int iK = kr80Var.d;
            loop0: while (true) {
                char c = 0;
                while (true) {
                    if (iK == i5) {
                        break loop0;
                    }
                    if (c == 0) {
                        if (kr80Var.h(iK) != i5 && kr80Var.i(kr80Var.h(iK)) >= i4) {
                            iK = kr80Var.h(iK);
                            break;
                        }
                        c = 1;
                    } else if (c == 1) {
                        if (kr80Var.m(iK) <= i3 && kr80Var.g(iK) >= i4) {
                            edn0VarO.a(iK);
                        }
                        if (kr80Var.l(iK) != i5 && kr80Var.i(kr80Var.l(iK)) >= i4 && kr80Var.j(kr80Var.l(iK)) <= i3) {
                            iK = kr80Var.l(iK);
                            break;
                        }
                        c = 2;
                    } else if (c == 2) {
                        if (kr80Var.k(iK) != i5) {
                            c = iK == kr80Var.h(kr80Var.k(iK)) ? (char) 1 : (char) 2;
                        }
                        iK = kr80Var.k(iK);
                    }
                }
            }
        }
        int i7 = edn0VarO.b;
        int i8 = i4;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            int iC = edn0VarO.c(i9);
            long jN = kr80Var.n(iC);
            int I2 = sbl.I(jN);
            int i11 = this.c;
            if (I2 != i11) {
                int I3 = sbl.I(jN);
                if (i4 > I3 || I3 >= i11) {
                    I = sbl.I(jN);
                } else if (sbl.G(jN)) {
                    I = i4;
                } else {
                    I = this.d;
                }
            } else {
                I = i4;
            }
            int i12 = i9;
            int i13 = (int) (jN & 2147483647L);
            int i14 = this.c;
            if (i13 == i14) {
                i13 = i4;
            } else if (i4 <= i13 && i13 < i14) {
                if (sbl.H(jN)) {
                    i13 = this.d;
                } else {
                    i13 = i4;
                }
            }
            long jD = (I >= i13 || (I == i4 && i13 == this.d)) ? sbl.D(I, I, false, false) : sbl.D(I, i13, sbl.G(jN), sbl.H(jN));
            int iM = kr80Var.m(iC);
            kr80Var.b.f(iC + 2, jD);
            kr80Var.y(iC);
            int I4 = sbl.I(jD);
            if (I4 >= ((int) (jD & 2147483647L))) {
                kr80Var.d(iC);
                kr80Var.e(iC);
            } else {
                if (I4 < i8 || I4 > i3 || (I4 != iM && iM < i4)) {
                    kr80Var.d(iC);
                    i2 = i12;
                    edn0VarO.f(i10, edn0VarO.c(i2));
                    i10++;
                } else {
                    i8 = I4;
                }
                i9 = i2 + 1;
            }
            i2 = i12;
            i9 = i2 + 1;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            int iC2 = edn0VarO.c(i15);
            kr80Var.s(iC2, 0);
            kr80Var.u(iC2, kr80Var.n(iC2));
            kr80Var.t(iC2, i5);
            kr80Var.w(iC2, i5);
            kr80Var.a(iC2);
        }
        edn0VarO.b = 0;
        kr80Var.c();
        this.c -= i;
    }

    public final int c() {
        return this.d - this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mee1)) {
            return false;
        }
        mee1 mee1Var = (mee1) obj;
        if (this.c == mee1Var.c && this.d == mee1Var.d) {
            return u890.j(this.b, mee1Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c) * 31) + this.d;
    }

    public /* synthetic */ mee1(mee1 mee1Var, int i) {
        this((i & 1) != 0 ? null : mee1Var, true);
    }
}
