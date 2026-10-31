package p;

import androidx.media3.common.ParserException;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vn20 implements ec10 {
    public gc10 f;
    public gtf1 g;
    public hjj0 i;
    public xn20 j;
    public int k;
    public int l;
    public un20 m;
    public int n;
    public long o;
    public final byte[] a = new byte[42];
    public final izr0 b = new izr0(new byte[32768], 0);
    public final boolean c = false;
    public final boolean d = false;
    public final n4t e = new n4t();
    public byte h = 0;

    @Override // p.ec10
    public final void a(long j, long j2) {
        if (j == 0) {
            this.h = (byte) 0;
        } else {
            un20 un20Var = this.m;
            if (un20Var != null) {
                un20Var.c(j2);
            }
        }
        this.o = j2 != 0 ? -1L : 0L;
        this.n = 0;
        this.b.O(0);
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        this.f = gc10Var;
        this.g = gc10Var.w(0, 1);
        gc10Var.s();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) throws ParserException {
        xn20 xn20Var;
        fn51 bc9Var;
        long j;
        long j2;
        boolean zI;
        byte b = this.h;
        boolean z = this.d;
        boolean z2 = true;
        int i = 0;
        if (b == 0) {
            boolean z3 = !this.c;
            fc10Var.f();
            long j3 = fc10Var.j();
            hjj0 hjj0VarQ = t2p1.q(fc10Var, z3, z);
            fc10Var.u((int) (fc10Var.j() - j3));
            this.i = hjj0VarQ;
            this.h = (byte) 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (b == 1) {
            fc10Var.h(0, bArr, bArr.length);
            fc10Var.f();
            this.h = (byte) 2;
            return 0;
        }
        int i2 = 4;
        int i3 = 3;
        if (b == 2) {
            izr0 izr0Var = new izr0(4);
            fc10Var.readFully(izr0Var.a, 0, 4);
            if (izr0Var.G() != 1716281667) {
                throw ParserException.a((RuntimeException) null, "Failed to read FLAC stream marker.");
            }
            this.h = (byte) 3;
            return 0;
        }
        int i4 = 7;
        int i5 = 6;
        if (b == 3) {
            int i6 = 0;
            xn20 xn20Var2 = this.j;
            boolean z4 = false;
            while (!z4) {
                fc10Var.f();
                byte[] bArr2 = new byte[i2];
                bae baeVar = new bae(bArr2, i2);
                fc10Var.h(i6, bArr2, i2);
                boolean zF = baeVar.f();
                int iG = baeVar.g(i4);
                int iG2 = baeVar.g(24) + i2;
                if (iG == 0) {
                    byte[] bArr3 = new byte[38];
                    fc10Var.readFully(bArr3, i6, 38);
                    xn20Var2 = new xn20(bArr3, i2);
                } else {
                    if (xn20Var2 == null) {
                        bhn0.q();
                        return 0;
                    }
                    hjj0 hjj0Var = xn20Var2.l;
                    if (iG == i3) {
                        izr0 izr0Var2 = new izr0(iG2);
                        fc10Var.readFully(izr0Var2.a, i6, iG2);
                        xn20Var = new xn20(xn20Var2.a, xn20Var2.b, xn20Var2.c, xn20Var2.d, xn20Var2.e, xn20Var2.g, xn20Var2.h, xn20Var2.j, t2p1.r(izr0Var2), xn20Var2.l);
                    } else if (iG == i2) {
                        izr0 izr0Var3 = new izr0(iG2);
                        fc10Var.readFully(izr0Var3.a, 0, iG2);
                        izr0Var3.S(i2);
                        hjj0 hjj0VarA = muk1.a(Arrays.asList((String[]) sj1.y(izr0Var3, false, false).b));
                        if (hjj0Var != null) {
                            hjj0VarA = hjj0Var.b(hjj0VarA);
                        }
                        xn20Var = new xn20(xn20Var2.a, xn20Var2.b, xn20Var2.c, xn20Var2.d, xn20Var2.e, xn20Var2.g, xn20Var2.h, xn20Var2.j, xn20Var2.k, hjj0VarA);
                    } else if (iG != i5) {
                        fc10Var.u(iG2);
                    } else if (z) {
                        fc10Var.u(iG2);
                    } else {
                        izr0 izr0Var4 = new izr0(iG2);
                        fc10Var.readFully(izr0Var4.a, 0, iG2);
                        izr0Var4.S(4);
                        hjj0 hjj0Var2 = new hjj0((List) b380.t(wxs0.d(izr0Var4)));
                        if (hjj0Var != null) {
                            hjj0Var2 = hjj0Var.b(hjj0Var2);
                        }
                        xn20Var = new xn20(xn20Var2.a, xn20Var2.b, xn20Var2.c, xn20Var2.d, xn20Var2.e, xn20Var2.g, xn20Var2.h, xn20Var2.j, xn20Var2.k, hjj0Var2);
                    }
                    xn20Var2 = xn20Var;
                }
                String str = zoi1.a;
                this.j = xn20Var2;
                z4 = zF;
                i2 = 4;
                i3 = 3;
                i4 = 7;
                i5 = 6;
                i6 = 0;
            }
            this.j.getClass();
            this.k = Math.max(this.j.c, 6);
            ie30 ie30VarC = this.j.c(bArr, this.i);
            gtf1 gtf1Var = this.g;
            String str2 = zoi1.a;
            ge30 ge30VarA = ie30VarC.a();
            ge30VarA.n = asj0.p("audio/flac");
            xvj1.q(ge30VarA, gtf1Var);
            this.g.g(this.j.b());
            this.h = (byte) 4;
            return 0;
        }
        long j4 = 0;
        if (b == 4) {
            fc10Var.f();
            izr0 izr0Var5 = new izr0(2);
            fc10Var.h(0, izr0Var5.a, 2);
            int iL = izr0Var5.L();
            if ((iL >> 2) != 16382) {
                fc10Var.f();
                throw ParserException.a((RuntimeException) null, "First frame does not start with sync code.");
            }
            fc10Var.f();
            this.l = iL;
            gc10 gc10Var = this.f;
            String str3 = zoi1.a;
            long position = fc10Var.getPosition();
            long length = fc10Var.getLength();
            this.j.getClass();
            xn20 xn20Var3 = this.j;
            t7y t7yVar = xn20Var3.k;
            if (t7yVar != null && ((long[]) t7yVar.b).length > 0) {
                bc9Var = new bc9(xn20Var3, position, (byte) 1);
                i = 0;
            } else if (length == -1 || xn20Var3.j <= 0) {
                i = 0;
                bc9Var = new bc9(xn20Var3.b());
            } else {
                int i7 = this.l;
                int i8 = xn20Var3.c;
                nay nayVar = new nay(xn20Var3, (byte) 17);
                tn20 tn20Var = new tn20(xn20Var3, i7);
                long jB = xn20Var3.b();
                long j5 = xn20Var3.j;
                int i9 = xn20Var3.d;
                if (i9 > 0) {
                    j = ((((long) i9) + ((long) i8)) / 2) + 1;
                } else {
                    int i10 = xn20Var3.a;
                    j = 64 + (((((i10 != xn20Var3.b || i10 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i10) * ((long) xn20Var3.g)) * ((long) xn20Var3.h)) / 8);
                }
                un20 un20Var = new un20(nayVar, tn20Var, jB, j5, position, length, j, Math.max(6, i8));
                this.m = un20Var;
                bc9Var = ((xua) un20Var).a;
            }
            gc10Var.c(bc9Var);
            this.h = (byte) 5;
            return i;
        }
        if (b != 5) {
            bhn0.w();
            return 0;
        }
        this.g.getClass();
        this.j.getClass();
        un20 un20Var2 = this.m;
        if (un20Var2 != null && ((xua) un20Var2).c != null) {
            return un20Var2.a(fc10Var, sfv0Var);
        }
        if (this.o == -1) {
            xn20 xn20Var4 = this.j;
            fc10Var.f();
            fc10Var.k(1);
            byte[] bArr4 = new byte[1];
            fc10Var.h(0, bArr4, 1);
            boolean z5 = (bArr4[0] & 1) == 1;
            fc10Var.k(2);
            i4 = z5 ? 7 : 6;
            izr0 izr0Var6 = new izr0(i4);
            byte[] bArr5 = izr0Var6.a;
            int i11 = 0;
            while (i11 < i4) {
                int iQ = fc10Var.q(i11, bArr5, i4 - i11);
                if (iQ == -1) {
                    break;
                }
                i11 += iQ;
            }
            izr0Var6.Q(i11);
            fc10Var.f();
            try {
                long jM = izr0Var6.M();
                if (!z5) {
                    jM *= (long) xn20Var4.b;
                }
                long j6 = xn20Var4.j;
                if (j6 == 0 || jM <= j6) {
                    j4 = jM;
                } else {
                    z2 = false;
                }
            } catch (NumberFormatException unused) {
            }
            if (!z2) {
                throw ParserException.a((RuntimeException) null, (String) null);
            }
            this.o = j4;
        } else {
            izr0 izr0Var7 = this.b;
            int i12 = izr0Var7.c;
            if (i12 < 32768) {
                int i13 = fc10Var.read(izr0Var7.a, i12, 32768 - i12);
                z2 = i13 == -1;
                if (!z2) {
                    izr0Var7.Q(i12 + i13);
                } else if (izr0Var7.a() == 0) {
                    long j7 = this.o * 1000000;
                    xn20 xn20Var5 = this.j;
                    String str4 = zoi1.a;
                    this.g.b(j7 / ((long) xn20Var5.e), 1, this.n, 0, null);
                    return -1;
                }
            } else {
                z2 = false;
            }
            int i14 = izr0Var7.b;
            int i15 = this.n;
            int i16 = this.k;
            if (i15 < i16) {
                izr0Var7.S(Math.min(i16 - i15, izr0Var7.a()));
            }
            this.j.getClass();
            int i17 = izr0Var7.b;
            while (true) {
                int i18 = izr0Var7.c - 16;
                n4t n4tVar = this.e;
                if (i17 > i18) {
                    if (z2) {
                        while (true) {
                            int i19 = izr0Var7.c;
                            if (i17 <= i19 - this.k) {
                                izr0Var7.R(i17);
                                try {
                                    zI = r2p1.i(izr0Var7, this.j, this.l, n4tVar);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zI = false;
                                }
                                if (izr0Var7.b > izr0Var7.c) {
                                    zI = false;
                                }
                                if (zI) {
                                    izr0Var7.R(i17);
                                    j2 = n4tVar.b;
                                    break;
                                }
                                i17++;
                            } else {
                                izr0Var7.R(i19);
                            }
                        }
                    } else {
                        izr0Var7.R(i17);
                    }
                    j2 = -1;
                    break;
                }
                izr0Var7.R(i17);
                if (r2p1.i(izr0Var7, this.j, this.l, n4tVar)) {
                    izr0Var7.R(i17);
                    j2 = n4tVar.b;
                    break;
                }
                i17++;
            }
            int i20 = izr0Var7.b - i14;
            izr0Var7.R(i14);
            this.g.f(i20, izr0Var7);
            int i21 = this.n + i20;
            this.n = i21;
            if (j2 != -1) {
                long j8 = this.o * 1000000;
                xn20 xn20Var6 = this.j;
                String str5 = zoi1.a;
                this.g.b(j8 / ((long) xn20Var6.e), 1, i21, 0, null);
                this.n = 0;
                this.o = j2;
            }
            int length2 = izr0Var7.a.length - izr0Var7.c;
            if (izr0Var7.a() < 16 && length2 < 16) {
                int iA = izr0Var7.a();
                byte[] bArr6 = izr0Var7.a;
                System.arraycopy(bArr6, izr0Var7.b, bArr6, 0, iA);
                izr0Var7.R(0);
                izr0Var7.Q(iA);
            }
        }
        return 0;
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) {
        t2p1.q(fc10Var, false, false);
        izr0 izr0Var = new izr0(4);
        ((uyr) fc10Var).d(izr0Var.a, 0, 4, false);
        return izr0Var.G() == 1716281667;
    }

    @Override // p.ec10
    public final void release() {
    }
}
