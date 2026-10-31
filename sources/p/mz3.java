package p;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mz3 implements ec10 {
    public static final int[] s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] u;
    public static final byte[] v;
    public final boolean b;
    public final x6u c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public long h;
    public int j;
    public long k;
    public gc10 l;
    public gtf1 m;
    public gtf1 n;
    public fn51 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f99p;
    public long q;
    public boolean r;
    public final byte[] a = new byte[1];
    public int i = -1;

    static {
        String str = zoi1.a;
        Charset charset = StandardCharsets.UTF_8;
        u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mz3(int i) {
        this.b = i;
        x6u x6uVar = new x6u();
        this.c = x6uVar;
        this.n = x6uVar;
    }

    @Override // p.ec10
    public final void a(long j, long j2) {
        this.e = 0L;
        this.f = 0;
        this.g = 0;
        this.q = j2;
        fn51 fn51Var = this.o;
        if (!(fn51Var instanceof u980)) {
            if (j == 0 || !(fn51Var instanceof pgl)) {
                this.k = 0L;
                return;
            } else {
                pgl pglVar = (pgl) fn51Var;
                this.k = (Math.max(0L, j - pglVar.b) * 8000000) / ((long) pglVar.e);
                return;
            }
        }
        u980 u980Var = (u980) fn51Var;
        p4f0 p4f0Var = u980Var.b;
        long jE = p4f0Var.b == 0 ? -9223372036854775807L : p4f0Var.e(zoi1.d(u980Var.a, j));
        this.k = jE;
        if (Math.abs(this.q - jE) < 20000) {
            return;
        }
        this.f99p = true;
        this.n = this.c;
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        this.l = gc10Var;
        gtf1 gtf1VarW = gc10Var.w(0, 1);
        this.m = gtf1VarW;
        this.n = gtf1VarW;
        gc10Var.s();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb A[PHI: r4
      0x00eb: PHI (r4v1 p.fc10) = (r4v0 p.fc10), (r4v6 p.fc10) binds: [B:52:0x00e9, B:55:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:60:0x0102  */
    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) throws ParserException {
        fc10 fc10Var2;
        int i;
        int iE;
        int i2;
        this.m.getClass();
        String str = zoi1.a;
        if (fc10Var.getPosition() == 0 && !g(fc10Var)) {
            throw ParserException.a((RuntimeException) null, "Could not find AMR header.");
        }
        if (!this.r) {
            this.r = true;
            boolean z = this.d;
            String str2 = z ? "audio/amr-wb" : "audio/amr";
            String str3 = z ? "audio/amr-wb" : "audio/3gpp";
            int i3 = z ? mpd.AUDIO_CONTENT_SAMPLING_RATE : 8000;
            int i4 = z ? t[8] : s[7];
            gtf1 gtf1Var = this.m;
            ge30 ge30Var = new ge30();
            ge30Var.n = asj0.p(str2);
            ge30Var.o = asj0.p(str3);
            ge30Var.f52p = i4;
            ge30Var.I = 1;
            ge30Var.K = i3;
            xvj1.q(ge30Var, gtf1Var);
        }
        int i5 = 0;
        if (this.g == 0) {
            try {
                int iF = f(fc10Var);
                this.f = iF;
                this.g = iF;
                int i6 = this.i;
                if (i6 == -1) {
                    this.h = fc10Var.getPosition();
                    iF = this.f;
                    this.i = iF;
                    i6 = iF;
                }
                if (i6 == iF) {
                    this.j++;
                }
                fn51 fn51Var = this.o;
                if (fn51Var instanceof u980) {
                    u980 u980Var = (u980) fn51Var;
                    long j = this.k + this.e + 20000;
                    long position = fc10Var.getPosition() + ((long) this.f);
                    p4f0 p4f0Var = u980Var.b;
                    int i7 = p4f0Var.b;
                    if (i7 == 0 || j - p4f0Var.e(i7 - 1) >= 100000) {
                        p4f0 p4f0Var2 = u980Var.a;
                        p4f0 p4f0Var3 = u980Var.b;
                        if (p4f0Var3.b == 0 && j > 0) {
                            p4f0Var2.a(0L);
                            p4f0Var3.a(0L);
                        }
                        p4f0Var2.a(position);
                        p4f0Var3.a(j);
                    }
                    if (this.f99p && Math.abs(this.q - j) < 20000) {
                        this.f99p = false;
                        this.n = this.m;
                    }
                }
                fc10Var2 = fc10Var;
                iE = this.n.e(fc10Var2, this.g, true);
                if (iE == -1) {
                    i5 = -1;
                } else {
                    i2 = this.g - iE;
                    this.g = i2;
                    if (i2 <= 0) {
                        this.n.b(this.e + this.k, 1, this.f, 0, null);
                        this.e += 20000;
                    }
                }
            } catch (EOFException unused) {
                fc10Var2 = fc10Var;
            }
        } else {
            fc10Var2 = fc10Var;
            iE = this.n.e(fc10Var2, this.g, true);
            if (iE == -1) {
                i5 = -1;
            } else {
                i2 = this.g - iE;
                this.g = i2;
                if (i2 <= 0) {
                    this.n.b(this.e + this.k, 1, this.f, 0, null);
                    this.e += 20000;
                }
            }
        }
        long length = fc10Var2.getLength();
        if (this.o == null) {
            if (!this.b || ((i = this.i) != -1 && i != this.f)) {
                this.o = new bc9(-9223372036854775807L);
            } else if (this.j >= 20 || i5 == -1) {
                pgl pglVar = new pgl(length, this.h, false, (int) ((((long) i) * 8000000) / 20000), i, true);
                this.o = pglVar;
                this.m.g(pglVar.f);
            }
            fn51 fn51Var2 = this.o;
            if (fn51Var2 != null) {
                this.l.c(fn51Var2);
            }
        }
        if (i5 == -1) {
            fn51 fn51Var3 = this.o;
            if (fn51Var3 instanceof u980) {
                long j2 = this.k + this.e;
                ((u980) fn51Var3).c = j2;
                this.l.c(fn51Var3);
                this.m.g(j2);
            }
        }
        return i5;
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) {
        return g(fc10Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public final int f(fc10 fc10Var) throws ParserException {
        boolean z;
        fc10Var.f();
        byte[] bArr = this.a;
        fc10Var.h(0, bArr, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw ParserException.a((RuntimeException) null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.d) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? t[i] : s[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.d ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ParserException.a((RuntimeException) null, sb.toString());
    }

    public final boolean g(fc10 fc10Var) {
        fc10Var.f();
        byte[] bArr = u;
        byte[] bArr2 = new byte[bArr.length];
        fc10Var.h(0, bArr2, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            fc10Var.u(bArr.length);
            return true;
        }
        fc10Var.f();
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        fc10Var.h(0, bArr4, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        fc10Var.u(bArr3.length);
        return true;
    }

    @Override // p.ec10
    public final void release() {
    }
}
