package p;

import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dev implements ytw {
    public final izr0 a;
    public final String c;
    public final int d;
    public String e;
    public gtf1 f;
    public int h;
    public int i;
    public int j;
    public long k;
    public ie30 l;
    public int m;
    public int n;
    public int o;
    public boolean r;
    public boolean u;
    public boolean v;
    public byte g = 0;
    public long s = -9223372036854775807L;
    public long t = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f34p = -1;
    public int q = -1;

    public dev(String str, int i, int i2) {
        this.a = new izr0(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    @Override // p.ytw
    public final void a(izr0 izr0Var) throws ParserException {
        int i;
        byte b;
        int i2;
        byte b2;
        int iG;
        int i3;
        int i4;
        this.f.getClass();
        while (izr0Var.a() > 0) {
            byte b3 = this.g;
            long jG0 = -9223372036854775807L;
            izr0 izr0Var2 = this.a;
            switch (b3) {
                case 0:
                    while (izr0Var.a() > 0) {
                        int i5 = this.j << 8;
                        this.j = i5;
                        int iE = i5 | izr0Var.E();
                        this.j = iE;
                        int iC = pxd0.C(iE);
                        this.o = iC;
                        if (iC != 0) {
                            h(this.j);
                            this.j = 0;
                            if (!this.v || this.o != 2) {
                                int i6 = this.o;
                                if (i6 == 1) {
                                    this.v = false;
                                }
                                if (i6 != 3 && i6 != 4) {
                                    if (i6 == 1) {
                                        this.g = (byte) 1;
                                    } else {
                                        this.g = (byte) 2;
                                    }
                                }
                                this.g = (byte) 4;
                            }
                            this.h = 0;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (g(izr0Var, izr0Var2.a, 18)) {
                        this.u = true;
                        byte[] bArr = izr0Var2.a;
                        if (this.l == null) {
                            String str = this.e;
                            bae baeVarD = pxd0.D(bArr);
                            baeVarD.o(60);
                            int i7 = pxd0.a[baeVarD.g(6)];
                            int i8 = pxd0.b[baeVarD.g(4)];
                            int iG2 = baeVarD.g(5);
                            int i9 = iG2 >= 29 ? -1 : (pxd0.c[iG2] * 1000) / 2;
                            baeVarD.o(10);
                            int i10 = i7 + (baeVarD.g(2) > 0 ? 1 : 0);
                            ge30 ge30Var = new ge30();
                            ge30Var.a = str;
                            ge30Var.n = asj0.p("video/mp2t");
                            ge30Var.o = asj0.p("audio/vnd.dts");
                            ge30Var.i = i9;
                            ge30Var.I = i10;
                            ge30Var.K = i8;
                            ge30Var.s = null;
                            ge30Var.d = this.c;
                            ge30Var.f = this.d;
                            this.l = new ie30(ge30Var);
                            this.r = true;
                        }
                        this.m = pxd0.B(bArr);
                        byte b4 = bArr[0];
                        if (b4 != -2) {
                            if (b4 == -1) {
                                i = (bArr[4] & 7) << 4;
                                b2 = bArr[7];
                            } else if (b4 != 31) {
                                i = (bArr[4] & 1) << 6;
                                b = bArr[5];
                            } else {
                                i = (bArr[r3] & 7) << 4;
                                b2 = bArr[6];
                            }
                            i2 = b2 & 60;
                            this.k = bmq0.j(zoi1.e0(this.l.L, (((i2 >> 2) | i) + 1) * 32));
                            izr0Var2.R(0);
                            this.f.f(18, izr0Var2);
                            this.g = (byte) 6;
                        } else {
                            i = (bArr[r3] & 1) << 6;
                            b = bArr[4];
                        }
                        i2 = b & 252;
                        this.k = bmq0.j(zoi1.e0(this.l.L, (((i2 >> 2) | i) + 1) * 32));
                        izr0Var2.R(0);
                        this.f.f(18, izr0Var2);
                        this.g = (byte) 6;
                        break;
                    }
                    break;
                case 2:
                    if (g(izr0Var, izr0Var2.a, 7)) {
                        bae baeVarD2 = pxd0.D(izr0Var2.a);
                        baeVarD2.o(42);
                        this.f34p = baeVarD2.g(baeVarD2.f() ? 12 : 8) + 1;
                        this.g = (byte) 3;
                    }
                    break;
                case 3:
                    if (g(izr0Var, izr0Var2.a, this.f34p)) {
                        eev eevVarL = pxd0.L(izr0Var2.a);
                        i(eevVarL);
                        this.m = eevVarL.d;
                        long j = eevVarL.b;
                        if (j != -9223372036854775807L) {
                            this.k = j;
                        }
                        izr0Var2.R(0);
                        this.f.f(this.f34p, izr0Var2);
                        this.g = (byte) 6;
                    }
                    break;
                case 4:
                    if (g(izr0Var, izr0Var2.a, 6)) {
                        bae baeVarD3 = pxd0.D(izr0Var2.a);
                        baeVarD3.o(32);
                        int iM = pxd0.M(baeVarD3, pxd0.i) + 1;
                        this.q = iM;
                        int i11 = this.h;
                        if (i11 > iM) {
                            int i12 = i11 - iM;
                            this.h = i11 - i12;
                            izr0Var.R(izr0Var.b - i12);
                        }
                        this.g = (byte) 5;
                    }
                    break;
                case 5:
                    if (g(izr0Var, izr0Var2.a, this.q)) {
                        byte[] bArr2 = izr0Var2.a;
                        bae baeVarD4 = pxd0.D(bArr2);
                        int i13 = baeVarD4.g(32) == 1078008818 ? 1 : 0;
                        int iM2 = pxd0.M(baeVarD4, pxd0.e);
                        int i14 = iM2 + 1;
                        if (i13 == 0) {
                            iG = -2147483647;
                        } else {
                            if (!baeVarD4.f()) {
                                throw ParserException.d("Only supports full channel mask-based audio presentation");
                            }
                            int i15 = iM2 - 1;
                            int i16 = (bArr2[iM2] & 255) | ((bArr2[i15] << 8) & 65535);
                            String str2 = zoi1.a;
                            int i17 = 65535;
                            for (int i18 = 0; i18 < i15; i18++) {
                                byte b5 = bArr2[i18];
                                int i19 = (((b5 & 255) >> 4) ^ ((i17 >> 12) & 255)) & 255;
                                int i20 = (i17 << 4) & 65535;
                                int[] iArr = zoi1.k;
                                int i21 = (iArr[i19] ^ i20) & 65535;
                                i17 = (((i21 << 4) & 65535) ^ iArr[((b5 & 15) ^ ((i21 >> 12) & 255)) & 255]) & 65535;
                            }
                            if (i16 != i17) {
                                throw ParserException.a((RuntimeException) null, "CRC check failed");
                            }
                            int iG3 = baeVarD4.g(2);
                            if (iG3 == 0) {
                                i3 = 512;
                            } else if (iG3 == 1) {
                                i3 = 480;
                            } else {
                                if (iG3 != 2) {
                                    throw ParserException.a((RuntimeException) null, "Unsupported base duration index in DTS UHD header: " + iG3);
                                }
                                i3 = 384;
                            }
                            int iG4 = (baeVarD4.g(3) + 1) * i3;
                            int iG5 = baeVarD4.g(2);
                            if (iG5 == 0) {
                                i4 = 32000;
                            } else if (iG5 == 1) {
                                i4 = 44100;
                            } else {
                                if (iG5 != 2) {
                                    throw ParserException.a((RuntimeException) null, "Unsupported clock rate index in DTS UHD header: " + iG5);
                                }
                                i4 = 48000;
                            }
                            if (baeVarD4.f()) {
                                baeVarD4.o(36);
                            }
                            iG = (1 << baeVarD4.g(2)) * i4;
                            jG0 = zoi1.g0(iG4, 1000000L, i4, RoundingMode.DOWN);
                        }
                        int i22 = iG;
                        int iM3 = 0;
                        for (int i23 = 0; i23 < i13; i23++) {
                            iM3 += pxd0.M(baeVarD4, pxd0.f);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i13 != 0) {
                            atomicInteger.set(pxd0.M(baeVarD4, pxd0.g));
                        }
                        int iM4 = iM3 + (atomicInteger.get() != 0 ? pxd0.M(baeVarD4, pxd0.h) : 0) + i14;
                        eev eevVar = new eev(2, i22, iM4, jG0, "audio/vnd.dts.uhd;profile=p2");
                        if (this.o == 3) {
                            i(eevVar);
                        }
                        this.m = iM4;
                        if (jG0 == -9223372036854775807) {
                            jG0 = 0;
                        }
                        this.k = jG0;
                        izr0Var2.R(0);
                        this.f.f(this.q, izr0Var2);
                        this.g = (byte) 6;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(izr0Var.a(), this.m - this.h);
                    this.f.f(iMin, izr0Var);
                    int i24 = this.h + iMin;
                    this.h = i24;
                    int i25 = this.m;
                    if (i24 == i25) {
                        if (this.o == 1) {
                            this.n = i25;
                            this.h = 0;
                            this.i = 0;
                            this.g = (byte) 7;
                        } else {
                            dm5.y(this.s != -9223372036854775807L);
                            int i26 = this.m;
                            int i27 = this.o;
                            int i28 = i26 + (i27 == 2 ? this.n : 0);
                            long j2 = this.s;
                            this.f.b(j2, i27 == 4 ? 0 : 1, i28, 0, null);
                            this.s += this.k;
                            long j3 = this.t;
                            if (j3 != -9223372036854775807L) {
                                if (j3 != j2) {
                                    this.s = j3;
                                }
                                this.t = -9223372036854775807L;
                            }
                            this.n = 0;
                            this.g = (byte) 0;
                        }
                    }
                    break;
                case 7:
                    while (izr0Var.a() > 0 && this.h < 4) {
                        int i29 = this.i << 8;
                        this.i = i29;
                        this.i = i29 | izr0Var.E();
                        this.h++;
                    }
                    if (this.h == 4) {
                        if (pxd0.C(this.i) == 2) {
                            h(this.i);
                            this.o = 2;
                            this.i = 0;
                            this.g = (byte) 2;
                        } else {
                            if (this.r) {
                                gtf1 gtf1Var = this.f;
                                ie30 ie30Var = this.l;
                                ie30Var.getClass();
                                gtf1Var.a(ie30Var);
                                this.r = false;
                            }
                            dm5.y(this.s != -9223372036854775807L);
                            long j4 = this.s;
                            this.f.b(j4, 1, this.n, 0, null);
                            this.s += this.k;
                            long j5 = this.t;
                            if (j5 != -9223372036854775807L) {
                                if (j5 != j4) {
                                    this.s = j5;
                                }
                                this.t = -9223372036854775807L;
                            }
                            this.n = 0;
                            int i30 = this.i;
                            this.j = i30;
                            this.i = 0;
                            int iC2 = pxd0.C(i30);
                            this.o = iC2;
                            if (iC2 == 3 || iC2 == 4) {
                                h(this.j);
                                this.j = 0;
                                this.g = (byte) 4;
                            } else if (iC2 == 1) {
                                h(this.j);
                                this.j = 0;
                                this.g = (byte) 1;
                            } else {
                                this.h = 0;
                                this.g = (byte) 0;
                            }
                        }
                    }
                    break;
                default:
                    bhn0.w();
                    return;
            }
        }
    }

    @Override // p.ytw
    public final void b() {
        this.g = (byte) 0;
        this.h = 0;
        this.j = 0;
        this.i = 0;
        this.n = 0;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.b.set(0);
        this.r = false;
        this.v = this.u;
    }

    @Override // p.ytw
    public final void c() {
        if (this.g == 7) {
            this.f.getClass();
            if (this.r) {
                gtf1 gtf1Var = this.f;
                ie30 ie30Var = this.l;
                ie30Var.getClass();
                gtf1Var.a(ie30Var);
                this.r = false;
            }
            long j = this.s;
            if (j != -9223372036854775807L) {
                this.f.b(j, 1, this.n, 0, null);
                this.s += this.k;
            }
            this.n = 0;
            this.h = 0;
            this.j = 0;
            this.i = 0;
            this.g = (byte) 0;
        }
    }

    @Override // p.ytw
    public final void d(gc10 gc10Var, wwg1 wwg1Var) {
        wwg1Var.a();
        wwg1Var.b();
        this.e = wwg1Var.e;
        wwg1Var.b();
        this.f = gc10Var.w(wwg1Var.d, 1);
    }

    @Override // p.ytw
    public final void f(int i, long j) {
        if (j != -9223372036854775807L) {
            if (this.g != 0) {
                this.t = j;
            } else {
                this.s = j;
                this.t = -9223372036854775807L;
            }
        }
    }

    public final boolean g(izr0 izr0Var, byte[] bArr, int i) {
        int iMin = Math.min(izr0Var.a(), i - this.h);
        izr0Var.o(this.h, bArr, iMin);
        int i2 = this.h + iMin;
        this.h = i2;
        return i2 == i;
    }

    public final void h(int i) {
        byte[] bArr = this.a.a;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.h = 4;
    }

    public final void i(eev eevVar) {
        int i = eevVar.a;
        int i2 = eevVar.c;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        String str = (String) eevVar.e;
        if (str == null) {
            ie30 ie30Var = this.l;
            str = ie30Var != null ? ie30Var.f66p : null;
        }
        ie30 ie30Var2 = this.l;
        if (ie30Var2 != null && !this.r && i2 == ie30Var2.J && i == ie30Var2.L && Objects.equals(str, ie30Var2.f66p)) {
            return;
        }
        ie30 ie30Var3 = this.l;
        ge30 ge30Var = ie30Var3 == null ? new ge30() : ie30Var3.a();
        ge30Var.a = this.e;
        ge30Var.n = asj0.p("video/mp2t");
        ge30Var.o = asj0.p(str);
        ge30Var.I = i2;
        ge30Var.K = i;
        ge30Var.d = this.c;
        ge30Var.f = this.d;
        ie30 ie30Var4 = new ie30(ge30Var);
        this.l = ie30Var4;
        this.f.a(ie30Var4);
        this.r = false;
    }
}
