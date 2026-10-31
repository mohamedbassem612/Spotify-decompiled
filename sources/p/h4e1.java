package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h4e1 implements Appendable {
    public final i4e1 a;
    public final h4u b;
    public final yzr0 c;
    public mee1 d;
    public boolean e;
    public xid f;
    public long g;
    public nbe1 h;
    public bfn0 i;
    public mmr0 t;

    public h4e1(i4e1 i4e1Var, xid xidVar, i4e1 i4e1Var2, h4u h4uVar, int i) {
        bfn0 bfn0Var = null;
        xidVar = (i & 2) != 0 ? null : xidVar;
        i4e1Var2 = (i & 4) != 0 ? i4e1Var : i4e1Var2;
        h4uVar = (i & 8) != 0 ? null : h4uVar;
        this.a = i4e1Var2;
        this.b = h4uVar;
        yzr0 yzr0Var = new yzr0();
        yzr0Var.a = i4e1Var;
        yzr0Var.c = -1;
        yzr0Var.d = -1;
        this.c = yzr0Var;
        b8e1 b8e1Var = i4e1Var.c;
        List list = i4e1Var.a;
        this.d = b8e1Var != null ? new mee1(b8e1Var.a, 2) : null;
        this.f = xidVar != null ? new xid(xidVar) : null;
        this.g = i4e1Var.e;
        this.h = i4e1Var.f;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            int size = list.size();
            ze5[] ze5VarArr = new ze5[size];
            for (int i2 = 0; i2 < size; i2++) {
                ze5VarArr[i2] = (ze5) list.get(i2);
            }
            bfn0Var = new bfn0(size, ze5VarArr);
        }
        this.i = bfn0Var;
    }

    public static void l(h4e1 h4e1Var, int i, int i2, CharSequence charSequence, int i3, int i4, boolean z, int i5) {
        if ((i5 & 8) != 0) {
            i3 = 0;
        }
        if ((i5 & 16) != 0) {
            i4 = charSequence.length();
        }
        if ((i5 & 32) != 0) {
            z = false;
        }
        yzr0 yzr0Var = h4e1Var.c;
        if (i > i2) {
            tf80.a("Expected start=" + i + " <= end=" + i2);
        }
        if (i3 > i4) {
            tf80.a("Expected textStart=" + i3 + " <= textEnd=" + i4);
        }
        int iP = yoi1.p(i, 0, yzr0Var.length());
        int iP2 = yoi1.p(i2, 0, yzr0Var.length());
        int iP3 = yoi1.p(i3, 0, charSequence.length());
        int iP4 = yoi1.p(i4, 0, charSequence.length());
        h4e1Var.j(iP, iP2, iP4 - iP3, z);
        h4e1Var.c.a(iP, iP2, charSequence, iP3, iP4);
        h4e1Var.o(null);
        h4e1Var.t = null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f  */
    public static i4e1 q(h4e1 h4e1Var, long j, nbe1 nbe1Var, int i) {
        List list;
        if ((i & 1) != 0) {
            j = h4e1Var.g;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            nbe1Var = h4e1Var.h;
        }
        nbe1 nbe1Var2 = nbe1Var;
        bfn0 bfn0Var = h4e1Var.i;
        if (bfn0Var != null) {
            List listF = bfn0Var.f();
            if (listF.isEmpty()) {
                list = null;
            } else {
                list = listF;
            }
        } else {
            list = null;
        }
        return new i4e1(h4e1Var.c.toString(), j2, nbe1Var2, (mmr0) null, list, (List) null, c4p1.v(h4e1Var), 8);
    }

    public final yzr0 a() {
        return this.c;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            yzr0 yzr0Var = this.c;
            j(yzr0Var.length(), yzr0Var.length(), charSequence.length(), false);
            yzr0Var.a(yzr0Var.length(), yzr0Var.length(), charSequence, 0, charSequence.length());
        }
        return this;
    }

    public final void b() {
        o(null);
    }

    public final xid c() {
        xid xidVar = this.f;
        if (xidVar != null) {
            return xidVar;
        }
        xid xidVar2 = new xid((xid) null);
        this.f = xidVar2;
        return xidVar2;
    }

    public final xid d() {
        return c();
    }

    public final bfn0 e() {
        return this.i;
    }

    public final nbe1 f() {
        return this.h;
    }

    public final mmr0 g() {
        return this.t;
    }

    public final long h() {
        return this.g;
    }

    public final mee1 i() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:302:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:303:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:309:0x04d5  */
    public final void j(int i, int i2, int i3, boolean z) {
        int i4;
        long j;
        int i5;
        int I;
        int iC;
        long jD;
        int I2;
        int i6;
        int I3;
        char c;
        xid xidVarC = c();
        if (i != i2 || i3 != 0) {
            int iMin = Math.min(i, i2);
            int iMax = Math.max(i, i2);
            int i7 = i3 - (iMax - iMin);
            dfe dfeVar = null;
            int i8 = 0;
            boolean z2 = false;
            while (true) {
                bfn0 bfn0Var = (bfn0) xidVarC.b;
                if (i8 >= bfn0Var.c) {
                    break;
                }
                dfe dfeVar2 = (dfe) bfn0Var.a[i8];
                int i9 = dfeVar2.a;
                if ((iMin > i9 || i9 > iMax) && ((iMin > (i4 = dfeVar2.b) || i4 > iMax) && ((iMin > i4 || i9 > iMin) && (iMax > i4 || i9 > iMax)))) {
                    if (i9 > iMax && !z2) {
                        xidVarC.g(dfeVar, iMin, iMax, i7, z);
                        z2 = true;
                    }
                    if (z2) {
                        dfeVar2.a += i7;
                        dfeVar2.b += i7;
                    }
                    ((bfn0) xidVarC.c).b(dfeVar2);
                } else if (dfeVar == null) {
                    dfeVar = dfeVar2;
                } else {
                    dfeVar.b = dfeVar2.b;
                    dfeVar.d = dfeVar2.d;
                    dfeVar.e = dfeVar.e || dfeVar2.e;
                }
                i8++;
            }
            if (!z2) {
                xidVarC.g(dfeVar, iMin, iMax, i7, z);
            }
            bfn0 bfn0Var2 = (bfn0) xidVarC.b;
            xidVarC.b = (bfn0) xidVarC.c;
            xidVarC.c = bfn0Var2;
            bfn0Var2.g();
        }
        h4u h4uVar = this.b;
        if (h4uVar != null) {
            h4uVar.h(i, i2, i3);
        }
        this.g = u2p1.g(this.g, i, i2, i3);
        mee1 mee1Var = this.d;
        if (mee1Var != null) {
            kr80 kr80Var = mee1Var.b;
            if (!mee1Var.a) {
                tf80.c("This buffer is immutable");
            }
            int i10 = kr80Var.d;
            ldn0 ldn0Var = kr80Var.b;
            int i11 = kr80Var.e;
            if (i10 == i11) {
                return;
            }
            int i12 = i2 - i;
            int i13 = i3 - i12;
            char c2 = 2;
            if (i10 != i11 && mee1Var.c() < i13) {
                int iC2 = (mee1Var.c() - i13) + 1000;
                int i14 = mee1Var.c;
                edn0 edn0VarO = kr80Var.o();
                j = 2147483647L;
                int i15 = kr80Var.d;
                if (i15 != i11 && kr80Var.i(i15) >= i14 && kr80Var.j(kr80Var.d) <= Integer.MAX_VALUE) {
                    int iH = kr80Var.d;
                    char c3 = 0;
                    while (iH != i11) {
                        if (c3 != 0) {
                            if (c3 == 1) {
                                if (kr80Var.m(iH) <= Integer.MAX_VALUE && kr80Var.g(iH) >= i14) {
                                    edn0VarO.a(iH);
                                }
                                if (kr80Var.l(iH) != i11 && kr80Var.i(kr80Var.l(iH)) >= i14 && kr80Var.j(kr80Var.l(iH)) <= Integer.MAX_VALUE) {
                                    iH = kr80Var.l(iH);
                                    c3 = 0;
                                } else {
                                    c3 = 2;
                                }
                            } else if (c3 == c2) {
                                if (kr80Var.k(iH) != i11) {
                                    c3 = iH == kr80Var.h(kr80Var.k(iH)) ? (char) 1 : (char) 2;
                                }
                                iH = kr80Var.k(iH);
                            }
                        } else if (kr80Var.h(iH) != i11 && kr80Var.i(kr80Var.h(iH)) >= i14) {
                            iH = kr80Var.h(iH);
                            c3 = 0;
                        } else {
                            c3 = 1;
                        }
                        c2 = 2;
                    }
                }
                int i16 = edn0VarO.b;
                int i17 = i14;
                int i18 = 0;
                int i19 = 0;
                while (i18 < i16) {
                    int iC3 = edn0VarO.c(i18);
                    long jN = kr80Var.n(iC3);
                    int i20 = iC2;
                    int I4 = sbl.I(jN) > mee1Var.c ? sbl.I(jN) + i20 : sbl.I(jN);
                    int i21 = (int) (jN & 2147483647L);
                    if (i21 > mee1Var.c) {
                        i21 += i20;
                    }
                    long jD2 = sbl.D(I4, i21, sbl.G(jN), sbl.H(jN));
                    int iM = kr80Var.m(iC3);
                    ldn0Var.f(iC3 + 2, jD2);
                    kr80Var.y(iC3);
                    int I5 = sbl.I(jD2);
                    if (I5 >= ((int) (jD2 & 2147483647L))) {
                        kr80Var.d(iC3);
                        kr80Var.e(iC3);
                        c = 65535;
                    } else {
                        c = 65535;
                        if (I5 < i17 || I5 > Integer.MAX_VALUE || (I5 != iM && iM < i14)) {
                            kr80Var.d(iC3);
                            edn0VarO.f(i19, edn0VarO.c(i18));
                            i19++;
                        } else {
                            i17 = I5;
                        }
                    }
                    i18++;
                    iC2 = i20;
                }
                int i22 = iC2;
                for (int i23 = 0; i23 < i19; i23++) {
                    int iC4 = edn0VarO.c(i23);
                    kr80Var.s(iC4, 0);
                    kr80Var.u(iC4, kr80Var.n(iC4));
                    kr80Var.t(iC4, i11);
                    kr80Var.w(iC4, i11);
                    kr80Var.a(iC4);
                }
                edn0VarO.b = 0;
                kr80Var.c();
                mee1Var.d += i22;
            } else {
                j = 2147483647L;
            }
            int i24 = mee1Var.c;
            if (i < i24 && i2 <= i24) {
                int i25 = i24 - i2;
                if (i25 != 0) {
                    int i26 = i24 - i25;
                    edn0 edn0VarO2 = kr80Var.o();
                    int i27 = kr80Var.d;
                    if (i27 != i11 && kr80Var.i(i27) >= i26 && kr80Var.j(kr80Var.d) <= i24) {
                        int iK = kr80Var.d;
                        loop3: while (true) {
                            char c4 = 0;
                            while (true) {
                                if (iK == i11) {
                                    break loop3;
                                }
                                if (c4 == 0) {
                                    if (kr80Var.h(iK) != i11 && kr80Var.i(kr80Var.h(iK)) >= i26) {
                                        iK = kr80Var.h(iK);
                                        break;
                                    }
                                    c4 = 1;
                                } else if (c4 == 1) {
                                    if (kr80Var.m(iK) <= i24 && kr80Var.g(iK) >= i26) {
                                        edn0VarO2.a(iK);
                                    }
                                    if (kr80Var.l(iK) != i11 && kr80Var.i(kr80Var.l(iK)) >= i26 && kr80Var.j(kr80Var.l(iK)) <= i24) {
                                        iK = kr80Var.l(iK);
                                        break;
                                    }
                                    c4 = 2;
                                } else if (c4 == 2) {
                                    if (kr80Var.k(iK) != i11) {
                                        c4 = iK == kr80Var.h(kr80Var.k(iK)) ? (char) 1 : (char) 2;
                                    }
                                    iK = kr80Var.k(iK);
                                }
                            }
                        }
                    }
                    int i28 = i26;
                    int i29 = 0;
                    int i30 = 0;
                    for (int i31 = edn0VarO2.b; i29 < i31; i31 = i6) {
                        int iC5 = edn0VarO2.c(i29);
                        long jN2 = kr80Var.n(iC5);
                        int i32 = i25;
                        if (sbl.I(jN2) == i26 && sbl.G(jN2)) {
                            I3 = sbl.I(jN2);
                            i6 = i31;
                        } else {
                            int i33 = mee1Var.c;
                            i6 = i31;
                            int I6 = sbl.I(jN2);
                            I3 = (i26 > I6 || I6 > i33) ? sbl.I(jN2) : sbl.I(jN2) + mee1Var.c();
                        }
                        int iC6 = (int) (jN2 & j);
                        if (iC6 != i26 || sbl.H(jN2)) {
                            int i34 = mee1Var.c;
                            if (i26 <= iC6 && iC6 <= i34) {
                                iC6 += mee1Var.c();
                            }
                        }
                        long jD3 = sbl.D(I3, iC6, sbl.G(jN2), sbl.H(jN2));
                        int iM2 = kr80Var.m(iC5);
                        ldn0Var.f(iC5 + 2, jD3);
                        kr80Var.y(iC5);
                        int I7 = sbl.I(jD3);
                        if (I7 >= ((int) (jD3 & j))) {
                            kr80Var.d(iC5);
                            kr80Var.e(iC5);
                        } else if (I7 < i28 || I7 > i24 || (I7 != iM2 && iM2 < i26)) {
                            kr80Var.d(iC5);
                            edn0VarO2.f(i30, edn0VarO2.c(i29));
                            i30++;
                        } else {
                            i28 = I7;
                        }
                        i29++;
                        i25 = i32;
                    }
                    int i35 = i25;
                    for (int i36 = 0; i36 < i30; i36++) {
                        int iC7 = edn0VarO2.c(i36);
                        kr80Var.s(iC7, 0);
                        kr80Var.u(iC7, kr80Var.n(iC7));
                        kr80Var.t(iC7, i11);
                        kr80Var.w(iC7, i11);
                        kr80Var.a(iC7);
                    }
                    edn0VarO2.b = 0;
                    kr80Var.c();
                    mee1Var.c -= i35;
                    mee1Var.d -= i35;
                }
                mee1Var.b(i12);
            } else if (i >= i24 || i2 < i24) {
                int i37 = i - i24;
                if (i37 != 0) {
                    int i38 = mee1Var.d;
                    int i39 = i38 + i37;
                    edn0 edn0VarO3 = kr80Var.o();
                    int i40 = kr80Var.d;
                    if (i40 != i11 && kr80Var.i(i40) >= i38 && kr80Var.j(kr80Var.d) <= i39) {
                        int iK2 = kr80Var.d;
                        loop7: while (true) {
                            char c5 = 0;
                            while (true) {
                                if (iK2 == i11) {
                                    break loop7;
                                }
                                if (c5 == 0) {
                                    if (kr80Var.h(iK2) != i11 && kr80Var.i(kr80Var.h(iK2)) >= i38) {
                                        iK2 = kr80Var.h(iK2);
                                        break;
                                    }
                                    c5 = 1;
                                } else if (c5 == 1) {
                                    if (kr80Var.m(iK2) <= i39 && kr80Var.g(iK2) >= i38) {
                                        edn0VarO3.a(iK2);
                                    }
                                    if (kr80Var.l(iK2) != i11 && kr80Var.i(kr80Var.l(iK2)) >= i38 && kr80Var.j(kr80Var.l(iK2)) <= i39) {
                                        iK2 = kr80Var.l(iK2);
                                        break;
                                    }
                                    c5 = 2;
                                } else if (c5 == 2) {
                                    if (kr80Var.k(iK2) != i11) {
                                        c5 = iK2 == kr80Var.h(kr80Var.k(iK2)) ? (char) 1 : (char) 2;
                                    }
                                    iK2 = kr80Var.k(iK2);
                                }
                            }
                        }
                    }
                    int i41 = i38;
                    int i42 = 0;
                    int i43 = 0;
                    for (int i44 = edn0VarO3.b; i42 < i44; i44 = i5) {
                        int iC8 = edn0VarO3.c(i42);
                        long jN3 = kr80Var.n(iC8);
                        int i45 = i37;
                        if (sbl.I(jN3) == i39 && sbl.G(jN3)) {
                            I = sbl.I(jN3) - mee1Var.c();
                            i5 = i44;
                        } else {
                            int i46 = mee1Var.d;
                            i5 = i44;
                            int I8 = sbl.I(jN3);
                            I = (i46 > I8 || I8 >= i39) ? sbl.I(jN3) : sbl.I(jN3) - mee1Var.c();
                        }
                        int i47 = (int) (jN3 & j);
                        if (i47 != i39 || sbl.H(jN3)) {
                            if (mee1Var.d <= i47 && i47 < i39) {
                                iC = mee1Var.c();
                            }
                            jD = sbl.D(I, i47, sbl.G(jN3), sbl.H(jN3));
                            int iM3 = kr80Var.m(iC8);
                            ldn0Var.f(iC8 + 2, jD);
                            kr80Var.y(iC8);
                            I2 = sbl.I(jD);
                            if (I2 >= ((int) (jD & j))) {
                                kr80Var.d(iC8);
                                kr80Var.e(iC8);
                            } else if (I2 >= i41 || I2 > i39 || (I2 != iM3 && iM3 < i38)) {
                                kr80Var.d(iC8);
                                edn0VarO3.f(i43, edn0VarO3.c(i42));
                                i43++;
                            } else {
                                i41 = I2;
                            }
                            i42++;
                            i37 = i45;
                        } else {
                            iC = mee1Var.c();
                        }
                        i47 -= iC;
                        jD = sbl.D(I, i47, sbl.G(jN3), sbl.H(jN3));
                        int iM4 = kr80Var.m(iC8);
                        ldn0Var.f(iC8 + 2, jD);
                        kr80Var.y(iC8);
                        I2 = sbl.I(jD);
                        if (I2 >= ((int) (jD & j))) {
                            kr80Var.d(iC8);
                            kr80Var.e(iC8);
                        } else if (I2 >= i41) {
                            kr80Var.d(iC8);
                            edn0VarO3.f(i43, edn0VarO3.c(i42));
                            i43++;
                        } else {
                            kr80Var.d(iC8);
                            edn0VarO3.f(i43, edn0VarO3.c(i42));
                            i43++;
                        }
                        i42++;
                        i37 = i45;
                    }
                    int i48 = i37;
                    for (int i49 = 0; i49 < i43; i49++) {
                        int iC9 = edn0VarO3.c(i49);
                        kr80Var.s(iC9, 0);
                        kr80Var.u(iC9, kr80Var.n(iC9));
                        kr80Var.t(iC9, i11);
                        kr80Var.w(iC9, i11);
                        kr80Var.a(iC9);
                    }
                    edn0VarO3.b = 0;
                    kr80Var.c();
                    mee1Var.c += i48;
                    mee1Var.d += i48;
                }
                mee1Var.a(i12);
            } else {
                mee1Var.b(i24 - i);
                mee1Var.a(i2 - i24);
            }
            mee1Var.c += i3;
        }
    }

    public final void k(int i, int i2, CharSequence charSequence) {
        l(this, i, i2, charSequence, 0, charSequence.length(), false, 32);
    }

    public final void m() {
        int length = this.c.length();
        i4e1 i4e1Var = this.a;
        k(0, length, i4e1Var.d.toString());
        p(i4e1Var.e);
        c().h();
        b8e1 b8e1Var = i4e1Var.c;
        mee1 mee1Var = this.d;
        if (b8e1Var == null) {
            if (mee1Var != null) {
                kr80 kr80Var = mee1Var.b;
                kr80Var.d = kr80Var.e;
                ldn0 ldn0Var = kr80Var.b;
                ldn0Var.e(4, ldn0Var.b);
                wdn0 wdn0Var = kr80Var.a;
                wdn0Var.m(1, wdn0Var.b);
                kr80Var.c = 0;
                return;
            }
            return;
        }
        if (mee1Var == null) {
            mee1Var = new mee1((mee1) null, 3);
            this.d = mee1Var;
        }
        mee1 mee1Var2 = b8e1Var.a;
        if (!mee1Var.a) {
            tf80.c("This buffer is immutable");
        }
        mee1Var.c = mee1Var2.c;
        mee1Var.d = mee1Var2.d;
        kr80 kr80Var2 = mee1Var.b;
        kr80 kr80Var3 = mee1Var2.b;
        wdn0 wdn0Var2 = kr80Var2.a;
        ldn0 ldn0Var2 = kr80Var2.b;
        if (kr80Var3.d == kr80Var3.e) {
            kr80Var2.d = kr80Var2.e;
            ldn0Var2.e(4, ldn0Var2.b);
            wdn0 wdn0Var3 = kr80Var2.a;
            wdn0Var3.m(1, wdn0Var3.b);
            kr80Var2.c = 0;
            return;
        }
        ldn0Var2.b = 0;
        ldn0Var2.b(0, kr80Var3.b);
        wdn0Var2.e();
        wdn0Var2.d(kr80Var3.a);
        kr80Var2.d = kr80Var3.d;
        kr80Var2.c = kr80Var3.c;
        kr80Var2.f = kr80Var3.f;
    }

    public final void n(int i, int i2, List list) {
        yzr0 yzr0Var = this.c;
        if (i < 0 || i > yzr0Var.length()) {
            eg.g(cy30.i(i, "start (", yzr0Var.length(), ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > yzr0Var.length()) {
            eg.g(cy30.i(i2, "end (", yzr0Var.length(), ") offset is outside of text region "));
            return;
        }
        if (i >= i2) {
            hhg1.n(cy30.i(i, "Do not set reversed or empty range: ", i2, " > "));
            return;
        }
        o(new nbe1(e6p1.e(i, i2)));
        bfn0 bfn0Var = this.i;
        if (bfn0Var != null) {
            bfn0Var.g();
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        if (this.i == null) {
            this.i = new bfn0(0, new ze5[16]);
        }
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            ze5 ze5Var = (ze5) list.get(i3);
            bfn0 bfn0Var2 = this.i;
            if (bfn0Var2 != null) {
                bfn0Var2.b(ze5.a(ze5Var, (we5) null, ze5Var.b + i, ze5Var.c + i, 9));
            }
        }
    }

    public final void o(nbe1 nbe1Var) {
        if (nbe1Var != null && !nbe1.d(nbe1Var.a)) {
            this.h = nbe1Var;
            return;
        }
        this.h = null;
        bfn0 bfn0Var = this.i;
        if (bfn0Var != null) {
            bfn0Var.g();
        }
    }

    public final void p(long j) {
        long jE = e6p1.e(0, this.c.length());
        if (!nbe1.a(jE, j)) {
            tf80.a("Expected " + nbe1.i(j) + " to be in " + nbe1.i(jE));
        }
        this.g = j;
        this.t = null;
    }

    public final String toString() {
        return this.c.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        yzr0 yzr0Var = this.c;
        j(yzr0Var.length(), yzr0Var.length(), 1, false);
        int length = yzr0Var.length();
        int length2 = yzr0Var.length();
        String strValueOf = String.valueOf(c);
        yzr0Var.a(length, length2, strValueOf, 0, strValueOf.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence != null) {
            yzr0 yzr0Var = this.c;
            j(yzr0Var.length(), yzr0Var.length(), i2 - i, false);
            int length = yzr0Var.length();
            int length2 = yzr0Var.length();
            CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
            yzr0Var.a(length, length2, charSequenceSubSequence, 0, charSequenceSubSequence.length());
        }
        return this;
    }
}
