package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import p.dr80;
import p.ghc;
import p.k290;
import p.mvb0;
import p.ngc;
import p.ohc;
import p.qxy0;
import p.rm41;
import p.s4f0;
import p.soi1;
import p.tqu;
import p.tz00;
import p.xq20;
import p.yb01;
import p.yob;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b implements yb01 {
    public final a a;
    public int b;
    public int c;
    public int d = 0;

    public b(a aVar) {
        Charset charset = k290.a;
        this.a = aVar;
        ((ngc) aVar).b = this;
    }

    public static void Q(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.d();
        }
    }

    public static void R(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // p.yb01
    public final void A(List list) throws InvalidProtocolBufferException {
        N(list, false);
    }

    @Override // p.yb01
    public final void B(List list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z = list instanceof xq20;
        int i = this.b;
        a aVar = this.a;
        if (!z) {
            int iY = qxy0.y(i);
            if (iY == 2) {
                int iD = aVar.D();
                Q(iD);
                int iD2 = aVar.d() + iD;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(aVar.B())));
                } while (aVar.d() < iD2);
                return;
            }
            if (iY != 5) {
                throw InvalidProtocolBufferException.b();
            }
            do {
                list.add(Float.valueOf(Float.intBitsToFloat(aVar.B())));
                if (aVar.e()) {
                    return;
                } else {
                    iW = aVar.w();
                }
            } while (iW == this.b);
            this.d = iW;
            return;
        }
        xq20 xq20Var = (xq20) list;
        int iY2 = qxy0.y(i);
        if (iY2 == 2) {
            int iD3 = aVar.D();
            Q(iD3);
            int iD4 = aVar.d() + iD3;
            do {
                xq20Var.c(Float.intBitsToFloat(aVar.B()));
            } while (aVar.d() < iD4);
            return;
        }
        if (iY2 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            xq20Var.c(Float.intBitsToFloat(aVar.B()));
            if (aVar.e()) {
                return;
            } else {
                iW2 = aVar.w();
            }
        } while (iW2 == this.b);
        this.d = iW2;
    }

    @Override // p.yb01
    public final int C() throws InvalidProtocolBufferException.InvalidWireTypeException {
        P(5);
        return this.a.B();
    }

    @Override // p.yb01
    public final void D(List list) throws InvalidProtocolBufferException {
        int iW;
        if (qxy0.y(this.b) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(n());
            a aVar = this.a;
            if (aVar.e()) {
                return;
            } else {
                iW = aVar.w();
            }
        } while (iW == this.b);
        this.d = iW;
    }

    @Override // p.yb01
    public final void E(List list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z = list instanceof tqu;
        int i = this.b;
        a aVar = this.a;
        if (!z) {
            int iY = qxy0.y(i);
            if (iY == 1) {
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(aVar.C())));
                    if (aVar.e()) {
                        return;
                    } else {
                        iW = aVar.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (iY != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iD = aVar.D();
            R(iD);
            int iD2 = aVar.d() + iD;
            do {
                list.add(Double.valueOf(Double.longBitsToDouble(aVar.C())));
            } while (aVar.d() < iD2);
            return;
        }
        tqu tquVar = (tqu) list;
        int iY2 = qxy0.y(i);
        if (iY2 == 1) {
            do {
                tquVar.c(Double.longBitsToDouble(aVar.C()));
                if (aVar.e()) {
                    return;
                } else {
                    iW2 = aVar.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (iY2 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iD3 = aVar.D();
        R(iD3);
        int iD4 = aVar.d() + iD3;
        do {
            tquVar.c(Double.longBitsToDouble(aVar.C()));
        } while (aVar.d() < iD4);
    }

    @Override // p.yb01
    public final long F() throws InvalidProtocolBufferException.InvalidWireTypeException {
        P(0);
        return this.a.E();
    }

    @Override // p.yb01
    public final String G() throws InvalidProtocolBufferException {
        P(2);
        a aVar = this.a;
        int iD = aVar.D();
        if (iD > 0) {
            int i = aVar.d;
            int i2 = aVar.f;
            if (iD <= i - i2) {
                String strR = soi1.a.r(i2, aVar.c, iD);
                aVar.f += iD;
                return strR;
            }
        }
        if (iD == 0) {
            return "";
        }
        if (iD <= 0) {
            throw InvalidProtocolBufferException.c();
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override // p.yb01
    public final void H(List list, rm41 rm41Var, tz00 tz00Var) throws InvalidProtocolBufferException {
        int iW;
        if (qxy0.y(this.b) != 3) {
            throw InvalidProtocolBufferException.b();
        }
        int i = this.b;
        do {
            list.add(L(rm41Var, tz00Var));
            a aVar = this.a;
            if (aVar.e() || this.d != 0) {
                return;
            } else {
                iW = aVar.w();
            }
        } while (iW == i);
        this.d = iW;
    }

    @Override // p.yb01
    public final Object I(rm41 rm41Var, tz00 tz00Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        P(3);
        return L(rm41Var, tz00Var);
    }

    @Override // p.yb01
    public final void J(List list, rm41 rm41Var, tz00 tz00Var) throws InvalidProtocolBufferException {
        int iW;
        if (qxy0.y(this.b) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int i = this.b;
        do {
            list.add(M(rm41Var, tz00Var));
            a aVar = this.a;
            if (aVar.e() || this.d != 0) {
                return;
            } else {
                iW = aVar.w();
            }
        } while (iW == i);
        this.d = iW;
    }

    @Override // p.yb01
    public final Object K(rm41 rm41Var, tz00 tz00Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        P(2);
        return M(rm41Var, tz00Var);
    }

    public final Object L(rm41 rm41Var, tz00 tz00Var) {
        int i = this.c;
        this.c = qxy0.A(qxy0.x(this.b), 4);
        try {
            Object objC = rm41Var.c();
            rm41Var.j(objC, this, tz00Var);
            rm41Var.a(objC);
            if (this.b != this.c) {
                throw InvalidProtocolBufferException.d();
            }
            this.c = i;
            return objC;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    public final Object M(rm41 rm41Var, tz00 tz00Var) throws InvalidProtocolBufferException {
        a aVar = this.a;
        int iD = aVar.D();
        if (((ngc) aVar).a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iG = aVar.g(iD);
        Object objC = rm41Var.c();
        ((ngc) aVar).a++;
        rm41Var.j(objC, this, tz00Var);
        rm41Var.a(objC);
        if (aVar.h != 0) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        ((ngc) aVar).a--;
        aVar.i = iG;
        aVar.G();
        return objC;
    }

    public final void N(List list, boolean z) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        if (qxy0.y(this.b) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        boolean z2 = list instanceof mvb0;
        a aVar = this.a;
        if (!z2 || z) {
            do {
                list.add(z ? G() : y());
                if (aVar.e()) {
                    return;
                } else {
                    iW = aVar.w();
                }
            } while (iW == this.b);
            this.d = iW;
            return;
        }
        mvb0 mvb0Var = (mvb0) list;
        do {
            mvb0Var.a0(n());
            if (aVar.e()) {
                return;
            } else {
                iW2 = aVar.w();
            }
        } while (iW2 == this.b);
        this.d = iW2;
    }

    public final void O(int i) throws InvalidProtocolBufferException {
        if (this.a.d() != i) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public final void P(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if (qxy0.y(this.b) != i) {
            throw InvalidProtocolBufferException.b();
        }
    }

    @Override // p.yb01
    public final long a() throws InvalidProtocolBufferException.InvalidWireTypeException {
        P(1);
        return this.a.C();
    }

    @Override // p.yb01
    public final void b(List list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z = list instanceof dr80;
        int i = this.b;
        a aVar = this.a;
        if (!z) {
            int iY = qxy0.y(i);
            if (iY == 2) {
                int iD = aVar.D();
                Q(iD);
                int iD2 = aVar.d() + iD;
                do {
                    list.add(Integer.valueOf(aVar.B()));
                } while (aVar.d() < iD2);
                return;
            }
            if (iY != 5) {
                throw InvalidProtocolBufferException.b();
            }
            do {
                list.add(Integer.valueOf(aVar.B()));
                if (aVar.e()) {
                    return;
                } else {
                    iW = aVar.w();
                }
            } while (iW == this.b);
            this.d = iW;
            return;
        }
        dr80 dr80Var = (dr80) list;
        int iY2 = qxy0.y(i);
        if (iY2 == 2) {
            int iD3 = aVar.D();
            Q(iD3);
            int iD4 = aVar.d() + iD3;
            do {
                dr80Var.c(aVar.B());
            } while (aVar.d() < iD4);
            return;
        }
        if (iY2 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            dr80Var.c(aVar.B());
            if (aVar.e()) {
                return;
            } else {
                iW2 = aVar.w();
            }
        } while (iW2 == this.b);
        this.d = iW2;
    }

    @Override // p.yb01
    public final void c(List list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z = list instanceof s4f0;
        int i = this.b;
        a aVar = this.a;
        if (!z) {
            int iY = qxy0.y(i);
            if (iY == 0) {
                do {
                    list.add(Long.valueOf(ngc.c(aVar.E())));
                    if (aVar.e()) {
                        return;
                    } else {
                        iW = aVar.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (iY != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iD = aVar.d() + aVar.D();
            do {
                list.add(Long.valueOf(ngc.c(aVar.E())));
            } while (aVar.d() < iD);
            O(iD);
            return;
        }
        s4f0 s4f0Var = (s4f0) list;
        int iY2 = qxy0.y(i);
        if (iY2 == 0) {
            do {
                s4f0Var.c(ngc.c(aVar.E()));
                if (aVar.e()) {
                    return;
                } else {
                    iW2 = aVar.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (iY2 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iD2 = aVar.d() + aVar.D();
        do {
            s4f0Var.c(ngc.c(aVar.E()));
        } while (aVar.d() < iD2);
        O(iD2);
    }

    @Override // p.yb01
    public final boolean d() throws InvalidProtocolBufferException.InvalidWireTypeException {
        P(0);
        return this.a.h();
    }

    @Override // p.yb01
    public final long e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        P(1);
        return this.a.C();
    }

    @Override // p.yb01
    public final void f(List list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z = list instanceof s4f0;
        int i = this.b;
        a aVar = this.a;
        if (!z) {
            int iY = qxy0.y(i);
            if (iY == 0) {
                do {
                    list.add(Long.valueOf(aVar.E()));
                    if (aVar.e()) {
                        return;
                    } else {
                        iW = aVar.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (iY != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iD = aVar.d() + aVar.D();
            do {
                list.add(Long.valueOf(aVar.E()));
            } while (aVar.d() < iD);
            O(iD);
            return;
        }
        s4f0 s4f0Var = (s4f0) list;
        int iY2 = qxy0.y(i);
        if (iY2 == 0) {
            do {
                s4f0Var.c(aVar.E());
                if (aVar.e()) {
                    return;
                } else {
                    iW2 = aVar.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (iY2 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iD2 = aVar.d() + aVar.D();
        do {
            s4f0Var.c(aVar.E());
        } while (aVar.d() < iD2);
        O(iD2);
    }

    @Override // p.yb01
    public final int g() throws InvalidProtocolBufferException.InvalidWireTypeException {
        P(0);
        return this.a.D();
    }

    @Override // p.yb01
    public final int getTag() {
        return this.b;
    }

    @Override // p.yb01
    public final void h(List list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z = list instanceof s4f0;
        int i = this.b;
        a aVar = this.a;
        if (!z) {
            int iY = qxy0.y(i);
            if (iY == 0) {
                do {
                    list.add(Long.valueOf(aVar.E()));
                    if (aVar.e()) {
                        return;
                    } else {
                        iW = aVar.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (iY != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iD = aVar.d() + aVar.D();
            do {
                list.add(Long.valueOf(aVar.E()));
            } while (aVar.d() < iD);
            O(iD);
            return;
        }
        s4f0 s4f0Var = (s4f0) list;
        int iY2 = qxy0.y(i);
        if (iY2 == 0) {
            do {
                s4f0Var.c(aVar.E());
                if (aVar.e()) {
                    return;
                } else {
                    iW2 = aVar.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (iY2 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iD2 = aVar.d() + aVar.D();
        do {
            s4f0Var.c(aVar.E());
        } while (aVar.d() < iD2);
        O(iD2);
    }

    @Override // p.yb01
    public final void i(List list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z = list instanceof dr80;
        int i = this.b;
        a aVar = this.a;
        if (!z) {
            int iY = qxy0.y(i);
            if (iY == 0) {
                do {
                    list.add(Integer.valueOf(aVar.D()));
                    if (aVar.e()) {
                        return;
                    } else {
                        iW = aVar.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (iY != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iD = aVar.d() + aVar.D();
            do {
                list.add(Integer.valueOf(aVar.D()));
            } while (aVar.d() < iD);
            O(iD);
            return;
        }
        dr80 dr80Var = (dr80) list;
        int iY2 = qxy0.y(i);
        if (iY2 == 0) {
            do {
                dr80Var.c(aVar.D());
                if (aVar.e()) {
                    return;
                } else {
                    iW2 = aVar.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (iY2 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iD2 = aVar.d() + aVar.D();
        do {
            dr80Var.c(aVar.D());
        } while (aVar.d() < iD2);
        O(iD2);
    }

    @Override // p.yb01
    public final int j() throws InvalidProtocolBufferException.InvalidWireTypeException {
        P(0);
        return this.a.D();
    }

    @Override // p.yb01
    public final int k() throws InvalidProtocolBufferException.InvalidWireTypeException {
        P(0);
        return ngc.b(this.a.D());
    }

    @Override // p.yb01
    public final void l(List list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z = list instanceof yob;
        int i = this.b;
        a aVar = this.a;
        if (!z) {
            int iY = qxy0.y(i);
            if (iY == 0) {
                do {
                    list.add(Boolean.valueOf(aVar.h()));
                    if (aVar.e()) {
                        return;
                    } else {
                        iW = aVar.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (iY != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iD = aVar.d() + aVar.D();
            do {
                list.add(Boolean.valueOf(aVar.h()));
            } while (aVar.d() < iD);
            O(iD);
            return;
        }
        yob yobVar = (yob) list;
        int iY2 = qxy0.y(i);
        if (iY2 == 0) {
            do {
                yobVar.c(aVar.h());
                if (aVar.e()) {
                    return;
                } else {
                    iW2 = aVar.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (iY2 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iD2 = aVar.d() + aVar.D();
        do {
            yobVar.c(aVar.h());
        } while (aVar.d() < iD2);
        O(iD2);
    }

    @Override // p.yb01
    public final void m(List list) throws InvalidProtocolBufferException {
        N(list, true);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    @Override // p.yb01
    public final ghc n() throws InvalidProtocolBufferException {
        byte[] bArrCopyOfRange;
        P(2);
        a aVar = this.a;
        byte[] bArr = aVar.c;
        int iD = aVar.D();
        if (iD > 0) {
            int i = aVar.d;
            int i2 = aVar.f;
            if (iD <= i - i2) {
                ghc ghcVarD = ohc.d(i2, bArr, iD);
                aVar.f += iD;
                return ghcVarD;
            }
        }
        if (iD == 0) {
            return ohc.b;
        }
        if (iD > 0) {
            int i3 = aVar.d;
            int i4 = aVar.f;
            if (iD <= i3 - i4) {
                int i5 = iD + i4;
                aVar.f = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iD <= 0) {
                    throw InvalidProtocolBufferException.e();
                }
                if (iD == 0) {
                    throw InvalidProtocolBufferException.c();
                }
                bArrCopyOfRange = k290.b;
            }
        } else {
            if (iD <= 0) {
                throw InvalidProtocolBufferException.e();
            }
            if (iD == 0) {
                throw InvalidProtocolBufferException.c();
            }
            bArrCopyOfRange = k290.b;
        }
        ghc ghcVar = ohc.b;
        return new ghc(bArrCopyOfRange);
    }

    @Override // p.yb01
    public final int o() throws InvalidProtocolBufferException.InvalidWireTypeException {
        P(0);
        return this.a.D();
    }

    @Override // p.yb01
    public final void p(List list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z = list instanceof s4f0;
        int i = this.b;
        a aVar = this.a;
        if (!z) {
            int iY = qxy0.y(i);
            if (iY == 1) {
                do {
                    list.add(Long.valueOf(aVar.C()));
                    if (aVar.e()) {
                        return;
                    } else {
                        iW = aVar.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (iY != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iD = aVar.D();
            R(iD);
            int iD2 = aVar.d() + iD;
            do {
                list.add(Long.valueOf(aVar.C()));
            } while (aVar.d() < iD2);
            return;
        }
        s4f0 s4f0Var = (s4f0) list;
        int iY2 = qxy0.y(i);
        if (iY2 == 1) {
            do {
                s4f0Var.c(aVar.C());
                if (aVar.e()) {
                    return;
                } else {
                    iW2 = aVar.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (iY2 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iD3 = aVar.D();
        R(iD3);
        int iD4 = aVar.d() + iD3;
        do {
            s4f0Var.c(aVar.C());
        } while (aVar.d() < iD4);
    }

    @Override // p.yb01
    public final void q(List list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z = list instanceof dr80;
        int i = this.b;
        a aVar = this.a;
        if (!z) {
            int iY = qxy0.y(i);
            if (iY == 0) {
                do {
                    list.add(Integer.valueOf(ngc.b(aVar.D())));
                    if (aVar.e()) {
                        return;
                    } else {
                        iW = aVar.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (iY != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iD = aVar.d() + aVar.D();
            do {
                list.add(Integer.valueOf(ngc.b(aVar.D())));
            } while (aVar.d() < iD);
            O(iD);
            return;
        }
        dr80 dr80Var = (dr80) list;
        int iY2 = qxy0.y(i);
        if (iY2 == 0) {
            do {
                dr80Var.c(ngc.b(aVar.D()));
                if (aVar.e()) {
                    return;
                } else {
                    iW2 = aVar.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (iY2 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iD2 = aVar.d() + aVar.D();
        do {
            dr80Var.c(ngc.b(aVar.D()));
        } while (aVar.d() < iD2);
        O(iD2);
    }

    @Override // p.yb01
    public final long r() throws InvalidProtocolBufferException.InvalidWireTypeException {
        P(0);
        return this.a.E();
    }

    @Override // p.yb01
    public final double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        P(1);
        return Double.longBitsToDouble(this.a.C());
    }

    @Override // p.yb01
    public final float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        P(5);
        return Float.intBitsToFloat(this.a.B());
    }

    @Override // p.yb01
    public final void s(List list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z = list instanceof dr80;
        int i = this.b;
        a aVar = this.a;
        if (!z) {
            int iY = qxy0.y(i);
            if (iY == 0) {
                do {
                    list.add(Integer.valueOf(aVar.D()));
                    if (aVar.e()) {
                        return;
                    } else {
                        iW = aVar.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (iY != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iD = aVar.d() + aVar.D();
            do {
                list.add(Integer.valueOf(aVar.D()));
            } while (aVar.d() < iD);
            O(iD);
            return;
        }
        dr80 dr80Var = (dr80) list;
        int iY2 = qxy0.y(i);
        if (iY2 == 0) {
            do {
                dr80Var.c(aVar.D());
                if (aVar.e()) {
                    return;
                } else {
                    iW2 = aVar.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (iY2 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iD2 = aVar.d() + aVar.D();
        do {
            dr80Var.c(aVar.D());
        } while (aVar.d() < iD2);
        O(iD2);
    }

    @Override // p.yb01
    public final int t() throws InvalidProtocolBufferException.InvalidWireTypeException {
        P(5);
        return this.a.B();
    }

    @Override // p.yb01
    public final void u(List list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z = list instanceof s4f0;
        int i = this.b;
        a aVar = this.a;
        if (!z) {
            int iY = qxy0.y(i);
            if (iY == 1) {
                do {
                    list.add(Long.valueOf(aVar.C()));
                    if (aVar.e()) {
                        return;
                    } else {
                        iW = aVar.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (iY != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iD = aVar.D();
            R(iD);
            int iD2 = aVar.d() + iD;
            do {
                list.add(Long.valueOf(aVar.C()));
            } while (aVar.d() < iD2);
            return;
        }
        s4f0 s4f0Var = (s4f0) list;
        int iY2 = qxy0.y(i);
        if (iY2 == 1) {
            do {
                s4f0Var.c(aVar.C());
                if (aVar.e()) {
                    return;
                } else {
                    iW2 = aVar.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (iY2 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iD3 = aVar.D();
        R(iD3);
        int iD4 = aVar.d() + iD3;
        do {
            s4f0Var.c(aVar.C());
        } while (aVar.d() < iD4);
    }

    @Override // p.yb01
    public final void v(List list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z = list instanceof dr80;
        int i = this.b;
        a aVar = this.a;
        if (!z) {
            int iY = qxy0.y(i);
            if (iY == 0) {
                do {
                    list.add(Integer.valueOf(aVar.D()));
                    if (aVar.e()) {
                        return;
                    } else {
                        iW = aVar.w();
                    }
                } while (iW == this.b);
                this.d = iW;
                return;
            }
            if (iY != 2) {
                throw InvalidProtocolBufferException.b();
            }
            int iD = aVar.d() + aVar.D();
            do {
                list.add(Integer.valueOf(aVar.D()));
            } while (aVar.d() < iD);
            O(iD);
            return;
        }
        dr80 dr80Var = (dr80) list;
        int iY2 = qxy0.y(i);
        if (iY2 == 0) {
            do {
                dr80Var.c(aVar.D());
                if (aVar.e()) {
                    return;
                } else {
                    iW2 = aVar.w();
                }
            } while (iW2 == this.b);
            this.d = iW2;
            return;
        }
        if (iY2 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iD2 = aVar.d() + aVar.D();
        do {
            dr80Var.c(aVar.D());
        } while (aVar.d() < iD2);
        O(iD2);
    }

    @Override // p.yb01
    public final void w(List list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z = list instanceof dr80;
        int i = this.b;
        a aVar = this.a;
        if (!z) {
            int iY = qxy0.y(i);
            if (iY == 2) {
                int iD = aVar.D();
                Q(iD);
                int iD2 = aVar.d() + iD;
                do {
                    list.add(Integer.valueOf(aVar.B()));
                } while (aVar.d() < iD2);
                return;
            }
            if (iY != 5) {
                throw InvalidProtocolBufferException.b();
            }
            do {
                list.add(Integer.valueOf(aVar.B()));
                if (aVar.e()) {
                    return;
                } else {
                    iW = aVar.w();
                }
            } while (iW == this.b);
            this.d = iW;
            return;
        }
        dr80 dr80Var = (dr80) list;
        int iY2 = qxy0.y(i);
        if (iY2 == 2) {
            int iD3 = aVar.D();
            Q(iD3);
            int iD4 = aVar.d() + iD3;
            do {
                dr80Var.c(aVar.B());
            } while (aVar.d() < iD4);
            return;
        }
        if (iY2 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            dr80Var.c(aVar.B());
            if (aVar.e()) {
                return;
            } else {
                iW2 = aVar.w();
            }
        } while (iW2 == this.b);
        this.d = iW2;
    }

    @Override // p.yb01
    public final long x() throws InvalidProtocolBufferException.InvalidWireTypeException {
        P(0);
        return ngc.c(this.a.E());
    }

    @Override // p.yb01
    public final String y() throws InvalidProtocolBufferException {
        P(2);
        a aVar = this.a;
        int iD = aVar.D();
        if (iD > 0) {
            int i = aVar.d;
            int i2 = aVar.f;
            if (iD <= i - i2) {
                String str = new String(aVar.c, i2, iD, k290.a);
                aVar.f += iD;
                return str;
            }
        }
        if (iD == 0) {
            return "";
        }
        if (iD < 0) {
            throw InvalidProtocolBufferException.c();
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override // p.yb01
    public final int z() throws InvalidProtocolBufferException {
        int iW = this.d;
        if (iW != 0) {
            this.b = iW;
            this.d = 0;
        } else {
            iW = this.a.w();
            this.b = iW;
        }
        if (iW == 0 || iW == this.c) {
            return Integer.MAX_VALUE;
        }
        return qxy0.x(iW);
    }
}
