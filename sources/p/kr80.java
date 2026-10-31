package p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kr80 {
    public final wdn0 a;
    public final ldn0 b;
    public int c;
    public int d;
    public final int e;
    public boolean f;
    public edn0 g;

    public kr80(kr80 kr80Var) {
        if (kr80Var != null) {
            wdn0 wdn0Var = new wdn0(kr80Var.a.b);
            wdn0Var.d(kr80Var.a);
            this.a = wdn0Var;
            ldn0 ldn0Var = new ldn0(kr80Var.b.b);
            ldn0Var.b(ldn0Var.b, kr80Var.b);
            this.b = ldn0Var;
            this.e = kr80Var.e;
            this.d = kr80Var.d;
            this.c = kr80Var.c;
            this.f = kr80Var.f;
            return;
        }
        wdn0 wdn0Var2 = new wdn0();
        this.a = wdn0Var2;
        ldn0 ldn0Var2 = new ldn0();
        this.b = ldn0Var2;
        long jD = sbl.D(Alert.DURATION_SHOW_INDEFINITELY, os00.INVALID_ID, false, false);
        int i = ldn0Var2.b;
        ldn0Var2.a(sbl.D(0, 0, false, false));
        ldn0Var2.a(0L);
        ldn0Var2.a(jD);
        ldn0Var2.a(jD);
        wdn0Var2.b((Object) null);
        this.e = i;
        this.d = i;
        this.c = 0;
        this.f = true;
    }

    public final void a(int i) {
        int iH = this.d;
        int i2 = this.e;
        int i3 = i2;
        while (iH != i2) {
            i3 = iH;
            iH = m(i) <= m(iH) ? h(iH) : l(iH);
        }
        v(i, i3);
        if (i3 == i2) {
            this.d = i;
        } else if (m(i) <= m(i3)) {
            t(i3, i);
        } else {
            w(i3, i);
        }
        y(i3);
        while (i != this.d && f(k(i)) == 0) {
            int iK = k(k(i));
            if (k(i) == h(iK)) {
                int iL = l(iK);
                if (f(iL) == 0) {
                    s(iL, 1);
                    s(k(i), 1);
                    s(iK, 0);
                    i = iK;
                } else {
                    if (i == l(k(i))) {
                        i = k(i);
                        q(i);
                    }
                    s(k(i), 1);
                    s(iK, 0);
                    r(iK);
                }
            } else {
                int iH2 = h(iK);
                if (f(iH2) == 0) {
                    s(iH2, 1);
                    s(k(i), 1);
                    s(iK, 0);
                    i = iK;
                } else {
                    if (i == h(k(i))) {
                        i = k(i);
                        r(i);
                    }
                    s(k(i), 1);
                    s(iK, 0);
                    q(iK);
                }
            }
        }
        s(this.d, 1);
    }

    public final void b() {
        ldn0 ldn0Var;
        if (this.c == 0) {
            return;
        }
        edn0 edn0VarO = o();
        edn0VarO.b(p());
        int iP = p();
        int i = 0;
        int i2 = 0;
        while (true) {
            ldn0Var = this.b;
            if (i >= iP) {
                break;
            }
            if (sbl.H(ldn0Var.d(i * 4))) {
                i2++;
            }
            edn0VarO.a((i - i2) * 4);
            i++;
        }
        this.d = edn0VarO.c(this.d / 4);
        int i3 = 4;
        int i4 = 4;
        while (true) {
            int i5 = ldn0Var.b;
            wdn0 wdn0Var = this.a;
            if (i3 >= i5) {
                ldn0Var.e(i4, i5);
                int i6 = wdn0Var.b;
                wdn0Var.m(i6 - this.c, i6);
                this.c = 0;
                edn0VarO.b = 0;
                return;
            }
            long jD = ldn0Var.d(i3);
            if (sbl.H(jD)) {
                i3 += 4;
            } else {
                if (i4 != i3) {
                    ldn0Var.f(i4, (jD & (-2147483648L)) | ((long) edn0VarO.c(((int) (2147483647L & jD)) / 4)));
                    long jD2 = ldn0Var.d(i3 + 1);
                    ldn0Var.f(i4 + 1, (((long) edn0VarO.c(((int) (jD2 >> 32)) / 4)) << 32) | (((long) edn0VarO.c(((int) (jD2 & 4294967295L)) / 4)) & 4294967295L));
                    ldn0Var.f(i4 + 2, ldn0Var.d(i3 + 2));
                    ldn0Var.f(i4 + 3, ldn0Var.d(i3 + 3));
                    wdn0Var.o(i4 / 4, wdn0Var.g(i3 / 4));
                } else {
                    ldn0Var.f(i4, (jD & (-2147483648L)) | ((long) edn0VarO.c(((int) (2147483647L & jD)) / 4)));
                    long jD3 = ldn0Var.d(i3 + 1);
                    ldn0Var.f(i4 + 1, (((long) edn0VarO.c(((int) (jD3 >> 32)) / 4)) << 32) | (((long) edn0VarO.c(((int) (jD3 & 4294967295L)) / 4)) & 4294967295L));
                }
                i3 += 4;
                i4 += 4;
            }
        }
    }

    public final void c() {
        if (p() <= 64 || this.c < p() / 2) {
            return;
        }
        b();
    }

    public final void d(int i) {
        int iK;
        int iH;
        int iK2;
        int iF = f(i);
        int iH2 = h(i);
        int i2 = this.e;
        if (iH2 == i2) {
            iH = l(i);
            iK = k(i);
            x(i, l(i));
            y(iK);
            y(i2);
        } else if (l(i) == i2) {
            iH = h(i);
            iK = k(i);
            x(i, h(i));
            y(iK);
            y(i2);
        } else {
            int iL = l(i);
            while (h(iL) != i2) {
                iL = h(iL);
            }
            int iF2 = f(iL);
            int iL2 = l(iL);
            if (k(iL) == i) {
                iK = iL;
            } else {
                iK = k(iL);
                x(iL, l(iL));
                w(iL, l(i));
                v(l(iL), iL);
            }
            t(iL, h(i));
            v(h(iL), iL);
            s(iL, f(i));
            u(iL, this.b.d(i + 3));
            x(i, iL);
            y(iK);
            y(iL);
            iF = iF2;
            iH = iL2;
        }
        if (iF == 1) {
            while (iH != this.d && f(iH) == 1) {
                if (iH == h(iK)) {
                    int iL3 = l(iK);
                    if (f(iL3) == 0) {
                        s(iL3, 1);
                        s(iK, 0);
                        q(iK);
                        iL3 = l(iK);
                    }
                    if (f(h(iL3)) == 1 && f(l(iL3)) == 1) {
                        s(iL3, 0);
                        iK2 = k(iK);
                        iH = iK;
                        iK = iK2;
                    } else {
                        if (f(l(iL3)) == 1) {
                            s(h(iL3), 1);
                            s(iL3, 0);
                            r(iL3);
                            iL3 = l(iK);
                        }
                        s(iL3, f(iK));
                        s(iK, 1);
                        s(l(iL3), 1);
                        q(iK);
                        iH = this.d;
                    }
                } else {
                    int iH3 = h(iK);
                    if (f(iH3) == 0) {
                        s(iH3, 1);
                        s(iK, 0);
                        r(iK);
                        iH3 = h(iK);
                    }
                    if (f(l(iH3)) == 1 && f(h(iH3)) == 1) {
                        s(iH3, 0);
                        iK2 = k(iK);
                        iH = iK;
                        iK = iK2;
                    } else {
                        if (f(h(iH3)) == 1) {
                            s(l(iH3), 1);
                            s(iH3, 0);
                            q(iH3);
                            iH3 = h(iK);
                        }
                        s(iH3, f(iK));
                        s(iK, 1);
                        s(h(iH3), 1);
                        r(iK);
                        iH = this.d;
                    }
                }
            }
            s(iH, 1);
        }
    }

    public final void e(int i) {
        ldn0 ldn0Var = this.b;
        ldn0Var.f(i, ldn0Var.d(i) | 2147483648L);
        this.c++;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr80)) {
            return false;
        }
        int i = this.d + 3;
        ldn0 ldn0Var = this.b;
        long jD = ldn0Var.d(i);
        kr80 kr80Var = (kr80) obj;
        ldn0 ldn0Var2 = kr80Var.b;
        if (jD != ldn0Var2.d(kr80Var.d + 3) || p() - this.c != kr80Var.p() - kr80Var.c) {
            return false;
        }
        int i2 = 4;
        int i3 = 4;
        while (i2 < ldn0Var.b && i3 < ldn0Var2.b) {
            if (sbl.H(ldn0Var.d(i2))) {
                i2 += 4;
            } else {
                if (!sbl.H(ldn0Var2.d(i3))) {
                    if (ldn0Var.d(i2 + 2) != ldn0Var2.d(i3 + 2)) {
                        return false;
                    }
                    if (!u890.j(this.a.g(i2 / 4), kr80Var.a.g(i3 / 4))) {
                        return false;
                    }
                    i2 += 4;
                }
                i3 += 4;
            }
        }
        return true;
    }

    public final int f(int i) {
        return !sbl.G(this.b.d(i)) ? 1 : 0;
    }

    public final int g(int i) {
        return (int) (n(i) & 2147483647L);
    }

    public final int h(int i) {
        return (int) (this.b.d(i + 1) >> 32);
    }

    public final int hashCode() {
        int i = 4;
        int iHashCode = 0;
        while (true) {
            ldn0 ldn0Var = this.b;
            if (i >= ldn0Var.b) {
                return iHashCode;
            }
            if (!sbl.H(ldn0Var.d(i))) {
                int iG = (g(i) + ((m(i) + (iHashCode * 31)) * 31)) * 31;
                Object objG = this.a.g(i / 4);
                iHashCode = iG + (objG != null ? objG.hashCode() : 0);
            }
            i += 4;
        }
    }

    public final int i(int i) {
        return (int) (this.b.d(i + 3) & 2147483647L);
    }

    public final int j(int i) {
        return sbl.I(this.b.d(i + 3));
    }

    public final int k(int i) {
        return (int) (this.b.d(i) & 2147483647L);
    }

    public final int l(int i) {
        return (int) (this.b.d(i + 1) & 4294967295L);
    }

    public final int m(int i) {
        return sbl.I(n(i));
    }

    public final long n(int i) {
        return this.b.d(i + 2);
    }

    public final edn0 o() {
        edn0 edn0Var = this.g;
        if (edn0Var != null) {
            return edn0Var;
        }
        edn0 edn0Var2 = new edn0();
        this.g = edn0Var2;
        return edn0Var2;
    }

    public final int p() {
        return this.b.b / 4;
    }

    public final void q(int i) {
        int iL = l(i);
        w(i, h(iL));
        int iH = h(iL);
        int i2 = this.e;
        if (iH != i2) {
            v(h(iL), i);
        }
        v(iL, k(i));
        if (k(i) == i2) {
            this.d = iL;
        } else if (h(k(i)) == i) {
            t(k(i), iL);
        } else {
            w(k(i), iL);
        }
        t(iL, i);
        v(i, iL);
        y(i);
        y(k(i));
    }

    public final void r(int i) {
        int iH = h(i);
        t(i, l(iH));
        int iL = l(iH);
        int i2 = this.e;
        if (iL != i2) {
            v(l(iH), i);
        }
        v(iH, k(i));
        if (k(i) == i2) {
            this.d = iH;
        } else if (l(k(i)) == i) {
            w(k(i), iH);
        } else {
            t(k(i), iH);
        }
        w(iH, i);
        v(i, iH);
        y(i);
        y(k(i));
    }

    public final void s(int i, int i2) {
        ldn0 ldn0Var = this.b;
        long jD = ldn0Var.d(i);
        ldn0Var.f(i, i2 == 0 ? jD | Long.MIN_VALUE : jD & Long.MAX_VALUE);
    }

    public final void t(int i, int i2) {
        int i3 = i + 1;
        ldn0 ldn0Var = this.b;
        ldn0Var.f(i3, (((long) ((int) (ldn0Var.d(i3) & 4294967295L))) & 4294967295L) | (((long) i2) << 32));
    }

    public final void u(int i, long j) {
        this.b.f(i + 3, j);
    }

    public final void v(int i, int i2) {
        ldn0 ldn0Var = this.b;
        ldn0Var.f(i, (ldn0Var.d(i) & (-2147483648L)) | ((long) i2));
    }

    public final void w(int i, int i2) {
        int i3 = i + 1;
        ldn0 ldn0Var = this.b;
        ldn0Var.f(i3, (((long) ((int) (ldn0Var.d(i3) >> 32))) << 32) | (((long) i2) & 4294967295L));
    }

    public final void x(int i, int i2) {
        if (i == i2) {
            return;
        }
        int iK = k(i);
        int i3 = this.e;
        if (iK == i3) {
            this.d = i2;
        } else if (i == h(k(i))) {
            t(k(i), i2);
        } else {
            w(k(i), i2);
        }
        if (i2 == i3) {
            return;
        }
        v(i2, k(i));
    }

    public final void y(int i) {
        while (i != this.e) {
            long jD = this.b.d(i + 3);
            int iMin = Math.min(m(i), Math.min(j(h(i)), j(l(i))));
            int iMax = Math.max(g(i), Math.max(i(h(i)), i(l(i))));
            if (sbl.I(jD) == iMin && ((int) (jD & 2147483647L)) == iMax) {
                return;
            }
            u(i, sbl.D(iMin, iMax, false, false));
            i = k(i);
        }
    }
}
