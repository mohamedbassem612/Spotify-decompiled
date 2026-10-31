package p;

import app.p000rive.semantics.SemanticState;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gr50 implements ytw {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final gt51 a;
    public final izr0 b;
    public final boolean[] c = new boolean[4];
    public final er50 d;
    public final sin0 e;
    public fr50 f;
    public long g;
    public String h;
    public gtf1 i;
    public boolean j;
    public long k;

    public gr50(gt51 gt51Var) {
        this.a = gt51Var;
        er50 er50Var = new er50();
        er50Var.e = new byte[SemanticState.Focused];
        this.d = er50Var;
        this.k = -9223372036854775807L;
        this.e = new sin0(178);
        this.b = new izr0();
    }

    /* JADX WARN: Code duplicated, block: B:98:0x0234  */
    @Override // p.ytw
    public final void a(izr0 izr0Var) {
        boolean z;
        int i;
        int i2;
        float f;
        this.f.getClass();
        this.i.getClass();
        int i3 = izr0Var.b;
        int i4 = izr0Var.c;
        byte[] bArr = izr0Var.a;
        this.g += (long) izr0Var.a();
        this.i.f(izr0Var.a(), izr0Var);
        while (true) {
            int iO = mqn1.o(bArr, i3, i4, this.c);
            er50 er50Var = this.d;
            sin0 sin0Var = this.e;
            if (iO == i4) {
                if (!this.j) {
                    er50Var.a(i3, bArr, i4);
                }
                this.f.a(i3, bArr, i4);
                if (sin0Var != null) {
                    sin0Var.a(i3, bArr, i4);
                    return;
                }
                return;
            }
            int i5 = iO + 3;
            byte b = izr0Var.a[i5];
            int i6 = b & 255;
            int i7 = iO - i3;
            if (this.j) {
                i4 = i4;
            } else {
                if (i7 > 0) {
                    er50Var.a(i3, bArr, iO);
                }
                int i8 = i7 < 0 ? -i7 : 0;
                byte b2 = er50Var.b;
                if (b2 == 0) {
                    i4 = i4;
                    i2 = 0;
                    if (i6 == 176) {
                        er50Var.b = (byte) 1;
                        er50Var.a = true;
                    }
                } else if (b2 == 1) {
                    i4 = i4;
                    i2 = 0;
                    if (i6 != 181) {
                        oon1.H("Unexpected start code value");
                        er50Var.a = false;
                        er50Var.c = 0;
                        er50Var.b = (byte) 0;
                    } else {
                        er50Var.b = (byte) 2;
                    }
                } else if (b2 == 2) {
                    i4 = i4;
                    i2 = 0;
                    if (i6 > 31) {
                        oon1.H("Unexpected start code value");
                        er50Var.a = false;
                        er50Var.c = 0;
                        er50Var.b = (byte) 0;
                    } else {
                        er50Var.b = (byte) 3;
                    }
                } else if (b2 == 3) {
                    i4 = i4;
                    if ((b & 240) != 32) {
                        oon1.H("Unexpected start code value");
                        i2 = 0;
                        er50Var.a = false;
                        er50Var.c = 0;
                        er50Var.b = (byte) 0;
                    } else {
                        i2 = 0;
                        er50Var.d = er50Var.c;
                        er50Var.b = (byte) 4;
                    }
                } else {
                    if (b2 != 4) {
                        bhn0.w();
                        return;
                    }
                    if (i6 == 179 || i6 == 181) {
                        er50Var.c -= i8;
                        er50Var.a = false;
                        gtf1 gtf1Var = this.i;
                        int i9 = er50Var.d;
                        String str = this.h;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(er50Var.e, er50Var.c);
                        bae baeVar = new bae(bArrCopyOf, bArrCopyOf.length);
                        baeVar.p(i9);
                        baeVar.p(4);
                        baeVar.n();
                        baeVar.o(8);
                        if (baeVar.f()) {
                            baeVar.o(4);
                            baeVar.o(3);
                        }
                        int iG = baeVar.g(4);
                        if (iG == 15) {
                            int iG2 = baeVar.g(8);
                            int iG3 = baeVar.g(8);
                            if (iG3 == 0) {
                                oon1.H("Invalid aspect ratio");
                                f = 1.0f;
                            } else {
                                f = iG2 / iG3;
                            }
                        } else if (iG < 7) {
                            f = l[iG];
                        } else {
                            oon1.H("Invalid aspect ratio");
                            f = 1.0f;
                        }
                        if (baeVar.f()) {
                            baeVar.o(2);
                            baeVar.o(1);
                            if (baeVar.f()) {
                                baeVar.o(15);
                                baeVar.n();
                                baeVar.o(15);
                                baeVar.n();
                                baeVar.o(15);
                                baeVar.n();
                                baeVar.o(3);
                                baeVar.o(11);
                                baeVar.n();
                                baeVar.o(15);
                                baeVar.n();
                            }
                        }
                        if (baeVar.g(2) != 0) {
                            oon1.H("Unhandled video object layer shape");
                        }
                        baeVar.n();
                        int iG4 = baeVar.g(16);
                        baeVar.n();
                        if (baeVar.f()) {
                            if (iG4 == 0) {
                                oon1.H("Invalid vop_increment_time_resolution");
                            } else {
                                int i10 = 0;
                                for (int i11 = iG4 - 1; i11 > 0; i11 >>= 1) {
                                    i10++;
                                }
                                baeVar.o(i10);
                            }
                        }
                        baeVar.n();
                        int iG5 = baeVar.g(13);
                        baeVar.n();
                        int iG6 = baeVar.g(13);
                        baeVar.n();
                        baeVar.n();
                        ge30 ge30Var = new ge30();
                        ge30Var.a = str;
                        ge30Var.n = asj0.p("video/mp2t");
                        ge30Var.o = asj0.p("video/mp4v-es");
                        ge30Var.v = iG5;
                        ge30Var.w = iG6;
                        ge30Var.D = f;
                        ge30Var.r = Collections.singletonList(bArrCopyOf);
                        xvj1.q(ge30Var, gtf1Var);
                        this.j = true;
                    } else {
                        i4 = i4;
                        i2 = 0;
                    }
                }
                er50Var.a(i2, er50.f, 3);
            }
            this.f.a(i3, bArr, iO);
            if (sin0Var == null) {
                z = true;
            } else {
                if (i7 > 0) {
                    sin0Var.a(i3, bArr, iO);
                    i = 0;
                } else {
                    i = -i7;
                }
                if (sin0Var.b(i)) {
                    int iK = mqn1.K(sin0Var.d, sin0Var.e);
                    String str2 = zoi1.a;
                    byte[] bArr2 = sin0Var.d;
                    izr0 izr0Var2 = this.b;
                    izr0Var2.P(bArr2, iK);
                    this.a.a(this.k, izr0Var2);
                }
                if (i6 == 178) {
                    z = true;
                    if (izr0Var.a[iO + 2] == 1) {
                        sin0Var.d(i6);
                    }
                } else {
                    z = true;
                }
            }
            int i12 = i4 - iO;
            this.f.b(this.g - ((long) i12), this.j, i12);
            fr50 fr50Var = this.f;
            long j = this.k;
            fr50Var.e = i6;
            fr50Var.d = false;
            fr50Var.b = (i6 == 182 || i6 == 179) ? z : false;
            fr50Var.c = i6 == 182 ? z : false;
            fr50Var.f = 0;
            fr50Var.h = j;
            i3 = i5;
            i4 = i4;
        }
    }

    @Override // p.ytw
    public final void b() {
        mqn1.k(this.c);
        er50 er50Var = this.d;
        er50Var.a = false;
        er50Var.c = 0;
        er50Var.b = (byte) 0;
        fr50 fr50Var = this.f;
        if (fr50Var != null) {
            fr50Var.b = false;
            fr50Var.c = false;
            fr50Var.d = false;
            fr50Var.e = -1;
        }
        sin0 sin0Var = this.e;
        if (sin0Var != null) {
            sin0Var.c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // p.ytw
    public final void c() {
        this.f.getClass();
        this.f.b(this.g, this.j, 0);
        fr50 fr50Var = this.f;
        fr50Var.b = false;
        fr50Var.c = false;
        fr50Var.d = false;
        fr50Var.e = -1;
    }

    @Override // p.ytw
    public final void d(gc10 gc10Var, wwg1 wwg1Var) {
        wwg1Var.a();
        wwg1Var.b();
        this.h = wwg1Var.e;
        wwg1Var.b();
        gtf1 gtf1VarW = gc10Var.w(wwg1Var.d, 2);
        this.i = gtf1VarW;
        this.f = new fr50(gtf1VarW);
        this.a.b(gc10Var, wwg1Var);
    }

    @Override // p.ytw
    public final void f(int i, long j) {
        this.k = j;
    }
}
