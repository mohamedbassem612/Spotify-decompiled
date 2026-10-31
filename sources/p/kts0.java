package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kts0 implements xwg1 {
    public final ytw a;
    public final bae b = new bae(new byte[10], 10);
    public int c = 0;
    public int d;
    public yve1 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public kts0(ytw ytwVar) {
        this.a = ytwVar;
    }

    @Override // p.xwg1
    public final void a(int i, izr0 izr0Var) {
        long jB;
        this.e.getClass();
        int i2 = i & 1;
        int i3 = -1;
        int i4 = 2;
        ytw ytwVar = this.a;
        if (i2 != 0) {
            int i5 = this.c;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    oon1.H("Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        bhn0.w();
                        return;
                    }
                    if (this.j != -1) {
                        oon1.H("Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    ytwVar.e();
                }
            }
            if (izr0Var.c == 0) {
                ytwVar.c();
            }
            this.c = 1;
            this.d = 0;
        }
        int i6 = i;
        while (izr0Var.a() > 0) {
            int i7 = this.c;
            if (i7 != 0) {
                bae baeVar = this.b;
                if (i7 != 1) {
                    if (i7 == i4) {
                        if (d(izr0Var, baeVar.b, Math.min(10, this.i)) && d(izr0Var, null, this.i)) {
                            baeVar.m(0);
                            if (this.f) {
                                baeVar.o(4);
                                long jG = ((long) baeVar.g(3)) << 30;
                                baeVar.o(1);
                                long jG2 = ((long) (baeVar.g(15) << 15)) | jG;
                                baeVar.o(1);
                                long jG3 = jG2 | ((long) baeVar.g(15));
                                baeVar.o(1);
                                if (!this.h && this.g) {
                                    baeVar.o(4);
                                    long jG4 = ((long) baeVar.g(3)) << 30;
                                    baeVar.o(1);
                                    long jG5 = jG4 | ((long) (baeVar.g(15) << 15));
                                    baeVar.o(1);
                                    long jG6 = jG5 | ((long) baeVar.g(15));
                                    baeVar.o(1);
                                    this.e.b(jG6);
                                    this.h = true;
                                }
                                jB = this.e.b(jG3);
                            } else {
                                jB = -9223372036854775807L;
                            }
                            i6 |= this.k ? 4 : 0;
                            ytwVar.f(i6, jB);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i7 != 3) {
                            bhn0.w();
                            return;
                        }
                        int iA = izr0Var.a();
                        int i8 = this.j;
                        int i9 = i8 == i3 ? 0 : iA - i8;
                        if (i9 > 0) {
                            iA -= i9;
                            izr0Var.Q(izr0Var.b + iA);
                        }
                        ytwVar.a(izr0Var);
                        int i10 = this.j;
                        if (i10 != i3) {
                            int i11 = i10 - iA;
                            this.j = i11;
                            if (i11 == 0) {
                                ytwVar.e();
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (d(izr0Var, baeVar.b, 9)) {
                    this.c = e() ? 2 : 0;
                    this.d = 0;
                }
            } else {
                izr0Var.S(izr0Var.a());
            }
            i3 = -1;
            i4 = 2;
        }
    }

    @Override // p.xwg1
    public final void b() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.b();
    }

    @Override // p.xwg1
    public final void c(yve1 yve1Var, gc10 gc10Var, wwg1 wwg1Var) {
        this.e = yve1Var;
        this.a.d(gc10Var, wwg1Var);
    }

    public final boolean d(izr0 izr0Var, byte[] bArr, int i) {
        int iMin = Math.min(izr0Var.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            izr0Var.S(iMin);
        } else {
            izr0Var.o(this.d, bArr, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    public final boolean e() {
        bae baeVar = this.b;
        baeVar.m(0);
        int iG = baeVar.g(24);
        if (iG != 1) {
            td6.p(iG, "Unexpected start code prefix: ");
            this.j = -1;
            return false;
        }
        baeVar.o(8);
        int iG2 = baeVar.g(16);
        baeVar.o(5);
        this.k = baeVar.f();
        baeVar.o(2);
        this.f = baeVar.f();
        this.g = baeVar.f();
        baeVar.o(6);
        int iG3 = baeVar.g(8);
        this.i = iG3;
        if (iG2 == 0) {
            this.j = -1;
            return true;
        }
        int i = (iG2 - 3) - iG3;
        this.j = i;
        if (i < 0) {
            oon1.H("Found negative packet payload size: " + this.j);
            this.j = -1;
        }
        return true;
    }
}
